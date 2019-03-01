package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a view of a standard office document. */
trait OfficeDocumentView
  extends XSelectionSupplier
     with XViewSettingsSupplier
     with XControlAccess

object OfficeDocumentView {
  @scala.inline
  def apply(
    Selection: js.Any,
    ViewSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    addSelectionChangeListener: js.Function1[XSelectionChangeListener, scala.Unit],
    getControl: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
    ],
    getSelection: js.Function0[js.Any],
    getViewSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSelectionChangeListener: js.Function1[XSelectionChangeListener, scala.Unit],
    select: js.Function1[js.Any, scala.Boolean]
  ): OfficeDocumentView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("ViewSettings")(ViewSettings)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSelectionChangeListener")(addSelectionChangeListener)
    __obj.updateDynamic("getControl")(getControl)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("getViewSettings")(getViewSettings)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSelectionChangeListener")(removeSelectionChangeListener)
    __obj.updateDynamic("select")(select)
    __obj.asInstanceOf[OfficeDocumentView]
  }
}

