package typings
package angularDashGridsterLib.angularDashGridsterMod.angularMod.gridsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardGridsterItem extends js.Object {
  // starting column where the item will be placed
  var col: scala.Double
  // starting row where the item will be placed
  var row: scala.Double
  // width of the item expressed in terms of number of columns it will occupy
  var sizeX: scala.Double
  // height of the item expressed in terms of number of rows it will occupy
  var sizeY: scala.Double
}

object StandardGridsterItem {
  @scala.inline
  def apply(col: scala.Double, row: scala.Double, sizeX: scala.Double, sizeY: scala.Double): StandardGridsterItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("col")(col)
    __obj.updateDynamic("row")(row)
    __obj.updateDynamic("sizeX")(sizeX)
    __obj.updateDynamic("sizeY")(sizeY)
    __obj.asInstanceOf[StandardGridsterItem]
  }
}

