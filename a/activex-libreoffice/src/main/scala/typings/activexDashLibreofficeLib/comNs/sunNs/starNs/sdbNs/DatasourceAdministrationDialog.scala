package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a user interface for administrating the system wide registered data sources.
  *
  * Here, **system wide registered** means registered on the (one and only) instance of the {@link com.sun.star.sdb.DatabaseContext} service.
  */
trait DatasourceAdministrationDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization {
  /**
    * parent window to use for the administration dialog
    *
    * This property can't be set while the dialog is being displayed.
    */
  var ParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  /** the title of the (dialog) window */
  var Title: java.lang.String
}

object DatasourceAdministrationDialog {
  @scala.inline
  def apply(
    ParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Title: java.lang.String,
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
    execute: js.Function0[scala.Double],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): DatasourceAdministrationDialog = {
    val __obj = js.Dynamic.literal(ParentWindow = ParentWindow, PropertySetInfo = PropertySetInfo, Title = Title, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, execute = execute, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, initialize = initialize, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setTitle = setTitle)
  
    __obj.asInstanceOf[DatasourceAdministrationDialog]
  }
}

