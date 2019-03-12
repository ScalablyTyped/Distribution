package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X3DChartWindowProvider extends js.Object {
  def setWindow(window: scala.Double): scala.Unit
}

object X3DChartWindowProvider {
  @scala.inline
  def apply(setWindow: scala.Double => scala.Unit): X3DChartWindowProvider = {
    val __obj = js.Dynamic.literal(setWindow = js.Any.fromFunction1(setWindow))
  
    __obj.asInstanceOf[X3DChartWindowProvider]
  }
}

