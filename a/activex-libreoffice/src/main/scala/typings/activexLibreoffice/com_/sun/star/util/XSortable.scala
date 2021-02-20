package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to sort the contents of this object.
  *
  * The available properties describing the sort criteria are defined in the sort descriptor implemented by the object that implements this interface.
  *
  * There are older deprecated sort descriptors:
  *
  * {@link com.sun.star.util.SortDescriptor}{@link com.sun.star.table.TableSortDescriptor}{@link com.sun.star.text.TextSortDescriptor}
  *
  * And a new set of sort descriptors:
  *
  * {@link com.sun.star.util.SortDescriptor2}{@link com.sun.star.table.TableSortDescriptor2}{@link com.sun.star.text.TextSortDescriptor2}
  *
  * Both types may be implemented by the same object. When calling the sort method however properties from different descriptors must not be mixed.
  */
@js.native
trait XSortable extends XInterface {
  
  /**
    * @returns a sequence of properties which allows to specify/modify the sort criteria.  The set of properties is specific to the type of object that implemen
    * @see com.sun.star.util.SortDescriptor
    * @see com.sun.star.table.TableSortDescriptor
    * @see com.sun.star.text.TextSortDescriptor
    * @see com.sun.star.util.SortDescriptor2
    * @see com.sun.star.table.TableSortDescriptor2
    * @see com.sun.star.text.TextSortDescriptor2
    */
  def createSortDescriptor(): SafeArray[PropertyValue] = js.native
  
  /**
    * sorts the contents of the object according to the specified properties.
    *
    * The specified properties are usually the same or a subset of those obtained by calling {@link createSortDescriptor()} on the same type of object.
    * @see com.sun.star.util.SortDescriptor
    * @see com.sun.star.table.TableSortDescriptor
    * @see com.sun.star.text.TextSortDescriptor
    * @see com.sun.star.util.SortDescriptor2
    * @see com.sun.star.table.TableSortDescriptor2
    * @see com.sun.star.text.TextSortDescriptor2
    */
  def sort(xDescriptor: SeqEquiv[PropertyValue]): Unit = js.native
}
object XSortable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createSortDescriptor: () => SafeArray[PropertyValue],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    sort: SeqEquiv[PropertyValue] => Unit
  ): XSortable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSortDescriptor = js.Any.fromFunction0(createSortDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[XSortable]
  }
  
  @scala.inline
  implicit class XSortableMutableBuilder[Self <: XSortable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateSortDescriptor(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "createSortDescriptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSort(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
  }
}
