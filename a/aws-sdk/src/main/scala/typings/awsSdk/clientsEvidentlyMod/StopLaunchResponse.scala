package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopLaunchResponse extends StObject {
  
  /**
    * The date and time that the launch stopped.
    */
  var endedTime: js.UndefOr[js.Date] = js.undefined
}
object StopLaunchResponse {
  
  inline def apply(): StopLaunchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopLaunchResponse]
  }
  
  extension [Self <: StopLaunchResponse](x: Self) {
    
    inline def setEndedTime(value: js.Date): Self = StObject.set(x, "endedTime", value.asInstanceOf[js.Any])
    
    inline def setEndedTimeUndefined: Self = StObject.set(x, "endedTime", js.undefined)
  }
}
