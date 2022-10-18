package typings.antvG2plot

import typings.antvG2plot.anon.Border
import typings.antvG2plot.anon.ContentTitle
import typings.antvG2plot.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsLiquidConstantsMod {
  
  object DEFAULT_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/liquid/constants", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/liquid/constants", "DEFAULT_OPTIONS.outline")
    @js.native
    def outline: Border = js.native
    inline def outline_=(x: Border): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("outline")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/liquid/constants", "DEFAULT_OPTIONS.radius")
    @js.native
    def radius: Double = js.native
    inline def radius_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("radius")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/liquid/constants", "DEFAULT_OPTIONS.shape")
    @js.native
    def shape: String = js.native
    inline def shape_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shape")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/liquid/constants", "DEFAULT_OPTIONS.statistic")
    @js.native
    def statistic: ContentTitle = js.native
    inline def statistic_=(x: ContentTitle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statistic")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/liquid/constants", "DEFAULT_OPTIONS.wave")
    @js.native
    def wave: Count = js.native
    inline def wave_=(x: Count): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wave")(x.asInstanceOf[js.Any])
  }
}
