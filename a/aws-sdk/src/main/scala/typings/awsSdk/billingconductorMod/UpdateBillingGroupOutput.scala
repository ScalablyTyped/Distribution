package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBillingGroupOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the billing group that was updated. 
    */
  var Arn: js.UndefOr[BillingGroupArn] = js.undefined
  
  /**
    *  A description of the billing group. 
    */
  var Description: js.UndefOr[BillingGroupDescription] = js.undefined
  
  /**
    *  The most recent time the billing group was modified. 
    */
  var LastModifiedTime: js.UndefOr[Instant] = js.undefined
  
  /**
    *  The name of the billing group. The names must be unique to each billing group. 
    */
  var Name: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the pricing plan to compute Amazon Web Services charges for the billing group. 
    */
  var PricingPlanArn: js.UndefOr[typings.awsSdk.billingconductorMod.PricingPlanArn] = js.undefined
  
  /**
    *  The account ID that serves as the main account in a billing group. 
    */
  var PrimaryAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  The number of accounts in the particular billing group. 
    */
  var Size: js.UndefOr[NumberOfAccounts] = js.undefined
  
  /**
    *  The status of the billing group. Only one of the valid values can be used. 
    */
  var Status: js.UndefOr[BillingGroupStatus] = js.undefined
  
  /**
    *  The reason why the billing group is in its current status. 
    */
  var StatusReason: js.UndefOr[BillingGroupStatusReason] = js.undefined
}
object UpdateBillingGroupOutput {
  
  inline def apply(): UpdateBillingGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBillingGroupOutput]
  }
  
  extension [Self <: UpdateBillingGroupOutput](x: Self) {
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: BillingGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLastModifiedTime(value: Instant): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: BillingGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPricingPlanArn(value: PricingPlanArn): Self = StObject.set(x, "PricingPlanArn", value.asInstanceOf[js.Any])
    
    inline def setPricingPlanArnUndefined: Self = StObject.set(x, "PricingPlanArn", js.undefined)
    
    inline def setPrimaryAccountId(value: AccountId): Self = StObject.set(x, "PrimaryAccountId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAccountIdUndefined: Self = StObject.set(x, "PrimaryAccountId", js.undefined)
    
    inline def setSize(value: NumberOfAccounts): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setStatus(value: BillingGroupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: BillingGroupStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
