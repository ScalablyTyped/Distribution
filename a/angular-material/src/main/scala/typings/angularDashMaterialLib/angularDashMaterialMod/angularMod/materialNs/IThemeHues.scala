package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeHues extends js.Object {
  var default: js.UndefOr[java.lang.String] = js.undefined
  var `hue-1`: js.UndefOr[java.lang.String] = js.undefined
  var `hue-2`: js.UndefOr[java.lang.String] = js.undefined
  var `hue-3`: js.UndefOr[java.lang.String] = js.undefined
}

object IThemeHues {
  @scala.inline
  def apply(
    default: java.lang.String = null,
    `hue-1`: java.lang.String = null,
    `hue-2`: java.lang.String = null,
    `hue-3`: java.lang.String = null
  ): IThemeHues = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default)
    if (`hue-1` != null) __obj.updateDynamic("hue-1")(`hue-1`)
    if (`hue-2` != null) __obj.updateDynamic("hue-2")(`hue-2`)
    if (`hue-3` != null) __obj.updateDynamic("hue-3")(`hue-3`)
    __obj.asInstanceOf[IThemeHues]
  }
}

