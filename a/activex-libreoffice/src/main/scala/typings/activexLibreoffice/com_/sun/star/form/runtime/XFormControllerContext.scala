package typings.activexLibreoffice.com_.sun.star.form.runtime

import typings.activexLibreoffice.com_.sun.star.awt.XControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a context for a {@link FormController}
  *
  * A {@link FormController} knows about the controls it is responsible for, and about the control container which those controls live in. However, it
  * doesn't know about a possible larger context, like a scrollable view which the controls are embedded into. To compensate this, it can be provided a
  * `XFormControllerContext` .
  */
trait XFormControllerContext extends js.Object {
  /** ensures the given control is visible, by scrolling the view if necessary. */
  def makeVisible(Control: XControl): Unit
}

object XFormControllerContext {
  @scala.inline
  def apply(makeVisible: XControl => Unit): XFormControllerContext = {
    val __obj = js.Dynamic.literal(makeVisible = js.Any.fromFunction1(makeVisible))
    __obj.asInstanceOf[XFormControllerContext]
  }
}

