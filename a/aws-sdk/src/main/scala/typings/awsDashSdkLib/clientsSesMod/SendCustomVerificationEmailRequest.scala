package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendCustomVerificationEmailRequest extends js.Object {
  /**
    * Name of a configuration set to use when sending the verification email.
    */
  var ConfigurationSetName: js.UndefOr[ConfigurationSetName] = js.undefined
  /**
    * The email address to verify.
    */
  var EmailAddress: Address
  /**
    * The name of the custom verification email template to use when sending the verification email.
    */
  var TemplateName: awsDashSdkLib.clientsSesMod.TemplateName
}

object SendCustomVerificationEmailRequest {
  @scala.inline
  def apply(
    EmailAddress: Address,
    TemplateName: TemplateName,
    ConfigurationSetName: ConfigurationSetName = null
  ): SendCustomVerificationEmailRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress, TemplateName = TemplateName)
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName)
    __obj.asInstanceOf[SendCustomVerificationEmailRequest]
  }
}

