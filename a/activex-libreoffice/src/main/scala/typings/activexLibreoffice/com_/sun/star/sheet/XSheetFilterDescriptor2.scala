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
  * This interface uses the {@link TableFilterField2} struct, whereas the {@link XSheetFilterDescriptor} interface uses the {@link TableFilterField}
  * struct.
  * @see SheetFilterDescriptor
  * @since OOo 3.2
  */
trait XSheetFilterDescriptor2
  extends StObject
     with XInterface {
  
  /** returns the collection of filter fields. */
  var FilterFields2: SafeArray[TableFilterField2]
  
  /** returns the collection of filter fields. */
  def getFilterFields2(): SafeArray[TableFilterField2]
  
  /** sets a new collection of filter fields. */
  def setFilterFields2(aFilterFields: SeqEquiv[TableFilterField2]): Unit
}
object XSheetFilterDescriptor2 {
  
  @scala.inline
  def apply(
    FilterFields2: SafeArray[TableFilterField2],
    acquire: () => Unit,
    getFilterFields2: () => SafeArray[TableFilterField2],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFilterFields2: SeqEquiv[TableFilterField2] => Unit
  ): XSheetFilterDescriptor2 = {
    val __obj = js.Dynamic.literal(FilterFields2 = FilterFields2.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilterFields2 = js.Any.fromFunction0(getFilterFields2), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields2 = js.Any.fromFunction1(setFilterFields2))
    __obj.asInstanceOf[XSheetFilterDescriptor2]
  }
  
  @scala.inline
  implicit class XSheetFilterDescriptor2MutableBuilder[Self <: XSheetFilterDescriptor2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFields2(value: SafeArray[TableFilterField2]): Self = StObject.set(x, "FilterFields2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilterFields2(value: () => SafeArray[TableFilterField2]): Self = StObject.set(x, "getFilterFields2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilterFields2(value: SeqEquiv[TableFilterField2] => Unit): Self = StObject.set(x, "setFilterFields2", js.Any.fromFunction1(value))
  }
}
