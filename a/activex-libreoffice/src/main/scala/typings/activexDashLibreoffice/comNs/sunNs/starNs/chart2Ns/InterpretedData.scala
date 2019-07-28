package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
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
    val __obj = js.Dynamic.literal(Categories = Categories, Series = Series)
  
    __obj.asInstanceOf[InterpretedData]
  }
}

