package typings.activexLibreoffice.com_.sun.star.text.fieldmaster

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.text.TextFieldMaster
import typings.activexLibreoffice.com_.sun.star.text.XDependentTextField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of a {@link Database} field master.
  * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
  */
@js.native
trait Database extends TextFieldMaster {
  
  /** contains the CommandType this can be the name of a data base table, a data query or a statement. (0 = table, 1 = query, 2 = statement) */
  var CommandType: Double = js.native
  
  /** specifies the database name. */
  var DataBaseName: String = js.native
  
  /**
    * indicates a connection URL, which locates a database driver.
    * @since OOo 2.0
    */
  var DataBaseResource: String = js.native
  
  /**
    * indicates the URL of a database file.
    * @since OOo 2.0
    */
  var DataBaseURL: String = js.native
  
  /** contains the name of the data base table. */
  var DataColumnName: String = js.native
  
  /** contains the command string. Depending on the CommandType property this can be the name of a data base table, a data query or a statement. */
  var DataTableName: String = js.native
}
object Database {
  
  @scala.inline
  def apply(
    CommandType: Double,
    DataBaseName: String,
    DataBaseResource: String,
    DataBaseURL: String,
    DataColumnName: String,
    DataTableName: String,
    DependentTextFields: SafeArray[XDependentTextField],
    InstanceName: String,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): Database = {
    val __obj = js.Dynamic.literal(CommandType = CommandType.asInstanceOf[js.Any], DataBaseName = DataBaseName.asInstanceOf[js.Any], DataBaseResource = DataBaseResource.asInstanceOf[js.Any], DataBaseURL = DataBaseURL.asInstanceOf[js.Any], DataColumnName = DataColumnName.asInstanceOf[js.Any], DataTableName = DataTableName.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[Database]
  }
  
  @scala.inline
  implicit class DatabaseOps[Self <: Database] (val x: Self) extends AnyVal {
    
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
    def setCommandType(value: Double): Self = this.set("CommandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBaseName(value: String): Self = this.set("DataBaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBaseResource(value: String): Self = this.set("DataBaseResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBaseURL(value: String): Self = this.set("DataBaseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataColumnName(value: String): Self = this.set("DataColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTableName(value: String): Self = this.set("DataTableName", value.asInstanceOf[js.Any])
  }
}
