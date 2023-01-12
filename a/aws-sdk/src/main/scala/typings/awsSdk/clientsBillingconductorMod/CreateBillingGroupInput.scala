package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBillingGroupInput extends StObject {
  
  /**
    *  The set of accounts that will be under the billing group. The set of accounts resemble the linked accounts in a consolidated family. 
    */
  var AccountGrouping: typings.awsSdk.clientsBillingconductorMod.AccountGrouping
  
  /**
    *  The token that is needed to support idempotency. Idempotency isn't currently supported, but will be implemented in a future update. 
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.ClientToken] = js.undefined
  
  /**
    *  The preferences and settings that will be used to compute the Amazon Web Services charges for a billing group. 
    */
  var ComputationPreference: typings.awsSdk.clientsBillingconductorMod.ComputationPreference
  
  /**
    * The description of the billing group. 
    */
  var Description: js.UndefOr[BillingGroupDescription] = js.undefined
  
  /**
    *  The billing group name. The names must be unique. 
    */
  var Name: BillingGroupName
  
  /**
    *  The account ID that serves as the main account in a billing group. 
    */
  var PrimaryAccountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    *  A map that contains tag keys and tag values that are attached to a billing group. This feature isn't available during the beta. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateBillingGroupInput {
  
  inline def apply(
    AccountGrouping: AccountGrouping,
    ComputationPreference: ComputationPreference,
    Name: BillingGroupName
  ): CreateBillingGroupInput = {
    val __obj = js.Dynamic.literal(AccountGrouping = AccountGrouping.asInstanceOf[js.Any], ComputationPreference = ComputationPreference.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBillingGroupInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBillingGroupInput] (val x: Self) extends AnyVal {
    
    inline def setAccountGrouping(value: AccountGrouping): Self = StObject.set(x, "AccountGrouping", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setComputationPreference(value: ComputationPreference): Self = StObject.set(x, "ComputationPreference", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: BillingGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: BillingGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAccountId(value: AccountId): Self = StObject.set(x, "PrimaryAccountId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryAccountIdUndefined: Self = StObject.set(x, "PrimaryAccountId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
