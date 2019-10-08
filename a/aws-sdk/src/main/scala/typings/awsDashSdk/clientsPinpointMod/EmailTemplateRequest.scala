package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplateRequest extends js.Object {
  /**
    * The message body, in HTML format, to use in email messages that are based on the message template. We recommend using HTML format for email clients that support HTML. You can include links, formatted text, and more in an HTML message.
    */
  var HtmlPart: js.UndefOr[__string] = js.undefined
  /**
    * The subject line, or title, to use in email messages that are based on the message template.
    */
  var Subject: js.UndefOr[__string] = js.undefined
  /**
    * The message body, in text format, to use in email messages that are based on the message template. We recommend using text format for email clients that don't support HTML and clients that are connected to high-latency networks, such as mobile devices.
    */
  var TextPart: js.UndefOr[__string] = js.undefined
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object EmailTemplateRequest {
  @scala.inline
  def apply(
    HtmlPart: __string = null,
    Subject: __string = null,
    TextPart: __string = null,
    tags: MapOf__string = null
  ): EmailTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[EmailTemplateRequest]
  }
}

