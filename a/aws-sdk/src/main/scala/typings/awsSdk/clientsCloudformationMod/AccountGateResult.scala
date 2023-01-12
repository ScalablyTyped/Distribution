package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountGateResult extends StObject {
  
  /**
    * The status of the account gate function.    SUCCEEDED: The account gate function has determined that the account and Region passes any requirements for a stack set operation to occur. CloudFormation proceeds with the stack operation in that account and Region.    FAILED: The account gate function has determined that the account and Region doesn't meet the requirements for a stack set operation to occur. CloudFormation cancels the stack set operation in that account and Region, and sets the stack set operation result status for that account and Region to FAILED.    SKIPPED: CloudFormation has skipped calling the account gate function for this account and Region, for one of the following reasons:   An account gate function hasn't been specified for the account and Region. CloudFormation proceeds with the stack set operation in this account and Region.   The AWSCloudFormationStackSetExecutionRole of the stack set administration account lacks permissions to invoke the function. CloudFormation proceeds with the stack set operation in this account and Region.   Either no action is necessary, or no action is possible, on the stack. CloudFormation skips the stack set operation in this account and Region.    
    */
  var Status: js.UndefOr[AccountGateStatus] = js.undefined
  
  /**
    * The reason for the account gate status assigned to this account and Region for the stack set operation.
    */
  var StatusReason: js.UndefOr[AccountGateStatusReason] = js.undefined
}
object AccountGateResult {
  
  inline def apply(): AccountGateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountGateResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountGateResult] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: AccountGateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: AccountGateStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
