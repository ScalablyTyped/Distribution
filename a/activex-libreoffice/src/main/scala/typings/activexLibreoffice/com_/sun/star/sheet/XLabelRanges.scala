package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the members of a label range collection and to insert and remove them.
  * @see com.sun.star.sheet.LabelRanges
  * @see com.sun.star.sheet.LabelRange
  */
trait XLabelRanges
  extends StObject
     with XIndexAccess {
  
  /**
    * adds a new label range to the collection.
    * @param aLabelArea the cell range containing the titles of the label range.
    * @param aDataArea the cell range containing the values of the label range.
    */
  def addNew(aLabelArea: CellRangeAddress, aDataArea: CellRangeAddress): Unit
  
  /** removes a label range from the collection. */
  def removeByIndex(nIndex: Double): Unit
}
object XLabelRanges {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    addNew: (CellRangeAddress, CellRangeAddress) => Unit,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): XLabelRanges = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction2(addNew), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
    __obj.asInstanceOf[XLabelRanges]
  }
  
  extension [Self <: XLabelRanges](x: Self) {
    
    inline def setAddNew(value: (CellRangeAddress, CellRangeAddress) => Unit): Self = StObject.set(x, "addNew", js.Any.fromFunction2(value))
    
    inline def setRemoveByIndex(value: Double => Unit): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1(value))
  }
}
