package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileDesc extends js.Object {
  var height: scala.Double
  var offsetX: scala.Double
  var offsetY: scala.Double
  var width: scala.Double
}

object TileDesc {
  @scala.inline
  def apply(height: scala.Double, offsetX: scala.Double, offsetY: scala.Double, width: scala.Double): TileDesc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("offsetX")(offsetX)
    __obj.updateDynamic("offsetY")(offsetY)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TileDesc]
  }
}

