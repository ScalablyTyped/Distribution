package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHyperParameterTuningJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job. SageMaker assigns an ARN to a hyperparameter tuning job when you create it.
    */
  var HyperParameterTuningJobArn: typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobArn
}
object CreateHyperParameterTuningJobResponse {
  
  inline def apply(HyperParameterTuningJobArn: HyperParameterTuningJobArn): CreateHyperParameterTuningJobResponse = {
    val __obj = js.Dynamic.literal(HyperParameterTuningJobArn = HyperParameterTuningJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHyperParameterTuningJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHyperParameterTuningJobResponse] (val x: Self) extends AnyVal {
    
    inline def setHyperParameterTuningJobArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "HyperParameterTuningJobArn", value.asInstanceOf[js.Any])
  }
}
