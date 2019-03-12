package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A control that displays a set of tabular data.
  *
  * **The Column Model**
  *
  * The horizontal structure of the grid is defined by the {@link XGridColumnModel} implemented in {@link DefaultGridColumnModel} The {@link XGridColumn}
  * implemented in {@link GridColumn} describes the properties and behavior of a single column. Use the {@link XGridColumnModel.addColumn()} to add a
  * column to the column model.
  *
  * **The Data Model**
  *
  * All row data are stored in the {@link XGridDataModel} . Use the {@link DefaultGridDataModel} to add XGridDataModel::addRow() or remove
  * XGridDataModel::removeRow() rows.
  *
  * The column and data model must be set at the {@link UnoControlGridModel.ColumnModel} and {@link UnoControlGridModel.GridDataModel} properties.
  *
  * **{@link Selection}**
  *
  * If you are interested in knowing when the selection changes implement a {@link XGridSelectionListener} and add the instance with the method {@link
  * XGridRowSelection.addSelectionListener()} . You than will be notified for any selection change.
  * @since OOo 3.3
  */
trait UnoControlGrid
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControl
     with XGridControl
     with XGridRowSelection

object UnoControlGrid {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    CurrentColumn: scala.Double,
    CurrentRow: scala.Double,
    Graphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Peer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    SelectedRows: stdLib.SafeArray[scala.Double],
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    addKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    addMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    addMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    addPaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    addSelectionListener: XGridSelectionListener => scala.Unit,
    addWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    createPeer: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer) => scala.Unit,
    deselectAllRows: () => scala.Unit,
    deselectRow: scala.Double => scala.Unit,
    dispose: () => scala.Unit,
    draw: (scala.Double, scala.Double) => scala.Unit,
    getAccessibleContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    getColumnAtPoint: (scala.Double, scala.Double) => scala.Double,
    getContext: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getCurrentColumn: () => scala.Double,
    getCurrentRow: () => scala.Double,
    getGraphics: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    getPeer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    getPosSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    getRowAtPoint: (scala.Double, scala.Double) => scala.Double,
    getSelectedRows: () => stdLib.SafeArray[scala.Double],
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    getView: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    goToCell: (scala.Double, scala.Double) => scala.Unit,
    hasSelectedRows: () => scala.Boolean,
    isDesignMode: () => scala.Boolean,
    isRowSelected: scala.Double => scala.Boolean,
    isTransparent: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFocusListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener => scala.Unit,
    removeKeyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener => scala.Unit,
    removeMouseListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener => scala.Unit,
    removeMouseMotionListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener => scala.Unit,
    removePaintListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener => scala.Unit,
    removeSelectionListener: XGridSelectionListener => scala.Unit,
    removeWindowListener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener => scala.Unit,
    selectAllRows: () => scala.Unit,
    selectRow: scala.Double => scala.Unit,
    setContext: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setEnable: scala.Boolean => scala.Unit,
    setFocus: () => scala.Unit,
    setGraphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics => scala.Boolean,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => scala.Boolean,
    setPosSize: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => scala.Unit,
    setVisible: scala.Boolean => scala.Unit,
    setZoom: (scala.Double, scala.Double) => scala.Unit
  ): UnoControlGrid = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext, Context = Context, CurrentColumn = CurrentColumn, CurrentRow = CurrentRow, Graphics = Graphics, Model = Model, Peer = Peer, PosSize = PosSize, SelectedRows = SelectedRows, Size = Size, View = View, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addSelectionListener = js.Any.fromFunction1(addSelectionListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), deselectAllRows = js.Any.fromFunction0(deselectAllRows), deselectRow = js.Any.fromFunction1(deselectRow), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getColumnAtPoint = js.Any.fromFunction2(getColumnAtPoint), getContext = js.Any.fromFunction0(getContext), getCurrentColumn = js.Any.fromFunction0(getCurrentColumn), getCurrentRow = js.Any.fromFunction0(getCurrentRow), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getRowAtPoint = js.Any.fromFunction2(getRowAtPoint), getSelectedRows = js.Any.fromFunction0(getSelectedRows), getSize = js.Any.fromFunction0(getSize), getView = js.Any.fromFunction0(getView), goToCell = js.Any.fromFunction2(goToCell), hasSelectedRows = js.Any.fromFunction0(hasSelectedRows), isDesignMode = js.Any.fromFunction0(isDesignMode), isRowSelected = js.Any.fromFunction1(isRowSelected), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeSelectionListener = js.Any.fromFunction1(removeSelectionListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), selectAllRows = js.Any.fromFunction0(selectAllRows), selectRow = js.Any.fromFunction1(selectRow), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
  
    __obj.asInstanceOf[UnoControlGrid]
  }
}

