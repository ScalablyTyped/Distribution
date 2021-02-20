package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * has to be provided if an object wants to receive an event when the master environment (e.g., desktop) is terminated.
  * @see XDesktop.terminate()
  * @see XDesktop.addTerminateListener()
  * @see XDesktop.removeTerminateListener()
  */
@js.native
trait XTerminateListener extends XEventListener {
  
  /**
    * is called when the master environment is finally terminated. No veto will be accepted then.
    * @param Event describe the source of the event (e.g., the desktop)
    */
  def notifyTermination(Event: EventObject): Unit = js.native
  
  /**
    * is called when the master environment (e.g., desktop) is about to terminate.
    *
    * Termination can be intercepted by throwing {@link TerminationVetoException} . Interceptor will be the new owner of desktop and should call {@link
    * XDesktop.terminate()} after finishing its own operations.
    * @param Event describe the source of the event (e.g., the desktop)
    * @throws TerminationVetoException listener can disagree with this query by throwing this veto exception
    */
  def queryTermination(Event: EventObject): Unit = js.native
}
object XTerminateListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyTermination: EventObject => Unit,
    queryInterface: `type` => js.Any,
    queryTermination: EventObject => Unit,
    release: () => Unit
  ): XTerminateListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyTermination = js.Any.fromFunction1(notifyTermination), queryInterface = js.Any.fromFunction1(queryInterface), queryTermination = js.Any.fromFunction1(queryTermination), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTerminateListener]
  }
  
  @scala.inline
  implicit class XTerminateListenerMutableBuilder[Self <: XTerminateListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotifyTermination(value: EventObject => Unit): Self = StObject.set(x, "notifyTermination", js.Any.fromFunction1(value))
    
    @scala.inline
    def setQueryTermination(value: EventObject => Unit): Self = StObject.set(x, "queryTermination", js.Any.fromFunction1(value))
  }
}
