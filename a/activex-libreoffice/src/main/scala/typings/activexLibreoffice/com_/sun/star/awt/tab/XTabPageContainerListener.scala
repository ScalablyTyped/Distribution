package typings.activexLibreoffice.com_.sun.star.awt.tab

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of this interface is used by the {@link XTabPageContainer} to get notifications about changes in activation of tab pages.
  * @since OOo 3.4
  */
@js.native
trait XTabPageContainerListener extends XEventListener {
  
  /** Invoked after a tab page was activated. */
  def tabPageActivated(tabPageActivatedEvent: TabPageActivatedEvent): Unit = js.native
}
object XTabPageContainerListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    tabPageActivated: TabPageActivatedEvent => Unit
  ): XTabPageContainerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), tabPageActivated = js.Any.fromFunction1(tabPageActivated))
    __obj.asInstanceOf[XTabPageContainerListener]
  }
  
  @scala.inline
  implicit class XTabPageContainerListenerOps[Self <: XTabPageContainerListener] (val x: Self) extends AnyVal {
    
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
    def setTabPageActivated(value: TabPageActivatedEvent => Unit): Self = this.set("tabPageActivated", js.Any.fromFunction1(value))
  }
}
