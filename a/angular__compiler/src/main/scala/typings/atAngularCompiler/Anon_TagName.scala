package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.JSDocTag
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.JSDocTagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TagName extends JSDocTag {
  var tagName: JSDocTagName | String
  var text: js.UndefOr[String] = js.undefined
}

object Anon_TagName {
  @scala.inline
  def apply(tagName: JSDocTagName | String, text: String = null): Anon_TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TagName]
  }
}

