package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCustomVerificationEmailTemplateRequest extends js.Object {
  /**
    * The name of the custom verification email template that you want to retrieve.
    */
  var TemplateName: awsDashSdkLib.clientsSesMod.TemplateName
}

object GetCustomVerificationEmailTemplateRequest {
  @scala.inline
  def apply(TemplateName: TemplateName): GetCustomVerificationEmailTemplateRequest = {
    val __obj = js.Dynamic.literal(TemplateName = TemplateName)
  
    __obj.asInstanceOf[GetCustomVerificationEmailTemplateRequest]
  }
}

