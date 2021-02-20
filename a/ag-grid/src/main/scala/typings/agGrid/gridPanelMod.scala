package typings.agGrid

import typings.agGrid.anon.Bottom
import typings.agGrid.anon.Left
import typings.agGrid.componentMod.Component
import typings.agGrid.headerRootCompMod.HeaderRootComp
import typings.agGrid.rowContainerComponentMod.RowContainerComponent
import typings.std.ClientRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridPanelMod {
  
  @JSImport("ag-grid/dist/lib/gridPanel/gridPanel", "GridPanel")
  @js.native
  class GridPanel () extends Component {
    
    @JSName("$scope")
    var $scope: js.Any = js.native
    
    /* private */ def addAngularApplyCheck(): js.Any = js.native
    
    /* private */ def addBodyViewportListener(): js.Any = js.native
    
    /* private */ def addDragListeners(): js.Any = js.native
    
    /* private */ def addEventListeners(): js.Any = js.native
    
    /* private */ def addKeyboardEvents(): js.Any = js.native
    
    /* private */ def addMouseListeners(): js.Any = js.native
    
    /* private */ def addRowDragListener(): js.Any = js.native
    
    def addScrollEventListener(listener: js.Function0[Unit]): Unit = js.native
    
    /* private */ def addScrollListener(): js.Any = js.native
    
    /* private */ def addShortcutKeyListeners(): js.Any = js.native
    
    /* private */ def addStopEditingWhenGridLosesFocus(): js.Any = js.native
    
    var alignedGridsService: js.Any = js.native
    
    var animationFrameService: js.Any = js.native
    
    var autoHeightCalculator: js.Any = js.native
    
    var autoWidthCalculator: js.Any = js.native
    
    var beans: js.Any = js.native
    
    var bodyHeight: js.Any = js.native
    
    /* private */ def buildRowContainerComponents(): js.Any = js.native
    
    /* private */ def checkBodyHeight(): js.Any = js.native
    
    def checkViewportAndScrolls(): Unit = js.native
    
    var clipboardService: js.Any = js.native
    
    var columnAnimationService: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var componentRecipes: js.Any = js.native
    
    var context: js.Any = js.native
    
    var contextMenuFactory: js.Any = js.native
    
    var csvCreator: js.Any = js.native
    
    /* private */ def disableBrowserDragging(): js.Any = js.native
    
    /* private */ def doHorizontalScroll(): js.Any = js.native
    
    var dragAndDropService: js.Any = js.native
    
    var dragService: js.Any = js.native
    
    var eAllCellContainers: js.Any = js.native
    
    var eBody: js.Any = js.native
    
    var eBodyContainer: js.Any = js.native
    
    var eBodyViewport: js.Any = js.native
    
    var eBottom: js.Any = js.native
    
    var eBottomContainer: js.Any = js.native
    
    var eBottomFullWidthContainer: js.Any = js.native
    
    var eBottomViewport: js.Any = js.native
    
    var eFullWidthContainer: js.Any = js.native
    
    var eFullWidthViewport: js.Any = js.native
    
    var eFullWidthViewportWrapper: js.Any = js.native
    
    var eLeftBottom: js.Any = js.native
    
    var eLeftContainer: js.Any = js.native
    
    var eLeftTop: js.Any = js.native
    
    var eLeftViewport: js.Any = js.native
    
    var eLeftViewportWrapper: js.Any = js.native
    
    var eOverlay: js.Any = js.native
    
    var eRightBottom: js.Any = js.native
    
    var eRightContainer: js.Any = js.native
    
    var eRightTop: js.Any = js.native
    
    var eRightViewport: js.Any = js.native
    
    var eRightViewportWrapper: js.Any = js.native
    
    var eTop: js.Any = js.native
    
    var eTopContainer: js.Any = js.native
    
    var eTopFullWidthContainer: js.Any = js.native
    
    var eTopViewport: js.Any = js.native
    
    var enableRtl: js.Any = js.native
    
    def ensureColumnVisible(key: js.Any): Unit = js.native
    
    def ensureIndexVisible(index: js.Any): Unit = js.native
    def ensureIndexVisible(index: js.Any, position: String): Unit = js.native
    
    var enterprise: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def executeFrame(): Boolean = js.native
    
    var focusedCellController: js.Any = js.native
    
    var frameworkFactory: js.Any = js.native
    
    def getBodyClientRect(): ClientRect = js.native
    
    def getBodyContainer(): HTMLElement = js.native
    
    def getBodyHeight(): Double = js.native
    
    def getBodyViewportScrollLeft(): Double = js.native
    
    def getCenterWidth(): Double = js.native
    
    def getDropTargetBodyContainers(): js.Array[HTMLElement] = js.native
    
    def getDropTargetLeftContainers(): js.Array[HTMLElement] = js.native
    
    def getDropTargetRightContainers(): js.Array[HTMLElement] = js.native
    
    def getHScrollPosition(): Left = js.native
    
    def getRowContainers(): RowContainerComponents = js.native
    
    /* private */ def getRowForEvent(event: js.Any): js.Any = js.native
    
    def getVScrollPosition(): Bottom = js.native
    
    /* private */ def getWidthForSizeColsToFit(): js.Any = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def handleContextMenuMouseEvent(mouseEvent: js.Any, touchEvent: js.Any, rowComp: js.Any, cellComp: js.Any): js.Any = js.native
    
    var headerRootComp: HeaderRootComp = js.native
    
    var heightScaler: js.Any = js.native
    
    /* private */ def hideFullWidthViewportScrollbars(): js.Any = js.native
    
    def hideOverlay(): Unit = js.native
    
    /* private */ def hideVerticalScrollOnCenter(): js.Any = js.native
    
    def horizontallyScrollHeaderCenterAndFloatingCenter(): Unit = js.native
    
    @JSName("init")
    /* private */ def init_MGridPanel(): js.Any = js.native
    
    def isHorizontalScrollShowing(): Boolean = js.native
    
    /* private */ def isVerticalScrollShowing(): js.Any = js.native
    
    var lastVScrollElement: js.Any = js.native
    
    var lastVScrollTime: js.Any = js.native
    
    /* private */ def mockContextMenuForIPad(): js.Any = js.native
    
    var mouseEventService: js.Any = js.native
    
    var navigationService: js.Any = js.native
    
    var nextScrollLeft: js.Any = js.native
    
    var nextScrollTop: js.Any = js.native
    
    /* private */ def onAnyBodyScroll(source: js.Any): js.Any = js.native
    
    /* private */ def onBodyHorizontalScroll(): js.Any = js.native
    
    /* private */ def onBodyViewportResized(): js.Any = js.native
    
    /* private */ def onContextMenu(mouseEvent: js.Any, touchEvent: js.Any, rowNode: js.Any, column: js.Any, value: js.Any): js.Any = js.native
    
    /* private */ def onCtrlAndA(event: js.Any): js.Any = js.native
    
    /* private */ def onCtrlAndC(event: js.Any): js.Any = js.native
    
    /* private */ def onCtrlAndD(event: js.Any): js.Any = js.native
    
    /* private */ def onCtrlAndV(event: js.Any): js.Any = js.native
    
    def onDisplayedColumnsChanged(): Unit = js.native
    
    /* private */ def onDisplayedColumnsWidthChanged(): js.Any = js.native
    
    /* private */ def onHorizontalViewportChanged(): js.Any = js.native
    
    /* private */ def onNewColumnsLoaded(): js.Any = js.native
    
    /* private */ def onRowDataChanged(): js.Any = js.native
    
    var overlayWrapper: js.Any = js.native
    
    var paginationAutoPageSizeService: js.Any = js.native
    
    var paginationProxy: js.Any = js.native
    
    var pinnedRowModel: js.Any = js.native
    
    var pinningLeft: js.Any = js.native
    
    var pinningRight: js.Any = js.native
    
    /* private */ def preventDefaultOnContextMenu(mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def processKeyboardEvent(eventName: js.Any, keyboardEvent: js.Any): js.Any = js.native
    
    /* private */ def processMouseEvent(eventName: js.Any, mouseEvent: js.Any): js.Any = js.native
    
    var rangeController: js.Any = js.native
    
    /* private */ def redrawRowsAfterScroll(): js.Any = js.native
    
    def removeScrollEventListener(listener: js.Function0[Unit]): Unit = js.native
    
    var rowContainerComponents: js.Any = js.native
    
    var rowRenderer: js.Any = js.native
    
    var scrollClipWidth: js.Any = js.native
    
    def scrollHorizontally(pixels: Double): Double = js.native
    
    var scrollLeft: js.Any = js.native
    
    def scrollToTop(): Unit = js.native
    
    var scrollTop: js.Any = js.native
    
    def scrollVertically(pixels: Double): Double = js.native
    
    var scrollVisibleService: js.Any = js.native
    
    var scrollWidth: js.Any = js.native
    
    var selectionController: js.Any = js.native
    
    def setBodyAndHeaderHeights(): Unit = js.native
    
    def setBodyViewportScrollLeft(value: Double): Unit = js.native
    
    /* private */ def setBottomPaddingOnPinned(): js.Any = js.native
    
    /* private */ def setCenterWidth(): js.Any = js.native
    
    def setColumnMovingCss(moving: Boolean): Unit = js.native
    
    /* private */ def setElementWidth(element: js.Any, width: js.Any): js.Any = js.native
    
    def setHorizontalScrollPosition(hScrollPosition: Double): Unit = js.native
    
    /* private */ def setPinnedContainersVisible(): js.Any = js.native
    
    /* private */ def setPinnedLeftWidth(): js.Any = js.native
    
    /* private */ def setPinnedRightWidth(): js.Any = js.native
    
    def setVerticalScrollPosition(vScrollPosition: Double): Unit = js.native
    
    /* private */ def setWidthsOfContainers(): js.Any = js.native
    
    /* private */ def setupOverlay(): js.Any = js.native
    
    /* private */ def setupRowAnimationCssClass(): js.Any = js.native
    
    def showLoadingOverlay(): Unit = js.native
    
    def showNoRowsOverlay(): Unit = js.native
    
    /* private */ def showOrHideOverlay(): js.Any = js.native
    
    def sizeColumnsToFit(): Unit = js.native
    def sizeColumnsToFit(nextTimeout: Double): Unit = js.native
    
    /* private */ def suppressScrollOnFloatingRow(): js.Any = js.native
    
    /* private */ def synchroniseVerticalScrollPositions(position: js.Any): js.Any = js.native
    
    /* private */ def updateScrollVisibleService(): js.Any = js.native
    
    var useAnimationFrame: js.Any = js.native
    
    var valueService: js.Any = js.native
    
    var verticalRedrawNeeded: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.agGrid.agGridStrings.fullWidth
    - typings.agGrid.agGridStrings.body
    - typings.agGrid.agGridStrings.pinnedLeft
    - typings.agGrid.agGridStrings.pinnedRight
    - typings.agGrid.agGridStrings.floatingTop
    - typings.agGrid.agGridStrings.floatingTopPinnedLeft
    - typings.agGrid.agGridStrings.floatingTopPinnedRight
    - typings.agGrid.agGridStrings.floatingTopFullWidth
    - typings.agGrid.agGridStrings.floatingBottom
    - typings.agGrid.agGridStrings.floatingBottomPinnedLeft
    - typings.agGrid.agGridStrings.floatingBottomPinnedRight
    - typings.agGrid.agGridStrings.floatingBottomFullWith
  */
  trait RowContainerComponentNames extends StObject
  object RowContainerComponentNames {
    
    @scala.inline
    def body: typings.agGrid.agGridStrings.body = "body".asInstanceOf[typings.agGrid.agGridStrings.body]
    
    @scala.inline
    def floatingBottom: typings.agGrid.agGridStrings.floatingBottom = "floatingBottom".asInstanceOf[typings.agGrid.agGridStrings.floatingBottom]
    
    @scala.inline
    def floatingBottomFullWith: typings.agGrid.agGridStrings.floatingBottomFullWith = "floatingBottomFullWith".asInstanceOf[typings.agGrid.agGridStrings.floatingBottomFullWith]
    
    @scala.inline
    def floatingBottomPinnedLeft: typings.agGrid.agGridStrings.floatingBottomPinnedLeft = "floatingBottomPinnedLeft".asInstanceOf[typings.agGrid.agGridStrings.floatingBottomPinnedLeft]
    
    @scala.inline
    def floatingBottomPinnedRight: typings.agGrid.agGridStrings.floatingBottomPinnedRight = "floatingBottomPinnedRight".asInstanceOf[typings.agGrid.agGridStrings.floatingBottomPinnedRight]
    
    @scala.inline
    def floatingTop: typings.agGrid.agGridStrings.floatingTop = "floatingTop".asInstanceOf[typings.agGrid.agGridStrings.floatingTop]
    
    @scala.inline
    def floatingTopFullWidth: typings.agGrid.agGridStrings.floatingTopFullWidth = "floatingTopFullWidth".asInstanceOf[typings.agGrid.agGridStrings.floatingTopFullWidth]
    
    @scala.inline
    def floatingTopPinnedLeft: typings.agGrid.agGridStrings.floatingTopPinnedLeft = "floatingTopPinnedLeft".asInstanceOf[typings.agGrid.agGridStrings.floatingTopPinnedLeft]
    
    @scala.inline
    def floatingTopPinnedRight: typings.agGrid.agGridStrings.floatingTopPinnedRight = "floatingTopPinnedRight".asInstanceOf[typings.agGrid.agGridStrings.floatingTopPinnedRight]
    
    @scala.inline
    def fullWidth: typings.agGrid.agGridStrings.fullWidth = "fullWidth".asInstanceOf[typings.agGrid.agGridStrings.fullWidth]
    
    @scala.inline
    def pinnedLeft: typings.agGrid.agGridStrings.pinnedLeft = "pinnedLeft".asInstanceOf[typings.agGrid.agGridStrings.pinnedLeft]
    
    @scala.inline
    def pinnedRight: typings.agGrid.agGridStrings.pinnedRight = "pinnedRight".asInstanceOf[typings.agGrid.agGridStrings.pinnedRight]
  }
  
  /* Inlined {[ K in ag-grid.ag-grid/dist/lib/gridPanel/gridPanel.RowContainerComponentNames ]: ag-grid.ag-grid/dist/lib/rendering/rowContainerComponent.RowContainerComponent} */
  @js.native
  trait RowContainerComponents extends StObject {
    
    var body: RowContainerComponent = js.native
    
    var floatingBottom: RowContainerComponent = js.native
    
    var floatingBottomFullWith: RowContainerComponent = js.native
    
    var floatingBottomPinnedLeft: RowContainerComponent = js.native
    
    var floatingBottomPinnedRight: RowContainerComponent = js.native
    
    var floatingTop: RowContainerComponent = js.native
    
    var floatingTopFullWidth: RowContainerComponent = js.native
    
    var floatingTopPinnedLeft: RowContainerComponent = js.native
    
    var floatingTopPinnedRight: RowContainerComponent = js.native
    
    var fullWidth: RowContainerComponent = js.native
    
    var pinnedLeft: RowContainerComponent = js.native
    
    var pinnedRight: RowContainerComponent = js.native
  }
  object RowContainerComponents {
    
    @scala.inline
    def apply(
      body: RowContainerComponent,
      floatingBottom: RowContainerComponent,
      floatingBottomFullWith: RowContainerComponent,
      floatingBottomPinnedLeft: RowContainerComponent,
      floatingBottomPinnedRight: RowContainerComponent,
      floatingTop: RowContainerComponent,
      floatingTopFullWidth: RowContainerComponent,
      floatingTopPinnedLeft: RowContainerComponent,
      floatingTopPinnedRight: RowContainerComponent,
      fullWidth: RowContainerComponent,
      pinnedLeft: RowContainerComponent,
      pinnedRight: RowContainerComponent
    ): RowContainerComponents = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], floatingBottom = floatingBottom.asInstanceOf[js.Any], floatingBottomFullWith = floatingBottomFullWith.asInstanceOf[js.Any], floatingBottomPinnedLeft = floatingBottomPinnedLeft.asInstanceOf[js.Any], floatingBottomPinnedRight = floatingBottomPinnedRight.asInstanceOf[js.Any], floatingTop = floatingTop.asInstanceOf[js.Any], floatingTopFullWidth = floatingTopFullWidth.asInstanceOf[js.Any], floatingTopPinnedLeft = floatingTopPinnedLeft.asInstanceOf[js.Any], floatingTopPinnedRight = floatingTopPinnedRight.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], pinnedLeft = pinnedLeft.asInstanceOf[js.Any], pinnedRight = pinnedRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowContainerComponents]
    }
    
    @scala.inline
    implicit class RowContainerComponentsMutableBuilder[Self <: RowContainerComponents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: RowContainerComponent): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingBottom(value: RowContainerComponent): Self = StObject.set(x, "floatingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingBottomFullWith(value: RowContainerComponent): Self = StObject.set(x, "floatingBottomFullWith", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingBottomPinnedLeft(value: RowContainerComponent): Self = StObject.set(x, "floatingBottomPinnedLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingBottomPinnedRight(value: RowContainerComponent): Self = StObject.set(x, "floatingBottomPinnedRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingTop(value: RowContainerComponent): Self = StObject.set(x, "floatingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingTopFullWidth(value: RowContainerComponent): Self = StObject.set(x, "floatingTopFullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingTopPinnedLeft(value: RowContainerComponent): Self = StObject.set(x, "floatingTopPinnedLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingTopPinnedRight(value: RowContainerComponent): Self = StObject.set(x, "floatingTopPinnedRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidth(value: RowContainerComponent): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedLeft(value: RowContainerComponent): Self = StObject.set(x, "pinnedLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinnedRight(value: RowContainerComponent): Self = StObject.set(x, "pinnedRight", value.asInstanceOf[js.Any])
    }
  }
}
