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
    val __obj = js.Dynamic.literal(AttrChange = AttrChange, AttrName = AttrName, Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, EventPhase = EventPhase, NewValue = NewValue, PrevValue = PrevValue, RelatedNode = RelatedNode, Target = Target, TimeStamp = TimeStamp, Type = Type, acquire = acquire, getAttrChange = getAttrChange, getAttrName = getAttrName, getBubbles = getBubbles, getCancelable = getCancelable, getCurrentTarget = getCurrentTarget, getEventPhase = getEventPhase, getNewValue = getNewValue, getPrevValue = getPrevValue, getRelatedNode = getRelatedNode, getTarget = getTarget, getTimeStamp = getTimeStamp, getType = getType, initEvent = initEvent, initMutationEvent = initMutationEvent, preventDefault = preventDefault, queryInterface = queryInterface, release = release, stopPropagation = stopPropagation)
  
    __obj.asInstanceOf[XMutationEvent]
  }
}

