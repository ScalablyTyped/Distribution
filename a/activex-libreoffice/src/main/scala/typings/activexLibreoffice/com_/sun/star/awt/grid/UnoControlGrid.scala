package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.UnoControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typings.activexLibreoffice.com_.sun.star.awt.XGraphics
import typings.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typings.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typings.activexLibreoffice.com_.sun.star.awt.XToolkit
import typings.activexLibreoffice.com_.sun.star.awt.XView
import typings.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typings.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait UnoControlGrid
  extends UnoControl
     with XGridControl
     with XGridRowSelection
object UnoControlGrid {
  
  @scala.inline
  def apply(
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    CurrentColumn: Double,
    CurrentRow: Double,
    Graphics: XGraphics,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    SelectedRows: SafeArray[Double],
    Size: Size,
    View: XView,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addSelectionListener: XGridSelectionListener => Unit,
    addWindowListener: XWindowListener => Unit,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    deselectAllRows: () => Unit,
    deselectRow: Double => Unit,
    dispose: () => Unit,
    draw: (Double, Double) => Unit,
    getAccessibleContext: () => XAccessibleContext,
    getColumnAtPoint: (Double, Double) => Double,
    getContext: () => XInterface,
    getCurrentColumn: () => Double,
    getCurrentRow: () => Double,
    getGraphics: () => XGraphics,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getRowAtPoint: (Double, Double) => Double,
    getSelectedRows: () => SafeArray[Double],
    getSize: () => Size,
    getView: () => XView,
    goToCell: (Double, Double) => Unit,
    hasSelectedRows: () => Boolean,
    isDesignMode: () => Boolean,
    isRowSelected: Double => Boolean,
    isTransparent: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeSelectionListener: XGridSelectionListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    selectAllRows: () => Unit,
    selectRow: Double => Unit,
    setContext: XInterface => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setGraphics: XGraphics => Boolean,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setVisible: Boolean => Unit,
    setZoom: (Double, Double) => Unit
  ): UnoControlGrid = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], CurrentColumn = CurrentColumn.asInstanceOf[js.Any], CurrentRow = CurrentRow.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], SelectedRows = SelectedRows.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addSelectionListener = js.Any.fromFunction1(addSelectionListener), addWindowListener = js.Any.fromFunction1(addWindowListener), createPeer = js.Any.fromFunction2(createPeer), deselectAllRows = js.Any.fromFunction0(deselectAllRows), deselectRow = js.Any.fromFunction1(deselectRow), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getColumnAtPoint = js.Any.fromFunction2(getColumnAtPoint), getContext = js.Any.fromFunction0(getContext), getCurrentColumn = js.Any.fromFunction0(getCurrentColumn), getCurrentRow = js.Any.fromFunction0(getCurrentRow), getGraphics = js.Any.fromFunction0(getGraphics), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getRowAtPoint = js.Any.fromFunction2(getRowAtPoint), getSelectedRows = js.Any.fromFunction0(getSelectedRows), getSize = js.Any.fromFunction0(getSize), getView = js.Any.fromFunction0(getView), goToCell = js.Any.fromFunction2(goToCell), hasSelectedRows = js.Any.fromFunction0(hasSelectedRows), isDesignMode = js.Any.fromFunction0(isDesignMode), isRowSelected = js.Any.fromFunction1(isRowSelected), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeSelectionListener = js.Any.fromFunction1(removeSelectionListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), selectAllRows = js.Any.fromFunction0(selectAllRows), selectRow = js.Any.fromFunction1(selectRow), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
    __obj.asInstanceOf[UnoControlGrid]
  }
}
