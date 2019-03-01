package typings
package atAntDashDesignIconsDashReactLib.libComponentsIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoToneColorPaletteSetter extends js.Object {
  var primaryColor: java.lang.String
  var secondaryColor: js.UndefOr[java.lang.String] = js.undefined
}

object TwoToneColorPaletteSetter {
  @scala.inline
  def apply(primaryColor: java.lang.String, secondaryColor: java.lang.String = null): TwoToneColorPaletteSetter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("primaryColor")(primaryColor)
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor)
    __obj.asInstanceOf[TwoToneColorPaletteSetter]
  }
}

