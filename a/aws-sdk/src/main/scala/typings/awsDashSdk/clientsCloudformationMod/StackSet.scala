package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackSet extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the IAM role used to create or update the stack set. Use customized administrator roles to control which users or groups can manage specific stack sets within the same administrator account. For more information, see Prerequisites: Granting Permissions for Stack Set Operations in the AWS CloudFormation User Guide.
    */
  var AdministrationRoleARN: js.UndefOr[RoleARN] = js.undefined
  /**
    * The capabilities that are allowed in the stack set. Some stack set templates might include resources that can affect permissions in your AWS account—for example, by creating new AWS Identity and Access Management (IAM) users. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates. 
    */
  var Capabilities: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Capabilities] = js.undefined
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Description] = js.undefined
  /**
    * The name of the IAM execution role used to create or update the stack set.  Use customized execution roles to control which stack resources users and groups can include in their stack sets. 
    */
  var ExecutionRoleName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ExecutionRoleName] = js.undefined
  /**
    * A list of input parameters for a stack set.
    */
  var Parameters: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Parameters] = js.undefined
  /**
    * The Amazon Resource Number (ARN) of the stack set.
    */
  var StackSetARN: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSetARN] = js.undefined
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSetId] = js.undefined
  /**
    * The name that's associated with the stack set.
    */
  var StackSetName: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackSetName] = js.undefined
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.undefined
  /**
    * A list of tags that specify information about the stack set. A maximum number of 50 tags can be specified.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.Tags] = js.undefined
  /**
    * The structure that contains the body of the template that was used to create or update the stack set.
    */
  var TemplateBody: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TemplateBody] = js.undefined
}

object StackSet {
  @scala.inline
  def apply(
    AdministrationRoleARN: RoleARN = null,
    Capabilities: Capabilities = null,
    Description: Description = null,
    ExecutionRoleName: ExecutionRoleName = null,
    Parameters: Parameters = null,
    StackSetARN: StackSetARN = null,
    StackSetId: StackSetId = null,
    StackSetName: StackSetName = null,
    Status: StackSetStatus = null,
    Tags: Tags = null,
    TemplateBody: TemplateBody = null
  ): StackSet = {
    val __obj = js.Dynamic.literal()
    if (AdministrationRoleARN != null) __obj.updateDynamic("AdministrationRoleARN")(AdministrationRoleARN)
    if (Capabilities != null) __obj.updateDynamic("Capabilities")(Capabilities)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExecutionRoleName != null) __obj.updateDynamic("ExecutionRoleName")(ExecutionRoleName)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (StackSetARN != null) __obj.updateDynamic("StackSetARN")(StackSetARN)
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId)
    if (StackSetName != null) __obj.updateDynamic("StackSetName")(StackSetName)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody)
    __obj.asInstanceOf[StackSet]
  }
}

