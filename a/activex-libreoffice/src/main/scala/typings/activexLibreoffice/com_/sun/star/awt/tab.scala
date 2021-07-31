package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typings.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typings.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tab {
  
  /**
    * An event used by a {@link XTabPageContainer} to notify changes in tab page activation.
    * @since OOo 3.4
    */
  trait TabPageActivatedEvent
    extends StObject
       with EventObject {
    
    /** Contains the ID of the tab page */
    var TabPageID: Double
  }
  object TabPageActivatedEvent {
    
    @scala.inline
    def apply(Source: XInterface, TabPageID: Double): TabPageActivatedEvent = {
      val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], TabPageID = TabPageID.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPageActivatedEvent]
    }
    
    @scala.inline
    implicit class TabPageActivatedEventMutableBuilder[Self <: TabPageActivatedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabPageID(value: Double): Self = StObject.set(x, "TabPageID", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies a TabPage control.
    * @since OOo 3.4
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait UnoControlTabPage
    extends StObject
       with UnoControlContainer
  object UnoControlTabPage {
    
    @scala.inline
    def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Controls: SafeArray[XControl],
      Graphics: XGraphics,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      Size: Size,
      TabControllers: SafeArray[XTabController],
      View: XView,
      acquire: () => Unit,
      addContainerListener: XContainerListener => Unit,
      addControl: (String, XControl) => Unit,
      addEventListener: XEventListener => Unit,
      addFocusListener: XFocusListener => Unit,
      addKeyListener: XKeyListener => Unit,
      addMouseListener: XMouseListener => Unit,
      addMouseMotionListener: XMouseMotionListener => Unit,
      addPaintListener: XPaintListener => Unit,
      addTabController: XTabController => Unit,
      addWindowListener: XWindowListener => Unit,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      dispose: () => Unit,
      draw: (Double, Double) => Unit,
      getAccessibleContext: () => XAccessibleContext,
      getContext: () => XInterface,
      getControl: String => XControl,
      getControls: () => SafeArray[XControl],
      getGraphics: () => XGraphics,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getSize: () => Size,
      getTabControllers: () => SafeArray[XTabController],
      getView: () => XView,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeContainerListener: XContainerListener => Unit,
      removeControl: XControl => Unit,
      removeEventListener: XEventListener => Unit,
      removeFocusListener: XFocusListener => Unit,
      removeKeyListener: XKeyListener => Unit,
      removeMouseListener: XMouseListener => Unit,
      removeMouseMotionListener: XMouseMotionListener => Unit,
      removePaintListener: XPaintListener => Unit,
      removeTabController: XTabController => Unit,
      removeWindowListener: XWindowListener => Unit,
      setContext: XInterface => Unit,
      setDesignMode: Boolean => Unit,
      setEnable: Boolean => Unit,
      setFocus: () => Unit,
      setGraphics: XGraphics => Boolean,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Unit,
      setStatusText: String => Unit,
      setTabControllers: SeqEquiv[XTabController] => Unit,
      setVisible: Boolean => Unit,
      setZoom: (Double, Double) => Unit
    ): UnoControlTabPage = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabControllers = TabControllers.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addControl = js.Any.fromFunction2(addControl), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addTabController = js.Any.fromFunction1(addTabController), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getTabControllers = js.Any.fromFunction0(getTabControllers), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeControl = js.Any.fromFunction1(removeControl), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeTabController = js.Any.fromFunction1(removeTabController), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setStatusText = js.Any.fromFunction1(setStatusText), setTabControllers = js.Any.fromFunction1(setTabControllers), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
      __obj.asInstanceOf[UnoControlTabPage]
    }
  }
  
  /**
    * specifies a TabPageContainer control.
    * @since OOo 3.4
    */
  trait UnoControlTabPageContainer
    extends StObject
       with UnoControl
       with XTabPageContainer
  object UnoControlTabPageContainer {
    
    @scala.inline
    def apply(
      AccessibleContext: XAccessibleContext,
      ActiveTabPageID: Double,
      Context: XInterface,
      Graphics: XGraphics,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      Size: Size,
      TabPageCount: Double,
      View: XView,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addFocusListener: XFocusListener => Unit,
      addKeyListener: XKeyListener => Unit,
      addMouseListener: XMouseListener => Unit,
      addMouseMotionListener: XMouseMotionListener => Unit,
      addPaintListener: XPaintListener => Unit,
      addTabPageContainerListener: XTabPageContainerListener => Unit,
      addWindowListener: XWindowListener => Unit,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      dispose: () => Unit,
      draw: (Double, Double) => Unit,
      getAccessibleContext: () => XAccessibleContext,
      getContext: () => XInterface,
      getGraphics: () => XGraphics,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getSize: () => Size,
      getTabPage: Double => XTabPage,
      getTabPageByID: Double => XTabPage,
      getTabPageCount: () => Double,
      getView: () => XView,
      isDesignMode: () => Boolean,
      isTabPageActive: Double => Boolean,
      isTransparent: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removeFocusListener: XFocusListener => Unit,
      removeKeyListener: XKeyListener => Unit,
      removeMouseListener: XMouseListener => Unit,
      removeMouseMotionListener: XMouseMotionListener => Unit,
      removePaintListener: XPaintListener => Unit,
      removeTabPageContainerListener: XTabPageContainerListener => Unit,
      removeWindowListener: XWindowListener => Unit,
      setContext: XInterface => Unit,
      setDesignMode: Boolean => Unit,
      setEnable: Boolean => Unit,
      setFocus: () => Unit,
      setGraphics: XGraphics => Boolean,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Unit,
      setVisible: Boolean => Unit,
      setZoom: (Double, Double) => Unit
    ): UnoControlTabPageContainer = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], ActiveTabPageID = ActiveTabPageID.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TabPageCount = TabPageCount.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addTabPageContainerListener = js.Any.fromFunction1(addTabPageContainerListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSize = js.Any.fromFunction0(getSize), getTabPage = js.Any.fromFunction1(getTabPage), getTabPageByID = js.Any.fromFunction1(getTabPageByID), getTabPageCount = js.Any.fromFunction0(getTabPageCount), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTabPageActive = js.Any.fromFunction1(isTabPageActive), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeTabPageContainerListener = js.Any.fromFunction1(removeTabPageContainerListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
      __obj.asInstanceOf[UnoControlTabPageContainer]
    }
  }
  
  /**
    * specifies a model for a {@link UnoControlTabPageContainer} control.
    * @since OOo 3.4
    */
  trait UnoControlTabPageContainerModel
    extends StObject
       with UnoControlModel
       with XTabPageContainerModel {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo
  }
  object UnoControlTabPageContainerModel {
    
    @scala.inline
    def apply(
      Count: Double,
      DefaultControl: String,
      ElementType: `type`,
      Height: Double,
      Name: String,
      PositionX: String,
      PositionY: String,
      PropertySetInfo: XPropertySetInfo,
      ServiceName: String,
      Step: Double,
      TabIndex: Double,
      Tag: String,
      Width: Double,
      acquire: () => Unit,
      addContainerListener: XContainerListener => Unit,
      addEventListener: XEventListener => Unit,
      addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      createClone: () => XCloneable,
      createTabPage: Double => XTabPageModel,
      dispose: () => Unit,
      firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
      getByIndex: Double => js.Any,
      getCount: () => Double,
      getElementType: () => `type`,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      getPropertyValues: SeqEquiv[String] => SafeArray[js.Any],
      getServiceName: () => String,
      hasElements: () => Boolean,
      insertByIndex: (Double, js.Any) => Unit,
      loadTabPage: (Double, String) => XTabPageModel,
      queryInterface: `type` => js.Any,
      read: XObjectInputStream => Unit,
      release: () => Unit,
      removeByIndex: Double => Unit,
      removeContainerListener: XContainerListener => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertiesChangeListener: XPropertiesChangeListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      replaceByIndex: (Double, js.Any) => Unit,
      setPropertyValue: (String, js.Any) => Unit,
      setPropertyValues: (SeqEquiv[String], SeqEquiv[js.Any]) => Unit,
      write: XObjectOutputStream => Unit
    ): UnoControlTabPageContainerModel = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), createTabPage = js.Any.fromFunction1(createTabPage), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), loadTabPage = js.Any.fromFunction2(loadTabPage), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[UnoControlTabPageContainerModel]
    }
    
    @scala.inline
    implicit class UnoControlTabPageContainerModelMutableBuilder[Self <: UnoControlTabPageContainerModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * specifies the standard model of a {@link XTabPageModel} .
    * @since OOo 3.4
    */
  type UnoControlTabPageModel = XTabPageModel
  
  /**
    * An interface to a control that displays a tab page.
    * @see UnoControlTabPage
    * @since OOo 3.4
    */
  type XTabPage = js.Any
  
  /**
    * An interface to a control that displays tab pages.
    * @see UnoControlTabPageContainer
    * @since OOo 3.4
    */
  trait XTabPageContainer extends StObject {
    
    /** Specifies the ID of the current active tab page. */
    var ActiveTabPageID: Double
    
    /**
      * Returns the number of tab pages.
      * @returns the number of tab pages.
      */
    val TabPageCount: Double
    
    /**
      * Adds a listener for the TabPageActivedEvent posted after the tab page was activated.
      * @param listener the listener to add.
      */
    def addTabPageContainerListener(listener: XTabPageContainerListener): Unit
    
    /**
      * Returns tab page for the given index.
      * @param tabPageIndex - index of the tab page in the IndexContainer.
      * @returns tab page which has tabPageIndex.
      */
    def getTabPage(tabPageIndex: Double): XTabPage
    
    /**
      * Returns tab page for the given ID.
      * @param tabPageID - ID of the tab page.
      * @returns tab page which has tabPageID.
      */
    def getTabPageByID(tabPageID: Double): XTabPage
    
    /**
      * Returns the number of tab pages.
      * @returns the number of tab pages.
      */
    def getTabPageCount(): Double
    
    /**
      * Checks whether a tab page is activated.
      * @param tabPageIndex the tab page to be checked.
      * @returns `TRUE` if tab page is activated, else `FALSE` .
      */
    def isTabPageActive(tabPageIndex: Double): Boolean
    
    /**
      * Removes a listener previously added with addTabPageListener().
      * @param listener the listener to remove.
      */
    def removeTabPageContainerListener(listener: XTabPageContainerListener): Unit
  }
  object XTabPageContainer {
    
    @scala.inline
    def apply(
      ActiveTabPageID: Double,
      TabPageCount: Double,
      addTabPageContainerListener: XTabPageContainerListener => Unit,
      getTabPage: Double => XTabPage,
      getTabPageByID: Double => XTabPage,
      getTabPageCount: () => Double,
      isTabPageActive: Double => Boolean,
      removeTabPageContainerListener: XTabPageContainerListener => Unit
    ): XTabPageContainer = {
      val __obj = js.Dynamic.literal(ActiveTabPageID = ActiveTabPageID.asInstanceOf[js.Any], TabPageCount = TabPageCount.asInstanceOf[js.Any], addTabPageContainerListener = js.Any.fromFunction1(addTabPageContainerListener), getTabPage = js.Any.fromFunction1(getTabPage), getTabPageByID = js.Any.fromFunction1(getTabPageByID), getTabPageCount = js.Any.fromFunction0(getTabPageCount), isTabPageActive = js.Any.fromFunction1(isTabPageActive), removeTabPageContainerListener = js.Any.fromFunction1(removeTabPageContainerListener))
      __obj.asInstanceOf[XTabPageContainer]
    }
    
    @scala.inline
    implicit class XTabPageContainerMutableBuilder[Self <: XTabPageContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTabPageID(value: Double): Self = StObject.set(x, "ActiveTabPageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddTabPageContainerListener(value: XTabPageContainerListener => Unit): Self = StObject.set(x, "addTabPageContainerListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTabPage(value: Double => XTabPage): Self = StObject.set(x, "getTabPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTabPageByID(value: Double => XTabPage): Self = StObject.set(x, "getTabPageByID", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTabPageCount(value: () => Double): Self = StObject.set(x, "getTabPageCount", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsTabPageActive(value: Double => Boolean): Self = StObject.set(x, "isTabPageActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveTabPageContainerListener(value: XTabPageContainerListener => Unit): Self = StObject.set(x, "removeTabPageContainerListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabPageCount(value: Double): Self = StObject.set(x, "TabPageCount", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An instance of this interface is used by the {@link XTabPageContainer} to get notifications about changes in activation of tab pages.
    * @since OOo 3.4
    */
  trait XTabPageContainerListener
    extends StObject
       with XEventListener {
    
    /** Invoked after a tab page was activated. */
    def tabPageActivated(tabPageActivatedEvent: TabPageActivatedEvent): Unit
  }
  object XTabPageContainerListener {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      disposing: EventObject => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      tabPageActivated: TabPageActivatedEvent => Unit
    ): XTabPageContainerListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), tabPageActivated = js.Any.fromFunction1(tabPageActivated))
      __obj.asInstanceOf[XTabPageContainerListener]
    }
    
    @scala.inline
    implicit class XTabPageContainerListenerMutableBuilder[Self <: XTabPageContainerListener] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTabPageActivated(value: TabPageActivatedEvent => Unit): Self = StObject.set(x, "tabPageActivated", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * specifies an interface for a {@link UnoControlTabPageContainerModel} .
    * @since OOo 3.4
    */
  trait XTabPageContainerModel
    extends StObject
       with XIndexContainer
       with XContainer {
    
    /**
      * creates a TabPageModel which can be inserted into the container.
      * @param TabPageID the id of the tab page
      */
    def createTabPage(TabPageID: Double): XTabPageModel
    
    /**
      * creates a TabPageModel which can be inserted into the container, by loading it from a user interface resource file.
      * @param TabPageID the id of the tab page
      * @param ResourceURL the URL of the user interface resource to load
      */
    def loadTabPage(TabPageID: Double, ResourceURL: String): XTabPageModel
  }
  object XTabPageContainerModel {
    
    @scala.inline
    def apply(
      Count: Double,
      ElementType: `type`,
      acquire: () => Unit,
      addContainerListener: XContainerListener => Unit,
      createTabPage: Double => XTabPageModel,
      getByIndex: Double => js.Any,
      getCount: () => Double,
      getElementType: () => `type`,
      hasElements: () => Boolean,
      insertByIndex: (Double, js.Any) => Unit,
      loadTabPage: (Double, String) => XTabPageModel,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeByIndex: Double => Unit,
      removeContainerListener: XContainerListener => Unit,
      replaceByIndex: (Double, js.Any) => Unit
    ): XTabPageContainerModel = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addContainerListener = js.Any.fromFunction1(addContainerListener), createTabPage = js.Any.fromFunction1(createTabPage), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), insertByIndex = js.Any.fromFunction2(insertByIndex), loadTabPage = js.Any.fromFunction2(loadTabPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex), removeContainerListener = js.Any.fromFunction1(removeContainerListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex))
      __obj.asInstanceOf[XTabPageContainerModel]
    }
    
    @scala.inline
    implicit class XTabPageContainerModelMutableBuilder[Self <: XTabPageContainerModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateTabPage(value: Double => XTabPageModel): Self = StObject.set(x, "createTabPage", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadTabPage(value: (Double, String) => XTabPageModel): Self = StObject.set(x, "loadTabPage", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * specifies an {@link XTabPageModel} interface.
    * @since OOo 3.4
    */
  trait XTabPageModel extends StObject {
    
    /** determines whether a tab page is enabled or disabled. */
    var Enabled: Boolean
    
    /** specifies a URL that references a graphic that should be displayed in the tab bar. */
    var ImageURL: String
    
    /** ID for tab page. */
    var TabPageID: Double
    
    /** specifies the text that is displayed in the tab bar of the tab page. */
    var Title: String
    
    /** specifies a tooltip text that should be displayed in the tab bar. */
    var ToolTip: String
  }
  object XTabPageModel {
    
    @scala.inline
    def apply(Enabled: Boolean, ImageURL: String, TabPageID: Double, Title: String, ToolTip: String): XTabPageModel = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ImageURL = ImageURL.asInstanceOf[js.Any], TabPageID = TabPageID.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], ToolTip = ToolTip.asInstanceOf[js.Any])
      __obj.asInstanceOf[XTabPageModel]
    }
    
    @scala.inline
    implicit class XTabPageModelMutableBuilder[Self <: XTabPageModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageURL(value: String): Self = StObject.set(x, "ImageURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabPageID(value: Double): Self = StObject.set(x, "TabPageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolTip(value: String): Self = StObject.set(x, "ToolTip", value.asInstanceOf[js.Any])
    }
  }
}
