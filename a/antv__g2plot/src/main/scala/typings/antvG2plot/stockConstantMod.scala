package typings.antvG2plot

import typings.antvG2plot.anon.Follow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stockConstantMod {
  
  @JSImport("@antv/g2plot/lib/plots/stock/constant", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: Any = js.native
  
  object DEFAULT_TOOLTIP_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/stock/constant", "DEFAULT_TOOLTIP_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/stock/constant", "DEFAULT_TOOLTIP_OPTIONS.crosshairs")
    @js.native
    def crosshairs: Follow = js.native
    inline def crosshairs_=(x: Follow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crosshairs")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/stock/constant", "DEFAULT_TOOLTIP_OPTIONS.shared")
    @js.native
    def shared: Boolean = js.native
    inline def shared_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shared")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/stock/constant", "DEFAULT_TOOLTIP_OPTIONS.showCrosshairs")
    @js.native
    def showCrosshairs: Boolean = js.native
    inline def showCrosshairs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCrosshairs")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/stock/constant", "DEFAULT_TOOLTIP_OPTIONS.showMarkers")
    @js.native
    def showMarkers: Boolean = js.native
    inline def showMarkers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showMarkers")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g2plot/lib/plots/stock/constant", "TREND_DOWN")
  @js.native
  val TREND_DOWN: /* "down" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/stock/constant", "TREND_FIELD")
  @js.native
  val TREND_FIELD: /* "trend" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/stock/constant", "TREND_UP")
  @js.native
  val TREND_UP: /* "up" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/stock/constant", "Y_FIELD")
  @js.native
  val Y_FIELD: /* "$$stock-range$$" */ String = js.native
}
