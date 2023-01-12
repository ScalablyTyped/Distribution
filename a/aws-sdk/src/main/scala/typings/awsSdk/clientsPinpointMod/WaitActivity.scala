package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitActivity extends StObject {
  
  /**
    * The unique identifier for the next activity to perform, after performing the wait activity.
    */
  var NextActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The amount of time to wait or the date and time when the activity moves participants to the next activity in the journey.
    */
  var WaitTime: js.UndefOr[typings.awsSdk.clientsPinpointMod.WaitTime] = js.undefined
}
object WaitActivity {
  
  inline def apply(): WaitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitActivity] (val x: Self) extends AnyVal {
    
    inline def setNextActivity(value: string): Self = StObject.set(x, "NextActivity", value.asInstanceOf[js.Any])
    
    inline def setNextActivityUndefined: Self = StObject.set(x, "NextActivity", js.undefined)
    
    inline def setWaitTime(value: WaitTime): Self = StObject.set(x, "WaitTime", value.asInstanceOf[js.Any])
    
    inline def setWaitTimeUndefined: Self = StObject.set(x, "WaitTime", js.undefined)
  }
}
