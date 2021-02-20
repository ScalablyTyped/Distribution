package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a view of a standard office document. */
@js.native
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
    val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any], ViewSettings = ViewSettings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getControl = js.Any.fromFunction1(getControl), getSelection = js.Any.fromFunction0(getSelection), getViewSettings = js.Any.fromFunction0(getViewSettings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[OfficeDocumentView]
  }
}
