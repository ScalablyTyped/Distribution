package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import typings.actionsOnGoogle.actionsOnGoogleStrings.list_card
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1MessageList
  extends DialogflowV1BaseGoogleMessage[list_card]
     with DialogflowV1Message {
  var items: js.UndefOr[js.Array[DialogflowV1MessageOptionItem]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DialogflowV1MessageList {
  @scala.inline
  def apply(
    platform: google,
    items: js.Array[DialogflowV1MessageOptionItem] = null,
    title: String = null,
    `type`: list_card = null
  ): DialogflowV1MessageList = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageList]
  }
}

