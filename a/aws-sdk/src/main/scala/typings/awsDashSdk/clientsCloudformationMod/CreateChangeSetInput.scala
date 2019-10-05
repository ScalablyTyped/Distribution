package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChangeSetInput extends js.Object {
  /**
    * In some cases, you must explicity acknowledge that your stack template contains certain capabilities in order for AWS CloudFormation to create the stack.    CAPABILITY_IAM and CAPABILITY_NAMED_IAM  Some stack templates might include resources that can affect permissions in your AWS account; for example, by creating new AWS Identity and Access Management (IAM) users. For those stacks, you must explicitly acknowledge this by specifying one of these capabilities. The following IAM resources require you to specify either the CAPABILITY_IAM or CAPABILITY_NAMED_IAM capability.   If you have IAM resources, you can specify either capability.    If you have IAM resources with custom names, you must specify CAPABILITY_NAMED_IAM.    If you don't specify either of these capabilities, AWS CloudFormation returns an InsufficientCapabilities error.   If your stack template contains these resources, we recommend that you review all permissions associated with them and edit their permissions if necessary.     AWS::IAM::AccessKey      AWS::IAM::Group      AWS::IAM::InstanceProfile      AWS::IAM::Policy      AWS::IAM::Role      AWS::IAM::User      AWS::IAM::UserToGroupAddition    For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.    CAPABILITY_AUTO_EXPAND  Some template contain macros. Macros perform custom processing on templates; this can include simple actions like find-and-replace operations, all the way to extensive transformations of entire templates. Because of this, users typically create a change set from the processed template, so that they can review the changes resulting from the macros before actually creating the stack. If your stack template contains one or more macros, and you choose to create a stack directly from the processed template, without first reviewing the resulting changes in a change set, you must acknowledge this capability. This includes the AWS::Include and AWS::Serverless transforms, which are macros hosted by AWS CloudFormation.  This capacity does not apply to creating change sets, and specifying it when creating change sets has no effect. Also, change sets do not currently support nested stacks. If you want to create a stack from a stack template that contains macros and nested stacks, you must create or update the stack directly from the template using the CreateStack or UpdateStack action, and specifying this capability.  For more information on macros, see Using AWS CloudFormation Macros to Perform Custom Processing on Templates.  
    */
  var Capabilities: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Capabilities] = js.undefined
  /**
    * The name of the change set. The name must be unique among all change sets that are associated with the specified stack. A change set name can contain only alphanumeric, case sensitive characters and hyphens. It must start with an alphabetic character and cannot exceed 128 characters.
    */
  var ChangeSetName: typings.awsDashSdk.clientsCloudformationMod.ChangeSetName
  /**
    * The type of change set operation. To create a change set for a new stack, specify CREATE. To create a change set for an existing stack, specify UPDATE. If you create a change set for a new stack, AWS Cloudformation creates a stack with a unique stack ID, but no template or resources. The stack will be in the  REVIEW_IN_PROGRESS  state until you execute the change set. By default, AWS CloudFormation specifies UPDATE. You can't use the UPDATE type to create a change set for a new stack or the CREATE type to create a change set for an existing stack.
    */
  var ChangeSetType: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ChangeSetType] = js.undefined
  /**
    * A unique identifier for this CreateChangeSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to create another change set with the same name. You might retry CreateChangeSet requests to ensure that AWS CloudFormation successfully received them.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ClientToken] = js.undefined
  /**
    * A description to help you identify this change set.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.undefined
  /**
    * The Amazon Resource Names (ARNs) of Amazon Simple Notification Service (Amazon SNS) topics that AWS CloudFormation associates with the stack. To remove all associated notification topics, specify an empty list.
    */
  var NotificationARNs: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NotificationARNs] = js.undefined
  /**
    * A list of Parameter structures that specify input parameters for the change set. For more information, see the Parameter data type.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Parameters] = js.undefined
  /**
    * The template resource types that you have permissions to work with if you execute this change set, such as AWS::EC2::Instance, AWS::EC2::*, or Custom::MyCustomInstance. If the list of resource types doesn't include a resource type that you're updating, the stack update fails. By default, AWS CloudFormation grants permissions to all resource types. AWS Identity and Access Management (IAM) uses this parameter for condition keys in IAM policies for AWS CloudFormation. For more information, see Controlling Access with AWS Identity and Access Management in the AWS CloudFormation User Guide.
    */
  var ResourceTypes: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ResourceTypes] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that AWS CloudFormation assumes when executing the change set. AWS CloudFormation uses the role's credentials to make calls on your behalf. AWS CloudFormation uses this role for all future operations on the stack. As long as users have permission to operate on the stack, AWS CloudFormation uses this role even if the users don't have permission to pass it. Ensure that the role grants least privilege. If you don't specify a value, AWS CloudFormation uses the role that was previously associated with the stack. If no role is available, AWS CloudFormation uses a temporary session that is generated from your user credentials.
    */
  var RoleARN: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.RoleARN] = js.undefined
  /**
    * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for the specified monitoring period afterwards.
    */
  var RollbackConfiguration: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.RollbackConfiguration] = js.undefined
  /**
    * The name or the unique ID of the stack for which you are creating a change set. AWS CloudFormation generates the change set by comparing this stack's information with the information that you submit, such as a modified template or different parameter input values.
    */
  var StackName: StackNameOrId
  /**
    * Key-value pairs to associate with this stack. AWS CloudFormation also propagates these tags to resources in the stack. You can specify a maximum of 50 tags.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Tags] = js.undefined
  /**
    * A structure that contains the body of the revised template, with a minimum length of 1 byte and a maximum length of 51,200 bytes. AWS CloudFormation generates the change set by comparing this template with the template of the stack that you specified. Conditional: You must specify only TemplateBody or TemplateURL.
    */
  var TemplateBody: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TemplateBody] = js.undefined
  /**
    * The location of the file that contains the revised template. The URL must point to a template (max size: 460,800 bytes) that is located in an S3 bucket. AWS CloudFormation generates the change set by comparing this template with the stack that you specified. Conditional: You must specify only TemplateBody or TemplateURL.
    */
  var TemplateURL: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TemplateURL] = js.undefined
  /**
    * Whether to reuse the template that is associated with the stack to create the change set.
    */
  var UsePreviousTemplate: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.UsePreviousTemplate] = js.undefined
}

object CreateChangeSetInput {
  @scala.inline
  def apply(
    ChangeSetName: ChangeSetName,
    StackName: StackNameOrId,
    Capabilities: Capabilities = null,
    ChangeSetType: ChangeSetType = null,
    ClientToken: ClientToken = null,
    Description: Description = null,
    NotificationARNs: NotificationARNs = null,
    Parameters: Parameters = null,
    ResourceTypes: ResourceTypes = null,
    RoleARN: RoleARN = null,
    RollbackConfiguration: RollbackConfiguration = null,
    Tags: Tags = null,
    TemplateBody: TemplateBody = null,
    TemplateURL: TemplateURL = null,
    UsePreviousTemplate: js.UndefOr[Boolean] = js.undefined
  ): CreateChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName, StackName = StackName)
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities)
    if (ChangeSetType != null) __obj.updateDynamic("ChangeSetType")(ChangeSetType.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (NotificationARNs != null) __obj.updateDynamic("NotificationARNs")(NotificationARNs)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes)
    if (RoleARN != null) __obj.updateDynamic("RoleARN")(RoleARN)
    if (RollbackConfiguration != null) __obj.updateDynamic("RollbackConfiguration")(RollbackConfiguration)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody)
    if (TemplateURL != null) __obj.updateDynamic("TemplateURL")(TemplateURL)
    if (!js.isUndefined(UsePreviousTemplate)) __obj.updateDynamic("UsePreviousTemplate")(UsePreviousTemplate)
    __obj.asInstanceOf[CreateChangeSetInput]
  }
}

