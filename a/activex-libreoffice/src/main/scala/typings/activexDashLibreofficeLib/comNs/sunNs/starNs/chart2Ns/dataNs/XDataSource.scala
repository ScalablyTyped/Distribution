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
  val DataSequences: activexDashInteropLib.SafeArray[XLabeledDataSequence]
  /**
    * returns data sequences.
    * @returns a sequence of objects that support at least the service {@link DataSequence} .  If the data stored consist only of floating point numbers (double
    */
  def getDataSequences(): activexDashInteropLib.SafeArray[XLabeledDataSequence]
}

