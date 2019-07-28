package typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single data row, specified by its name and a sequence of data points.
  *
  * This struct is currently used nowhere.
  * @deprecated Deprecated
  */
trait ChartDataRow extends js.Object {
  /** The name of the data row. */
  var Name: String
  /** The points contained in this data row. */
  var Points: SafeArray[SafeArray[ChartDataValue]]
}

object ChartDataRow {
  @scala.inline
  def apply(Name: String, Points: SafeArray[SafeArray[ChartDataValue]]): ChartDataRow = {
    val __obj = js.Dynamic.literal(Name = Name, Points = Points)
  
    __obj.asInstanceOf[ChartDataRow]
  }
}

