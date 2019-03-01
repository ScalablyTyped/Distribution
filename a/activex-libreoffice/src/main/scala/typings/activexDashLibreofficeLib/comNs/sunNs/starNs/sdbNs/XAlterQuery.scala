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
    acquire: js.Function0[scala.Unit],
    alterCommand: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAlterQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("alterCommand")(alterCommand)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAlterQuery]
  }
}

