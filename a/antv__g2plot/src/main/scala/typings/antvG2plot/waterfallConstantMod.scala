package typings.antvG2plot

import typings.antvG2plot.anon.Fill
import typings.antvG2plot.anon.GridLine
import typings.antvG2plot.anon.StyleFill
import typings.antvG2plot.anon.StyleLineDash
import typings.antvG2plot.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterfallConstantMod {
  
  @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "ABSOLUTE_FIELD")
  @js.native
  val ABSOLUTE_FIELD: /* "$$absoluteField$$" */ String = js.native
  
  object DEFAULT_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DEFAULT_OPTIONS.fallingFill")
    @js.native
    def fallingFill: String = js.native
    inline def fallingFill_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallingFill")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DEFAULT_OPTIONS.interactions")
    @js.native
    def interactions: js.Array[Type] = js.native
    inline def interactions_=(x: js.Array[Type]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interactions")(x.asInstanceOf[js.Any])
    
    /** default: show leaderLine */
    @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DEFAULT_OPTIONS.leaderLine")
    @js.native
    def leaderLine: StyleLineDash = js.native
    inline def leaderLine_=(x: StyleLineDash): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("leaderLine")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DEFAULT_OPTIONS.risingFill")
    @js.native
    def risingFill: String = js.native
    inline def risingFill_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("risingFill")(x.asInstanceOf[js.Any])
    
    /** default: show total */
    @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DEFAULT_OPTIONS.total")
    @js.native
    def total: StyleFill = js.native
    inline def total_=(x: StyleFill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("total")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DEFAULT_OPTIONS.waterfallStyle")
    @js.native
    def waterfallStyle: Fill = js.native
    inline def waterfallStyle_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waterfallStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DEFAULT_OPTIONS.yAxis")
    @js.native
    def yAxis: GridLine = js.native
    inline def yAxis_=(x: GridLine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "DIFF_FIELD")
  @js.native
  val DIFF_FIELD: /* "$$diffField$$" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "IS_TOTAL")
  @js.native
  val IS_TOTAL: /* "$$isTotal$$" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/waterfall/constant", "Y_FIELD")
  @js.native
  val Y_FIELD: /* "$$yField$$" */ String = js.native
}
