package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingSetting extends StObject {
  
  /**
    * The values that indicate whether the pin is always required.
    */
  var RequirePin: typings.awsSdk.alexaforbusinessMod.RequirePin
}
object MeetingSetting {
  
  inline def apply(RequirePin: RequirePin): MeetingSetting = {
    val __obj = js.Dynamic.literal(RequirePin = RequirePin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingSetting]
  }
  
  extension [Self <: MeetingSetting](x: Self) {
    
    inline def setRequirePin(value: RequirePin): Self = StObject.set(x, "RequirePin", value.asInstanceOf[js.Any])
  }
}
