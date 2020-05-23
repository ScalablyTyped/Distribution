package typings.activexLibreoffice.com_.sun.star.chart2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X3DChartWindowProvider extends js.Object {
  def setWindow(window: Double): Unit
}

object X3DChartWindowProvider {
  @scala.inline
  def apply(setWindow: Double => Unit): X3DChartWindowProvider = {
    val __obj = js.Dynamic.literal(setWindow = js.Any.fromFunction1(setWindow))
    __obj.asInstanceOf[X3DChartWindowProvider]
  }
}

