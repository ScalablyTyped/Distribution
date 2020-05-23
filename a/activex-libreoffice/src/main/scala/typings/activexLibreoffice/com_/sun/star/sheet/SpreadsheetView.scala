package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.awt.XEnhancedMouseClickHandler
import typings.activexLibreoffice.com_.sun.star.awt.XKeyHandler
import typings.activexLibreoffice.com_.sun.star.awt.XMouseClickHandler
import typings.activexLibreoffice.com_.sun.star.awt.XUserInputInterception
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typings.activexLibreoffice.com_.sun.star.datatransfer.XTransferableSupplier
import typings.activexLibreoffice.com_.sun.star.frame.DispatchDescriptor
import typings.activexLibreoffice.com_.sun.star.frame.XController
import typings.activexLibreoffice.com_.sun.star.frame.XDispatch
import typings.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typings.activexLibreoffice.com_.sun.star.frame.XFrame
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import typings.activexLibreoffice.com_.sun.star.ui.XContextMenuInterception
import typings.activexLibreoffice.com_.sun.star.ui.XContextMenuInterceptor
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.activexLibreoffice.com_.sun.star.view.XControlAccess
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a view of a spreadsheet document. */
trait SpreadsheetView
  extends XController
     with XDispatchProvider
     with XContextMenuInterception
     with XUserInputInterception
     with XSelectionSupplier
     with XTransferableSupplier
     with SpreadsheetViewSettings
     with XViewPane
     with XCellRangeReferrer
     with XControlAccess
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
    val __obj = js.Dynamic.literal(ActiveSheet = ActiveSheet.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FirstVisibleColumn = FirstVisibleColumn.asInstanceOf[js.Any], FirstVisibleRow = FirstVisibleRow.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], GridColor = GridColor.asInstanceOf[js.Any], HasColumnRowHeaders = HasColumnRowHeaders.asInstanceOf[js.Any], HasHorizontalScrollBar = HasHorizontalScrollBar.asInstanceOf[js.Any], HasSheetTabs = HasSheetTabs.asInstanceOf[js.Any], HasVerticalScrollBar = HasVerticalScrollBar.asInstanceOf[js.Any], HideSpellMarks = HideSpellMarks.asInstanceOf[js.Any], IsOutlineSymbolsSet = IsOutlineSymbolsSet.asInstanceOf[js.Any], IsValueHighlightingEnabled = IsValueHighlightingEnabled.asInstanceOf[js.Any], IsWindowSplit = IsWindowSplit.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReferredCells = ReferredCells.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], ShowAnchor = ShowAnchor.asInstanceOf[js.Any], ShowCharts = ShowCharts.asInstanceOf[js.Any], ShowDrawing = ShowDrawing.asInstanceOf[js.Any], ShowFormulas = ShowFormulas.asInstanceOf[js.Any], ShowGrid = ShowGrid.asInstanceOf[js.Any], ShowHelpLines = ShowHelpLines.asInstanceOf[js.Any], ShowNotes = ShowNotes.asInstanceOf[js.Any], ShowObjects = ShowObjects.asInstanceOf[js.Any], ShowPageBreaks = ShowPageBreaks.asInstanceOf[js.Any], ShowZeroValues = ShowZeroValues.asInstanceOf[js.Any], SplitColumn = SplitColumn.asInstanceOf[js.Any], SplitHorizontal = SplitHorizontal.asInstanceOf[js.Any], SplitRow = SplitRow.asInstanceOf[js.Any], SplitVertical = SplitVertical.asInstanceOf[js.Any], Transferable = Transferable.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], VisibleRange = VisibleRange.asInstanceOf[js.Any], ZoomType = ZoomType.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], abortRangeSelection = js.Any.fromFunction0(abortRangeSelection), acquire = js.Any.fromFunction0(acquire), addActivationEventListener = js.Any.fromFunction1(addActivationEventListener), addEnhancedMouseClickHandler = js.Any.fromFunction1(addEnhancedMouseClickHandler), addEventListener = js.Any.fromFunction1(addEventListener), addKeyHandler = js.Any.fromFunction1(addKeyHandler), addMouseClickHandler = js.Any.fromFunction1(addMouseClickHandler), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRangeSelectionChangeListener = js.Any.fromFunction1(addRangeSelectionChangeListener), addRangeSelectionListener = js.Any.fromFunction1(addRangeSelectionListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), freezeAtPosition = js.Any.fromFunction2(freezeAtPosition), getActiveSheet = js.Any.fromFunction0(getActiveSheet), getByIndex = js.Any.fromFunction1(getByIndex), getControl = js.Any.fromFunction1(getControl), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFirstVisibleColumn = js.Any.fromFunction0(getFirstVisibleColumn), getFirstVisibleRow = js.Any.fromFunction0(getFirstVisibleRow), getFrame = js.Any.fromFunction0(getFrame), getIsWindowSplit = js.Any.fromFunction0(getIsWindowSplit), getModel = js.Any.fromFunction0(getModel), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReferredCells = js.Any.fromFunction0(getReferredCells), getSelection = js.Any.fromFunction0(getSelection), getSplitColumn = js.Any.fromFunction0(getSplitColumn), getSplitHorizontal = js.Any.fromFunction0(getSplitHorizontal), getSplitRow = js.Any.fromFunction0(getSplitRow), getSplitVertical = js.Any.fromFunction0(getSplitVertical), getTransferable = js.Any.fromFunction0(getTransferable), getViewData = js.Any.fromFunction0(getViewData), getVisibleRange = js.Any.fromFunction0(getVisibleRange), hasElements = js.Any.fromFunction0(hasElements), hasFrozenPanes = js.Any.fromFunction0(hasFrozenPanes), insertTransferable = js.Any.fromFunction1(insertTransferable), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor), removeActivationEventListener = js.Any.fromFunction1(removeActivationEventListener), removeEnhancedMouseClickHandler = js.Any.fromFunction1(removeEnhancedMouseClickHandler), removeEventListener = js.Any.fromFunction1(removeEventListener), removeKeyHandler = js.Any.fromFunction1(removeKeyHandler), removeMouseClickHandler = js.Any.fromFunction1(removeMouseClickHandler), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRangeSelectionChangeListener = js.Any.fromFunction1(removeRangeSelectionChangeListener), removeRangeSelectionListener = js.Any.fromFunction1(removeRangeSelectionListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), restoreViewData = js.Any.fromFunction1(restoreViewData), select = js.Any.fromFunction1(select), setActiveSheet = js.Any.fromFunction1(setActiveSheet), setFirstVisibleColumn = js.Any.fromFunction1(setFirstVisibleColumn), setFirstVisibleRow = js.Any.fromFunction1(setFirstVisibleRow), setPropertyValue = js.Any.fromFunction2(setPropertyValue), splitAtPosition = js.Any.fromFunction2(splitAtPosition), startRangeSelection = js.Any.fromFunction1(startRangeSelection), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[SpreadsheetView]
  }
}

