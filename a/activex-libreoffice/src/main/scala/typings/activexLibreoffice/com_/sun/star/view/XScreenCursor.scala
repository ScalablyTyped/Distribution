package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to page through the document in steps of the displayed size. */
@js.native
trait XScreenCursor extends XInterface {
  
  /** scrolls the view forward by one visible page. */
  def screenDown(): Boolean = js.native
  
  /** scrolls the view backward by one visible page. */
  def screenUp(): Boolean = js.native
}
object XScreenCursor {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    screenDown: () => Boolean,
    screenUp: () => Boolean
  ): XScreenCursor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), screenDown = js.Any.fromFunction0(screenDown), screenUp = js.Any.fromFunction0(screenUp))
    __obj.asInstanceOf[XScreenCursor]
  }
  
  @scala.inline
  implicit class XScreenCursorOps[Self <: XScreenCursor] (val x: Self) extends AnyVal {
    
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
    def setScreenDown(value: () => Boolean): Self = this.set("screenDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScreenUp(value: () => Boolean): Self = this.set("screenUp", js.Any.fromFunction0(value))
  }
}
