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
    acquire: () => scala.Unit,
    addEventListener: (java.lang.String, XEventListener, scala.Boolean) => scala.Unit,
    dispatchEvent: XEvent => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: (java.lang.String, XEventListener, scala.Boolean) => scala.Unit
  ): XEventTarget = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction3(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction3(removeEventListener))
  
    __obj.asInstanceOf[XEventTarget]
  }
}

