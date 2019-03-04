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
    acquire: js.Function0[scala.Unit],
    getBubbles: js.Function0[scala.Boolean],
    getCancelable: js.Function0[scala.Boolean],
    getCurrentTarget: js.Function0[XEventTarget],
    getEventPhase: js.Function0[PhaseType],
    getTarget: js.Function0[XEventTarget],
    getTimeStamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getType: js.Function0[java.lang.String],
    initEvent: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit]
  ): XEvent = {
    val __obj = js.Dynamic.literal(Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, EventPhase = EventPhase, Target = Target, TimeStamp = TimeStamp, Type = Type, acquire = acquire, getBubbles = getBubbles, getCancelable = getCancelable, getCurrentTarget = getCurrentTarget, getEventPhase = getEventPhase, getTarget = getTarget, getTimeStamp = getTimeStamp, getType = getType, initEvent = initEvent, preventDefault = preventDefault, queryInterface = queryInterface, release = release, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[XEvent]
  }
}

