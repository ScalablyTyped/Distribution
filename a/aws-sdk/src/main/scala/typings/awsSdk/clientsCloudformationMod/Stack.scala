package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stack extends StObject {
  
  /**
    * The capabilities allowed in the stack.
    */
  var Capabilities: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Capabilities] = js.undefined
  
  /**
    * The unique ID of the change set.
    */
  var ChangeSetId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ChangeSetId] = js.undefined
  
  /**
    * The time at which the stack was created.
    */
  var CreationTime: js.Date
  
  /**
    * The time the stack was deleted.
    */
  var DeletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A user-defined description associated with the stack.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * Boolean to enable or disable rollback on stack creation failures:    true: disable rollback.    false: enable rollback.  
    */
  var DisableRollback: js.UndefOr[typings.awsSdk.clientsCloudformationMod.DisableRollback] = js.undefined
  
  /**
    * Information about whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackDriftInformation] = js.undefined
  
  /**
    * Whether termination protection is enabled for the stack. For nested stacks, termination protection is set on the root stack and can't be changed directly on the nested stack. For more information, see Protecting a Stack From Being Deleted in the CloudFormation User Guide.
    */
  var EnableTerminationProtection: js.UndefOr[typings.awsSdk.clientsCloudformationMod.EnableTerminationProtection] = js.undefined
  
  /**
    * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Amazon SNS topic Amazon Resource Names (ARNs) to which stack related events are published.
    */
  var NotificationARNs: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NotificationARNs] = js.undefined
  
  /**
    * A list of output structures.
    */
  var Outputs: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Outputs] = js.undefined
  
  /**
    * A list of Parameter structures.
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Parameters] = js.undefined
  
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the CloudFormation User Guide.
    */
  var ParentId: js.UndefOr[StackId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that's associated with the stack. During a stack operation, CloudFormation uses this role's credentials to make calls on your behalf.
    */
  var RoleARN: js.UndefOr[RoleARN_] = js.undefined
  
  /**
    * The rollback triggers for CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsSdk.clientsCloudformationMod.RollbackConfiguration] = js.undefined
  
  /**
    * For nested stacks--stacks created as resources for another stack--the stack ID of the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the CloudFormation User Guide.
    */
  var RootId: js.UndefOr[StackId] = js.undefined
  
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackId] = js.undefined
  
  /**
    * The name associated with the stack.
    */
  var StackName: typings.awsSdk.clientsCloudformationMod.StackName
  
  /**
    * Current status of the stack.
    */
  var StackStatus: typings.awsSdk.clientsCloudformationMod.StackStatus
  
  /**
    * Success/failure message associated with the stack status.
    */
  var StackStatusReason: js.UndefOr[typings.awsSdk.clientsCloudformationMod.StackStatusReason] = js.undefined
  
  /**
    * A list of Tags that specify information about the stack.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Tags] = js.undefined
  
  /**
    * The amount of time within which stack creation should complete.
    */
  var TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined
}
object Stack {
  
  inline def apply(CreationTime: js.Date, StackName: StackName, StackStatus: StackStatus): Stack = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any], StackStatus = StackStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stack]
  }
  
  extension [Self <: Stack](x: Self) {
    
    inline def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setChangeSetId(value: ChangeSetId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTime(value: js.Date): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisableRollback(value: DisableRollback): Self = StObject.set(x, "DisableRollback", value.asInstanceOf[js.Any])
    
    inline def setDisableRollbackUndefined: Self = StObject.set(x, "DisableRollback", js.undefined)
    
    inline def setDriftInformation(value: StackDriftInformation): Self = StObject.set(x, "DriftInformation", value.asInstanceOf[js.Any])
    
    inline def setDriftInformationUndefined: Self = StObject.set(x, "DriftInformation", js.undefined)
    
    inline def setEnableTerminationProtection(value: EnableTerminationProtection): Self = StObject.set(x, "EnableTerminationProtection", value.asInstanceOf[js.Any])
    
    inline def setEnableTerminationProtectionUndefined: Self = StObject.set(x, "EnableTerminationProtection", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setNotificationARNs(value: NotificationARNs): Self = StObject.set(x, "NotificationARNs", value.asInstanceOf[js.Any])
    
    inline def setNotificationARNsUndefined: Self = StObject.set(x, "NotificationARNs", js.undefined)
    
    inline def setNotificationARNsVarargs(value: NotificationARN*): Self = StObject.set(x, "NotificationARNs", js.Array(value*))
    
    inline def setOutputs(value: Outputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setParentId(value: StackId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    inline def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
    
    inline def setRoleARN(value: RoleARN_): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setRollbackConfiguration(value: RollbackConfiguration): Self = StObject.set(x, "RollbackConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRollbackConfigurationUndefined: Self = StObject.set(x, "RollbackConfiguration", js.undefined)
    
    inline def setRootId(value: StackId): Self = StObject.set(x, "RootId", value.asInstanceOf[js.Any])
    
    inline def setRootIdUndefined: Self = StObject.set(x, "RootId", js.undefined)
    
    inline def setStackId(value: StackId): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setStackName(value: StackName): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackStatus(value: StackStatus): Self = StObject.set(x, "StackStatus", value.asInstanceOf[js.Any])
    
    inline def setStackStatusReason(value: StackStatusReason): Self = StObject.set(x, "StackStatusReason", value.asInstanceOf[js.Any])
    
    inline def setStackStatusReasonUndefined: Self = StObject.set(x, "StackStatusReason", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTimeoutInMinutes(value: TimeoutMinutes): Self = StObject.set(x, "TimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutesUndefined: Self = StObject.set(x, "TimeoutInMinutes", js.undefined)
  }
}
