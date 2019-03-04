package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a method to create an {@link XDynamicResultSet} which will be sorted according to the given sorting options. */
trait XSortedDynamicResultSetFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a sorted {@link XDynamicResultSet} depending on internal data, an (unsorted) {@link XDynamicResultSet} and the sorting info.
    * @param Source the (unsorted) source result set
    * @param Info the sort criteria
    * @param CompareFactory a factory for compare objects.
    * @returns a sorted result set.
    */
  def createSortedDynamicResultSet(
    Source: XDynamicResultSet,
    Info: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[NumberedSortingInfo],
    CompareFactory: XAnyCompareFactory
  ): XDynamicResultSet
}

object XSortedDynamicResultSetFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createSortedDynamicResultSet: js.Function3[
      XDynamicResultSet, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[NumberedSortingInfo], 
      XAnyCompareFactory, 
      XDynamicResultSet
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSortedDynamicResultSetFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire, createSortedDynamicResultSet = createSortedDynamicResultSet, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSortedDynamicResultSetFactory]
  }
}

