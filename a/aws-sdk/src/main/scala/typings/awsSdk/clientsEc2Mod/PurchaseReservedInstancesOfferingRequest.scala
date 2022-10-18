package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseReservedInstancesOfferingRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of Reserved Instances to purchase.
    */
  var InstanceCount: Integer
  
  /**
    * Specified for Reserved Instance Marketplace offerings to limit the total order and ensure that the Reserved Instances are not purchased at unexpected prices.
    */
  var LimitPrice: js.UndefOr[ReservedInstanceLimitPrice] = js.undefined
  
  /**
    * The time at which to purchase the Reserved Instance, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var PurchaseTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the Reserved Instance offering to purchase.
    */
  var ReservedInstancesOfferingId: typings.awsSdk.clientsEc2Mod.ReservedInstancesOfferingId
}
object PurchaseReservedInstancesOfferingRequest {
  
  inline def apply(InstanceCount: Integer, ReservedInstancesOfferingId: ReservedInstancesOfferingId): PurchaseReservedInstancesOfferingRequest = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], ReservedInstancesOfferingId = ReservedInstancesOfferingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseReservedInstancesOfferingRequest]
  }
  
  extension [Self <: PurchaseReservedInstancesOfferingRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setLimitPrice(value: ReservedInstanceLimitPrice): Self = StObject.set(x, "LimitPrice", value.asInstanceOf[js.Any])
    
    inline def setLimitPriceUndefined: Self = StObject.set(x, "LimitPrice", js.undefined)
    
    inline def setPurchaseTime(value: js.Date): Self = StObject.set(x, "PurchaseTime", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTimeUndefined: Self = StObject.set(x, "PurchaseTime", js.undefined)
    
    inline def setReservedInstancesOfferingId(value: ReservedInstancesOfferingId): Self = StObject.set(x, "ReservedInstancesOfferingId", value.asInstanceOf[js.Any])
  }
}
