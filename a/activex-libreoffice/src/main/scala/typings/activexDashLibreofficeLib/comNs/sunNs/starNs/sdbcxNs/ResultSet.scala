package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends the SDBC {@link ResultSet} by the possibility of bookmark positioning, canceling the positioning, and updating of rows. */
trait ResultSet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCancellable
     with XRowLocate
     with XDeleteRows {
  /**
    * returns whether the result set supports updating of newly inserted rows. This may not work, as the result set may contain automatic generated data
    * which is used as key information.
    */
  var CanUpdateInsertedRows: scala.Boolean
  /** returns if the result set supports bookmark navigation. */
  var IsBookmarkable: scala.Boolean
}

