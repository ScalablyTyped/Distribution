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

