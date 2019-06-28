package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignEmailMessage extends js.Object {
  /**
    * The body of the email for recipients whose email clients don't support HTML content.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The verified email address to send the email from. The default address is the FromAddress specified for the email channel for the application.
    */
  var FromAddress: js.UndefOr[__string] = js.undefined
  /**
    * The body of the email, in HTML format, for recipients whose email clients support HTML content.
    */
  var HtmlBody: js.UndefOr[__string] = js.undefined
  /**
    * The subject line, or title, of the email.
    */
  var Title: __string
}

object CampaignEmailMessage {
  @scala.inline
  def apply(Title: __string, Body: __string = null, FromAddress: __string = null, HtmlBody: __string = null): CampaignEmailMessage = {
    val __obj = js.Dynamic.literal(Title = Title)
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress)
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody)
    __obj.asInstanceOf[CampaignEmailMessage]
  }
}

