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
    acquire: () => scala.Unit,
    handleEvent: XEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), handleEvent = js.Any.fromFunction1(handleEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEventListener]
  }
}

