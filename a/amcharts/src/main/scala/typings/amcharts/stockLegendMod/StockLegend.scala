package typings.amcharts.stockLegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockLegend
  extends typings.amcharts.amLegendMod.default {
  /**
    * The text which will be displayed in the value portion of the legend when graph is comparable and
    * at least one dataSet is selected for comparing.
    * You can use tags like
    * [[value]], [[open]], [[high]], [[low]], [[close]], [[percents.value/open/close/low/high]],
    * [[description]]
    * @default [[percents.value]]%
    */
  var valueTextComparing: String = js.native
  /**
    * The text which will be displayed in the value portion of the legend.
    * You can use tags like
    * [[value]], [[open]], [[high]], [[low]], [[close]],[[percents]], [[description]]
    * @default [[value]]
    */
  var valueTextRegular: String = js.native
}

