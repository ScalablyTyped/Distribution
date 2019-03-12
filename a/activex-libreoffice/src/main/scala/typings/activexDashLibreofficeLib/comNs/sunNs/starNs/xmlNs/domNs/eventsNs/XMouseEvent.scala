package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMouseEvent extends XUIEvent {
  val AltKey: scala.Boolean
  val Button: scala.Double
  val ClientX: scala.Double
  val ClientY: scala.Double
  val CtrlKey: scala.Boolean
  val MetaKey: scala.Boolean
  val RelatedTarget: XEventTarget
  val ScreenX: scala.Double
  val ScreenY: scala.Double
  val ShiftKey: scala.Boolean
  def getAltKey(): scala.Boolean
  def getButton(): scala.Double
  def getClientX(): scala.Double
  def getClientY(): scala.Double
  def getCtrlKey(): scala.Boolean
  def getMetaKey(): scala.Boolean
  def getRelatedTarget(): XEventTarget
  def getScreenX(): scala.Double
  def getScreenY(): scala.Double
  def getShiftKey(): scala.Boolean
  def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView,
    detailArg: scala.Double,
    screenXArg: scala.Double,
    screenYArg: scala.Double,
    clientXArg: scala.Double,
    clientYArg: scala.Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: scala.Double,
    relatedTargetArg: XEventTarget
  ): scala.Unit
}

object XMouseEvent {
  @scala.inline
  def apply(
    AltKey: scala.Boolean,
    Bubbles: scala.Boolean,
    Button: scala.Double,
    Cancelable: scala.Boolean,
    ClientX: scala.Double,
    ClientY: scala.Double,
    CtrlKey: scala.Boolean,
    CurrentTarget: XEventTarget,
    Detail: scala.Double,
    EventPhase: PhaseType,
    MetaKey: scala.Boolean,
    RelatedTarget: XEventTarget,
    ScreenX: scala.Double,
    ScreenY: scala.Double,
    ShiftKey: scala.Boolean,
    Target: XEventTarget,
    TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Type: java.lang.String,
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView,
    acquire: () => scala.Unit,
    getAltKey: () => scala.Boolean,
    getBubbles: () => scala.Boolean,
    getButton: () => scala.Double,
    getCancelable: () => scala.Boolean,
    getClientX: () => scala.Double,
    getClientY: () => scala.Double,
    getCtrlKey: () => scala.Boolean,
    getCurrentTarget: () => XEventTarget,
    getDetail: () => scala.Double,
    getEventPhase: () => PhaseType,
    getMetaKey: () => scala.Boolean,
    getRelatedTarget: () => XEventTarget,
    getScreenX: () => scala.Double,
    getScreenY: () => scala.Double,
    getShiftKey: () => scala.Boolean,
    getTarget: () => XEventTarget,
    getTimeStamp: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    getType: () => java.lang.String,
    getView: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    initMouseEvent: (java.lang.String, scala.Boolean, scala.Boolean, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Boolean, scala.Boolean, scala.Boolean, scala.Boolean, scala.Double, XEventTarget) => scala.Unit,
    initUIEvent: (java.lang.String, scala.Boolean, scala.Boolean, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView, scala.Double) => scala.Unit,
    preventDefault: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    stopPropagation: () => scala.Unit
  ): XMouseEvent = {
    val __obj = js.Dynamic.literal(AltKey = AltKey, Bubbles = Bubbles, Button = Button, Cancelable = Cancelable, ClientX = ClientX, ClientY = ClientY, CtrlKey = CtrlKey, CurrentTarget = CurrentTarget, Detail = Detail, EventPhase = EventPhase, MetaKey = MetaKey, RelatedTarget = RelatedTarget, ScreenX = ScreenX, ScreenY = ScreenY, ShiftKey = ShiftKey, Target = Target, TimeStamp = TimeStamp, Type = Type, View = View, acquire = js.Any.fromFunction0(acquire), getAltKey = js.Any.fromFunction0(getAltKey), getBubbles = js.Any.fromFunction0(getBubbles), getButton = js.Any.fromFunction0(getButton), getCancelable = js.Any.fromFunction0(getCancelable), getClientX = js.Any.fromFunction0(getClientX), getClientY = js.Any.fromFunction0(getClientY), getCtrlKey = js.Any.fromFunction0(getCtrlKey), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getDetail = js.Any.fromFunction0(getDetail), getEventPhase = js.Any.fromFunction0(getEventPhase), getMetaKey = js.Any.fromFunction0(getMetaKey), getRelatedTarget = js.Any.fromFunction0(getRelatedTarget), getScreenX = js.Any.fromFunction0(getScreenX), getScreenY = js.Any.fromFunction0(getScreenY), getShiftKey = js.Any.fromFunction0(getShiftKey), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), getView = js.Any.fromFunction0(getView), initEvent = js.Any.fromFunction3(initEvent), initMouseEvent = js.Any.fromFunction15(initMouseEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[XMouseEvent]
  }
}

