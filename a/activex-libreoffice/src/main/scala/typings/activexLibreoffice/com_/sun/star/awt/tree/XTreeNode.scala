package typings.activexLibreoffice.com_.sun.star.awt.tree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance implementing this interface represents the model data for an entry in a {@link XTreeDataModel} .
  *
  * The {@link TreeControl} uses this interface to retrieve the model information needed to display a hierarchical outline
  *
  * Each {@link XTreeNode} in a {@link XTreeDataModel} must be unique.
  */
@js.native
trait XTreeNode extends js.Object {
  
  /** Returns the number of child nodes. */
  val ChildCount: Double = js.native
  
  /**
    * The URL for a graphic that is rendered to visualize collapsed non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultCollapsedGraphicURL} is used.
    */
  val CollapsedGraphicURL: String = js.native
  
  /** If not empty, the textual representation of this any is used as the text part of this node. */
  val DisplayValue: js.Any = js.native
  
  /**
    * The URL for a graphic that is rendered to visualize expanded non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultExpandedGraphicURL} is used.
    */
  val ExpandedGraphicURL: String = js.native
  
  /**
    * The URL for a graphic that is rendered before the text part of this node.
    *
    * If this URL is empty, no graphic is rendered.
    */
  val NodeGraphicURL: String = js.native
  
  /** Returns the parent node of this node. */
  val Parent: XTreeNode = js.native
  
  /**
    * Returns the child tree node at **Index** .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if **Index** is less than 0 or equal or greater then {@link getChildCount()} .
    */
  def getChildAt(Index: Double): XTreeNode = js.native
  
  /** Returns the number of child nodes. */
  def getChildCount(): Double = js.native
  
  /**
    * The URL for a graphic that is rendered to visualize collapsed non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultCollapsedGraphicURL} is used.
    */
  def getCollapsedGraphicURL(): String = js.native
  
  /** If not empty, the textual representation of this any is used as the text part of this node. */
  def getDisplayValue(): js.Any = js.native
  
  /**
    * The URL for a graphic that is rendered to visualize expanded non leaf nodes.
    *
    * If **URL** is empty, {@link XTreeControl.DefaultExpandedGraphicURL} is used.
    */
  def getExpandedGraphicURL(): String = js.native
  
  /**
    * Returns the index of **Node** in this instances children.
    * @returns The child index of **Node** , or -1 if **Node** is no child of this instance.
    */
  def getIndex(Node: XTreeNode): Double = js.native
  
  /**
    * The URL for a graphic that is rendered before the text part of this node.
    *
    * If this URL is empty, no graphic is rendered.
    */
  def getNodeGraphicURL(): String = js.native
  
  /** Returns the parent node of this node. */
  def getParent(): XTreeNode = js.native
  
  /**
    * Returns `TRUE` if the children of this node are created on demand.
    *
    * A {@link TreeControl} will handle a node that returns `TRUE` always like a node that has child nodes, even if {@link getChildCount()} returns 0.
    * @see TreeExpansionListener;
    */
  def hasChildrenOnDemand(): Boolean = js.native
}
object XTreeNode {
  
  @scala.inline
  def apply(
    ChildCount: Double,
    CollapsedGraphicURL: String,
    DisplayValue: js.Any,
    ExpandedGraphicURL: String,
    NodeGraphicURL: String,
    Parent: XTreeNode,
    getChildAt: Double => XTreeNode,
    getChildCount: () => Double,
    getCollapsedGraphicURL: () => String,
    getDisplayValue: () => js.Any,
    getExpandedGraphicURL: () => String,
    getIndex: XTreeNode => Double,
    getNodeGraphicURL: () => String,
    getParent: () => XTreeNode,
    hasChildrenOnDemand: () => Boolean
  ): XTreeNode = {
    val __obj = js.Dynamic.literal(ChildCount = ChildCount.asInstanceOf[js.Any], CollapsedGraphicURL = CollapsedGraphicURL.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], ExpandedGraphicURL = ExpandedGraphicURL.asInstanceOf[js.Any], NodeGraphicURL = NodeGraphicURL.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], getChildAt = js.Any.fromFunction1(getChildAt), getChildCount = js.Any.fromFunction0(getChildCount), getCollapsedGraphicURL = js.Any.fromFunction0(getCollapsedGraphicURL), getDisplayValue = js.Any.fromFunction0(getDisplayValue), getExpandedGraphicURL = js.Any.fromFunction0(getExpandedGraphicURL), getIndex = js.Any.fromFunction1(getIndex), getNodeGraphicURL = js.Any.fromFunction0(getNodeGraphicURL), getParent = js.Any.fromFunction0(getParent), hasChildrenOnDemand = js.Any.fromFunction0(hasChildrenOnDemand))
    __obj.asInstanceOf[XTreeNode]
  }
  
  @scala.inline
  implicit class XTreeNodeOps[Self <: XTreeNode] (val x: Self) extends AnyVal {
    
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
    def setChildCount(value: Double): Self = this.set("ChildCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsedGraphicURL(value: String): Self = this.set("CollapsedGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayValue(value: js.Any): Self = this.set("DisplayValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedGraphicURL(value: String): Self = this.set("ExpandedGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeGraphicURL(value: String): Self = this.set("NodeGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: XTreeNode): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChildAt(value: Double => XTreeNode): Self = this.set("getChildAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChildCount(value: () => Double): Self = this.set("getChildCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCollapsedGraphicURL(value: () => String): Self = this.set("getCollapsedGraphicURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayValue(value: () => js.Any): Self = this.set("getDisplayValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpandedGraphicURL(value: () => String): Self = this.set("getExpandedGraphicURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: XTreeNode => Double): Self = this.set("getIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeGraphicURL(value: () => String): Self = this.set("getNodeGraphicURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParent(value: () => XTreeNode): Self = this.set("getParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasChildrenOnDemand(value: () => Boolean): Self = this.set("hasChildrenOnDemand", js.Any.fromFunction0(value))
  }
}
