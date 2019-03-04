package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for creating and appending new objects to a specific container. */
trait XAlterTable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * is intended to alter an existing column identified by its position. This operation must be atomic, in that it is done in one step.s
    * @param index the position of the column to alter
    * @param descriptor the new descriptor for the new column
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not denote an existing column.
    */
  def alterColumnByIndex(index: scala.Double, descriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
  /**
    * is intended to alter an existing column identified by its name. This operation must be atomic, in that it is done in one step.s
    * @param colName the column name which to alter
    * @param descriptor the new descriptor for the new column
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def alterColumnByName(
    colName: java.lang.String,
    descriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  ): scala.Unit
}

object XAlterTable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    alterColumnByIndex: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Unit
    ],
    alterColumnByName: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAlterTable = {
    val __obj = js.Dynamic.literal(acquire = acquire, alterColumnByIndex = alterColumnByIndex, alterColumnByName = alterColumnByName, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAlterTable]
  }
}

