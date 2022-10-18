package typings.antvGPluginCanvasRenderer

import typings.antvGLite.distDisplayObjectsImageMod.ParsedImageStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.mod.DisplayObject
import typings.antvGLite.mod.RenderingService
import typings.antvGPluginCanvasRenderer.distShapesStylesInterfacesMod.StyleRenderer
import typings.antvGPluginImageLoader.mod.ImagePool
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesStylesImageMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/Image", "ImageRenderer")
  @js.native
  open class ImageRenderer protected ()
    extends StObject
       with StyleRenderer {
    def this(imagePool: ImagePool) = this()
    
    /* private */ var imagePool: Any = js.native
    
    def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedImageStyleProps,
      `object`: DisplayObject[Any, Any]
    ): Unit = js.native
    /* CompleteClass */
    override def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedBaseStyleProps,
      `object`: DisplayObject[Any, Any],
      renderingService: RenderingService
    ): Unit = js.native
  }
}
