package typings.angularGridster.mod.angularAugmentingMod.gridster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardGridsterItem extends js.Object {
  // starting column where the item will be placed
  var col: Double = js.native
  // starting row where the item will be placed
  var row: Double = js.native
  // width of the item expressed in terms of number of columns it will occupy
  var sizeX: Double = js.native
  // height of the item expressed in terms of number of rows it will occupy
  var sizeY: Double = js.native
}

object StandardGridsterItem {
  @scala.inline
  def apply(col: Double, row: Double, sizeX: Double, sizeY: Double): StandardGridsterItem = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sizeX = sizeX.asInstanceOf[js.Any], sizeY = sizeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardGridsterItem]
  }
  @scala.inline
  implicit class StandardGridsterItemOps[Self <: StandardGridsterItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeX(value: Double): Self = this.set("sizeX", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeY(value: Double): Self = this.set("sizeY", value.asInstanceOf[js.Any])
  }
  
}

