package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.treeNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
trait TreeDataModelEvent extends EventObject {
  /**
    * contains the changed, added or removed nodes.
    *
    * All nodes must have {@link ParentNode} as parent.
    */
  var Nodes: SafeArray[XTreeNode]
  /**
    * holds the parent node for changed, added or removed nodes.
    *
    * If this is null, {@link Nodes} must contain only the root node
    */
  var ParentNode: XTreeNode
}

object TreeDataModelEvent {
  @scala.inline
  def apply(Nodes: SafeArray[XTreeNode], ParentNode: XTreeNode, Source: XInterface): TreeDataModelEvent = {
    val __obj = js.Dynamic.literal(Nodes = Nodes, ParentNode = ParentNode, Source = Source)
  
    __obj.asInstanceOf[TreeDataModelEvent]
  }
}

