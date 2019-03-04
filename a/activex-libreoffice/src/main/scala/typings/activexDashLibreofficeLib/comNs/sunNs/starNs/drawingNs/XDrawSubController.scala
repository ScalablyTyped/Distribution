package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * View dependent part of the Draw and Impress controller.
  *
  * During the lifetime of an Impress application the {@link com.sun.star.drawing.DrawingDocumentDrawView} changes its sub controllers whenever the view
  * in the center pane is replaced by another one. The sub controller handles the things that are not common to all views, i.e. properties, the current
  * page/slide, and the selection.
  */
trait XDrawSubController
  extends XDrawView
     with activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XFastPropertySet

object XDrawSubController {
  @scala.inline
  def apply(
    CurrentPage: XDrawPage,
    Selection: js.Any,
    acquire: js.Function0[scala.Unit],
    addSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    getCurrentPage: js.Function0[XDrawPage],
    getFastPropertyValue: js.Function1[scala.Double, js.Any],
    getSelection: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    select: js.Function1[js.Any, scala.Boolean],
    setCurrentPage: js.Function1[XDrawPage, scala.Unit],
    setFastPropertyValue: js.Function2[scala.Double, js.Any, scala.Unit]
  ): XDrawSubController = {
    val __obj = js.Dynamic.literal(CurrentPage = CurrentPage, Selection = Selection, acquire = acquire, addSelectionChangeListener = addSelectionChangeListener, getCurrentPage = getCurrentPage, getFastPropertyValue = getFastPropertyValue, getSelection = getSelection, queryInterface = queryInterface, release = release, removeSelectionChangeListener = removeSelectionChangeListener, select = select, setCurrentPage = setCurrentPage, setFastPropertyValue = setFastPropertyValue)
  
    __obj.asInstanceOf[XDrawSubController]
  }
}

