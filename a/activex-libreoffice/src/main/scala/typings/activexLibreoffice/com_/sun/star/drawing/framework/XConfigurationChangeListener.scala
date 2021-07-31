package typings.activexLibreoffice.com_.sun.star.drawing.framework

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A listener for configuration changes is called when it has been registered at the configuration controller and a configuration change occurs. */
trait XConfigurationChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * The exact time of when a listener is called (before the change takes place, during the change, or when the change has been made) depends on the change
    * event. The order in which listeners are called is the order in which they are registered (First registered, first called.)
    */
  def notifyConfigurationChange(aEvent: ConfigurationChangeEvent): Unit
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
  implicit class XConfigurationChangeListenerMutableBuilder[Self <: XConfigurationChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyConfigurationChange(value: ConfigurationChangeEvent => Unit): Self = StObject.set(x, "notifyConfigurationChange", js.Any.fromFunction1(value))
  }
}
