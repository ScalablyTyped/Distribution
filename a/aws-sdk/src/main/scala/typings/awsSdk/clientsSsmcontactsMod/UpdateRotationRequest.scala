package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRotationRequest extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the contacts to include in the updated rotation.  The order in which you list the contacts is their shift order in the rotation schedule.
    */
  var ContactIds: js.UndefOr[RotationContactsArnList] = js.undefined
  
  /**
    * Information about how long the updated rotation lasts before restarting at the beginning of the shift order.
    */
  var Recurrence: RecurrenceSettings
  
  /**
    * The Amazon Resource Name (ARN) of the rotation to update.
    */
  var RotationId: SsmContactsArn
  
  /**
    * The date and time the rotation goes into effect.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time zone to base the updated rotation’s activity on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". For more information, see the Time Zone Database on the IANA website.  Designators for time zones that don’t support Daylight Savings Time Rules, such as Pacific Standard Time (PST) and Pacific Daylight Time (PDT), aren't supported. 
    */
  var TimeZoneId: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.TimeZoneId] = js.undefined
}
object UpdateRotationRequest {
  
  inline def apply(Recurrence: RecurrenceSettings, RotationId: SsmContactsArn): UpdateRotationRequest = {
    val __obj = js.Dynamic.literal(Recurrence = Recurrence.asInstanceOf[js.Any], RotationId = RotationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRotationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRotationRequest] (val x: Self) extends AnyVal {
    
    inline def setContactIds(value: RotationContactsArnList): Self = StObject.set(x, "ContactIds", value.asInstanceOf[js.Any])
    
    inline def setContactIdsUndefined: Self = StObject.set(x, "ContactIds", js.undefined)
    
    inline def setContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "ContactIds", js.Array(value*))
    
    inline def setRecurrence(value: RecurrenceSettings): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRotationId(value: SsmContactsArn): Self = StObject.set(x, "RotationId", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTimeZoneId(value: TimeZoneId): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneIdUndefined: Self = StObject.set(x, "TimeZoneId", js.undefined)
  }
}
