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
    val __obj = js.Dynamic.literal(Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, Detail = Detail, EventPhase = EventPhase, Target = Target, TimeStamp = TimeStamp, Type = Type, View = View, acquire = acquire, getBubbles = getBubbles, getCancelable = getCancelable, getCurrentTarget = getCurrentTarget, getDetail = getDetail, getEventPhase = getEventPhase, getTarget = getTarget, getTimeStamp = getTimeStamp, getType = getType, getView = getView, initEvent = initEvent, initUIEvent = initUIEvent, preventDefault = preventDefault, queryInterface = queryInterface, release = release, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[XUIEvent]
  }
}

