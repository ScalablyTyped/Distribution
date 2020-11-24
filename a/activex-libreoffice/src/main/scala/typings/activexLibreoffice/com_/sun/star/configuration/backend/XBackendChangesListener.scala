package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notification from backend broadcaster objects.
  * @see XBackendChangesNotifier
  */
@js.native
trait XBackendChangesListener extends XEventListener {
  
  /**
    * is invoked when component data in backend source changes
    * @param Event Event indicating the component data change
    */
  def componentDataChanged(Event: ComponentChangeEvent): Unit = js.native
}
object XBackendChangesListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    componentDataChanged: ComponentChangeEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBackendChangesListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), componentDataChanged = js.Any.fromFunction1(componentDataChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBackendChangesListener]
  }
  
  @scala.inline
  implicit class XBackendChangesListenerOps[Self <: XBackendChangesListener] (val x: Self) extends AnyVal {
    
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
    def setComponentDataChanged(value: ComponentChangeEvent => Unit): Self = this.set("componentDataChanged", js.Any.fromFunction1(value))
  }
}
