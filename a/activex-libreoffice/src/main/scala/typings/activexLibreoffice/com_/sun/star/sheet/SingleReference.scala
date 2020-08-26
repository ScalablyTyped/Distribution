package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a reference to a single cell. */
@js.native
trait SingleReference extends js.Object {
  /** is the absolute column number. */
  var Column: Double = js.native
  /**
    * contains flags.
    * @see ReferenceFlags
    */
  var Flags: Double = js.native
  /** is the relative column number. */
  var RelativeColumn: Double = js.native
  /** is the relative row number. */
  var RelativeRow: Double = js.native
  /** is the relative sheet number. */
  var RelativeSheet: Double = js.native
  /** is the absolute row number. */
  var Row: Double = js.native
  /** is the absolute sheet number. */
  var Sheet: Double = js.native
}

object SingleReference {
  @scala.inline
  def apply(
    Column: Double,
    Flags: Double,
    RelativeColumn: Double,
    RelativeRow: Double,
    RelativeSheet: Double,
    Row: Double,
    Sheet: Double
  ): SingleReference = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], RelativeColumn = RelativeColumn.asInstanceOf[js.Any], RelativeRow = RelativeRow.asInstanceOf[js.Any], RelativeSheet = RelativeSheet.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleReference]
  }
  @scala.inline
  implicit class SingleReferenceOps[Self <: SingleReference] (val x: Self) extends AnyVal {
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
    def setFlags(value: Double): Self = this.set("Flags", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeColumn(value: Double): Self = this.set("RelativeColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeRow(value: Double): Self = this.set("RelativeRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeSheet(value: Double): Self = this.set("RelativeSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("Row", value.asInstanceOf[js.Any])
    @scala.inline
    def setSheet(value: Double): Self = this.set("Sheet", value.asInstanceOf[js.Any])
  }
  
}

