package typings.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAttendeeRequestItem extends StObject {
  
  /**
    * A list of one or more capabilities.
    */
  var Capabilities: js.UndefOr[AttendeeCapabilities] = js.undefined
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application. Pattern: [-_&amp;@+=,(){}\[\]\/«».:|'"#a-zA-Z0-9À-ÿ\s]*  Values that begin with aws: are reserved. You can't configure a value that uses this prefix. Case insensitive.
    */
  var ExternalUserId: typings.awsSdk.clientsChimesdkmeetingsMod.ExternalUserId
}
object CreateAttendeeRequestItem {
  
  inline def apply(ExternalUserId: ExternalUserId): CreateAttendeeRequestItem = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeRequestItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAttendeeRequestItem] (val x: Self) extends AnyVal {
    
    inline def setCapabilities(value: AttendeeCapabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setExternalUserId(value: ExternalUserId): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
  }
}
