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

