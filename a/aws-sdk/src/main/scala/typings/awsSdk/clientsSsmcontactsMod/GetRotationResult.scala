package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRotationResult extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the contacts assigned to the on-call rotation team.
    */
  var ContactIds: RotationContactsArnList
  
  /**
    * The name of the on-call rotation.
    */
  var Name: RotationName
  
  /**
    * Specifies how long a rotation lasts before restarting at the beginning of the shift order.
    */
  var Recurrence: RecurrenceSettings
  
  /**
    * The Amazon Resource Name (ARN) of the on-call rotation.
    */
  var RotationArn: SsmContactsArn
  
  /**
    * The specified start time for the on-call rotation.
    */
  var StartTime: js.Date
  
  /**
    * The time zone that the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA) format.
    */
  var TimeZoneId: typings.awsSdk.clientsSsmcontactsMod.TimeZoneId
}
object GetRotationResult {
  
  inline def apply(
    ContactIds: RotationContactsArnList,
    Name: RotationName,
    Recurrence: RecurrenceSettings,
    RotationArn: SsmContactsArn,
    StartTime: js.Date,
    TimeZoneId: TimeZoneId
  ): GetRotationResult = {
    val __obj = js.Dynamic.literal(ContactIds = ContactIds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Recurrence = Recurrence.asInstanceOf[js.Any], RotationArn = RotationArn.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any], TimeZoneId = TimeZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRotationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRotationResult] (val x: Self) extends AnyVal {
    
    inline def setContactIds(value: RotationContactsArnList): Self = StObject.set(x, "ContactIds", value.asInstanceOf[js.Any])
    
    inline def setContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "ContactIds", js.Array(value*))
    
    inline def setName(value: RotationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecurrence(value: RecurrenceSettings): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRotationArn(value: SsmContactsArn): Self = StObject.set(x, "RotationArn", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneId(value: TimeZoneId): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
  }
}
