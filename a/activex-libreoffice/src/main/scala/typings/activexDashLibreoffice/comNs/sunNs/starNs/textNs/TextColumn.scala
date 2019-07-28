package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

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
  var LeftMargin: Double
  /**
    * contains the right margin of the column.
    *
    * This is a metric value.
    */
  var RightMargin: Double
  /**
    * contains the relative width of the column, including both margins.
    *
    * Width isn't a metric value, it's a relative value to the sum of the width of all columns.
    */
  var Width: Double
}

object TextColumn {
  @scala.inline
  def apply(LeftMargin: Double, RightMargin: Double, Width: Double): TextColumn = {
    val __obj = js.Dynamic.literal(LeftMargin = LeftMargin, RightMargin = RightMargin, Width = Width)
  
    __obj.asInstanceOf[TextColumn]
  }
}

