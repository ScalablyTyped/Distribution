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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveSheet")(ActiveSheet)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("FirstVisibleColumn")(FirstVisibleColumn)
    __obj.updateDynamic("FirstVisibleRow")(FirstVisibleRow)
    __obj.updateDynamic("Frame")(Frame)
    __obj.updateDynamic("GridColor")(GridColor)
    __obj.updateDynamic("HasColumnRowHeaders")(HasColumnRowHeaders)
    __obj.updateDynamic("HasHorizontalScrollBar")(HasHorizontalScrollBar)
    __obj.updateDynamic("HasSheetTabs")(HasSheetTabs)
    __obj.updateDynamic("HasVerticalScrollBar")(HasVerticalScrollBar)
    __obj.updateDynamic("HideSpellMarks")(HideSpellMarks)
    __obj.updateDynamic("IsOutlineSymbolsSet")(IsOutlineSymbolsSet)
    __obj.updateDynamic("IsValueHighlightingEnabled")(IsValueHighlightingEnabled)
    __obj.updateDynamic("IsWindowSplit")(IsWindowSplit)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ReferredCells")(ReferredCells)
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("ShowAnchor")(ShowAnchor)
    __obj.updateDynamic("ShowCharts")(ShowCharts)
    __obj.updateDynamic("ShowDrawing")(ShowDrawing)
    __obj.updateDynamic("ShowFormulas")(ShowFormulas)
    __obj.updateDynamic("ShowGrid")(ShowGrid)
    __obj.updateDynamic("ShowHelpLines")(ShowHelpLines)
    __obj.updateDynamic("ShowNotes")(ShowNotes)
    __obj.updateDynamic("ShowObjects")(ShowObjects)
    __obj.updateDynamic("ShowPageBreaks")(ShowPageBreaks)
    __obj.updateDynamic("ShowZeroValues")(ShowZeroValues)
    __obj.updateDynamic("SplitColumn")(SplitColumn)
    __obj.updateDynamic("SplitHorizontal")(SplitHorizontal)
    __obj.updateDynamic("SplitRow")(SplitRow)
    __obj.updateDynamic("SplitVertical")(SplitVertical)
    __obj.updateDynamic("Transferable")(Transferable)
    __obj.updateDynamic("ViewData")(ViewData)
    __obj.updateDynamic("VisibleRange")(VisibleRange)
    __obj.updateDynamic("ZoomType")(ZoomType)
    __obj.updateDynamic("ZoomValue")(ZoomValue)
    __obj.updateDynamic("abortRangeSelection")(abortRangeSelection)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addActivationEventListener")(addActivationEventListener)
    __obj.updateDynamic("addEnhancedMouseClickHandler")(addEnhancedMouseClickHandler)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addKeyHandler")(addKeyHandler)
    __obj.updateDynamic("addMouseClickHandler")(addMouseClickHandler)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addRangeSelectionChangeListener")(addRangeSelectionChangeListener)
    __obj.updateDynamic("addRangeSelectionListener")(addRangeSelectionListener)
    __obj.updateDynamic("addSelectionChangeListener")(addSelectionChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("attachFrame")(attachFrame)
    __obj.updateDynamic("attachModel")(attachModel)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("freezeAtPosition")(freezeAtPosition)
    __obj.updateDynamic("getActiveSheet")(getActiveSheet)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getControl")(getControl)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getFirstVisibleColumn")(getFirstVisibleColumn)
    __obj.updateDynamic("getFirstVisibleRow")(getFirstVisibleRow)
    __obj.updateDynamic("getFrame")(getFrame)
    __obj.updateDynamic("getIsWindowSplit")(getIsWindowSplit)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getReferredCells")(getReferredCells)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("getSplitColumn")(getSplitColumn)
    __obj.updateDynamic("getSplitHorizontal")(getSplitHorizontal)
    __obj.updateDynamic("getSplitRow")(getSplitRow)
    __obj.updateDynamic("getSplitVertical")(getSplitVertical)
    __obj.updateDynamic("getTransferable")(getTransferable)
    __obj.updateDynamic("getViewData")(getViewData)
    __obj.updateDynamic("getVisibleRange")(getVisibleRange)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("hasFrozenPanes")(hasFrozenPanes)
    __obj.updateDynamic("insertTransferable")(insertTransferable)
    __obj.updateDynamic("queryDispatch")(queryDispatch)
    __obj.updateDynamic("queryDispatches")(queryDispatches)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerContextMenuInterceptor")(registerContextMenuInterceptor)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseContextMenuInterceptor")(releaseContextMenuInterceptor)
    __obj.updateDynamic("removeActivationEventListener")(removeActivationEventListener)
    __obj.updateDynamic("removeEnhancedMouseClickHandler")(removeEnhancedMouseClickHandler)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeKeyHandler")(removeKeyHandler)
    __obj.updateDynamic("removeMouseClickHandler")(removeMouseClickHandler)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeRangeSelectionChangeListener")(removeRangeSelectionChangeListener)
    __obj.updateDynamic("removeRangeSelectionListener")(removeRangeSelectionListener)
    __obj.updateDynamic("removeSelectionChangeListener")(removeSelectionChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("restoreViewData")(restoreViewData)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("setActiveSheet")(setActiveSheet)
    __obj.updateDynamic("setFirstVisibleColumn")(setFirstVisibleColumn)
    __obj.updateDynamic("setFirstVisibleRow")(setFirstVisibleRow)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("splitAtPosition")(splitAtPosition)
    __obj.updateDynamic("startRangeSelection")(startRangeSelection)
    __obj.updateDynamic("suspend")(suspend)
    __obj.asInstanceOf[SpreadsheetView]
  }
}

