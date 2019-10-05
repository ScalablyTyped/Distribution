package typings.amcharts

import typings.amcharts.stockLegendMod.StockLegend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/StockLegend", JSImport.Namespace)
@js.native
object stockLegendMod extends js.Object {
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
  
  @js.native
  class default () extends StockLegend
  
}

