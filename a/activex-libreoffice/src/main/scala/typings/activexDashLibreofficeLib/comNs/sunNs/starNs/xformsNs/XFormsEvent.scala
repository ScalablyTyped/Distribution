package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XFormsEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEvent {
  def initXFormsEvent(typeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): scala.Unit
}

object XFormsEvent {
  @scala.inline
  def apply(
    Bubbles: scala.Boolean,
    Cancelable: scala.Boolean,
    CurrentTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget,
    EventPhase: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType,
    Target: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget,
    TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Type: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getBubbles: js.Function0[scala.Boolean],
    getCancelable: js.Function0[scala.Boolean],
    getCurrentTarget: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget],
    getEventPhase: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType],
    getTarget: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget],
    getTimeStamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getType: js.Function0[java.lang.String],
    initEvent: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    initXFormsEvent: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit]
  ): XFormsEvent = {
    val __obj = js.Dynamic.literal(Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, EventPhase = EventPhase, Target = Target, TimeStamp = TimeStamp, Type = Type, acquire = acquire, getBubbles = getBubbles, getCancelable = getCancelable, getCurrentTarget = getCurrentTarget, getEventPhase = getEventPhase, getTarget = getTarget, getTimeStamp = getTimeStamp, getType = getType, initEvent = initEvent, initXFormsEvent = initXFormsEvent, preventDefault = preventDefault, queryInterface = queryInterface, release = release, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[XFormsEvent]
  }
}

