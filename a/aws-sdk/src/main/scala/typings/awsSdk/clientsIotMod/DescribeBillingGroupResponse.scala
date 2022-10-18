package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBillingGroupResponse extends StObject {
  
  /**
    * The ARN of the billing group.
    */
  var billingGroupArn: js.UndefOr[BillingGroupArn] = js.undefined
  
  /**
    * The ID of the billing group.
    */
  var billingGroupId: js.UndefOr[BillingGroupId] = js.undefined
  
  /**
    * Additional information about the billing group.
    */
  var billingGroupMetadata: js.UndefOr[BillingGroupMetadata] = js.undefined
  
  /**
    * The name of the billing group.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    * The properties of the billing group.
    */
  var billingGroupProperties: js.UndefOr[BillingGroupProperties] = js.undefined
  
  /**
    * The version of the billing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}
object DescribeBillingGroupResponse {
  
  inline def apply(): DescribeBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBillingGroupResponse]
  }
  
  extension [Self <: DescribeBillingGroupResponse](x: Self) {
    
    inline def setBillingGroupArn(value: BillingGroupArn): Self = StObject.set(x, "billingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupArnUndefined: Self = StObject.set(x, "billingGroupArn", js.undefined)
    
    inline def setBillingGroupId(value: BillingGroupId): Self = StObject.set(x, "billingGroupId", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupIdUndefined: Self = StObject.set(x, "billingGroupId", js.undefined)
    
    inline def setBillingGroupMetadata(value: BillingGroupMetadata): Self = StObject.set(x, "billingGroupMetadata", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupMetadataUndefined: Self = StObject.set(x, "billingGroupMetadata", js.undefined)
    
    inline def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupNameUndefined: Self = StObject.set(x, "billingGroupName", js.undefined)
    
    inline def setBillingGroupProperties(value: BillingGroupProperties): Self = StObject.set(x, "billingGroupProperties", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupPropertiesUndefined: Self = StObject.set(x, "billingGroupProperties", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
