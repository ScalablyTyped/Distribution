package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter gets some data and provides some data. The received data is typically (but not necessarily) different from the data that can be retrieved by
  * a filter.
  */
trait DataFilter
  extends XDataSink
     with XDataSource

object DataFilter {
  @scala.inline
  def apply(
    DataSequences: activexDashInteropLib.SafeArray[XLabeledDataSequence],
    acquire: js.Function0[scala.Unit],
    getDataSequences: js.Function0[activexDashInteropLib.SafeArray[XLabeledDataSequence]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setData: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XLabeledDataSequence], scala.Unit]
  ): DataFilter = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences, acquire = acquire, getDataSequences = getDataSequences, queryInterface = queryInterface, release = release, setData = setData)
  
    __obj.asInstanceOf[DataFilter]
  }
}

