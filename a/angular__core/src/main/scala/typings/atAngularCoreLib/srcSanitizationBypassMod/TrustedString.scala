package typings
package atAngularCoreLib.srcSanitizationBypassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrustedString
  extends nodeLib.String

object TrustedString {
  @scala.inline
  def apply(trimLeft: js.Function0[java.lang.String], trimRight: js.Function0[java.lang.String]): TrustedString = {
    val __obj = js.Dynamic.literal(trimLeft = trimLeft, trimRight = trimRight)
  
    __obj.asInstanceOf[TrustedString]
  }
}

