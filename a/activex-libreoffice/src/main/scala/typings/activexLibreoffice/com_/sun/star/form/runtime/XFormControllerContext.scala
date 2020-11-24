package typings.activexLibreoffice.com_.sun.star.form.runtime

import typings.activexLibreoffice.com_.sun.star.awt.XControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a context for a {@link FormController}
  *
  * A {@link FormController} knows about the controls it is responsible for, and about the control container which those controls live in. However, it
  * doesn't know about a possible larger context, like a scrollable view which the controls are embedded into. To compensate this, it can be provided a
  * `XFormControllerContext` .
  */
@js.native
trait XFormControllerContext extends js.Object {
  
  /** ensures the given control is visible, by scrolling the view if necessary. */
  def makeVisible(Control: XControl): Unit = js.native
}
object XFormControllerContext {
  
  @scala.inline
  def apply(makeVisible: XControl => Unit): XFormControllerContext = {
    val __obj = js.Dynamic.literal(makeVisible = js.Any.fromFunction1(makeVisible))
    __obj.asInstanceOf[XFormControllerContext]
  }
  
  @scala.inline
  implicit class XFormControllerContextOps[Self <: XFormControllerContext] (val x: Self) extends AnyVal {
    
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
    def setMakeVisible(value: XControl => Unit): Self = this.set("makeVisible", js.Any.fromFunction1(value))
  }
}
