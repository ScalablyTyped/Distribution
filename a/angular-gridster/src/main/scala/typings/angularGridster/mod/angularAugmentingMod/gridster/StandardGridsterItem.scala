package typings.angularGridster.mod.angularAugmentingMod.gridster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardGridsterItem extends js.Object {
  // starting column where the item will be placed
  var col: Double
  // starting row where the item will be placed
  var row: Double
  // width of the item expressed in terms of number of columns it will occupy
  var sizeX: Double
  // height of the item expressed in terms of number of rows it will occupy
  var sizeY: Double
}

object StandardGridsterItem {
  @scala.inline
  def apply(col: Double, row: Double, sizeX: Double, sizeY: Double): StandardGridsterItem = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sizeX = sizeX.asInstanceOf[js.Any], sizeY = sizeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardGridsterItem]
  }
}

