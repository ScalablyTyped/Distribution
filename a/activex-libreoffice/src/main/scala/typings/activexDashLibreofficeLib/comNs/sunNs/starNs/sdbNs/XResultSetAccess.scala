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

object XResultSetAccess {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createResultSet: () => activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XResultSetAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createResultSet = js.Any.fromFunction0(createResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XResultSetAccess]
  }
}

