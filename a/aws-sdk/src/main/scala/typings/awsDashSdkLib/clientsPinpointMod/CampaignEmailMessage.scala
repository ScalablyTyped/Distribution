package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignEmailMessage extends js.Object {
  /**
    * The email text body.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
    */
  var FromAddress: js.UndefOr[__string] = js.undefined
  /**
    * The email html body.
    */
  var HtmlBody: js.UndefOr[__string] = js.undefined
  /**
    * The email title (Or subject).
    */
  var Title: js.UndefOr[__string] = js.undefined
}

object CampaignEmailMessage {
  @scala.inline
  def apply(
    Body: __string = null,
    FromAddress: __string = null,
    HtmlBody: __string = null,
    Title: __string = null
  ): CampaignEmailMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress)
    if (HtmlBody != null) __obj.updateDynamic("HtmlBody")(HtmlBody)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[CampaignEmailMessage]
  }
}

