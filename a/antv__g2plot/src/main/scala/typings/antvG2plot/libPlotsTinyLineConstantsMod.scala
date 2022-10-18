package typings.antvG2plot

import typings.antvG2plot.anon.ContainerTpl
import typings.antvG2plot.anon.G2tooltip
import typings.antvG2plot.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsTinyLineConstantsMod {
  
  object DEFAULT_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_OPTIONS.appendPadding")
    @js.native
    def appendPadding: Double = js.native
    inline def appendPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_OPTIONS.tooltip")
    @js.native
    def tooltip: ContainerTpl = js.native
    inline def tooltip_=(x: ContainerTpl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
  }
  
  object DEFAULT_TOOLTIP_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS.containerTpl")
    @js.native
    def containerTpl: String = js.native
    inline def containerTpl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("containerTpl")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS.crosshairs")
    @js.native
    def crosshairs: `2` = js.native
    inline def crosshairs_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crosshairs")(x.asInstanceOf[js.Any])
    
    inline def customContent(x: String, data: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("customContent")(x.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS.domStyles")
    @js.native
    def domStyles: G2tooltip = js.native
    inline def domStyles_=(x: G2tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domStyles")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS.itemTpl")
    @js.native
    def itemTpl: String = js.native
    inline def itemTpl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemTpl")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS.shared")
    @js.native
    def shared: Boolean = js.native
    inline def shared_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shared")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS.showCrosshairs")
    @js.native
    def showCrosshairs: Boolean = js.native
    inline def showCrosshairs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCrosshairs")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS.showMarkers")
    @js.native
    def showMarkers: Boolean = js.native
    inline def showMarkers_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showMarkers")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "DEFAULT_TOOLTIP_OPTIONS.showTitle")
    @js.native
    def showTitle: Boolean = js.native
    inline def showTitle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTitle")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "X_FIELD")
  @js.native
  val X_FIELD: /* "x" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/tiny-line/constants", "Y_FIELD")
  @js.native
  val Y_FIELD: /* "y" */ String = js.native
}
