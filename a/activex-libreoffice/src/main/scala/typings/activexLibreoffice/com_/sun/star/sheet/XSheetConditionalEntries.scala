package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to add and remove conditions of a conditional format.
  * @see com.sun.star.sheet.TableConditionalFormat
  * @see com.sun.star.sheet.TableConditionalEntry
  */
@js.native
trait XSheetConditionalEntries extends XIndexAccess {
  
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
  def addNew(aConditionalEntry: SeqEquiv[PropertyValue]): Unit = js.native
  
  /** clears all condition entries. */
  def clear(): Unit = js.native
  
  /** removes a conditional entry from the format. */
  def removeByIndex(nIndex: Double): Unit = js.native
}
object XSheetConditionalEntries {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    addNew: SeqEquiv[PropertyValue] => Unit,
    clear: () => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByIndex: Double => Unit
  ): XSheetConditionalEntries = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addNew = js.Any.fromFunction1(addNew), clear = js.Any.fromFunction0(clear), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByIndex = js.Any.fromFunction1(removeByIndex))
    __obj.asInstanceOf[XSheetConditionalEntries]
  }
  
  @scala.inline
  implicit class XSheetConditionalEntriesOps[Self <: XSheetConditionalEntries] (val x: Self) extends AnyVal {
    
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
    def setAddNew(value: SeqEquiv[PropertyValue] => Unit): Self = this.set("addNew", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveByIndex(value: Double => Unit): Self = this.set("removeByIndex", js.Any.fromFunction1(value))
  }
}
