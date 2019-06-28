package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleEmail extends js.Object {
  /**
    * The body of the email message, in HTML format. We recommend using an HTML part for email clients that support HTML. You can include links, formatted text, and more in an HTML message.
    */
  var HtmlPart: js.UndefOr[SimpleEmailPart] = js.undefined
  /**
    * The subject line, or title, of the email.
    */
  var Subject: js.UndefOr[SimpleEmailPart] = js.undefined
  /**
    * The body of the email message, in text format. We recommend using a text part for email clients that don't support HTML and clients that are connected to high-latency networks, such as mobile devices.
    */
  var TextPart: js.UndefOr[SimpleEmailPart] = js.undefined
}

object SimpleEmail {
  @scala.inline
  def apply(
    HtmlPart: SimpleEmailPart = null,
    Subject: SimpleEmailPart = null,
    TextPart: SimpleEmailPart = null
  ): SimpleEmail = {
    val __obj = js.Dynamic.literal()
    if (HtmlPart != null) __obj.updateDynamic("HtmlPart")(HtmlPart)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (TextPart != null) __obj.updateDynamic("TextPart")(TextPart)
    __obj.asInstanceOf[SimpleEmail]
  }
}

