package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  val Bubbles: scala.Boolean
  val Cancelable: scala.Boolean
  val CurrentTarget: XEventTarget
  val EventPhase: PhaseType
  val Target: XEventTarget
  val TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  val Type: java.lang.String
  def getBubbles(): scala.Boolean
  def getCancelable(): scala.Boolean
  def getCurrentTarget(): XEventTarget
  def getEventPhase(): PhaseType
  def getTarget(): XEventTarget
  def getTimeStamp(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time
  def getType(): java.lang.String
  def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): scala.Unit
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

