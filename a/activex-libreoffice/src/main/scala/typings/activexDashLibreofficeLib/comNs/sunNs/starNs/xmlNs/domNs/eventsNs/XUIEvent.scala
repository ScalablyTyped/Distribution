package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUIEvent extends XEvent {
  val Detail: scala.Double
  val View: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView
  def getDetail(): scala.Double
  def getView(): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView
  def initUIEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView,
    detailArg: scala.Double
  ): scala.Unit
}

object XUIEvent {
  @scala.inline
  def apply(
    Bubbles: scala.Boolean,
    Cancelable: scala.Boolean,
    CurrentTarget: XEventTarget,
    Detail: scala.Double,
    EventPhase: PhaseType,
    Target: XEventTarget,
    TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Type: java.lang.String,
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView,
    acquire: js.Function0[scala.Unit],
    getBubbles: js.Function0[scala.Boolean],
    getCancelable: js.Function0[scala.Boolean],
    getCurrentTarget: js.Function0[XEventTarget],
    getDetail: js.Function0[scala.Double],
    getEventPhase: js.Function0[PhaseType],
    getTarget: js.Function0[XEventTarget],
    getTimeStamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getType: js.Function0[java.lang.String],
    getView: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.viewsNs.XAbstractView],
    initEvent: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
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
  ): XUIEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bubbles")(Bubbles)
    __obj.updateDynamic("Cancelable")(Cancelable)
    __obj.updateDynamic("CurrentTarget")(CurrentTarget)
    __obj.updateDynamic("Detail")(Detail)
    __obj.updateDynamic("EventPhase")(EventPhase)
    __obj.updateDynamic("Target")(Target)
    __obj.updateDynamic("TimeStamp")(TimeStamp)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("View")(View)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getBubbles")(getBubbles)
    __obj.updateDynamic("getCancelable")(getCancelable)
    __obj.updateDynamic("getCurrentTarget")(getCurrentTarget)
    __obj.updateDynamic("getDetail")(getDetail)
    __obj.updateDynamic("getEventPhase")(getEventPhase)
    __obj.updateDynamic("getTarget")(getTarget)
    __obj.updateDynamic("getTimeStamp")(getTimeStamp)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("initEvent")(initEvent)
    __obj.updateDynamic("initUIEvent")(initUIEvent)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[XUIEvent]
  }
}

