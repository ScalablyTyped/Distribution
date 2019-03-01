package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEventTarget
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def addEventListener(eventType: java.lang.String, listener: XEventListener, useCapture: scala.Boolean): scala.Unit
  def dispatchEvent(evt: XEvent): scala.Boolean
  def removeEventListener(eventType: java.lang.String, listener: XEventListener, useCapture: scala.Boolean): scala.Unit
}

object XEventTarget {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function3[java.lang.String, XEventListener, scala.Boolean, scala.Unit],
    dispatchEvent: js.Function1[XEvent, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function3[java.lang.String, XEventListener, scala.Boolean, scala.Unit]
  ): XEventTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispatchEvent")(dispatchEvent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[XEventTarget]
  }
}

