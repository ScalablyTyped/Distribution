package typings.activexLibreoffice.com_.sun.star.drawing.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manage the set of registered event listeners and the event notification for a configuration controller.
  *
  * The listeners are called in the order in which they are registered.
  */
@js.native
trait XConfigurationControllerBroadcaster extends js.Object {
  
  /**
    * Add a new listener for configuration changes.
    *
    * The listener is notified only for the specified type of configuration changes. When the listener is interested in more than one event type this method
    * has to be called multiple times. Alternatively it can register as universal listener that will be called for all event types. However, this option is
    * provided primarily to support debugging and monitoring.
    * @param xListener The new listener.
    * @param sEventType The event type that the listener is interested in. The set of event types is not fixed and there can be no exhaustive list. The empty
    * @param aUserData Arbitrary data that is passed to the listener when it is called for the specified event type. When one listener is registered for more
    */
  def addConfigurationChangeListener(xListener: XConfigurationChangeListener, sEventType: String, aUserData: js.Any): Unit = js.native
  
  /** With this method other objects can send events to all the registered listeners. */
  def notifyEvent(aEvent: ConfigurationChangeEvent): Unit = js.native
  
  /**
    * Remove a listener for configuration changes.
    * @param xListener The listener that is to be removed.
    */
  def removeConfigurationChangeListener(xListener: XConfigurationChangeListener): Unit = js.native
}
object XConfigurationControllerBroadcaster {
  
  @scala.inline
  def apply(
    addConfigurationChangeListener: (XConfigurationChangeListener, String, js.Any) => Unit,
    notifyEvent: ConfigurationChangeEvent => Unit,
    removeConfigurationChangeListener: XConfigurationChangeListener => Unit
  ): XConfigurationControllerBroadcaster = {
    val __obj = js.Dynamic.literal(addConfigurationChangeListener = js.Any.fromFunction3(addConfigurationChangeListener), notifyEvent = js.Any.fromFunction1(notifyEvent), removeConfigurationChangeListener = js.Any.fromFunction1(removeConfigurationChangeListener))
    __obj.asInstanceOf[XConfigurationControllerBroadcaster]
  }
  
  @scala.inline
  implicit class XConfigurationControllerBroadcasterOps[Self <: XConfigurationControllerBroadcaster] (val x: Self) extends AnyVal {
    
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
    def setAddConfigurationChangeListener(value: (XConfigurationChangeListener, String, js.Any) => Unit): Self = this.set("addConfigurationChangeListener", js.Any.fromFunction3(value))
    
    @scala.inline
    def setNotifyEvent(value: ConfigurationChangeEvent => Unit): Self = this.set("notifyEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveConfigurationChangeListener(value: XConfigurationChangeListener => Unit): Self = this.set("removeConfigurationChangeListener", js.Any.fromFunction1(value))
  }
}
