package typings.antvG2plot

import typings.antvG2plot.libTypesPatternMod.LinePatternCfg
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsPatternLineMod {
  
  @JSImport("@antv/g2plot/lib/utils/pattern/line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLinePattern(): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("createLinePattern")().asInstanceOf[CanvasPattern]
  inline def createLinePattern(cfg: LinePatternCfg): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("createLinePattern")(cfg.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  object defaultLinePatternCfg {
    
    @JSImport("@antv/g2plot/lib/utils/pattern/line", "defaultLinePatternCfg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/utils/pattern/line", "defaultLinePatternCfg.backgroundColor")
    @js.native
    def backgroundColor: String = js.native
    inline def backgroundColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/line", "defaultLinePatternCfg.lineWidth")
    @js.native
    def lineWidth: Double = js.native
    inline def lineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/line", "defaultLinePatternCfg.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/line", "defaultLinePatternCfg.rotation")
    @js.native
    def rotation: Double = js.native
    inline def rotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/line", "defaultLinePatternCfg.spacing")
    @js.native
    def spacing: Double = js.native
    inline def spacing_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/line", "defaultLinePatternCfg.stroke")
    @js.native
    def stroke: String = js.native
    
    @JSImport("@antv/g2plot/lib/utils/pattern/line", "defaultLinePatternCfg.strokeOpacity")
    @js.native
    def strokeOpacity: Double = js.native
    inline def strokeOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(x.asInstanceOf[js.Any])
    
    inline def stroke_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
  }
  
  inline def drawLine(context: CanvasRenderingContext2D, cfg: LinePatternCfg, d: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawLine")(context.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
