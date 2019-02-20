package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** indicates the type of change action on the data source. */
trait RowChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * indicates the type of change.
    * @see com.sun.star.sdb.RowChangeAction
    */
  var Action: scala.Double
  /** indicates the number of rows affected by the change. */
  var Rows: scala.Double
}

