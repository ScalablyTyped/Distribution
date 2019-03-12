package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to sequences of data. With this interface data can only be read from.
  *
  * If the data stored consists only of floating point numbers (double values), the returned instances should also support the service
  * NumericalDataSequence.
  *
  * If the data stored consists only of strings, the returned instances should also support the service TextualDataSequence.
  */
trait XDataSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  val DataSequences: stdLib.SafeArray[XLabeledDataSequence]
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  def getDataSequences(): stdLib.SafeArray[XLabeledDataSequence]
}

object XDataSource {
  @scala.inline
  def apply(
    DataSequences: stdLib.SafeArray[XLabeledDataSequence],
    acquire: () => scala.Unit,
    getDataSequences: () => stdLib.SafeArray[XLabeledDataSequence],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XDataSource = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences, acquire = js.Any.fromFunction0(acquire), getDataSequences = js.Any.fromFunction0(getDataSequences), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDataSource]
  }
}

