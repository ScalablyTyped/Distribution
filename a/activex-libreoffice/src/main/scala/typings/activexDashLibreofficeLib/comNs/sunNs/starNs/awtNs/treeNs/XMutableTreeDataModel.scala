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

object XMutableTreeDataModel {
  @scala.inline
  def apply(
    Root: XTreeNode,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addTreeDataModelListener: js.Function1[XTreeDataModelListener, scala.Unit],
    createNode: js.Function2[js.Any, scala.Boolean, XMutableTreeNode],
    dispose: js.Function0[scala.Unit],
    getRoot: js.Function0[XTreeNode],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeTreeDataModelListener: js.Function1[XTreeDataModelListener, scala.Unit],
    setRoot: js.Function1[XMutableTreeNode, scala.Unit]
  ): XMutableTreeDataModel = {
    val __obj = js.Dynamic.literal(Root = Root, acquire = acquire, addEventListener = addEventListener, addTreeDataModelListener = addTreeDataModelListener, createNode = createNode, dispose = dispose, getRoot = getRoot, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeTreeDataModelListener = removeTreeDataModelListener, setRoot = setRoot)
  
    __obj.asInstanceOf[XMutableTreeDataModel]
  }
}

