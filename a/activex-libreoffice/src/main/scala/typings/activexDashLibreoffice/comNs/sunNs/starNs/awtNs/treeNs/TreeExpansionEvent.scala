package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.treeNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event tells you what node is currently expanding or collapsing.
  * @see XTreeExpansionListener
  * @see XTreeControl
  */
trait TreeExpansionEvent extends EventObject {
  var Node: XTreeNode
}

object TreeExpansionEvent {
  @scala.inline
  def apply(Node: XTreeNode, Source: XInterface): TreeExpansionEvent = {
    val __obj = js.Dynamic.literal(Node = Node, Source = Source)
  
    __obj.asInstanceOf[TreeExpansionEvent]
  }
}

