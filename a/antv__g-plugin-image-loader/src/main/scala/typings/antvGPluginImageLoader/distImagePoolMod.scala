package typings.antvGPluginImageLoader

import typings.antvGLite.distCssCssomCssgradientvalueMod.GradientType
import typings.antvGLite.distCssParserColorMod.Pattern
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.std.CanvasGradient
import typings.std.CanvasPattern
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distImagePoolMod {
  
  @JSImport("@antv/g-plugin-image-loader/dist/ImagePool", "ImagePool")
  @js.native
  open class ImagePool protected () extends StObject {
    def this(canvasConfig: CanvasConfig) = this()
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var generateGradientKey: Any = js.native
    
    /* private */ var generatePatternKey: Any = js.native
    
    def getImageSync(src: String): HTMLImageElement = js.native
    def getImageSync(src: String, callback: js.Function0[Unit]): HTMLImageElement = js.native
    
    def getOrCreateGradient(params: GradientParams, context: CanvasRenderingContext2D): CanvasGradient = js.native
    
    def getOrCreateImage(src: String): js.Promise[HTMLImageElement] = js.native
    
    def getOrCreatePatternSync(pattern: Pattern, context: CanvasRenderingContext2D, callback: js.Function0[Unit]): CanvasPattern = js.native
    
    /* private */ var gradientCache: Any = js.native
    
    /* private */ var imageCache: Any = js.native
    
    /* private */ var patternCache: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antvGPluginImageLoader.anon.LinearGradientwidthnumber
    - typings.antvGPluginImageLoader.anon.RadialGradientwidthnumber
  */
  trait GradientParams extends StObject
  object GradientParams {
    
    inline def LinearGradientwidthnumber(
      angle: Double,
      hash: String,
      height: Double,
      steps: js.Array[js.Tuple2[Double, String]],
      `type`: GradientType,
      width: Double
    ): typings.antvGPluginImageLoader.anon.LinearGradientwidthnumber = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.antvGPluginImageLoader.anon.LinearGradientwidthnumber]
    }
    
    inline def RadialGradientwidthnumber(
      cx: Double,
      cy: Double,
      hash: String,
      height: Double,
      steps: js.Array[js.Tuple2[Double, String]],
      `type`: GradientType,
      width: Double
    ): typings.antvGPluginImageLoader.anon.RadialGradientwidthnumber = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.antvGPluginImageLoader.anon.RadialGradientwidthnumber]
    }
  }
}
