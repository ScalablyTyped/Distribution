package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object treeNs {
  /** If you do not want to implement the {@link XTreeDataModel} yourself, use this service. This implementation uses {@link MutableTreeNode} for its nodes. */
  type MutableTreeDataModel = XMutableTreeDataModel
  /** Represents an editable tree node as used by the {@link MutableTreeDataModel} */
  type MutableTreeNode = XMutableTreeNode
  /**
    * A control that displays a set of hierarchical data as an outline.
    *
    * **The Data Model**
    *
    * A specific node in a tree is identified by a {@link XTreeNode} . A leaf node is a node without any children and that returns `FALSE` when calling
    * {@link XTreeNode.hasChildrenOnDemand()} . An expanded node is a non-leaf node that will displays its children when all its ancestors are expanded. A
    * collapsed node is one which hides them. A node is visible when all parent nodes are expanded and the node itself is in the display area.
    *
    * The nodes are retrieved from a {@link XTreeDataModel} . You can implement it yourself or use the {@link MutableTreeDataModel} which uses {@link
    * XMutableTreeNode} and {@link XMutableTreeDataModel} for a simple and mutable data model.
    *
    * The data model must be set at the TreeControlModel::TreeDataModel property.
    *
    * **{@link Selection}**
    *
    * If you are interested in knowing when the selection changes implement a {@link com.sun.star.view.XSelectionChangeListener} and add the instance with
    * the method {@link com.sun.star.view.XSelectionSupplier.addSelectionChangeListener()} . You than will be notified for any selection change.
    *
    * If you are interested in detecting either double-click events or when a user clicks on a node, regardless of whether or not it was selected, you can
    * get the {@link com.sun.star.awt.XWindow} and add yourself as a {@link com.sun.star.awt.XMouseClickHandler} . You can use the method {@link
    * XTreeControl.getNodeForLocation()} to retrieve the node that was under the mouse at the time the event was fired.
    *
    * **Adding child nodes on demand**
    *
    * If you want to add child nodes to your tree on demand you can do the following. Make sure the parent node returns `TRUE` for {@link
    * XTreeNode.hasChildrenOnDemand()} either by implementing {@link XTreeNode} yourself or if you use the {@link MutableTreeDataModel} , use {@link
    * XMutableTreeNode.setHasChildrenOnDemand()} .Implement a {@link XTreeExpansionListener} and add the instance with the method {@link
    * XTreeControl.addTreeExpansionListener()} . Now you get called when the node will become expanded or collapsed. So on {@link
    * XTreeExpansionListener.treeExpanding()} you can check the {@link TreeExpansionEvent} if the parent node with children on demand is going to be
    * expanded and in that case add the missing child nodes. You can also veto the expansion or collapsing of a parent node by using the {@link
    * ExpandVetoException} .
    */
  type TreeControl = XTreeControl
}
