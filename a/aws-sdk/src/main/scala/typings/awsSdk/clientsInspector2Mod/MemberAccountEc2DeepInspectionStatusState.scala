package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAccountEc2DeepInspectionStatusState extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account of the organization member
    */
  var accountId: AccountId
  
  /**
    * The error message explaining why the account failed to activate Amazon Inspector deep inspection.
    */
  var errorMessage: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The state of Amazon Inspector deep inspection in the member account.
    */
  var status: js.UndefOr[Ec2DeepInspectionStatus] = js.undefined
}
object MemberAccountEc2DeepInspectionStatusState {
  
  inline def apply(accountId: AccountId): MemberAccountEc2DeepInspectionStatusState = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAccountEc2DeepInspectionStatusState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberAccountEc2DeepInspectionStatusState] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setStatus(value: Ec2DeepInspectionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
