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
    acquire: js.Function0[scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    rename: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      java.lang.String, 
      scala.Unit
    ]
  ): XTableRename = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveConnection")(ActiveConnection)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("rename")(rename)
    __obj.asInstanceOf[XTableRename]
  }
}

