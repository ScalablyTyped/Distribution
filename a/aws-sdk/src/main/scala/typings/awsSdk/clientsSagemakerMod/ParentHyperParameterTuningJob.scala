package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentHyperParameterTuningJob extends StObject {
  
  /**
    * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
    */
  var HyperParameterTuningJobName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.HyperParameterTuningJobName] = js.undefined
}
object ParentHyperParameterTuningJob {
  
  inline def apply(): ParentHyperParameterTuningJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentHyperParameterTuningJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentHyperParameterTuningJob] (val x: Self) extends AnyVal {
    
    inline def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = StObject.set(x, "HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobNameUndefined: Self = StObject.set(x, "HyperParameterTuningJobName", js.undefined)
  }
}
