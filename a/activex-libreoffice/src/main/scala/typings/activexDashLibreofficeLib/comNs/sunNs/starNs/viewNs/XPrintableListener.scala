package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives events about print job progress.
  *
  * {@link XPrintableListener} can be registered to {@link XPrintableBroadcaster} . Then, the client object will receive events about print progress.
  * @see XPrintableBroadcaster
  */
trait XPrintableListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * informs the user of the new state in print progress.
    * @param Event contains the {@link XPrintable} having changed state and the new state.
    */
  def stateChanged(Event: PrintableStateEvent): scala.Unit
}

