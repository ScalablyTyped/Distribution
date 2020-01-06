package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCustomVerificationEmailRequest extends js.Object {
  /**
    * Name of a configuration set to use when sending the verification email.
    */
  var ConfigurationSetName: js.UndefOr[typings.awsDashSdk.clientsSesMod.ConfigurationSetName] = js.native
  /**
    * The email address to verify.
    */
  var EmailAddress: Address = js.native
  /**
    * The name of the custom verification email template to use when sending the verification email.
    */
  var TemplateName: typings.awsDashSdk.clientsSesMod.TemplateName = js.native
}

object SendCustomVerificationEmailRequest {
  @scala.inline
  def apply(
    EmailAddress: Address,
    TemplateName: TemplateName,
    ConfigurationSetName: ConfigurationSetName = null
  ): SendCustomVerificationEmailRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any])
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCustomVerificationEmailRequest]
  }
}

