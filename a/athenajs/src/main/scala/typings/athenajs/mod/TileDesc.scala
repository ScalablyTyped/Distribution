package typings.athenajs.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TileDesc]
  }
}

