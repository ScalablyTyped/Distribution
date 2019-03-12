package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

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
  var Name: java.lang.String
  /** The points contained in this data row. */
  var Points: stdLib.SafeArray[stdLib.SafeArray[ChartDataValue]]
}

object ChartDataRow {
  @scala.inline
  def apply(Name: java.lang.String, Points: stdLib.SafeArray[stdLib.SafeArray[ChartDataValue]]): ChartDataRow = {
    val __obj = js.Dynamic.literal(Name = Name, Points = Points)
  
    __obj.asInstanceOf[ChartDataRow]
  }
}

