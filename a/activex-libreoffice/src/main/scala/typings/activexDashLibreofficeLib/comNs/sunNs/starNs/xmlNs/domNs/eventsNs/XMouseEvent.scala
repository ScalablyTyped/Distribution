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
    acquire: js.Function0[scala.Unit],
    getAltKey: js.Function0[scala.Boolean],
    getBubbles: js.Function0[scala.Boolean],
    getButton: js.Function0[scala.Double],
    getCancelable: js.Function0[scala.Boolean],
    getClientX: js.Function0[scala.Double],
    getClientY: js.Function0[scala.Double],
    getCtrlKey: js.Function0[scala.Boolean],
    getCurrentTarget: js.Function0[XEventTarget],
    getDetail: js.Function0[scala.Double],
    getEventPhase: js.Function0[PhaseType],
    getMetaKey: js.Function0[scala.Boolean],
    getRelatedTarget: js.Function0[XEventTarget],
    getScreenX: js.Function0[scala.Double],
    getScreenY: js.Function0[scala.Double],
    getShiftKey: js.Function0[scala.Boolean],
    getTarget: js.Function0[XEventTarget],
    getTimeStamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getType: js.Function0[java.lang.String],
    getView: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView],
    initEvent: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    initMouseEvent: js.Function15[
      java.lang.String, 
      scala.Boolean, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Double, 
      XEventTarget, 
      scala.Unit
    ],
    initUIEvent: js.Function5[
      java.lang.String, 
      scala.Boolean, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView, 
      scala.Double, 
      scala.Unit
    ],
    preventDefault: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit]
  ): XMouseEvent = {
    val __obj = js.Dynamic.literal(AltKey = AltKey, Bubbles = Bubbles, Button = Button, Cancelable = Cancelable, ClientX = ClientX, ClientY = ClientY, CtrlKey = CtrlKey, CurrentTarget = CurrentTarget, Detail = Detail, EventPhase = EventPhase, MetaKey = MetaKey, RelatedTarget = RelatedTarget, ScreenX = ScreenX, ScreenY = ScreenY, ShiftKey = ShiftKey, Target = Target, TimeStamp = TimeStamp, Type = Type, View = View, acquire = acquire, getAltKey = getAltKey, getBubbles = getBubbles, getButton = getButton, getCancelable = getCancelable, getClientX = getClientX, getClientY = getClientY, getCtrlKey = getCtrlKey, getCurrentTarget = getCurrentTarget, getDetail = getDetail, getEventPhase = getEventPhase, getMetaKey = getMetaKey, getRelatedTarget = getRelatedTarget, getScreenX = getScreenX, getScreenY = getScreenY, getShiftKey = getShiftKey, getTarget = getTarget, getTimeStamp = getTimeStamp, getType = getType, getView = getView, initEvent = initEvent, initMouseEvent = initMouseEvent, initUIEvent = initUIEvent, preventDefault = preventDefault, queryInterface = queryInterface, release = release, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[XMouseEvent]
  }
}

