package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register a component as a listener, which is called whenever an accessibility event occurs.
  * @see XAccessibleEventBroadcaster
  * @since OOo 1.1.2
  */
trait XAccessibleEventListener
  extends StObject
     with XEventListener {
  
  /** is called whenever a accessible event (see {@link AccessibleEventObject} ) occurs. */
  def notifyEvent(aEvent: AccessibleEventObject): Unit
}
object XAccessibleEventListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyEvent: AccessibleEventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAccessibleEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyEvent = js.Any.fromFunction1(notifyEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAccessibleEventListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAccessibleEventListener] (val x: Self) extends AnyVal {
    
    inline def setNotifyEvent(value: AccessibleEventObject => Unit): Self = StObject.set(x, "notifyEvent", js.Any.fromFunction1(value))
  }
}
