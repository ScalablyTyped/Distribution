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

