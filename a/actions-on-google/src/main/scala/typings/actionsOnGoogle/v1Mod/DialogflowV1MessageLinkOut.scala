package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.actionsOnGoogleStrings.link_out_chip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageLinkOut
  extends DialogflowV1BaseGoogleMessage[link_out_chip]
     with DialogflowV1Message {
  var destinationName: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageLinkOut {
  @scala.inline
  def apply(platform: google, destinationName: String = null, `type`: link_out_chip = null, url: String = null): DialogflowV1MessageLinkOut = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageLinkOut]
  }
}

