package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extend interface {@link XTerminateListener} so a listener will be informed in case termination process was canceled by other reasons. */
trait XTerminateListener2
  extends StObject
     with XTerminateListener {
  
  /**
    * is called when the master environment (e.g., desktop) was canceled in it's terminate request.
    *
    * Termination can be intercepted by throwing {@link TerminationVetoException} . But if a listener was queried for termination .. doesn't throw a veto
    * exception ... it doesn't know if termination will be real next time. Because any other listener can throw those exception too ... and so it can happen
    * that after {@link queryTermination()} no {@link notifyTermination()} will occur. But these listener don't know if its allowed to start new processes
    * then. Using this optional(!) interface will make it possible to be informed about canceled termination requests also.
    * @param Event describe the source of the event (e.g., the desktop)
    */
  def cancelTermination(Event: EventObject): Unit
}
object XTerminateListener2 {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    cancelTermination: EventObject => Unit,
    disposing: EventObject => Unit,
    notifyTermination: EventObject => Unit,
    queryInterface: `type` => js.Any,
    queryTermination: EventObject => Unit,
    release: () => Unit
  ): XTerminateListener2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelTermination = js.Any.fromFunction1(cancelTermination), disposing = js.Any.fromFunction1(disposing), notifyTermination = js.Any.fromFunction1(notifyTermination), queryInterface = js.Any.fromFunction1(queryInterface), queryTermination = js.Any.fromFunction1(queryTermination), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTerminateListener2]
  }
  
  @scala.inline
  implicit class XTerminateListener2MutableBuilder[Self <: XTerminateListener2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelTermination(value: EventObject => Unit): Self = StObject.set(x, "cancelTermination", js.Any.fromFunction1(value))
  }
}
