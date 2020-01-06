package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProvisioningTemplateRequest extends js.Object {
  /**
    * The name of the fleet provision template to delete.
    */
  var templateName: TemplateName = js.native
}

object DeleteProvisioningTemplateRequest {
  @scala.inline
  def apply(templateName: TemplateName): DeleteProvisioningTemplateRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProvisioningTemplateRequest]
  }
}

