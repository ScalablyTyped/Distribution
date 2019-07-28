package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEventTarget extends XInterface {
  def addEventListener(eventType: String, listener: XEventListener, useCapture: Boolean): Unit
  def dispatchEvent(evt: XEvent): Boolean
  def removeEventListener(eventType: String, listener: XEventListener, useCapture: Boolean): Unit
}

object XEventTarget {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: (String, XEventListener, Boolean) => Unit,
    dispatchEvent: XEvent => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: (String, XEventListener, Boolean) => Unit
  ): XEventTarget = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction3(removeEventListener))
  
    __obj.asInstanceOf[XEventTarget]
  }
}

