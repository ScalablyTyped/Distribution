package typings.antvG2plot

import typings.antvG2plot.typesPatternMod.SquarePatternCfg
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternSquareMod {
  
  @JSImport("@antv/g2plot/lib/utils/pattern/square", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSquarePattern(): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("createSquarePattern")().asInstanceOf[CanvasPattern]
  inline def createSquarePattern(cfg: SquarePatternCfg): CanvasPattern = ^.asInstanceOf[js.Dynamic].applyDynamic("createSquarePattern")(cfg.asInstanceOf[js.Any]).asInstanceOf[CanvasPattern]
  
  object defaultSquarePatternCfg {
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.backgroundColor")
    @js.native
    def backgroundColor: String = js.native
    inline def backgroundColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.fill")
    @js.native
    def fill: String = js.native
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.fillOpacity")
    @js.native
    def fillOpacity: Double = js.native
    inline def fillOpacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(x.asInstanceOf[js.Any])
    
    inline def fill_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fill")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.isStagger")
    @js.native
    def isStagger: Boolean = js.native
    inline def isStagger_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isStagger")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.lineWidth")
    @js.native
    def lineWidth: Double = js.native
    inline def lineWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.opacity")
    @js.native
    def opacity: Double = js.native
    inline def opacity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("opacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.padding")
    @js.native
    def padding: Double = js.native
    inline def padding_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.rotation")
    @js.native
    def rotation: Double = js.native
    inline def rotation_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotation")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.size")
    @js.native
    def size: Double = js.native
    inline def size_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/utils/pattern/square", "defaultSquarePatternCfg.stroke")
    @js.native
    def stroke: String = js.native
    inline def stroke_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stroke")(x.asInstanceOf[js.Any])
  }
  
  inline def drawSquare(context: CanvasRenderingContext2D, cfg: SquarePatternCfg, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawSquare")(context.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
