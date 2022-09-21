package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to add and remove conditions of a conditional format.
  * @see com.sun.star.sheet.TableConditionalFormat
  * @see com.sun.star.sheet.TableConditionalEntry
  */
trait XSheetConditionalEntries
  extends StObject
     with XIndexAccess {
  
  /**
    * adds a conditional entry to the format.
    *
    * Supported properties are:
    *
    * **ConditionOperator Operator **: contains the operation to perform for this condition.;
    *
    * **string Formula1 **: contains the value or formula for the operation.;
    *
    * **string Formula2 **: contains the second value or formula for the operation (used with ConditionOperator::BETWEEN or ConditionOperator::NOT_BETWEEN
    * operations).;
    *
    * **com::sun::star::table::CellAddress SourcePosition **: contains the base address for relative cell references in formulas.;
    *
    * **string StyleName **: contains the name of the cell style used by this condition.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  def addNew(aConditionalEntry: SeqEquiv[PropertyValue]): Unit
  
  /** clears all condition entries. */
  def clear(): Unit
  
  /** removes a conditional entry from the format. */
  def removeByIndex(nIndex: Double): Unit
}
object XSheetConditionalEntries {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    addNew: SeqEquiv[PropertyValue] => Unit,
    clear: () => Unit,
    getByIndex: Double => Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): XSheetConditionalEntries = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction1(addNew), clear = js.Any.fromFunction0(clear), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
    __obj.asInstanceOf[XSheetConditionalEntries]
  }
  
  extension [Self <: XSheetConditionalEntries](x: Self) {
    
    inline def setAddNew(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "addNew", js.Any.fromFunction1(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setRemoveByIndex(value: Double => Unit): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1(value))
  }
}
