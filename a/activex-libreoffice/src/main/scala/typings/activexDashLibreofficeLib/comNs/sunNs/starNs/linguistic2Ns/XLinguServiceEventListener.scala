package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.linguistic2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used to inform listeners about LinguServiceEvents.
  *
  * The function of this interface is used by the {@link com.sun.star.linguistic2.XLinguServiceEventBroadcaster} to inform its listeners about the
  * com::sun::star::linguistic2::LinguServiceEvents.
  * @see com.sun.star.linguistic2.XLinguServiceManager
  */
trait XLinguServiceEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** @param aLngSvcEvent the event the listener will be informed about. */
  def processLinguServiceEvent(aLngSvcEvent: LinguServiceEvent): scala.Unit
}

object XLinguServiceEventListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    processLinguServiceEvent: js.Function1[LinguServiceEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLinguServiceEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, processLinguServiceEvent = processLinguServiceEvent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLinguServiceEventListener]
  }
}

