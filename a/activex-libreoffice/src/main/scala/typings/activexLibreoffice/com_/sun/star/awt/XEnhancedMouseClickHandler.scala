package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive enhanced events from the mouse.
  * @since OOo 2.0
  */
@js.native
trait XEnhancedMouseClickHandler extends XEventListener {
  
  /** is invoked when a mouse button has been pressed on a window. */
  def mousePressed(e: EnhancedMouseEvent): Boolean = js.native
  
  /** is invoked when a mouse button has been released on a window. */
  def mouseReleased(e: EnhancedMouseEvent): Boolean = js.native
}
object XEnhancedMouseClickHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    mousePressed: EnhancedMouseEvent => Boolean,
    mouseReleased: EnhancedMouseEvent => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEnhancedMouseClickHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEnhancedMouseClickHandler]
  }
  
  @scala.inline
  implicit class XEnhancedMouseClickHandlerOps[Self <: XEnhancedMouseClickHandler] (val x: Self) extends AnyVal {
    
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
    def setMousePressed(value: EnhancedMouseEvent => Boolean): Self = this.set("mousePressed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMouseReleased(value: EnhancedMouseEvent => Boolean): Self = this.set("mouseReleased", js.Any.fromFunction1(value))
  }
}
