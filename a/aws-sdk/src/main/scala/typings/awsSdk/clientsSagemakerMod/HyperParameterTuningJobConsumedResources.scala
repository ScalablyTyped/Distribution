package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HyperParameterTuningJobConsumedResources extends StObject {
  
  /**
    * The wall clock runtime in seconds used by your hyperparameter tuning job.
    */
  var RuntimeInSeconds: js.UndefOr[Integer] = js.undefined
}
object HyperParameterTuningJobConsumedResources {
  
  inline def apply(): HyperParameterTuningJobConsumedResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperParameterTuningJobConsumedResources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HyperParameterTuningJobConsumedResources] (val x: Self) extends AnyVal {
    
    inline def setRuntimeInSeconds(value: Integer): Self = StObject.set(x, "RuntimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setRuntimeInSecondsUndefined: Self = StObject.set(x, "RuntimeInSeconds", js.undefined)
  }
}
