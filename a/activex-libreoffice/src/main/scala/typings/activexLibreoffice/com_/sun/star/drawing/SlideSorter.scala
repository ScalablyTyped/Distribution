package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.drawing.framework.XResourceId
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A slide sorter shows previews for a set of slides, typically all slides in a document, and allows the selection, reordering, creation, and deletion of
  * slides.
  *
  * In the drawing framework a slide sorter is regarded as a view.
  */
trait SlideSorter
  extends StObject
     with XSlideSorterBase {
  
  /**
    * Create a new slide sorter object.
    * @param xViewId The resource id of the new slide sorter.
    * @param xController The access point to an impress document.
    * @param xParentWindow The parent window which will be completely covered by the new slide sorter.
    */
  def create(xViewId: XResourceId, xController: XController, xParentWindow: XWindow): Unit
}
object SlideSorter {
  
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
    create: (XResourceId, XController, XWindow) => Unit,
    getCurrentPage: () => XDrawPage,
    getResourceId: () => XResourceId,
    isAnchorOnly: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentPage: XDrawPage => Unit
  ): SlideSorter = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], CurrentPage = CurrentPage.asInstanceOf[js.Any], DocumentSlides = DocumentSlides.asInstanceOf[js.Any], HighlightColor = HighlightColor.asInstanceOf[js.Any], IsCenterSelection = IsCenterSelection.asInstanceOf[js.Any], IsHighlightCurrentSlide = IsHighlightCurrentSlide.asInstanceOf[js.Any], IsOrientationVertical = IsOrientationVertical.asInstanceOf[js.Any], IsShowFocus = IsShowFocus.asInstanceOf[js.Any], IsShowSelection = IsShowSelection.asInstanceOf[js.Any], IsSmoothScrolling = IsSmoothScrolling.asInstanceOf[js.Any], IsSuspendPreviewUpdatesDuringFullScreenPresentation = IsSuspendPreviewUpdatesDuringFullScreenPresentation.asInstanceOf[js.Any], IsUIReadOnly = IsUIReadOnly.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], SelectionColor = SelectionColor.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction3(create), getCurrentPage = js.Any.fromFunction0(getCurrentPage), getResourceId = js.Any.fromFunction0(getResourceId), isAnchorOnly = js.Any.fromFunction0(isAnchorOnly), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentPage = js.Any.fromFunction1(setCurrentPage))
    __obj.asInstanceOf[SlideSorter]
  }
  
  @scala.inline
  implicit class SlideSorterMutableBuilder[Self <: SlideSorter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (XResourceId, XController, XWindow) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
  }
}
