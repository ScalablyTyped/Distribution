package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to data definition beans from a connected database. */
trait XDataDefinitionSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns at least the container of tables related to the given connection.
    * @param connection the related connection
    * @returns the container
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDataDefinitionByConnection(connection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection): XTablesSupplier
  /**
    * returns at least the container of tables related to the given Database URL.
    * @param url a database url of the form sdbc:subprotocol:subname
    * @param info a list of arbitrary string tag/value pairs as connection arguments; normally at least a "user" and "password" property should be included
    * @returns the container
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def getDataDefinitionByURL(
    url: java.lang.String,
    info: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): XTablesSupplier
}

