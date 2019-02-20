package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains properties which describe sorting of rows or columns in a table.
  *
  * It extends the general {@link com.sun.star.util.SortDescriptor} with table-specific properties.
  * @deprecated Deprecated
  */
trait TableSortDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortDescriptor {
  /** specifies whether the first row or column (depending on {@link com.sun.star.util.SortDescriptor.SortColumns} ) is a header which should not be sorted. */
  var ContainsHeader: scala.Boolean
  /** contains the maximum number of sort fields the descriptor can hold. */
  var MaxFieldCount: scala.Double
  /**
    * specifies the sorting orientation (sort rows or columns).
    *
    * Some implementations may not support sorting columns.
    * @deprecated Deprecateduse the property com::sun::star::util::SortDescriptor::SortColumns instead.
    */
  var Orientation: TableOrientation
  /** specifies the descriptions of the individual sort fields. */
  var SortFields: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortField]
}

