package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes how to sort a single {@link DataPilotField} */
trait DataPilotFieldSortInfo extends js.Object {
  /** contains the data field to sort by if the Mode is DATA */
  var Field: String
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var IsAscending: Boolean
  /**
    * contains the sort mode
    * @see com.sun.star.sheet.DataPilotFieldSortMode
    */
  var Mode: Double
}

object DataPilotFieldSortInfo {
  @scala.inline
  def apply(Field: String, IsAscending: Boolean, Mode: Double): DataPilotFieldSortInfo = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], IsAscending = IsAscending.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldSortInfo]
  }
}

