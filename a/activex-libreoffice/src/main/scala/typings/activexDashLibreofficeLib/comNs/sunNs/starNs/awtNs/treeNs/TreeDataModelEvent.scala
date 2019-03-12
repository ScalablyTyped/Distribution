package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event used by a {@link XTreeDataModel} to notify changes in the data model to the {@link XTreeControl} . You usually need to fill this event only
  * if you implement the {@link XTreeDataModel} yourself.
  * @see XTreeDataModel
  * @see XTreeControl
  * @see XTreeDataModelListener
  */
trait TreeDataModelEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * contains the changed, added or removed nodes.
    *
    * All nodes must have {@link ParentNode} as parent.
    */
  var Nodes: stdLib.SafeArray[XTreeNode]
  /**
    * holds the parent node for changed, added or removed nodes.
    *
    * If this is null, {@link Nodes} must contain only the root node
    */
  var ParentNode: XTreeNode
}

object TreeDataModelEvent {
  @scala.inline
  def apply(
    Nodes: stdLib.SafeArray[XTreeNode],
    ParentNode: XTreeNode,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): TreeDataModelEvent = {
    val __obj = js.Dynamic.literal(Nodes = Nodes, ParentNode = ParentNode, Source = Source)
  
    __obj.asInstanceOf[TreeDataModelEvent]
  }
}

