package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.com_.sun.star.beans.Pair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to sort the data represented by a {@link XGridDataModel} */
trait XSortableGridData extends StObject {
  
  /**
    * returns the current sort order.
    * @returns a structure describing the current sort order. com::sun::star::beans::Pair::First denotes the column by which the data is sorted, or -1 if the da
    */
  val CurrentSortOrder: Pair[Double, Boolean]
  
  /**
    * returns the current sort order.
    * @returns a structure describing the current sort order. com::sun::star::beans::Pair::First denotes the column by which the data is sorted, or -1 if the da
    */
  def getCurrentSortOrder(): Pair[Double, Boolean]
  
  /** removes any possibly present sorting of the grid data */
  def removeColumnSort(): Unit
  
  /**
    * sorts the rows represented by the model by a given column's data.
    * @param ColumnIndex the index of the column whose data should be used as sort key
    * @param SortAscending is `TRUE` if the data should be sorted ascending, `FALSE` otherwise.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `ColumnIndex` does not denote a valid column.
    */
  def sortByColumn(ColumnIndex: Double, SortAscending: Boolean): Unit
}
object XSortableGridData {
  
  inline def apply(
    CurrentSortOrder: Pair[Double, Boolean],
    getCurrentSortOrder: () => Pair[Double, Boolean],
    removeColumnSort: () => Unit,
    sortByColumn: (Double, Boolean) => Unit
  ): XSortableGridData = {
    val __obj = js.Dynamic.literal(CurrentSortOrder = CurrentSortOrder.asInstanceOf[js.Any], getCurrentSortOrder = js.Any.fromFunction0(getCurrentSortOrder), removeColumnSort = js.Any.fromFunction0(removeColumnSort), sortByColumn = js.Any.fromFunction2(sortByColumn))
    __obj.asInstanceOf[XSortableGridData]
  }
  
  extension [Self <: XSortableGridData](x: Self) {
    
    inline def setCurrentSortOrder(value: Pair[Double, Boolean]): Self = StObject.set(x, "CurrentSortOrder", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentSortOrder(value: () => Pair[Double, Boolean]): Self = StObject.set(x, "getCurrentSortOrder", js.Any.fromFunction0(value))
    
    inline def setRemoveColumnSort(value: () => Unit): Self = StObject.set(x, "removeColumnSort", js.Any.fromFunction0(value))
    
    inline def setSortByColumn(value: (Double, Boolean) => Unit): Self = StObject.set(x, "sortByColumn", js.Any.fromFunction2(value))
  }
}
