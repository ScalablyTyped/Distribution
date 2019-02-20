package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.toolsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to alter the indexes of a table.
  * @see com.sun.star.sdb.DataSource.Settings
  * @see com.sun.star.sdbcx.XAppend
  * @see com.sun.star.sdbcx.XDrop
  * @since OOo 3.3
  */
trait XIndexAlteration extends XConnectionSupplier {
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param table the table to be altered
    * @param descriptor the descriptor which should be serve to append a new object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def addIndex(
    table: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    descriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  ): scala.Unit
  /**
    * drops an object of the related container identified by its name.
    * @param table the table to be altered
    * @param index the name of the column to be dropped
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropIndex(table: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, index: java.lang.String): scala.Unit
}

