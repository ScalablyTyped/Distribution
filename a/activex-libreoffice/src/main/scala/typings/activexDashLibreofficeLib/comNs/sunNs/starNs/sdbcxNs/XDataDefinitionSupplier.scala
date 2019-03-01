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

object XDataDefinitionSupplier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDataDefinitionByConnection: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection, XTablesSupplier],
    getDataDefinitionByURL: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      XTablesSupplier
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDataDefinitionSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDataDefinitionByConnection")(getDataDefinitionByConnection)
    __obj.updateDynamic("getDataDefinitionByURL")(getDataDefinitionByURL)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDataDefinitionSupplier]
  }
}

