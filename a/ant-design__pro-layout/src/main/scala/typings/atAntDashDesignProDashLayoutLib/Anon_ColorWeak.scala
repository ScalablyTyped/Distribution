package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorWeak extends js.Object {
  var colorWeak: js.UndefOr[scala.Boolean] = js.undefined
  var primaryColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorWeak {
  @scala.inline
  def apply(colorWeak: js.UndefOr[scala.Boolean] = js.undefined, primaryColor: java.lang.String = null): Anon_ColorWeak = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak)
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor)
    __obj.asInstanceOf[Anon_ColorWeak]
  }
}

