package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link UnoControlGrid} to retrieve the column structure that is displayed in the actual control.
  *
  * If you do not need your own model implementation, you can also use the {@link DefaultGridColumnModel} .
  * @since OOo 3.3
  */
@js.native
trait XGridColumnModel
  extends XComponent
     with XContainer
     with XCloneable {
  /**
    * Returns the number of columns.
    * @returns the number of columns.
    */
  val ColumnCount: Double = js.native
  /**
    * Returns all columns of the model.
    * @returns all columns associated with the model in a sequence of {@link XGridColumn} .
    */
  val Columns: SafeArray[XGridColumn] = js.native
  /**
    * Adds a column to the model.
    *
    * You should use the {@link createColumn()} member to create a new column. This gives implementations of the `XGridColumnModel` interface the
    * possibility to provide own column implementations which extend the basic {@link GridColumn} type.
    *
    * As soon as the column has been inserted into the model, the model takes ownership of it. This means when the column is removed, or when the column
    * model is disposed, the grid column is disposed as well.
    * @param column the column to add to the model.
    * @returns the index of new created column.
    * @throws com::sun::star::lang::IllegalArgumentException if the given column is not a valid element for the column container, or if it is `NULL` .
    */
  def addColumn(column: XGridColumn): Double = js.native
  /**
    * creates a new column for use with the column model.
    *
    * The newly created column is not yet inserted into the column container, you need to call {@link addColumn()} after you initialized the column object.
    */
  def createColumn(): XGridColumn = js.native
  /**
    * Returns a specific column.
    * @param index the position of the requested column.
    * @returns the requested column.
    */
  def getColumn(index: Double): XGridColumn = js.native
  /**
    * Returns the number of columns.
    * @returns the number of columns.
    */
  def getColumnCount(): Double = js.native
  /**
    * Returns all columns of the model.
    * @returns all columns associated with the model in a sequence of {@link XGridColumn} .
    */
  def getColumns(): SafeArray[XGridColumn] = js.native
  /**
    * removes a column from the model
    *
    * The column object will be disposed upon removal.
    * @param ColumnIndex denotes the index of the column to remove
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `ColumnIndex` does not denote a valid column index.
    */
  def removeColumn(ColumnIndex: Double): Unit = js.native
  /**
    * Fills the model with the given number of default columns
    *
    * Existing columns will be removed before adding new columns. Listeners at the column model will be notified one {@link
    * com.sun.star.container.XContainerListener.elementRemoved()} event for each removed column, and one {@link
    * com.sun.star.container.XContainerListener.elementInserted()} event for each insertion.
    * @param elements the number of default columns that should be set.
    */
  def setDefaultColumns(elements: Double): Unit = js.native
}

object XGridColumnModel {
  @scala.inline
  def apply(
    ColumnCount: Double,
    Columns: SafeArray[XGridColumn],
    acquire: () => Unit,
    addColumn: XGridColumn => Double,
    addContainerListener: XContainerListener => Unit,
    addEventListener: XEventListener => Unit,
    createClone: () => XCloneable,
    createColumn: () => XGridColumn,
    dispose: () => Unit,
    getColumn: Double => XGridColumn,
    getColumnCount: () => Double,
    getColumns: () => SafeArray[XGridColumn],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeColumn: Double => Unit,
    removeContainerListener: XContainerListener => Unit,
    removeEventListener: XEventListener => Unit,
    setDefaultColumns: Double => Unit
  ): XGridColumnModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addColumn = js.Any.fromFunction1(addColumn), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), createClone = js.Any.fromFunction0(createClone), createColumn = js.Any.fromFunction0(createColumn), dispose = js.Any.fromFunction0(dispose), getColumn = js.Any.fromFunction1(getColumn), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumns = js.Any.fromFunction0(getColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeColumn = js.Any.fromFunction1(removeColumn), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setDefaultColumns = js.Any.fromFunction1(setDefaultColumns))
    __obj.asInstanceOf[XGridColumnModel]
  }
  @scala.inline
  implicit class XGridColumnModelOps[Self <: XGridColumnModel] (val x: Self) extends AnyVal {
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
    def setColumnCount(value: Double): Self = this.set("ColumnCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumns(value: SafeArray[XGridColumn]): Self = this.set("Columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddColumn(value: XGridColumn => Double): Self = this.set("addColumn", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateColumn(value: () => XGridColumn): Self = this.set("createColumn", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColumn(value: Double => XGridColumn): Self = this.set("getColumn", js.Any.fromFunction1(value))
    @scala.inline
    def setGetColumnCount(value: () => Double): Self = this.set("getColumnCount", js.Any.fromFunction0(value))
    @scala.inline
    def setGetColumns(value: () => SafeArray[XGridColumn]): Self = this.set("getColumns", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveColumn(value: Double => Unit): Self = this.set("removeColumn", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDefaultColumns(value: Double => Unit): Self = this.set("setDefaultColumns", js.Any.fromFunction1(value))
  }
  
}

