package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[CardImage] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: CardType
}

object Card {
  @scala.inline
  def apply(
    `type`: CardType,
    content: String = null,
    image: CardImage = null,
    text: String = null,
    title: String = null
  ): Card = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (image != null) __obj.updateDynamic("image")(image)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Card]
  }
}

