package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns.dataNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
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
    DataSequences: SafeArray[XLabeledDataSequence],
    acquire: () => Unit,
    getDataSequences: () => SafeArray[XLabeledDataSequence],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setData: SeqEquiv[XLabeledDataSequence] => Unit
  ): DataFilter = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences, acquire = js.Any.fromFunction0(acquire), getDataSequences = js.Any.fromFunction0(getDataSequences), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction1(setData))
  
    __obj.asInstanceOf[DataFilter]
  }
}

