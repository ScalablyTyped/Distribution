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
    acquire: () => scala.Unit,
    getDataPointByIndex: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    resetAllDataPoints: () => scala.Unit,
    resetDataPoint: scala.Double => scala.Unit
  ): XDataSeries = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDataPointByIndex = js.Any.fromFunction1(getDataPointByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetAllDataPoints = js.Any.fromFunction0(resetAllDataPoints), resetDataPoint = js.Any.fromFunction1(resetDataPoint))
  
    __obj.asInstanceOf[XDataSeries]
  }
}

