package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateConfiguration extends js.Object {
  /**
    * The email template to use for the message.
    */
  var EmailTemplate: js.UndefOr[Template] = js.native
  /**
    * The push notification template to use for the message.
    */
  var PushTemplate: js.UndefOr[Template] = js.native
  /**
    * The SMS template to use for the message.
    */
  var SMSTemplate: js.UndefOr[Template] = js.native
  /**
    * The voice template to use for the message.
    */
  var VoiceTemplate: js.UndefOr[Template] = js.native
}

object TemplateConfiguration {
  @scala.inline
  def apply(
    EmailTemplate: Template = null,
    PushTemplate: Template = null,
    SMSTemplate: Template = null,
    VoiceTemplate: Template = null
  ): TemplateConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EmailTemplate != null) __obj.updateDynamic("EmailTemplate")(EmailTemplate.asInstanceOf[js.Any])
    if (PushTemplate != null) __obj.updateDynamic("PushTemplate")(PushTemplate.asInstanceOf[js.Any])
    if (SMSTemplate != null) __obj.updateDynamic("SMSTemplate")(SMSTemplate.asInstanceOf[js.Any])
    if (VoiceTemplate != null) __obj.updateDynamic("VoiceTemplate")(VoiceTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateConfiguration]
  }
}

