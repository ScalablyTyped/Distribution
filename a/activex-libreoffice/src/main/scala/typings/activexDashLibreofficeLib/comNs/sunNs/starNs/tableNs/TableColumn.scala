package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a special cell range containing all cells of a single specific column in a table or spreadsheet. */
trait TableColumn
  extends XCellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /** is `TRUE` , if there is a manual horizontal page break attached to the column. */
  var IsStartOfNewPage: scala.Boolean
  /** is `TRUE` , if the column is visible. */
  var IsVisible: scala.Boolean
  /** is `TRUE` , if the column always keeps its optimal width. */
  var OptimalWidth: scala.Boolean
  /**
    * contains the width of the column (in 1/100th mm).
    *
    * When hidden, it returns the width which the column would have, if it were visible.
    */
  var Width: scala.Double
}

