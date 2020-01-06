package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningTemplateRequest extends js.Object {
  /**
    * The description of the fleet provisioning template.
    */
  var description: js.UndefOr[TemplateDescription] = js.native
  /**
    * True to enable the fleet provisioning template, otherwise false.
    */
  var enabled: js.UndefOr[Enabled] = js.native
  /**
    * The role ARN for the role associated with the fleet provisioning template. This IoT role grants permission to provision a device.
    */
  var provisioningRoleArn: RoleArn = js.native
  /**
    * Metadata which can be used to manage the fleet provisioning template.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The JSON formatted contents of the fleet provisioning template.
    */
  var templateBody: TemplateBody = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: TemplateName = js.native
}

object CreateProvisioningTemplateRequest {
  @scala.inline
  def apply(
    provisioningRoleArn: RoleArn,
    templateBody: TemplateBody,
    templateName: TemplateName,
    description: TemplateDescription = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    tags: TagList = null
  ): CreateProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(provisioningRoleArn = provisioningRoleArn.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateRequest]
  }
}

