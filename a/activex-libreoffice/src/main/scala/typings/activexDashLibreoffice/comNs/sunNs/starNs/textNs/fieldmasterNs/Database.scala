package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.fieldmasterNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.TextFieldMaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XDependentTextField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a {@link Database} field master.
  * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
  */
trait Database extends TextFieldMaster {
  /** contains the CommandType this can be the name of a data base table, a data query or a statement. (0 = table, 1 = query, 2 = statement) */
  var CommandType: Double
  /** specifies the database name. */
  var DataBaseName: String
  /**
    * indicates a connection URL, which locates a database driver.
    * @since OOo 2.0
    */
  var DataBaseResource: String
  /**
    * indicates the URL of a database file.
    * @since OOo 2.0
    */
  var DataBaseURL: String
  /** contains the name of the data base table. */
  var DataColumnName: String
  /** contains the command string. Depending on the CommandType property this can be the name of a data base table, a data query or a statement. */
  var DataTableName: String
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
    val __obj = js.Dynamic.literal(CommandType = CommandType, DataBaseName = DataBaseName, DataBaseResource = DataBaseResource, DataBaseURL = DataBaseURL, DataColumnName = DataColumnName, DataTableName = DataTableName, DependentTextFields = DependentTextFields, InstanceName = InstanceName, Name = Name, PropertySetInfo = PropertySetInfo, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[Database]
  }
}

