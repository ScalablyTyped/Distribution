package typings.activexLibreoffice.com_.sun.star.xml.dom.events

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.Time
import typings.activexLibreoffice.com_.sun.star.xml.dom.views.XAbstractView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMouseEvent extends XUIEvent {
  val AltKey: Boolean = js.native
  val Button: Double = js.native
  val ClientX: Double = js.native
  val ClientY: Double = js.native
  val CtrlKey: Boolean = js.native
  val MetaKey: Boolean = js.native
  val RelatedTarget: XEventTarget = js.native
  val ScreenX: Double = js.native
  val ScreenY: Double = js.native
  val ShiftKey: Boolean = js.native
  def getAltKey(): Boolean = js.native
  def getButton(): Double = js.native
  def getClientX(): Double = js.native
  def getClientY(): Double = js.native
  def getCtrlKey(): Boolean = js.native
  def getMetaKey(): Boolean = js.native
  def getRelatedTarget(): XEventTarget = js.native
  def getScreenX(): Double = js.native
  def getScreenY(): Double = js.native
  def getShiftKey(): Boolean = js.native
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
  ): Unit = js.native
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
  @scala.inline
  implicit class XMouseEventOps[Self <: XMouseEvent] (val x: Self) extends AnyVal {
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
    def setAltKey(value: Boolean): Self = this.set("AltKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: Double): Self = this.set("Button", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientX(value: Double): Self = this.set("ClientX", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientY(value: Double): Self = this.set("ClientY", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("CtrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetaKey(value: Boolean): Self = this.set("MetaKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedTarget(value: XEventTarget): Self = this.set("RelatedTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenX(value: Double): Self = this.set("ScreenX", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenY(value: Double): Self = this.set("ScreenY", value.asInstanceOf[js.Any])
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("ShiftKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAltKey(value: () => Boolean): Self = this.set("getAltKey", js.Any.fromFunction0(value))
    @scala.inline
    def setGetButton(value: () => Double): Self = this.set("getButton", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClientX(value: () => Double): Self = this.set("getClientX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetClientY(value: () => Double): Self = this.set("getClientY", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCtrlKey(value: () => Boolean): Self = this.set("getCtrlKey", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMetaKey(value: () => Boolean): Self = this.set("getMetaKey", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRelatedTarget(value: () => XEventTarget): Self = this.set("getRelatedTarget", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScreenX(value: () => Double): Self = this.set("getScreenX", js.Any.fromFunction0(value))
    @scala.inline
    def setGetScreenY(value: () => Double): Self = this.set("getScreenY", js.Any.fromFunction0(value))
    @scala.inline
    def setGetShiftKey(value: () => Boolean): Self = this.set("getShiftKey", js.Any.fromFunction0(value))
    @scala.inline
    def setInitMouseEvent(
      value: (String, Boolean, Boolean, XAbstractView, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, XEventTarget) => Unit
    ): Self = this.set("initMouseEvent", js.Any.fromFunction15(value))
  }
  
}

