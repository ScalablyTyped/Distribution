package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailTemplateRequest extends js.Object {
  /**
    * A JSON object that specifies the default values to use for message variables in the message template. This object is a set of key-value pairs. Each key defines a message variable in the template. The corresponding value defines the default value for that variable. When you create a message that's based on the template, you can override these defaults with message-specific and address-specific variables and values.
    */
  var DefaultSubstitutions: js.UndefOr[__string] = js.native
  /**
    * The message body, in HTML format, to use in email messages that are based on the message template. We recommend using HTML format for email clients that render HTML content. You can include links, formatted text, and more in an HTML message.
    */
  var HtmlPart: js.UndefOr[__string] = js.native
  /**
    * The subject line, or title, to use in email messages that are based on the message template.
    */
  var Subject: js.UndefOr[__string] = js.native
  /**
    * A custom description of the message template.
    */
  var TemplateDescription: js.UndefOr[__string] = js.native
  /**
    * The message body, in plain text format, to use in email messages that are based on the message template. We recommend using plain text format for email clients that don't render HTML content and clients that are connected to high-latency networks, such as mobile devices.
    */
  var TextPart: js.UndefOr[__string] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.native
}

object EmailTemplateRequest {
  @scala.inline
  def apply(
    DefaultSubstitutions: __string = null,
    HtmlPart: __string = null,
    Subject: __string = null,
    TemplateDescription: __string = null,
    TextPart: __string = null,
    tags: MapOf__string = null
  ): EmailTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (DefaultSubstitutions != null) __obj.updateDynamic("DefaultSubstitutions")(DefaultSubstitutions.asInstanceOf[js.Any])
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart.asInstanceOf[js.Any])
    if (Subject != null) __obj.updateDynamic("Subject")(Subject.asInstanceOf[js.Any])
    if (TemplateDescription != null) __obj.updateDynamic("TemplateDescription")(TemplateDescription.asInstanceOf[js.Any])
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailTemplateRequest]
  }
}

