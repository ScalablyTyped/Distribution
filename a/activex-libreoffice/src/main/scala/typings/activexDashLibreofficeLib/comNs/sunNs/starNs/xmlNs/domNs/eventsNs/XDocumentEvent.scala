package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def createEvent(eventType: java.lang.String): XEvent
}

object XDocumentEvent {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createEvent: js.Function1[java.lang.String, XEvent],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDocumentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createEvent")(createEvent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDocumentEvent]
  }
}

