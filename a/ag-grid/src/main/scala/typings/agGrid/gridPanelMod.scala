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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridPanelMod {
  
  @JSImport("ag-grid/dist/lib/gridPanel/gridPanel", "GridPanel")
  @js.native
  class GridPanel () extends Component {
    
    /* private */ @JSName("$scope")
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
    
    /* private */ var alignedGridsService: js.Any = js.native
    
    /* private */ var animationFrameService: js.Any = js.native
    
    /* private */ var autoHeightCalculator: js.Any = js.native
    
    /* private */ var autoWidthCalculator: js.Any = js.native
    
    /* private */ var beans: js.Any = js.native
    
    /* private */ var bodyHeight: js.Any = js.native
    
    /* private */ def buildRowContainerComponents(): js.Any = js.native
    
    /* private */ def checkBodyHeight(): js.Any = js.native
    
    def checkViewportAndScrolls(): Unit = js.native
    
    /* private */ var clipboardService: js.Any = js.native
    
    /* private */ var columnAnimationService: js.Any = js.native
    
    /* private */ var columnApi: js.Any = js.native
    
    /* private */ var columnController: js.Any = js.native
    
    /* private */ var componentRecipes: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ var contextMenuFactory: js.Any = js.native
    
    /* private */ var csvCreator: js.Any = js.native
    
    /* private */ def disableBrowserDragging(): js.Any = js.native
    
    /* private */ def doHorizontalScroll(): js.Any = js.native
    
    /* private */ var dragAndDropService: js.Any = js.native
    
    /* private */ var dragService: js.Any = js.native
    
    /* private */ var eAllCellContainers: js.Any = js.native
    
    /* private */ var eBody: js.Any = js.native
    
    /* private */ var eBodyContainer: js.Any = js.native
    
    /* private */ var eBodyViewport: js.Any = js.native
    
    /* private */ var eBottom: js.Any = js.native
    
    /* private */ var eBottomContainer: js.Any = js.native
    
    /* private */ var eBottomFullWidthContainer: js.Any = js.native
    
    /* private */ var eBottomViewport: js.Any = js.native
    
    /* private */ var eFullWidthContainer: js.Any = js.native
    
    /* private */ var eFullWidthViewport: js.Any = js.native
    
    /* private */ var eFullWidthViewportWrapper: js.Any = js.native
    
    /* private */ var eLeftBottom: js.Any = js.native
    
    /* private */ var eLeftContainer: js.Any = js.native
    
    /* private */ var eLeftTop: js.Any = js.native
    
    /* private */ var eLeftViewport: js.Any = js.native
    
    /* private */ var eLeftViewportWrapper: js.Any = js.native
    
    /* private */ var eOverlay: js.Any = js.native
    
    /* private */ var eRightBottom: js.Any = js.native
    
    /* private */ var eRightContainer: js.Any = js.native
    
    /* private */ var eRightTop: js.Any = js.native
    
    /* private */ var eRightViewport: js.Any = js.native
    
    /* private */ var eRightViewportWrapper: js.Any = js.native
    
    /* private */ var eTop: js.Any = js.native
    
    /* private */ var eTopContainer: js.Any = js.native
    
    /* private */ var eTopFullWidthContainer: js.Any = js.native
    
    /* private */ var eTopViewport: js.Any = js.native
    
    /* private */ var enableRtl: js.Any = js.native
    
    def ensureColumnVisible(key: js.Any): Unit = js.native
    
    def ensureIndexVisible(index: js.Any): Unit = js.native
    def ensureIndexVisible(index: js.Any, position: String): Unit = js.native
    
    /* private */ var enterprise: js.Any = js.native
    
    /* private */ var eventService: js.Any = js.native
    
    def executeFrame(): Boolean = js.native
    
    /* private */ var focusedCellController: js.Any = js.native
    
    /* private */ var frameworkFactory: js.Any = js.native
    
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
    
    /* private */ var gridApi: js.Any = js.native
    
    /* private */ var gridOptionsWrapper: js.Any = js.native
    
    /* private */ def handleContextMenuMouseEvent(mouseEvent: js.Any, touchEvent: js.Any, rowComp: js.Any, cellComp: js.Any): js.Any = js.native
    
    var headerRootComp: HeaderRootComp = js.native
    
    /* private */ var heightScaler: js.Any = js.native
    
    /* private */ def hideFullWidthViewportScrollbars(): js.Any = js.native
    
    def hideOverlay(): Unit = js.native
    
    /* private */ def hideVerticalScrollOnCenter(): js.Any = js.native
    
    def horizontallyScrollHeaderCenterAndFloatingCenter(): Unit = js.native
    
    /* private */ @JSName("init")
    def init_MGridPanel(): js.Any = js.native
    
    def isHorizontalScrollShowing(): Boolean = js.native
    
    /* private */ def isVerticalScrollShowing(): js.Any = js.native
    
    /* private */ var lastVScrollElement: js.Any = js.native
    
    /* private */ var lastVScrollTime: js.Any = js.native
    
    /* private */ def mockContextMenuForIPad(): js.Any = js.native
    
    /* private */ var mouseEventService: js.Any = js.native
    
    /* private */ var navigationService: js.Any = js.native
    
    /* private */ var nextScrollLeft: js.Any = js.native
    
    /* private */ var nextScrollTop: js.Any = js.native
    
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
    
    /* private */ var overlayWrapper: js.Any = js.native
    
    /* private */ var paginationAutoPageSizeService: js.Any = js.native
    
    /* private */ var paginationProxy: js.Any = js.native
    
    /* private */ var pinnedRowModel: js.Any = js.native
    
    /* private */ var pinningLeft: js.Any = js.native
    
    /* private */ var pinningRight: js.Any = js.native
    
    /* private */ def preventDefaultOnContextMenu(mouseEvent: js.Any): js.Any = js.native
    
    /* private */ def processKeyboardEvent(eventName: js.Any, keyboardEvent: js.Any): js.Any = js.native
    
    /* private */ def processMouseEvent(eventName: js.Any, mouseEvent: js.Any): js.Any = js.native
    
    /* private */ var rangeController: js.Any = js.native
    
    /* private */ def redrawRowsAfterScroll(): js.Any = js.native
    
    def removeScrollEventListener(listener: js.Function0[Unit]): Unit = js.native
    
    /* private */ var rowContainerComponents: js.Any = js.native
    
    /* private */ var rowRenderer: js.Any = js.native
    
    /* private */ var scrollClipWidth: js.Any = js.native
    
    def scrollHorizontally(pixels: Double): Double = js.native
    
    /* private */ var scrollLeft: js.Any = js.native
    
    def scrollToTop(): Unit = js.native
    
    /* private */ var scrollTop: js.Any = js.native
    
    def scrollVertically(pixels: Double): Double = js.native
    
    /* private */ var scrollVisibleService: js.Any = js.native
    
    /* private */ var scrollWidth: js.Any = js.native
    
    /* private */ var selectionController: js.Any = js.native
    
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
    
    /* private */ var useAnimationFrame: js.Any = js.native
    
    /* private */ var valueService: js.Any = js.native
    
    /* private */ var verticalRedrawNeeded: js.Any = js.native
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
    
    inline def body: typings.agGrid.agGridStrings.body = "body".asInstanceOf[typings.agGrid.agGridStrings.body]
    
    inline def floatingBottom: typings.agGrid.agGridStrings.floatingBottom = "floatingBottom".asInstanceOf[typings.agGrid.agGridStrings.floatingBottom]
    
    inline def floatingBottomFullWith: typings.agGrid.agGridStrings.floatingBottomFullWith = "floatingBottomFullWith".asInstanceOf[typings.agGrid.agGridStrings.floatingBottomFullWith]
    
    inline def floatingBottomPinnedLeft: typings.agGrid.agGridStrings.floatingBottomPinnedLeft = "floatingBottomPinnedLeft".asInstanceOf[typings.agGrid.agGridStrings.floatingBottomPinnedLeft]
    
    inline def floatingBottomPinnedRight: typings.agGrid.agGridStrings.floatingBottomPinnedRight = "floatingBottomPinnedRight".asInstanceOf[typings.agGrid.agGridStrings.floatingBottomPinnedRight]
    
    inline def floatingTop: typings.agGrid.agGridStrings.floatingTop = "floatingTop".asInstanceOf[typings.agGrid.agGridStrings.floatingTop]
    
    inline def floatingTopFullWidth: typings.agGrid.agGridStrings.floatingTopFullWidth = "floatingTopFullWidth".asInstanceOf[typings.agGrid.agGridStrings.floatingTopFullWidth]
    
    inline def floatingTopPinnedLeft: typings.agGrid.agGridStrings.floatingTopPinnedLeft = "floatingTopPinnedLeft".asInstanceOf[typings.agGrid.agGridStrings.floatingTopPinnedLeft]
    
    inline def floatingTopPinnedRight: typings.agGrid.agGridStrings.floatingTopPinnedRight = "floatingTopPinnedRight".asInstanceOf[typings.agGrid.agGridStrings.floatingTopPinnedRight]
    
    inline def fullWidth: typings.agGrid.agGridStrings.fullWidth = "fullWidth".asInstanceOf[typings.agGrid.agGridStrings.fullWidth]
    
    inline def pinnedLeft: typings.agGrid.agGridStrings.pinnedLeft = "pinnedLeft".asInstanceOf[typings.agGrid.agGridStrings.pinnedLeft]
    
    inline def pinnedRight: typings.agGrid.agGridStrings.pinnedRight = "pinnedRight".asInstanceOf[typings.agGrid.agGridStrings.pinnedRight]
  }
  
  /* Inlined {[ K in ag-grid.ag-grid/dist/lib/gridPanel/gridPanel.RowContainerComponentNames ]: ag-grid.ag-grid/dist/lib/rendering/rowContainerComponent.RowContainerComponent} */
  trait RowContainerComponents extends StObject {
    
    var body: RowContainerComponent
    
    var floatingBottom: RowContainerComponent
    
    var floatingBottomFullWith: RowContainerComponent
    
    var floatingBottomPinnedLeft: RowContainerComponent
    
    var floatingBottomPinnedRight: RowContainerComponent
    
    var floatingTop: RowContainerComponent
    
    var floatingTopFullWidth: RowContainerComponent
    
    var floatingTopPinnedLeft: RowContainerComponent
    
    var floatingTopPinnedRight: RowContainerComponent
    
    var fullWidth: RowContainerComponent
    
    var pinnedLeft: RowContainerComponent
    
    var pinnedRight: RowContainerComponent
  }
  object RowContainerComponents {
    
    inline def apply(
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
    
    extension [Self <: RowContainerComponents](x: Self) {
      
      inline def setBody(value: RowContainerComponent): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setFloatingBottom(value: RowContainerComponent): Self = StObject.set(x, "floatingBottom", value.asInstanceOf[js.Any])
      
      inline def setFloatingBottomFullWith(value: RowContainerComponent): Self = StObject.set(x, "floatingBottomFullWith", value.asInstanceOf[js.Any])
      
      inline def setFloatingBottomPinnedLeft(value: RowContainerComponent): Self = StObject.set(x, "floatingBottomPinnedLeft", value.asInstanceOf[js.Any])
      
      inline def setFloatingBottomPinnedRight(value: RowContainerComponent): Self = StObject.set(x, "floatingBottomPinnedRight", value.asInstanceOf[js.Any])
      
      inline def setFloatingTop(value: RowContainerComponent): Self = StObject.set(x, "floatingTop", value.asInstanceOf[js.Any])
      
      inline def setFloatingTopFullWidth(value: RowContainerComponent): Self = StObject.set(x, "floatingTopFullWidth", value.asInstanceOf[js.Any])
      
      inline def setFloatingTopPinnedLeft(value: RowContainerComponent): Self = StObject.set(x, "floatingTopPinnedLeft", value.asInstanceOf[js.Any])
      
      inline def setFloatingTopPinnedRight(value: RowContainerComponent): Self = StObject.set(x, "floatingTopPinnedRight", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: RowContainerComponent): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setPinnedLeft(value: RowContainerComponent): Self = StObject.set(x, "pinnedLeft", value.asInstanceOf[js.Any])
      
      inline def setPinnedRight(value: RowContainerComponent): Self = StObject.set(x, "pinnedRight", value.asInstanceOf[js.Any])
    }
  }
}
