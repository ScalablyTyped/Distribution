package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a mutable tree node as used by the {@link MutableTreeDataModel} */
trait XMutableTreeNode extends XTreeNode {
  /**
    * Stores an implementation dependent value.
    *
    * You can use this attribute to store data for this node that is independent of the display value
    */
  var DataValue: js.Any
  /**
    * appends **ChildNode** to this instance.
    * @throws com::sun::star::lang::IllegalArgumentException if **ChildNode** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def appendChild(ChildNode: XMutableTreeNode): scala.Unit
  /**
    * inserts **ChildNode** to this instance at the given index.
    * @param Index the index where the node will be inserted to this instance.
    * @param ChildNode the node to insert.
    * @throws com::sun::star::lang::IllegalArgumentException if **ChildNode** is not a valid node of the corresponding {@link XTreeDataModel} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if **Index** is less than 0 or greater then {@link XTreeNode.getChildCount()} .
    */
  def insertChildByIndex(Index: scala.Double, ChildNode: XMutableTreeNode): scala.Unit
  /**
    * removes the node from this instance at the specified index.
    * @param Index the index of the node to be removed from this instance.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if **Index** is less than 0 or greater then {@link XTreeNode.getChildCount()} .
    */
  def removeChildByIndex(Index: scala.Double): scala.Unit
  /**
    * The URL for a graphic that is rendered to visualize collapsed non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultCollapsedGraphicURL} is used.
    */
  def setCollapsedGraphicURL(URL: java.lang.String): scala.Unit
  /** sets the display value of this node */
  def setDisplayValue(Value: js.Any): scala.Unit
  /**
    * The URL for a graphic that is rendered to visualize expanded non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultExpandedGraphicURL} is used.
    */
  def setExpandedGraphicURL(URL: java.lang.String): scala.Unit
  /**
    * Changes if the children of this node are created on demand.
    * @see XTreeNode.hasChildrenOnDemand()
    */
  def setHasChildrenOnDemand(ChildrenOnDemand: scala.Boolean): scala.Unit
  /**
    * The URL for a graphic that is rendered before the text part of this node.
    *
    * If this URL is empty, no graphic is rendered.
    */
  def setNodeGraphicURL(URL: java.lang.String): scala.Unit
}

object XMutableTreeNode {
  @scala.inline
  def apply(
    ChildCount: scala.Double,
    CollapsedGraphicURL: java.lang.String,
    DataValue: js.Any,
    DisplayValue: js.Any,
    ExpandedGraphicURL: java.lang.String,
    NodeGraphicURL: java.lang.String,
    Parent: XTreeNode,
    appendChild: XMutableTreeNode => scala.Unit,
    getChildAt: scala.Double => XTreeNode,
    getChildCount: () => scala.Double,
    getCollapsedGraphicURL: () => java.lang.String,
    getDisplayValue: () => js.Any,
    getExpandedGraphicURL: () => java.lang.String,
    getIndex: XTreeNode => scala.Double,
    getNodeGraphicURL: () => java.lang.String,
    getParent: () => XTreeNode,
    hasChildrenOnDemand: () => scala.Boolean,
    insertChildByIndex: (scala.Double, XMutableTreeNode) => scala.Unit,
    removeChildByIndex: scala.Double => scala.Unit,
    setCollapsedGraphicURL: java.lang.String => scala.Unit,
    setDisplayValue: js.Any => scala.Unit,
    setExpandedGraphicURL: java.lang.String => scala.Unit,
    setHasChildrenOnDemand: scala.Boolean => scala.Unit,
    setNodeGraphicURL: java.lang.String => scala.Unit
  ): XMutableTreeNode = {
    val __obj = js.Dynamic.literal(ChildCount = ChildCount, CollapsedGraphicURL = CollapsedGraphicURL, DataValue = DataValue, DisplayValue = DisplayValue, ExpandedGraphicURL = ExpandedGraphicURL, NodeGraphicURL = NodeGraphicURL, Parent = Parent, appendChild = js.Any.fromFunction1(appendChild), getChildAt = js.Any.fromFunction1(getChildAt), getChildCount = js.Any.fromFunction0(getChildCount), getCollapsedGraphicURL = js.Any.fromFunction0(getCollapsedGraphicURL), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getExpandedGraphicURL = js.Any.fromFunction0(getExpandedGraphicURL), getIndex = js.Any.fromFunction1(getIndex), getNodeGraphicURL = js.Any.fromFunction0(getNodeGraphicURL), getParent = js.Any.fromFunction0(getParent), hasChildrenOnDemand = js.Any.fromFunction0(hasChildrenOnDemand), insertChildByIndex = js.Any.fromFunction2(insertChildByIndex), removeChildByIndex = js.Any.fromFunction1(removeChildByIndex), setCollapsedGraphicURL = js.Any.fromFunction1(setCollapsedGraphicURL), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setExpandedGraphicURL = js.Any.fromFunction1(setExpandedGraphicURL), setHasChildrenOnDemand = js.Any.fromFunction1(setHasChildrenOnDemand), setNodeGraphicURL = js.Any.fromFunction1(setNodeGraphicURL))
  
    __obj.asInstanceOf[XMutableTreeNode]
  }
}

