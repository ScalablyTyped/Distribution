package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link XGridColumn} defines the properties and behavior of a column in a grid control.
  * @since OOo 3.3
  */
trait XGridColumn
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable {
  /** specifies the current width of the column. */
  var ColumnWidth: scala.Double
  /**
    * denotes the index of the data column which should be used to fetch this grid column's data
    *
    * A grid control has a column model and a data model, both containing a possibly different number of columns. The `DataColumnIndex` attribute defines
    * the index of the column within the data model, which should be used to retrieve actual data.
    *
    * Using this, you can do runtime changes to the column model, i.e. insertion and removal of columns, without necessarily needing to adjust the data
    * model, too.
    *
    * If `DataColumnIndex` is negative, the it will be ignored, then the column's index within its column model, as determined by the {@link Index}
    * attribute, will be used.
    */
  var DataColumnIndex: scala.Double
  /**
    * specifies the flexibility of the column when it is automatically resized due to the grid control as a whole being resized.
    *
    * Specify `0` here if you do not want the column to be resized automatically.
    *
    * If a column has a flexibility greater than 0, it is set in relationship to the flexibility of all other such columns, and the respective widths of the
    * columns are changed in the same relationship.
    *
    * Note that a column's flexibility is ignored if its {@link Resizeable} attribute is `FALSE` .
    *
    * A column's flexibility cannot be negative, attempts to set a negative value will raise an exception.
    */
  var Flexibility: scala.Double
  /**
    * is the help text associated with the column.
    *
    * A grid control will usually display a column's help text as tooltip.
    */
  var HelpText: java.lang.String
  /** Specifies the horizontal alignment of the content in the control. */
  var HorizontalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.HorizontalAlignment
  /**
    * specifies an identifier of the column
    *
    * This identifier will not be evaluated by the grid control, or its model. It is merely for clients to identify particular columns.
    */
  var Identifier: js.Any
  /**
    * denotes the index of the column within the grid column model it belongs to
    *
    * If the column is not yet part of a column model, `Index` is -1.
    */
  var Index: scala.Double
  /** specifies the maximal width the column can have. */
  var MaxWidth: scala.Double
  /** specifies the minimal width the column can have. */
  var MinWidth: scala.Double
  /**
    * controls whether or not the column's width is fixed or not.
    *
    * If this is `TRUE` , the user can interactively change the column's width. Also, the column is subject to auto-resizing, if its {@link Flexibility}
    * attribute is greater `0` .
    */
  var Resizeable: scala.Boolean
  /** A title is displayed in the column header row if {@link UnoControlGridModel.ShowColumnHeader()} is set to `TRUE` */
  var Title: java.lang.String
  /**
    * Adds a listener for the {@link GridColumnEvent} posted after the grid changes.
    * @param Listener the listener to add.
    */
  def addGridColumnListener(Listener: XGridColumnListener): scala.Unit
  /**
    * Removes a listener previously added with addColumnListener().
    * @param Listener the listener to remove.
    */
  def removeGridColumnListener(Listener: XGridColumnListener): scala.Unit
}

object XGridColumn {
  @scala.inline
  def apply(
    ColumnWidth: scala.Double,
    DataColumnIndex: scala.Double,
    Flexibility: scala.Double,
    HelpText: java.lang.String,
    HorizontalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.HorizontalAlignment,
    Identifier: js.Any,
    Index: scala.Double,
    MaxWidth: scala.Double,
    MinWidth: scala.Double,
    Resizeable: scala.Boolean,
    Title: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addGridColumnListener: js.Function1[XGridColumnListener, scala.Unit],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    dispose: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeGridColumnListener: js.Function1[XGridColumnListener, scala.Unit]
  ): XGridColumn = {
    val __obj = js.Dynamic.literal(ColumnWidth = ColumnWidth, DataColumnIndex = DataColumnIndex, Flexibility = Flexibility, HelpText = HelpText, HorizontalAlign = HorizontalAlign, Identifier = Identifier, Index = Index, MaxWidth = MaxWidth, MinWidth = MinWidth, Resizeable = Resizeable, Title = Title, acquire = acquire, addEventListener = addEventListener, addGridColumnListener = addGridColumnListener, createClone = createClone, dispose = dispose, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeGridColumnListener = removeGridColumnListener)
  
    __obj.asInstanceOf[XGridColumn]
  }
}

