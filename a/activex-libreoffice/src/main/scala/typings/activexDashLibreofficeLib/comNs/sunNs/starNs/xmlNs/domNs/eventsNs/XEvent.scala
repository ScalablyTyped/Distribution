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

object XEvent {
  @scala.inline
  def apply(
    Bubbles: scala.Boolean,
    Cancelable: scala.Boolean,
    CurrentTarget: XEventTarget,
    EventPhase: PhaseType,
    Target: XEventTarget,
    TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Type: java.lang.String,
    acquire: () => scala.Unit,
    getBubbles: () => scala.Boolean,
    getCancelable: () => scala.Boolean,
    getCurrentTarget: () => XEventTarget,
    getEventPhase: () => PhaseType,
    getTarget: () => XEventTarget,
    getTimeStamp: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    getType: () => java.lang.String,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    preventDefault: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    stopPropagation: () => scala.Unit
  ): XEvent = {
    val __obj = js.Dynamic.literal(Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, EventPhase = EventPhase, Target = Target, TimeStamp = TimeStamp, Type = Type, acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[XEvent]
  }
}

