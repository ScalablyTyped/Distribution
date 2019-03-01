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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AltKey")(AltKey)
    __obj.updateDynamic("Bubbles")(Bubbles)
    __obj.updateDynamic("Button")(Button)
    __obj.updateDynamic("Cancelable")(Cancelable)
    __obj.updateDynamic("ClientX")(ClientX)
    __obj.updateDynamic("ClientY")(ClientY)
    __obj.updateDynamic("CtrlKey")(CtrlKey)
    __obj.updateDynamic("CurrentTarget")(CurrentTarget)
    __obj.updateDynamic("Detail")(Detail)
    __obj.updateDynamic("EventPhase")(EventPhase)
    __obj.updateDynamic("MetaKey")(MetaKey)
    __obj.updateDynamic("RelatedTarget")(RelatedTarget)
    __obj.updateDynamic("ScreenX")(ScreenX)
    __obj.updateDynamic("ScreenY")(ScreenY)
    __obj.updateDynamic("ShiftKey")(ShiftKey)
    __obj.updateDynamic("Target")(Target)
    __obj.updateDynamic("TimeStamp")(TimeStamp)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("View")(View)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAltKey")(getAltKey)
    __obj.updateDynamic("getBubbles")(getBubbles)
    __obj.updateDynamic("getButton")(getButton)
    __obj.updateDynamic("getCancelable")(getCancelable)
    __obj.updateDynamic("getClientX")(getClientX)
    __obj.updateDynamic("getClientY")(getClientY)
    __obj.updateDynamic("getCtrlKey")(getCtrlKey)
    __obj.updateDynamic("getCurrentTarget")(getCurrentTarget)
    __obj.updateDynamic("getDetail")(getDetail)
    __obj.updateDynamic("getEventPhase")(getEventPhase)
    __obj.updateDynamic("getMetaKey")(getMetaKey)
    __obj.updateDynamic("getRelatedTarget")(getRelatedTarget)
    __obj.updateDynamic("getScreenX")(getScreenX)
    __obj.updateDynamic("getScreenY")(getScreenY)
    __obj.updateDynamic("getShiftKey")(getShiftKey)
    __obj.updateDynamic("getTarget")(getTarget)
    __obj.updateDynamic("getTimeStamp")(getTimeStamp)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("initEvent")(initEvent)
    __obj.updateDynamic("initMouseEvent")(initMouseEvent)
    __obj.updateDynamic("initUIEvent")(initUIEvent)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[XMouseEvent]
  }
}

