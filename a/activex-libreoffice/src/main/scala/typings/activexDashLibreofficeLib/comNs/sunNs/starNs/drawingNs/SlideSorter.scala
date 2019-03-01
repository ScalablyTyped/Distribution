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

object SlideSorter {
  @scala.inline
  def apply(
    BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CurrentPage: XDrawPage,
    DocumentSlides: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    HighlightColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    IsCenterSelection: scala.Boolean,
    IsHighlightCurrentSlide: scala.Boolean,
    IsOrientationVertical: scala.Boolean,
    IsShowFocus: scala.Boolean,
    IsShowSelection: scala.Boolean,
    IsSmoothScrolling: scala.Boolean,
    IsSuspendPreviewUpdatesDuringFullScreenPresentation: scala.Boolean,
    IsUIReadOnly: scala.Boolean,
    ResourceId: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.XResourceId,
    SelectionColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    acquire: js.Function0[scala.Unit],
    create: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.XResourceId, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      scala.Unit
    ],
    getCurrentPage: js.Function0[XDrawPage],
    getResourceId: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.XResourceId],
    isAnchorOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCurrentPage: js.Function1[XDrawPage, scala.Unit]
  ): SlideSorter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BackgroundColor")(BackgroundColor)
    __obj.updateDynamic("CurrentPage")(CurrentPage)
    __obj.updateDynamic("DocumentSlides")(DocumentSlides)
    __obj.updateDynamic("HighlightColor")(HighlightColor)
    __obj.updateDynamic("IsCenterSelection")(IsCenterSelection)
    __obj.updateDynamic("IsHighlightCurrentSlide")(IsHighlightCurrentSlide)
    __obj.updateDynamic("IsOrientationVertical")(IsOrientationVertical)
    __obj.updateDynamic("IsShowFocus")(IsShowFocus)
    __obj.updateDynamic("IsShowSelection")(IsShowSelection)
    __obj.updateDynamic("IsSmoothScrolling")(IsSmoothScrolling)
    __obj.updateDynamic("IsSuspendPreviewUpdatesDuringFullScreenPresentation")(IsSuspendPreviewUpdatesDuringFullScreenPresentation)
    __obj.updateDynamic("IsUIReadOnly")(IsUIReadOnly)
    __obj.updateDynamic("ResourceId")(ResourceId)
    __obj.updateDynamic("SelectionColor")(SelectionColor)
    __obj.updateDynamic("TextColor")(TextColor)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("getCurrentPage")(getCurrentPage)
    __obj.updateDynamic("getResourceId")(getResourceId)
    __obj.updateDynamic("isAnchorOnly")(isAnchorOnly)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setCurrentPage")(setCurrentPage)
    __obj.asInstanceOf[SlideSorter]
  }
}

