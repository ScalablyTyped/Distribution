package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes how to sort a single {@link DataPilotField} */
trait DataPilotFieldSortInfo extends js.Object {
  /** contains the data field to sort by if the Mode is DATA */
  var Field: java.lang.String
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var IsAscending: scala.Boolean
  /**
    * contains the sort mode
    * @see com.sun.star.sheet.DataPilotFieldSortMode
    */
  var Mode: scala.Double
}

