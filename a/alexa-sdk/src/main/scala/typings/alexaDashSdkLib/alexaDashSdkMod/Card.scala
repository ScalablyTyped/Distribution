package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var image: js.UndefOr[CardImage] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: CardType
}

object Card {
  @scala.inline
  def apply(
    `type`: CardType,
    content: java.lang.String = null,
    image: CardImage = null,
    text: java.lang.String = null,
    title: java.lang.String = null
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

