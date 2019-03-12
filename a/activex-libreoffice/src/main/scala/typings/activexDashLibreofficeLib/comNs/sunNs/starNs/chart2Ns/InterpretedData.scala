package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
trait InterpretedData extends js.Object {
  var Categories: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
  var Series: stdLib.SafeArray[stdLib.SafeArray[XDataSeries]]
}

object InterpretedData {
  @scala.inline
  def apply(
    Categories: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence,
    Series: stdLib.SafeArray[stdLib.SafeArray[XDataSeries]]
  ): InterpretedData = {
    val __obj = js.Dynamic.literal(Categories = Categories, Series = Series)
  
    __obj.asInstanceOf[InterpretedData]
  }
}

