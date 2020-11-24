package typings.activexLibreoffice.com_.sun.star.lang

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** base interface for all event listeners interfaces. */
@js.native
trait XEventListener extends XInterface {
  
  /**
    * gets called when the broadcaster is about to be disposed.
    *
    * All listeners and all other objects, which reference the broadcaster should release the reference to the source. No method should be invoked anymore
    * on this object ( including {@link XComponent.removeEventListener()} ).
    *
    * This method is called for every listener registration of derived listener interfaced, not only for registrations at {@link XComponent} .
    */
  def disposing(Source: EventObject): Unit = js.native
}
object XEventListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEventListener]
  }
  
  @scala.inline
  implicit class XEventListenerOps[Self <: XEventListener] (val x: Self) extends AnyVal {
    
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
    def setDisposing(value: EventObject => Unit): Self = this.set("disposing", js.Any.fromFunction1(value))
  }
}
