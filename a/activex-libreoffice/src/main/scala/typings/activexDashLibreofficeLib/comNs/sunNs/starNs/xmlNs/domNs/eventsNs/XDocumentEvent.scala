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
    acquire: () => scala.Unit,
    createEvent: java.lang.String => XEvent,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDocumentEvent = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createEvent = js.Any.fromFunction1(createEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentEvent]
  }
}

