package typings.activexLibreoffice.com_.sun.star.awt.tree

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
  def appendChild(ChildNode: XMutableTreeNode): Unit
  /**
    * inserts **ChildNode** to this instance at the given index.
    * @param Index the index where the node will be inserted to this instance.
    * @param ChildNode the node to insert.
    * @throws com::sun::star::lang::IllegalArgumentException if **ChildNode** is not a valid node of the corresponding {@link XTreeDataModel} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if **Index** is less than 0 or greater then {@link XTreeNode.getChildCount()} .
    */
  def insertChildByIndex(Index: Double, ChildNode: XMutableTreeNode): Unit
  /**
    * removes the node from this instance at the specified index.
    * @param Index the index of the node to be removed from this instance.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if **Index** is less than 0 or greater then {@link XTreeNode.getChildCount()} .
    */
  def removeChildByIndex(Index: Double): Unit
  /**
    * The URL for a graphic that is rendered to visualize collapsed non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultCollapsedGraphicURL} is used.
    */
  def setCollapsedGraphicURL(URL: String): Unit
  /** sets the display value of this node */
  def setDisplayValue(Value: js.Any): Unit
  /**
    * The URL for a graphic that is rendered to visualize expanded non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultExpandedGraphicURL} is used.
    */
  def setExpandedGraphicURL(URL: String): Unit
  /**
    * Changes if the children of this node are created on demand.
    * @see XTreeNode.hasChildrenOnDemand()
    */
  def setHasChildrenOnDemand(ChildrenOnDemand: Boolean): Unit
  /**
    * The URL for a graphic that is rendered before the text part of this node.
    *
    * If this URL is empty, no graphic is rendered.
    */
  def setNodeGraphicURL(URL: String): Unit
}

object XMutableTreeNode {
  @scala.inline
  def apply(
    ChildCount: Double,
    CollapsedGraphicURL: String,
    DataValue: js.Any,
    DisplayValue: js.Any,
    ExpandedGraphicURL: String,
    NodeGraphicURL: String,
    Parent: XTreeNode,
    appendChild: XMutableTreeNode => Unit,
    getChildAt: Double => XTreeNode,
    getChildCount: () => Double,
    getCollapsedGraphicURL: () => String,
    getDisplayValue: () => js.Any,
    getExpandedGraphicURL: () => String,
    getIndex: XTreeNode => Double,
    getNodeGraphicURL: () => String,
    getParent: () => XTreeNode,
    hasChildrenOnDemand: () => Boolean,
    insertChildByIndex: (Double, XMutableTreeNode) => Unit,
    removeChildByIndex: Double => Unit,
    setCollapsedGraphicURL: String => Unit,
    setDisplayValue: js.Any => Unit,
    setExpandedGraphicURL: String => Unit,
    setHasChildrenOnDemand: Boolean => Unit,
    setNodeGraphicURL: String => Unit
  ): XMutableTreeNode = {
    val __obj = js.Dynamic.literal(ChildCount = ChildCount.asInstanceOf[js.Any], CollapsedGraphicURL = CollapsedGraphicURL.asInstanceOf[js.Any], DataValue = DataValue.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], ExpandedGraphicURL = ExpandedGraphicURL.asInstanceOf[js.Any], NodeGraphicURL = NodeGraphicURL.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], appendChild = js.Any.fromFunction1(appendChild), getChildAt = js.Any.fromFunction1(getChildAt), getChildCount = js.Any.fromFunction0(getChildCount), getCollapsedGraphicURL = js.Any.fromFunction0(getCollapsedGraphicURL), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getExpandedGraphicURL = js.Any.fromFunction0(getExpandedGraphicURL), getIndex = js.Any.fromFunction1(getIndex), getNodeGraphicURL = js.Any.fromFunction0(getNodeGraphicURL), getParent = js.Any.fromFunction0(getParent), hasChildrenOnDemand = js.Any.fromFunction0(hasChildrenOnDemand), insertChildByIndex = js.Any.fromFunction2(insertChildByIndex), removeChildByIndex = js.Any.fromFunction1(removeChildByIndex), setCollapsedGraphicURL = js.Any.fromFunction1(setCollapsedGraphicURL), setDisplayValue = js.Any.fromFunction1(setDisplayValue), setExpandedGraphicURL = js.Any.fromFunction1(setExpandedGraphicURL), setHasChildrenOnDemand = js.Any.fromFunction1(setHasChildrenOnDemand), setNodeGraphicURL = js.Any.fromFunction1(setNodeGraphicURL))
    __obj.asInstanceOf[XMutableTreeNode]
  }
}

