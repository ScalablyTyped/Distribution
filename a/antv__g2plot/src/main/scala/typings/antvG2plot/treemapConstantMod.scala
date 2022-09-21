package typings.antvG2plot

import typings.antvG2plot.anon.BreadCrumb
import typings.antvG2plot.anon.Layout
import typings.antvG2plot.anon.ShowMarkers
import typings.antvG2plot.anon.Stroke
import typings.antvG2plot.anon.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treemapConstantMod {
  
  object DEFAULT_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/treemap/constant", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/treemap/constant", "DEFAULT_OPTIONS.colorField")
    @js.native
    def colorField: String = js.native
    inline def colorField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colorField")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/treemap/constant", "DEFAULT_OPTIONS.drilldown")
    @js.native
    def drilldown: BreadCrumb = js.native
    inline def drilldown_=(x: BreadCrumb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drilldown")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/treemap/constant", "DEFAULT_OPTIONS.hierarchyConfig")
    @js.native
    def hierarchyConfig: Tile = js.native
    inline def hierarchyConfig_=(x: Tile): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hierarchyConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/treemap/constant", "DEFAULT_OPTIONS.label")
    @js.native
    def label: Layout = js.native
    inline def label_=(x: Layout): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/treemap/constant", "DEFAULT_OPTIONS.rectStyle")
    @js.native
    def rectStyle: Stroke = js.native
    inline def rectStyle_=(x: Stroke): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rectStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/treemap/constant", "DEFAULT_OPTIONS.tooltip")
    @js.native
    def tooltip: ShowMarkers = js.native
    inline def tooltip_=(x: ShowMarkers): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
  }
}
