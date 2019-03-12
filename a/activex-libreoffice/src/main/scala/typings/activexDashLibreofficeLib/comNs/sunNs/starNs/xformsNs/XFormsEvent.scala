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
    acquire: () => scala.Unit,
    getBubbles: () => scala.Boolean,
    getCancelable: () => scala.Boolean,
    getCurrentTarget: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget,
    getEventPhase: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType,
    getTarget: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget,
    getTimeStamp: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    getType: () => java.lang.String,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    initXFormsEvent: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    preventDefault: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    stopPropagation: () => scala.Unit
  ): XFormsEvent = {
    val __obj = js.Dynamic.literal(Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, EventPhase = EventPhase, Target = Target, TimeStamp = TimeStamp, Type = Type, acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), initXFormsEvent = js.Any.fromFunction3(initXFormsEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[XFormsEvent]
  }
}

