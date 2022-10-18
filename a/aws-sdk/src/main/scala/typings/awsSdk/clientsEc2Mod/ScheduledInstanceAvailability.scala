package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstanceAvailability extends StObject {
  
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The number of available instances.
    */
  var AvailableInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time period for the first schedule to start.
    */
  var FirstSlotStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The hourly price for a single instance.
    */
  var HourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum term. The only possible value is 365 days.
    */
  var MaxTermDurationInDays: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum term. The only possible value is 365 days.
    */
  var MinTermDurationInDays: js.UndefOr[Integer] = js.undefined
  
  /**
    * The network platform (EC2-Classic or EC2-VPC).
    */
  var NetworkPlatform: js.UndefOr[String] = js.undefined
  
  /**
    * The platform (Linux/UNIX or Windows).
    */
  var Platform: js.UndefOr[String] = js.undefined
  
  /**
    * The purchase token. This token expires in two hours.
    */
  var PurchaseToken: js.UndefOr[String] = js.undefined
  
  /**
    * The schedule recurrence.
    */
  var Recurrence: js.UndefOr[ScheduledInstanceRecurrence] = js.undefined
  
  /**
    * The number of hours in the schedule.
    */
  var SlotDurationInHours: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of hours for a single instance for the entire term.
    */
  var TotalScheduledInstanceHours: js.UndefOr[Integer] = js.undefined
}
object ScheduledInstanceAvailability {
  
  inline def apply(): ScheduledInstanceAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstanceAvailability]
  }
  
  extension [Self <: ScheduledInstanceAvailability](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setAvailableInstanceCount(value: Integer): Self = StObject.set(x, "AvailableInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setAvailableInstanceCountUndefined: Self = StObject.set(x, "AvailableInstanceCount", js.undefined)
    
    inline def setFirstSlotStartTime(value: js.Date): Self = StObject.set(x, "FirstSlotStartTime", value.asInstanceOf[js.Any])
    
    inline def setFirstSlotStartTimeUndefined: Self = StObject.set(x, "FirstSlotStartTime", js.undefined)
    
    inline def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    inline def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setMaxTermDurationInDays(value: Integer): Self = StObject.set(x, "MaxTermDurationInDays", value.asInstanceOf[js.Any])
    
    inline def setMaxTermDurationInDaysUndefined: Self = StObject.set(x, "MaxTermDurationInDays", js.undefined)
    
    inline def setMinTermDurationInDays(value: Integer): Self = StObject.set(x, "MinTermDurationInDays", value.asInstanceOf[js.Any])
    
    inline def setMinTermDurationInDaysUndefined: Self = StObject.set(x, "MinTermDurationInDays", js.undefined)
    
    inline def setNetworkPlatform(value: String): Self = StObject.set(x, "NetworkPlatform", value.asInstanceOf[js.Any])
    
    inline def setNetworkPlatformUndefined: Self = StObject.set(x, "NetworkPlatform", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "PurchaseToken", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTokenUndefined: Self = StObject.set(x, "PurchaseToken", js.undefined)
    
    inline def setRecurrence(value: ScheduledInstanceRecurrence): Self = StObject.set(x, "Recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "Recurrence", js.undefined)
    
    inline def setSlotDurationInHours(value: Integer): Self = StObject.set(x, "SlotDurationInHours", value.asInstanceOf[js.Any])
    
    inline def setSlotDurationInHoursUndefined: Self = StObject.set(x, "SlotDurationInHours", js.undefined)
    
    inline def setTotalScheduledInstanceHours(value: Integer): Self = StObject.set(x, "TotalScheduledInstanceHours", value.asInstanceOf[js.Any])
    
    inline def setTotalScheduledInstanceHoursUndefined: Self = StObject.set(x, "TotalScheduledInstanceHours", js.undefined)
  }
}
