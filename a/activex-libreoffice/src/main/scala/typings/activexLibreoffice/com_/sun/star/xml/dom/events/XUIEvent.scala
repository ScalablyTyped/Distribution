package typings.activexLibreoffice.com_.sun.star.xml.dom.events

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.activexLibreoffice.com_.sun.star.xml.dom.views.XAbstractView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XUIEvent extends XEvent {
  val Detail: Double = js.native
  val View: XAbstractView = js.native
  def getDetail(): Double = js.native
  def getView(): XAbstractView = js.native
  def initUIEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    viewArg: XAbstractView,
    detailArg: Double
  ): Unit = js.native
}

object XUIEvent {
  @scala.inline
  def apply(
    Bubbles: Boolean,
    Cancelable: Boolean,
    CurrentTarget: XEventTarget,
    Detail: Double,
    EventPhase: PhaseType,
    Target: XEventTarget,
    TimeStamp: Time,
    Type: String,
    View: XAbstractView,
    acquire: () => Unit,
    getBubbles: () => Boolean,
    getCancelable: () => Boolean,
    getCurrentTarget: () => XEventTarget,
    getDetail: () => Double,
    getEventPhase: () => PhaseType,
    getTarget: () => XEventTarget,
    getTimeStamp: () => Time,
    getType: () => String,
    getView: () => XAbstractView,
    initEvent: (String, Boolean, Boolean) => Unit,
    initUIEvent: (String, Boolean, Boolean, XAbstractView, Double) => Unit,
    preventDefault: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stopPropagation: () => Unit
  ): XUIEvent = {
    val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getDetail = js.Any.fromFunction0(getDetail), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), getView = js.Any.fromFunction0(getView), initEvent = js.Any.fromFunction3(initEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[XUIEvent]
  }
  @scala.inline
  implicit class XUIEventOps[Self <: XUIEvent] (val x: Self) extends AnyVal {
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
    def setDetail(value: Double): Self = this.set("Detail", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: XAbstractView): Self = this.set("View", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDetail(value: () => Double): Self = this.set("getDetail", js.Any.fromFunction0(value))
    @scala.inline
    def setGetView(value: () => XAbstractView): Self = this.set("getView", js.Any.fromFunction0(value))
    @scala.inline
    def setInitUIEvent(value: (String, Boolean, Boolean, XAbstractView, Double) => Unit): Self = this.set("initUIEvent", js.Any.fromFunction5(value))
  }
  
}

