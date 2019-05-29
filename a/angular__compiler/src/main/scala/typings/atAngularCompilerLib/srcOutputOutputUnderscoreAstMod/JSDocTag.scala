package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSDocTag extends js.Object {
  var tagName: js.UndefOr[JSDocTagName | java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object JSDocTag {
  @scala.inline
  def apply(tagName: JSDocTagName | java.lang.String = null, text: java.lang.String = null): JSDocTag = {
    val __obj = js.Dynamic.literal()
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[JSDocTag]
  }
}

