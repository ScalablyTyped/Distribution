package typings.activexLibreoffice.com_.sun.star.sdb.tools

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to alter a table.
  * @see com.sun.star.sdb.DataSource.Settings
  * @see com.sun.star.sdbcx.ColumnDescriptor
  * @see com.sun.star.sdbcx.XAlterTable
  * @see com.sun.star.sdbcx.XAppend
  * @see com.sun.star.sdbcx.XDrop
  * @since OOo 3.3
  */
@js.native
trait XTableAlteration extends XConnectionSupplier {
  
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param table the table to be altered
    * @param descriptor the descriptor which should be serve to append a new object
    * @see com.sun.star.sdbcx.XAppend
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def addColumn(table: XPropertySet, descriptor: XPropertySet): Unit = js.native
  
  /**
    * alter the column defined by name
    * @param table the table to be altered
    * @param columnName the name of the column to be changed
    * @param columnDescriptor the column descriptor with the information of the new column definition
    * @see com.sun.star.sdbcx.XAlterTable
    * @throws com::sun::star::sdbc::SQLException
    */
  def alterColumnByName(table: XPropertySet, columnName: String, columnDescriptor: XPropertySet): Unit = js.native
  
  /**
    * drops an object of the related container identified by its name.
    * @param table the table to be altered
    * @param columnName the name of the column to be dropped
    * @see com.sun.star.sdbcx.XDrop
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropColumn(table: XPropertySet, columnName: String): Unit = js.native
}
object XTableAlteration {
  
  @scala.inline
  def apply(
    ActiveConnection: XConnection,
    acquire: () => Unit,
    addColumn: (XPropertySet, XPropertySet) => Unit,
    alterColumnByName: (XPropertySet, String, XPropertySet) => Unit,
    dropColumn: (XPropertySet, String) => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTableAlteration = {
    val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addColumn = js.Any.fromFunction2(addColumn), alterColumnByName = js.Any.fromFunction3(alterColumnByName), dropColumn = js.Any.fromFunction2(dropColumn), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTableAlteration]
  }
  
  @scala.inline
  implicit class XTableAlterationOps[Self <: XTableAlteration] (val x: Self) extends AnyVal {
    
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
    def setAddColumn(value: (XPropertySet, XPropertySet) => Unit): Self = this.set("addColumn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAlterColumnByName(value: (XPropertySet, String, XPropertySet) => Unit): Self = this.set("alterColumnByName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDropColumn(value: (XPropertySet, String) => Unit): Self = this.set("dropColumn", js.Any.fromFunction2(value))
  }
}
