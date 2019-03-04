package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A data series represents the object that has all the knowledge to be rendered as a visual data series. */
trait XDataSeries
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @param nIndex specifies the index of the data point within the series. The first index is 0.
    * @returns the element at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    */
  def getDataPointByIndex(nIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** all data point formatting are cleared */
  def resetAllDataPoints(): scala.Unit
  /**
    * the formatting of the specified data point is cleared
    * @param nIndex specifies the index of the data point within the series. The first index is 0.
    */
  def resetDataPoint(nIndex: scala.Double): scala.Unit
}

object XDataSeries {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDataPointByIndex: js.Function1[scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resetAllDataPoints: js.Function0[scala.Unit],
    resetDataPoint: js.Function1[scala.Double, scala.Unit]
  ): XDataSeries = {
    val __obj = js.Dynamic.literal(acquire = acquire, getDataPointByIndex = getDataPointByIndex, queryInterface = queryInterface, release = release, resetAllDataPoints = resetAllDataPoints, resetDataPoint = resetDataPoint)
  
    __obj.asInstanceOf[XDataSeries]
  }
}

