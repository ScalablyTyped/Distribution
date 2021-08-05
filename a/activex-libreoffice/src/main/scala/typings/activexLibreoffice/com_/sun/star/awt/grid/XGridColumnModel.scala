package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XContainer
import typings.activexLibreoffice.com_.sun.star.container.XContainerListener
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of this interface is used by the {@link UnoControlGrid} to retrieve the column structure that is displayed in the actual control.
  *
  * If you do not need your own model implementation, you can also use the {@link DefaultGridColumnModel} .
  * @since OOo 3.3
  */
trait XGridColumnModel
  extends StObject
     with XComponent
     with XContainer
     with XCloneable {
  
  /**
    * Returns the number of columns.
    * @returns the number of columns.
    */
  val ColumnCount: Double
  
  /**
    * Returns all columns of the model.
    * @returns all columns associated with the model in a sequence of {@link XGridColumn} .
    */
  val Columns: SafeArray[XGridColumn]
  
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
  def addColumn(column: XGridColumn): Double
  
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
  def getColumn(index: Double): XGridColumn
  
  /**
    * Returns the number of columns.
    * @returns the number of columns.
    */
  def getColumnCount(): Double
  
  /**
    * Returns all columns of the model.
    * @returns all columns associated with the model in a sequence of {@link XGridColumn} .
    */
  def getColumns(): SafeArray[XGridColumn]
  
  /**
    * removes a column from the model
    *
    * The column object will be disposed upon removal.
    * @param ColumnIndex denotes the index of the column to remove
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `ColumnIndex` does not denote a valid column index.
    */
  def removeColumn(ColumnIndex: Double): Unit
  
  /**
    * Fills the model with the given number of default columns
    *
    * Existing columns will be removed before adding new columns. Listeners at the column model will be notified one {@link
    * com.sun.star.container.XContainerListener.elementRemoved()} event for each removed column, and one {@link
    * com.sun.star.container.XContainerListener.elementInserted()} event for each insertion.
    * @param elements the number of default columns that should be set.
    */
  def setDefaultColumns(elements: Double): Unit
}
object XGridColumnModel {
  
  inline def apply(
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
  
  extension [Self <: XGridColumnModel](x: Self) {
    
    inline def setAddColumn(value: XGridColumn => Double): Self = StObject.set(x, "addColumn", js.Any.fromFunction1(value))
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "ColumnCount", value.asInstanceOf[js.Any])
    
    inline def setColumns(value: SafeArray[XGridColumn]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
    
    inline def setCreateColumn(value: () => XGridColumn): Self = StObject.set(x, "createColumn", js.Any.fromFunction0(value))
    
    inline def setGetColumn(value: Double => XGridColumn): Self = StObject.set(x, "getColumn", js.Any.fromFunction1(value))
    
    inline def setGetColumnCount(value: () => Double): Self = StObject.set(x, "getColumnCount", js.Any.fromFunction0(value))
    
    inline def setGetColumns(value: () => SafeArray[XGridColumn]): Self = StObject.set(x, "getColumns", js.Any.fromFunction0(value))
    
    inline def setRemoveColumn(value: Double => Unit): Self = StObject.set(x, "removeColumn", js.Any.fromFunction1(value))
    
    inline def setSetDefaultColumns(value: Double => Unit): Self = StObject.set(x, "setDefaultColumns", js.Any.fromFunction1(value))
  }
}
