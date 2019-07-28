package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEventListener extends XInterface {
  def handleEvent(evt: XEvent): Unit
}

object XEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    handleEvent: XEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handleEvent = js.Any.fromFunction1(handleEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEventListener]
  }
}

