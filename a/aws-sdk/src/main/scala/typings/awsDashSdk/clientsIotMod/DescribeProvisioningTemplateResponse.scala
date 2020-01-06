package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProvisioningTemplateResponse extends js.Object {
  /**
    * The date when the fleet provisioning template was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The default fleet template version ID.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  /**
    * True if the fleet provisioning template is enabled, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * The date when the fleet provisioning template was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The ARN of the role associated with the provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The ARN of the fleet provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
}

object DescribeProvisioningTemplateResponse {
  @scala.inline
  def apply(
    creationDate: DateType = null,
    defaultVersionId: Int | Double = null,
    description: TemplateDescription = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDate: DateType = null,
    provisioningRoleArn: RoleArn = null,
    templateArn: TemplateArn = null,
    templateBody: TemplateBody = null,
    templateName: TemplateName = null
  ): DescribeProvisioningTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (defaultVersionId != null) __obj.updateDynamic("defaultVersionId")(defaultVersionId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (provisioningRoleArn != null) __obj.updateDynamic("provisioningRoleArn")(provisioningRoleArn.asInstanceOf[js.Any])
    if (templateArn != null) __obj.updateDynamic("templateArn")(templateArn.asInstanceOf[js.Any])
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProvisioningTemplateResponse]
  }
}

