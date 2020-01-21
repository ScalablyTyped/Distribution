package typings.angularCompiler.outputAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.angularCompiler.AnonTagName
  - typings.angularCompiler.AnonTagNameText
*/
trait JSDocTag extends js.Object

object JSDocTag {
  @scala.inline
  def AnonTagName(tagName: JSDocTagName | String, text: String = null): JSDocTag = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTag]
  }
  @scala.inline
  def AnonTagNameText(text: String, tagName: js.UndefOr[scala.Nothing] = js.undefined): JSDocTag = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(tagName)) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocTag]
  }
}

