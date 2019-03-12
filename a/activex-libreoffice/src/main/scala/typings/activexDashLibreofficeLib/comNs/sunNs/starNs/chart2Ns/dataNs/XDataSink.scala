package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a container for sequences of data. With this interface data can only be written to.
  *
  * If you want to be able to also read the data set here, your component must also implement {@link XDataSource} .
  */
trait XDataSink
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * sets new data sequences. The elements set here must support the service {@link DataSequence} .
    *
    * If the data consist only of floating point numbers (double values), the instances set here should also support the service NumericalDataSequence.
    *
    * If the data consist only of strings, the instances set here should also support the service TextualDataSequence.
    *
    * If one of the derived services is supported by one element of the sequence, it should be available for all elements in the sequence.
    */
  def setData(aData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XLabeledDataSequence]): scala.Unit
}

object XDataSink {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XLabeledDataSequence] => scala.Unit
  ): XDataSink = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction1(setData))
  
    __obj.asInstanceOf[XDataSink]
  }
}

