package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.frameworkNs.XResource
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.frameworkNs.XResourceId
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
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
     with XResource {
  var BackgroundColor: Color
  /**
    * The set of slides that are displayed by the implementing object.
    *
    * The default value is the set of all slides of the document for which a slide sorter is created.
    */
  var DocumentSlides: XIndexAccess
  var HighlightColor: Color
  /**
    * When this flag has the value `TRUE` then every time the current slide is changed the visual area is shifted so that the new current slide is display
    * in the center of the slide sorter window.
    *
    * It is not always possible to move the current slide into the exact center of the window, for example when slides are located near the start or end of
    * a document.
    *
    * The default value is `FALSE` .
    */
  var IsCenterSelection: Boolean
  /**
    * Set this flag to `TRUE` in order to have the current slide highlighted.
    *
    * The default value is `FALSE` .
    */
  var IsHighlightCurrentSlide: Boolean
  /** The orientation of a slide sorter can be either vertical ( `TRUE` ) or horizontal ( `FALSE` ). */
  var IsOrientationVertical: Boolean
  /**
    * Set this flag to `TRUE` to visualize to where the focus is by showing a dotted rectangle around the focused slide.
    *
    * The default value is `TRUE` .
    */
  var IsShowFocus: Boolean
  /**
    * Set this flag to `TRUE` in order to visualize the selection of slides (typically a bold frame around the selected slides).
    *
    * The default value is `TRUE` .
    */
  var IsShowSelection: Boolean
  /** This flag is a hint to make scrolling look smooth. */
  var IsSmoothScrolling: Boolean
  /**
    * This flag controls whether updates of previews are created during full screen presentations ( `FALSE` ) or not ( `TRUE` ). The suspension of preview
    * creations is an optimization for not slowing down a running presentation.
    *
    * The default value is `TRUE` .
    */
  var IsSuspendPreviewUpdatesDuringFullScreenPresentation: Boolean
  /**
    * This flag controls whether the model can be modified by using keyboard or mouse.
    *
    * The default value is `TRUE` .
    */
  var IsUIReadOnly: Boolean
  var SelectionColor: Color
  var TextColor: Color
}

object XSlideSorterBase {
  @scala.inline
  def apply(
    BackgroundColor: Color,
    CurrentPage: XDrawPage,
    DocumentSlides: XIndexAccess,
    HighlightColor: Color,
    IsCenterSelection: Boolean,
    IsHighlightCurrentSlide: Boolean,
    IsOrientationVertical: Boolean,
    IsShowFocus: Boolean,
    IsShowSelection: Boolean,
    IsSmoothScrolling: Boolean,
    IsSuspendPreviewUpdatesDuringFullScreenPresentation: Boolean,
    IsUIReadOnly: Boolean,
    ResourceId: XResourceId,
    SelectionColor: Color,
    TextColor: Color,
    acquire: () => Unit,
    getCurrentPage: () => XDrawPage,
    getResourceId: () => XResourceId,
    isAnchorOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentPage: XDrawPage => Unit
  ): XSlideSorterBase = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor, CurrentPage = CurrentPage, DocumentSlides = DocumentSlides, HighlightColor = HighlightColor, IsCenterSelection = IsCenterSelection, IsHighlightCurrentSlide = IsHighlightCurrentSlide, IsOrientationVertical = IsOrientationVertical, IsShowFocus = IsShowFocus, IsShowSelection = IsShowSelection, IsSmoothScrolling = IsSmoothScrolling, IsSuspendPreviewUpdatesDuringFullScreenPresentation = IsSuspendPreviewUpdatesDuringFullScreenPresentation, IsUIReadOnly = IsUIReadOnly, ResourceId = ResourceId, SelectionColor = SelectionColor, TextColor = TextColor, acquire = js.Any.fromFunction0(acquire), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getResourceId = js.Any.fromFunction0(getResourceId), isAnchorOnly = js.Any.fromFunction0(isAnchorOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentPage = js.Any.fromFunction1(setCurrentPage))
  
    __obj.asInstanceOf[XSlideSorterBase]
  }
}

