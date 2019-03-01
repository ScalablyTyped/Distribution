package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers tooling to interpret different data sources in a structural and chart-type-dependent way. */
trait InterpretedData extends js.Object {
  var Categories: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
  var Series: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[XDataSeries]]
}

object InterpretedData {
  @scala.inline
  def apply(
    Categories: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence,
    Series: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[XDataSeries]]
  ): InterpretedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Categories")(Categories)
    __obj.updateDynamic("Series")(Series)
    __obj.asInstanceOf[InterpretedData]
  }
}

