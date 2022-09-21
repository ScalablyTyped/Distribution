package typings.antvG2

import typings.antvG2.libInterfaceMod.AttributeOption
import typings.antvG2.libInterfaceMod.ColorAttrCallback
import typings.antvG2.libInterfaceMod.ShapePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapMod {
  
  @JSImport("@antv/g2/lib/geometry/heatmap", JSImport.Default)
  @js.native
  open class default () extends Heatmap
  
  @js.native
  trait Heatmap
    extends typings.antvG2.geometryBaseMod.default[ShapePoint] {
    
    /* private */ var clearShadowCanvasCtx: Any = js.native
    
    def color(field: AttributeOption, cfg: String): typings.antvG2.geometryBaseMod.default[ShapePoint] = js.native
    def color(field: AttributeOption, cfg: js.Array[String]): typings.antvG2.geometryBaseMod.default[ShapePoint] = js.native
    def color(field: AttributeOption, cfg: ColorAttrCallback): typings.antvG2.geometryBaseMod.default[ShapePoint] = js.native
    
    /* private */ var colorize: Any = js.native
    
    /* private */ var drawGrayScaleBlurredCircle: Any = js.native
    
    /* private */ var drawWithRange: Any = js.native
    
    /* private */ var getDefaultSize: Any = js.native
    
    /* private */ var getGrayScaleBlurredCanvas: Any = js.native
    
    /* private */ var getImageShape: Any = js.native
    
    /* private */ var getShadowCanvasCtx: Any = js.native
    
    /* private */ var getShapeInfo: Any = js.native
    
    /* private */ var grayScaleBlurredCanvas: Any = js.native
    
    /* private */ var imageShape: Any = js.native
    
    /* private */ var paletteCache: Any = js.native
    
    /* private */ var prepareGreyScaleBlurredCircle: Any = js.native
    
    /* private */ var prepareRange: Any = js.native
    
    /* private */ var prepareSize: Any = js.native
    
    /* private */ var shadowCanvas: Any = js.native
  }
}
