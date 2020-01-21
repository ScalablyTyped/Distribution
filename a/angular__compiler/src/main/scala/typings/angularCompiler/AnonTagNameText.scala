package typings.angularCompiler

import typings.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTagNameText extends JSDocTag {
  var tagName: js.UndefOr[scala.Nothing] = js.undefined
  var text: String
}

object AnonTagNameText {
  @scala.inline
  def apply(text: String, tagName: js.UndefOr[scala.Nothing] = js.undefined): AnonTagNameText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(tagName)) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTagNameText]
  }
}

