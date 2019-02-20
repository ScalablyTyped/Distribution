package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes sort criteria for sorting text.
  * @deprecated Deprecated
  */
trait TextSortDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortDescriptor {
  /** contains the character that marks the separation of columns. */
  var Delimiter: java.lang.String
  /** determines if the sorting in the first search key is done in ascending or descending order. */
  var IsSortAscending0: scala.Boolean
  /** determines if the sorting in the second search key is done in ascending or descending order. */
  var IsSortAscending1: scala.Boolean
  /** determines if the sorting in the third search key is done in ascending or descending order. */
  var IsSortAscending2: scala.Boolean
  /** determines if the content of a table is to be sorted. */
  var IsSortInTable: scala.Boolean
  /** determines if the sorting in the first search key is done numeric or alphanumeric order. */
  var IsSortNumeric0: scala.Boolean
  /** determines if the sorting in the second search key is done in numeric or alphanumeric order. */
  var IsSortNumeric1: scala.Boolean
  /** determines if the sorting in the third search key is done in numeric or alphanumeric order. */
  var IsSortNumeric2: scala.Boolean
  /** contains the row or column index used in the first search key. */
  var SortRowOrColumnNo0: scala.Double
  /** contains the row or column index used in the second search key. */
  var SortRowOrColumnNo1: scala.Double
  /** contains the row or column index used in the third search key. */
  var SortRowOrColumnNo2: scala.Double
}

