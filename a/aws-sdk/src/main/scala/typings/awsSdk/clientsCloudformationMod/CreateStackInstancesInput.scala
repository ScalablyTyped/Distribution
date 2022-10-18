package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStackInstancesInput extends StObject {
  
  /**
    * [Self-managed permissions] The names of one or more Amazon Web Services accounts that you want to create stack instances in the specified Region(s) for. You can specify Accounts or DeploymentTargets, but not both.
    */
  var Accounts: js.UndefOr[AccountList] = js.undefined
  
  /**
    * [Service-managed permissions] Specifies whether you are acting as an account administrator in the organization's management account or as a delegated administrator in a member account. By default, SELF is specified. Use SELF for stack sets with self-managed permissions.   If you are signed in to the management account, specify SELF.   If you are signed in to a delegated administrator account, specify DELEGATED_ADMIN. Your Amazon Web Services account must be registered as a delegated administrator in the management account. For more information, see Register a delegated administrator in the CloudFormation User Guide.  
    */
  var CallAs: js.UndefOr[typings.awsSdk.clientsCloudformationMod.CallAs] = js.undefined
  
  /**
    * [Service-managed permissions] The Organizations accounts for which to create stack instances in the specified Amazon Web Services Regions. You can specify Accounts or DeploymentTargets, but not both.
    */
  var DeploymentTargets: js.UndefOr[typings.awsSdk.clientsCloudformationMod.DeploymentTargets] = js.undefined
  
  /**
    * The unique identifier for this stack set operation. The operation ID also functions as an idempotency token, to ensure that CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You might retry stack set operation requests to ensure that CloudFormation successfully received them. If you don't specify an operation ID, the SDK generates one automatically. Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED.
    */
  var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * Preferences for how CloudFormation performs this stack set operation.
    */
  var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
  
  /**
    * A list of stack set parameters whose values you want to override in the selected stack instances. Any overridden parameter values will be applied to all stack instances in the specified accounts and Amazon Web Services Regions. When specifying parameters and their values, be aware of how CloudFormation sets parameter values during stack instance operations:   To override the current value for a parameter, include the parameter and specify its value.   To leave an overridden parameter set to its present value, include the parameter and specify UsePreviousValue as true. (You can't specify both a value and set UsePreviousValue to true.)   To set an overridden parameter back to the value specified in the stack set, specify a parameter list but don't include the parameter in the list.   To leave all parameters set to their present values, don't specify this property at all.   During stack set updates, any parameter values overridden for a stack instance aren't updated, but retain their overridden value. You can only override the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template.
    */
  var ParameterOverrides: js.UndefOr[Parameters] = js.undefined
  
  /**
    * The names of one or more Amazon Web Services Regions where you want to create stack instances using the specified Amazon Web Services accounts.
    */
  var Regions: RegionList
  
  /**
    * The name or unique ID of the stack set that you want to create stack instances from.
    */
  var StackSetName: typings.awsSdk.clientsCloudformationMod.StackSetName
}
object CreateStackInstancesInput {
  
  inline def apply(Regions: RegionList, StackSetName: StackSetName): CreateStackInstancesInput = {
    val __obj = js.Dynamic.literal(Regions = Regions.asInstanceOf[js.Any], StackSetName = StackSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStackInstancesInput]
  }
  
  extension [Self <: CreateStackInstancesInput](x: Self) {
    
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
    
    inline def setParameterOverrides(value: Parameters): Self = StObject.set(x, "ParameterOverrides", value.asInstanceOf[js.Any])
    
    inline def setParameterOverridesUndefined: Self = StObject.set(x, "ParameterOverrides", js.undefined)
    
    inline def setParameterOverridesVarargs(value: Parameter*): Self = StObject.set(x, "ParameterOverrides", js.Array(value*))
    
    inline def setRegions(value: RegionList): Self = StObject.set(x, "Regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsVarargs(value: Region*): Self = StObject.set(x, "Regions", js.Array(value*))
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
  }
}
