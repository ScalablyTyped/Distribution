package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDocumentEvent extends XInterface {
  def createEvent(eventType: String): XEvent
}

object XDocumentEvent {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createEvent: String => XEvent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentEvent = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createEvent = js.Any.fromFunction1(createEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDocumentEvent]
  }
}

