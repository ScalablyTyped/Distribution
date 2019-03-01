package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xformsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XFormsEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEvent {
  def initXFormsEvent(typeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): scala.Unit
}

object XFormsEvent {
  @scala.inline
  def apply(
    Bubbles: scala.Boolean,
    Cancelable: scala.Boolean,
    CurrentTarget: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget,
    EventPhase: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType,
    Target: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget,
    TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Type: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getBubbles: js.Function0[scala.Boolean],
    getCancelable: js.Function0[scala.Boolean],
    getCurrentTarget: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget],
    getEventPhase: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.PhaseType],
    getTarget: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs.XEventTarget],
    getTimeStamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getType: js.Function0[java.lang.String],
    initEvent: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    initXFormsEvent: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    preventDefault: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit]
  ): XFormsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bubbles")(Bubbles)
    __obj.updateDynamic("Cancelable")(Cancelable)
    __obj.updateDynamic("CurrentTarget")(CurrentTarget)
    __obj.updateDynamic("EventPhase")(EventPhase)
    __obj.updateDynamic("Target")(Target)
    __obj.updateDynamic("TimeStamp")(TimeStamp)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getBubbles")(getBubbles)
    __obj.updateDynamic("getCancelable")(getCancelable)
    __obj.updateDynamic("getCurrentTarget")(getCurrentTarget)
    __obj.updateDynamic("getEventPhase")(getEventPhase)
    __obj.updateDynamic("getTarget")(getTarget)
    __obj.updateDynamic("getTimeStamp")(getTimeStamp)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("initEvent")(initEvent)
    __obj.updateDynamic("initXFormsEvent")(initXFormsEvent)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[XFormsEvent]
  }
}

