package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLAlgorithmConfig extends StObject {
  
  /**
    * The selection of algorithms run on a dataset to train the model candidates of an Autopilot job.   Selected algorithms must belong to the list corresponding to the training mode set in AutoMLJobConfig.Mode (ENSEMBLING or HYPERPARAMETER_TUNING). Choose a minimum of 1 algorithm.     In ENSEMBLING mode:   "catboost"   "extra-trees"   "fastai"   "lightgbm"   "linear-learner"   "nn-torch"   "randomforest"   "xgboost"     In HYPERPARAMETER_TUNING mode:   "linear-learner"   "mlp"   "xgboost"    
    */
  var AutoMLAlgorithms: typings.awsSdk.clientsSagemakerMod.AutoMLAlgorithms
}
object AutoMLAlgorithmConfig {
  
  inline def apply(AutoMLAlgorithms: AutoMLAlgorithms): AutoMLAlgorithmConfig = {
    val __obj = js.Dynamic.literal(AutoMLAlgorithms = AutoMLAlgorithms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoMLAlgorithmConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLAlgorithmConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoMLAlgorithms(value: AutoMLAlgorithms): Self = StObject.set(x, "AutoMLAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setAutoMLAlgorithmsVarargs(value: AutoMLAlgorithm*): Self = StObject.set(x, "AutoMLAlgorithms", js.Array(value*))
  }
}
