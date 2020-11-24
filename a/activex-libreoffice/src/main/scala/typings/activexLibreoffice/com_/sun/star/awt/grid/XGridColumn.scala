package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.HorizontalAlignment
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XGridColumn} defines the properties and behavior of a column in a grid control.
  * @since OOo 3.3
  */
@js.native
trait XGridColumn
  extends XComponent
     with XCloneable {
  
  /** specifies the current width of the column. */
  var ColumnWidth: Double = js.native
  
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
  var DataColumnIndex: Double = js.native
  
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
  var Flexibility: Double = js.native
  
  /**
    * is the help text associated with the column.
    *
    * A grid control will usually display a column's help text as tooltip.
    */
  var HelpText: String = js.native
  
  /** Specifies the horizontal alignment of the content in the control. */
  var HorizontalAlign: HorizontalAlignment = js.native
  
  /**
    * specifies an identifier of the column
    *
    * This identifier will not be evaluated by the grid control, or its model. It is merely for clients to identify particular columns.
    */
  var Identifier: js.Any = js.native
  
  /**
    * denotes the index of the column within the grid column model it belongs to
    *
    * If the column is not yet part of a column model, `Index` is -1.
    */
  var Index: Double = js.native
  
  /** specifies the maximal width the column can have. */
  var MaxWidth: Double = js.native
  
  /** specifies the minimal width the column can have. */
  var MinWidth: Double = js.native
  
  /**
    * controls whether or not the column's width is fixed or not.
    *
    * If this is `TRUE` , the user can interactively change the column's width. Also, the column is subject to auto-resizing, if its {@link Flexibility}
    * attribute is greater `0` .
    */
  var Resizeable: Boolean = js.native
  
  /** A title is displayed in the column header row if {@link UnoControlGridModel.ShowColumnHeader()} is set to `TRUE` */
  var Title: String = js.native
  
  /**
    * Adds a listener for the {@link GridColumnEvent} posted after the grid changes.
    * @param Listener the listener to add.
    */
  def addGridColumnListener(Listener: XGridColumnListener): Unit = js.native
  
  /**
    * Removes a listener previously added with addColumnListener().
    * @param Listener the listener to remove.
    */
  def removeGridColumnListener(Listener: XGridColumnListener): Unit = js.native
}
object XGridColumn {
  
  @scala.inline
  def apply(
    ColumnWidth: Double,
    DataColumnIndex: Double,
    Flexibility: Double,
    HelpText: String,
    HorizontalAlign: HorizontalAlignment,
    Identifier: js.Any,
    Index: Double,
    MaxWidth: Double,
    MinWidth: Double,
    Resizeable: Boolean,
    Title: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addGridColumnListener: XGridColumnListener => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeGridColumnListener: XGridColumnListener => Unit
  ): XGridColumn = {
    val __obj = js.Dynamic.literal(ColumnWidth = ColumnWidth.asInstanceOf[js.Any], DataColumnIndex = DataColumnIndex.asInstanceOf[js.Any], Flexibility = Flexibility.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HorizontalAlign = HorizontalAlign.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], MaxWidth = MaxWidth.asInstanceOf[js.Any], MinWidth = MinWidth.asInstanceOf[js.Any], Resizeable = Resizeable.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addGridColumnListener = js.Any.fromFunction1(addGridColumnListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeGridColumnListener = js.Any.fromFunction1(removeGridColumnListener))
    __obj.asInstanceOf[XGridColumn]
  }
  
  @scala.inline
  implicit class XGridColumnOps[Self <: XGridColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("ColumnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataColumnIndex(value: Double): Self = this.set("DataColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexibility(value: Double): Self = this.set("Flexibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpText(value: String): Self = this.set("HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlign(value: HorizontalAlignment): Self = this.set("HorizontalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: js.Any): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("MaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("MinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeable(value: Boolean): Self = this.set("Resizeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddGridColumnListener(value: XGridColumnListener => Unit): Self = this.set("addGridColumnListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveGridColumnListener(value: XGridColumnListener => Unit): Self = this.set("removeGridColumnListener", js.Any.fromFunction1(value))
  }
}
