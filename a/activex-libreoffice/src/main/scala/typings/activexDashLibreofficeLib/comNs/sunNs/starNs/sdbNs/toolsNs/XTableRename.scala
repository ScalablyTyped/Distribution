package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to rename table.
  * @see com.sun.star.sdb.DataSource.Settings
  * @since OOo 3.3
  */
trait XTableRename extends XConnectionSupplier {
  /**
    * rename the given table to the new name
    * @param table the table to be renamed
    * @param newName the new name of the table
    * @throws com::sun::star::sdbc::SQLException
    */
  def rename(
    table: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    newName: java.lang.String
  ): scala.Unit
}

object XTableRename {
  @scala.inline
  def apply(
    ActiveConnection: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XConnection,
    acquire: () => scala.Unit,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    rename: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, java.lang.String) => scala.Unit
  ): XTableRename = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection, acquire = js.Any.fromFunction0(acquire), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), rename = js.Any.fromFunction2(rename))
  
    __obj.asInstanceOf[XTableRename]
  }
}

