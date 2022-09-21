package typings.antvGPluginCanvasRenderer

import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.mod.DisplayObject
import typings.antvGLite.mod.RenderingService
import typings.antvGLite.textMod.ParsedTextStyleProps
import typings.antvGPluginCanvasRenderer.interfacesMod.StyleRenderer
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/Text", "TextRenderer")
  @js.native
  open class TextRenderer ()
    extends StObject
       with StyleRenderer {
    
    /* private */ var drawLetterSpacing: Any = js.native
    
    /* private */ var fillText: Any = js.native
    
    /* CompleteClass */
    override def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedBaseStyleProps,
      `object`: DisplayObject[Any, Any],
      renderingService: RenderingService
    ): Unit = js.native
    def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedTextStyleProps,
      `object`: DisplayObject[Any, Any]
    ): Unit = js.native
    
    /* private */ var strokeText: Any = js.native
  }
}
