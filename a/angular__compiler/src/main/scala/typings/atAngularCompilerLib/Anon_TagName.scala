package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TagName
  extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocTag {
  var tagName: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocTagName | java.lang.String
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TagName {
  @scala.inline
  def apply(
    tagName: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocTagName | java.lang.String,
    text: java.lang.String = null
  ): Anon_TagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_TagName]
  }
}

