package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeGrayScalePalette extends js.Object {
  var `1`: String
  var `2`: String
  var `3`: String
  var `4`: String
  var name: String
}

object IThemeGrayScalePalette {
  @scala.inline
  def apply(`1`: String, `2`: String, `3`: String, `4`: String, name: String): IThemeGrayScalePalette = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeGrayScalePalette]
  }
}

