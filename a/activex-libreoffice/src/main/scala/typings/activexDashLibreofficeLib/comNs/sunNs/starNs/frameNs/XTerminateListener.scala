package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * has to be provided if an object wants to receive an event when the master environment (e.g., desktop) is terminated.
  * @see XDesktop.terminate()
  * @see XDesktop.addTerminateListener()
  * @see XDesktop.removeTerminateListener()
  */
trait XTerminateListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when the master environment is finally terminated. No veto will be accepted then.
    * @param Event describe the source of the event (e.g., the desktop)
    */
  def notifyTermination(Event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is called when the master environment (e.g., desktop) is about to terminate.
    *
    * Termination can be intercepted by throwing {@link TerminationVetoException} . Interceptor will be the new owner of desktop and should call {@link
    * XDesktop.terminate()} after finishing his own operations.
    * @param Event describe the source of the event (e.g., the desktop)
    * @throws TerminationVetoException listener can disagree with this query by throwing this veto exception
    */
  def queryTermination(Event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XTerminateListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    notifyTermination: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryTermination: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XTerminateListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, notifyTermination = notifyTermination, queryInterface = queryInterface, queryTermination = queryTermination, release = release)
  
    __obj.asInstanceOf[XTerminateListener]
  }
}

