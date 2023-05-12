package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rotation extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the contacts assigned to the rotation team.
    */
  var ContactIds: js.UndefOr[SsmContactsArnList] = js.undefined
  
  /**
    * The name of the rotation.
    */
  var Name: RotationName
  
  /**
    * Information about when an on-call rotation is in effect and how long the rotation period lasts.
    */
  var Recurrence: js.UndefOr[RecurrenceSettings] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rotation.
    */
  var RotationArn: SsmContactsArn
  
  /**
    * The date and time the rotation becomes active.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time zone the rotation’s activity is based on, in Internet Assigned Numbers Authority (IANA) format. For example: "America/Los_Angeles", "UTC", or "Asia/Seoul". 
    */
  var TimeZoneId: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.TimeZoneId] = js.undefined
}
object Rotation {
  
  inline def apply(Name: RotationName, RotationArn: SsmContactsArn): Rotation = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RotationArn = RotationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rotation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rotation] (val x: Self) extends AnyVal {
    
    inline def setContactIds(value: SsmContactsArnList): Self = StObject.set(x, "ContactIds", value.asInstanceOf[js.Any])
    
    inline def setContactIdsUndefined: Self = StObject.set(x, "ContactIds", js.undefined)
    
    inline def setContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "ContactIds", js.Array(value*))
    
    inline def setName(value: RotationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRecurrence(value: RecurrenceSettings): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "Recurrence", js.undefined)
    
    inline def setRotationArn(value: SsmContactsArn): Self = StObject.set(x, "RotationArn", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTimeZoneId(value: TimeZoneId): Self = StObject.set(x, "TimeZoneId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneIdUndefined: Self = StObject.set(x, "TimeZoneId", js.undefined)
  }
}
