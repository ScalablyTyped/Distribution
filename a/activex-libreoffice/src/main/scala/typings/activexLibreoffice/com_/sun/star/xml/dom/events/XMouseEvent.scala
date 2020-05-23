package typings.activexLibreoffice.com_.sun.star.xml.dom.events

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.activexLibreoffice.com_.sun.star.xml.dom.views.XAbstractView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMouseEvent extends XUIEvent {
  val AltKey: Boolean
  val Button: Double
  val ClientX: Double
  val ClientY: Double
  val CtrlKey: Boolean
  val MetaKey: Boolean
  val RelatedTarget: XEventTarget
  val ScreenX: Double
  val ScreenY: Double
  val ShiftKey: Boolean
  def getAltKey(): Boolean
  def getButton(): Double
  def getClientX(): Double
  def getClientY(): Double
  def getCtrlKey(): Boolean
  def getMetaKey(): Boolean
  def getRelatedTarget(): XEventTarget
  def getScreenX(): Double
  def getScreenY(): Double
  def getShiftKey(): Boolean
  def initMouseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    viewArg: XAbstractView,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double,
    relatedTargetArg: XEventTarget
  ): Unit
}

object XMouseEvent {
  @scala.inline
  def apply(
    AltKey: Boolean,
    Bubbles: Boolean,
    Button: Double,
    Cancelable: Boolean,
    ClientX: Double,
    ClientY: Double,
    CtrlKey: Boolean,
    CurrentTarget: XEventTarget,
    Detail: Double,
    EventPhase: PhaseType,
    MetaKey: Boolean,
    RelatedTarget: XEventTarget,
    ScreenX: Double,
    ScreenY: Double,
    ShiftKey: Boolean,
    Target: XEventTarget,
    TimeStamp: Time,
    Type: String,
    View: XAbstractView,
    acquire: () => Unit,
    getAltKey: () => Boolean,
    getBubbles: () => Boolean,
    getButton: () => Double,
    getCancelable: () => Boolean,
    getClientX: () => Double,
    getClientY: () => Double,
    getCtrlKey: () => Boolean,
    getCurrentTarget: () => XEventTarget,
    getDetail: () => Double,
    getEventPhase: () => PhaseType,
    getMetaKey: () => Boolean,
    getRelatedTarget: () => XEventTarget,
    getScreenX: () => Double,
    getScreenY: () => Double,
    getShiftKey: () => Boolean,
    getTarget: () => XEventTarget,
    getTimeStamp: () => Time,
    getType: () => String,
    getView: () => XAbstractView,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMouseEvent: (String, Boolean, Boolean, XAbstractView, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, XEventTarget) => Unit,
    initUIEvent: (String, Boolean, Boolean, XAbstractView, Double) => Unit,
    preventDefault: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stopPropagation: () => Unit
  ): XMouseEvent = {
    val __obj = js.Dynamic.literal(AltKey = AltKey.asInstanceOf[js.Any], Bubbles = Bubbles.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], ClientX = ClientX.asInstanceOf[js.Any], ClientY = ClientY.asInstanceOf[js.Any], CtrlKey = CtrlKey.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], MetaKey = MetaKey.asInstanceOf[js.Any], RelatedTarget = RelatedTarget.asInstanceOf[js.Any], ScreenX = ScreenX.asInstanceOf[js.Any], ScreenY = ScreenY.asInstanceOf[js.Any], ShiftKey = ShiftKey.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getAltKey = js.Any.fromFunction0(getAltKey), getBubbles = js.Any.fromFunction0(getBubbles), getButton = js.Any.fromFunction0(getButton), getCancelable = js.Any.fromFunction0(getCancelable), getClientX = js.Any.fromFunction0(getClientX), getClientY = js.Any.fromFunction0(getClientY), getCtrlKey = js.Any.fromFunction0(getCtrlKey), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getDetail = js.Any.fromFunction0(getDetail), getEventPhase = js.Any.fromFunction0(getEventPhase), getMetaKey = js.Any.fromFunction0(getMetaKey), getRelatedTarget = js.Any.fromFunction0(getRelatedTarget), getScreenX = js.Any.fromFunction0(getScreenX), getScreenY = js.Any.fromFunction0(getScreenY), getShiftKey = js.Any.fromFunction0(getShiftKey), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), getView = js.Any.fromFunction0(getView), initEvent = js.Any.fromFunction3(initEvent), initMouseEvent = js.Any.fromFunction15(initMouseEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
    __obj.asInstanceOf[XMouseEvent]
  }
}

