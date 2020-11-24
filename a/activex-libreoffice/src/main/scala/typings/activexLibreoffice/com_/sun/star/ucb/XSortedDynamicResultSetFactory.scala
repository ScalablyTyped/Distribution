package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a method to create an {@link XDynamicResultSet} which will be sorted according to the given sorting options. */
@js.native
trait XSortedDynamicResultSetFactory extends XInterface {
  
  /**
    * creates a sorted {@link XDynamicResultSet} depending on internal data, an (unsorted) {@link XDynamicResultSet} and the sorting info.
    * @param Source the (unsorted) source result set
    * @param Info the sort criteria
    * @param CompareFactory a factory for compare objects.
    * @returns a sorted result set.
    */
  def createSortedDynamicResultSet(Source: XDynamicResultSet, Info: SeqEquiv[NumberedSortingInfo], CompareFactory: XAnyCompareFactory): XDynamicResultSet = js.native
}
object XSortedDynamicResultSetFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createSortedDynamicResultSet: (XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => XDynamicResultSet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSortedDynamicResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSortedDynamicResultSet = js.Any.fromFunction3(createSortedDynamicResultSet), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSortedDynamicResultSetFactory]
  }
  
  @scala.inline
  implicit class XSortedDynamicResultSetFactoryOps[Self <: XSortedDynamicResultSetFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateSortedDynamicResultSet(value: (XDynamicResultSet, SeqEquiv[NumberedSortingInfo], XAnyCompareFactory) => XDynamicResultSet): Self = this.set("createSortedDynamicResultSet", js.Any.fromFunction3(value))
  }
}
