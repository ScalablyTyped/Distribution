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
    SelectedRows: activexDashInteropLib.SafeArray[scala.Double],
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    addKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    addMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    addPaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    addSelectionListener: js.Function1[XGridSelectionListener, scala.Unit],
    addWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    createPeer: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer, 
      scala.Unit
    ],
    deselectAllRows: js.Function0[scala.Unit],
    deselectRow: js.Function1[scala.Double, scala.Unit],
    dispose: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getColumnAtPoint: js.Function2[scala.Double, scala.Double, scala.Double],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getCurrentColumn: js.Function0[scala.Double],
    getCurrentRow: js.Function0[scala.Double],
    getGraphics: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel],
    getPeer: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer],
    getPosSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getRowAtPoint: js.Function2[scala.Double, scala.Double, scala.Double],
    getSelectedRows: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getView: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView],
    goToCell: js.Function2[scala.Double, scala.Double, scala.Unit],
    hasSelectedRows: js.Function0[scala.Boolean],
    isDesignMode: js.Function0[scala.Boolean],
    isRowSelected: js.Function1[scala.Double, scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    removeKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    removeMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    removePaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    removeSelectionListener: js.Function1[XGridSelectionListener, scala.Unit],
    removeWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    selectAllRows: js.Function0[scala.Unit],
    selectRow: js.Function1[scala.Double, scala.Unit],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics, scala.Boolean],
    setModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, scala.Boolean],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit]
  ): UnoControlGrid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleContext")(AccessibleContext)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("CurrentColumn")(CurrentColumn)
    __obj.updateDynamic("CurrentRow")(CurrentRow)
    __obj.updateDynamic("Graphics")(Graphics)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Peer")(Peer)
    __obj.updateDynamic("PosSize")(PosSize)
    __obj.updateDynamic("SelectedRows")(SelectedRows)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("View")(View)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFocusListener")(addFocusListener)
    __obj.updateDynamic("addKeyListener")(addKeyListener)
    __obj.updateDynamic("addMouseListener")(addMouseListener)
    __obj.updateDynamic("addMouseMotionListener")(addMouseMotionListener)
    __obj.updateDynamic("addPaintListener")(addPaintListener)
    __obj.updateDynamic("addSelectionListener")(addSelectionListener)
    __obj.updateDynamic("addWindowListener")(addWindowListener)
    __obj.updateDynamic("createPeer")(createPeer)
    __obj.updateDynamic("deselectAllRows")(deselectAllRows)
    __obj.updateDynamic("deselectRow")(deselectRow)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("getAccessibleContext")(getAccessibleContext)
    __obj.updateDynamic("getColumnAtPoint")(getColumnAtPoint)
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getCurrentColumn")(getCurrentColumn)
    __obj.updateDynamic("getCurrentRow")(getCurrentRow)
    __obj.updateDynamic("getGraphics")(getGraphics)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getPeer")(getPeer)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("getRowAtPoint")(getRowAtPoint)
    __obj.updateDynamic("getSelectedRows")(getSelectedRows)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("goToCell")(goToCell)
    __obj.updateDynamic("hasSelectedRows")(hasSelectedRows)
    __obj.updateDynamic("isDesignMode")(isDesignMode)
    __obj.updateDynamic("isRowSelected")(isRowSelected)
    __obj.updateDynamic("isTransparent")(isTransparent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFocusListener")(removeFocusListener)
    __obj.updateDynamic("removeKeyListener")(removeKeyListener)
    __obj.updateDynamic("removeMouseListener")(removeMouseListener)
    __obj.updateDynamic("removeMouseMotionListener")(removeMouseMotionListener)
    __obj.updateDynamic("removePaintListener")(removePaintListener)
    __obj.updateDynamic("removeSelectionListener")(removeSelectionListener)
    __obj.updateDynamic("removeWindowListener")(removeWindowListener)
    __obj.updateDynamic("selectAllRows")(selectAllRows)
    __obj.updateDynamic("selectRow")(selectRow)
    __obj.updateDynamic("setContext")(setContext)
    __obj.updateDynamic("setDesignMode")(setDesignMode)
    __obj.updateDynamic("setEnable")(setEnable)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setGraphics")(setGraphics)
    __obj.updateDynamic("setModel")(setModel)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setZoom")(setZoom)
    __obj.asInstanceOf[UnoControlGrid]
  }
}

