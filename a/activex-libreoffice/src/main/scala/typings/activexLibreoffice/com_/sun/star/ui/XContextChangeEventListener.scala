package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XContextChangeEventListener
  extends StObject
     with XEventListener {
  
  def notifyContextChangeEvent(event: ContextChangeEventObject): Unit
}
object XContextChangeEventListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyContextChangeEvent: ContextChangeEventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XContextChangeEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyContextChangeEvent = js.Any.fromFunction1(notifyContextChangeEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContextChangeEventListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XContextChangeEventListener] (val x: Self) extends AnyVal {
    
    inline def setNotifyContextChangeEvent(value: ContextChangeEventObject => Unit): Self = StObject.set(x, "notifyContextChangeEvent", js.Any.fromFunction1(value))
  }
}
