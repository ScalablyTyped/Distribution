package typings.activexLibreoffice.com_.sun.star.xml.dom.events

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XEvent extends XInterface {
  val Bubbles: Boolean = js.native
  val Cancelable: Boolean = js.native
  val CurrentTarget: XEventTarget = js.native
  val EventPhase: PhaseType = js.native
  val Target: XEventTarget = js.native
  val TimeStamp: Time = js.native
  val Type: String = js.native
  def getBubbles(): Boolean = js.native
  def getCancelable(): Boolean = js.native
  def getCurrentTarget(): XEventTarget = js.native
  def getEventPhase(): PhaseType = js.native
  def getTarget(): XEventTarget = js.native
  def getTimeStamp(): Time = js.native
  def getType(): String = js.native
  def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

object XEvent {
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
    preventDefault: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stopPropagation: () => Unit
  ): XEvent = {
    val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[XEvent]
  }
  @scala.inline
  implicit class XEventOps[Self <: XEvent] (val x: Self) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("Bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("Cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTarget(value: XEventTarget): Self = this.set("CurrentTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventPhase(value: PhaseType): Self = this.set("EventPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: XEventTarget): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Time): Self = this.set("TimeStamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetBubbles(value: () => Boolean): Self = this.set("getBubbles", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCancelable(value: () => Boolean): Self = this.set("getCancelable", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCurrentTarget(value: () => XEventTarget): Self = this.set("getCurrentTarget", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEventPhase(value: () => PhaseType): Self = this.set("getEventPhase", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTarget(value: () => XEventTarget): Self = this.set("getTarget", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTimeStamp(value: () => Time): Self = this.set("getTimeStamp", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = this.set("initEvent", js.Any.fromFunction3(value))
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = this.set("preventDefault", js.Any.fromFunction0(value))
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = this.set("stopPropagation", js.Any.fromFunction0(value))
  }
  
}

