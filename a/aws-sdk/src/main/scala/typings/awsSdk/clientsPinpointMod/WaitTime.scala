package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitTime extends StObject {
  
  /**
    * The amount of time to wait, as a duration in ISO 8601 format, before determining whether the activity's conditions have been met or moving participants to the next activity in the journey.
    */
  var WaitFor: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in ISO 8601 format, when Amazon Pinpoint determines whether the activity's conditions have been met or the activity moves participants to the next activity in the journey.
    */
  var WaitUntil: js.UndefOr[string] = js.undefined
}
object WaitTime {
  
  inline def apply(): WaitTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WaitTime] (val x: Self) extends AnyVal {
    
    inline def setWaitFor(value: string): Self = StObject.set(x, "WaitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForUndefined: Self = StObject.set(x, "WaitFor", js.undefined)
    
    inline def setWaitUntil(value: string): Self = StObject.set(x, "WaitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "WaitUntil", js.undefined)
  }
}
