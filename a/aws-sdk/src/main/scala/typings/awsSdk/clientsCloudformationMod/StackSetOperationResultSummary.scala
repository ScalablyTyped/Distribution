package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetOperationResultSummary extends StObject {
  
  /**
    * [Self-managed permissions] The name of the Amazon Web Services account for this operation result.
    */
  var Account: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Account] = js.undefined
  
  /**
    * The results of the account gate function CloudFormation invokes, if present, before proceeding with stack set operations in an account.
    */
  var AccountGateResult: js.UndefOr[typings.awsSdk.clientsCloudformationMod.AccountGateResult] = js.undefined
  
  /**
    * [Service-managed permissions] The organization root ID or organizational unit (OU) IDs that you specified for DeploymentTargets.
    */
  var OrganizationalUnitId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.OrganizationalUnitId] = js.undefined
  
  /**
    * The name of the Amazon Web Services Region for this operation result.
    */
  var Region: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Region] = js.undefined
  
  /**
    * The result status of the stack set operation for the given account in the given Region.    CANCELLED: The operation in the specified account and Region has been canceled. This is either because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation has been exceeded.    FAILED: The operation in the specified account and Region failed. If the stack set operation fails in enough accounts within a Region, the failure tolerance for the stack set operation as a whole might be exceeded.    RUNNING: The operation in the specified account and Region is currently in progress.    PENDING: The operation in the specified account and Region has yet to start.    SUCCEEDED: The operation in the specified account and Region completed successfully.  
    */
  var Status: js.UndefOr[StackSetOperationResultStatus] = js.undefined
  
  /**
    * The reason for the assigned result status.
    */
  var StatusReason: js.UndefOr[Reason] = js.undefined
}
object StackSetOperationResultSummary {
  
  inline def apply(): StackSetOperationResultSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetOperationResultSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackSetOperationResultSummary] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAccountGateResult(value: AccountGateResult): Self = StObject.set(x, "AccountGateResult", value.asInstanceOf[js.Any])
    
    inline def setAccountGateResultUndefined: Self = StObject.set(x, "AccountGateResult", js.undefined)
    
    inline def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
    
    inline def setOrganizationalUnitId(value: OrganizationalUnitId): Self = StObject.set(x, "OrganizationalUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdUndefined: Self = StObject.set(x, "OrganizationalUnitId", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStatus(value: StackSetOperationResultStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: Reason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
