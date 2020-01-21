package typings.amcharts.mod.AmCharts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts", "AmCharts.addInitHandler")
@js.native
object addInitHandler extends js.Object {
  /**
    * Set a method to be called before initializing the chart.
    * When the method is called, the chart instance is passed as an attribute.
    * You can use this feature to preprocess chart data or do some other things you need
    * before initializing the chart.
    * @param handler - The method to be called.
    * @param types - Which chart types should call this method. Defaults to all
    * if none is passed.
    */
  def apply(handler: js.Function0[js.Object]): js.Any = js.native
  def apply(handler: js.Function0[js.Object], types: js.Array[String]): js.Any = js.native
}

