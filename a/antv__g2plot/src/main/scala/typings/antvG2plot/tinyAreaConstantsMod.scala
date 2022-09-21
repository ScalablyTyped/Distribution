package typings.antvG2plot

import typings.antvG2plot.anon.Color
import typings.antvG2plot.anon.ContainerTpl
import typings.antvG2plot.anon.FillOpacityNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tinyAreaConstantsMod {
  
  object DEFAULT_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/tiny-area/constants", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/tiny-area/constants", "DEFAULT_OPTIONS.appendPadding")
    @js.native
    def appendPadding: Double = js.native
    inline def appendPadding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendPadding")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-area/constants", "DEFAULT_OPTIONS.areaStyle")
    @js.native
    def areaStyle: FillOpacityNumber = js.native
    inline def areaStyle_=(x: FillOpacityNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("areaStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-area/constants", "DEFAULT_OPTIONS.color")
    @js.native
    def color: String = js.native
    inline def color_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-area/constants", "DEFAULT_OPTIONS.line")
    @js.native
    def line: Color = js.native
    inline def line_=(x: Color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("line")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/tiny-area/constants", "DEFAULT_OPTIONS.tooltip")
    @js.native
    def tooltip: ContainerTpl = js.native
    inline def tooltip_=(x: ContainerTpl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
  }
}
