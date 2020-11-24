package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A listener for configuration changes is called when it has been registered at the configuration controller and a configuration change occurs. */
@js.native
trait XConfigurationChangeListener extends XEventListener {
  
  /**
    * The exact time of when a listener is called (before the change takes place, during the change, or when the change has been made) depends on the change
    * event. The order in which listeners are called is the order in which they are registered (First registered, first called.)
    */
  def notifyConfigurationChange(aEvent: ConfigurationChangeEvent): Unit = js.native
}
object XConfigurationChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyConfigurationChange: ConfigurationChangeEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConfigurationChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyConfigurationChange = js.Any.fromFunction1(notifyConfigurationChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConfigurationChangeListener]
  }
  
  @scala.inline
  implicit class XConfigurationChangeListenerOps[Self <: XConfigurationChangeListener] (val x: Self) extends AnyVal {
    
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
    def setNotifyConfigurationChange(value: ConfigurationChangeEvent => Unit): Self = this.set("notifyConfigurationChange", js.Any.fromFunction1(value))
  }
}
