package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.JSDocTag
import typings.angularCompiler.outputAstMod.JSDocTagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagName extends JSDocTag {
  var tagName: JSDocTagName | String
  var text: js.UndefOr[String] = js.undefined
}

object TagName {
  @scala.inline
  def apply(tagName: JSDocTagName | String, text: String = null): TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
}

