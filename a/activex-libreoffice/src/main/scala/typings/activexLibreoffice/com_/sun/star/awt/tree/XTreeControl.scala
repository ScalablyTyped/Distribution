package typings.activexLibreoffice.com_.sun.star.awt.tree

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.view.XMultiSelectionSupplier
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to a control that displays a set of hierarchical data as an outline.
  * @see TreeControl
  */
@js.native
trait XTreeControl extends XMultiSelectionSupplier {
  /**
    * If the given URL points to a loadable graphic, the graphic is rendered before collapsed non leaf nodes.
    *
    * This can be overridden for individual nodes by {@link XTreeNode.getCollapsedGraphicURL()}
    */
  var DefaultCollapsedGraphicURL: String = js.native
  /**
    * If the given URL points to a loadable graphic, the graphic is rendered before expanded non leaf nodes.
    *
    * This can be overridden for individual nodes by {@link XTreeNode.getExpandedGraphicURL()}
    */
  var DefaultExpandedGraphicURL: String = js.native
  /**
    * Adds a {@link XTreeEditListener} .
    * @param Listener a {@link XTreeEditListener} that will be notified before and after a tree node is edited.
    */
  def addTreeEditListener(Listener: XTreeEditListener): Unit = js.native
  /**
    * Adds a listener for TreeExpansion events.
    * @param Listener a {@link XTreeExpansionListener} that will be notified when a tree node is expanded or collapsed.
    */
  def addTreeExpansionListener(Listener: XTreeExpansionListener): Unit = js.native
  /**
    * Cancels the current editing session.
    *
    * Has no effect if the tree isn't being edited.
    */
  def cancelEditing(): Unit = js.native
  /**
    * Ensures that **Node** is collapsed.
    * @param Node the {@link XTreeNode} identifying a node
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    * @throws ExpandVetoException if collapsing **Node** failed because at least one of the registered {@link XTreeExpansionListener} raised a {@link ExpandVet
    */
  def collapseNode(Node: XTreeNode): Unit = js.native
  /**
    * Ensures that **Node** is expanded and visible.
    *
    * If **Node** is a leaf node, this will have no effect.
    * @param Node the {@link XTreeNode} identifying a node.
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    * @throws ExpandVetoException if expanding **Node** failed because at least one of the registered {@link XTreeExpansionListener} raised a {@link ExpandVeto
    */
  def expandNode(Node: XTreeNode): Unit = js.native
  /**
    * Returns the node that is closest to x,y.
    *
    * If no nodes are currently viewable, or there is no model, returns null, otherwise it always returns a valid node. To test if the node is exactly at x,
    * y, use {@link getNodeForLocation()} .
    * @param x an integer giving the number of pixels horizontally from the left edge of the controls display area
    * @param y an integer giving the number of pixels vertically from the top edge of the controls display area
    * @returns the {@link XTreeNode} for the node closest to that location, null if nothing is viewable or there is no model
    */
  def getClosestNodeForLocation(x: Double, y: Double): XTreeNode = js.native
  /**
    * Returns the node at the specified location.
    * @param x an integer giving the number of pixels horizontally from the left edge of the controls display area
    * @param y an integer giving the number of pixels vertically from the top edge of the controls display area
    * @returns the {@link XTreeNode} for the node at that location, or 0 if there is no node at the given position
    */
  def getNodeForLocation(x: Double, y: Double): XTreeNode = js.native
  /**
    * returns the rectangle occupied by the visual representation of the given node
    * @param Node the node whose geometry should be obtained
    * @throws com::sun::star::lang::IllegalArgumentException if the given node is `NULL` , or does not belong to the tree's data model
    */
  def getNodeRect(Node: XTreeNode): Rectangle = js.native
  /**
    * Returns `TRUE` if one of tree's nodes is being currently edited.
    *
    * The node that is being edited can be obtained using {@link com.sun.star.view.XSelectionSupplier.getSelection()} .
    * @returns `TRUE` if the user is currently editing a node
    */
  def isEditing(): Boolean = js.native
  /**
    * Returns `TRUE` if **Node** is currently collapsed.
    * @param Node the {@link XTreeNode} specifying the node to check
    * @returns `TRUE` if **Node** or at least one of its parent nodes are collapsed, `FALSE` if **Node** and all of its parent nodes are expanded
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def isNodeCollapsed(Node: XTreeNode): Boolean = js.native
  /**
    * Returns `TRUE` if **Node** is currently expanded.
    * @param Node the {@link XTreeNode} specifying the node to check.
    * @returns `FALSE` if **Node** or at least one of its parent nodes are collapsed, `TRUE` if **Node** and all of its parent nodes are expanded.
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def isNodeExpanded(Node: XTreeNode): Boolean = js.native
  /**
    * Returns `TRUE` if **Node** is currently visible.
    *
    * Visible means it is either the root or all of its parents are expanded.
    * @returns `TRUE` if **Node** is visible, otherwise `FALSE`
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def isNodeVisible(Node: XTreeNode): Boolean = js.native
  /**
    * Ensures that **Node** is currently visible.
    *
    * This includes expanding all parent nodes and scroll the control so this node is visible in the controls display area.
    * @param Node the {@link XTreeNode} specifying the node to make visible.
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    * @throws ExpandVetoException if **Node** can't be made visible since at least one of the parent nodes are collapsed and expanding failed because at least
    */
  def makeNodeVisible(Node: XTreeNode): Unit = js.native
  /**
    * Removes a {@link XTreeEditListener} .
    * @param Listener the {@link XTreeEditListener} to remove
    */
  def removeTreeEditListener(Listener: XTreeEditListener): Unit = js.native
  /**
    * Removes a listener for TreeExpansion events.
    * @param Listener the {@link XTreeExpansionListener} to remove.
    */
  def removeTreeExpansionListener(Listener: XTreeExpansionListener): Unit = js.native
  /**
    * Selects **Node** and initiates editing.
    *
    * If {@link TreeControlModel.Editable} is `FALSE` or if there are no registered {@link XTreeEditListener} , this call has no effect.
    *
    * Calling this method also ensures that **Node** will become visible.
    * @param Node the {@link XTreeNode} identifying a node.
    * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
    */
  def startEditingAtNode(Node: XTreeNode): Unit = js.native
  /**
    * Ends the current editing session.
    *
    * All registered {@link XTreeEditListener} are notified if an editing session was in progress
    *
    * Has no effect if the tree isn't being edited.
    * @returns `TRUE` if editing was in progress and is now stopped, `FALSE` if editing was not in progress
    */
  def stopEditing(): Boolean = js.native
}

object XTreeControl {
  @scala.inline
  def apply(
    DefaultCollapsedGraphicURL: String,
    DefaultExpandedGraphicURL: String,
    Selection: js.Any,
    SelectionCount: Double,
    acquire: () => Unit,
    addSelection: js.Any => Boolean,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addTreeEditListener: XTreeEditListener => Unit,
    addTreeExpansionListener: XTreeExpansionListener => Unit,
    cancelEditing: () => Unit,
    clearSelection: () => Unit,
    collapseNode: XTreeNode => Unit,
    createReverseSelectionEnumeration: () => XEnumeration,
    createSelectionEnumeration: () => XEnumeration,
    expandNode: XTreeNode => Unit,
    getClosestNodeForLocation: (Double, Double) => XTreeNode,
    getNodeForLocation: (Double, Double) => XTreeNode,
    getNodeRect: XTreeNode => Rectangle,
    getSelection: () => js.Any,
    getSelectionCount: () => Double,
    isEditing: () => Boolean,
    isNodeCollapsed: XTreeNode => Boolean,
    isNodeExpanded: XTreeNode => Boolean,
    isNodeVisible: XTreeNode => Boolean,
    makeNodeVisible: XTreeNode => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSelection: js.Any => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    removeTreeEditListener: XTreeEditListener => Unit,
    removeTreeExpansionListener: XTreeExpansionListener => Unit,
    select: js.Any => Boolean,
    startEditingAtNode: XTreeNode => Unit,
    stopEditing: () => Boolean
  ): XTreeControl = {
    val __obj = js.Dynamic.literal(DefaultCollapsedGraphicURL = DefaultCollapsedGraphicURL.asInstanceOf[js.Any], DefaultExpandedGraphicURL = DefaultExpandedGraphicURL.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SelectionCount = SelectionCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSelection = js.Any.fromFunction1(addSelection), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addTreeEditListener = js.Any.fromFunction1(addTreeEditListener), addTreeExpansionListener = js.Any.fromFunction1(addTreeExpansionListener), cancelEditing = js.Any.fromFunction0(cancelEditing), clearSelection = js.Any.fromFunction0(clearSelection), collapseNode = js.Any.fromFunction1(collapseNode), createReverseSelectionEnumeration = js.Any.fromFunction0(createReverseSelectionEnumeration), createSelectionEnumeration = js.Any.fromFunction0(createSelectionEnumeration), expandNode = js.Any.fromFunction1(expandNode), getClosestNodeForLocation = js.Any.fromFunction2(getClosestNodeForLocation), getNodeForLocation = js.Any.fromFunction2(getNodeForLocation), getNodeRect = js.Any.fromFunction1(getNodeRect), getSelection = js.Any.fromFunction0(getSelection), getSelectionCount = js.Any.fromFunction0(getSelectionCount), isEditing = js.Any.fromFunction0(isEditing), isNodeCollapsed = js.Any.fromFunction1(isNodeCollapsed), isNodeExpanded = js.Any.fromFunction1(isNodeExpanded), isNodeVisible = js.Any.fromFunction1(isNodeVisible), makeNodeVisible = js.Any.fromFunction1(makeNodeVisible), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelection = js.Any.fromFunction1(removeSelection), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeTreeEditListener = js.Any.fromFunction1(removeTreeEditListener), removeTreeExpansionListener = js.Any.fromFunction1(removeTreeExpansionListener), select = js.Any.fromFunction1(select), startEditingAtNode = js.Any.fromFunction1(startEditingAtNode), stopEditing = js.Any.fromFunction0(stopEditing))
    __obj.asInstanceOf[XTreeControl]
  }
  @scala.inline
  implicit class XTreeControlOps[Self <: XTreeControl] (val x: Self) extends AnyVal {
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
    def setDefaultCollapsedGraphicURL(value: String): Self = this.set("DefaultCollapsedGraphicURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultExpandedGraphicURL(value: String): Self = this.set("DefaultExpandedGraphicURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddTreeEditListener(value: XTreeEditListener => Unit): Self = this.set("addTreeEditListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddTreeExpansionListener(value: XTreeExpansionListener => Unit): Self = this.set("addTreeExpansionListener", js.Any.fromFunction1(value))
    @scala.inline
    def setCancelEditing(value: () => Unit): Self = this.set("cancelEditing", js.Any.fromFunction0(value))
    @scala.inline
    def setCollapseNode(value: XTreeNode => Unit): Self = this.set("collapseNode", js.Any.fromFunction1(value))
    @scala.inline
    def setExpandNode(value: XTreeNode => Unit): Self = this.set("expandNode", js.Any.fromFunction1(value))
    @scala.inline
    def setGetClosestNodeForLocation(value: (Double, Double) => XTreeNode): Self = this.set("getClosestNodeForLocation", js.Any.fromFunction2(value))
    @scala.inline
    def setGetNodeForLocation(value: (Double, Double) => XTreeNode): Self = this.set("getNodeForLocation", js.Any.fromFunction2(value))
    @scala.inline
    def setGetNodeRect(value: XTreeNode => Rectangle): Self = this.set("getNodeRect", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEditing(value: () => Boolean): Self = this.set("isEditing", js.Any.fromFunction0(value))
    @scala.inline
    def setIsNodeCollapsed(value: XTreeNode => Boolean): Self = this.set("isNodeCollapsed", js.Any.fromFunction1(value))
    @scala.inline
    def setIsNodeExpanded(value: XTreeNode => Boolean): Self = this.set("isNodeExpanded", js.Any.fromFunction1(value))
    @scala.inline
    def setIsNodeVisible(value: XTreeNode => Boolean): Self = this.set("isNodeVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setMakeNodeVisible(value: XTreeNode => Unit): Self = this.set("makeNodeVisible", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveTreeEditListener(value: XTreeEditListener => Unit): Self = this.set("removeTreeEditListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveTreeExpansionListener(value: XTreeExpansionListener => Unit): Self = this.set("removeTreeExpansionListener", js.Any.fromFunction1(value))
    @scala.inline
    def setStartEditingAtNode(value: XTreeNode => Unit): Self = this.set("startEditingAtNode", js.Any.fromFunction1(value))
    @scala.inline
    def setStopEditing(value: () => Boolean): Self = this.set("stopEditing", js.Any.fromFunction0(value))
  }
  
}

