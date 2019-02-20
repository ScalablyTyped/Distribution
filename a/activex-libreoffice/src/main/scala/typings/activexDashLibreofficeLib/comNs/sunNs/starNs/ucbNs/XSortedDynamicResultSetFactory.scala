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

