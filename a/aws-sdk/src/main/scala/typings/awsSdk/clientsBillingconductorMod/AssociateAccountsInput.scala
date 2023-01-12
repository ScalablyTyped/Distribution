package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAccountsInput extends StObject {
  
  /**
    *  The associating array of account IDs. 
    */
  var AccountIds: AccountIdList
  
  /**
    *  The Amazon Resource Name (ARN) of the billing group that associates the array of account IDs. 
    */
  var Arn: BillingGroupArn
}
object AssociateAccountsInput {
  
  inline def apply(AccountIds: AccountIdList, Arn: BillingGroupArn): AssociateAccountsInput = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAccountsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateAccountsInput] (val x: Self) extends AnyVal {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setArn(value: BillingGroupArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
