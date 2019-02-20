package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a special cell range containing all cells of a single specific row in a table or spreadsheet. */
trait TableRow
  extends XCellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * contains the height of the row (in 1/100 mm).
    *
    * When hidden, it returns the height which the row would have, if it were visible.
    */
  var Height: scala.Double
  /** is `TRUE` , if there is a manual vertical page break attached to the row. */
  var IsStartOfNewPage: scala.Boolean
  /** is `TRUE` , if the row is visible. */
  var IsVisible: scala.Boolean
  /** is `TRUE` , if the row always keeps its optimal height. */
  var OptimalHeight: scala.Boolean
}

