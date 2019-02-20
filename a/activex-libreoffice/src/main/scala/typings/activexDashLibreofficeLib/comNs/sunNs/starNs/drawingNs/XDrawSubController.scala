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

