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
  *
  * This interface uses the {@link TableFilterField3} struct. whereas the {@link XSheetFilterDescriptor2} interface uses the {@link TableFilterField2}
  * struct.
  * @see SheetFilterDescriptor2
  * @since LibreOffice 3.5
  */
trait XSheetFilterDescriptor3
  extends StObject
     with XInterface {
  
  /** returns the collection of filter fields. */
  var FilterFields3: SafeArray[TableFilterField3]
  
  /** returns the collection of filter fields. */
  def getFilterFields3(): SafeArray[TableFilterField3]
  
  /** sets a new collection of filter fields. */
  def setFilterFields3(aFilterFields: SeqEquiv[TableFilterField3]): Unit
}
object XSheetFilterDescriptor3 {
  
  @scala.inline
  def apply(
    FilterFields3: SafeArray[TableFilterField3],
    acquire: () => Unit,
    getFilterFields3: () => SafeArray[TableFilterField3],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFilterFields3: SeqEquiv[TableFilterField3] => Unit
  ): XSheetFilterDescriptor3 = {
    val __obj = js.Dynamic.literal(FilterFields3 = FilterFields3.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilterFields3 = js.Any.fromFunction0(getFilterFields3), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields3 = js.Any.fromFunction1(setFilterFields3))
    __obj.asInstanceOf[XSheetFilterDescriptor3]
  }
  
  @scala.inline
  implicit class XSheetFilterDescriptor3MutableBuilder[Self <: XSheetFilterDescriptor3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFields3(value: SafeArray[TableFilterField3]): Self = StObject.set(x, "FilterFields3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilterFields3(value: () => SafeArray[TableFilterField3]): Self = StObject.set(x, "getFilterFields3", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilterFields3(value: SeqEquiv[TableFilterField3] => Unit): Self = StObject.set(x, "setFilterFields3", js.Any.fromFunction1(value))
  }
}
