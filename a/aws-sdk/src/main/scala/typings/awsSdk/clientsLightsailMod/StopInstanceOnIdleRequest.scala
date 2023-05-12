package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInstanceOnIdleRequest extends StObject {
  
  /**
    * The amount of idle time in minutes after which your virtual computer will automatically stop.
    */
  var duration: js.UndefOr[String] = js.undefined
  
  /**
    * The value to compare with the duration.
    */
  var threshold: js.UndefOr[String] = js.undefined
}
object StopInstanceOnIdleRequest {
  
  inline def apply(): StopInstanceOnIdleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopInstanceOnIdleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopInstanceOnIdleRequest] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
