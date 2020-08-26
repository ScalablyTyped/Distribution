package typings.agGrid.sortServiceMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortOption extends js.Object {
  var column: Column = js.native
  var inverter: Double = js.native
}

object SortOption {
  @scala.inline
  def apply(column: Column, inverter: Double): SortOption = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], inverter = inverter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortOption]
  }
  @scala.inline
  implicit class SortOptionOps[Self <: SortOption] (val x: Self) extends AnyVal {
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
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setInverter(value: Double): Self = this.set("inverter", value.asInstanceOf[js.Any])
  }
  
}

