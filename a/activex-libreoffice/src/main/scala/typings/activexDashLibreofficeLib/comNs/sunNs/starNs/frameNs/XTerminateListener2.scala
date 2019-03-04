package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extend interface {@link XTerminateListener} so a listener will be informed in case termination process was canceled by other reasons. */
trait XTerminateListener2 extends XTerminateListener {
  /**
    * is called when the master environment (e.g., desktop) was canceled in it's terminate request.
    *
    * Termination can be intercepted by throwing {@link TerminationVetoException} . But if a listener was queried for termination .. doesn't throw a veto
    * exception ... it doesn't know if termination will be real next time. Because any other listener can throw those exception too ... and so it can happen
    * that after {@link queryTermination()} no {@link notifyTermination()} will occur. But these listener don't know if its allowed to start new processes
    * then. Using this optional(!) interface will make it possible to be informed about canceled termination requests also.
    * @param Event describe the source of the event (e.g., the desktop)
    */
  def cancelTermination(Event: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XTerminateListener2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    cancelTermination: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    notifyTermination: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryTermination: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XTerminateListener2 = {
    val __obj = js.Dynamic.literal(acquire = acquire, cancelTermination = cancelTermination, disposing = disposing, notifyTermination = notifyTermination, queryInterface = queryInterface, queryTermination = queryTermination, release = release)
  
    __obj.asInstanceOf[XTerminateListener2]
  }
}

