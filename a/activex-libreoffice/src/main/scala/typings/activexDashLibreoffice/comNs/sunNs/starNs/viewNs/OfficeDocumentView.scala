package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
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
    ViewSettings: XPropertySet,
    acquire: () => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    getControl: XControlModel => XControl,
    getSelection: () => js.Any,
    getViewSettings: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    select: js.Any => Boolean
  ): OfficeDocumentView = {
    val __obj = js.Dynamic.literal(Selection = Selection, ViewSettings = ViewSettings, acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getControl = js.Any.fromFunction1(getControl), getSelection = js.Any.fromFunction0(getSelection), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), select = js.Any.fromFunction1(select))
  
    __obj.asInstanceOf[OfficeDocumentView]
  }
}

