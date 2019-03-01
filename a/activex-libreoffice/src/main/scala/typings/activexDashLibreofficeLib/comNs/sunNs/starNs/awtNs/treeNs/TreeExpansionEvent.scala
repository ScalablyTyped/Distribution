package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event tells you what node is currently expanding or collapsing.
  * @see XTreeExpansionListener
  * @see XTreeControl
  */
trait TreeExpansionEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  var Node: XTreeNode
}

object TreeExpansionEvent {
  @scala.inline
  def apply(Node: XTreeNode, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): TreeExpansionEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Node")(Node)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[TreeExpansionEvent]
  }
}

