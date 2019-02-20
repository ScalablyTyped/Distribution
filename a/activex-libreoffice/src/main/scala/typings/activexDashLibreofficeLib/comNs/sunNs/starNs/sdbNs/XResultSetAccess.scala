package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the interface to create a {@link com.sun.star.sdbc.ResultSet} based on the object providing the interface. */
trait XResultSetAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a new {@link com.sun.star.sdbc.ResultSet} based on the object.
    * @returns the new created {@link ResultSet} object
    */
  def createResultSet(): activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet
}

