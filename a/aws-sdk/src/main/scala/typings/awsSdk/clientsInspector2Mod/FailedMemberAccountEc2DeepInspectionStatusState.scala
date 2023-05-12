package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedMemberAccountEc2DeepInspectionStatusState extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account of the organization member that failed to activate Amazon Inspector deep inspection.
    */
  var accountId: AccountId
  
  /**
    * The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
    */
  var ec2ScanStatus: js.UndefOr[Status] = js.undefined
  
  /**
    * The error message explaining why the account failed to activate Amazon Inspector deep inspection.
    */
  var errorMessage: js.UndefOr[NonEmptyString] = js.undefined
}
object FailedMemberAccountEc2DeepInspectionStatusState {
  
  inline def apply(accountId: AccountId): FailedMemberAccountEc2DeepInspectionStatusState = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedMemberAccountEc2DeepInspectionStatusState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedMemberAccountEc2DeepInspectionStatusState] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setEc2ScanStatus(value: Status): Self = StObject.set(x, "ec2ScanStatus", value.asInstanceOf[js.Any])
    
    inline def setEc2ScanStatusUndefined: Self = StObject.set(x, "ec2ScanStatus", js.undefined)
    
    inline def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
