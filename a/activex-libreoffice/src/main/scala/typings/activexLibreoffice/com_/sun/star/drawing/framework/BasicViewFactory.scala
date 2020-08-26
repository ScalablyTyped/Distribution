package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.com_.sun.star.frame.XController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link BasicViewFactory} is a view factory that provides the panes used by the Draw and Impress applications.
  *
  * The factory recognizes the following URLs: `private:resource/view/ImpressView` for the regular edit view of the Impress
  * application.`private:resource/view/GraphicView` for the regular edit view of the Draw application.`private:resource/view/OutlineView` for the outline
  * view.`private:resource/view/NotesView` for the notes view.`private:resource/view/HandoutView` for the handout view.`private:resource/view/SlideSorter`
  * for the slide sorter regardless of which pane it is used in.`private:resource/view/PresentationView` for the slide
  * show.`private:resource/view/TaskPane` for the task pane.
  */
@js.native
trait BasicViewFactory extends XResourceFactory {
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: XController): Unit = js.native
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
  implicit class BasicViewFactoryOps[Self <: BasicViewFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: XController => Unit): Self = this.set("create", js.Any.fromFunction1(value))
  }
  
}

