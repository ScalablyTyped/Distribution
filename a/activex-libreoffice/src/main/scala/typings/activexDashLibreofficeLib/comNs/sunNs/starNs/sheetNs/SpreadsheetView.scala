package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a view of a spreadsheet document. */
trait SpreadsheetView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller
     with SpreadsheetViewSettings
     with SpreadsheetViewPane
     with XSpreadsheetView
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with XViewSplitable
     with XViewFreezable
     with XRangeSelection
     with XEnhancedMouseClickBroadcaster
     with XActivationBroadcaster

object SpreadsheetView {
  @scala.inline
  def apply(
    ActiveSheet: XSpreadsheet,
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    FirstVisibleColumn: scala.Double,
    FirstVisibleRow: scala.Double,
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    GridColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HasColumnRowHeaders: scala.Boolean,
    HasHorizontalScrollBar: scala.Boolean,
    HasSheetTabs: scala.Boolean,
    HasVerticalScrollBar: scala.Boolean,
    HideSpellMarks: scala.Boolean,
    IsOutlineSymbolsSet: scala.Boolean,
    IsValueHighlightingEnabled: scala.Boolean,
    IsWindowSplit: scala.Boolean,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReferredCells: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    Selection: js.Any,
    ShowAnchor: scala.Boolean,
    ShowCharts: scala.Double,
    ShowDrawing: scala.Double,
    ShowFormulas: scala.Boolean,
    ShowGrid: scala.Boolean,
    ShowHelpLines: scala.Boolean,
    ShowNotes: scala.Boolean,
    ShowObjects: scala.Double,
    ShowPageBreaks: scala.Boolean,
    ShowZeroValues: scala.Boolean,
    SplitColumn: scala.Double,
    SplitHorizontal: scala.Double,
    SplitRow: scala.Double,
    SplitVertical: scala.Double,
    Transferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    ViewData: js.Any,
    VisibleRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    ZoomType: scala.Double,
    ZoomValue: scala.Double,
    abortRangeSelection: () => scala.Unit,
    acquire: () => scala.Unit,
    addActivationEventListener: XActivationEventListener => scala.Unit,
    addEnhancedMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XEnhancedMouseClickHandler => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addKeyHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler => scala.Unit,
    addMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addRangeSelectionChangeListener: XRangeSelectionChangeListener => scala.Unit,
    addRangeSelectionListener: XRangeSelectionListener => scala.Unit,
    addSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    attachFrame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame => scala.Unit,
    attachModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel => scala.Boolean,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    dispose: () => scala.Unit,
    freezeAtPosition: (scala.Double, scala.Double) => scala.Unit,
    getActiveSheet: () => XSpreadsheet,
    getByIndex: scala.Double => js.Any,
    getControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getFirstVisibleColumn: () => scala.Double,
    getFirstVisibleRow: () => scala.Double,
    getFrame: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    getIsWindowSplit: () => scala.Boolean,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    getReferredCells: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getSelection: () => js.Any,
    getSplitColumn: () => scala.Double,
    getSplitHorizontal: () => scala.Double,
    getSplitRow: () => scala.Double,
    getSplitVertical: () => scala.Double,
    getTransferable: () => activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    getViewData: () => js.Any,
    getVisibleRange: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    hasElements: () => scala.Boolean,
    hasFrozenPanes: () => scala.Boolean,
    insertTransferable: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable => scala.Unit,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchDescriptor] => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerContextMenuInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor => scala.Unit,
    release: () => scala.Unit,
    releaseContextMenuInterceptor: activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor => scala.Unit,
    removeActivationEventListener: XActivationEventListener => scala.Unit,
    removeEnhancedMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XEnhancedMouseClickHandler => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeKeyHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler => scala.Unit,
    removeMouseClickHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeRangeSelectionChangeListener: XRangeSelectionChangeListener => scala.Unit,
    removeRangeSelectionListener: XRangeSelectionListener => scala.Unit,
    removeSelectionChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    restoreViewData: js.Any => scala.Unit,
    select: js.Any => scala.Boolean,
    setActiveSheet: XSpreadsheet => scala.Unit,
    setFirstVisibleColumn: scala.Double => scala.Unit,
    setFirstVisibleRow: scala.Double => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    splitAtPosition: (scala.Double, scala.Double) => scala.Unit,
    startRangeSelection: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Unit,
    suspend: scala.Boolean => scala.Boolean
  ): SpreadsheetView = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet, Count = Count, ElementType = ElementType, FirstVisibleColumn = FirstVisibleColumn, FirstVisibleRow = FirstVisibleRow, Frame = Frame, GridColor = GridColor, HasColumnRowHeaders = HasColumnRowHeaders, HasHorizontalScrollBar = HasHorizontalScrollBar, HasSheetTabs = HasSheetTabs, HasVerticalScrollBar = HasVerticalScrollBar, HideSpellMarks = HideSpellMarks, IsOutlineSymbolsSet = IsOutlineSymbolsSet, IsValueHighlightingEnabled = IsValueHighlightingEnabled, IsWindowSplit = IsWindowSplit, Model = Model, PropertySetInfo = PropertySetInfo, ReferredCells = ReferredCells, Selection = Selection, ShowAnchor = ShowAnchor, ShowCharts = ShowCharts, ShowDrawing = ShowDrawing, ShowFormulas = ShowFormulas, ShowGrid = ShowGrid, ShowHelpLines = ShowHelpLines, ShowNotes = ShowNotes, ShowObjects = ShowObjects, ShowPageBreaks = ShowPageBreaks, ShowZeroValues = ShowZeroValues, SplitColumn = SplitColumn, SplitHorizontal = SplitHorizontal, SplitRow = SplitRow, SplitVertical = SplitVertical, Transferable = Transferable, ViewData = ViewData, VisibleRange = VisibleRange, ZoomType = ZoomType, ZoomValue = ZoomValue, abortRangeSelection = js.Any.fromFunction0(abortRangeSelection), acquire = js.Any.fromFunction0(acquire), addActivationEventListener = js.Any.fromFunction1(addActivationEventListener), addEnhancedMouseClickHandler = js.Any.fromFunction1(addEnhancedMouseClickHandler), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRangeSelectionChangeListener = js.Any.fromFunction1(addRangeSelectionChangeListener), addRangeSelectionListener = js.Any.fromFunction1(addRangeSelectionListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), freezeAtPosition = js.Any.fromFunction2(freezeAtPosition), getActiveSheet = js.Any.fromFunction0(getActiveSheet), getByIndex = js.Any.fromFunction1(getByIndex), getControl = js.Any.fromFunction1(getControl), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getFrame = js.Any.fromFunction0(getFrame), getIsWindowSplit = js.Any.fromFunction0(getIsWindowSplit), getModel = js.Any.fromFunction0(getModel), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReferredCells = js.Any.fromFunction0(getReferredCells), getSelection = js.Any.fromFunction0(getSelection), getSplitColumn = js.Any.fromFunction0(getSplitColumn), getSplitHorizontal = js.Any.fromFunction0(getSplitHorizontal), getSplitRow = js.Any.fromFunction0(getSplitRow), getSplitVertical = js.Any.fromFunction0(getSplitVertical), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), getVisibleRange = js.Any.fromFunction0(getVisibleRange), hasElements = js.Any.fromFunction0(hasElements), hasFrozenPanes = js.Any.fromFunction0(hasFrozenPanes), insertTransferable = js.Any.fromFunction1(insertTransferable), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeActivationEventListener = js.Any.fromFunction1(removeActivationEventListener), removeEnhancedMouseClickHandler = js.Any.fromFunction1(removeEnhancedMouseClickHandler), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRangeSelectionChangeListener = js.Any.fromFunction1(removeRangeSelectionChangeListener), removeRangeSelectionListener = js.Any.fromFunction1(removeRangeSelectionListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setActiveSheet = js.Any.fromFunction1(setActiveSheet), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow), setPropertyValue = js.Any.fromFunction2(setPropertyValue), splitAtPosition = js.Any.fromFunction2(splitAtPosition), startRangeSelection = js.Any.fromFunction1(startRangeSelection), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[SpreadsheetView]
  }
}

