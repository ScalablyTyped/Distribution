package typings
package atAngularCoreLib.srcSanitizationBypassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedScriptString extends TrustedString

object TrustedScriptString {
  @scala.inline
  def apply(trimLeft: js.Function0[java.lang.String], trimRight: js.Function0[java.lang.String]): TrustedScriptString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trimLeft")(trimLeft)
    __obj.updateDynamic("trimRight")(trimRight)
    __obj.asInstanceOf[TrustedScriptString]
  }
}

