package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typings.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.activexLibreoffice.com_.sun.star.view.SelectionType
import typings.activexLibreoffice.com_.sun.star.view.XMultiSelectionSupplier
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tree {
  
  /**
    * Exception used to stop an expand/collapse from happening.
    * @see XTreeExpansionListener
    * @see XTreeControl
    */
  trait ExpandVetoException
    extends StObject
       with Exception {
    
    /** The event that the exception was created for. */
    var Event: TreeExpansionEvent
  }
  object ExpandVetoException {
    
    @scala.inline
    def apply(Context: XInterface, Event: TreeExpansionEvent, Message: String): ExpandVetoException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Event = Event.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandVetoException]
    }
    
    @scala.inline
    implicit class ExpandVetoExceptionMutableBuilder[Self <: ExpandVetoException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: TreeExpansionEvent): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  /** specifies the standard model of a {@link TreeControl} . */
  trait TreeControlModel
    extends StObject
       with UnoControlModel {
    
    /**
      * Specifies the {@link XTreeDataModel} that is providing the hierarchical data.
      *
      * You can implement your own instance of {@link XTreeDataModel} or use the {@link MutableTreeDataModel} .
      */
    var DataModel: XTreeDataModel
    
    /**
      * Specifies whether the nodes of the tree are editable.
      *
      * The default value is `FALSE`
      * @see XTreeControl.startEditingAtNode()
      * @see XTreeEditListener
      */
    var Editable: Boolean
    
    /**
      * Specifies what happens when editing is interrupted by selecting another node in the tree, a change in the tree's data, or by some other means.
      *
      * Setting this property to `TRUE` causes the changes to be automatically saved when editing is interrupted. `FALSE` means that editing is canceled and
      * changes are lost
      *
      * The default value is `FALSE`
      */
    var InvokesStopNodeEditing: Boolean
    
    /**
      * Specifies if the root node of the tree is displayed.
      *
      * If **RootDisplayed** is set to `FALSE` , the root node of a model is no longer a valid node for the {@link XTreeControl} and can't be used with any
      * method of {@link XTreeControl} .
      *
      * The default value is `TRUE`
      */
    var RootDisplayed: Boolean
    
    /**
      * Specifies the height of each row, in pixels.
      *
      * If the specified value is less than or equal to zero, the row height is the maximum height of all rows.
      *
      * The default value is 0
      */
    var RowHeight: Double
    
    /**
      * Specifies the selection mode that is enabled for this tree.
      *
      * The default value is com::sun::star::view::SelectionType::NONE
      */
    var SelectionType: typings.activexLibreoffice.com_.sun.star.view.SelectionType
    
    /**
      * Specifies whether the node handles should be displayed.
      *
      * The handles are doted lines that visualize the tree like hierarchy
      *
      * The default value is `TRUE`
      */
    var ShowsHandles: Boolean
    
    /**
      * Specifies whether the node handles should also be displayed at root level.
      *
      * The default value is `TRUE`
      */
    var ShowsRootHandles: Boolean
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo
  }
  object TreeControlModel {
    
    @scala.inline
    def apply(
      DataModel: XTreeDataModel,
      DefaultControl: String,
      Editable: Boolean,
      Height: Double,
      InvokesStopNodeEditing: Boolean,
      Name: String,
      PositionX: String,
      PositionY: String,
      PropertySetInfo: XPropertySetInfo,
      RootDisplayed: Boolean,
      RowHeight: Double,
      SelectionType: SelectionType,
      ServiceName: String,
      ShowsHandles: Boolean,
      ShowsRootHandles: Boolean,
      Step: Double,
      TabIndex: Double,
      Tag: String,
      Width: Double,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      createClone: () => XCloneable,
      dispose: () => Unit,
      firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      getPropertyValues: SeqEquiv[String] => SafeArray[js.Any],
      getServiceName: () => String,
      queryInterface: `type` => js.Any,
      read: XObjectInputStream => Unit,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertiesChangeListener: XPropertiesChangeListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit,
      setPropertyValues: (SeqEquiv[String], SeqEquiv[js.Any]) => Unit,
      write: XObjectOutputStream => Unit
    ): TreeControlModel = {
      val __obj = js.Dynamic.literal(DataModel = DataModel.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], Editable = Editable.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], InvokesStopNodeEditing = InvokesStopNodeEditing.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RootDisplayed = RootDisplayed.asInstanceOf[js.Any], RowHeight = RowHeight.asInstanceOf[js.Any], SelectionType = SelectionType.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], ShowsHandles = ShowsHandles.asInstanceOf[js.Any], ShowsRootHandles = ShowsRootHandles.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[TreeControlModel]
    }
    
    @scala.inline
    implicit class TreeControlModelMutableBuilder[Self <: TreeControlModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataModel(value: XTreeDataModel): Self = StObject.set(x, "DataModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditable(value: Boolean): Self = StObject.set(x, "Editable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvokesStopNodeEditing(value: Boolean): Self = StObject.set(x, "InvokesStopNodeEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDisplayed(value: Boolean): Self = StObject.set(x, "RootDisplayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeight(value: Double): Self = StObject.set(x, "RowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionType(value: SelectionType): Self = StObject.set(x, "SelectionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsHandles(value: Boolean): Self = StObject.set(x, "ShowsHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowsRootHandles(value: Boolean): Self = StObject.set(x, "ShowsRootHandles", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An event used by a {@link XTreeDataModel} to notify changes in the data model to the {@link XTreeControl} . You usually need to fill this event only
    * if you implement the {@link XTreeDataModel} yourself.
    * @see XTreeDataModel
    * @see XTreeControl
    * @see XTreeDataModelListener
    */
  trait TreeDataModelEvent
    extends StObject
       with EventObject {
    
    /**
      * contains the changed, added or removed nodes.
      *
      * All nodes must have {@link ParentNode} as parent.
      */
    var Nodes: SafeArray[XTreeNode]
    
    /**
      * holds the parent node for changed, added or removed nodes.
      *
      * If this is null, {@link Nodes} must contain only the root node
      */
    var ParentNode: XTreeNode
  }
  object TreeDataModelEvent {
    
    @scala.inline
    def apply(Nodes: SafeArray[XTreeNode], ParentNode: XTreeNode, Source: XInterface): TreeDataModelEvent = {
      val __obj = js.Dynamic.literal(Nodes = Nodes.asInstanceOf[js.Any], ParentNode = ParentNode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeDataModelEvent]
    }
    
    @scala.inline
    implicit class TreeDataModelEventMutableBuilder[Self <: TreeDataModelEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodes(value: SafeArray[XTreeNode]): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNode(value: XTreeNode): Self = StObject.set(x, "ParentNode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This event tells you what node is currently expanding or collapsing.
    * @see XTreeExpansionListener
    * @see XTreeControl
    */
  trait TreeExpansionEvent
    extends StObject
       with EventObject {
    
    var Node: XTreeNode
  }
  object TreeExpansionEvent {
    
    @scala.inline
    def apply(Node: XTreeNode, Source: XInterface): TreeExpansionEvent = {
      val __obj = js.Dynamic.literal(Node = Node.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeExpansionEvent]
    }
    
    @scala.inline
    implicit class TreeExpansionEventMutableBuilder[Self <: TreeExpansionEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: XTreeNode): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This is the editable version of the {@link XTreeDataModel} .
    *
    * Note that only {@link XTreeNode} created from the same instance with {@link createNode()} are valid nodes for this instance.
    */
  trait XMutableTreeDataModel
    extends StObject
       with XTreeDataModel {
    
    /**
      * creates a new tree node with the given value and given settings.
      * @param DisplayValue should be convertible to a string and is used by the {@link XTreeControl} as a textual representation of the created node.
      * @param ChildrenOnDemand if `TRUE` is used as a parameter, the created node will be treated as a non-leaf node by the {@link XTreeControl} , even when it
      * @returns a new {@link XMutableTreeNode} that can be used for this model.
      * @see XTreeNode.getDisplayValue()
      * @see XTreeNode.hasChildrenOnDemand()
      */
    def createNode(DisplayValue: js.Any, ChildrenOnDemand: Boolean): XMutableTreeNode
    
    /**
      * changes the root node of this model to **RootNode** .
      * @param RootNode the {@link XMutableTreeNode} that becomes the new root node of this model.
      * @throws com::sun::star::lang::IllegalArgumentException if **RootNode** is not a valid node of this {@link XTreeDataModel} .
      */
    def setRoot(RootNode: XMutableTreeNode): Unit
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
    implicit class XMutableTreeDataModelMutableBuilder[Self <: XMutableTreeDataModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateNode(value: (js.Any, Boolean) => XMutableTreeNode): Self = StObject.set(x, "createNode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetRoot(value: XMutableTreeNode => Unit): Self = StObject.set(x, "setRoot", js.Any.fromFunction1(value))
    }
  }
  
  /** Represents a mutable tree node as used by the {@link MutableTreeDataModel} */
  trait XMutableTreeNode
    extends StObject
       with XTreeNode {
    
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
    
    @scala.inline
    implicit class XMutableTreeNodeMutableBuilder[Self <: XMutableTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendChild(value: XMutableTreeNode => Unit): Self = StObject.set(x, "appendChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataValue(value: js.Any): Self = StObject.set(x, "DataValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertChildByIndex(value: (Double, XMutableTreeNode) => Unit): Self = StObject.set(x, "insertChildByIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveChildByIndex(value: Double => Unit): Self = StObject.set(x, "removeChildByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCollapsedGraphicURL(value: String => Unit): Self = StObject.set(x, "setCollapsedGraphicURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDisplayValue(value: js.Any => Unit): Self = StObject.set(x, "setDisplayValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetExpandedGraphicURL(value: String => Unit): Self = StObject.set(x, "setExpandedGraphicURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHasChildrenOnDemand(value: Boolean => Unit): Self = StObject.set(x, "setHasChildrenOnDemand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNodeGraphicURL(value: String => Unit): Self = StObject.set(x, "setNodeGraphicURL", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An interface to a control that displays a set of hierarchical data as an outline.
    * @see TreeControl
    */
  trait XTreeControl
    extends StObject
       with XMultiSelectionSupplier {
    
    /**
      * If the given URL points to a loadable graphic, the graphic is rendered before collapsed non leaf nodes.
      *
      * This can be overridden for individual nodes by {@link XTreeNode.getCollapsedGraphicURL()}
      */
    var DefaultCollapsedGraphicURL: String
    
    /**
      * If the given URL points to a loadable graphic, the graphic is rendered before expanded non leaf nodes.
      *
      * This can be overridden for individual nodes by {@link XTreeNode.getExpandedGraphicURL()}
      */
    var DefaultExpandedGraphicURL: String
    
    /**
      * Adds a {@link XTreeEditListener} .
      * @param Listener a {@link XTreeEditListener} that will be notified before and after a tree node is edited.
      */
    def addTreeEditListener(Listener: XTreeEditListener): Unit
    
    /**
      * Adds a listener for TreeExpansion events.
      * @param Listener a {@link XTreeExpansionListener} that will be notified when a tree node is expanded or collapsed.
      */
    def addTreeExpansionListener(Listener: XTreeExpansionListener): Unit
    
    /**
      * Cancels the current editing session.
      *
      * Has no effect if the tree isn't being edited.
      */
    def cancelEditing(): Unit
    
    /**
      * Ensures that **Node** is collapsed.
      * @param Node the {@link XTreeNode} identifying a node
      * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
      * @throws ExpandVetoException if collapsing **Node** failed because at least one of the registered {@link XTreeExpansionListener} raised a {@link ExpandVet
      */
    def collapseNode(Node: XTreeNode): Unit
    
    /**
      * Ensures that **Node** is expanded and visible.
      *
      * If **Node** is a leaf node, this will have no effect.
      * @param Node the {@link XTreeNode} identifying a node.
      * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
      * @throws ExpandVetoException if expanding **Node** failed because at least one of the registered {@link XTreeExpansionListener} raised a {@link ExpandVeto
      */
    def expandNode(Node: XTreeNode): Unit
    
    /**
      * Returns the node that is closest to x,y.
      *
      * If no nodes are currently viewable, or there is no model, returns null, otherwise it always returns a valid node. To test if the node is exactly at x,
      * y, use {@link getNodeForLocation()} .
      * @param x an integer giving the number of pixels horizontally from the left edge of the controls display area
      * @param y an integer giving the number of pixels vertically from the top edge of the controls display area
      * @returns the {@link XTreeNode} for the node closest to that location, null if nothing is viewable or there is no model
      */
    def getClosestNodeForLocation(x: Double, y: Double): XTreeNode
    
    /**
      * Returns the node at the specified location.
      * @param x an integer giving the number of pixels horizontally from the left edge of the controls display area
      * @param y an integer giving the number of pixels vertically from the top edge of the controls display area
      * @returns the {@link XTreeNode} for the node at that location, or 0 if there is no node at the given position
      */
    def getNodeForLocation(x: Double, y: Double): XTreeNode
    
    /**
      * returns the rectangle occupied by the visual representation of the given node
      * @param Node the node whose geometry should be obtained
      * @throws com::sun::star::lang::IllegalArgumentException if the given node is `NULL` , or does not belong to the tree's data model
      */
    def getNodeRect(Node: XTreeNode): Rectangle
    
    /**
      * Returns `TRUE` if one of tree's nodes is being currently edited.
      *
      * The node that is being edited can be obtained using {@link com.sun.star.view.XSelectionSupplier.getSelection()} .
      * @returns `TRUE` if the user is currently editing a node
      */
    def isEditing(): Boolean
    
    /**
      * Returns `TRUE` if **Node** is currently collapsed.
      * @param Node the {@link XTreeNode} specifying the node to check
      * @returns `TRUE` if **Node** or at least one of its parent nodes are collapsed, `FALSE` if **Node** and all of its parent nodes are expanded
      * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
      */
    def isNodeCollapsed(Node: XTreeNode): Boolean
    
    /**
      * Returns `TRUE` if **Node** is currently expanded.
      * @param Node the {@link XTreeNode} specifying the node to check.
      * @returns `FALSE` if **Node** or at least one of its parent nodes are collapsed, `TRUE` if **Node** and all of its parent nodes are expanded.
      * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
      */
    def isNodeExpanded(Node: XTreeNode): Boolean
    
    /**
      * Returns `TRUE` if **Node** is currently visible.
      *
      * Visible means it is either the root or all of its parents are expanded.
      * @returns `TRUE` if **Node** is visible, otherwise `FALSE`
      * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
      */
    def isNodeVisible(Node: XTreeNode): Boolean
    
    /**
      * Ensures that **Node** is currently visible.
      *
      * This includes expanding all parent nodes and scroll the control so this node is visible in the controls display area.
      * @param Node the {@link XTreeNode} specifying the node to make visible.
      * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
      * @throws ExpandVetoException if **Node** can't be made visible since at least one of the parent nodes are collapsed and expanding failed because at least
      */
    def makeNodeVisible(Node: XTreeNode): Unit
    
    /**
      * Removes a {@link XTreeEditListener} .
      * @param Listener the {@link XTreeEditListener} to remove
      */
    def removeTreeEditListener(Listener: XTreeEditListener): Unit
    
    /**
      * Removes a listener for TreeExpansion events.
      * @param Listener the {@link XTreeExpansionListener} to remove.
      */
    def removeTreeExpansionListener(Listener: XTreeExpansionListener): Unit
    
    /**
      * Selects **Node** and initiates editing.
      *
      * If {@link TreeControlModel.Editable} is `FALSE` or if there are no registered {@link XTreeEditListener} , this call has no effect.
      *
      * Calling this method also ensures that **Node** will become visible.
      * @param Node the {@link XTreeNode} identifying a node.
      * @throws com::sun::star::lang::IllegalArgumentException if **Node** is not a valid node of the corresponding {@link XTreeDataModel} .
      */
    def startEditingAtNode(Node: XTreeNode): Unit
    
    /**
      * Ends the current editing session.
      *
      * All registered {@link XTreeEditListener} are notified if an editing session was in progress
      *
      * Has no effect if the tree isn't being edited.
      * @returns `TRUE` if editing was in progress and is now stopped, `FALSE` if editing was not in progress
      */
    def stopEditing(): Boolean
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
    implicit class XTreeControlMutableBuilder[Self <: XTreeControl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTreeEditListener(value: XTreeEditListener => Unit): Self = StObject.set(x, "addTreeEditListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddTreeExpansionListener(value: XTreeExpansionListener => Unit): Self = StObject.set(x, "addTreeExpansionListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCancelEditing(value: () => Unit): Self = StObject.set(x, "cancelEditing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCollapseNode(value: XTreeNode => Unit): Self = StObject.set(x, "collapseNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultCollapsedGraphicURL(value: String): Self = StObject.set(x, "DefaultCollapsedGraphicURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultExpandedGraphicURL(value: String): Self = StObject.set(x, "DefaultExpandedGraphicURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandNode(value: XTreeNode => Unit): Self = StObject.set(x, "expandNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetClosestNodeForLocation(value: (Double, Double) => XTreeNode): Self = StObject.set(x, "getClosestNodeForLocation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetNodeForLocation(value: (Double, Double) => XTreeNode): Self = StObject.set(x, "getNodeForLocation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetNodeRect(value: XTreeNode => Rectangle): Self = StObject.set(x, "getNodeRect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEditing(value: () => Boolean): Self = StObject.set(x, "isEditing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNodeCollapsed(value: XTreeNode => Boolean): Self = StObject.set(x, "isNodeCollapsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNodeExpanded(value: XTreeNode => Boolean): Self = StObject.set(x, "isNodeExpanded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsNodeVisible(value: XTreeNode => Boolean): Self = StObject.set(x, "isNodeVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMakeNodeVisible(value: XTreeNode => Unit): Self = StObject.set(x, "makeNodeVisible", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveTreeEditListener(value: XTreeEditListener => Unit): Self = StObject.set(x, "removeTreeEditListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveTreeExpansionListener(value: XTreeExpansionListener => Unit): Self = StObject.set(x, "removeTreeExpansionListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartEditingAtNode(value: XTreeNode => Unit): Self = StObject.set(x, "startEditingAtNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStopEditing(value: () => Boolean): Self = StObject.set(x, "stopEditing", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * An instance of this interface is used by the {@link TreeControl} to retrieve the hierarchical outline data that is displayed in the actual control.
    *
    * If you implement your own {@link XTreeDataModel} you need to notify registered {@link XTreeDataModelListener} if your model changes after the control
    * is created. If this is not done correctly the {@link TreeControl} will not update the data properly.
    *
    * If you do not need your own model implementation, you can also use the {@link MutableTreeDataModel} .
    */
  trait XTreeDataModel
    extends StObject
       with XComponent {
    
    /**
      * Returns the root of the tree.
      *
      * Returns null only if the tree has no nodes.
      * @returns the root of the tree
      */
    val Root: XTreeNode
    
    /**
      * Adds a listener for the {@link TreeDataModelEvent} posted after the tree changes.
      * @param Listener the listener to add.
      */
    def addTreeDataModelListener(Listener: XTreeDataModelListener): Unit
    
    /**
      * Returns the root of the tree.
      *
      * Returns null only if the tree has no nodes.
      * @returns the root of the tree
      */
    def getRoot(): XTreeNode
    
    /**
      * Removes a listener previously added with {@link addTreeDataModelListener()} .
      * @param Listener the listener to remove.
      */
    def removeTreeDataModelListener(Listener: XTreeDataModelListener): Unit
  }
  object XTreeDataModel {
    
    @scala.inline
    def apply(
      Root: XTreeNode,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addTreeDataModelListener: XTreeDataModelListener => Unit,
      dispose: () => Unit,
      getRoot: () => XTreeNode,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removeTreeDataModelListener: XTreeDataModelListener => Unit
    ): XTreeDataModel = {
      val __obj = js.Dynamic.literal(Root = Root.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addTreeDataModelListener = js.Any.fromFunction1(addTreeDataModelListener), dispose = js.Any.fromFunction0(dispose), getRoot = js.Any.fromFunction0(getRoot), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeTreeDataModelListener = js.Any.fromFunction1(removeTreeDataModelListener))
      __obj.asInstanceOf[XTreeDataModel]
    }
    
    @scala.inline
    implicit class XTreeDataModelMutableBuilder[Self <: XTreeDataModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddTreeDataModelListener(value: XTreeDataModelListener => Unit): Self = StObject.set(x, "addTreeDataModelListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetRoot(value: () => XTreeNode): Self = StObject.set(x, "getRoot", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveTreeDataModelListener(value: XTreeDataModelListener => Unit): Self = StObject.set(x, "removeTreeDataModelListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoot(value: XTreeNode): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An instance of this interface is used by the {@link TreeControl} to get notifications about data model changes.
    *
    * Usually you must not implement this interface yourself as it is already handled by the {@link TreeControl} , but you must notify it correctly if you
    * implement the {@link XTreeDataModel} yourself
    *
    * .
    */
  trait XTreeDataModelListener
    extends StObject
       with XEventListener {
    
    /**
      * Invoked after a node (or a set of siblings) has changed in some way. The node(s) have not changed locations in the tree or altered their children
      * arrays, but other attributes have changed and may affect presentation.
      *
      * Example: the name of a file has changed, but it is in the same location in the file system.
      *
      * To indicate the root has changed, {@link TreeDataModelEvent.Nodes} will contain the root node and {@link TreeDataModelEvent.ParentNode} will be empty.
      */
    def treeNodesChanged(Event: TreeDataModelEvent): Unit
    
    /**
      * Invoked after nodes have been inserted into the tree.
      *
      * Use {@link TreeDataModelEvent.ParentNode} to get the parent of the new node(s). {@link TreeDataModelEvent.Nodes} contains the new node(s).
      */
    def treeNodesInserted(Event: TreeDataModelEvent): Unit
    
    /**
      * Invoked after nodes have been removed from the tree.
      *
      * Note that if a subtree is removed from the tree, this method may only be invoked once for the root of the removed subtree, not once for each
      * individual set of siblings removed.
      *
      * Use {@link TreeDataModelEvent.ParentNode} to get the former parent of the deleted node(s). {@link TreeDataModelEvent.Nodes} contains the removed
      * node(s).
      */
    def treeNodesRemoved(Event: TreeDataModelEvent): Unit
    
    /**
      * Invoked after the tree has drastically changed structure from a given node down.
      *
      * Use {@link TreeDataModelEvent.ParentNode} to get the node which structure has changed. {@link TreeDataModelEvent.Nodes} is empty.
      */
    def treeStructureChanged(Event: TreeDataModelEvent): Unit
  }
  object XTreeDataModelListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      treeNodesChanged: TreeDataModelEvent => Unit,
      treeNodesInserted: TreeDataModelEvent => Unit,
      treeNodesRemoved: TreeDataModelEvent => Unit,
      treeStructureChanged: TreeDataModelEvent => Unit
    ): XTreeDataModelListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), treeNodesChanged = js.Any.fromFunction1(treeNodesChanged), treeNodesInserted = js.Any.fromFunction1(treeNodesInserted), treeNodesRemoved = js.Any.fromFunction1(treeNodesRemoved), treeStructureChanged = js.Any.fromFunction1(treeStructureChanged))
      __obj.asInstanceOf[XTreeDataModelListener]
    }
    
    @scala.inline
    implicit class XTreeDataModelListenerMutableBuilder[Self <: XTreeDataModelListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTreeNodesChanged(value: TreeDataModelEvent => Unit): Self = StObject.set(x, "treeNodesChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeNodesInserted(value: TreeDataModelEvent => Unit): Self = StObject.set(x, "treeNodesInserted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeNodesRemoved(value: TreeDataModelEvent => Unit): Self = StObject.set(x, "treeNodesRemoved", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeStructureChanged(value: TreeDataModelEvent => Unit): Self = StObject.set(x, "treeStructureChanged", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * You can implement this interface and register with {@link XTreeControl.addTreeEditListener()} to get notifications when editing of a node starts and
    * ends.
    *
    * You have to set the {@link TreeControlModel.Editable} property to `TRUE` before a tree supports editing.
    */
  trait XTreeEditListener
    extends StObject
       with XEventListener {
    
    /**
      * This method is called from the {@link TreeControl} implementation when editing of **Node** is finished and was not canceled.
      *
      * Implementations that register a {@link XTreeEditListener} must update the display value at the Node.
      * @param Node the {@link XTreeNode} for that an edit request was fired by calling {@link XTreeControl.startEditingAtNode()}
      * @param NewText the text that was entered by the user.
      */
    def nodeEdited(Node: XTreeNode, NewText: String): Unit
    
    /**
      * This method is called from the {@link TreeControl} implementation when editing of **Node** is requested by calling {@link
      * XTreeControl.startEditingAtNode()} .
      * @param Node the {@link XTreeNode} for that an edit request was fired by calling {@link XTreeControl.startEditingAtNode()}
      * @throws VetoException if thrown the editing will not start.
      */
    def nodeEditing(Node: XTreeNode): Unit
  }
  object XTreeEditListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      disposing: EventObject => Unit,
      nodeEdited: (XTreeNode, String) => Unit,
      nodeEditing: XTreeNode => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XTreeEditListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), nodeEdited = js.Any.fromFunction2(nodeEdited), nodeEditing = js.Any.fromFunction1(nodeEditing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XTreeEditListener]
    }
    
    @scala.inline
    implicit class XTreeEditListenerMutableBuilder[Self <: XTreeEditListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeEdited(value: (XTreeNode, String) => Unit): Self = StObject.set(x, "nodeEdited", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNodeEditing(value: XTreeNode => Unit): Self = StObject.set(x, "nodeEditing", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An instance of this interface can get notifications from a {@link TreeControl} when nodes are expanded or collapsed.
    * @see XTreeControl.addTreeExpansionListener
    * @see XTreeControl.removeTreeExpansionListener
    */
  trait XTreeExpansionListener
    extends StObject
       with XEventListener {
    
    /**
      * Invoked when a node with children on demand is about to be expanded.
      *
      * This event is invoked before the {@link treeExpanding()} event.
      */
    def requestChildNodes(Event: TreeExpansionEvent): Unit
    
    /** Called whenever a node in the tree has been successfully collapsed. */
    def treeCollapsed(Event: TreeExpansionEvent): Unit
    
    /**
      * Invoked whenever a node in the tree is about to be collapsed.
      * @throws ExpandVetoException to notify the calling {@link XTreeControl} that collapsing {@link TreeExpansionEvent.Node} should fail.
      */
    def treeCollapsing(Event: TreeExpansionEvent): Unit
    
    /** Called whenever a node in the tree has been successfully expanded. */
    def treeExpanded(Event: TreeExpansionEvent): Unit
    
    /**
      * Invoked whenever a node in the tree is about to be expanded.
      * @throws ExpandVetoException to notify the calling {@link XTreeControl} that expanding {@link TreeExpansionEvent.Node} should fail.
      */
    def treeExpanding(Event: TreeExpansionEvent): Unit
  }
  object XTreeExpansionListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      requestChildNodes: TreeExpansionEvent => Unit,
      treeCollapsed: TreeExpansionEvent => Unit,
      treeCollapsing: TreeExpansionEvent => Unit,
      treeExpanded: TreeExpansionEvent => Unit,
      treeExpanding: TreeExpansionEvent => Unit
    ): XTreeExpansionListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), requestChildNodes = js.Any.fromFunction1(requestChildNodes), treeCollapsed = js.Any.fromFunction1(treeCollapsed), treeCollapsing = js.Any.fromFunction1(treeCollapsing), treeExpanded = js.Any.fromFunction1(treeExpanded), treeExpanding = js.Any.fromFunction1(treeExpanding))
      __obj.asInstanceOf[XTreeExpansionListener]
    }
    
    @scala.inline
    implicit class XTreeExpansionListenerMutableBuilder[Self <: XTreeExpansionListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestChildNodes(value: TreeExpansionEvent => Unit): Self = StObject.set(x, "requestChildNodes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeCollapsed(value: TreeExpansionEvent => Unit): Self = StObject.set(x, "treeCollapsed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeCollapsing(value: TreeExpansionEvent => Unit): Self = StObject.set(x, "treeCollapsing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeExpanded(value: TreeExpansionEvent => Unit): Self = StObject.set(x, "treeExpanded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeExpanding(value: TreeExpansionEvent => Unit): Self = StObject.set(x, "treeExpanding", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An instance implementing this interface represents the model data for an entry in a {@link XTreeDataModel} .
    *
    * The {@link TreeControl} uses this interface to retrieve the model information needed to display a hierarchical outline
    *
    * Each {@link XTreeNode} in a {@link XTreeDataModel} must be unique.
    */
  trait XTreeNode extends StObject {
    
    /** Returns the number of child nodes. */
    val ChildCount: Double
    
    /**
      * The URL for a graphic that is rendered to visualize collapsed non leaf nodes.
      *
      * If **URL** is empty, {@link XTreeControl.DefaultCollapsedGraphicURL} is used.
      */
    val CollapsedGraphicURL: String
    
    /** If not empty, the textual representation of this any is used as the text part of this node. */
    val DisplayValue: js.Any
    
    /**
      * The URL for a graphic that is rendered to visualize expanded non leaf nodes.
      *
      * If **URL** is empty, {@link XTreeControl.DefaultExpandedGraphicURL} is used.
      */
    val ExpandedGraphicURL: String
    
    /**
      * The URL for a graphic that is rendered before the text part of this node.
      *
      * If this URL is empty, no graphic is rendered.
      */
    val NodeGraphicURL: String
    
    /** Returns the parent node of this node. */
    val Parent: XTreeNode
    
    /**
      * Returns the child tree node at **Index** .
      * @throws com::sun::star::lang::IndexOutOfBoundsException if **Index** is less than 0 or equal or greater then {@link getChildCount()} .
      */
    def getChildAt(Index: Double): XTreeNode
    
    /** Returns the number of child nodes. */
    def getChildCount(): Double
    
    /**
      * The URL for a graphic that is rendered to visualize collapsed non leaf nodes.
      *
      * If **URL** is empty, {@link XTreeControl.DefaultCollapsedGraphicURL} is used.
      */
    def getCollapsedGraphicURL(): String
    
    /** If not empty, the textual representation of this any is used as the text part of this node. */
    def getDisplayValue(): js.Any
    
    /**
      * The URL for a graphic that is rendered to visualize expanded non leaf nodes.
      *
      * If **URL** is empty, {@link XTreeControl.DefaultExpandedGraphicURL} is used.
      */
    def getExpandedGraphicURL(): String
    
    /**
      * Returns the index of **Node** in this instances children.
      * @returns The child index of **Node** , or -1 if **Node** is no child of this instance.
      */
    def getIndex(Node: XTreeNode): Double
    
    /**
      * The URL for a graphic that is rendered before the text part of this node.
      *
      * If this URL is empty, no graphic is rendered.
      */
    def getNodeGraphicURL(): String
    
    /** Returns the parent node of this node. */
    def getParent(): XTreeNode
    
    /**
      * Returns `TRUE` if the children of this node are created on demand.
      *
      * A {@link TreeControl} will handle a node that returns `TRUE` always like a node that has child nodes, even if {@link getChildCount()} returns 0.
      * @see TreeExpansionListener;
      */
    def hasChildrenOnDemand(): Boolean
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
    implicit class XTreeNodeMutableBuilder[Self <: XTreeNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildCount(value: Double): Self = StObject.set(x, "ChildCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedGraphicURL(value: String): Self = StObject.set(x, "CollapsedGraphicURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayValue(value: js.Any): Self = StObject.set(x, "DisplayValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedGraphicURL(value: String): Self = StObject.set(x, "ExpandedGraphicURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetChildAt(value: Double => XTreeNode): Self = StObject.set(x, "getChildAt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetChildCount(value: () => Double): Self = StObject.set(x, "getChildCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCollapsedGraphicURL(value: () => String): Self = StObject.set(x, "getCollapsedGraphicURL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDisplayValue(value: () => js.Any): Self = StObject.set(x, "getDisplayValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetExpandedGraphicURL(value: () => String): Self = StObject.set(x, "getExpandedGraphicURL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetIndex(value: XTreeNode => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetNodeGraphicURL(value: () => String): Self = StObject.set(x, "getNodeGraphicURL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => XTreeNode): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasChildrenOnDemand(value: () => Boolean): Self = StObject.set(x, "hasChildrenOnDemand", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNodeGraphicURL(value: String): Self = StObject.set(x, "NodeGraphicURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: XTreeNode): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    }
  }
}
