package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemePalette extends js.Object {
  var hues: IThemeHues
  var name: java.lang.String
}

object IThemePalette {
  @scala.inline
  def apply(hues: IThemeHues, name: java.lang.String): IThemePalette = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hues")(hues)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[IThemePalette]
  }
}

