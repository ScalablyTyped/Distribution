package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateTemplateRequest extends js.Object {
  /**
    * ID of the application associated with the Amazon CloudFormation template.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  /**
    * Format for generating the Amazon CloudFormation template.
    */
  var templateFormat: js.UndefOr[OutputFormat] = js.undefined
}

object GenerateTemplateRequest {
  @scala.inline
  def apply(appId: AppId = null, templateFormat: OutputFormat = null): GenerateTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (templateFormat != null) __obj.updateDynamic("templateFormat")(templateFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateTemplateRequest]
  }
}

