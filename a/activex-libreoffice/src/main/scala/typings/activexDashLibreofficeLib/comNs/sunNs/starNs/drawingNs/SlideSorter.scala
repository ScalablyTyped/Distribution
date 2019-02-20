package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A slide sorter shows previews for a set of slides, typically all slides in a document, and allows the selection, reordering, creation, and deletion of
  * slides.
  *
  * In the drawing framework a slide sorter is regarded as a view.
  */
trait SlideSorter extends XSlideSorterBase {
  /**
    * Create a new slide sorter object.
    * @param xViewId The resource id of the new slide sorter.
    * @param xController The access point to an impress document.
    * @param xParentWindow The parent window which will be completely covered by the new slide sorter.
    */
  def create(
    xViewId: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.XResourceId,
    xController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController,
    xParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  ): scala.Unit
}

