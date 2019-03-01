package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cloudformation", "CloudFormation")
@js.native
object CloudFormationNs extends js.Object {
  trait AccountGateResult extends js.Object {
    /**
      * The status of the account gate function.    SUCCEEDED: The account gate function has determined that the account and region passes any requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that account and region.     FAILED: The account gate function has determined that the account and region does not meet the requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that account and region, and sets the stack set operation result status for that account and region to FAILED.     SKIPPED: AWS CloudFormation has skipped calling the account gate function for this account and region, for one of the following reasons:   An account gate function has not been specified for the account and region. AWS CloudFormation proceeds with the stack set operation in this account and region.   The AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and region.   Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set operation in this account and region.    
      */
    var Status: js.UndefOr[AccountGateStatus] = js.undefined
    /**
      * The reason for the account gate status assigned to this account and region for the stack set operation.
      */
    var StatusReason: js.UndefOr[AccountGateStatusReason] = js.undefined
  }
  
  trait AccountLimit extends js.Object {
    /**
      * The name of the account limit. Currently, the only account limit is StackLimit.
      */
    var Name: js.UndefOr[LimitName] = js.undefined
    /**
      * The value that is associated with the account limit name.
      */
    var Value: js.UndefOr[LimitValue] = js.undefined
  }
  
  trait CancelUpdateStackInput extends js.Object {
    /**
      * A unique identifier for this CancelUpdateStack request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack with the same name. You might retry CancelUpdateStack requests to ensure that AWS CloudFormation successfully received them.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The name or the unique stack ID that is associated with the stack.
      */
    var StackName: StackName
  }
  
  trait Change extends js.Object {
    /**
      * A ResourceChange structure that describes the resource and action that AWS CloudFormation will perform.
      */
    var ResourceChange: js.UndefOr[ResourceChange] = js.undefined
    /**
      * The type of entity that AWS CloudFormation changes. Currently, the only entity type is Resource.
      */
    var Type: js.UndefOr[ChangeType] = js.undefined
  }
  
  trait ChangeSetSummary extends js.Object {
    /**
      * The ID of the change set.
      */
    var ChangeSetId: js.UndefOr[ChangeSetId] = js.undefined
    /**
      * The name of the change set.
      */
    var ChangeSetName: js.UndefOr[ChangeSetName] = js.undefined
    /**
      * The start time when the change set was created, in UTC.
      */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
    /**
      * Descriptive information about the change set.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * If the change set execution status is AVAILABLE, you can execute the change set. If you can’t execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because AWS CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
      */
    var ExecutionStatus: js.UndefOr[ExecutionStatus] = js.undefined
    /**
      * The ID of the stack with which the change set is associated.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name of the stack with which the change set is associated.
      */
    var StackName: js.UndefOr[StackName] = js.undefined
    /**
      * The state of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
      */
    var Status: js.UndefOr[ChangeSetStatus] = js.undefined
    /**
      * A description of the change set's status. For example, if your change set is in the FAILED state, AWS CloudFormation shows the error message.
      */
    var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ContinueUpdateRollbackInput extends js.Object {
    /**
      * A unique identifier for this ContinueUpdateRollback request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to continue the rollback to a stack with the same name. You might retry ContinueUpdateRollback requests to ensure that AWS CloudFormation successfully received them.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * A list of the logical IDs of the resources that AWS CloudFormation skips during the continue update rollback operation. You can specify only resources that are in the UPDATE_FAILED state because a rollback failed. You can't specify resources that are in the UPDATE_FAILED state for other reasons, for example, because an update was cancelled. To check why a resource update failed, use the DescribeStackResources action, and view the resource status reason.   Specify this property to skip rolling back resources that AWS CloudFormation can't successfully roll back. We recommend that you  troubleshoot resources before skipping them. AWS CloudFormation sets the status of the specified resources to UPDATE_COMPLETE and continues to roll back the stack. After the rollback is complete, the state of the skipped resources will be inconsistent with the state of the resources in the stack template. Before performing another stack update, you must update the stack or resources to be consistent with each other. If you don't, subsequent stack updates might fail, and the stack will become unrecoverable.   Specify the minimum number of resources required to successfully roll back your stack. For example, a failed resource update might cause dependent resources to fail. In this case, it might not be necessary to skip the dependent resources.  To skip resources that are part of nested stacks, use the following format: NestedStackName.ResourceLogicalID. If you want to specify the logical ID of a stack resource (Type: AWS::CloudFormation::Stack) in the ResourcesToSkip list, then its corresponding embedded stack must be in one of the following states: DELETE_IN_PROGRESS, DELETE_COMPLETE, or DELETE_FAILED.   Don't confuse a child stack's name with its corresponding logical ID defined in the parent stack. For an example of a continue update rollback operation with nested stacks, see Using ResourcesToSkip to recover a nested stacks hierarchy.  
      */
    var ResourcesToSkip: js.UndefOr[ResourcesToSkip] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation assumes to roll back the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS CloudFormation always uses this role for all future operations on the stack. As long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least privilege. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The name or the unique ID of the stack that you want to continue rolling back.  Don't specify the name of a nested stack (a stack that was created by using the AWS::CloudFormation::Stack resource). Instead, use this operation on the parent stack (the stack that contains the AWS::CloudFormation::Stack resource). 
      */
    var StackName: StackNameOrId
  }
  
  trait ContinueUpdateRollbackOutput extends js.Object
  
  trait CreateChangeSetInput extends js.Object {
    /**
      * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for AWS CloudFormation to create the stack.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your AWS account; for example, by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.    If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.    If you don't specify either of these capabilities, AWS CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group      AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User      AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some template contain macros. Macros perform custom processing on templates; this can include simple actions like find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users typically create a change set from the processed template, so that they can review the changes resulting from the macros before actually creating the stack. If your stack template contains one or more macros, and you choose to create a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by AWS CloudFormation.  This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect. Also, change sets do not currently support nested stacks. If you want to create a stack from a stack template that contains macros and nested stacks, you must create or update the stack directly from the template using the CreateStack or UpdateStack action, and specifying this capability.  For more information on macros, see Using AWS CloudFormation Macros to Perform Custom Processing on Templates.  
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * The name of the change set. The name must be unique among all change sets that are associated with the specified stack. A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with an alphabetic character and cannot exceed 128 characters.
      */
    var ChangeSetName: ChangeSetName
    /**
      * The type of change set operation. To create a change set for a new stack, specify CREATE. To create a change set for an existing stack, specify UPDATE. If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no template or resources. The stack will be in the  REVIEW_IN_PROGRESS  state until you execute the change set. By default, AWS CloudFormation specifies UPDATE. You can't use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
      */
    var ChangeSetType: js.UndefOr[ChangeSetType] = js.undefined
    /**
      * A unique identifier for this CreateChangeSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to create another change set with the same name. You might retry CreateChangeSet requests to ensure that AWS CloudFormation successfully received them.
      */
    var ClientToken: js.UndefOr[ClientToken] = js.undefined
    /**
      * A description to help you identify this change set.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
      */
    var NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined
    /**
      * A list of Parameter structures that specify input parameters for the change set. For more information, see the Parameter data type.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The template resource types that you have permissions to work with if you execute this change set, such as AWS::EC2::Instance, AWS::EC2::*, or Custom::MyCustomInstance. If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM) uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more information, see Controlling Access with AWS Identity and Access Management in the AWS CloudFormation User Guide.
      */
    var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least privilege. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
      */
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined
    /**
      * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates the change set by comparing this stack's information with the information that you submit, such as a modified template or different parameter input values.
      */
    var StackName: StackNameOrId
    /**
      * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources in the stack. You can specify a maximum of 50 tags.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum length of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the template of the stack that you specified. Conditional: You must specify only TemplateBody or TemplateURL.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    /**
      * The location of the file that contains the revised template. The URL must point to a template (max size: 460,800 bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing this template with the stack that you specified. Conditional: You must specify only TemplateBody or TemplateURL.
      */
    var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    /**
      * Whether to reuse the template that is associated with the stack to create the change set.
      */
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined
  }
  
  trait CreateChangeSetOutput extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the change set.
      */
    var Id: js.UndefOr[ChangeSetId] = js.undefined
    /**
      * The unique ID of the stack.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
  }
  
  trait CreateStackInput extends js.Object {
    /**
      * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for AWS CloudFormation to create the stack.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your AWS account; for example, by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.    If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.    If you don't specify either of these capabilities, AWS CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group      AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User      AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some template contain macros. Macros perform custom processing on templates; this can include simple actions like find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users typically create a change set from the processed template, so that they can review the changes resulting from the macros before actually creating the stack. If your stack template contains one or more macros, and you choose to create a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by AWS CloudFormation. Change sets do not currently support nested stacks. If you want to create a stack from a stack template that contains macros and nested stacks, you must create the stack directly from the template using this capability.  You should only create stacks directly from a stack template that contains macros if you know what processing the macro performs. Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the Lambda function owner can update the function operation without AWS CloudFormation being notified.  For more information, see Using AWS CloudFormation Macros to Perform Custom Processing on Templates.  
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * A unique identifier for this CreateStack request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to create a stack with the same name. You might retry CreateStack requests to ensure that AWS CloudFormation successfully received them. All events triggered by a given stack operation are assigned the same client request token, which you can use to track operations. For example, if you execute a CreateStack operation with the token token1, then all the StackEvents generated by that operation will have ClientRequestToken set as token1. In the console, stack operations display the client request token on the Events tab. Stack operations that are initiated from the console use the token format Console-StackOperation-ID, which helps you easily identify the stack operation . For example, if you create a stack using the console, each stack event would be assigned the same token in the following format: Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Set to true to disable rollback of the stack if stack creation failed. You can specify either DisableRollback or OnFailure, but not both. Default: false 
      */
    var DisableRollback: js.UndefOr[DisableRollback] = js.undefined
    /**
      * Whether to enable termination protection on the specified stack. If a user attempts to delete a stack with termination protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide. Termination protection is disabled on stacks by default.   For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack.
      */
    var EnableTerminationProtection: js.UndefOr[EnableTerminationProtection] = js.undefined
    /**
      * The Simple Notification Service (SNS) topic ARNs to publish stack related events. You can find your SNS topic ARNs using the SNS console or your Command Line Interface (CLI).
      */
    var NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined
    /**
      * Determines what action will be taken if stack creation fails. This must be one of: DO_NOTHING, ROLLBACK, or DELETE. You can specify either OnFailure or DisableRollback, but not both. Default: ROLLBACK 
      */
    var OnFailure: js.UndefOr[OnFailure] = js.undefined
    /**
      * A list of Parameter structures that specify input parameters for the stack. For more information, see the Parameter data type.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The template resource types that you have permissions to work with for this create stack action, such as AWS::EC2::Instance, AWS::EC2::*, or Custom::MyCustomInstance. Use the following syntax to describe template resource types: AWS::* (for all AWS resource), Custom::* (for all custom resources), Custom::logical_ID  (for a specific custom resource), AWS::service_name::* (for all resources of a particular AWS service), and AWS::service_name::resource_logical_ID  (for a specific AWS resource). If the list of resource types doesn't include a resource that you're creating, the stack creation fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM) uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more information, see Controlling Access with AWS Identity and Access Management.
      */
    var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation assumes to create the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS CloudFormation always uses this role for all future operations on the stack. As long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least privilege. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
      */
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined
    /**
      * The name that is associated with the stack. The name must be unique in the region in which you are creating the stack.  A stack name can contain only alphanumeric characters (case sensitive) and hyphens. It must start with an alphabetic character and cannot be longer than 128 characters. 
      */
    var StackName: StackName
    /**
      * Structure containing the stack policy body. For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
      */
    var StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined
    /**
      * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in an S3 bucket in the same region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
      */
    var StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined
    /**
      * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to the resources created in the stack. A maximum number of 50 tags can be specified.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    /**
      * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket. For more information, go to the Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
      */
    var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    /**
      * The amount of time that can pass before the stack status becomes CREATE_FAILED; if DisableRollback is not set or is set to false, the stack will be rolled back.
      */
    var TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined
  }
  
  trait CreateStackInstancesInput extends js.Object {
    /**
      * The names of one or more AWS accounts that you want to create stack instances in the specified region(s) for.
      */
    var Accounts: AccountList
    /**
      * The unique identifier for this stack set operation.  The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You might retry stack set operation requests to ensure that AWS CloudFormation successfully received them. If you don't specify an operation ID, the SDK generates one automatically.  Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED. 
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Preferences for how AWS CloudFormation performs this stack set operation.
      */
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
    /**
      * A list of stack set parameters whose values you want to override in the selected stack instances. Any overridden parameter values will be applied to all stack instances in the specified accounts and regions. When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter values during stack instance operations:   To override the current value for a parameter, include the parameter and specify its value.   To leave a parameter set to its present value, you can do one of the following:   Do not include the parameter in the list.   Include the parameter and specify UsePreviousValue as true. (You cannot specify both a value and set UsePreviousValue to true.)     To set all overridden parameter back to the values specified in the stack set, specify a parameter list but do not include any parameters.   To leave all parameters set to their present values, do not specify this property at all.   During stack set updates, any parameter values overridden for a stack instance are not updated, but retain their overridden value. You can only override the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template.
      */
    var ParameterOverrides: js.UndefOr[Parameters] = js.undefined
    /**
      * The names of one or more regions where you want to create stack instances using the specified AWS account(s). 
      */
    var Regions: RegionList
    /**
      * The name or unique ID of the stack set that you want to create stack instances from.
      */
    var StackSetName: StackSetName
  }
  
  trait CreateStackInstancesOutput extends js.Object {
    /**
      * The unique identifier for this stack set operation.
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  }
  
  trait CreateStackOutput extends js.Object {
    /**
      * Unique identifier of the stack.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
  }
  
  trait CreateStackSetInput extends js.Object {
    /**
      * The Amazon Resource Number (ARN) of the IAM role to use to create this stack set.  Specify an IAM role only if you are using customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Prerequisites: Granting Permissions for Stack Set Operations in the AWS CloudFormation User Guide.
      */
    var AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * In some cases, you must explicity acknowledge that your stack set template contains certain capabilities in order for AWS CloudFormation to create the stack set and related stack instances.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your AWS account; for example, by creating new AWS Identity and Access Management (IAM) users. For those stack sets, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.    If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.    If you don't specify either of these capabilities, AWS CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group      AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User      AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some templates contain macros. If your stack template contains one or more macros, and you choose to create a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. For more information, see Using AWS CloudFormation Macros to Perform Custom Processing on Templates.  Stack sets do not currently support macros in stack templates. (This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this capability, if you include a macro in your template the stack set operation will fail.   
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * A unique identifier for this CreateStackSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to create another stack set with the same name. You might retry CreateStackSet requests to ensure that AWS CloudFormation successfully received them. If you don't specify an operation ID, the SDK generates one automatically. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * A description of the stack set. You can use the description to identify the stack set's purpose or other important information.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the IAM execution role to use to create the stack set. If you do not specify an execution role, AWS CloudFormation uses the AWSCloudFormationStackSetExecutionRole role for the stack set operation. Specify an IAM role only if you are using customized execution roles to control which stack resources users and groups can include in their stack sets. 
      */
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined
    /**
      * The input parameters for the stack set template. 
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The name to associate with the stack set. The name must be unique in the region where you create your stack set.  A stack name can contain only alphanumeric characters (case-sensitive) and hyphens. It must start with an alphabetic character and can't be longer than 128 characters. 
      */
    var StackSetName: StackSetName
    /**
      * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the stacks. A maximum number of 50 tags can be specified. If you specify tags as part of a CreateStackSet action, AWS CloudFormation checks to see if you have the required IAM permission to tag resources. If you don't, the entire CreateStackSet action fails with an access denied error, and the stack set is not created.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    /**
      * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800 bytes) that's located in an Amazon S3 bucket. For more information, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify either the TemplateBody or the TemplateURL parameter, but not both.
      */
    var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
  }
  
  trait CreateStackSetOutput extends js.Object {
    /**
      * The ID of the stack set that you're creating.
      */
    var StackSetId: js.UndefOr[StackSetId] = js.undefined
  }
  
  trait DeleteChangeSetInput extends js.Object {
    /**
      * The name or Amazon Resource Name (ARN) of the change set that you want to delete.
      */
    var ChangeSetName: ChangeSetNameOrId
    /**
      * If you specified the name of a change set to delete, specify the stack name or ID (ARN) that is associated with it.
      */
    var StackName: js.UndefOr[StackNameOrId] = js.undefined
  }
  
  trait DeleteChangeSetOutput extends js.Object
  
  trait DeleteStackInput extends js.Object {
    /**
      * A unique identifier for this DeleteStack request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to delete a stack with the same name. You might retry DeleteStack requests to ensure that AWS CloudFormation successfully received them. All events triggered by a given stack operation are assigned the same client request token, which you can use to track operations. For example, if you execute a CreateStack operation with the token token1, then all the StackEvents generated by that operation will have ClientRequestToken set as token1. In the console, stack operations display the client request token on the Events tab. Stack operations that are initiated from the console use the token format Console-StackOperation-ID, which helps you easily identify the stack operation . For example, if you create a stack using the console, each stack event would be assigned the same token in the following format: Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * For stacks in the DELETE_FAILED state, a list of resource logical IDs that are associated with the resources you want to retain. During deletion, AWS CloudFormation deletes the stack but does not delete the retained resources. Retaining resources is useful when you cannot delete a resource, such as a non-empty S3 bucket, but you want to delete the stack.
      */
    var RetainResources: js.UndefOr[RetainResources] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation assumes to delete the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The name or the unique stack ID that is associated with the stack.
      */
    var StackName: StackName
  }
  
  trait DeleteStackInstancesInput extends js.Object {
    /**
      * The names of the AWS accounts that you want to delete stack instances for.
      */
    var Accounts: AccountList
    /**
      * The unique identifier for this stack set operation.  If you don't specify an operation ID, the SDK generates one automatically.  The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You can retry stack set operation requests to ensure that AWS CloudFormation successfully received them. Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED. 
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Preferences for how AWS CloudFormation performs this stack set operation.
      */
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
    /**
      * The regions where you want to delete stack set instances. 
      */
    var Regions: RegionList
    /**
      * Removes the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack or add an existing, saved stack to a new stack set. For more information, see Stack set operation options.
      */
    var RetainStacks: RetainStacks
    /**
      * The name or unique ID of the stack set that you want to delete stack instances for.
      */
    var StackSetName: StackSetName
  }
  
  trait DeleteStackInstancesOutput extends js.Object {
    /**
      * The unique identifier for this stack set operation.
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  }
  
  trait DeleteStackSetInput extends js.Object {
    /**
      * The name or unique ID of the stack set that you're deleting. You can obtain this value by running ListStackSets.
      */
    var StackSetName: StackSetName
  }
  
  trait DeleteStackSetOutput extends js.Object
  
  trait DescribeAccountLimitsInput extends js.Object {
    /**
      * A string that identifies the next page of limits that you want to retrieve.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeAccountLimitsOutput extends js.Object {
    /**
      * An account limit structure that contain a list of AWS CloudFormation account limits and their values.
      */
    var AccountLimits: js.UndefOr[AccountLimitList] = js.undefined
    /**
      * If the output exceeds 1 MB in size, a string that identifies the next page of limits. If no additional page exists, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait DescribeChangeSetInput extends js.Object {
    /**
      * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
      */
    var ChangeSetName: ChangeSetNameOrId
    /**
      * A string (provided by the DescribeChangeSet response output) that identifies the next page of information that you want to retrieve.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to describe.
      */
    var StackName: js.UndefOr[StackNameOrId] = js.undefined
  }
  
  trait DescribeChangeSetOutput extends js.Object {
    /**
      * If you execute the change set, the list of capabilities that were explicitly acknowledged when the change set was created.
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * The ARN of the change set.
      */
    var ChangeSetId: js.UndefOr[ChangeSetId] = js.undefined
    /**
      * The name of the change set.
      */
    var ChangeSetName: js.UndefOr[ChangeSetName] = js.undefined
    /**
      * A list of Change structures that describes the resources AWS CloudFormation changes if you execute the change set.
      */
    var Changes: js.UndefOr[Changes] = js.undefined
    /**
      * The start time when the change set was created, in UTC.
      */
    var CreationTime: js.UndefOr[CreationTime] = js.undefined
    /**
      * Information about the change set.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * If the change set execution status is AVAILABLE, you can execute the change set. If you can’t execute the change set, the status indicates why. For example, a change set might be in an UNAVAILABLE state because AWS CloudFormation is still creating it or in an OBSOLETE state because the stack was already updated.
      */
    var ExecutionStatus: js.UndefOr[ExecutionStatus] = js.undefined
    /**
      * If the output exceeds 1 MB, a string that identifies the next page of changes. If there is no additional page, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ARNs of the Amazon Simple Notification Service (Amazon SNS) topics that will be associated with the stack if you execute the change set.
      */
    var NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined
    /**
      * A list of Parameter structures that describes the input parameters and their values used to create the change set. For more information, see the Parameter data type.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
      */
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined
    /**
      * The ARN of the stack that is associated with the change set.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name of the stack that is associated with the change set.
      */
    var StackName: js.UndefOr[StackName] = js.undefined
    /**
      * The current status of the change set, such as CREATE_IN_PROGRESS, CREATE_COMPLETE, or FAILED.
      */
    var Status: js.UndefOr[ChangeSetStatus] = js.undefined
    /**
      * A description of the change set's status. For example, if your attempt to create a change set failed, AWS CloudFormation shows the error message.
      */
    var StatusReason: js.UndefOr[ChangeSetStatusReason] = js.undefined
    /**
      * If you execute the change set, the tags that will be associated with the stack.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
  }
  
  trait DescribeStackDriftDetectionStatusInput extends js.Object {
    /**
      * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary. 
      */
    var StackDriftDetectionId: StackDriftDetectionId
  }
  
  trait DescribeStackDriftDetectionStatusOutput extends js.Object {
    /**
      * The status of the stack drift detection operation.    DETECTION_COMPLETE: The stack drift detection operation has successfully completed for all resources in the stack that support drift detection. (Resources that do not currently support stack detection remain unchecked.) If you specified logical resource IDs for AWS CloudFormation to use as a filter for the stack drift detection operation, only the resources with those logical IDs are checked for drift.    DETECTION_FAILED: The stack drift detection operation has failed for at least one resource in the stack. Results will be available for resources on which AWS CloudFormation successfully completed drift detection.    DETECTION_IN_PROGRESS: The stack drift detection operation is currently in progress.  
      */
    var DetectionStatus: StackDriftDetectionStatus
    /**
      * The reason the stack drift detection operation has its current status.
      */
    var DetectionStatusReason: js.UndefOr[StackDriftDetectionStatusReason] = js.undefined
    /**
      * Total number of stack resources that have drifted. This is NULL until the drift detection operation reaches a status of DETECTION_COMPLETE. This value will be 0 for stacks whose drift status is IN_SYNC.
      */
    var DriftedStackResourceCount: js.UndefOr[BoxedInteger] = js.undefined
    /**
      * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of reports AWS CloudFormation retains for any given stack, and for how long, may vary.
      */
    var StackDriftDetectionId: StackDriftDetectionId
    /**
      * Status of the stack's actual configuration compared to its expected configuration.     DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
      */
    var StackDriftStatus: js.UndefOr[StackDriftStatus] = js.undefined
    /**
      * The ID of the stack.
      */
    var StackId: StackId
    /**
      * Time at which the stack drift detection operation was initiated.
      */
    var Timestamp: Timestamp
  }
  
  trait DescribeStackEventsInput extends js.Object {
    /**
      * A string that identifies the next page of events that you want to retrieve.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
      */
    var StackName: js.UndefOr[StackName] = js.undefined
  }
  
  trait DescribeStackEventsOutput extends js.Object {
    /**
      * If the output exceeds 1 MB in size, a string that identifies the next page of events. If no additional page exists, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of StackEvents structures.
      */
    var StackEvents: js.UndefOr[StackEvents] = js.undefined
  }
  
  trait DescribeStackInstanceInput extends js.Object {
    /**
      * The ID of an AWS account that's associated with this stack instance.
      */
    var StackInstanceAccount: Account
    /**
      * The name of a region that's associated with this stack instance.
      */
    var StackInstanceRegion: Region
    /**
      * The name or the unique stack ID of the stack set that you want to get stack instance information for.
      */
    var StackSetName: StackSetName
  }
  
  trait DescribeStackInstanceOutput extends js.Object {
    /**
      * The stack instance that matches the specified request parameters.
      */
    var StackInstance: js.UndefOr[StackInstance] = js.undefined
  }
  
  trait DescribeStackResourceDriftsInput extends js.Object {
    /**
      * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
      */
    var MaxResults: js.UndefOr[BoxedMaxResults] = js.undefined
    /**
      * A string that identifies the next page of stack resource drift results.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the stack for which you want drift information.
      */
    var StackName: StackNameOrId
    /**
      * The resource drift status values to use as filters for the resource drift results returned.    DELETED: The resource differs from its expected template configuration in that the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected template values.    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
      */
    var StackResourceDriftStatusFilters: js.UndefOr[StackResourceDriftStatusFilters] = js.undefined
  }
  
  trait DescribeStackResourceDriftsOutput extends js.Object {
    /**
      * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call DescribeStackResourceDrifts again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where AWS CloudFormation detects drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not currently support drift detection are not checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection.
      */
    var StackResourceDrifts: StackResourceDrifts
  }
  
  trait DescribeStackResourceInput extends js.Object {
    /**
      * The logical name of the resource as specified in the template. Default: There is no default value.
      */
    var LogicalResourceId: LogicalResourceId
    /**
      * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
      */
    var StackName: StackName
  }
  
  trait DescribeStackResourceOutput extends js.Object {
    /**
      * A StackResourceDetail structure containing the description of the specified resource in the specified stack.
      */
    var StackResourceDetail: js.UndefOr[StackResourceDetail] = js.undefined
  }
  
  trait DescribeStackResourcesInput extends js.Object {
    /**
      * The logical name of the resource as specified in the template. Default: There is no default value.
      */
    var LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    /**
      * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation. For example, for an Amazon Elastic Compute Cloud (EC2) instance, PhysicalResourceId corresponds to the InstanceId. You can pass the EC2 InstanceId to DescribeStackResources to find which stack the instance belongs to and what other resources are part of the stack. Required: Conditional. If you do not specify PhysicalResourceId, you must specify StackName. Default: There is no default value.
      */
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    /**
      * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value. Required: Conditional. If you do not specify StackName, you must specify PhysicalResourceId.
      */
    var StackName: js.UndefOr[StackName] = js.undefined
  }
  
  trait DescribeStackResourcesOutput extends js.Object {
    /**
      * A list of StackResource structures.
      */
    var StackResources: js.UndefOr[StackResources] = js.undefined
  }
  
  trait DescribeStackSetInput extends js.Object {
    /**
      * The name or unique ID of the stack set whose description you want.
      */
    var StackSetName: StackSetName
  }
  
  trait DescribeStackSetOperationInput extends js.Object {
    /**
      * The unique ID of the stack set operation. 
      */
    var OperationId: ClientRequestToken
    /**
      * The name or the unique stack ID of the stack set for the stack operation.
      */
    var StackSetName: StackSetName
  }
  
  trait DescribeStackSetOperationOutput extends js.Object {
    /**
      * The specified stack set operation.
      */
    var StackSetOperation: js.UndefOr[StackSetOperation] = js.undefined
  }
  
  trait DescribeStackSetOutput extends js.Object {
    /**
      * The specified stack set.
      */
    var StackSet: js.UndefOr[StackSet] = js.undefined
  }
  
  trait DescribeStacksInput extends js.Object {
    /**
      * A string that identifies the next page of stacks that you want to retrieve.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
      */
    var StackName: js.UndefOr[StackName] = js.undefined
  }
  
  trait DescribeStacksOutput extends js.Object {
    /**
      * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of stack structures.
      */
    var Stacks: js.UndefOr[Stacks] = js.undefined
  }
  
  trait DetectStackDriftInput extends js.Object {
    /**
      * The logical names of any resources you want to use as filters.
      */
    var LogicalResourceIds: js.UndefOr[LogicalResourceIds] = js.undefined
    /**
      * The name of the stack for which you want to detect drift. 
      */
    var StackName: StackNameOrId
  }
  
  trait DetectStackDriftOutput extends js.Object {
    /**
      * The ID of the drift detection results of this operation.  AWS CloudFormation generates new results, with a new drift detection ID, each time this operation is run. However, the number of drift results AWS CloudFormation retains for any given stack, and for how long, may vary. 
      */
    var StackDriftDetectionId: StackDriftDetectionId
  }
  
  trait DetectStackResourceDriftInput extends js.Object {
    /**
      * The logical name of the resource for which to return drift information.
      */
    var LogicalResourceId: LogicalResourceId
    /**
      * The name of the stack to which the resource belongs.
      */
    var StackName: StackNameOrId
  }
  
  trait DetectStackResourceDriftOutput extends js.Object {
    /**
      * Information about whether the resource's actual configuration has drifted from its expected template configuration, including actual and expected property values and any differences detected.
      */
    var StackResourceDrift: StackResourceDrift
  }
  
  trait EstimateTemplateCostInput extends js.Object {
    /**
      * A list of Parameter structures that specify input parameters.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) Conditional: You must pass TemplateBody or TemplateURL. If both are passed, only TemplateBody is used.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    /**
      * Location of file containing the template body. The URL must point to a template that is located in an Amazon S3 bucket. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
      */
    var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
  }
  
  trait EstimateTemplateCostOutput extends js.Object {
    /**
      * An AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
      */
    var Url: js.UndefOr[Url] = js.undefined
  }
  
  trait ExecuteChangeSetInput extends js.Object {
    /**
      * The name or ARN of the change set that you want use to update the specified stack.
      */
    var ChangeSetName: ChangeSetNameOrId
    /**
      * A unique identifier for this ExecuteChangeSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to execute a change set to update a stack with the same name. You might retry ExecuteChangeSet requests to ensure that AWS CloudFormation successfully received them.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the change set you want to execute.
      */
    var StackName: js.UndefOr[StackNameOrId] = js.undefined
  }
  
  trait ExecuteChangeSetOutput extends js.Object
  
  trait Export extends js.Object {
    /**
      * The stack that contains the exported output name and value.
      */
    var ExportingStackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name of exported output value. Use this name and the Fn::ImportValue function to import the associated value into other stacks. The name is defined in the Export field in the associated stack's Outputs section.
      */
    var Name: js.UndefOr[ExportName] = js.undefined
    /**
      * The value of the exported output, such as a resource physical ID. This value is defined in the Export field in the associated stack's Outputs section.
      */
    var Value: js.UndefOr[ExportValue] = js.undefined
  }
  
  trait GetStackPolicyInput extends js.Object {
    /**
      * The name or unique stack ID that is associated with the stack whose policy you want to get.
      */
    var StackName: StackName
  }
  
  trait GetStackPolicyOutput extends js.Object {
    /**
      * Structure containing the stack policy body. (For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide.)
      */
    var StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined
  }
  
  trait GetTemplateInput extends js.Object {
    /**
      * The name or Amazon Resource Name (ARN) of a change set for which AWS CloudFormation returns the associated template. If you specify a name, you must also specify the StackName.
      */
    var ChangeSetName: js.UndefOr[ChangeSetNameOrId] = js.undefined
    /**
      * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
      */
    var StackName: js.UndefOr[StackName] = js.undefined
    /**
      * For templates that include transforms, the stage of the template that AWS CloudFormation returns. To get the user-submitted template, specify Original. To get the template after AWS CloudFormation has processed all transforms, specify Processed.  If the template doesn't include transforms, Original and Processed return the same template. By default, AWS CloudFormation specifies Original. 
      */
    var TemplateStage: js.UndefOr[TemplateStage] = js.undefined
  }
  
  trait GetTemplateOutput extends js.Object {
    /**
      * The stage of the template that you can retrieve. For stacks, the Original and Processed templates are always available. For change sets, the Original template is always available. After AWS CloudFormation finishes creating the change set, the Processed template becomes available.
      */
    var StagesAvailable: js.UndefOr[StageList] = js.undefined
    /**
      * Structure containing the template body. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) AWS CloudFormation returns the same template that was used when the stack was created.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
  }
  
  trait GetTemplateSummaryInput extends js.Object {
    /**
      * The name or the stack ID that is associated with the stack, which are not always interchangeable. For running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you must specify the unique stack ID. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
      */
    var StackName: js.UndefOr[StackNameOrId] = js.undefined
    /**
      * The name or unique ID of the stack set from which the stack was created. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
      */
    var StackSetName: js.UndefOr[StackSetNameOrId] = js.undefined
    /**
      * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information about templates, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    /**
      * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket. For more information about templates, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
      */
    var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
  }
  
  trait GetTemplateSummaryOutput extends js.Object {
    /**
      * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * The list of resources that generated the values in the Capabilities response element.
      */
    var CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined
    /**
      * A list of the transforms that are declared in the template.
      */
    var DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined
    /**
      * The value that is defined in the Description property of the template.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The value that is defined for the Metadata property of the template.
      */
    var Metadata: js.UndefOr[Metadata] = js.undefined
    /**
      * A list of parameter declarations that describe various properties for each parameter.
      */
    var Parameters: js.UndefOr[ParameterDeclarations] = js.undefined
    /**
      * A list of all the template resource types that are defined in the template, such as AWS::EC2::Instance, AWS::Dynamo::Table, and Custom::MyCustomInstance.
      */
    var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    /**
      * The AWS template format version, which identifies the capabilities of the template.
      */
    var Version: js.UndefOr[Version] = js.undefined
  }
  
  trait ListChangeSetsInput extends js.Object {
    /**
      * A string (provided by the ListChangeSets response output) that identifies the next page of change sets that you want to retrieve.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name or the Amazon Resource Name (ARN) of the stack for which you want to list change sets.
      */
    var StackName: StackNameOrId
  }
  
  trait ListChangeSetsOutput extends js.Object {
    /**
      * If the output exceeds 1 MB, a string that identifies the next page of change sets. If there is no additional page, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of ChangeSetSummary structures that provides the ID and status of each change set for the specified stack.
      */
    var Summaries: js.UndefOr[ChangeSetSummaries] = js.undefined
  }
  
  trait ListExportsInput extends js.Object {
    /**
      * A string (provided by the ListExports response output) that identifies the next page of exported output values that you asked to retrieve.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListExportsOutput extends js.Object {
    /**
      * The output for the ListExports action.
      */
    var Exports: js.UndefOr[Exports] = js.undefined
    /**
      * If the output exceeds 100 exported output values, a string that identifies the next page of exports. If there is no additional page, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListImportsInput extends js.Object {
    /**
      * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value. 
      */
    var ExportName: ExportName
    /**
      * A string (provided by the ListImports response output) that identifies the next page of stacks that are importing the specified exported output value. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListImportsOutput extends js.Object {
    /**
      * A list of stack names that are importing the specified exported output value. 
      */
    var Imports: js.UndefOr[Imports] = js.undefined
    /**
      * A string that identifies the next page of exports. If there is no additional page, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListStackInstancesInput extends js.Object {
    /**
      * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous request didn't return all of the remaining results, the response's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name of the AWS account that you want to list stack instances for.
      */
    var StackInstanceAccount: js.UndefOr[Account] = js.undefined
    /**
      * The name of the region where you want to list stack instances. 
      */
    var StackInstanceRegion: js.UndefOr[Region] = js.undefined
    /**
      * The name or unique ID of the stack set that you want to list stack instances for.
      */
    var StackSetName: StackSetName
  }
  
  trait ListStackInstancesOutput extends js.Object {
    /**
      * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of StackInstanceSummary structures that contain information about the specified stack instances.
      */
    var Summaries: js.UndefOr[StackInstanceSummaries] = js.undefined
  }
  
  trait ListStackResourcesInput extends js.Object {
    /**
      * A string that identifies the next page of stack resources that you want to retrieve.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
      */
    var StackName: StackName
  }
  
  trait ListStackResourcesOutput extends js.Object {
    /**
      * If the output exceeds 1 MB, a string that identifies the next page of stack resources. If no additional page exists, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of StackResourceSummary structures.
      */
    var StackResourceSummaries: js.UndefOr[StackResourceSummaries] = js.undefined
  }
  
  trait ListStackSetOperationResultsInput extends js.Object {
    /**
      * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackSetOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ID of the stack set operation.
      */
    var OperationId: ClientRequestToken
    /**
      * The name or unique ID of the stack set that you want to get operation results for.
      */
    var StackSetName: StackSetName
  }
  
  trait ListStackSetOperationResultsOutput extends js.Object {
    /**
      * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of StackSetOperationResultSummary structures that contain information about the specified operation results, for accounts and regions that are included in the operation.
      */
    var Summaries: js.UndefOr[StackSetOperationResultSummaries] = js.undefined
  }
  
  trait ListStackSetOperationsInput extends js.Object {
    /**
      * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackSetOperations again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The name or unique ID of the stack set that you want to get operation summaries for.
      */
    var StackSetName: StackSetName
  }
  
  trait ListStackSetOperationsOutput extends js.Object {
    /**
      * If the request doesn't return all results, NextToken is set to a token. To retrieve the next set of results, call ListOperationResults again and assign that token to the request object's NextToken parameter. If there are no remaining results, NextToken is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of StackSetOperationSummary structures that contain summary information about operations for the specified stack set.
      */
    var Summaries: js.UndefOr[StackSetOperationSummaries] = js.undefined
  }
  
  trait ListStackSetsInput extends js.Object {
    /**
      * The maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * If the previous paginated request didn't return all of the remaining results, the response object's NextToken parameter value is set to a token. To retrieve the next set of results, call ListStackSets again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The status of the stack sets that you want to get summary information about.
      */
    var Status: js.UndefOr[StackSetStatus] = js.undefined
  }
  
  trait ListStackSetsOutput extends js.Object {
    /**
      * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call ListStackInstances again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of StackSetSummary structures that contain information about the user's stack sets.
      */
    var Summaries: js.UndefOr[StackSetSummaries] = js.undefined
  }
  
  trait ListStacksInput extends js.Object {
    /**
      * A string that identifies the next page of stacks that you want to retrieve.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Stack status to use as a filter. Specify one or more stack status codes to list only stacks with the specified status codes. For a complete list of stack status codes, see the StackStatus parameter of the Stack data type.
      */
    var StackStatusFilter: js.UndefOr[StackStatusFilter] = js.undefined
  }
  
  trait ListStacksOutput extends js.Object {
    /**
      * If the output exceeds 1 MB in size, a string that identifies the next page of stacks. If no additional page exists, this value is null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * A list of StackSummary structures containing information about the specified stacks.
      */
    var StackSummaries: js.UndefOr[StackSummaries] = js.undefined
  }
  
  trait Output extends js.Object {
    /**
      * User defined description associated with the output.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the export associated with the output.
      */
    var ExportName: js.UndefOr[ExportName] = js.undefined
    /**
      * The key associated with the output.
      */
    var OutputKey: js.UndefOr[OutputKey] = js.undefined
    /**
      * The value associated with the output.
      */
    var OutputValue: js.UndefOr[OutputValue] = js.undefined
  }
  
  trait Parameter extends js.Object {
    /**
      * The key associated with the parameter. If you don't specify a key and value for a particular parameter, AWS CloudFormation uses the default value that is specified in your template.
      */
    var ParameterKey: js.UndefOr[ParameterKey] = js.undefined
    /**
      * The input value associated with the parameter.
      */
    var ParameterValue: js.UndefOr[ParameterValue] = js.undefined
    /**
      * Read-only. The value that corresponds to a Systems Manager parameter key. This field is returned only for  SSM parameter types in the template.
      */
    var ResolvedValue: js.UndefOr[ParameterValue] = js.undefined
    /**
      * During a stack update, use the existing parameter value that the stack is using for a given parameter key. If you specify true, do not specify a parameter value.
      */
    var UsePreviousValue: js.UndefOr[UsePreviousValue] = js.undefined
  }
  
  trait ParameterConstraints extends js.Object {
    /**
      * A list of values that are permitted for a parameter.
      */
    var AllowedValues: js.UndefOr[AllowedValues] = js.undefined
  }
  
  trait ParameterDeclaration extends js.Object {
    /**
      * The default value of the parameter.
      */
    var DefaultValue: js.UndefOr[ParameterValue] = js.undefined
    /**
      * The description that is associate with the parameter.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Flag that indicates whether the parameter value is shown as plain text in logs and in the AWS Management Console.
      */
    var NoEcho: js.UndefOr[NoEcho] = js.undefined
    /**
      * The criteria that AWS CloudFormation uses to validate parameter values.
      */
    var ParameterConstraints: js.UndefOr[ParameterConstraints] = js.undefined
    /**
      * The name that is associated with the parameter.
      */
    var ParameterKey: js.UndefOr[ParameterKey] = js.undefined
    /**
      * The type of parameter.
      */
    var ParameterType: js.UndefOr[ParameterType] = js.undefined
  }
  
  trait PhysicalResourceIdContextKeyValuePair extends js.Object {
    /**
      * The resource context key.
      */
    var Key: Key
    /**
      * The resource context value.
      */
    var Value: Value
  }
  
  trait PropertyDifference extends js.Object {
    /**
      * The actual property value of the resource property.
      */
    var ActualValue: PropertyValue
    /**
      * The type of property difference.    ADD: A value has been added to a resource property that is an array or list data type.    REMOVE: The property has been removed from the current resource configuration.    NOT_EQUAL: The current property value differs from its expected value (as defined in the stack template and any values specified as template parameters).  
      */
    var DifferenceType: DifferenceType
    /**
      * The expected property value of the resource property, as defined in the stack template and any values specified as template parameters.
      */
    var ExpectedValue: PropertyValue
    /**
      * The fully-qualified path to the resource property.
      */
    var PropertyPath: PropertyPath
  }
  
  trait ResourceChange extends js.Object {
    /**
      * The action that AWS CloudFormation takes on the resource, such as Add (adds a new resource), Modify (changes a resource), or Remove (deletes a resource).
      */
    var Action: js.UndefOr[ChangeAction] = js.undefined
    /**
      * For the Modify action, a list of ResourceChangeDetail structures that describes the changes that AWS CloudFormation will make to the resource. 
      */
    var Details: js.UndefOr[ResourceChangeDetails] = js.undefined
    /**
      * The resource's logical ID, which is defined in the stack's template.
      */
    var LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    /**
      * The resource's physical ID (resource name). Resources that you are adding don't have physical IDs because they haven't been created.
      */
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    /**
      * For the Modify action, indicates whether AWS CloudFormation will replace the resource by creating a new one and deleting the old one. This value depends on the value of the RequiresRecreation property in the ResourceTargetDefinition structure. For example, if the RequiresRecreation field is Always and the Evaluation field is Static, Replacement is True. If the RequiresRecreation field is Always and the Evaluation field is Dynamic, Replacement is Conditionally. If you have multiple changes with different RequiresRecreation values, the Replacement value depends on the change with the most impact. A RequiresRecreation value of Always has the most impact, followed by Conditionally, and then Never.
      */
    var Replacement: js.UndefOr[Replacement] = js.undefined
    /**
      * The type of AWS CloudFormation resource, such as AWS::S3::Bucket.
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * For the Modify action, indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
      */
    var Scope: js.UndefOr[Scope] = js.undefined
  }
  
  trait ResourceChangeDetail extends js.Object {
    /**
      * The identity of the entity that triggered this change. This entity is a member of the group that is specified by the ChangeSource field. For example, if you modified the value of the KeyPairName parameter, the CausingEntity is the name of the parameter (KeyPairName). If the ChangeSource value is DirectModification, no value is given for CausingEntity.
      */
    var CausingEntity: js.UndefOr[CausingEntity] = js.undefined
    /**
      * The group to which the CausingEntity value belongs. There are five entity groups:    ResourceReference entities are Ref intrinsic functions that refer to resources in the template, such as { "Ref" : "MyEC2InstanceResource" }.    ParameterReference entities are Ref intrinsic functions that get template parameter values, such as { "Ref" : "MyPasswordParameter" }.    ResourceAttribute entities are Fn::GetAtt intrinsic functions that get resource attribute values, such as { "Fn::GetAtt" : [ "MyEC2InstanceResource", "PublicDnsName" ] }.    DirectModification entities are changes that are made directly to the template.    Automatic entities are AWS::CloudFormation::Stack resource types, which are also known as nested stacks. If you made no changes to the AWS::CloudFormation::Stack resource, AWS CloudFormation sets the ChangeSource to Automatic because the nested stack's template might have changed. Changes to a nested stack's template aren't visible to AWS CloudFormation until you run an update on the parent stack.  
      */
    var ChangeSource: js.UndefOr[ChangeSource] = js.undefined
    /**
      * Indicates whether AWS CloudFormation can determine the target value, and whether the target value will change before you execute a change set. For Static evaluations, AWS CloudFormation can determine that the target value will change, and its value. For example, if you directly modify the InstanceType property of an EC2 instance, AWS CloudFormation knows that this property value will change, and its value, so this is a Static evaluation. For Dynamic evaluations, cannot determine the target value because it depends on the result of an intrinsic function, such as a Ref or Fn::GetAtt intrinsic function, when the stack is updated. For example, if your template includes a reference to a resource that is conditionally recreated, the value of the reference (the physical ID of the resource) might change, depending on if the resource is recreated. If the resource is recreated, it will have a new physical ID, so all references to that resource will also be updated.
      */
    var Evaluation: js.UndefOr[EvaluationType] = js.undefined
    /**
      * A ResourceTargetDefinition structure that describes the field that AWS CloudFormation will change and whether the resource will be recreated.
      */
    var Target: js.UndefOr[ResourceTargetDefinition] = js.undefined
  }
  
  trait ResourceTargetDefinition extends js.Object {
    /**
      * Indicates which resource attribute is triggering this update, such as a change in the resource attribute's Metadata, Properties, or Tags.
      */
    var Attribute: js.UndefOr[ResourceAttribute] = js.undefined
    /**
      * If the Attribute value is Properties, the name of the property. For all other attributes, the value is null.
      */
    var Name: js.UndefOr[PropertyName] = js.undefined
    /**
      * If the Attribute value is Properties, indicates whether a change to this property causes the resource to be recreated. The value can be Never, Always, or Conditionally. To determine the conditions for a Conditionally recreation, see the update behavior for that property in the AWS CloudFormation User Guide.
      */
    var RequiresRecreation: js.UndefOr[RequiresRecreation] = js.undefined
  }
  
  trait RollbackConfiguration extends js.Object {
    /**
      * The amount of time, in minutes, during which CloudFormation should monitor all the rollback triggers after the stack creation or update operation deploys all necessary resources. The default is 0 minutes. If you specify a monitoring period but do not specify any rollback triggers, CloudFormation still waits the specified period of time before cleaning up old resources after update operations. You can use this monitoring period to perform any manual stack validation desired, and manually cancel the stack creation or update (using CancelUpdateStack, for example) as necessary. If you specify 0 for this parameter, CloudFormation still monitors the specified rollback triggers during stack creation and update operations. Then, for update operations, it begins disposing of old resources immediately once the operation completes.
      */
    var MonitoringTimeInMinutes: js.UndefOr[MonitoringTimeInMinutes] = js.undefined
    /**
      * The triggers to monitor during stack creation or update actions.  By default, AWS CloudFormation saves the rollback triggers specified for a stack and applies them to any subsequent update operations for the stack, unless you specify otherwise. If you do specify rollback triggers for this parameter, those triggers replace any list of triggers previously specified for the stack. This means:   To use the rollback triggers previously specified for this stack, if any, don't specify this parameter.   To specify new or updated rollback triggers, you must specify all the triggers that you want used for this stack, even triggers you've specifed before (for example, when creating the stack or during a previous stack update). Any triggers that you don't include in the updated list of triggers are no longer applied to the stack.   To remove all currently specified triggers, specify an empty list for this parameter.   If a specified trigger is missing, the entire stack operation fails and is rolled back. 
      */
    var RollbackTriggers: js.UndefOr[RollbackTriggers] = js.undefined
  }
  
  trait RollbackTrigger extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the rollback trigger. If a specified trigger is missing, the entire stack operation fails and is rolled back. 
      */
    var Arn: Arn
    /**
      * The resource type of the rollback trigger. Currently, AWS::CloudWatch::Alarm is the only supported resource type.
      */
    var Type: Type
  }
  
  trait SetStackPolicyInput extends js.Object {
    /**
      * The name or unique stack ID that you want to associate a policy with.
      */
    var StackName: StackName
    /**
      * Structure containing the stack policy body. For more information, go to  Prevent Updates to Stack Resources in the AWS CloudFormation User Guide. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
      */
    var StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined
    /**
      * Location of a file containing the stack policy. The URL must point to a policy (maximum size: 16 KB) located in an S3 bucket in the same region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both.
      */
    var StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined
  }
  
  trait SignalResourceInput extends js.Object {
    /**
      * The logical ID of the resource that you want to signal. The logical ID is the name of the resource that given in the template.
      */
    var LogicalResourceId: LogicalResourceId
    /**
      * The stack name or unique stack ID that includes the resource that you want to signal.
      */
    var StackName: StackNameOrId
    /**
      * The status of the signal, which is either success or failure. A failure signal causes AWS CloudFormation to immediately fail the stack creation or update.
      */
    var Status: ResourceSignalStatus
    /**
      * A unique ID of the signal. When you signal Amazon EC2 instances or Auto Scaling groups, specify the instance ID that you are signaling as the unique ID. If you send multiple signals to a single resource (such as signaling a wait condition), each signal requires a different unique ID.
      */
    var UniqueId: ResourceSignalUniqueId
  }
  
  trait Stack extends js.Object {
    /**
      * The capabilities allowed in the stack.
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * The unique ID of the change set.
      */
    var ChangeSetId: js.UndefOr[ChangeSetId] = js.undefined
    /**
      * The time at which the stack was created.
      */
    var CreationTime: CreationTime
    /**
      * The time the stack was deleted.
      */
    var DeletionTime: js.UndefOr[DeletionTime] = js.undefined
    /**
      * A user-defined description associated with the stack.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Boolean to enable or disable rollback on stack creation failures:    true: disable rollback    false: enable rollback  
      */
    var DisableRollback: js.UndefOr[DisableRollback] = js.undefined
    /**
      * Information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
      */
    var DriftInformation: js.UndefOr[StackDriftInformation] = js.undefined
    /**
      * Whether termination protection is enabled for the stack.  For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide.
      */
    var EnableTerminationProtection: js.UndefOr[EnableTerminationProtection] = js.undefined
    /**
      * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
      */
    var LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined
    /**
      * SNS topic ARNs to which stack related events are published.
      */
    var NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined
    /**
      * A list of output structures.
      */
    var Outputs: js.UndefOr[Outputs] = js.undefined
    /**
      * A list of Parameter structures.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
      */
    var ParentId: js.UndefOr[StackId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with the stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your behalf.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
      */
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined
    /**
      * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
      */
    var RootId: js.UndefOr[StackId] = js.undefined
    /**
      * Unique identifier of the stack.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name associated with the stack.
      */
    var StackName: StackName
    /**
      * Current status of the stack.
      */
    var StackStatus: StackStatus
    /**
      * Success/failure message associated with the stack status.
      */
    var StackStatusReason: js.UndefOr[StackStatusReason] = js.undefined
    /**
      * A list of Tags that specify information about the stack.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The amount of time within which stack creation should complete.
      */
    var TimeoutInMinutes: js.UndefOr[TimeoutMinutes] = js.undefined
  }
  
  trait StackDriftInformation extends js.Object {
    /**
      * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources that support drift detection.
      */
    var LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * Status of the stack's actual configuration compared to its expected template configuration.     DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
      */
    var StackDriftStatus: StackDriftStatus
  }
  
  trait StackDriftInformationSummary extends js.Object {
    /**
      * Most recent time when a drift detection operation was initiated on the stack, or any of its individual resources that support drift detection.
      */
    var LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * Status of the stack's actual configuration compared to its expected template configuration.     DRIFTED: The stack differs from its expected template configuration. A stack is considered to have drifted if one or more of its resources have drifted.    NOT_CHECKED: AWS CloudFormation has not checked if the stack differs from its expected template configuration.    IN_SYNC: The stack's actual configuration matches its expected template configuration.    UNKNOWN: This value is reserved for future use.  
      */
    var StackDriftStatus: StackDriftStatus
  }
  
  trait StackEvent extends js.Object {
    /**
      * The token passed to the operation that generated this event. All events triggered by a given stack operation are assigned the same client request token, which you can use to track operations. For example, if you execute a CreateStack operation with the token token1, then all the StackEvents generated by that operation will have ClientRequestToken set as token1. In the console, stack operations display the client request token on the Events tab. Stack operations that are initiated from the console use the token format Console-StackOperation-ID, which helps you easily identify the stack operation . For example, if you create a stack using the console, each stack event would be assigned the same token in the following format: Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The unique ID of this event.
      */
    var EventId: EventId
    /**
      * The logical name of the resource specified in the template.
      */
    var LogicalResourceId: js.UndefOr[LogicalResourceId] = js.undefined
    /**
      * The name or unique identifier associated with the physical instance of the resource.
      */
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    /**
      * BLOB of the properties used to create the resource.
      */
    var ResourceProperties: js.UndefOr[ResourceProperties] = js.undefined
    /**
      * Current status of the resource.
      */
    var ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined
    /**
      * Success/failure message associated with the resource.
      */
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined
    /**
      * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
      */
    var ResourceType: js.UndefOr[ResourceType] = js.undefined
    /**
      * The unique ID name of the instance of the stack.
      */
    var StackId: StackId
    /**
      * The name associated with a stack.
      */
    var StackName: StackName
    /**
      * Time the status was updated.
      */
    var Timestamp: Timestamp
  }
  
  trait StackInstance extends js.Object {
    /**
      * The name of the AWS account that the stack instance is associated with.
      */
    var Account: js.UndefOr[Account] = js.undefined
    /**
      * A list of parameters from the stack set template whose values have been overridden in this stack instance.
      */
    var ParameterOverrides: js.UndefOr[Parameters] = js.undefined
    /**
      * The name of the AWS region that the stack instance is associated with.
      */
    var Region: js.UndefOr[Region] = js.undefined
    /**
      * The ID of the stack instance.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name or unique ID of the stack set that the stack instance is associated with.
      */
    var StackSetId: js.UndefOr[StackSetId] = js.undefined
    /**
      * The status of the stack instance, in terms of its synchronization with its associated stack set.    INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.    OUTDATED: The stack isn't currently up to date with the stack set because:   The associated stack failed during a CreateStackSet or UpdateStackSet operation.    The stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.       CURRENT: The stack is currently up to date with the stack set.  
      */
    var Status: js.UndefOr[StackInstanceStatus] = js.undefined
    /**
      * The explanation for the specific status code that is assigned to this stack instance.
      */
    var StatusReason: js.UndefOr[Reason] = js.undefined
  }
  
  trait StackInstanceSummary extends js.Object {
    /**
      * The name of the AWS account that the stack instance is associated with.
      */
    var Account: js.UndefOr[Account] = js.undefined
    /**
      * The name of the AWS region that the stack instance is associated with.
      */
    var Region: js.UndefOr[Region] = js.undefined
    /**
      * The ID of the stack instance.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name or unique ID of the stack set that the stack instance is associated with.
      */
    var StackSetId: js.UndefOr[StackSetId] = js.undefined
    /**
      * The status of the stack instance, in terms of its synchronization with its associated stack set.    INOPERABLE: A DeleteStackInstances operation has failed and left the stack in an unstable state. Stacks in this state are excluded from further UpdateStackSet operations. You might need to perform a DeleteStackInstances operation, with RetainStacks set to true, to delete the stack instance, and then delete the stack manually.    OUTDATED: The stack isn't currently up to date with the stack set because:   The associated stack failed during a CreateStackSet or UpdateStackSet operation.    The stack was part of a CreateStackSet or UpdateStackSet operation that failed or was stopped before the stack was created or updated.       CURRENT: The stack is currently up to date with the stack set.  
      */
    var Status: js.UndefOr[StackInstanceStatus] = js.undefined
    /**
      * The explanation for the specific status code assigned to this stack instance.
      */
    var StatusReason: js.UndefOr[Reason] = js.undefined
  }
  
  trait StackResource extends js.Object {
    /**
      * User defined description associated with the resource.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
      */
    var DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.undefined
    /**
      * The logical name of the resource specified in the template.
      */
    var LogicalResourceId: LogicalResourceId
    /**
      * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation.
      */
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    /**
      * Current status of the resource.
      */
    var ResourceStatus: ResourceStatus
    /**
      * Success/failure message associated with the resource.
      */
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined
    /**
      * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
      */
    var ResourceType: ResourceType
    /**
      * Unique identifier of the stack.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name associated with the stack.
      */
    var StackName: js.UndefOr[StackName] = js.undefined
    /**
      * Time the status was updated.
      */
    var Timestamp: Timestamp
  }
  
  trait StackResourceDetail extends js.Object {
    /**
      * User defined description associated with the resource.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
      */
    var DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.undefined
    /**
      * Time the status was updated.
      */
    var LastUpdatedTimestamp: Timestamp
    /**
      * The logical name of the resource specified in the template.
      */
    var LogicalResourceId: LogicalResourceId
    /**
      * The content of the Metadata attribute declared for the resource. For more information, see Metadata Attribute in the AWS CloudFormation User Guide.
      */
    var Metadata: js.UndefOr[Metadata] = js.undefined
    /**
      * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation.
      */
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    /**
      * Current status of the resource.
      */
    var ResourceStatus: ResourceStatus
    /**
      * Success/failure message associated with the resource.
      */
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined
    /**
      * Type of resource. ((For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
      */
    var ResourceType: ResourceType
    /**
      * Unique identifier of the stack.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name associated with the stack.
      */
    var StackName: js.UndefOr[StackName] = js.undefined
  }
  
  trait StackResourceDrift extends js.Object {
    /**
      * A JSON structure containing the actual property values of the stack resource. For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
      */
    var ActualProperties: js.UndefOr[Properties] = js.undefined
    /**
      * A JSON structure containing the expected property values of the stack resource, as defined in the stack template and any values specified as template parameters.  For resources whose StackResourceDriftStatus is DELETED, this structure will not be present. 
      */
    var ExpectedProperties: js.UndefOr[Properties] = js.undefined
    /**
      * The logical name of the resource specified in the template.
      */
    var LogicalResourceId: LogicalResourceId
    /**
      * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation. 
      */
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    /**
      * Context information that enables AWS CloudFormation to uniquely identify a resource. AWS CloudFormation uses context key-value pairs in cases where a resource's logical and physical IDs are not enough to uniquely identify that resource. Each context key-value pair specifies a unique resource that contains the targeted resource.
      */
    var PhysicalResourceIdContext: js.UndefOr[PhysicalResourceIdContext] = js.undefined
    /**
      * A collection of the resource properties whose actual values differ from their expected values. These will be present only for resources whose StackResourceDriftStatus is MODIFIED. 
      */
    var PropertyDifferences: js.UndefOr[PropertyDifferences] = js.undefined
    /**
      * The type of the resource.
      */
    var ResourceType: ResourceType
    /**
      * The ID of the stack.
      */
    var StackId: StackId
    /**
      * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected template configuration because the resource has been deleted.    MODIFIED: One or more resource properties differ from their expected values (as defined in the stack template and any values specified as template parameters).    IN_SYNC: The resources's actual configuration matches its expected template configuration.    NOT_CHECKED: AWS CloudFormation does not currently return this value.  
      */
    var StackResourceDriftStatus: StackResourceDriftStatus
    /**
      * Time at which AWS CloudFormation performed drift detection on the stack resource.
      */
    var Timestamp: Timestamp
  }
  
  trait StackResourceDriftInformation extends js.Object {
    /**
      * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
      */
    var LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected configuration in that it has been deleted.    MODIFIED: The resource differs from its expected configuration.    NOT_CHECKED: AWS CloudFormation has not checked if the resource differs from its expected configuration. Any resources that do not currently support drift detection have a status of NOT_CHECKED. For more information, see Resources that Support Drift Detection.     IN_SYNC: The resources's actual configuration matches its expected configuration.  
      */
    var StackResourceDriftStatus: StackResourceDriftStatus
  }
  
  trait StackResourceDriftInformationSummary extends js.Object {
    /**
      * When AWS CloudFormation last checked if the resource had drifted from its expected configuration.
      */
    var LastCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * Status of the resource's actual configuration compared to its expected configuration    DELETED: The resource differs from its expected configuration in that it has been deleted.    MODIFIED: The resource differs from its expected configuration.    NOT_CHECKED: AWS CloudFormation has not checked if the resource differs from its expected configuration. Any resources that do not currently support drift detection have a status of NOT_CHECKED. For more information, see Resources that Support Drift Detection. If you performed an ContinueUpdateRollback operation on a stack, any resources included in ResourcesToSkip will also have a status of NOT_CHECKED. For more information on skipping resources during rollback operations, see Continue Rolling Back an Update in the AWS CloudFormation User Guide.    IN_SYNC: The resources's actual configuration matches its expected configuration.  
      */
    var StackResourceDriftStatus: StackResourceDriftStatus
  }
  
  trait StackResourceSummary extends js.Object {
    /**
      * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
      */
    var DriftInformation: js.UndefOr[StackResourceDriftInformationSummary] = js.undefined
    /**
      * Time the status was updated.
      */
    var LastUpdatedTimestamp: Timestamp
    /**
      * The logical name of the resource specified in the template.
      */
    var LogicalResourceId: LogicalResourceId
    /**
      * The name or unique identifier that corresponds to a physical instance ID of the resource.
      */
    var PhysicalResourceId: js.UndefOr[PhysicalResourceId] = js.undefined
    /**
      * Current status of the resource.
      */
    var ResourceStatus: ResourceStatus
    /**
      * Success/failure message associated with the resource.
      */
    var ResourceStatusReason: js.UndefOr[ResourceStatusReason] = js.undefined
    /**
      * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
      */
    var ResourceType: ResourceType
  }
  
  trait StackSet extends js.Object {
    /**
      * The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set. Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Prerequisites: Granting Permissions for Stack Set Operations in the AWS CloudFormation User Guide.
      */
    var AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM) users. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates. 
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * A description of the stack set that you specify when the stack set is created or updated.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the IAM execution role used to create or update the stack set.  Use customized execution roles to control which stack resources users and groups can include in their stack sets. 
      */
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined
    /**
      * A list of input parameters for a stack set.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The Amazon Resource Number (ARN) of the stack set.
      */
    var StackSetARN: js.UndefOr[StackSetARN] = js.undefined
    /**
      * The ID of the stack set.
      */
    var StackSetId: js.UndefOr[StackSetId] = js.undefined
    /**
      * The name that's associated with the stack set.
      */
    var StackSetName: js.UndefOr[StackSetName] = js.undefined
    /**
      * The status of the stack set.
      */
    var Status: js.UndefOr[StackSetStatus] = js.undefined
    /**
      * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The structure that contains the body of the template that was used to create or update the stack set.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
  }
  
  trait StackSetOperation extends js.Object {
    /**
      * The type of stack set operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack set instances that are associated with the specified stack set. Update operations affect both the stack set itself, as well as all associated stack set instances.
      */
    var Action: js.UndefOr[StackSetOperationAction] = js.undefined
    /**
      * The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation.  Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Define Permissions for Multiple Administrators in the AWS CloudFormation User Guide.
      */
    var AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested regions, before actually creating the first stacks.
      */
    var CreationTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The time at which the stack set operation ended, across all accounts and regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or region.
      */
    var EndTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The name of the IAM execution role used to create or update the stack set. Use customized execution roles to control which stack resources users and groups can include in their stack sets. 
      */
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined
    /**
      * The unique ID of a stack set operation.
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The preferences for how AWS CloudFormation performs this stack set operation.
      */
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
    /**
      * For stack set operations of action type DELETE, specifies whether to remove the stack instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an existing, saved stack to a new stack set.
      */
    var RetainStacks: js.UndefOr[RetainStacksNullable] = js.undefined
    /**
      * The ID of the stack set.
      */
    var StackSetId: js.UndefOr[StackSetId] = js.undefined
    /**
      * The status of the operation.     FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each region during stack create and update operations. If the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and AWS CloudFormation cancels the operation in any remaining regions.    RUNNING: The operation is currently being performed.    STOPPED: The user has cancelled the operation.    STOPPING: The operation is in the process of stopping, at user request.     SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
      */
    var Status: js.UndefOr[StackSetOperationStatus] = js.undefined
  }
  
  trait StackSetOperationPreferences extends js.Object {
    /**
      * The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the operation in any subsequent regions. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage (but not both).
      */
    var FailureToleranceCount: js.UndefOr[FailureToleranceCount] = js.undefined
    /**
      * The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage, but not both.
      */
    var FailureTolerancePercentage: js.UndefOr[FailureTolerancePercentage] = js.undefined
    /**
      * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of FailureToleranceCount—MaxConcurrentCount is at most one more than the FailureToleranceCount . Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
      */
    var MaxConcurrentCount: js.UndefOr[MaxConcurrentCount] = js.undefined
    /**
      * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, CloudFormation sets the number as one instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
      */
    var MaxConcurrentPercentage: js.UndefOr[MaxConcurrentPercentage] = js.undefined
    /**
      * The order of the regions in where you want to perform the stack operation.
      */
    var RegionOrder: js.UndefOr[RegionList] = js.undefined
  }
  
  trait StackSetOperationResultSummary extends js.Object {
    /**
      * The name of the AWS account for this operation result.
      */
    var Account: js.UndefOr[Account] = js.undefined
    /**
      * The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with stack set operations in an account
      */
    var AccountGateResult: js.UndefOr[AccountGateResult] = js.undefined
    /**
      * The name of the AWS region for this operation result.
      */
    var Region: js.UndefOr[Region] = js.undefined
    /**
      * The result status of the stack set operation for the given account in the given region.    CANCELLED: The operation in the specified account and region has been cancelled. This is either because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation has been exceeded.    FAILED: The operation in the specified account and region failed.  If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set operation as a whole might be exceeded.     RUNNING: The operation in the specified account and region is currently in progress.    PENDING: The operation in the specified account and region has yet to start.     SUCCEEDED: The operation in the specified account and region completed successfully.  
      */
    var Status: js.UndefOr[StackSetOperationResultStatus] = js.undefined
    /**
      * The reason for the assigned result status.
      */
    var StatusReason: js.UndefOr[Reason] = js.undefined
  }
  
  trait StackSetOperationSummary extends js.Object {
    /**
      * The type of operation: CREATE, UPDATE, or DELETE. Create and delete operations affect only the specified stack instances that are associated with the specified stack set. Update operations affect both the stack set itself as well as all associated stack set instances.
      */
    var Action: js.UndefOr[StackSetOperationAction] = js.undefined
    /**
      * The time at which the operation was initiated. Note that the creation times for the stack set operation might differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the requested regions, before actually creating the first stacks.
      */
    var CreationTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The time at which the stack set operation ended, across all accounts and regions specified. Note that this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or region.
      */
    var EndTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The unique ID of the stack set operation.
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The overall status of the operation.    FAILED: The operation exceeded the specified failure tolerance. The failure tolerance value that you've set for an operation is applied for each region during stack create and update operations. If the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set to FAILED. This in turn sets the status of the operation as a whole to FAILED, and AWS CloudFormation cancels the operation in any remaining regions.    RUNNING: The operation is currently being performed.    STOPPED: The user has cancelled the operation.    STOPPING: The operation is in the process of stopping, at user request.     SUCCEEDED: The operation completed creating or updating all the specified stacks without exceeding the failure tolerance for the operation.  
      */
    var Status: js.UndefOr[StackSetOperationStatus] = js.undefined
  }
  
  trait StackSetSummary extends js.Object {
    /**
      * A description of the stack set that you specify when the stack set is created or updated.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The ID of the stack set.
      */
    var StackSetId: js.UndefOr[StackSetId] = js.undefined
    /**
      * The name of the stack set.
      */
    var StackSetName: js.UndefOr[StackSetName] = js.undefined
    /**
      * The status of the stack set.
      */
    var Status: js.UndefOr[StackSetStatus] = js.undefined
  }
  
  trait StackSummary extends js.Object {
    /**
      * The time the stack was created.
      */
    var CreationTime: CreationTime
    /**
      * The time the stack was deleted.
      */
    var DeletionTime: js.UndefOr[DeletionTime] = js.undefined
    /**
      * Summarizes information on whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
      */
    var DriftInformation: js.UndefOr[StackDriftInformationSummary] = js.undefined
    /**
      * The time the stack was last updated. This field will only be returned if the stack has been updated at least once.
      */
    var LastUpdatedTime: js.UndefOr[LastUpdatedTime] = js.undefined
    /**
      * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this stack. For the first level of nested stacks, the root stack is also the parent stack. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
      */
    var ParentId: js.UndefOr[StackId] = js.undefined
    /**
      * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to which the nested stack ultimately belongs. For more information, see Working with Nested Stacks in the AWS CloudFormation User Guide.
      */
    var RootId: js.UndefOr[StackId] = js.undefined
    /**
      * Unique stack identifier.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
    /**
      * The name associated with the stack.
      */
    var StackName: StackName
    /**
      * The current status of the stack.
      */
    var StackStatus: StackStatus
    /**
      * Success/Failure message associated with the stack status.
      */
    var StackStatusReason: js.UndefOr[StackStatusReason] = js.undefined
    /**
      * The template description of the template used to create the stack.
      */
    var TemplateDescription: js.UndefOr[TemplateDescription] = js.undefined
  }
  
  trait StopStackSetOperationInput extends js.Object {
    /**
      * The ID of the stack operation. 
      */
    var OperationId: ClientRequestToken
    /**
      * The name or unique ID of the stack set that you want to stop the operation for.
      */
    var StackSetName: StackSetName
  }
  
  trait StopStackSetOperationOutput extends js.Object
  
  trait Tag extends js.Object {
    /**
      *  Required. A string used to identify this tag. You can specify a maximum of 128 characters for a tag key. Tags owned by Amazon Web Services (AWS) have the reserved prefix: aws:.
      */
    var Key: TagKey
    /**
      *  Required. A string containing the value for this tag. You can specify a maximum of 256 characters for a tag value.
      */
    var Value: TagValue
  }
  
  trait TemplateParameter extends js.Object {
    /**
      * The default value associated with the parameter.
      */
    var DefaultValue: js.UndefOr[ParameterValue] = js.undefined
    /**
      * User defined description associated with the parameter.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Flag indicating whether the parameter should be displayed as plain text in logs and UIs.
      */
    var NoEcho: js.UndefOr[NoEcho] = js.undefined
    /**
      * The name associated with the parameter.
      */
    var ParameterKey: js.UndefOr[ParameterKey] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and reverts to the previous stack configuration.  You can cancel only stacks that are in the UPDATE_IN_PROGRESS state. 
      */
    def cancelUpdateStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelUpdateStack(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels an update on the specified stack. If the call completes successfully, the stack rolls back the update and reverts to the previous stack configuration.  You can cancel only stacks that are in the UPDATE_IN_PROGRESS state. 
      */
    def cancelUpdateStack(params: CancelUpdateStackInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelUpdateStack(
      params: CancelUpdateStackInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again. A stack goes into the UPDATE_ROLLBACK_FAILED state when AWS CloudFormation cannot roll back all changes after a failed stack update. For example, you might have a stack that is rolling back to an old database instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update rollback to fail.
      */
    def continueUpdateRollback(): awsDashSdkLib.libRequestMod.Request[ContinueUpdateRollbackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def continueUpdateRollback(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ContinueUpdateRollbackOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ContinueUpdateRollbackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * For a specified stack that is in the UPDATE_ROLLBACK_FAILED state, continues rolling it back to the UPDATE_ROLLBACK_COMPLETE state. Depending on the cause of the failure, you can manually  fix the error and continue the rollback. By continuing the rollback, you can return your stack to a working state (the UPDATE_ROLLBACK_COMPLETE state), and then try to update the stack again. A stack goes into the UPDATE_ROLLBACK_FAILED state when AWS CloudFormation cannot roll back all changes after a failed stack update. For example, you might have a stack that is rolling back to an old database instance that was deleted outside of AWS CloudFormation. Because AWS CloudFormation doesn't know the database was deleted, it assumes that the database instance still exists and attempts to roll back to it, causing the update rollback to fail.
      */
    def continueUpdateRollback(params: ContinueUpdateRollbackInput): awsDashSdkLib.libRequestMod.Request[ContinueUpdateRollbackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def continueUpdateRollback(
      params: ContinueUpdateRollbackInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ContinueUpdateRollbackOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ContinueUpdateRollbackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a list of changes that will be applied to a stack so that you can review the changes before executing them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the information that you submit in the change set and lists the differences. Use change sets to understand which resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before you create or update a stack. To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify CREATE. To create a change set for an existing stack, specify UPDATE for the ChangeSetType parameter. After the CreateChangeSet call successfully completes, AWS CloudFormation starts creating the change set. To check the status of the change set or to review it, use the DescribeChangeSet action. When you are satisfied with the changes the change set will make, execute the change set by using the ExecuteChangeSet action. AWS CloudFormation doesn't make changes until you execute the change set.
      */
    def createChangeSet(): awsDashSdkLib.libRequestMod.Request[CreateChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createChangeSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a list of changes that will be applied to a stack so that you can review the changes before executing them. You can create a change set for a stack that doesn't exist or an existing stack. If you create a change set for a stack that doesn't exist, the change set shows all of the resources that AWS CloudFormation will create. If you create a change set for an existing stack, AWS CloudFormation compares the stack's information with the information that you submit in the change set and lists the differences. Use change sets to understand which resources AWS CloudFormation will create or change, and how it will change resources in an existing stack, before you create or update a stack. To create a change set for a stack that doesn't exist, for the ChangeSetType parameter, specify CREATE. To create a change set for an existing stack, specify UPDATE for the ChangeSetType parameter. After the CreateChangeSet call successfully completes, AWS CloudFormation starts creating the change set. To check the status of the change set or to review it, use the DescribeChangeSet action. When you are satisfied with the changes the change set will make, execute the change set by using the ExecuteChangeSet action. AWS CloudFormation doesn't make changes until you execute the change set.
      */
    def createChangeSet(params: CreateChangeSetInput): awsDashSdkLib.libRequestMod.Request[CreateChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createChangeSet(
      params: CreateChangeSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts. You can check the status of the stack via the DescribeStacks API.
      */
    def createStack(): awsDashSdkLib.libRequestMod.Request[CreateStackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a stack as specified in the template. After the call completes successfully, the stack creation starts. You can check the status of the stack via the DescribeStacks API.
      */
    def createStack(params: CreateStackInput): awsDashSdkLib.libRequestMod.Request[CreateStackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStack(
      params: CreateStackInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region. Accounts and Regions are required parameters—you must specify at least one account and one region. 
      */
    def createStackInstances(): awsDashSdkLib.libRequestMod.Request[CreateStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStackInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region. Accounts and Regions are required parameters—you must specify at least one account and one region. 
      */
    def createStackInstances(params: CreateStackInstancesInput): awsDashSdkLib.libRequestMod.Request[CreateStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStackInstances(
      params: CreateStackInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a stack set.
      */
    def createStackSet(): awsDashSdkLib.libRequestMod.Request[CreateStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStackSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a stack set.
      */
    def createStackSet(params: CreateStackSetInput): awsDashSdkLib.libRequestMod.Request[CreateStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createStackSet(
      params: CreateStackSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateStackSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set. If the call successfully completes, AWS CloudFormation successfully deleted the change set.
      */
    def deleteChangeSet(): awsDashSdkLib.libRequestMod.Request[DeleteChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChangeSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the specified change set. Deleting change sets ensures that no one executes the wrong change set. If the call successfully completes, AWS CloudFormation successfully deleted the change set.
      */
    def deleteChangeSet(params: DeleteChangeSetInput): awsDashSdkLib.libRequestMod.Request[DeleteChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteChangeSet(
      params: DeleteChangeSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not show up in the DescribeStacks API if the deletion has been completed successfully.
      */
    def deleteStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStack(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified stack. Once the call completes successfully, stack deletion starts. Deleted stacks do not show up in the DescribeStacks API if the deletion has been completed successfully.
      */
    def deleteStack(params: DeleteStackInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStack(
      params: DeleteStackInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes stack instances for the specified accounts, in the specified regions. 
      */
    def deleteStackInstances(): awsDashSdkLib.libRequestMod.Request[DeleteStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStackInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStackInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes stack instances for the specified accounts, in the specified regions. 
      */
    def deleteStackInstances(params: DeleteStackInstancesInput): awsDashSdkLib.libRequestMod.Request[DeleteStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStackInstances(
      params: DeleteStackInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStackInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For more information about how to do this, see DeleteStackInstances. 
      */
    def deleteStackSet(): awsDashSdkLib.libRequestMod.Request[DeleteStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStackSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStackSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a stack set. Before you can delete a stack set, all of its member stack instances must be deleted. For more information about how to do this, see DeleteStackInstances. 
      */
    def deleteStackSet(params: DeleteStackSetInput): awsDashSdkLib.libRequestMod.Request[DeleteStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteStackSet(
      params: DeleteStackSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteStackSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in your account.
      */
    def describeAccountLimits(): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves your account's AWS CloudFormation limits, such as the maximum number of stacks that you can create in your account.
      */
    def describeAccountLimits(params: DescribeAccountLimitsInput): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAccountLimits(
      params: DescribeAccountLimitsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAccountLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAccountLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the change set. For more information, see Updating Stacks Using Change Sets in the AWS CloudFormation User Guide.
      */
    def describeChangeSet(): awsDashSdkLib.libRequestMod.Request[DescribeChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChangeSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the inputs for the change set and a list of changes that AWS CloudFormation will make if you execute the change set. For more information, see Updating Stacks Using Change Sets in the AWS CloudFormation User Guide.
      */
    def describeChangeSet(params: DescribeChangeSetInput): awsDashSdkLib.libRequestMod.Request[DescribeChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeChangeSet(
      params: DescribeChangeSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted. For more information on stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns a StackDriftDetectionId you can use to monitor the progress of the operation using DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources.
      */
    def describeStackDriftDetectionStatus(): awsDashSdkLib.libRequestMod.Request[DescribeStackDriftDetectionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackDriftDetectionStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackDriftDetectionStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackDriftDetectionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a stack drift detection operation. A stack drift detection operation detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. A stack is considered to have drifted if one or more of its resources have drifted. For more information on stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to initiate a stack drift detection operation. DetectStackDrift returns a StackDriftDetectionId you can use to monitor the progress of the operation using DescribeStackDriftDetectionStatus. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources.
      */
    def describeStackDriftDetectionStatus(params: DescribeStackDriftDetectionStatusInput): awsDashSdkLib.libRequestMod.Request[DescribeStackDriftDetectionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackDriftDetectionStatus(
      params: DescribeStackDriftDetectionStatusInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackDriftDetectionStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackDriftDetectionStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns all stack related events for a specified stack in reverse chronological order. For more information about a stack's event history, go to Stacks in the AWS CloudFormation User Guide.  You can list events for stacks that have failed to create or have been deleted by specifying the unique stack identifier (stack ID). 
      */
    def describeStackEvents(): awsDashSdkLib.libRequestMod.Request[DescribeStackEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackEventsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns all stack related events for a specified stack in reverse chronological order. For more information about a stack's event history, go to Stacks in the AWS CloudFormation User Guide.  You can list events for stacks that have failed to create or have been deleted by specifying the unique stack identifier (stack ID). 
      */
    def describeStackEvents(params: DescribeStackEventsInput): awsDashSdkLib.libRequestMod.Request[DescribeStackEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackEvents(
      params: DescribeStackEventsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackEventsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the stack instance that's associated with the specified stack set, AWS account, and region. For a list of stack instances that are associated with a specific stack set, use ListStackInstances.
      */
    def describeStackInstance(): awsDashSdkLib.libRequestMod.Request[DescribeStackInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackInstance(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackInstanceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the stack instance that's associated with the specified stack set, AWS account, and region. For a list of stack instances that are associated with a specific stack set, use ListStackInstances.
      */
    def describeStackInstance(params: DescribeStackInstanceInput): awsDashSdkLib.libRequestMod.Request[DescribeStackInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackInstance(
      params: DescribeStackInstanceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackInstanceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackInstanceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of the specified resource in the specified stack. For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been deleted.
      */
    def describeStackResource(): awsDashSdkLib.libRequestMod.Request[DescribeStackResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a description of the specified resource in the specified stack. For deleted stacks, DescribeStackResource returns resource information for up to 90 days after the stack has been deleted.
      */
    def describeStackResource(params: DescribeStackResourceInput): awsDashSdkLib.libRequestMod.Request[DescribeStackResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackResource(
      params: DescribeStackResourceInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackResourceOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where AWS CloudFormation detects configuration drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not currently support drift detection are not checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all supported resources for a given stack.
      */
    def describeStackResourceDrifts(): awsDashSdkLib.libRequestMod.Request[DescribeStackResourceDriftsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackResourceDrifts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackResourceDriftsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackResourceDriftsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns drift information for the resources that have been checked for drift in the specified stack. This includes actual and expected configuration values for resources where AWS CloudFormation detects configuration drift. For a given stack, there will be one StackResourceDrift for each stack resource that has been checked for drift. Resources that have not yet been checked for drift are not included. Resources that do not currently support drift detection are not checked, and so not included. For a list of resources that support drift detection, see Resources that Support Drift Detection. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all supported resources for a given stack.
      */
    def describeStackResourceDrifts(params: DescribeStackResourceDriftsInput): awsDashSdkLib.libRequestMod.Request[DescribeStackResourceDriftsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackResourceDrifts(
      params: DescribeStackResourceDriftsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackResourceDriftsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackResourceDriftsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns AWS resource descriptions for running and deleted stacks. If StackName is specified, all the associated resources that are part of the stack are returned. If PhysicalResourceId is specified, the associated resources of the stack that the resource belongs to are returned.  Only the first 100 resources will be returned. If your stack has more resources than this, you should use ListStackResources instead.  For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the stack has been deleted. You must specify either StackName or PhysicalResourceId, but not both. In addition, you can specify LogicalResourceId to filter the returned result. For more information about resources, the LogicalResourceId and PhysicalResourceId, go to the AWS CloudFormation User Guide.  A ValidationError is returned if you specify both StackName and PhysicalResourceId in the same request. 
      */
    def describeStackResources(): awsDashSdkLib.libRequestMod.Request[DescribeStackResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns AWS resource descriptions for running and deleted stacks. If StackName is specified, all the associated resources that are part of the stack are returned. If PhysicalResourceId is specified, the associated resources of the stack that the resource belongs to are returned.  Only the first 100 resources will be returned. If your stack has more resources than this, you should use ListStackResources instead.  For deleted stacks, DescribeStackResources returns resource information for up to 90 days after the stack has been deleted. You must specify either StackName or PhysicalResourceId, but not both. In addition, you can specify LogicalResourceId to filter the returned result. For more information about resources, the LogicalResourceId and PhysicalResourceId, go to the AWS CloudFormation User Guide.  A ValidationError is returned if you specify both StackName and PhysicalResourceId in the same request. 
      */
    def describeStackResources(params: DescribeStackResourcesInput): awsDashSdkLib.libRequestMod.Request[DescribeStackResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackResources(
      params: DescribeStackResourcesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of the specified stack set. 
      */
    def describeStackSet(): awsDashSdkLib.libRequestMod.Request[DescribeStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of the specified stack set. 
      */
    def describeStackSet(params: DescribeStackSetInput): awsDashSdkLib.libRequestMod.Request[DescribeStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackSet(
      params: DescribeStackSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of the specified stack set operation. 
      */
    def describeStackSetOperation(): awsDashSdkLib.libRequestMod.Request[DescribeStackSetOperationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackSetOperation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackSetOperationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackSetOperationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description of the specified stack set operation. 
      */
    def describeStackSetOperation(params: DescribeStackSetOperationInput): awsDashSdkLib.libRequestMod.Request[DescribeStackSetOperationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStackSetOperation(
      params: DescribeStackSetOperationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStackSetOperationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStackSetOperationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description for the specified stack; if no stack name was specified, then it returns the description for all the stacks created.  If the stack does not exist, an AmazonCloudFormationException is returned. 
      */
    def describeStacks(): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStacks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the description for the specified stack; if no stack name was specified, then it returns the description for all the stacks created.  If the stack does not exist, an AmazonCloudFormationException is returned. 
      */
    def describeStacks(params: DescribeStacksInput): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeStacks(
      params: DescribeStacksInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For each resource in the stack that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its expected template configuration. Only resource properties explicitly defined in the stack template are checked for drift. A stack is considered to have drifted if one or more of its resources differ from their expected template configurations. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to detect drift on all supported resources for a given stack, or DetectStackResourceDrift to detect drift on individual resources. For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.  DetectStackDrift can take up to several minutes, depending on the number of resources contained within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources. When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that stack. Perform DetectStackDrift directly on the nested stack itself.
      */
    def detectStackDrift(): awsDashSdkLib.libRequestMod.Request[DetectStackDriftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectStackDrift(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectStackDriftOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectStackDriftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Detects whether a stack's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. For each resource in the stack that supports drift detection, AWS CloudFormation compares the actual configuration of the resource with its expected template configuration. Only resource properties explicitly defined in the stack template are checked for drift. A stack is considered to have drifted if one or more of its resources differ from their expected template configurations. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackDrift to detect drift on all supported resources for a given stack, or DetectStackResourceDrift to detect drift on individual resources. For a list of stack resources that currently support drift detection, see Resources that Support Drift Detection.  DetectStackDrift can take up to several minutes, depending on the number of resources contained within the stack. Use DescribeStackDriftDetectionStatus to monitor the progress of a detect stack drift operation. Once the drift detection operation has completed, use DescribeStackResourceDrifts to return drift information about the stack and its resources. When detecting drift on a stack, AWS CloudFormation does not detect drift on any nested stacks belonging to that stack. Perform DetectStackDrift directly on the nested stack itself.
      */
    def detectStackDrift(params: DetectStackDriftInput): awsDashSdkLib.libRequestMod.Request[DetectStackDriftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectStackDrift(
      params: DetectStackDriftInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectStackDriftOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectStackDriftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about whether a resource's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. This information includes actual and expected property values for resources in which AWS CloudFormation detects drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information about stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all resources in a given stack that support drift detection. Resources that do not currently support drift detection cannot be checked. For a list of resources that support drift detection, see Resources that Support Drift Detection.
      */
    def detectStackResourceDrift(): awsDashSdkLib.libRequestMod.Request[DetectStackResourceDriftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectStackResourceDrift(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectStackResourceDriftOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectStackResourceDriftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about whether a resource's actual configuration differs, or has drifted, from it's expected configuration, as defined in the stack template and any values specified as template parameters. This information includes actual and expected property values for resources in which AWS CloudFormation detects drift. Only resource properties explicitly defined in the stack template are checked for drift. For more information about stack and resource drift, see Detecting Unregulated Configuration Changes to Stacks and Resources. Use DetectStackResourceDrift to detect drift on individual resources, or DetectStackDrift to detect drift on all resources in a given stack that support drift detection. Resources that do not currently support drift detection cannot be checked. For a list of resources that support drift detection, see Resources that Support Drift Detection.
      */
    def detectStackResourceDrift(params: DetectStackResourceDriftInput): awsDashSdkLib.libRequestMod.Request[DetectStackResourceDriftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def detectStackResourceDrift(
      params: DetectStackResourceDriftInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectStackResourceDriftOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectStackResourceDriftOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
      */
    def estimateTemplateCost(): awsDashSdkLib.libRequestMod.Request[EstimateTemplateCostOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def estimateTemplateCost(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EstimateTemplateCostOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EstimateTemplateCostOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the estimated monthly cost of a template. The return value is an AWS Simple Monthly Calculator URL with a query string that describes the resources required to run the template.
      */
    def estimateTemplateCost(params: EstimateTemplateCostInput): awsDashSdkLib.libRequestMod.Request[EstimateTemplateCostOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def estimateTemplateCost(
      params: EstimateTemplateCostInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ EstimateTemplateCostOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[EstimateTemplateCostOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a stack using the input information that was provided when the specified change set was created. After the call successfully completes, AWS CloudFormation starts updating the stack. Use the DescribeStacks action to view the status of the update. When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because they aren't valid for the updated stack. If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You can't specify a temporary stack policy that overrides the current policy.
      */
    def executeChangeSet(): awsDashSdkLib.libRequestMod.Request[ExecuteChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def executeChangeSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExecuteChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExecuteChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a stack using the input information that was provided when the specified change set was created. After the call successfully completes, AWS CloudFormation starts updating the stack. Use the DescribeStacks action to view the status of the update. When you execute a change set, AWS CloudFormation deletes all other change sets associated with the stack because they aren't valid for the updated stack. If a stack policy is associated with the stack, AWS CloudFormation enforces the policy during the update. You can't specify a temporary stack policy that overrides the current policy.
      */
    def executeChangeSet(params: ExecuteChangeSetInput): awsDashSdkLib.libRequestMod.Request[ExecuteChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def executeChangeSet(
      params: ExecuteChangeSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ExecuteChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ExecuteChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
      */
    def getStackPolicy(): awsDashSdkLib.libRequestMod.Request[GetStackPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getStackPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStackPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStackPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the stack policy for a specified stack. If a stack doesn't have a policy, a null value is returned.
      */
    def getStackPolicy(params: GetStackPolicyInput): awsDashSdkLib.libRequestMod.Request[GetStackPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getStackPolicy(
      params: GetStackPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetStackPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetStackPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the template body for a specified stack. You can get the template for running or deleted stacks. For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.   If the template does not exist, a ValidationError is returned.  
      */
    def getTemplate(): awsDashSdkLib.libRequestMod.Request[GetTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTemplateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the template body for a specified stack. You can get the template for running or deleted stacks. For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.   If the template does not exist, a ValidationError is returned.  
      */
    def getTemplate(params: GetTemplateInput): awsDashSdkLib.libRequestMod.Request[GetTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTemplate(
      params: GetTemplateInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTemplateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a new or existing template. The GetTemplateSummary action is useful for viewing parameter information, such as default parameter values and parameter types, before you create or update a stack or stack set. You can use the GetTemplateSummary action when you submit a template, or you can get template information for a stack set, or a running or deleted stack. For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the stack has been deleted. If the template does not exist, a ValidationError is returned.
      */
    def getTemplateSummary(): awsDashSdkLib.libRequestMod.Request[GetTemplateSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTemplateSummary(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTemplateSummaryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTemplateSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns information about a new or existing template. The GetTemplateSummary action is useful for viewing parameter information, such as default parameter values and parameter types, before you create or update a stack or stack set. You can use the GetTemplateSummary action when you submit a template, or you can get template information for a stack set, or a running or deleted stack. For deleted stacks, GetTemplateSummary returns the template information for up to 90 days after the stack has been deleted. If the template does not exist, a ValidationError is returned.
      */
    def getTemplateSummary(params: GetTemplateSummaryInput): awsDashSdkLib.libRequestMod.Request[GetTemplateSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getTemplateSummary(
      params: GetTemplateSummaryInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTemplateSummaryOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTemplateSummaryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.
      */
    def listChangeSets(): awsDashSdkLib.libRequestMod.Request[ListChangeSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listChangeSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListChangeSetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListChangeSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the ID and status of each active change set for a stack. For example, AWS CloudFormation lists change sets that are in the CREATE_IN_PROGRESS or CREATE_PENDING state.
      */
    def listChangeSets(params: ListChangeSetsInput): awsDashSdkLib.libRequestMod.Request[ListChangeSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listChangeSets(
      params: ListChangeSetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListChangeSetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListChangeSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all exported output values in the account and region in which you call this action. Use this action to see the exported output values that you can import into other stacks. To import values, use the  Fn::ImportValue  function.  For more information, see  AWS CloudFormation Export Stack Output Values.
      */
    def listExports(): awsDashSdkLib.libRequestMod.Request[ListExportsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listExports(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListExportsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListExportsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all exported output values in the account and region in which you call this action. Use this action to see the exported output values that you can import into other stacks. To import values, use the  Fn::ImportValue  function.  For more information, see  AWS CloudFormation Export Stack Output Values.
      */
    def listExports(params: ListExportsInput): awsDashSdkLib.libRequestMod.Request[ListExportsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listExports(
      params: ListExportsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListExportsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListExportsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first use this action to see which stacks are using it. To see the exported output values in your account, see ListExports.  For more information about importing an exported output value, see the  Fn::ImportValue  function. 
      */
    def listImports(): awsDashSdkLib.libRequestMod.Request[ListImportsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listImports(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListImportsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListImportsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all stacks that are importing an exported output value. To modify or remove an exported output value, first use this action to see which stacks are using it. To see the exported output values in your account, see ListExports.  For more information about importing an exported output value, see the  Fn::ImportValue  function. 
      */
    def listImports(params: ListImportsInput): awsDashSdkLib.libRequestMod.Request[ListImportsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listImports(
      params: ListImportsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListImportsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListImportsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns summary information about stack instances that are associated with the specified stack set. You can filter for stack instances that are associated with a specific AWS account name or region.
      */
    def listStackInstances(): awsDashSdkLib.libRequestMod.Request[ListStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns summary information about stack instances that are associated with the specified stack set. You can filter for stack instances that are associated with a specific AWS account name or region.
      */
    def listStackInstances(params: ListStackInstancesInput): awsDashSdkLib.libRequestMod.Request[ListStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackInstances(
      params: ListStackInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns descriptions of all resources of the specified stack. For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been deleted.
      */
    def listStackResources(): awsDashSdkLib.libRequestMod.Request[ListStackResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackResources(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns descriptions of all resources of the specified stack. For deleted stacks, ListStackResources returns resource information for up to 90 days after the stack has been deleted.
      */
    def listStackResources(params: ListStackResourcesInput): awsDashSdkLib.libRequestMod.Request[ListStackResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackResources(
      params: ListStackResourcesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackResourcesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackResourcesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns summary information about the results of a stack set operation. 
      */
    def listStackSetOperationResults(): awsDashSdkLib.libRequestMod.Request[ListStackSetOperationResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackSetOperationResults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackSetOperationResultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackSetOperationResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns summary information about the results of a stack set operation. 
      */
    def listStackSetOperationResults(params: ListStackSetOperationResultsInput): awsDashSdkLib.libRequestMod.Request[ListStackSetOperationResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackSetOperationResults(
      params: ListStackSetOperationResultsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackSetOperationResultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackSetOperationResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns summary information about operations performed on a stack set. 
      */
    def listStackSetOperations(): awsDashSdkLib.libRequestMod.Request[ListStackSetOperationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackSetOperations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackSetOperationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackSetOperationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns summary information about operations performed on a stack set. 
      */
    def listStackSetOperations(params: ListStackSetOperationsInput): awsDashSdkLib.libRequestMod.Request[ListStackSetOperationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackSetOperations(
      params: ListStackSetOperationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackSetOperationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackSetOperationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns summary information about stack sets that are associated with the user.
      */
    def listStackSets(): awsDashSdkLib.libRequestMod.Request[ListStackSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackSetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns summary information about stack sets that are associated with the user.
      */
    def listStackSets(params: ListStackSetsInput): awsDashSdkLib.libRequestMod.Request[ListStackSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStackSets(
      params: ListStackSetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStackSetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStackSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and stacks that have been deleted).
      */
    def listStacks(): awsDashSdkLib.libRequestMod.Request[ListStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStacks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the summary information for stacks whose status matches the specified StackStatusFilter. Summary information for stacks that have been deleted is kept for 90 days after the stack is deleted. If no StackStatusFilter is specified, summary information for all stacks is returned (including existing stacks and stacks that have been deleted).
      */
    def listStacks(params: ListStacksInput): awsDashSdkLib.libRequestMod.Request[ListStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listStacks(
      params: ListStacksInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets a stack policy for a specified stack.
      */
    def setStackPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setStackPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets a stack policy for a specified stack.
      */
    def setStackPolicy(params: SetStackPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setStackPolicy(
      params: SetStackPolicyInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or update until resources receive the required number of signals or the timeout period is exceeded. The SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2 instance.
      */
    def signalResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def signalResource(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends a signal to the specified resource with a success or failure status. You can use the SignalResource API in conjunction with a creation policy or update policy. AWS CloudFormation doesn't proceed with a stack creation or update until resources receive the required number of signals or the timeout period is exceeded. The SignalResource API is useful in cases where you want to send signals from anywhere other than an Amazon EC2 instance.
      */
    def signalResource(params: SignalResourceInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def signalResource(
      params: SignalResourceInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops an in-progress operation on a stack set and its associated stack instances. 
      */
    def stopStackSetOperation(): awsDashSdkLib.libRequestMod.Request[StopStackSetOperationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopStackSetOperation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopStackSetOperationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopStackSetOperationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Stops an in-progress operation on a stack set and its associated stack instances. 
      */
    def stopStackSetOperation(params: StopStackSetOperationInput): awsDashSdkLib.libRequestMod.Request[StopStackSetOperationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopStackSetOperation(
      params: StopStackSetOperationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopStackSetOperationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopStackSetOperationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You can check the status of the stack via the DescribeStacks action. To get a copy of the template for an existing stack, you can use the GetTemplate action. For more information about creating an update template, updating a stack, and monitoring the progress of the update, see Updating a Stack.
      */
    def updateStack(): awsDashSdkLib.libRequestMod.Request[UpdateStackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStack(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStackOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a stack as specified in the template. After the call completes successfully, the stack update starts. You can check the status of the stack via the DescribeStacks action. To get a copy of the template for an existing stack, you can use the GetTemplate action. For more information about creating an update template, updating a stack, and monitoring the progress of the update, see Updating a Stack.
      */
    def updateStack(params: UpdateStackInput): awsDashSdkLib.libRequestMod.Request[UpdateStackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStack(
      params: UpdateStackInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStackOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStackOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the parameter values for stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region.  You can only update stack instances in regions and accounts where they already exist; to create additional stack instances, use CreateStackInstances.  During stack set updates, any parameters overridden for a stack instance are not updated, but retain their overridden value. You can only update the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template. If you add a parameter to a template, before you can override the parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter value using UpdateStackInstances.
      */
    def updateStackInstances(): awsDashSdkLib.libRequestMod.Request[UpdateStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStackInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStackInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the parameter values for stack instances for the specified accounts, within the specified regions. A stack instance refers to a stack in a specific account and region.  You can only update stack instances in regions and accounts where they already exist; to create additional stack instances, use CreateStackInstances.  During stack set updates, any parameters overridden for a stack instance are not updated, but retain their overridden value. You can only update the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template. If you add a parameter to a template, before you can override the parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter value using UpdateStackInstances.
      */
    def updateStackInstances(params: UpdateStackInstancesInput): awsDashSdkLib.libRequestMod.Request[UpdateStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStackInstances(
      params: UpdateStackInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStackInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStackInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the stack set, and associated stack instances in the specified accounts and regions. Even if the stack set operation created by updating the stack set fails (completely or partially, below or above a specified failure tolerance), the stack set is updated with your changes. Subsequent CreateStackInstances calls on the specified stack set use the updated stack set.
      */
    def updateStackSet(): awsDashSdkLib.libRequestMod.Request[UpdateStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStackSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStackSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the stack set, and associated stack instances in the specified accounts and regions. Even if the stack set operation created by updating the stack set fails (completely or partially, below or above a specified failure tolerance), the stack set is updated with your changes. Subsequent CreateStackInstances calls on the specified stack set use the updated stack set.
      */
    def updateStackSet(params: UpdateStackSetInput): awsDashSdkLib.libRequestMod.Request[UpdateStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateStackSet(
      params: UpdateStackSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateStackSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateStackSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide.  For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack.
      */
    def updateTerminationProtection(): awsDashSdkLib.libRequestMod.Request[UpdateTerminationProtectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTerminationProtection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTerminationProtectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTerminationProtectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates termination protection for the specified stack. If a user attempts to delete a stack with termination protection enabled, the operation fails and the stack remains unchanged. For more information, see Protecting a Stack From Being Deleted in the AWS CloudFormation User Guide.  For nested stacks, termination protection is set on the root stack and cannot be changed directly on the nested stack.
      */
    def updateTerminationProtection(params: UpdateTerminationProtectionInput): awsDashSdkLib.libRequestMod.Request[UpdateTerminationProtectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateTerminationProtection(
      params: UpdateTerminationProtectionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateTerminationProtectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateTerminationProtectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a template validation error.
      */
    def validateTemplate(): awsDashSdkLib.libRequestMod.Request[ValidateTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validateTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ValidateTemplateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ValidateTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates a specified template. AWS CloudFormation first checks if the template is valid JSON. If it isn't, AWS CloudFormation checks if the template is valid YAML. If both these checks fail, AWS CloudFormation returns a template validation error.
      */
    def validateTemplate(params: ValidateTemplateInput): awsDashSdkLib.libRequestMod.Request[ValidateTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validateTemplate(
      params: ValidateTemplateInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ValidateTemplateOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ValidateTemplateOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the changeSetCreateComplete state by periodically calling the underlying CloudFormation.describeChangeSetoperation every 30 seconds (at most 120 times). Wait until change set status is CREATE_COMPLETE.
      */
    @JSName("waitFor")
    def waitFor_changeSetCreateComplete(state: awsDashSdkLib.awsDashSdkLibStrings.changeSetCreateComplete): awsDashSdkLib.libRequestMod.Request[DescribeChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_changeSetCreateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.changeSetCreateComplete,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the changeSetCreateComplete state by periodically calling the underlying CloudFormation.describeChangeSetoperation every 30 seconds (at most 120 times). Wait until change set status is CREATE_COMPLETE.
      */
    @JSName("waitFor")
    def waitFor_changeSetCreateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.changeSetCreateComplete,
      params: DescribeChangeSetInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_changeSetCreateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.changeSetCreateComplete,
      params: DescribeChangeSetInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeChangeSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeChangeSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the stackCreateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is CREATE_COMPLETE.
      */
    @JSName("waitFor")
    def waitFor_stackCreateComplete(state: awsDashSdkLib.awsDashSdkLibStrings.stackCreateComplete): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_stackCreateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackCreateComplete,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the stackCreateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is CREATE_COMPLETE.
      */
    @JSName("waitFor")
    def waitFor_stackCreateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackCreateComplete,
      params: DescribeStacksInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_stackCreateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackCreateComplete,
      params: DescribeStacksInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the stackDeleteComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is DELETE_COMPLETE.
      */
    @JSName("waitFor")
    def waitFor_stackDeleteComplete(state: awsDashSdkLib.awsDashSdkLibStrings.stackDeleteComplete): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_stackDeleteComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackDeleteComplete,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the stackDeleteComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is DELETE_COMPLETE.
      */
    @JSName("waitFor")
    def waitFor_stackDeleteComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackDeleteComplete,
      params: DescribeStacksInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_stackDeleteComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackDeleteComplete,
      params: DescribeStacksInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the stackExists state by periodically calling the underlying CloudFormation.describeStacksoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_stackExists(state: awsDashSdkLib.awsDashSdkLibStrings.stackExists): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_stackExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the stackExists state by periodically calling the underlying CloudFormation.describeStacksoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_stackExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackExists,
      params: DescribeStacksInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_stackExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackExists,
      params: DescribeStacksInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the stackUpdateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is UPDATE_COMPLETE.
      */
    @JSName("waitFor")
    def waitFor_stackUpdateComplete(state: awsDashSdkLib.awsDashSdkLibStrings.stackUpdateComplete): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_stackUpdateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackUpdateComplete,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the stackUpdateComplete state by periodically calling the underlying CloudFormation.describeStacksoperation every 30 seconds (at most 120 times). Wait until stack status is UPDATE_COMPLETE.
      */
    @JSName("waitFor")
    def waitFor_stackUpdateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackUpdateComplete,
      params: DescribeStacksInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_stackUpdateComplete(
      state: awsDashSdkLib.awsDashSdkLibStrings.stackUpdateComplete,
      params: DescribeStacksInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeStacksOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeStacksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateStackInput extends js.Object {
    /**
      * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for AWS CloudFormation to update the stack.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your AWS account; for example, by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.    If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.    If you don't specify either of these capabilities, AWS CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group      AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User      AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some template contain macros. Macros perform custom processing on templates; this can include simple actions like find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users typically create a change set from the processed template, so that they can review the changes resulting from the macros before actually updating the stack. If your stack template contains one or more macros, and you choose to update a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by AWS CloudFormation. Change sets do not currently support nested stacks. If you want to update a stack from a stack template that contains macros and nested stacks, you must update the stack directly from the template using this capability.  You should only update stacks directly from a stack template that contains macros if you know what processing the macro performs. Each macro relies on an underlying Lambda service function for processing stack templates. Be aware that the Lambda function owner can update the function operation without AWS CloudFormation being notified.  For more information, see Using AWS CloudFormation Macros to Perform Custom Processing on Templates.  
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * A unique identifier for this UpdateStack request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to update a stack with the same name. You might retry UpdateStack requests to ensure that AWS CloudFormation successfully received them. All events triggered by a given stack operation are assigned the same client request token, which you can use to track operations. For example, if you execute a CreateStack operation with the token token1, then all the StackEvents generated by that operation will have ClientRequestToken set as token1. In the console, stack operations display the client request token on the Events tab. Stack operations that are initiated from the console use the token format Console-StackOperation-ID, which helps you easily identify the stack operation . For example, if you create a stack using the console, each stack event would be assigned the same token in the following format: Console-CreateStack-7f59c3cf-00d2-40c7-b2ff-e75db0987002. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Amazon Simple Notification Service topic Amazon Resource Names (ARNs) that AWS CloudFormation associates with the stack. Specify an empty list to remove all notification topics.
      */
    var NotificationARNs: js.UndefOr[NotificationARNs] = js.undefined
    /**
      * A list of Parameter structures that specify input parameters for the stack. For more information, see the Parameter data type.
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The template resource types that you have permissions to work with for this update stack action, such as AWS::EC2::Instance, AWS::EC2::*, or Custom::MyCustomInstance. If the list of resource types doesn't include a resource that you're updating, the stack update fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM) uses this parameter for AWS CloudFormation-specific condition keys in IAM policies. For more information, see Controlling Access with AWS Identity and Access Management.
      */
    var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation assumes to update the stack. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS CloudFormation always uses this role for all future operations on the stack. As long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least privilege. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
      */
    var RoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
      */
    var RollbackConfiguration: js.UndefOr[RollbackConfiguration] = js.undefined
    /**
      * The name or unique stack ID of the stack to update.
      */
    var StackName: StackName
    /**
      * Structure containing a new stack policy body. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both. You might update the stack policy, for example, in order to protect a new resource that you created during a stack update. If you do not specify a stack policy, the current policy that is associated with the stack is unchanged.
      */
    var StackPolicyBody: js.UndefOr[StackPolicyBody] = js.undefined
    /**
      * Structure containing the temporary overriding stack policy body. You can specify either the StackPolicyDuringUpdateBody or the StackPolicyDuringUpdateURL parameter, but not both. If you want to update protected resources, specify a temporary overriding stack policy during this update. If you do not specify a stack policy, the current policy that is associated with the stack will be used.
      */
    var StackPolicyDuringUpdateBody: js.UndefOr[StackPolicyDuringUpdateBody] = js.undefined
    /**
      * Location of a file containing the temporary overriding stack policy. The URL must point to a policy (max size: 16KB) located in an S3 bucket in the same region as the stack. You can specify either the StackPolicyDuringUpdateBody or the StackPolicyDuringUpdateURL parameter, but not both. If you want to update protected resources, specify a temporary overriding stack policy during this update. If you do not specify a stack policy, the current policy that is associated with the stack will be used.
      */
    var StackPolicyDuringUpdateURL: js.UndefOr[StackPolicyDuringUpdateURL] = js.undefined
    /**
      * Location of a file containing the updated stack policy. The URL must point to a policy (max size: 16KB) located in an S3 bucket in the same region as the stack. You can specify either the StackPolicyBody or the StackPolicyURL parameter, but not both. You might update the stack policy, for example, in order to protect a new resource that you created during a stack update. If you do not specify a stack policy, the current policy that is associated with the stack is unchanged.
      */
    var StackPolicyURL: js.UndefOr[StackPolicyURL] = js.undefined
    /**
      * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to supported resources in the stack. You can specify a maximum number of 50 tags. If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags. If you specify an empty value, AWS CloudFormation removes all associated tags.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) Conditional: You must specify only one of the following parameters: TemplateBody, TemplateURL, or set the UsePreviousTemplate to true.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    /**
      * Location of file containing the template body. The URL must point to a template that is located in an Amazon S3 bucket. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: TemplateBody, TemplateURL, or set the UsePreviousTemplate to true.
      */
    var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    /**
      * Reuse the existing template that is associated with the stack that you are updating. Conditional: You must specify only one of the following parameters: TemplateBody, TemplateURL, or set the UsePreviousTemplate to true.
      */
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined
  }
  
  trait UpdateStackInstancesInput extends js.Object {
    /**
      * The names of one or more AWS accounts for which you want to update parameter values for stack instances. The overridden parameter values will be applied to all stack instances in the specified accounts and regions.
      */
    var Accounts: AccountList
    /**
      * The unique identifier for this stack set operation.  The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You might retry stack set operation requests to ensure that AWS CloudFormation successfully received them. If you don't specify an operation ID, the SDK generates one automatically. 
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Preferences for how AWS CloudFormation performs this stack set operation.
      */
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
    /**
      *  A list of input parameters whose values you want to update for the specified stack instances.  Any overridden parameter values will be applied to all stack instances in the specified accounts and regions. When specifying parameters and their values, be aware of how AWS CloudFormation sets parameter values during stack instance update operations:   To override the current value for a parameter, include the parameter and specify its value.   To leave a parameter set to its present value, you can do one of the following:   Do not include the parameter in the list.   Include the parameter and specify UsePreviousValue as true. (You cannot specify both a value and set UsePreviousValue to true.)     To set all overridden parameter back to the values specified in the stack set, specify a parameter list but do not include any parameters.   To leave all parameters set to their present values, do not specify this property at all.   During stack set updates, any parameter values overridden for a stack instance are not updated, but retain their overridden value. You can only override the parameter values that are specified in the stack set; to add or delete a parameter itself, use UpdateStackSet to update the stack set template. If you add a parameter to a template, before you can override the parameter value specified in the stack set you must first use UpdateStackSet to update all stack instances with the updated template and parameter value specified in the stack set. Once a stack instance has been updated with the new parameter, you can then override the parameter value using UpdateStackInstances.
      */
    var ParameterOverrides: js.UndefOr[Parameters] = js.undefined
    /**
      * The names of one or more regions in which you want to update parameter values for stack instances. The overridden parameter values will be applied to all stack instances in the specified accounts and regions.
      */
    var Regions: RegionList
    /**
      * The name or unique ID of the stack set associated with the stack instances.
      */
    var StackSetName: StackSetNameOrId
  }
  
  trait UpdateStackInstancesOutput extends js.Object {
    /**
      * The unique identifier for this stack set operation. 
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  }
  
  trait UpdateStackOutput extends js.Object {
    /**
      * Unique identifier of the stack.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
  }
  
  trait UpdateStackSetInput extends js.Object {
    /**
      * The accounts in which to update associated stack instances. If you specify accounts, you must also specify the regions in which to update stack set instances. To update all the stack instances associated with this stack set, do not specify the Accounts or Regions properties. If the stack set update includes changes to the template (that is, if the TemplateBody or TemplateURL properties are specified), or the Parameters property, AWS CloudFormation marks all stack instances with a status of OUTDATED prior to updating the stack instances in the specified accounts and regions. If the stack set update does not include changes to the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and regions, while leaving all other stack instances with their existing stack instance status. 
      */
    var Accounts: js.UndefOr[AccountList] = js.undefined
    /**
      * The Amazon Resource Number (ARN) of the IAM role to use to update this stack set. Specify an IAM role only if you are using customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Define Permissions for Multiple Administrators in the AWS CloudFormation User Guide.  If you specify a customized administrator role, AWS CloudFormation uses that role to update the stack. If you do not specify a customized administrator role, AWS CloudFormation performs the update using the role previously associated with the stack set, so long as you have permissions to perform operations on the stack set.
      */
    var AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined
    /**
      * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for AWS CloudFormation to update the stack set and its associated stack instances.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your AWS account; for example, by creating new AWS Identity and Access Management (IAM) users. For those stacks sets, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.    If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.    If you don't specify either of these capabilities, AWS CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group      AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User      AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some templates contain macros. If your stack template contains one or more macros, and you choose to update a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. For more information, see Using AWS CloudFormation Macros to Perform Custom Processing on Templates.  Stack sets do not currently support macros in stack templates. (This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by AWS CloudFormation.) Even if you specify this capability, if you include a macro in your template the stack set operation will fail.   
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * A brief description of updates that you are making.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * The name of the IAM execution role to use to update the stack set. If you do not specify an execution role, AWS CloudFormation uses the AWSCloudFormationStackSetExecutionRole role for the stack set operation. Specify an IAM role only if you are using customized execution roles to control which stack resources users and groups can include in their stack sets.   If you specify a customized execution role, AWS CloudFormation uses that role to update the stack. If you do not specify a customized execution role, AWS CloudFormation performs the update using the role previously associated with the stack set, so long as you have permissions to perform operations on the stack set.
      */
    var ExecutionRoleName: js.UndefOr[ExecutionRoleName] = js.undefined
    /**
      * The unique ID for this stack set operation.  The operation ID also functions as an idempotency token, to ensure that AWS CloudFormation performs the stack set operation only once, even if you retry the request multiple times. You might retry stack set operation requests to ensure that AWS CloudFormation successfully received them. If you don't specify an operation ID, AWS CloudFormation generates one automatically. Repeating this stack set operation with a new operation ID retries all stack instances whose status is OUTDATED. 
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * Preferences for how AWS CloudFormation performs this stack set operation.
      */
    var OperationPreferences: js.UndefOr[StackSetOperationPreferences] = js.undefined
    /**
      * A list of input parameters for the stack set template. 
      */
    var Parameters: js.UndefOr[Parameters] = js.undefined
    /**
      * The regions in which to update associated stack instances. If you specify regions, you must also specify accounts in which to update stack set instances. To update all the stack instances associated with this stack set, do not specify the Accounts or Regions properties. If the stack set update includes changes to the template (that is, if the TemplateBody or TemplateURL properties are specified), or the Parameters property, AWS CloudFormation marks all stack instances with a status of OUTDATED prior to updating the stack instances in the specified accounts and regions. If the stack set update does not include changes to the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and regions, while leaving all other stack instances with their existing stack instance status. 
      */
    var Regions: js.UndefOr[RegionList] = js.undefined
    /**
      * The name or unique ID of the stack set that you want to update.
      */
    var StackSetName: StackSetName
    /**
      * The key-value pairs to associate with this stack set and the stacks created from it. AWS CloudFormation also propagates these tags to supported resources that are created in the stacks. You can specify a maximum number of 50 tags. If you specify tags for this parameter, those tags replace any list of tags that are currently associated with this stack set. This means:   If you don't specify this parameter, AWS CloudFormation doesn't modify the stack's tags.    If you specify any tags using this parameter, you must specify all the tags that you want associated with this stack set, even tags you've specifed before (for example, when creating the stack set or during a previous update of the stack set.). Any tags that you don't include in the updated list of tags are removed from the stack set, and therefore from the stacks and resources as well.    If you specify an empty value, AWS CloudFormation removes all currently associated tags.   If you specify new tags as part of an UpdateStackSet action, AWS CloudFormation checks to see if you have the required IAM permission to tag resources. If you omit tags that are currently associated with the stack set from the list of tags you specify, AWS CloudFormation assumes that you want to remove those tags from the stack set, and checks to see if you have permission to untag resources. If you don't have the necessary permission(s), the entire UpdateStackSet action fails with an access denied error, and the stack set is not updated.
      */
    var Tags: js.UndefOr[Tags] = js.undefined
    /**
      * The structure that contains the template body, with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: TemplateBody or TemplateURL—or set UsePreviousTemplate to true.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    /**
      * The location of the file that contains the template body. The URL must point to a template (maximum size: 460,800 bytes) that is located in an Amazon S3 bucket. For more information, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: TemplateBody or TemplateURL—or set UsePreviousTemplate to true. 
      */
    var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
    /**
      * Use the existing template that's associated with the stack set that you're updating. Conditional: You must specify only one of the following parameters: TemplateBody or TemplateURL—or set UsePreviousTemplate to true. 
      */
    var UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined
  }
  
  trait UpdateStackSetOutput extends js.Object {
    /**
      * The unique ID for this stack set operation.
      */
    var OperationId: js.UndefOr[ClientRequestToken] = js.undefined
  }
  
  trait UpdateTerminationProtectionInput extends js.Object {
    /**
      * Whether to enable termination protection on the specified stack.
      */
    var EnableTerminationProtection: EnableTerminationProtection
    /**
      * The name or unique ID of the stack for which you want to set termination protection.
      */
    var StackName: StackNameOrId
  }
  
  trait UpdateTerminationProtectionOutput extends js.Object {
    /**
      * The unique ID of the stack.
      */
    var StackId: js.UndefOr[StackId] = js.undefined
  }
  
  trait ValidateTemplateInput extends js.Object {
    /**
      * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
      */
    var TemplateBody: js.UndefOr[TemplateBody] = js.undefined
    /**
      * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
      */
    var TemplateURL: js.UndefOr[TemplateURL] = js.undefined
  }
  
  trait ValidateTemplateOutput extends js.Object {
    /**
      * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
      */
    var Capabilities: js.UndefOr[Capabilities] = js.undefined
    /**
      * The list of resources that generated the values in the Capabilities response element.
      */
    var CapabilitiesReason: js.UndefOr[CapabilitiesReason] = js.undefined
    /**
      * A list of the transforms that are declared in the template.
      */
    var DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined
    /**
      * The description found within the template.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * A list of TemplateParameter structures.
      */
    var Parameters: js.UndefOr[TemplateParameters] = js.undefined
  }
  
  trait _AccountGateStatus extends js.Object
  
  trait _Capability extends js.Object
  
  trait _ChangeAction extends js.Object
  
  trait _ChangeSetStatus extends js.Object
  
  trait _ChangeSetType extends js.Object
  
  trait _ChangeSource extends js.Object
  
  trait _DifferenceType extends js.Object
  
  trait _EvaluationType extends js.Object
  
  trait _ExecutionStatus extends js.Object
  
  trait _OnFailure extends js.Object
  
  trait _Replacement extends js.Object
  
  trait _RequiresRecreation extends js.Object
  
  trait _ResourceAttribute extends js.Object
  
  trait _ResourceSignalStatus extends js.Object
  
  trait _ResourceStatus extends js.Object
  
  trait _StackDriftDetectionStatus extends js.Object
  
  trait _StackDriftStatus extends js.Object
  
  trait _StackInstanceStatus extends js.Object
  
  trait _StackResourceDriftStatus extends js.Object
  
  trait _StackSetOperationAction extends js.Object
  
  trait _StackSetOperationResultStatus extends js.Object
  
  trait _StackSetOperationStatus extends js.Object
  
  trait _StackSetStatus extends js.Object
  
  trait _StackStatus extends js.Object
  
  trait _TemplateStage extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Account = java.lang.String
  type AccountGateStatus = _AccountGateStatus | java.lang.String
  type AccountGateStatusReason = java.lang.String
  type AccountLimitList = js.Array[AccountLimit]
  type AccountList = js.Array[Account]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[AllowedValue]
  type Arn = java.lang.String
  type BoxedInteger = scala.Double
  type BoxedMaxResults = scala.Double
  type Capabilities = js.Array[Capability]
  type CapabilitiesReason = java.lang.String
  type Capability = _Capability | java.lang.String
  type CausingEntity = java.lang.String
  type ChangeAction = _ChangeAction | java.lang.String
  type ChangeSetId = java.lang.String
  type ChangeSetName = java.lang.String
  type ChangeSetNameOrId = java.lang.String
  type ChangeSetStatus = _ChangeSetStatus | java.lang.String
  type ChangeSetStatusReason = java.lang.String
  type ChangeSetSummaries = js.Array[ChangeSetSummary]
  type ChangeSetType = _ChangeSetType | java.lang.String
  type ChangeSource = _ChangeSource | java.lang.String
  type ChangeType = awsDashSdkLib.awsDashSdkLibStrings.Resource | java.lang.String
  type Changes = js.Array[Change]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type ClientToken = java.lang.String
  type CreationTime = stdLib.Date
  type DeletionTime = stdLib.Date
  type Description = java.lang.String
  type DifferenceType = _DifferenceType | java.lang.String
  type DisableRollback = scala.Boolean
  type EnableTerminationProtection = scala.Boolean
  type EvaluationType = _EvaluationType | java.lang.String
  type EventId = java.lang.String
  type ExecutionRoleName = java.lang.String
  type ExecutionStatus = _ExecutionStatus | java.lang.String
  type ExportName = java.lang.String
  type ExportValue = java.lang.String
  type Exports = js.Array[Export]
  type FailureToleranceCount = scala.Double
  type FailureTolerancePercentage = scala.Double
  type Imports = js.Array[StackName]
  type Key = java.lang.String
  type LastUpdatedTime = stdLib.Date
  type LimitName = java.lang.String
  type LimitValue = scala.Double
  type LogicalResourceId = java.lang.String
  type LogicalResourceIds = js.Array[LogicalResourceId]
  type MaxConcurrentCount = scala.Double
  type MaxConcurrentPercentage = scala.Double
  type MaxResults = scala.Double
  type Metadata = java.lang.String
  type MonitoringTimeInMinutes = scala.Double
  type NextToken = java.lang.String
  type NoEcho = scala.Boolean
  type NotificationARN = java.lang.String
  type NotificationARNs = js.Array[NotificationARN]
  type OnFailure = _OnFailure | java.lang.String
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type Outputs = js.Array[Output]
  type ParameterDeclarations = js.Array[ParameterDeclaration]
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type Parameters = js.Array[Parameter]
  type PhysicalResourceId = java.lang.String
  type PhysicalResourceIdContext = js.Array[PhysicalResourceIdContextKeyValuePair]
  type Properties = java.lang.String
  type PropertyDifferences = js.Array[PropertyDifference]
  type PropertyName = java.lang.String
  type PropertyPath = java.lang.String
  type PropertyValue = java.lang.String
  type Reason = java.lang.String
  type Region = java.lang.String
  type RegionList = js.Array[Region]
  type Replacement = _Replacement | java.lang.String
  type RequiresRecreation = _RequiresRecreation | java.lang.String
  type ResourceAttribute = _ResourceAttribute | java.lang.String
  type ResourceChangeDetails = js.Array[ResourceChangeDetail]
  type ResourceProperties = java.lang.String
  type ResourceSignalStatus = _ResourceSignalStatus | java.lang.String
  type ResourceSignalUniqueId = java.lang.String
  type ResourceStatus = _ResourceStatus | java.lang.String
  type ResourceStatusReason = java.lang.String
  type ResourceToSkip = java.lang.String
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[ResourceType]
  type ResourcesToSkip = js.Array[ResourceToSkip]
  type RetainResources = js.Array[LogicalResourceId]
  type RetainStacks = scala.Boolean
  type RetainStacksNullable = scala.Boolean
  type RoleARN = java.lang.String
  type RollbackTriggers = js.Array[RollbackTrigger]
  type Scope = js.Array[ResourceAttribute]
  type StackDriftDetectionId = java.lang.String
  type StackDriftDetectionStatus = _StackDriftDetectionStatus | java.lang.String
  type StackDriftDetectionStatusReason = java.lang.String
  type StackDriftStatus = _StackDriftStatus | java.lang.String
  type StackEvents = js.Array[StackEvent]
  type StackId = java.lang.String
  type StackInstanceStatus = _StackInstanceStatus | java.lang.String
  type StackInstanceSummaries = js.Array[StackInstanceSummary]
  type StackName = java.lang.String
  type StackNameOrId = java.lang.String
  type StackPolicyBody = java.lang.String
  type StackPolicyDuringUpdateBody = java.lang.String
  type StackPolicyDuringUpdateURL = java.lang.String
  type StackPolicyURL = java.lang.String
  type StackResourceDriftStatus = _StackResourceDriftStatus | java.lang.String
  type StackResourceDriftStatusFilters = js.Array[StackResourceDriftStatus]
  type StackResourceDrifts = js.Array[StackResourceDrift]
  type StackResourceSummaries = js.Array[StackResourceSummary]
  type StackResources = js.Array[StackResource]
  type StackSetARN = java.lang.String
  type StackSetId = java.lang.String
  type StackSetName = java.lang.String
  type StackSetNameOrId = java.lang.String
  type StackSetOperationAction = _StackSetOperationAction | java.lang.String
  type StackSetOperationResultStatus = _StackSetOperationResultStatus | java.lang.String
  type StackSetOperationResultSummaries = js.Array[StackSetOperationResultSummary]
  type StackSetOperationStatus = _StackSetOperationStatus | java.lang.String
  type StackSetOperationSummaries = js.Array[StackSetOperationSummary]
  type StackSetStatus = _StackSetStatus | java.lang.String
  type StackSetSummaries = js.Array[StackSetSummary]
  type StackStatus = _StackStatus | java.lang.String
  type StackStatusFilter = js.Array[StackStatus]
  type StackStatusReason = java.lang.String
  type StackSummaries = js.Array[StackSummary]
  type Stacks = js.Array[Stack]
  type StageList = js.Array[TemplateStage]
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TemplateBody = java.lang.String
  type TemplateDescription = java.lang.String
  type TemplateParameters = js.Array[TemplateParameter]
  type TemplateStage = _TemplateStage | java.lang.String
  type TemplateURL = java.lang.String
  type TimeoutMinutes = scala.Double
  type Timestamp = stdLib.Date
  type TransformName = java.lang.String
  type TransformsList = js.Array[TransformName]
  type Type = java.lang.String
  type Url = java.lang.String
  type UsePreviousTemplate = scala.Boolean
  type UsePreviousValue = scala.Boolean
  type Value = java.lang.String
  type Version = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

