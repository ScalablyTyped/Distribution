package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotCapacityRebalance extends StObject {
  
  /**
    * The replacement strategy to use. Only available for fleets of type maintain.  launch - Spot Fleet launches a new replacement Spot Instance when a rebalance notification is emitted for an existing Spot Instance in the fleet. Spot Fleet does not terminate the instances that receive a rebalance notification. You can terminate the old instances, or you can leave them running. You are charged for all instances while they are running.   launch-before-terminate - Spot Fleet launches a new replacement Spot Instance when a rebalance notification is emitted for an existing Spot Instance in the fleet, and then, after a delay that you specify (in TerminationDelay), terminates the instances that received a rebalance notification.
    */
  var ReplacementStrategy: js.UndefOr[typings.awsSdk.clientsEc2Mod.ReplacementStrategy] = js.undefined
  
  /**
    * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot Instance after launching a new replacement Spot Instance. Required when ReplacementStrategy is set to launch-before-terminate. Not valid when ReplacementStrategy is set to launch. Valid values: Minimum value of 120 seconds. Maximum value of 7200 seconds.
    */
  var TerminationDelay: js.UndefOr[Integer] = js.undefined
}
object SpotCapacityRebalance {
  
  inline def apply(): SpotCapacityRebalance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotCapacityRebalance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpotCapacityRebalance] (val x: Self) extends AnyVal {
    
    inline def setReplacementStrategy(value: ReplacementStrategy): Self = StObject.set(x, "ReplacementStrategy", value.asInstanceOf[js.Any])
    
    inline def setReplacementStrategyUndefined: Self = StObject.set(x, "ReplacementStrategy", js.undefined)
    
    inline def setTerminationDelay(value: Integer): Self = StObject.set(x, "TerminationDelay", value.asInstanceOf[js.Any])
    
    inline def setTerminationDelayUndefined: Self = StObject.set(x, "TerminationDelay", js.undefined)
  }
}
