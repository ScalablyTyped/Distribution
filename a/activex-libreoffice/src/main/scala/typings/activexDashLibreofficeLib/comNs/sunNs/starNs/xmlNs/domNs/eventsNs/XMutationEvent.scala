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
    acquire: () => scala.Unit,
    getAttrChange: () => AttrChangeType,
    getAttrName: () => java.lang.String,
    getBubbles: () => scala.Boolean,
    getCancelable: () => scala.Boolean,
    getCurrentTarget: () => XEventTarget,
    getEventPhase: () => PhaseType,
    getNewValue: () => java.lang.String,
    getPrevValue: () => java.lang.String,
    getRelatedNode: () => activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode,
    getTarget: () => XEventTarget,
    getTimeStamp: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Time,
    getType: () => java.lang.String,
    initEvent: (java.lang.String, scala.Boolean, scala.Boolean) => scala.Unit,
    initMutationEvent: (java.lang.String, scala.Boolean, scala.Boolean, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.domNs.XNode, java.lang.String, java.lang.String, java.lang.String, AttrChangeType) => scala.Unit,
    preventDefault: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    stopPropagation: () => scala.Unit
  ): XMutationEvent = {
    val __obj = js.Dynamic.literal(AttrChange = AttrChange, AttrName = AttrName, Bubbles = Bubbles, Cancelable = Cancelable, CurrentTarget = CurrentTarget, EventPhase = EventPhase, NewValue = NewValue, PrevValue = PrevValue, RelatedNode = RelatedNode, Target = Target, TimeStamp = TimeStamp, Type = Type, acquire = js.Any.fromFunction0(acquire), getAttrChange = js.Any.fromFunction0(getAttrChange), getAttrName = js.Any.fromFunction0(getAttrName), getBubbles = js.Any.fromFunction0(getBubbles), getCancelable = js.Any.fromFunction0(getCancelable), getCurrentTarget = js.Any.fromFunction0(getCurrentTarget), getEventPhase = js.Any.fromFunction0(getEventPhase), getNewValue = js.Any.fromFunction0(getNewValue), getPrevValue = js.Any.fromFunction0(getPrevValue), getRelatedNode = js.Any.fromFunction0(getRelatedNode), getTarget = js.Any.fromFunction0(getTarget), getTimeStamp = js.Any.fromFunction0(getTimeStamp), getType = js.Any.fromFunction0(getType), initEvent = js.Any.fromFunction3(initEvent), initMutationEvent = js.Any.fromFunction8(initMutationEvent), preventDefault = js.Any.fromFunction0(preventDefault), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stopPropagation = js.Any.fromFunction0(stopPropagation))
  
    __obj.asInstanceOf[XMutationEvent]
  }
}

