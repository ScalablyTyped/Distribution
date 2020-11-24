package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supports to notify other implementations about changes of a user interface configuration manager.
  *
  * The {@link XUIConfiguration} interface is provided for user interface configuration managers which need to broadcast changes within the container;
  * that means the actions of adding, replacing and removing elements are broadcast to listeners.
  *
  * This can be useful for UI to enable/disable some functions without actually accessing the data.
  * @since OOo 2.0
  */
@js.native
trait XUIConfiguration extends XInterface {
  
  /**
    * adds the specified listener to receive events when elements are changed, inserted or removed.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see XUIConfigurationListener
    */
  def addConfigurationListener(Listener: XUIConfigurationListener): Unit = js.native
  
  /**
    * removes the specified listener so it does not receive any events from this user interface configuration manager.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    * @see XUIConfigurationListener
    */
  def removeConfigurationListener(Listener: XUIConfigurationListener): Unit = js.native
}
object XUIConfiguration {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addConfigurationListener: XUIConfigurationListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeConfigurationListener: XUIConfigurationListener => Unit
  ): XUIConfiguration = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addConfigurationListener = js.Any.fromFunction1(addConfigurationListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeConfigurationListener = js.Any.fromFunction1(removeConfigurationListener))
    __obj.asInstanceOf[XUIConfiguration]
  }
  
  @scala.inline
  implicit class XUIConfigurationOps[Self <: XUIConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAddConfigurationListener(value: XUIConfigurationListener => Unit): Self = this.set("addConfigurationListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveConfigurationListener(value: XUIConfigurationListener => Unit): Self = this.set("removeConfigurationListener", js.Any.fromFunction1(value))
  }
}
