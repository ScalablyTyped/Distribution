package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines a column used for a result set which contains the data definition and the data of the column of the current row of a result set. */
trait DataColumn
  extends ResultColumn
     with XColumn
     with XColumnUpdate {
  /** contains the original value of the column. */
  var OriginalValue: js.Any
  /**
    * contains the column's value. This could be a constraint property, to veto modifications, if a new value does not fit into rules defined for the
    * column.
    */
  var Value: js.Any
}

