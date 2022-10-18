package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateAccountsInput extends StObject {
  
  /**
    * The array of account IDs to disassociate. 
    */
  var AccountIds: AccountIdList
  
  /**
    * The Amazon Resource Name (ARN) of the billing group that the array of account IDs will disassociate from. 
    */
  var Arn: BillingGroupArn
}
object DisassociateAccountsInput {
  
  inline def apply(AccountIds: AccountIdList, Arn: BillingGroupArn): DisassociateAccountsInput = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateAccountsInput]
  }
  
  extension [Self <: DisassociateAccountsInput](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
