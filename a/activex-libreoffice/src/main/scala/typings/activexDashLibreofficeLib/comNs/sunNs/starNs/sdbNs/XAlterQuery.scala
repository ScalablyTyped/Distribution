package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to alter the command of a query. */
trait XAlterQuery
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * is intended to alter the command of a query object.
    * @param command the SQL statement
    * @param useEscapeProcessing `TRUE` when escape processing should be used
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def alterCommand(command: java.lang.String, useEscapeProcessing: scala.Boolean): scala.Unit
}

object XAlterQuery {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    alterCommand: (java.lang.String, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XAlterQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), alterCommand = js.Any.fromFunction2(alterCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAlterQuery]
  }
}

