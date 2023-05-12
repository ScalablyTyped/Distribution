package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRotationRequest extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the contacts to add to the rotation. The order that you list the contacts in is their shift order in the rotation schedule. To change the order of the contact's shifts, use the UpdateRotation operation.
    */
  var ContactIds: RotationContactsArnList
  
  /**
    * A token that ensures that the operation is called only once with the specified details.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.IdempotencyToken] = js.undefined
  
  /**
    * The name of the rotation.
    */
  var Name: RotationName
  
  /**
    * Information about the rule that specifies when a shift's team members rotate.
    */
  var Recurrence: RecurrenceSettings
  
  /**
    * The date and time that the rotation goes into effect.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Optional metadata to assign to the rotation. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For more information, see Tagging Incident Manager resources in the Incident Manager User Guide.
    */
  var Tags: js.UndefOr[TagsList] = js.undefined
  
  /**
    * The time zone to base the rotation’s activity on in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.  Designators for time zones that don’t support Daylight Savings Time rules, such as Pacific Standard Time (PST) and Pacific Daylight Time (PDT), are not supported. 
    */
  var TimeZoneId: typings.awsSdk.clientsSsmcontactsMod.TimeZoneId
}
object CreateRotationRequest {
  
  inline def apply(
    ContactIds: RotationContactsArnList,
    Name: RotationName,
    Recurrence: RecurrenceSettings,
    TimeZoneId: TimeZoneId
  ): CreateRotationRequest = {
    val __obj = js.Dynamic.literal(ContactIds = ContactIds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Recurrence = Recurrence.asInstanceOf[js.Any], TimeZoneId = TimeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRotationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRotationRequest] (val x: Self) extends AnyVal {
    
    inline def setContactIds(value: RotationContactsArnList): Self = StObject.set(x, "ContactIds", value.asInstanceOf[js.Any])
    
    inline def setContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "ContactIds", js.Array(value*))
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setName(value: RotationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecurrence(value: RecurrenceSettings): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTimeZoneId(value: TimeZoneId): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
  }
}
