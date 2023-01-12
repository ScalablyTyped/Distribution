package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a collection of filter conditions (filter fields).
  * @see SheetFilterDescriptor
  */
trait XSheetFilterDescriptor
  extends StObject
     with XInterface {
  
  /** returns the collection of filter fields. */
  var FilterFields: SafeArray[TableFilterField]
  
  /** returns the collection of filter fields. */
  def getFilterFields(): SafeArray[TableFilterField]
  
  /** sets a new collection of filter fields. */
  def setFilterFields(aFilterFields: SeqEquiv[TableFilterField]): Unit
}
object XSheetFilterDescriptor {
  
  inline def apply(
    FilterFields: SafeArray[TableFilterField],
    acquire: () => Unit,
    getFilterFields: () => SafeArray[TableFilterField],
    queryInterface: `type` => Any,
    release: () => Unit,
    setFilterFields: SeqEquiv[TableFilterField] => Unit
  ): XSheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(FilterFields = FilterFields.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilterFields = js.Any.fromFunction0(getFilterFields), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields = js.Any.fromFunction1(setFilterFields))
    __obj.asInstanceOf[XSheetFilterDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSheetFilterDescriptor] (val x: Self) extends AnyVal {
    
    inline def setFilterFields(value: SafeArray[TableFilterField]): Self = StObject.set(x, "FilterFields", value.asInstanceOf[js.Any])
    
    inline def setGetFilterFields(value: () => SafeArray[TableFilterField]): Self = StObject.set(x, "getFilterFields", js.Any.fromFunction0(value))
    
    inline def setSetFilterFields(value: SeqEquiv[TableFilterField] => Unit): Self = StObject.set(x, "setFilterFields", js.Any.fromFunction1(value))
  }
}
