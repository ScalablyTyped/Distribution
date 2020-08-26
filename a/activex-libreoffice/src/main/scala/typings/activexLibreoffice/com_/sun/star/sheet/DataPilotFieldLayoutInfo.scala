package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the layout information of a {@link DataPilotField} . */
@js.native
trait DataPilotFieldLayoutInfo extends js.Object {
  /** If `TRUE` , an empty row is inserted in the {@link DataPilotTable} result table after the data (including the subtotals) for each item of the field. */
  var AddEmptyLines: Boolean = js.native
  /**
    * specifies the layout mode.
    * @see com.sun.star.sheet.DataPilotFieldLayoutMode
    */
  var LayoutMode: Double = js.native
}

object DataPilotFieldLayoutInfo {
  @scala.inline
  def apply(AddEmptyLines: Boolean, LayoutMode: Double): DataPilotFieldLayoutInfo = {
    val __obj = js.Dynamic.literal(AddEmptyLines = AddEmptyLines.asInstanceOf[js.Any], LayoutMode = LayoutMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldLayoutInfo]
  }
  @scala.inline
  implicit class DataPilotFieldLayoutInfoOps[Self <: DataPilotFieldLayoutInfo] (val x: Self) extends AnyVal {
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
    def setAddEmptyLines(value: Boolean): Self = this.set("AddEmptyLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayoutMode(value: Double): Self = this.set("LayoutMode", value.asInstanceOf[js.Any])
  }
  
}

