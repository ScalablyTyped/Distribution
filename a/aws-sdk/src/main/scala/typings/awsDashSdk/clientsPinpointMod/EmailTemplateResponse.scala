package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The date when the message template was created.
    */
  var CreationDate: __string
  /**
    * The message body, in HTML format, that's used in email messages that are based on the message template.
    */
  var HtmlPart: js.UndefOr[__string] = js.undefined
  /**
    * The date when the message template was last modified.
    */
  var LastModifiedDate: __string
  /**
    * The subject line, or title, that's used in email messages that are based on the message template.
    */
  var Subject: js.UndefOr[__string] = js.undefined
  /**
    * The name of the message template.
    */
  var TemplateName: __string
  /**
    * The type of channel that the message template is designed for. For an email template, this value is EMAIL.
    */
  var TemplateType: typings.awsDashSdk.clientsPinpointMod.TemplateType
  /**
    * The message body, in text format, that's used in email messages that are based on the message template.
    */
  var TextPart: js.UndefOr[__string] = js.undefined
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the message template. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object EmailTemplateResponse {
  @scala.inline
  def apply(
    CreationDate: __string,
    LastModifiedDate: __string,
    TemplateName: __string,
    TemplateType: TemplateType,
    Arn: __string = null,
    HtmlPart: __string = null,
    Subject: __string = null,
    TextPart: __string = null,
    tags: MapOf__string = null
  ): EmailTemplateResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate, LastModifiedDate = LastModifiedDate, TemplateName = TemplateName, TemplateType = TemplateType.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[EmailTemplateResponse]
  }
}

