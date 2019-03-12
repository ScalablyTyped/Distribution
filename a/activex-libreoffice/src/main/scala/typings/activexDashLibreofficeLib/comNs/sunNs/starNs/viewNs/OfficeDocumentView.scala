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
    acquire: () => scala.Unit,
    addSelectionChangeListener: XSelectionChangeListener => scala.Unit,
    getControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    getSelection: () => js.Any,
    getViewSettings: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeSelectionChangeListener: XSelectionChangeListener => scala.Unit,
    select: js.Any => scala.Boolean
  ): OfficeDocumentView = {
    val __obj = js.Dynamic.literal(Selection = Selection, ViewSettings = ViewSettings, acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getControl = js.Any.fromFunction1(getControl), getSelection = js.Any.fromFunction0(getSelection), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[OfficeDocumentView]
  }
}

