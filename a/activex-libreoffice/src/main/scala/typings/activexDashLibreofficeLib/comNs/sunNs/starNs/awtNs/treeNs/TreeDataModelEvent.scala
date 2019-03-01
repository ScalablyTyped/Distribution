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
  var Nodes: activexDashInteropLib.SafeArray[XTreeNode]
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
    Nodes: activexDashInteropLib.SafeArray[XTreeNode],
    ParentNode: XTreeNode,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): TreeDataModelEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Nodes")(Nodes)
    __obj.updateDynamic("ParentNode")(ParentNode)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[TreeDataModelEvent]
  }
}

