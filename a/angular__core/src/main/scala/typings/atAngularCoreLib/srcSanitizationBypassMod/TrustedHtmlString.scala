package typings
package atAngularCoreLib.srcSanitizationBypassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedHtmlString extends TrustedString

object TrustedHtmlString {
  @scala.inline
  def apply(trimLeft: js.Function0[java.lang.String], trimRight: js.Function0[java.lang.String]): TrustedHtmlString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trimLeft")(trimLeft)
    __obj.updateDynamic("trimRight")(trimRight)
    __obj.asInstanceOf[TrustedHtmlString]
  }
}

