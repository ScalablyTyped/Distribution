package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttendeeIdItem extends StObject {
  
  /**
    * A list of one or more attendee IDs.
    */
  var AttendeeId: GuidString
}
object AttendeeIdItem {
  
  inline def apply(AttendeeId: GuidString): AttendeeIdItem = {
    val __obj = js.Dynamic.literal(AttendeeId = AttendeeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttendeeIdItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttendeeIdItem] (val x: Self) extends AnyVal {
    
    inline def setAttendeeId(value: GuidString): Self = StObject.set(x, "AttendeeId", value.asInstanceOf[js.Any])
  }
}
