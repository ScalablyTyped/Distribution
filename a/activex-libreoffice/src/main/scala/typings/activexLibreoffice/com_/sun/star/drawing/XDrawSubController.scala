package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XFastPropertySet
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * View dependent part of the Draw and Impress controller.
  *
  * During the lifetime of an Impress application the {@link com.sun.star.drawing.DrawingDocumentDrawView} changes its sub controllers whenever the view
  * in the center pane is replaced by another one. The sub controller handles the things that are not common to all views, i.e. properties, the current
  * page/slide, and the selection.
  */
trait XDrawSubController
  extends StObject
     with XDrawView
     with XSelectionSupplier
     with XFastPropertySet
object XDrawSubController {
  
  inline def apply(
    CurrentPage: XDrawPage,
    Selection: Any,
    acquire: () => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    getCurrentPage: () => XDrawPage,
    getFastPropertyValue: Double => Any,
    getSelection: () => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    select: Any => Boolean,
    setCurrentPage: XDrawPage => Unit,
    setFastPropertyValue: (Double, Any) => Unit
  ): XDrawSubController = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getFastPropertyValue = js.Any.fromFunction1(getFastPropertyValue), getSelection = js.Any.fromFunction0(getSelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), select = js.Any.fromFunction1(select), setCurrentPage = js.Any.fromFunction1(setCurrentPage), setFastPropertyValue = js.Any.fromFunction2(setFastPropertyValue))
    __obj.asInstanceOf[XDrawSubController]
  }
}
