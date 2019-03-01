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

object XPrintableListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    stateChanged: js.Function1[PrintableStateEvent, scala.Unit]
  ): XPrintableListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("stateChanged")(stateChanged)
    __obj.asInstanceOf[XPrintableListener]
  }
}

