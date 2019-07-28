package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Time
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUIEvent extends XEvent {
  val Detail: Double
  val View: XAbstractView
  def getDetail(): Double
  def getView(): XAbstractView
  def initUIEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    viewArg: XAbstractView,
    detailArg: Double
  ): Unit
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
    val __obj = js.Dynamic.literal(Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, Detail = Detail, EventPhase = EventPhase, Target = Target, TimeStamp = TimeStamp, Type = Type, View = View, acquire = js.Any.fromFunction0(acquire), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getDetail = js.Any.fromFunction0(getDetail), getEventPhase = js.Any.fromFunction0(getEventPhase), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), getView = js.Any.fromFunction0(getView), initEvent = js.Any.fromFunction3(initEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[XUIEvent]
  }
}

