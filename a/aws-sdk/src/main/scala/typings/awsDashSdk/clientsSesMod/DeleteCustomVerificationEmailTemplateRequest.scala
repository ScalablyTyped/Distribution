package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The name of the custom verification email template that you want to delete.
    */
  var TemplateName: typings.awsDashSdk.clientsSesMod.TemplateName
}

object DeleteCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): DeleteCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName)
  
    __obj.asInstanceOf[DeleteCustomVerificationEmailTemplateRequest]
  }
}

