package typings.atAntDashDesignIconsDashReact.libComponentsIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwoToneColorPalette extends TwoToneColorPaletteSetter {
  @JSName("secondaryColor")
  var secondaryColor_TwoToneColorPalette: String
}

object TwoToneColorPalette {
  @scala.inline
  def apply(primaryColor: String, secondaryColor: String): TwoToneColorPalette = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor, secondaryColor = secondaryColor)
  
    __obj.asInstanceOf[TwoToneColorPalette]
  }
}

