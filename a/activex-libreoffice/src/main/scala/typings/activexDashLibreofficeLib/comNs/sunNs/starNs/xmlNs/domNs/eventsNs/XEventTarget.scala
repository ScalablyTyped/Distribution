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

