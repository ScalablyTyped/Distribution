package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TagNameText
  extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocTag {
  var tagName: js.UndefOr[scala.Nothing] = js.undefined
  var text: java.lang.String
}

object Anon_TagNameText {
  @scala.inline
  def apply(text: java.lang.String, tagName: js.UndefOr[scala.Nothing] = js.undefined): Anon_TagNameText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    if (!js.isUndefined(tagName)) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[Anon_TagNameText]
  }
}

