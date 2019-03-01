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
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    alterCommand: js.Function1[java.lang.String, scala.Unit],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    rename: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): View = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CatalogName")(CatalogName)
    __obj.updateDynamic("CheckOption")(CheckOption)
    __obj.updateDynamic("Command")(Command)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("SchemaName")(SchemaName)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("alterCommand")(alterCommand)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("rename")(rename)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[View]
  }
}

