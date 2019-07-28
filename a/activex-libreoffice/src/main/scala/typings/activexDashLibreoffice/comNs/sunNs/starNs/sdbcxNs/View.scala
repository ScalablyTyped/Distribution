package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to specify views on data. A view object is only used for creation and deletion. Inspecting the command of a view is normally not supported.
  *
  * If a view is going to be added to a database, the view must have a unique name within the view and the table container, as it can be used like a
  * table. ** Note: ** After addition, both the containers for views and the container for tables must contain an element for the view.
  */
trait View
  extends XRename
     with XPropertySet
     with XAlterView {
  /** is the name of the views catalog, may be empty. */
  var CatalogName: String
  /**
    * indicates if a check option should be used for the view.
    * @see com.sun.star.sdbcx.CheckOption
    */
  var CheckOption: Double
  /**
    * is the command for creating the view.
    *
    * This is typically a SQL Select-Statement.
    *
    * This property might be empty when a backend does not support retrieving the current SQL command of a view. However, if the `View` supports altering
    * its command via the {@link XAlterView} interface, then it's required to also provide the current SQL command in the `Command` property.
    */
  var Command: String
  /** is the name of the view. */
  var Name: String
  /** is the name of the view's schema, may be empty. */
  var SchemaName: String
}

object View {
  @scala.inline
  def apply(
    CatalogName: String,
    CheckOption: Double,
    Command: String,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    SchemaName: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    alterCommand: String => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    rename: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): View = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName, CheckOption = CheckOption, Command = Command, Name = Name, PropertySetInfo = PropertySetInfo, SchemaName = SchemaName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), alterCommand = js.Any.fromFunction1(alterCommand), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rename = js.Any.fromFunction1(rename), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[View]
  }
}

