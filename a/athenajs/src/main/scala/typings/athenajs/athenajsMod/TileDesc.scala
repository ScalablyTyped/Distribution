package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileDesc extends js.Object {
  var height: Double
  var offsetX: Double
  var offsetY: Double
  var width: Double
}

object TileDesc {
  @scala.inline
  def apply(height: Double, offsetX: Double, offsetY: Double, width: Double): TileDesc = {
    val __obj = js.Dynamic.literal(height = height, offsetX = offsetX, offsetY = offsetY, width = width)
  
    __obj.asInstanceOf[TileDesc]
  }
}

