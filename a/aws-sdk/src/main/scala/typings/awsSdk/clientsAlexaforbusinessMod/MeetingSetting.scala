package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingSetting extends StObject {
  
  /**
    * The values that indicate whether the pin is always required.
    */
  var RequirePin: typings.awsSdk.clientsAlexaforbusinessMod.RequirePin
}
object MeetingSetting {
  
  inline def apply(RequirePin: RequirePin): MeetingSetting = {
    val __obj = js.Dynamic.literal(RequirePin = RequirePin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeetingSetting] (val x: Self) extends AnyVal {
    
    inline def setRequirePin(value: RequirePin): Self = StObject.set(x, "RequirePin", value.asInstanceOf[js.Any])
  }
}
