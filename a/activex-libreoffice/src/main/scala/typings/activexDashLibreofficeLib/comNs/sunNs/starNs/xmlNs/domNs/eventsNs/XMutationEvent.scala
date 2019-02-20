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

