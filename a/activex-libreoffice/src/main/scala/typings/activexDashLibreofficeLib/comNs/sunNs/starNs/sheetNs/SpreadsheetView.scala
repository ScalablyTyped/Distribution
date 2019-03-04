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
    abortRangeSelection: js.Function0[scala.Unit],
    acquire: js.Function0[scala.Unit],
    addActivationEventListener: js.Function1[XActivationEventListener, scala.Unit],
    addEnhancedMouseClickHandler: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XEnhancedMouseClickHandler, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addKeyHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler, scala.Unit],
    addMouseClickHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler, scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addRangeSelectionChangeListener: js.Function1[XRangeSelectionChangeListener, scala.Unit],
    addRangeSelectionListener: js.Function1[XRangeSelectionListener, scala.Unit],
    addSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    attachFrame: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, scala.Unit],
    attachModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, scala.Boolean],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    dispose: js.Function0[scala.Unit],
    freezeAtPosition: js.Function2[scala.Double, scala.Double, scala.Unit],
    getActiveSheet: js.Function0[XSpreadsheet],
    getByIndex: js.Function1[scala.Double, js.Any],
    getControl: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
    ],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getFirstVisibleColumn: js.Function0[scala.Double],
    getFirstVisibleRow: js.Function0[scala.Double],
    getFrame: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame],
    getIsWindowSplit: js.Function0[scala.Boolean],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getReferredCells: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange],
    getSelection: js.Function0[js.Any],
    getSplitColumn: js.Function0[scala.Double],
    getSplitHorizontal: js.Function0[scala.Double],
    getSplitRow: js.Function0[scala.Double],
    getSplitVertical: js.Function0[scala.Double],
    getTransferable: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable],
    getViewData: js.Function0[js.Any],
    getVisibleRange: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    hasElements: js.Function0[scala.Boolean],
    hasFrozenPanes: js.Function0[scala.Boolean],
    insertTransferable: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      scala.Unit
    ],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.DispatchDescriptor], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerContextMenuInterceptor: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    releaseContextMenuInterceptor: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.XContextMenuInterceptor, 
      scala.Unit
    ],
    removeActivationEventListener: js.Function1[XActivationEventListener, scala.Unit],
    removeEnhancedMouseClickHandler: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XEnhancedMouseClickHandler, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeKeyHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyHandler, scala.Unit],
    removeMouseClickHandler: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseClickHandler, scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeRangeSelectionChangeListener: js.Function1[XRangeSelectionChangeListener, scala.Unit],
    removeRangeSelectionListener: js.Function1[XRangeSelectionListener, scala.Unit],
    removeSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    select: js.Function1[js.Any, scala.Boolean],
    setActiveSheet: js.Function1[XSpreadsheet, scala.Unit],
    setFirstVisibleColumn: js.Function1[scala.Double, scala.Unit],
    setFirstVisibleRow: js.Function1[scala.Double, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    splitAtPosition: js.Function2[scala.Double, scala.Double, scala.Unit],
    startRangeSelection: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): SpreadsheetView = {
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet, Count = Count, ElementType = ElementType, FirstVisibleColumn = FirstVisibleColumn, FirstVisibleRow = FirstVisibleRow, Frame = Frame, GridColor = GridColor, HasColumnRowHeaders = HasColumnRowHeaders, HasHorizontalScrollBar = HasHorizontalScrollBar, HasSheetTabs = HasSheetTabs, HasVerticalScrollBar = HasVerticalScrollBar, HideSpellMarks = HideSpellMarks, IsOutlineSymbolsSet = IsOutlineSymbolsSet, IsValueHighlightingEnabled = IsValueHighlightingEnabled, IsWindowSplit = IsWindowSplit, Model = Model, PropertySetInfo = PropertySetInfo, ReferredCells = ReferredCells, Selection = Selection, ShowAnchor = ShowAnchor, ShowCharts = ShowCharts, ShowDrawing = ShowDrawing, ShowFormulas = ShowFormulas, ShowGrid = ShowGrid, ShowHelpLines = ShowHelpLines, ShowNotes = ShowNotes, ShowObjects = ShowObjects, ShowPageBreaks = ShowPageBreaks, ShowZeroValues = ShowZeroValues, SplitColumn = SplitColumn, SplitHorizontal = SplitHorizontal, SplitRow = SplitRow, SplitVertical = SplitVertical, Transferable = Transferable, ViewData = ViewData, VisibleRange = VisibleRange, ZoomType = ZoomType, ZoomValue = ZoomValue, abortRangeSelection = abortRangeSelection, acquire = acquire, addActivationEventListener = addActivationEventListener, addEnhancedMouseClickHandler = addEnhancedMouseClickHandler, addEventListener = addEventListener, addKeyHandler = addKeyHandler, addMouseClickHandler = addMouseClickHandler, addPropertyChangeListener = addPropertyChangeListener, addRangeSelectionChangeListener = addRangeSelectionChangeListener, addRangeSelectionListener = addRangeSelectionListener, addSelectionChangeListener = addSelectionChangeListener, addVetoableChangeListener = addVetoableChangeListener, attachFrame = attachFrame, attachModel = attachModel, createEnumeration = createEnumeration, dispose = dispose, freezeAtPosition = freezeAtPosition, getActiveSheet = getActiveSheet, getByIndex = getByIndex, getControl = getControl, getCount = getCount, getElementType = getElementType, getFirstVisibleColumn = getFirstVisibleColumn, getFirstVisibleRow = getFirstVisibleRow, getFrame = getFrame, getIsWindowSplit = getIsWindowSplit, getModel = getModel, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getReferredCells = getReferredCells, getSelection = getSelection, getSplitColumn = getSplitColumn, getSplitHorizontal = getSplitHorizontal, getSplitRow = getSplitRow, getSplitVertical = getSplitVertical, getTransferable = getTransferable, getViewData = getViewData, getVisibleRange = getVisibleRange, hasElements = hasElements, hasFrozenPanes = hasFrozenPanes, insertTransferable = insertTransferable, queryDispatch = queryDispatch, queryDispatches = queryDispatches, queryInterface = queryInterface, registerContextMenuInterceptor = registerContextMenuInterceptor, release = release, releaseContextMenuInterceptor = releaseContextMenuInterceptor, removeActivationEventListener = removeActivationEventListener, removeEnhancedMouseClickHandler = removeEnhancedMouseClickHandler, removeEventListener = removeEventListener, removeKeyHandler = removeKeyHandler, removeMouseClickHandler = removeMouseClickHandler, removePropertyChangeListener = removePropertyChangeListener, removeRangeSelectionChangeListener = removeRangeSelectionChangeListener, removeRangeSelectionListener = removeRangeSelectionListener, removeSelectionChangeListener = removeSelectionChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, restoreViewData = restoreViewData, select = select, setActiveSheet = setActiveSheet, setFirstVisibleColumn = setFirstVisibleColumn, setFirstVisibleRow = setFirstVisibleRow, setPropertyValue = setPropertyValue, splitAtPosition = splitAtPosition, startRangeSelection = startRangeSelection, suspend = suspend)
  
    __obj.asInstanceOf[SpreadsheetView]
  }
}

