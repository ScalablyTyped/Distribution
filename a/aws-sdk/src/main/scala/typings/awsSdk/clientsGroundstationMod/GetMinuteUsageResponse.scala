package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMinuteUsageResponse extends StObject {
  
  /**
    * Estimated number of minutes remaining for an account, specific to the month being requested.
    */
  var estimatedMinutesRemaining: js.UndefOr[Integer] = js.undefined
  
  /**
    * Returns whether or not an account has signed up for the reserved minutes pricing plan, specific to the month being requested.
    */
  var isReservedMinutesCustomer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Total number of reserved minutes allocated, specific to the month being requested.
    */
  var totalReservedMinuteAllocation: js.UndefOr[Integer] = js.undefined
  
  /**
    * Total scheduled minutes for an account, specific to the month being requested.
    */
  var totalScheduledMinutes: js.UndefOr[Integer] = js.undefined
  
  /**
    * Upcoming minutes scheduled for an account, specific to the month being requested.
    */
  var upcomingMinutesScheduled: js.UndefOr[Integer] = js.undefined
}
object GetMinuteUsageResponse {
  
  inline def apply(): GetMinuteUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMinuteUsageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMinuteUsageResponse] (val x: Self) extends AnyVal {
    
    inline def setEstimatedMinutesRemaining(value: Integer): Self = StObject.set(x, "estimatedMinutesRemaining", value.asInstanceOf[js.Any])
    
    inline def setEstimatedMinutesRemainingUndefined: Self = StObject.set(x, "estimatedMinutesRemaining", js.undefined)
    
    inline def setIsReservedMinutesCustomer(value: Boolean): Self = StObject.set(x, "isReservedMinutesCustomer", value.asInstanceOf[js.Any])
    
    inline def setIsReservedMinutesCustomerUndefined: Self = StObject.set(x, "isReservedMinutesCustomer", js.undefined)
    
    inline def setTotalReservedMinuteAllocation(value: Integer): Self = StObject.set(x, "totalReservedMinuteAllocation", value.asInstanceOf[js.Any])
    
    inline def setTotalReservedMinuteAllocationUndefined: Self = StObject.set(x, "totalReservedMinuteAllocation", js.undefined)
    
    inline def setTotalScheduledMinutes(value: Integer): Self = StObject.set(x, "totalScheduledMinutes", value.asInstanceOf[js.Any])
    
    inline def setTotalScheduledMinutesUndefined: Self = StObject.set(x, "totalScheduledMinutes", js.undefined)
    
    inline def setUpcomingMinutesScheduled(value: Integer): Self = StObject.set(x, "upcomingMinutesScheduled", value.asInstanceOf[js.Any])
    
    inline def setUpcomingMinutesScheduledUndefined: Self = StObject.set(x, "upcomingMinutesScheduled", js.undefined)
  }
}
