package typings.antDesignIcons.componentsIconBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoToneColorPaletteSetter extends js.Object {
  var primaryColor: String
  var secondaryColor: js.UndefOr[String] = js.undefined
}

object TwoToneColorPaletteSetter {
  @scala.inline
  def apply(primaryColor: String, secondaryColor: String = null): TwoToneColorPaletteSetter = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwoToneColorPaletteSetter]
  }
}

