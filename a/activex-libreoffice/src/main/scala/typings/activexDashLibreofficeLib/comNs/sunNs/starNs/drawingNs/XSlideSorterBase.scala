package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface exists only because services do not directly support multiple inheritance and attributes.
  *
  * It provides the interfaces and attributes that every object that implements the {@link SlideSorter} service.
  */
trait XSlideSorterBase
  extends XDrawView
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.XResource {
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * The set of slides that are displayed by the implementing object.
    *
    * The default value is the set of all slides of the document for which a slide sorter is created.
    */
  var DocumentSlides: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  var HighlightColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * When this flag has the value `TRUE` then every time the current slide is changed the visual area is shifted so that the new current slide is display
    * in the center of the slide sorter window.
    *
    * It is not always possible to move the current slide into the exact center of the window, for example when slides are located near the start or end of
    * a document.
    *
    * The default value is `FALSE` .
    */
  var IsCenterSelection: scala.Boolean
  /**
    * Set this flag to `TRUE` in order to have the current slide highlighted.
    *
    * The default value is `FALSE` .
    */
  var IsHighlightCurrentSlide: scala.Boolean
  /** The orientation of a slide sorter can be either vertical ( `TRUE` ) or horizontal ( `FALSE` ). */
  var IsOrientationVertical: scala.Boolean
  /**
    * Set this flag to `TRUE` to visualize to where the focus is by showing a dotted rectangle around the focused slide.
    *
    * The default value is `TRUE` .
    */
  var IsShowFocus: scala.Boolean
  /**
    * Set this flag to `TRUE` in order to visualize the selection of slides (typically a bold frame around the selected slides).
    *
    * The default value is `TRUE` .
    */
  var IsShowSelection: scala.Boolean
  /** This flag is a hint to make scrolling look smooth. */
  var IsSmoothScrolling: scala.Boolean
  /**
    * This flag controls whether updates of previews are created during full screen presentations ( `FALSE` ) or not ( `TRUE` ). The suspension of preview
    * creations is an optimization for not slowing down a running presentation.
    *
    * The default value is `TRUE` .
    */
  var IsSuspendPreviewUpdatesDuringFullScreenPresentation: scala.Boolean
  /**
    * This flag controls whether the model can be modified by using keyboard or mouse.
    *
    * The default value is `TRUE` .
    */
  var IsUIReadOnly: scala.Boolean
  var SelectionColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
}

object XSlideSorterBase {
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
    getCurrentPage: js.Function0[XDrawPage],
    getResourceId: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.frameworkNs.XResourceId],
    isAnchorOnly: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCurrentPage: js.Function1[XDrawPage, scala.Unit]
  ): XSlideSorterBase = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor, CurrentPage = CurrentPage, DocumentSlides = DocumentSlides, HighlightColor = HighlightColor, IsCenterSelection = IsCenterSelection, IsHighlightCurrentSlide = IsHighlightCurrentSlide, IsOrientationVertical = IsOrientationVertical, IsShowFocus = IsShowFocus, IsShowSelection = IsShowSelection, IsSmoothScrolling = IsSmoothScrolling, IsSuspendPreviewUpdatesDuringFullScreenPresentation = IsSuspendPreviewUpdatesDuringFullScreenPresentation, IsUIReadOnly = IsUIReadOnly, ResourceId = ResourceId, SelectionColor = SelectionColor, TextColor = TextColor, acquire = acquire, getCurrentPage = getCurrentPage, getResourceId = getResourceId, isAnchorOnly = isAnchorOnly, queryInterface = queryInterface, release = release, setCurrentPage = setCurrentPage)
  
    __obj.asInstanceOf[XSlideSorterBase]
  }
}

