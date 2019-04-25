package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStackSetInput extends js.Object {
  /**
    * The accounts in which to update associated stack instances. If you specify accounts, you must also specify the regions in which to update stack set instances. To update all the stack instances associated with this stack set, do not specify the Accounts or Regions properties. If the stack set update includes changes to the template (that is, if the TemplateBody or TemplateURL properties are specified), or the Parameters property, AWS CloudFormation marks all stack instances with a status of OUTDATED prior to updating the stack instances in the specified accounts and regions. If the stack set update does not include changes to the template or parameters, AWS CloudFormation updates the stack instances in the specified accounts and regions, while leaving all other stack instances with their existing stack instance status. 
    */
  var Accounts: js.UndefOr[AccountList] = js.undefined
  /**
    * The Amazon Resource Number (ARN) of the IAM role to use to update this stack set. Specify an IAM role only if you are using customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Granting Permissions for Stack Set Operations in the AWS CloudFormation User Guide. If you specified a customized administrator role when you created the stack set, you must specify a customized administrator role, even if it is the same customized administrator role used with this stack set previously.
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
  var StackSetName: awsDashSdkLib.clientsCloudformationMod.StackSetName
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

object UpdateStackSetInput {
  @scala.inline
  def apply(
    StackSetName: StackSetName,
    Accounts: AccountList = null,
    AdministrationRoleARN: RoleARN = null,
    Capabilities: Capabilities = null,
    Description: Description = null,
    ExecutionRoleName: ExecutionRoleName = null,
    OperationId: ClientRequestToken = null,
    OperationPreferences: StackSetOperationPreferences = null,
    Parameters: Parameters = null,
    Regions: RegionList = null,
    Tags: Tags = null,
    TemplateBody: TemplateBody = null,
    TemplateURL: TemplateURL = null,
    UsePreviousTemplate: js.UndefOr[UsePreviousTemplate] = js.undefined
  ): UpdateStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName)
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts)
    if (AdministrationRoleARN != null) __obj.updateDynamic("AdministrationRoleARN")(AdministrationRoleARN)
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExecutionRoleName != null) __obj.updateDynamic("ExecutionRoleName")(ExecutionRoleName)
    if (OperationId != null) __obj.updateDynamic("OperationId")(OperationId)
    if (OperationPreferences != null) __obj.updateDynamic("OperationPreferences")(OperationPreferences)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (Regions != null) __obj.updateDynamic("Regions")(Regions)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody)
    if (TemplateURL != null) __obj.updateDynamic("TemplateURL")(TemplateURL)
    if (!js.isUndefined(UsePreviousTemplate)) __obj.updateDynamic("UsePreviousTemplate")(UsePreviousTemplate)
    __obj.asInstanceOf[UpdateStackSetInput]
  }
}

