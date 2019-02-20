package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the children of a folder content.
  *
  * It can be understand as a table containing a row for each child. The table columns may contain values of properties of the children.
  */
trait ContentResultSet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSet
     with XContentAccess {
  /**
    * controls the travel mode of the result set cursor.
    *
    * There are two possible travel modes:
    *
    * {{table here, see documentation}}
    *
    * The following pseudo-code illustrates the usage of a non-blocking cursor:
    *
    * {{program example here, see documentation}}
    *
    *
    *
    * If this property is not supported, the implementation needs to provide a blocking cursor.
    *
    * The implementation initially needs to set the value of this property to CursorTravelMode::BLOCKING.
    * @see CursorTravelMode
    */
  var CursorTravelMode: scala.Double
  /** indicates that all rows of the result set have been obtained. */
  var IsRowCountFinal: scala.Boolean
  /** contains the number of rows obtained (so far) from the data source. */
  var RowCount: scala.Double
}

