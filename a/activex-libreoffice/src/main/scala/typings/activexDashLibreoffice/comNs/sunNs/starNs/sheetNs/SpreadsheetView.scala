package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControl
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XControlModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XEnhancedMouseClickHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XKeyHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XMouseClickHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.datatransferNs.XTransferable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.Controller
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.DispatchDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XDispatch
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XFrame
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCellRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs.XSelectionChangeListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a view of a spreadsheet document. */
trait SpreadsheetView
  extends Controller
     with SpreadsheetViewSettings
     with SpreadsheetViewPane
     with XSpreadsheetView
     with XIndexAccess
     with XEnumerationAccess
     with XViewSplitable
     with XViewFreezable
     with XRangeSelection
     with XEnhancedMouseClickBroadcaster
     with XActivationBroadcaster

object SpreadsheetView {
  @scala.inline
  def apply(
    ActiveSheet: XSpreadsheet,
    Count: Double,
    ElementType: `type`,
    FirstVisibleColumn: Double,
    FirstVisibleRow: Double,
    Frame: XFrame,
    GridColor: Color,
    HasColumnRowHeaders: Boolean,
    HasHorizontalScrollBar: Boolean,
    HasSheetTabs: Boolean,
    HasVerticalScrollBar: Boolean,
    HideSpellMarks: Boolean,
    IsOutlineSymbolsSet: Boolean,
    IsValueHighlightingEnabled: Boolean,
    IsWindowSplit: Boolean,
    Model: XModel,
    PropertySetInfo: XPropertySetInfo,
    ReferredCells: XCellRange,
    Selection: js.Any,
    ShowAnchor: Boolean,
    ShowCharts: Double,
    ShowDrawing: Double,
    ShowFormulas: Boolean,
    ShowGrid: Boolean,
    ShowHelpLines: Boolean,
    ShowNotes: Boolean,
    ShowObjects: Double,
    ShowPageBreaks: Boolean,
    ShowZeroValues: Boolean,
    SplitColumn: Double,
    SplitHorizontal: Double,
    SplitRow: Double,
    SplitVertical: Double,
    Transferable: XTransferable,
    ViewData: js.Any,
    VisibleRange: CellRangeAddress,
    ZoomType: Double,
    ZoomValue: Double,
    abortRangeSelection: () => Unit,
    acquire: () => Unit,
    addActivationEventListener: XActivationEventListener => Unit,
    addEnhancedMouseClickHandler: XEnhancedMouseClickHandler => Unit,
    addEventListener: XEventListener => Unit,
    addKeyHandler: XKeyHandler => Unit,
    addMouseClickHandler: XMouseClickHandler => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRangeSelectionChangeListener: XRangeSelectionChangeListener => Unit,
    addRangeSelectionListener: XRangeSelectionListener => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    createEnumeration: () => XEnumeration,
    dispose: () => Unit,
    freezeAtPosition: (Double, Double) => Unit,
    getActiveSheet: () => XSpreadsheet,
    getByIndex: Double => js.Any,
    getControl: XControlModel => XControl,
    getCount: () => Double,
    getElementType: () => `type`,
    getFirstVisibleColumn: () => Double,
    getFirstVisibleRow: () => Double,
    getFrame: () => XFrame,
    getIsWindowSplit: () => Boolean,
    getModel: () => XModel,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getReferredCells: () => XCellRange,
    getSelection: () => js.Any,
    getSplitColumn: () => Double,
    getSplitHorizontal: () => Double,
    getSplitRow: () => Double,
    getSplitVertical: () => Double,
    getTransferable: () => XTransferable,
    getViewData: () => js.Any,
    getVisibleRange: () => CellRangeAddress,
    hasElements: () => Boolean,
    hasFrozenPanes: () => Boolean,
    insertTransferable: XTransferable => Unit,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => Unit,
    release: () => Unit,
    releaseContextMenuInterceptor: XContextMenuInterceptor => Unit,
    removeActivationEventListener: XActivationEventListener => Unit,
    removeEnhancedMouseClickHandler: XEnhancedMouseClickHandler => Unit,
    removeEventListener: XEventListener => Unit,
    removeKeyHandler: XKeyHandler => Unit,
    removeMouseClickHandler: XMouseClickHandler => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRangeSelectionChangeListener: XRangeSelectionChangeListener => Unit,
    removeRangeSelectionListener: XRangeSelectionListener => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    restoreViewData: js.Any => Unit,
    select: js.Any => Boolean,
    setActiveSheet: XSpreadsheet => Unit,
    setFirstVisibleColumn: Double => Unit,
    setFirstVisibleRow: Double => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    splitAtPosition: (Double, Double) => Unit,
    startRangeSelection: SeqEquiv[PropertyValue] => Unit,
    suspend: Boolean => Boolean
  ): SpreadsheetView = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet, Count = Count, ElementType = ElementType, FirstVisibleColumn = FirstVisibleColumn, FirstVisibleRow = FirstVisibleRow, Frame = Frame, GridColor = GridColor, HasColumnRowHeaders = HasColumnRowHeaders, HasHorizontalScrollBar = HasHorizontalScrollBar, HasSheetTabs = HasSheetTabs, HasVerticalScrollBar = HasVerticalScrollBar, HideSpellMarks = HideSpellMarks, IsOutlineSymbolsSet = IsOutlineSymbolsSet, IsValueHighlightingEnabled = IsValueHighlightingEnabled, IsWindowSplit = IsWindowSplit, Model = Model, PropertySetInfo = PropertySetInfo, ReferredCells = ReferredCells, Selection = Selection, ShowAnchor = ShowAnchor, ShowCharts = ShowCharts, ShowDrawing = ShowDrawing, ShowFormulas = ShowFormulas, ShowGrid = ShowGrid, ShowHelpLines = ShowHelpLines, ShowNotes = ShowNotes, ShowObjects = ShowObjects, ShowPageBreaks = ShowPageBreaks, ShowZeroValues = ShowZeroValues, SplitColumn = SplitColumn, SplitHorizontal = SplitHorizontal, SplitRow = SplitRow, SplitVertical = SplitVertical, Transferable = Transferable, ViewData = ViewData, VisibleRange = VisibleRange, ZoomType = ZoomType, ZoomValue = ZoomValue, abortRangeSelection = js.Any.fromFunction0(abortRangeSelection), acquire = js.Any.fromFunction0(acquire), addActivationEventListener = js.Any.fromFunction1(addActivationEventListener), addEnhancedMouseClickHandler = js.Any.fromFunction1(addEnhancedMouseClickHandler), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRangeSelectionChangeListener = js.Any.fromFunction1(addRangeSelectionChangeListener), addRangeSelectionListener = js.Any.fromFunction1(addRangeSelectionListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), freezeAtPosition = js.Any.fromFunction2(freezeAtPosition), getActiveSheet = js.Any.fromFunction0(getActiveSheet), getByIndex = js.Any.fromFunction1(getByIndex), getControl = js.Any.fromFunction1(getControl), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getFrame = js.Any.fromFunction0(getFrame), getIsWindowSplit = js.Any.fromFunction0(getIsWindowSplit), getModel = js.Any.fromFunction0(getModel), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReferredCells = js.Any.fromFunction0(getReferredCells), getSelection = js.Any.fromFunction0(getSelection), getSplitColumn = js.Any.fromFunction0(getSplitColumn), getSplitHorizontal = js.Any.fromFunction0(getSplitHorizontal), getSplitRow = js.Any.fromFunction0(getSplitRow), getSplitVertical = js.Any.fromFunction0(getSplitVertical), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), getVisibleRange = js.Any.fromFunction0(getVisibleRange), hasElements = js.Any.fromFunction0(hasElements), hasFrozenPanes = js.Any.fromFunction0(hasFrozenPanes), insertTransferable = js.Any.fromFunction1(insertTransferable), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeActivationEventListener = js.Any.fromFunction1(removeActivationEventListener), removeEnhancedMouseClickHandler = js.Any.fromFunction1(removeEnhancedMouseClickHandler), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRangeSelectionChangeListener = js.Any.fromFunction1(removeRangeSelectionChangeListener), removeRangeSelectionListener = js.Any.fromFunction1(removeRangeSelectionListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setActiveSheet = js.Any.fromFunction1(setActiveSheet), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow), setPropertyValue = js.Any.fromFunction2(setPropertyValue), splitAtPosition = js.Any.fromFunction2(splitAtPosition), startRangeSelection = js.Any.fromFunction1(startRangeSelection), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[SpreadsheetView]
  }
}

