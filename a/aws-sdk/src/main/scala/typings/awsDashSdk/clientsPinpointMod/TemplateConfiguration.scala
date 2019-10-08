package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateConfiguration extends js.Object {
  /**
    * The email template to use for the message.
    */
  var EmailTemplate: js.UndefOr[Template] = js.undefined
  /**
    * The push notification template to use for the message.
    */
  var PushTemplate: js.UndefOr[Template] = js.undefined
  /**
    * The SMS template to use for the message.
    */
  var SMSTemplate: js.UndefOr[Template] = js.undefined
}

object TemplateConfiguration {
  @scala.inline
  def apply(EmailTemplate: Template = null, PushTemplate: Template = null, SMSTemplate: Template = null): TemplateConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EmailTemplate != null) __obj.updateDynamic("EmailTemplate")(EmailTemplate)
    if (PushTemplate != null) __obj.updateDynamic("PushTemplate")(PushTemplate)
    if (SMSTemplate != null) __obj.updateDynamic("SMSTemplate")(SMSTemplate)
    __obj.asInstanceOf[TemplateConfiguration]
  }
}

