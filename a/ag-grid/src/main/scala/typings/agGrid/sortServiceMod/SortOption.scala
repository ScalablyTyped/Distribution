package typings.agGrid.sortServiceMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortOption extends js.Object {
  var column: Column
  var inverter: Double
}

object SortOption {
  @scala.inline
  def apply(column: Column, inverter: Double): SortOption = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], inverter = inverter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortOption]
  }
}

