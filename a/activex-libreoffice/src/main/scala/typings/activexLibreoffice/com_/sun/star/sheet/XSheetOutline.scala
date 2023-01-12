package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.table.TableOrientation
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods to access the outlines of a sheet. */
trait XSheetOutline
  extends StObject
     with XInterface {
  
  /**
    * creates outline groups from formula references in a range.
    * @param aRange the cell range for which outlines are generated.
    */
  def autoOutline(aRange: CellRangeAddress): Unit
  
  /** removes all outline groups from the sheet. */
  def clearOutline(): Unit
  
  /**
    * creates an outline group.
    * @param aRange contains the range of rows or columns, depending on the parameter nOrientation.
    * @param nOrientation the orientation of the new outline (columns or rows).
    */
  def group(aRange: CellRangeAddress, nOrientation: TableOrientation): Unit
  
  /**
    * collapses an outline group.
    * @param aRange the cell range for which the outlines are collapsed.
    */
  def hideDetail(aRange: CellRangeAddress): Unit
  
  /**
    * reopens an outline group.
    * @param aRange the cell range for which the outlines are reopened.
    */
  def showDetail(aRange: CellRangeAddress): Unit
  
  /**
    * shows all outlined groups below a specific level.
    * @param nLevel all outline levels from 1 to this value will be opened and the higher levels will be closed.
    * @param nOrientation the orientation of the outlines (columns or rows).
    */
  def showLevel(nLevel: Double, nOrientation: TableOrientation): Unit
  
  /**
    * removes outline groups.
    *
    * In the specified range, all outline groups on the innermost level are removed.
    * @param aRange contains the range of rows or columns, depending on the parameter nOrientation.
    * @param nOrientation the orientation of the outlines to remove (columns or rows).
    */
  def ungroup(aRange: CellRangeAddress, nOrientation: TableOrientation): Unit
}
object XSheetOutline {
  
  inline def apply(
    acquire: () => Unit,
    autoOutline: CellRangeAddress => Unit,
    clearOutline: () => Unit,
    group: (CellRangeAddress, TableOrientation) => Unit,
    hideDetail: CellRangeAddress => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    showDetail: CellRangeAddress => Unit,
    showLevel: (Double, TableOrientation) => Unit,
    ungroup: (CellRangeAddress, TableOrientation) => Unit
  ): XSheetOutline = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), autoOutline = js.Any.fromFunction1(autoOutline), clearOutline = js.Any.fromFunction0(clearOutline), group = js.Any.fromFunction2(group), hideDetail = js.Any.fromFunction1(hideDetail), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showDetail = js.Any.fromFunction1(showDetail), showLevel = js.Any.fromFunction2(showLevel), ungroup = js.Any.fromFunction2(ungroup))
    __obj.asInstanceOf[XSheetOutline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSheetOutline] (val x: Self) extends AnyVal {
    
    inline def setAutoOutline(value: CellRangeAddress => Unit): Self = StObject.set(x, "autoOutline", js.Any.fromFunction1(value))
    
    inline def setClearOutline(value: () => Unit): Self = StObject.set(x, "clearOutline", js.Any.fromFunction0(value))
    
    inline def setGroup(value: (CellRangeAddress, TableOrientation) => Unit): Self = StObject.set(x, "group", js.Any.fromFunction2(value))
    
    inline def setHideDetail(value: CellRangeAddress => Unit): Self = StObject.set(x, "hideDetail", js.Any.fromFunction1(value))
    
    inline def setShowDetail(value: CellRangeAddress => Unit): Self = StObject.set(x, "showDetail", js.Any.fromFunction1(value))
    
    inline def setShowLevel(value: (Double, TableOrientation) => Unit): Self = StObject.set(x, "showLevel", js.Any.fromFunction2(value))
    
    inline def setUngroup(value: (CellRangeAddress, TableOrientation) => Unit): Self = StObject.set(x, "ungroup", js.Any.fromFunction2(value))
  }
}
