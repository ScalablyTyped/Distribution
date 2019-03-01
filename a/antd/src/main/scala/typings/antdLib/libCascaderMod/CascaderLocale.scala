package typings
package antdLib.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderLocale extends js.Object {
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
}

object CascaderLocale {
  @scala.inline
  def apply(placeholder: java.lang.String = null): CascaderLocale = {
    val __obj = js.Dynamic.literal()
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    __obj.asInstanceOf[CascaderLocale]
  }
}

