package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningTemplateVersionResponse extends js.Object {
  /**
    * True if the fleet provisioning template version is the default version, otherwise false.
    */
  var isDefaultVersion: js.UndefOr[IsDefaultVersion] = js.native
  /**
    * The ARN that identifies the provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
  /**
    * The version of the fleet provisioning template.
    */
  var versionId: js.UndefOr[TemplateVersionId] = js.native
}

object CreateProvisioningTemplateVersionResponse {
  @scala.inline
  def apply(
    isDefaultVersion: js.UndefOr[scala.Boolean] = js.undefined,
    templateArn: TemplateArn = null,
    templateName: TemplateName = null,
    versionId: Int | Double = null
  ): CreateProvisioningTemplateVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDefaultVersion)) __obj.updateDynamic("isDefaultVersion")(isDefaultVersion.asInstanceOf[js.Any])
    if (templateArn != null) __obj.updateDynamic("templateArn")(templateArn.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateVersionResponse]
  }
}

