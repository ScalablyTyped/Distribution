package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XMutationEvent extends XEvent {
  val AttrChange: AttrChangeType
  val AttrName: java.lang.String
  val NewValue: java.lang.String
  val PrevValue: java.lang.String
  val RelatedNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  def getAttrChange(): AttrChangeType
  def getAttrName(): java.lang.String
  def getNewValue(): java.lang.String
  def getPrevValue(): java.lang.String
  def getRelatedNode(): activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode
  def initMutationEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    relatedNodeArg: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    prevValueArg: java.lang.String,
    newValueArg: java.lang.String,
    attrNameArg: java.lang.String,
    attrChangeArg: AttrChangeType
  ): scala.Unit
}

object XMutationEvent {
  @scala.inline
  def apply(
    AttrChange: AttrChangeType,
    AttrName: java.lang.String,
    Bubbles: scala.Boolean,
    Cancelable: scala.Boolean,
    CurrentTarget: XEventTarget,
    EventPhase: PhaseType,
    NewValue: java.lang.String,
    PrevValue: java.lang.String,
    RelatedNode: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    Target: XEventTarget,
    TimeStamp: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    Type: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAttrChange: js.Function0[AttrChangeType],
    getAttrName: js.Function0[java.lang.String],
    getBubbles: js.Function0[scala.Boolean],
    getCancelable: js.Function0[scala.Boolean],
    getCurrentTarget: js.Function0[XEventTarget],
    getEventPhase: js.Function0[PhaseType],
    getNewValue: js.Function0[java.lang.String],
    getPrevValue: js.Function0[java.lang.String],
    getRelatedNode: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode],
    getTarget: js.Function0[XEventTarget],
    getTimeStamp: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time],
    getType: js.Function0[java.lang.String],
    initEvent: js.Function3[java.lang.String, scala.Boolean, scala.Boolean, scala.Unit],
    initMutationEvent: js.Function8[
      java.lang.String, 
      scala.Boolean, 
      scala.Boolean, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      AttrChangeType, 
      scala.Unit
    ],
    preventDefault: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit]
  ): XMutationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AttrChange")(AttrChange)
    __obj.updateDynamic("AttrName")(AttrName)
    __obj.updateDynamic("Bubbles")(Bubbles)
    __obj.updateDynamic("Cancelable")(Cancelable)
    __obj.updateDynamic("CurrentTarget")(CurrentTarget)
    __obj.updateDynamic("EventPhase")(EventPhase)
    __obj.updateDynamic("NewValue")(NewValue)
    __obj.updateDynamic("PrevValue")(PrevValue)
    __obj.updateDynamic("RelatedNode")(RelatedNode)
    __obj.updateDynamic("Target")(Target)
    __obj.updateDynamic("TimeStamp")(TimeStamp)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAttrChange")(getAttrChange)
    __obj.updateDynamic("getAttrName")(getAttrName)
    __obj.updateDynamic("getBubbles")(getBubbles)
    __obj.updateDynamic("getCancelable")(getCancelable)
    __obj.updateDynamic("getCurrentTarget")(getCurrentTarget)
    __obj.updateDynamic("getEventPhase")(getEventPhase)
    __obj.updateDynamic("getNewValue")(getNewValue)
    __obj.updateDynamic("getPrevValue")(getPrevValue)
    __obj.updateDynamic("getRelatedNode")(getRelatedNode)
    __obj.updateDynamic("getTarget")(getTarget)
    __obj.updateDynamic("getTimeStamp")(getTimeStamp)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("initEvent")(initEvent)
    __obj.updateDynamic("initMutationEvent")(initMutationEvent)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.asInstanceOf[XMutationEvent]
  }
}

