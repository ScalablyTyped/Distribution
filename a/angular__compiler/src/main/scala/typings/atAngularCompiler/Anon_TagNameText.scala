package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TagNameText extends JSDocTag {
  var tagName: js.UndefOr[scala.Nothing] = js.undefined
  var text: String
}

object Anon_TagNameText {
  @scala.inline
  def apply(text: String, tagName: js.UndefOr[scala.Nothing] = js.undefined): Anon_TagNameText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(tagName)) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TagNameText]
  }
}

