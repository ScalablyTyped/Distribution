package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages the data of the chart.
  * @see XChartDocument
  */
trait XChartData
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the value which is to be used as an indicator for a missing value in the data.  In IEEE arithmetic format it is one of the NaN values, so there a */
  val NotANumber: scala.Double
  /**
    * allows a component supporting the {@link XChartDataChangeEventListener} interface to register as listener. The component will be notified with a
    * {@link ChartDataChangeEvent} every time the chart's data changes.
    * @param aListener the component that is to be added as listener
    * @see XChartDataChangeEventListener
    * @see ChartDataChangeEvent
    */
  def addChartDataChangeEventListener(aListener: XChartDataChangeEventListener): scala.Unit
  /** @returns the value which is to be used as an indicator for a missing value in the data.  In IEEE arithmetic format it is one of the NaN values, so there a */
  def getNotANumber(): scala.Double
  /**
    * checks whether the value given is equal to the indicator value for a missing value.
    *
    * In IEEE arithmetic format it is one of the NaN values, so there are no conflicts with existing numeric values.
    *
    * Always use this method to check, if a value is **not a number** . If you compare the value returned by {@link XChartData.getNotANumber()} to another
    * double value using the = operator, you may not get the desired result!
    * @param nNumber the number that you want to check for validity.
    * @returns `TRUE` if the number given is interpreted by the chart as a missing value.
    */
  def isNotANumber(nNumber: scala.Double): scala.Boolean
  /**
    * removes a previously registered listener.
    * @param aListener the component that is to be removed
    */
  def removeChartDataChangeEventListener(aListener: XChartDataChangeEventListener): scala.Unit
}

object XChartData {
  @scala.inline
  def apply(
    NotANumber: scala.Double,
    acquire: js.Function0[scala.Unit],
    addChartDataChangeEventListener: js.Function1[XChartDataChangeEventListener, scala.Unit],
    getNotANumber: js.Function0[scala.Double],
    isNotANumber: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChartDataChangeEventListener: js.Function1[XChartDataChangeEventListener, scala.Unit]
  ): XChartData = {
    val __obj = js.Dynamic.literal(NotANumber = NotANumber, acquire = acquire, addChartDataChangeEventListener = addChartDataChangeEventListener, getNotANumber = getNotANumber, isNotANumber = isNotANumber, queryInterface = queryInterface, release = release, removeChartDataChangeEventListener = removeChartDataChangeEventListener)
  
    __obj.asInstanceOf[XChartData]
  }
}

