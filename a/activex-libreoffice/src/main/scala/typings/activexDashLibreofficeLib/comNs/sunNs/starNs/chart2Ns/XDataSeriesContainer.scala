package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDataSeriesContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieve all data series */
  var DataSeries: stdLib.SafeArray[XDataSeries]
  /**
    * add a data series to the data series container
    * @throws IllegalArgumentException If the given data series is already contained in the data series container.
    */
  def addDataSeries(aDataSeries: XDataSeries): scala.Unit
  /** retrieve all data series */
  def getDataSeries(): stdLib.SafeArray[XDataSeries]
  /** removes one data series from the data series container. */
  def removeDataSeries(aDataSeries: XDataSeries): scala.Unit
  /** set all data series */
  def setDataSeries(aDataSeries: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries]): scala.Unit
}

object XDataSeriesContainer {
  @scala.inline
  def apply(
    DataSeries: stdLib.SafeArray[XDataSeries],
    acquire: () => scala.Unit,
    addDataSeries: XDataSeries => scala.Unit,
    getDataSeries: () => stdLib.SafeArray[XDataSeries],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeDataSeries: XDataSeries => scala.Unit,
    setDataSeries: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries] => scala.Unit
  ): XDataSeriesContainer = {
    val __obj = js.Dynamic.literal(DataSeries = DataSeries, acquire = js.Any.fromFunction0(acquire), addDataSeries = js.Any.fromFunction1(addDataSeries), getDataSeries = js.Any.fromFunction0(getDataSeries), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeDataSeries = js.Any.fromFunction1(removeDataSeries), setDataSeries = js.Any.fromFunction1(setDataSeries))
  
    __obj.asInstanceOf[XDataSeriesContainer]
  }
}

