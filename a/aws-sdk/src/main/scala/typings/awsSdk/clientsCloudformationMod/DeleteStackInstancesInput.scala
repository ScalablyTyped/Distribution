package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStackInstancesInput extends StObject {
  
  /**
    * [Self-managed permissions] The names of the Amazon Web Services accounts that you want to delete stack instances for. You can specify Accounts or DeploymentTargets, but not both.
    */
  var Accounts: js.UndefOr[AccountList] = js.undefined
  
  /**
    * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. By default, SELF is specified. Use SELF for stack sets with self-managed permissions.   If you are signed in to the management account, specify SELF.   If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN. Your Amazon Web Services account must be registered as a delegated administrator in the management account. For more information, see Register a delegated administrator in the CloudFormation User Guide.  
    */
  var CallAs: js.UndefOr[typings.awsSdk.clientsCloudformationMod.CallAs] = js.undefined
  
  /**
    * [Service-managed permissions] The Organizations accounts from which to delete stack instances. You can specify Accounts or DeploymentTargets, but not both.
    */
  var DeploymentTargets: js.UndefOr[typings.awsSdk.clientsCloudformationMod.DeploymentTargets] = js.undefined
  
  /**
    * The unique identifier for this stack set operation. If you don't specify an operation ID, the SDK generates one automatically. The operation ID also functions as an idempotency token, to ensure that CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You can retry stack set operation requests to ensure that CloudFormation successfully received them. Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * Preferences for how CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
  
  /**
    * The Amazon Web Services Regions where you want to delete stack set instances.
    */
  var Regions: RegionList
  
  /**
    * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack or add an existing, saved stack to a new stack set. For more information, see Stack set operation options.
    */
  var RetainStacks: typings.awsSdk.clientsCloudformationMod.RetainStacks
  
  /**
    * The name or unique ID of the stack set that you want to delete stack instances for.
    */
  var StackSetName: typings.awsSdk.clientsCloudformationMod.StackSetName
}
object DeleteStackInstancesInput {
  
  inline def apply(Regions: RegionList, RetainStacks: RetainStacks, StackSetName: StackSetName): DeleteStackInstancesInput = {
    val __obj = js.Dynamic.literal(Regions = Regions.asInstanceOf[js.Any], RetainStacks = RetainStacks.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackInstancesInput]
  }
  
  extension [Self <: DeleteStackInstancesInput](x: Self) {
    
    inline def setAccounts(value: AccountList): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value*))
    
    inline def setCallAs(value: CallAs): Self = StObject.set(x, "CallAs", value.asInstanceOf[js.Any])
    
    inline def setCallAsUndefined: Self = StObject.set(x, "CallAs", js.undefined)
    
    inline def setDeploymentTargets(value: DeploymentTargets): Self = StObject.set(x, "DeploymentTargets", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTargetsUndefined: Self = StObject.set(x, "DeploymentTargets", js.undefined)
    
    inline def setOperationId(value: ClientRequestToken): Self = StObject.set(x, "OperationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "OperationId", js.undefined)
    
    inline def setOperationPreferences(value: StackSetOperationPreferences): Self = StObject.set(x, "OperationPreferences", value.asInstanceOf[js.Any])
    
    inline def setOperationPreferencesUndefined: Self = StObject.set(x, "OperationPreferences", js.undefined)
    
    inline def setRegions(value: RegionList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "Regions", js.Array(value*))
    
    inline def setRetainStacks(value: RetainStacks): Self = StObject.set(x, "RetainStacks", value.asInstanceOf[js.Any])
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
