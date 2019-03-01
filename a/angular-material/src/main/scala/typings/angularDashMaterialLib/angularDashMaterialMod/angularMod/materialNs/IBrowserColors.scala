package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrowserColors extends js.Object {
  var hue: java.lang.String
  var palette: java.lang.String
  var theme: java.lang.String
}

object IBrowserColors {
  @scala.inline
  def apply(hue: java.lang.String, palette: java.lang.String, theme: java.lang.String): IBrowserColors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hue")(hue)
    __obj.updateDynamic("palette")(palette)
    __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IBrowserColors]
  }
}

