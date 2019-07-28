package typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSDocTag extends js.Object {
  var tagName: js.UndefOr[JSDocTagName | String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object JSDocTag {
  @scala.inline
  def apply(tagName: JSDocTagName | String = null, text: String = null): JSDocTag = {
    val __obj = js.Dynamic.literal()
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[JSDocTag]
  }
}

