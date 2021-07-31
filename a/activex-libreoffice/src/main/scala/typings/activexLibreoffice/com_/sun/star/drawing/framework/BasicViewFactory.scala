package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.frame.XController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link BasicViewFactory} is a view factory that provides the panes used by the Draw and Impress applications.
  *
  * The factory recognizes the following URLs: `private:resource/view/ImpressView` for the regular edit view of the Impress
  * application.`private:resource/view/GraphicView` for the regular edit view of the Draw application.`private:resource/view/OutlineView` for the outline
  * view.`private:resource/view/NotesView` for the notes view.`private:resource/view/HandoutView` for the handout view.`private:resource/view/SlideSorter`
  * for the slide sorter regardless of which pane it is used in.`private:resource/view/PresentationView` for the slide
  * show.`private:resource/view/TaskPane` for the task pane.
  */
trait BasicViewFactory
  extends StObject
     with XResourceFactory {
  
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: XController): Unit
}
object BasicViewFactory {
  
  @scala.inline
  def apply(
    create: XController => Unit,
    createResource: XResourceId => XResource,
    releaseResource: XResource => Unit
  ): BasicViewFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), createResource = js.Any.fromFunction1(createResource), releaseResource = js.Any.fromFunction1(releaseResource))
    __obj.asInstanceOf[BasicViewFactory]
  }
  
  @scala.inline
  implicit class BasicViewFactoryMutableBuilder[Self <: BasicViewFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: XController => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
