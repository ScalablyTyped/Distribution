package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProvisioningTemplateVersionRequest extends js.Object {
  /**
    * The name of the fleet provisioning template version to delete.
    */
  var templateName: TemplateName = js.native
  /**
    * The fleet provisioning template version ID to delete.
    */
  var versionId: TemplateVersionId = js.native
}

object DeleteProvisioningTemplateVersionRequest {
  @scala.inline
  def apply(templateName: TemplateName, versionId: TemplateVersionId): DeleteProvisioningTemplateVersionRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProvisioningTemplateVersionRequest]
  }
}

