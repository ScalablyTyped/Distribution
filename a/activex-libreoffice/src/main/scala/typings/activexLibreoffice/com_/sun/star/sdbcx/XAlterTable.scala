package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for creating and appending new objects to a specific container. */
@js.native
trait XAlterTable extends XInterface {
  /**
    * is intended to alter an existing column identified by its position. This operation must be atomic, in that it is done in one step.s
    * @param index the position of the column to alter
    * @param descriptor the new descriptor for the new column
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not denote an existing column.
    */
  def alterColumnByIndex(index: Double, descriptor: XPropertySet): Unit = js.native
  /**
    * is intended to alter an existing column identified by its name. This operation must be atomic, in that it is done in one step.s
    * @param colName the column name which to alter
    * @param descriptor the new descriptor for the new column
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def alterColumnByName(colName: String, descriptor: XPropertySet): Unit = js.native
}

object XAlterTable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    alterColumnByIndex: (Double, XPropertySet) => Unit,
    alterColumnByName: (String, XPropertySet) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAlterTable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), alterColumnByIndex = js.Any.fromFunction2(alterColumnByIndex), alterColumnByName = js.Any.fromFunction2(alterColumnByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAlterTable]
  }
  @scala.inline
  implicit class XAlterTableOps[Self <: XAlterTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlterColumnByIndex(value: (Double, XPropertySet) => Unit): Self = this.set("alterColumnByIndex", js.Any.fromFunction2(value))
    @scala.inline
    def setAlterColumnByName(value: (String, XPropertySet) => Unit): Self = this.set("alterColumnByName", js.Any.fromFunction2(value))
  }
  
}

