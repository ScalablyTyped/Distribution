package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * to be implemented by components which wish to be notified about changes in the style of a component
  * @see XStyleSettings
  */
trait XStyleChangeListener
  extends StObject
     with XEventListener {
  
  def styleSettingsChanged(Event: EventObject): Unit
}
object XStyleChangeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    styleSettingsChanged: EventObject => Unit
  ): XStyleChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), styleSettingsChanged = js.Any.fromFunction1(styleSettingsChanged))
    __obj.asInstanceOf[XStyleChangeListener]
  }
  
  @scala.inline
  implicit class XStyleChangeListenerMutableBuilder[Self <: XStyleChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleSettingsChanged(value: EventObject => Unit): Self = StObject.set(x, "styleSettingsChanged", js.Any.fromFunction1(value))
  }
}
