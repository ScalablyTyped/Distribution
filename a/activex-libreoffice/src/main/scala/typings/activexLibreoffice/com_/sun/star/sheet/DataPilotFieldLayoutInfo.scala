package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains the layout information of a {@link DataPilotField} . */
trait DataPilotFieldLayoutInfo extends js.Object {
  /** If `TRUE` , an empty row is inserted in the {@link DataPilotTable} result table after the data (including the subtotals) for each item of the field. */
  var AddEmptyLines: Boolean
  /**
    * specifies the layout mode.
    * @see com.sun.star.sheet.DataPilotFieldLayoutMode
    */
  var LayoutMode: Double
}

object DataPilotFieldLayoutInfo {
  @scala.inline
  def apply(AddEmptyLines: Boolean, LayoutMode: Double): DataPilotFieldLayoutInfo = {
    val __obj = js.Dynamic.literal(AddEmptyLines = AddEmptyLines.asInstanceOf[js.Any], LayoutMode = LayoutMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldLayoutInfo]
  }
}

