package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeHues extends js.Object {
  var default: js.UndefOr[String] = js.undefined
  var `hue-1`: js.UndefOr[String] = js.undefined
  var `hue-2`: js.UndefOr[String] = js.undefined
  var `hue-3`: js.UndefOr[String] = js.undefined
}

object IThemeHues {
  @scala.inline
  def apply(default: String = null, `hue-1`: String = null, `hue-2`: String = null, `hue-3`: String = null): IThemeHues = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (`hue-1` != null) __obj.updateDynamic("hue-1")(`hue-1`.asInstanceOf[js.Any])
    if (`hue-2` != null) __obj.updateDynamic("hue-2")(`hue-2`.asInstanceOf[js.Any])
    if (`hue-3` != null) __obj.updateDynamic("hue-3")(`hue-3`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeHues]
  }
}

