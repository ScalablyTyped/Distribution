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
    appendChild: js.Function1[XMutableTreeNode, scala.Unit],
    getChildAt: js.Function1[scala.Double, XTreeNode],
    getChildCount: js.Function0[scala.Double],
    getCollapsedGraphicURL: js.Function0[java.lang.String],
    getDisplayValue: js.Function0[js.Any],
    getExpandedGraphicURL: js.Function0[java.lang.String],
    getIndex: js.Function1[XTreeNode, scala.Double],
    getNodeGraphicURL: js.Function0[java.lang.String],
    getParent: js.Function0[XTreeNode],
    hasChildrenOnDemand: js.Function0[scala.Boolean],
    insertChildByIndex: js.Function2[scala.Double, XMutableTreeNode, scala.Unit],
    removeChildByIndex: js.Function1[scala.Double, scala.Unit],
    setCollapsedGraphicURL: js.Function1[java.lang.String, scala.Unit],
    setDisplayValue: js.Function1[js.Any, scala.Unit],
    setExpandedGraphicURL: js.Function1[java.lang.String, scala.Unit],
    setHasChildrenOnDemand: js.Function1[scala.Boolean, scala.Unit],
    setNodeGraphicURL: js.Function1[java.lang.String, scala.Unit]
  ): XMutableTreeNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ChildCount")(ChildCount)
    __obj.updateDynamic("CollapsedGraphicURL")(CollapsedGraphicURL)
    __obj.updateDynamic("DataValue")(DataValue)
    __obj.updateDynamic("DisplayValue")(DisplayValue)
    __obj.updateDynamic("ExpandedGraphicURL")(ExpandedGraphicURL)
    __obj.updateDynamic("NodeGraphicURL")(NodeGraphicURL)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("appendChild")(appendChild)
    __obj.updateDynamic("getChildAt")(getChildAt)
    __obj.updateDynamic("getChildCount")(getChildCount)
    __obj.updateDynamic("getCollapsedGraphicURL")(getCollapsedGraphicURL)
    __obj.updateDynamic("getDisplayValue")(getDisplayValue)
    __obj.updateDynamic("getExpandedGraphicURL")(getExpandedGraphicURL)
    __obj.updateDynamic("getIndex")(getIndex)
    __obj.updateDynamic("getNodeGraphicURL")(getNodeGraphicURL)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("hasChildrenOnDemand")(hasChildrenOnDemand)
    __obj.updateDynamic("insertChildByIndex")(insertChildByIndex)
    __obj.updateDynamic("removeChildByIndex")(removeChildByIndex)
    __obj.updateDynamic("setCollapsedGraphicURL")(setCollapsedGraphicURL)
    __obj.updateDynamic("setDisplayValue")(setDisplayValue)
    __obj.updateDynamic("setExpandedGraphicURL")(setExpandedGraphicURL)
    __obj.updateDynamic("setHasChildrenOnDemand")(setHasChildrenOnDemand)
    __obj.updateDynamic("setNodeGraphicURL")(setNodeGraphicURL)
    __obj.asInstanceOf[XMutableTreeNode]
  }
}

