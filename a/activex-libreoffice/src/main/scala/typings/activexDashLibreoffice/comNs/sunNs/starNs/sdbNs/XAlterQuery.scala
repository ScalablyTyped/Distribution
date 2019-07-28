package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to alter the command of a query. */
trait XAlterQuery extends XInterface {
  /**
    * is intended to alter the command of a query object.
    * @param command the SQL statement
    * @param useEscapeProcessing `TRUE` when escape processing should be used
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def alterCommand(command: String, useEscapeProcessing: Boolean): Unit
}

object XAlterQuery {
  @scala.inline
  def apply(
    acquire: () => Unit,
    alterCommand: (String, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAlterQuery = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), alterCommand = js.Any.fromFunction2(alterCommand), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAlterQuery]
  }
}

