package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XAlterView {
  /** is the name of the views catalog, may be empty. */
  var CatalogName: java.lang.String
  /**
    * indicates if a check option should be used for the view.
    * @see com.sun.star.sdbcx.CheckOption
    */
  var CheckOption: scala.Double
  /**
    * is the command for creating the view.
    *
    * This is typically a SQL Select-Statement.
    *
    * This property might be empty when a backend does not support retrieving the current SQL command of a view. However, if the `View` supports altering
    * its command via the {@link XAlterView} interface, then it's required to also provide the current SQL command in the `Command` property.
    */
  var Command: java.lang.String
  /** is the name of the view. */
  var Name: java.lang.String
  /** is the name of the view's schema, may be empty. */
  var SchemaName: java.lang.String
}

object View {
  @scala.inline
  def apply(
    CatalogName: java.lang.String,
    CheckOption: scala.Double,
    Command: java.lang.String,
    Name: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SchemaName: java.lang.String,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    alterCommand: java.lang.String => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    rename: java.lang.String => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): View = {
    val __obj = js.Dynamic.literal(CatalogName = CatalogName, CheckOption = CheckOption, Command = Command, Name = Name, PropertySetInfo = PropertySetInfo, SchemaName = SchemaName, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), alterCommand = js.Any.fromFunction1(alterCommand), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), rename = js.Any.fromFunction1(rename), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[View]
  }
}

