package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemePalette extends js.Object {
  var hues: IThemeHues
  var name: String
}

object IThemePalette {
  @scala.inline
  def apply(hues: IThemeHues, name: String): IThemePalette = {
    val __obj = js.Dynamic.literal(hues = hues.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemePalette]
  }
}

