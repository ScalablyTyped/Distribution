package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the editable version of the {@link XTreeDataModel} .
  *
  * Note that only {@link XTreeNode} created from the same instance with {@link createNode()} are valid nodes for this instance.
  */
@js.native
trait XMutableTreeDataModel extends XTreeDataModel {
  /**
    * creates a new tree node with the given value and given settings.
    * @param DisplayValue should be convertible to a string and is used by the {@link XTreeControl} as a textual representation of the created node.
    * @param ChildrenOnDemand if `TRUE` is used as a parameter, the created node will be treated as a non-leaf node by the {@link XTreeControl} , even when it
    * @returns a new {@link XMutableTreeNode} that can be used for this model.
    * @see XTreeNode.getDisplayValue()
    * @see XTreeNode.hasChildrenOnDemand()
    */
  def createNode(DisplayValue: js.Any, ChildrenOnDemand: Boolean): XMutableTreeNode = js.native
  /**
    * changes the root node of this model to **RootNode** .
    * @param RootNode the {@link XMutableTreeNode} that becomes the new root node of this model.
    * @throws com::sun::star::lang::IllegalArgumentException if **RootNode** is not a valid node of this {@link XTreeDataModel} .
    */
  def setRoot(RootNode: XMutableTreeNode): Unit = js.native
}

object XMutableTreeDataModel {
  @scala.inline
  def apply(
    Root: XTreeNode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addTreeDataModelListener: XTreeDataModelListener => Unit,
    createNode: (js.Any, Boolean) => XMutableTreeNode,
    dispose: () => Unit,
    getRoot: () => XTreeNode,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeTreeDataModelListener: XTreeDataModelListener => Unit,
    setRoot: XMutableTreeNode => Unit
  ): XMutableTreeDataModel = {
    val __obj = js.Dynamic.literal(Root = Root.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addTreeDataModelListener = js.Any.fromFunction1(addTreeDataModelListener), createNode = js.Any.fromFunction2(createNode), dispose = js.Any.fromFunction0(dispose), getRoot = js.Any.fromFunction0(getRoot), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeTreeDataModelListener = js.Any.fromFunction1(removeTreeDataModelListener), setRoot = js.Any.fromFunction1(setRoot))
    __obj.asInstanceOf[XMutableTreeDataModel]
  }
  @scala.inline
  implicit class XMutableTreeDataModelOps[Self <: XMutableTreeDataModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateNode(value: (js.Any, Boolean) => XMutableTreeNode): Self = this.set("createNode", js.Any.fromFunction2(value))
    @scala.inline
    def setSetRoot(value: XMutableTreeNode => Unit): Self = this.set("setRoot", js.Any.fromFunction1(value))
  }
  
}

