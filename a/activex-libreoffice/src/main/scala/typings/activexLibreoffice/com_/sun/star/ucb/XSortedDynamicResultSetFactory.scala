package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a method to create an {@link XDynamicResultSet} which will be sorted according to the given sorting options. */
trait XSortedDynamicResultSetFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a sorted {@link XDynamicResultSet} depending on internal data, an (unsorted) {@link XDynamicResultSet} and the sorting info.
    * @param Source the (unsorted) source result set
    * @param Info the sort criteria
    * @param CompareFactory a factory for compare objects.
    * @returns a sorted result set.
    */
  def createSortedDynamicResultSet(Source: XDynamicResultSet, Info: SeqEquiv[NumberedSortingInfo], CompareFactory: XAnyCompareFactory): XDynamicResultSet
}
object XSortedDynamicResultSetFactory {
  
  inline def apply(
    acquire: () => Unit,
    createSortedDynamicResultSet: (XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => XDynamicResultSet,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSortedDynamicResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSortedDynamicResultSet = js.Any.fromFunction3(createSortedDynamicResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSortedDynamicResultSetFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSortedDynamicResultSetFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateSortedDynamicResultSet(value: (XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => XDynamicResultSet): Self = StObject.set(x, "createSortedDynamicResultSet", js.Any.fromFunction3(value))
  }
}
