package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def handleEvent(evt: XEvent): scala.Unit
}

object XEventListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    handleEvent: js.Function1[XEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("handleEvent")(handleEvent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XEventListener]
  }
}

