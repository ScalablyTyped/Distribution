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
    val __obj = js.Dynamic.literal(height = height, offsetX = offsetX, offsetY = offsetY, width = width)
  
    __obj.asInstanceOf[TileDesc]
  }
}

