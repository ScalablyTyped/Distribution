package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstance extends StObject {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The date when the Scheduled Instance was purchased.
    */
  var CreateDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The hourly price for a single instance.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The number of instances.
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The network platform (EC2-Classic or EC2-VPC).
    */
  var NetworkPlatform: js.UndefOr[String] = js.undefined
  
  /**
    * The time for the next schedule to start.
    */
  var NextSlotStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The platform (Linux/UNIX or Windows).
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * The time that the previous schedule ended or will end.
    */
  var PreviousSlotEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The schedule recurrence.
    */
  var Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.undefined
  
  /**
    * The Scheduled Instance ID.
    */
  var ScheduledInstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of hours in the schedule.
    */
  var SlotDurationInHours: js.UndefOr[Integer] = js.undefined
  
  /**
    * The end date for the Scheduled Instance.
    */
  var TermEndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The start date for the Scheduled Instance.
    */
  var TermStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The total number of hours for a single instance for the entire term.
    */
  var TotalScheduledInstanceHours: js.UndefOr[Integer] = js.undefined
}
object ScheduledInstance {
  
  inline def apply(): ScheduledInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledInstance] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    inline def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setNetworkPlatform(value: String): Self = StObject.set(x, "NetworkPlatform", value.asInstanceOf[js.Any])
    
    inline def setNetworkPlatformUndefined: Self = StObject.set(x, "NetworkPlatform", js.undefined)
    
    inline def setNextSlotStartTime(value: js.Date): Self = StObject.set(x, "NextSlotStartTime", value.asInstanceOf[js.Any])
    
    inline def setNextSlotStartTimeUndefined: Self = StObject.set(x, "NextSlotStartTime", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setPreviousSlotEndTime(value: js.Date): Self = StObject.set(x, "PreviousSlotEndTime", value.asInstanceOf[js.Any])
    
    inline def setPreviousSlotEndTimeUndefined: Self = StObject.set(x, "PreviousSlotEndTime", js.undefined)
    
    inline def setRecurrence(value: ScheduledInstanceRecurrence): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "Recurrence", js.undefined)
    
    inline def setScheduledInstanceId(value: String): Self = StObject.set(x, "ScheduledInstanceId", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstanceIdUndefined: Self = StObject.set(x, "ScheduledInstanceId", js.undefined)
    
    inline def setSlotDurationInHours(value: Integer): Self = StObject.set(x, "SlotDurationInHours", value.asInstanceOf[js.Any])
    
    inline def setSlotDurationInHoursUndefined: Self = StObject.set(x, "SlotDurationInHours", js.undefined)
    
    inline def setTermEndDate(value: js.Date): Self = StObject.set(x, "TermEndDate", value.asInstanceOf[js.Any])
    
    inline def setTermEndDateUndefined: Self = StObject.set(x, "TermEndDate", js.undefined)
    
    inline def setTermStartDate(value: js.Date): Self = StObject.set(x, "TermStartDate", value.asInstanceOf[js.Any])
    
    inline def setTermStartDateUndefined: Self = StObject.set(x, "TermStartDate", js.undefined)
    
    inline def setTotalScheduledInstanceHours(value: Integer): Self = StObject.set(x, "TotalScheduledInstanceHours", value.asInstanceOf[js.Any])
    
    inline def setTotalScheduledInstanceHoursUndefined: Self = StObject.set(x, "TotalScheduledInstanceHours", js.undefined)
  }
}
