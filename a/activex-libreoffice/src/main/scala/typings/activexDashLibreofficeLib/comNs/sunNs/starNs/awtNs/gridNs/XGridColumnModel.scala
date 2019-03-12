package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link UnoControlGrid} to retrieve the column structure that is displayed in the actual control.
  *
  * If you do not need your own model implementation, you can also use the {@link DefaultGridColumnModel} .
  * @since OOo 3.3
  */
trait XGridColumnModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable {
  /**
    * Returns the number of columns.
    * @returns the number of columns.
    */
  val ColumnCount: scala.Double
  /**
    * Returns all columns of the model.
    * @returns all columns associated with the model in a sequence of {@link XGridColumn} .
    */
  val Columns: stdLib.SafeArray[XGridColumn]
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
  def addColumn(column: XGridColumn): scala.Double
  /**
    * creates a new column for use with the column model.
    *
    * The newly created column is not yet inserted into the column container, you need to call {@link addColumn()} after you initialized the column object.
    */
  def createColumn(): XGridColumn
  /**
    * Returns a specific column.
    * @param index the position of the requested column.
    * @returns the requested column.
    */
  def getColumn(index: scala.Double): XGridColumn
  /**
    * Returns the number of columns.
    * @returns the number of columns.
    */
  def getColumnCount(): scala.Double
  /**
    * Returns all columns of the model.
    * @returns all columns associated with the model in a sequence of {@link XGridColumn} .
    */
  def getColumns(): stdLib.SafeArray[XGridColumn]
  /**
    * removes a column from the model
    *
    * The column object will be disposed upon removal.
    * @param ColumnIndex denotes the index of the column to remove
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `ColumnIndex` does not denote a valid column index.
    */
  def removeColumn(ColumnIndex: scala.Double): scala.Unit
  /**
    * Fills the model with the given number of default columns
    *
    * Existing columns will be removed before adding new columns. Listeners at the column model will be notified one {@link
    * com.sun.star.container.XContainerListener.elementRemoved()} event for each removed column, and one {@link
    * com.sun.star.container.XContainerListener.elementInserted()} event for each insertion.
    * @param elements the number of default columns that should be set.
    */
  def setDefaultColumns(elements: scala.Double): scala.Unit
}

object XGridColumnModel {
  @scala.inline
  def apply(
    ColumnCount: scala.Double,
    Columns: stdLib.SafeArray[XGridColumn],
    acquire: () => scala.Unit,
    addColumn: XGridColumn => scala.Double,
    addContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    createClone: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable,
    createColumn: () => XGridColumn,
    dispose: () => scala.Unit,
    getColumn: scala.Double => XGridColumn,
    getColumnCount: () => scala.Double,
    getColumns: () => stdLib.SafeArray[XGridColumn],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeColumn: scala.Double => scala.Unit,
    removeContainerListener: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XContainerListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setDefaultColumns: scala.Double => scala.Unit
  ): XGridColumnModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, Columns = Columns, acquire = js.Any.fromFunction0(acquire), addColumn = js.Any.fromFunction1(addColumn), addContainerListener = js.Any.fromFunction1(addContainerListener), addEventListener = js.Any.fromFunction1(addEventListener), createClone = js.Any.fromFunction0(createClone), createColumn = js.Any.fromFunction0(createColumn), dispose = js.Any.fromFunction0(dispose), getColumn = js.Any.fromFunction1(getColumn), getColumnCount = js.Any.fromFunction0(getColumnCount), getColumns = js.Any.fromFunction0(getColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeColumn = js.Any.fromFunction1(removeColumn), removeContainerListener = js.Any.fromFunction1(removeContainerListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setDefaultColumns = js.Any.fromFunction1(setDefaultColumns))
  
    __obj.asInstanceOf[XGridColumnModel]
  }
}

