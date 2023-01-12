package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a listener combining all methods of a listener interface in a single generic call.
  *
  * Without any output parameters, it is possible to adapt any interface if the {@link XAllListenerAdapterService} can generate an adapter.
  */
trait XAllListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called when a "vetoable event" occurs at the object.
    *
    * That happens when the listener method raises an exception, or has a return value declared.
    */
  def approveFiring(aEvent: AllEventObject): Any
  
  /** gets called when an event occurs at the object. */
  def firing(iaEvent: AllEventObject): Unit
}
object XAllListener {
  
  inline def apply(
    acquire: () => Unit,
    approveFiring: AllEventObject => Any,
    disposing: EventObject => Unit,
    firing: AllEventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XAllListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveFiring = js.Any.fromFunction1(approveFiring), disposing = js.Any.fromFunction1(disposing), firing = js.Any.fromFunction1(firing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAllListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAllListener] (val x: Self) extends AnyVal {
    
    inline def setApproveFiring(value: AllEventObject => Any): Self = StObject.set(x, "approveFiring", js.Any.fromFunction1(value))
    
    inline def setFiring(value: AllEventObject => Unit): Self = StObject.set(x, "firing", js.Any.fromFunction1(value))
  }
}
