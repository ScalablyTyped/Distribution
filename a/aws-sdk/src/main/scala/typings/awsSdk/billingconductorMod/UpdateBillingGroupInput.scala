package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBillingGroupInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the billing group being updated. 
    */
  var Arn: BillingGroupArn
  
  /**
    *  The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group. 
    */
  var ComputationPreference: js.UndefOr[typings.awsSdk.billingconductorMod.ComputationPreference] = js.undefined
  
  /**
    * A description of the billing group. 
    */
  var Description: js.UndefOr[BillingGroupDescription] = js.undefined
  
  /**
    * The name of the billing group. The names must be unique to each billing group. 
    */
  var Name: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    * The status of the billing group. Only one of the valid values can be used. 
    */
  var Status: js.UndefOr[BillingGroupStatus] = js.undefined
}
object UpdateBillingGroupInput {
  
  inline def apply(Arn: BillingGroupArn): UpdateBillingGroupInput = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBillingGroupInput]
  }
  
  extension [Self <: UpdateBillingGroupInput](x: Self) {
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setComputationPreference(value: ComputationPreference): Self = StObject.set(x, "ComputationPreference", value.asInstanceOf[js.Any])
    
    inline def setComputationPreferenceUndefined: Self = StObject.set(x, "ComputationPreference", js.undefined)
    
    inline def setDescription(value: BillingGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: BillingGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: BillingGroupStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
