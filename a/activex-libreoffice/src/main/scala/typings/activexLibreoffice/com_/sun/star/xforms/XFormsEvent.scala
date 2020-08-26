package typings.activexLibreoffice.com_.sun.star.xforms

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.activexLibreoffice.com_.sun.star.xml.dom.events.PhaseType
import typings.activexLibreoffice.com_.sun.star.xml.dom.events.XEvent
import typings.activexLibreoffice.com_.sun.star.xml.dom.events.XEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XFormsEvent extends XEvent {
  def initXFormsEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
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
    val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), initXFormsEvent = js.Any.fromFunction3(initXFormsEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[XFormsEvent]
  }
  @scala.inline
  implicit class XFormsEventOps[Self <: XFormsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInitXFormsEvent(value: (String, Boolean, Boolean) => Unit): Self = this.set("initXFormsEvent", js.Any.fromFunction3(value))
  }
  
}

