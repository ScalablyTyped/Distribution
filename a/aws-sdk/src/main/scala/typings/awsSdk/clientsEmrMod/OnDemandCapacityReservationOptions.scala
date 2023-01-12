package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDemandCapacityReservationOptions extends StObject {
  
  /**
    * Indicates the instance's Capacity Reservation preferences. Possible preferences include:    open - The instance can run in any open Capacity Reservation that has matching attributes (instance type, platform, Availability Zone).    none - The instance avoids running in a Capacity Reservation even if one is available. The instance runs as an On-Demand Instance.  
    */
  var CapacityReservationPreference: js.UndefOr[OnDemandCapacityReservationPreference] = js.undefined
  
  /**
    * The ARN of the Capacity Reservation resource group in which to run the instance.
    */
  var CapacityReservationResourceGroupArn: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Indicates whether to use unused Capacity Reservations for fulfilling On-Demand capacity. If you specify use-capacity-reservations-first, the fleet uses unused Capacity Reservations to fulfill On-Demand capacity up to the target On-Demand capacity. If multiple instance pools have unused Capacity Reservations, the On-Demand allocation strategy (lowest-price) is applied. If the number of unused Capacity Reservations is less than the On-Demand target capacity, the remaining On-Demand target capacity is launched according to the On-Demand allocation strategy (lowest-price). If you do not specify a value, the fleet fulfills the On-Demand capacity according to the chosen On-Demand allocation strategy.
    */
  var UsageStrategy: js.UndefOr[OnDemandCapacityReservationUsageStrategy] = js.undefined
}
object OnDemandCapacityReservationOptions {
  
  inline def apply(): OnDemandCapacityReservationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnDemandCapacityReservationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnDemandCapacityReservationOptions] (val x: Self) extends AnyVal {
    
    inline def setCapacityReservationPreference(value: OnDemandCapacityReservationPreference): Self = StObject.set(x, "CapacityReservationPreference", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationPreferenceUndefined: Self = StObject.set(x, "CapacityReservationPreference", js.undefined)
    
    inline def setCapacityReservationResourceGroupArn(value: XmlStringMaxLen256): Self = StObject.set(x, "CapacityReservationResourceGroupArn", value.asInstanceOf[js.Any])
    
    inline def setCapacityReservationResourceGroupArnUndefined: Self = StObject.set(x, "CapacityReservationResourceGroupArn", js.undefined)
    
    inline def setUsageStrategy(value: OnDemandCapacityReservationUsageStrategy): Self = StObject.set(x, "UsageStrategy", value.asInstanceOf[js.Any])
    
    inline def setUsageStrategyUndefined: Self = StObject.set(x, "UsageStrategy", js.undefined)
  }
}
