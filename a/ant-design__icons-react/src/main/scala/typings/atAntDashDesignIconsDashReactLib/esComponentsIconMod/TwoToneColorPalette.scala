package typings
package atAntDashDesignIconsDashReactLib.esComponentsIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoToneColorPalette extends TwoToneColorPaletteSetter {
  @JSName("secondaryColor")
  var secondaryColor_TwoToneColorPalette: java.lang.String
}

object TwoToneColorPalette {
  @scala.inline
  def apply(primaryColor: java.lang.String, secondaryColor: java.lang.String): TwoToneColorPalette = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("primaryColor")(primaryColor)
    __obj.updateDynamic("secondaryColor")(secondaryColor)
    __obj.asInstanceOf[TwoToneColorPalette]
  }
}

