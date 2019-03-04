package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link TreeControl} to get notifications about data model changes.
  *
  * Usually you must not implement this interface yourself as it is already handled by the {@link TreeControl} , but you must notify it correctly if you
  * implement the {@link XTreeDataModel} yourself
  *
  * .
  */
trait XTreeDataModelListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * Invoked after a node (or a set of siblings) has changed in some way. The node(s) have not changed locations in the tree or altered their children
    * arrays, but other attributes have changed and may affect presentation.
    *
    * Example: the name of a file has changed, but it is in the same location in the file system.
    *
    * To indicate the root has changed, {@link TreeDataModelEvent.Nodes} will contain the root node and {@link TreeDataModelEvent.ParentNode} will be empty.
    */
  def treeNodesChanged(Event: TreeDataModelEvent): scala.Unit
  /**
    * Invoked after nodes have been inserted into the tree.
    *
    * Use {@link TreeDataModelEvent.ParentNode} to get the parent of the new node(s). {@link TreeDataModelEvent.Nodes} contains the new node(s).
    */
  def treeNodesInserted(Event: TreeDataModelEvent): scala.Unit
  /**
    * Invoked after nodes have been removed from the tree.
    *
    * Note that if a subtree is removed from the tree, this method may only be invoked once for the root of the removed subtree, not once for each
    * individual set of siblings removed.
    *
    * Use {@link TreeDataModelEvent.ParentNode} to get the former parent of the deleted node(s). {@link TreeDataModelEvent.Nodes} contains the removed
    * node(s).
    */
  def treeNodesRemoved(Event: TreeDataModelEvent): scala.Unit
  /**
    * Invoked after the tree has drastically changed structure from a given node down.
    *
    * Use {@link TreeDataModelEvent.ParentNode} to get the node which structure has changed. {@link TreeDataModelEvent.Nodes} is empty.
    */
  def treeStructureChanged(Event: TreeDataModelEvent): scala.Unit
}

object XTreeDataModelListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    treeNodesChanged: js.Function1[TreeDataModelEvent, scala.Unit],
    treeNodesInserted: js.Function1[TreeDataModelEvent, scala.Unit],
    treeNodesRemoved: js.Function1[TreeDataModelEvent, scala.Unit],
    treeStructureChanged: js.Function1[TreeDataModelEvent, scala.Unit]
  ): XTreeDataModelListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, treeNodesChanged = treeNodesChanged, treeNodesInserted = treeNodesInserted, treeNodesRemoved = treeNodesRemoved, treeStructureChanged = treeStructureChanged)
  
    __obj.asInstanceOf[XTreeDataModelListener]
  }
}

