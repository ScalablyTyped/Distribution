package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.chart2.data.XLabeledDataSequence
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
trait InterpretedData extends js.Object {
  var Categories: XLabeledDataSequence
  var Series: SafeArray[SafeArray[XDataSeries]]
}

object InterpretedData {
  @scala.inline
  def apply(Categories: XLabeledDataSequence, Series: SafeArray[SafeArray[XDataSeries]]): InterpretedData = {
    val __obj = js.Dynamic.literal(Categories = Categories.asInstanceOf[js.Any], Series = Series.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpretedData]
  }
}

