package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningTemplateResponse extends js.Object {
  /**
    * The default version of the fleet provisioning template.
    */
  var defaultVersionId: js.UndefOr[TemplateVersionId] = js.native
  /**
    * The ARN that identifies the provisioning template.
    */
  var templateArn: js.UndefOr[TemplateArn] = js.native
  /**
    * The name of the fleet provisioning template.
    */
  var templateName: js.UndefOr[TemplateName] = js.native
}

object CreateProvisioningTemplateResponse {
  @scala.inline
  def apply(
    defaultVersionId: Int | Double = null,
    templateArn: TemplateArn = null,
    templateName: TemplateName = null
  ): CreateProvisioningTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (defaultVersionId != null) __obj.updateDynamic("defaultVersionId")(defaultVersionId.asInstanceOf[js.Any])
    if (templateArn != null) __obj.updateDynamic("templateArn")(templateArn.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProvisioningTemplateResponse]
  }
}

