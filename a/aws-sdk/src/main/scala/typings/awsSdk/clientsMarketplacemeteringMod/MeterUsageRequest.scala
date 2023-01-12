package typings.awsSdk.clientsMarketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeterUsageRequest extends StObject {
  
  /**
    * Checks whether you have the permissions required for the action, but does not make the request. If you have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException. Defaults to false if not specified.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
    */
  var ProductCode: typings.awsSdk.clientsMarketplacemeteringMod.ProductCode
  
  /**
    * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in the past. Make sure the timestamp value is not before the start of the software usage.
    */
  var Timestamp: js.Date
  
  /**
    * The set of UsageAllocations to submit. The sum of all UsageAllocation quantities must equal the UsageQuantity of the MeterUsage request, and each UsageAllocation must have a unique set of tags (include no tags).
    */
  var UsageAllocations: js.UndefOr[typings.awsSdk.clientsMarketplacemeteringMod.UsageAllocations] = js.undefined
  
  /**
    * It will be one of the fcp dimension name provided during the publishing of the product.
    */
  var UsageDimension: typings.awsSdk.clientsMarketplacemeteringMod.UsageDimension
  
  /**
    * Consumption value for the hour. Defaults to 0 if not specified.
    */
  var UsageQuantity: js.UndefOr[typings.awsSdk.clientsMarketplacemeteringMod.UsageQuantity] = js.undefined
}
object MeterUsageRequest {
  
  inline def apply(ProductCode: ProductCode, Timestamp: js.Date, UsageDimension: UsageDimension): MeterUsageRequest = {
    val __obj = js.Dynamic.literal(ProductCode = ProductCode.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], UsageDimension = UsageDimension.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeterUsageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeterUsageRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setProductCode(value: ProductCode): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setUsageAllocations(value: UsageAllocations): Self = StObject.set(x, "UsageAllocations", value.asInstanceOf[js.Any])
    
    inline def setUsageAllocationsUndefined: Self = StObject.set(x, "UsageAllocations", js.undefined)
    
    inline def setUsageAllocationsVarargs(value: UsageAllocation*): Self = StObject.set(x, "UsageAllocations", js.Array(value*))
    
    inline def setUsageDimension(value: UsageDimension): Self = StObject.set(x, "UsageDimension", value.asInstanceOf[js.Any])
    
    inline def setUsageQuantity(value: UsageQuantity): Self = StObject.set(x, "UsageQuantity", value.asInstanceOf[js.Any])
    
    inline def setUsageQuantityUndefined: Self = StObject.set(x, "UsageQuantity", js.undefined)
  }
}
