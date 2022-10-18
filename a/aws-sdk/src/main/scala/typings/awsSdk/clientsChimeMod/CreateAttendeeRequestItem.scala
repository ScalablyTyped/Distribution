package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAttendeeRequestItem extends StObject {
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: ExternalUserIdType
  
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[AttendeeTagList] = js.undefined
}
object CreateAttendeeRequestItem {
  
  inline def apply(ExternalUserId: ExternalUserIdType): CreateAttendeeRequestItem = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeRequestItem]
  }
  
  extension [Self <: CreateAttendeeRequestItem](x: Self) {
    
    inline def setExternalUserId(value: ExternalUserIdType): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: AttendeeTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
