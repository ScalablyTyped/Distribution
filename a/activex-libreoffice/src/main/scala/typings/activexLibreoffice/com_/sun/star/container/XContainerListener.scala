package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** receives events when the content of the related container changes. */
@js.native
trait XContainerListener extends XEventListener {
  
  /** is invoked when a container has inserted an element. */
  def elementInserted(Event: ContainerEvent): Unit = js.native
  
  /** is invoked when a container has removed an element. */
  def elementRemoved(Event: ContainerEvent): Unit = js.native
  
  /** is invoked when a container has replaced an element. */
  def elementReplaced(Event: ContainerEvent): Unit = js.native
}
object XContainerListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    elementInserted: ContainerEvent => Unit,
    elementRemoved: ContainerEvent => Unit,
    elementReplaced: ContainerEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContainerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), elementInserted = js.Any.fromFunction1(elementInserted), elementRemoved = js.Any.fromFunction1(elementRemoved), elementReplaced = js.Any.fromFunction1(elementReplaced), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContainerListener]
  }
  
  @scala.inline
  implicit class XContainerListenerOps[Self <: XContainerListener] (val x: Self) extends AnyVal {
    
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
    def setElementInserted(value: ContainerEvent => Unit): Self = this.set("elementInserted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementRemoved(value: ContainerEvent => Unit): Self = this.set("elementRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementReplaced(value: ContainerEvent => Unit): Self = this.set("elementReplaced", js.Any.fromFunction1(value))
  }
}
