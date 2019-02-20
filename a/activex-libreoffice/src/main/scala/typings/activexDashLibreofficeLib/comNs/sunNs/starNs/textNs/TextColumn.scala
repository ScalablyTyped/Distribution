package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines a single text column. */
trait TextColumn extends js.Object {
  /**
    * contains the left margin of the column.
    *
    * This is a metric value.
    */
  var LeftMargin: scala.Double
  /**
    * contains the right margin of the column.
    *
    * This is a metric value.
    */
  var RightMargin: scala.Double
  /**
    * contains the relative width of the column, including both margins.
    *
    * Width isn't a metric value, it's a relative value to the sum of the width of all columns.
    */
  var Width: scala.Double
}

