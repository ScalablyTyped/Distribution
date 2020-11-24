package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive container events.
  *
  * Container events are provided **only** for notification purposes. The VCL will automatically handle add and remove operations internally.
  * @deprecated Deprecated
  */
@js.native
trait XVclContainerListener extends XEventListener {
  
  /** is invoked when a window has been added to the VCL container window. */
  def windowAdded(e: VclContainerEvent): Unit = js.native
  
  /** is invoked when a window has been removed from the VCL container window. */
  def windowRemoved(e: VclContainerEvent): Unit = js.native
}
object XVclContainerListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowAdded: VclContainerEvent => Unit,
    windowRemoved: VclContainerEvent => Unit
  ): XVclContainerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowAdded = js.Any.fromFunction1(windowAdded), windowRemoved = js.Any.fromFunction1(windowRemoved))
    __obj.asInstanceOf[XVclContainerListener]
  }
  
  @scala.inline
  implicit class XVclContainerListenerOps[Self <: XVclContainerListener] (val x: Self) extends AnyVal {
    
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
    def setWindowAdded(value: VclContainerEvent => Unit): Self = this.set("windowAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWindowRemoved(value: VclContainerEvent => Unit): Self = this.set("windowRemoved", js.Any.fromFunction1(value))
  }
}
