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

