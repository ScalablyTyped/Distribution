package typings.activexLibreoffice.com_.sun.star.table

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a cell address within a spreadsheet document. */
@js.native
trait CellAddress extends js.Object {
  /** is the index of the column where the cell is located. */
  var Column: Double = js.native
  /** is the index of the row where the cell is located. */
  var Row: Double = js.native
  /** is the index of the sheet that contains the cell. */
  var Sheet: Double = js.native
}

object CellAddress {
  @scala.inline
  def apply(Column: Double, Row: Double, Sheet: Double): CellAddress = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAddress]
  }
  @scala.inline
  implicit class CellAddressOps[Self <: CellAddress] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("Row", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheet(value: Double): Self = this.set("Sheet", value.asInstanceOf[js.Any])
  }
  
}

