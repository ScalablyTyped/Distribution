package typings.agGrid.gridPanelMod

import typings.agGrid.anon.Bottom
import typings.agGrid.anon.Left
import typings.agGrid.componentMod.Component
import typings.agGrid.headerRootCompMod.HeaderRootComp
import typings.std.ClientRect
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/gridPanel/gridPanel", "GridPanel")
@js.native
class GridPanel () extends Component {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var alignedGridsService: js.Any = js.native
  var animationFrameService: js.Any = js.native
  var autoHeightCalculator: js.Any = js.native
  var autoWidthCalculator: js.Any = js.native
  var beans: js.Any = js.native
  var bodyHeight: js.Any = js.native
  var clipboardService: js.Any = js.native
  var columnAnimationService: js.Any = js.native
  var columnApi: js.Any = js.native
  var columnController: js.Any = js.native
  var componentRecipes: js.Any = js.native
  var context: js.Any = js.native
  var contextMenuFactory: js.Any = js.native
  var csvCreator: js.Any = js.native
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
  var enterprise: js.Any = js.native
  var eventService: js.Any = js.native
  var focusedCellController: js.Any = js.native
  var frameworkFactory: js.Any = js.native
  var gridApi: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var headerRootComp: HeaderRootComp = js.native
  var heightScaler: js.Any = js.native
  var lastVScrollElement: js.Any = js.native
  var lastVScrollTime: js.Any = js.native
  var mouseEventService: js.Any = js.native
  var navigationService: js.Any = js.native
  var nextScrollLeft: js.Any = js.native
  var nextScrollTop: js.Any = js.native
  var overlayWrapper: js.Any = js.native
  var paginationAutoPageSizeService: js.Any = js.native
  var paginationProxy: js.Any = js.native
  var pinnedRowModel: js.Any = js.native
  var pinningLeft: js.Any = js.native
  var pinningRight: js.Any = js.native
  var rangeController: js.Any = js.native
  var rowContainerComponents: js.Any = js.native
  var rowRenderer: js.Any = js.native
  var scrollClipWidth: js.Any = js.native
  var scrollLeft: js.Any = js.native
  var scrollTop: js.Any = js.native
  var scrollVisibleService: js.Any = js.native
  var scrollWidth: js.Any = js.native
  var selectionController: js.Any = js.native
  var useAnimationFrame: js.Any = js.native
  var valueService: js.Any = js.native
  var verticalRedrawNeeded: js.Any = js.native
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
  /* private */ def buildRowContainerComponents(): js.Any = js.native
  /* private */ def checkBodyHeight(): js.Any = js.native
  def checkViewportAndScrolls(): Unit = js.native
  /* private */ def disableBrowserDragging(): js.Any = js.native
  /* private */ def doHorizontalScroll(): js.Any = js.native
  def ensureColumnVisible(key: js.Any): Unit = js.native
  def ensureIndexVisible(index: js.Any): Unit = js.native
  def ensureIndexVisible(index: js.Any, position: String): Unit = js.native
  def executeFrame(): Boolean = js.native
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
  /* private */ def handleContextMenuMouseEvent(mouseEvent: js.Any, touchEvent: js.Any, rowComp: js.Any, cellComp: js.Any): js.Any = js.native
  /* private */ def hideFullWidthViewportScrollbars(): js.Any = js.native
  def hideOverlay(): Unit = js.native
  /* private */ def hideVerticalScrollOnCenter(): js.Any = js.native
  def horizontallyScrollHeaderCenterAndFloatingCenter(): Unit = js.native
  @JSName("init")
  /* private */ def init_MGridPanel(): js.Any = js.native
  def isHorizontalScrollShowing(): Boolean = js.native
  /* private */ def isVerticalScrollShowing(): js.Any = js.native
  /* private */ def mockContextMenuForIPad(): js.Any = js.native
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
  /* private */ def preventDefaultOnContextMenu(mouseEvent: js.Any): js.Any = js.native
  /* private */ def processKeyboardEvent(eventName: js.Any, keyboardEvent: js.Any): js.Any = js.native
  /* private */ def processMouseEvent(eventName: js.Any, mouseEvent: js.Any): js.Any = js.native
  /* private */ def redrawRowsAfterScroll(): js.Any = js.native
  def removeScrollEventListener(listener: js.Function0[Unit]): Unit = js.native
  def scrollHorizontally(pixels: Double): Double = js.native
  def scrollToTop(): Unit = js.native
  def scrollVertically(pixels: Double): Double = js.native
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
}

