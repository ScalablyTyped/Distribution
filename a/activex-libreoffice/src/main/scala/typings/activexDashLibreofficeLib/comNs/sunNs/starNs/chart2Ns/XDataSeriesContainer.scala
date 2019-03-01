package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDataSeriesContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieve all data series */
  var DataSeries: activexDashInteropLib.SafeArray[XDataSeries]
  /**
    * add a data series to the data series container
    * @throws IllegalArgumentException If the given data series is already contained in the data series container.
    */
  def addDataSeries(aDataSeries: XDataSeries): scala.Unit
  /** retrieve all data series */
  def getDataSeries(): activexDashInteropLib.SafeArray[XDataSeries]
  /** removes one data series from the data series container. */
  def removeDataSeries(aDataSeries: XDataSeries): scala.Unit
  /** set all data series */
  def setDataSeries(aDataSeries: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries]): scala.Unit
}

object XDataSeriesContainer {
  @scala.inline
  def apply(
    DataSeries: activexDashInteropLib.SafeArray[XDataSeries],
    acquire: js.Function0[scala.Unit],
    addDataSeries: js.Function1[XDataSeries, scala.Unit],
    getDataSeries: js.Function0[activexDashInteropLib.SafeArray[XDataSeries]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeDataSeries: js.Function1[XDataSeries, scala.Unit],
    setDataSeries: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XDataSeries], scala.Unit]
  ): XDataSeriesContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DataSeries")(DataSeries)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addDataSeries")(addDataSeries)
    __obj.updateDynamic("getDataSeries")(getDataSeries)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeDataSeries")(removeDataSeries)
    __obj.updateDynamic("setDataSeries")(setDataSeries)
    __obj.asInstanceOf[XDataSeriesContainer]
  }
}

