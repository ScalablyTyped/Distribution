package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.JSDocTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends JSDocTag {
  var tagName: js.UndefOr[scala.Nothing] = js.undefined
  var text: String
}

object Text {
  @scala.inline
  def apply(text: String): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

