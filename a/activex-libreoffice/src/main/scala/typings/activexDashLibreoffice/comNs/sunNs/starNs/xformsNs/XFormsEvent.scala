package typings.activexDashLibreoffice.comNs.sunNs.starNs.xformsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEvent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XFormsEvent extends XEvent {
  def initXFormsEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit
}

object XFormsEvent {
  @scala.inline
  def apply(
    Bubbles: Boolean,
    Cancelable: Boolean,
    CurrentTarget: XEventTarget,
    EventPhase: PhaseType,
    Target: XEventTarget,
    TimeStamp: Time,
    Type: String,
    acquire: () => Unit,
    getBubbles: () => Boolean,
    getCancelable: () => Boolean,
    getCurrentTarget: () => XEventTarget,
    getEventPhase: () => PhaseType,
    getTarget: () => XEventTarget,
    getTimeStamp: () => Time,
    getType: () => String,
    initEvent: (String, Boolean, Boolean) => Unit,
    initXFormsEvent: (String, Boolean, Boolean) => Unit,
    preventDefault: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stopPropagation: () => Unit
  ): XFormsEvent = {
    val __obj = js.Dynamic.literal(Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, EventPhase = EventPhase, Target = Target, TimeStamp = TimeStamp, Type = Type, acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), initXFormsEvent = js.Any.fromFunction3(initXFormsEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[XFormsEvent]
  }
}

