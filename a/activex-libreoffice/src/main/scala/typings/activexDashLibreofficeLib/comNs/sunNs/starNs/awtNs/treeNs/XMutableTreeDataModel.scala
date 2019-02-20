package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the editable version of the {@link XTreeDataModel} .
  *
  * Note that only {@link XTreeNode} created from the same instance with {@link createNode()} are valid nodes for this instance.
  */
trait XMutableTreeDataModel extends XTreeDataModel {
  /**
    * creates a new tree node with the given value and given settings.
    * @param DisplayValue should be convertible to a string and is used by the {@link XTreeControl} as a textual representation of the created node.
    * @param ChildrenOnDemand if `TRUE` is used as a parameter, the created node will be treated as a non-leaf node by the {@link XTreeControl} , even when it
    * @returns a new {@link XMutableTreeNode} that can be used for this model.
    * @see XTreeNode.getDisplayValue()
    * @see XTreeNode.hasChildrenOnDemand()
    */
  def createNode(DisplayValue: js.Any, ChildrenOnDemand: scala.Boolean): XMutableTreeNode
  /**
    * changes the root node of this model to **RootNode** .
    * @param RootNode the {@link XMutableTreeNode} that becomes the new root node of this model.
    * @throws com::sun::star::lang::IllegalArgumentException if **RootNode** is not a valid node of this {@link XTreeDataModel} .
    */
  def setRoot(RootNode: XMutableTreeNode): scala.Unit
}

