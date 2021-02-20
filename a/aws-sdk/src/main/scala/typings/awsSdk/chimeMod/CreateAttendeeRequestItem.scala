package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAttendeeRequestItem extends StObject {
  
  /**
    * The Amazon Chime SDK external user ID. An idempotency token. Links the attendee to an identity managed by a builder application. If you create an attendee with the same external user id, the service returns the existing record. The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
    */
  var ExternalUserId: ExternalUserIdType = js.native
  
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[AttendeeTagList] = js.native
}
object CreateAttendeeRequestItem {
  
  @scala.inline
  def apply(ExternalUserId: ExternalUserIdType): CreateAttendeeRequestItem = {
    val __obj = js.Dynamic.literal(ExternalUserId = ExternalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttendeeRequestItem]
  }
  
  @scala.inline
  implicit class CreateAttendeeRequestItemMutableBuilder[Self <: CreateAttendeeRequestItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalUserId(value: ExternalUserIdType): Self = StObject.set(x, "ExternalUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: AttendeeTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
