package typings.antDesignIcons.iconBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoToneColorPalette extends TwoToneColorPaletteSetter {
  var calculated: js.UndefOr[Boolean] = js.undefined
}

object TwoToneColorPalette {
  @scala.inline
  def apply(
    primaryColor: String,
    calculated: js.UndefOr[Boolean] = js.undefined,
    secondaryColor: String = null
  ): TwoToneColorPalette = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
    if (!js.isUndefined(calculated)) __obj.updateDynamic("calculated")(calculated.get.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoToneColorPalette]
  }
}

