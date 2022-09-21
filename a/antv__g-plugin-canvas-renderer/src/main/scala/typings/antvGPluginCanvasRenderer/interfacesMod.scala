package typings.antvGPluginCanvasRenderer

import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.mod.DisplayObject
import typings.antvGLite.mod.RenderingService
import typings.antvGLite.mod.Syringe.DefinedToken
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "CircleRendererContribution")
  @js.native
  val CircleRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "EllipseRendererContribution")
  @js.native
  val EllipseRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "ImageRendererContribution")
  @js.native
  val ImageRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "LineRendererContribution")
  @js.native
  val LineRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "PathRendererContribution")
  @js.native
  val PathRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "PolygonRendererContribution")
  @js.native
  val PolygonRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "PolylineRendererContribution")
  @js.native
  val PolylineRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "RectRendererContribution")
  @js.native
  val RectRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "StyleRendererFactory")
  @js.native
  val StyleRendererFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/interfaces", "TextRendererContribution")
  @js.native
  val TextRendererContribution: DefinedToken = js.native
  
  trait StyleRenderer extends StObject {
    
    def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedBaseStyleProps,
      `object`: DisplayObject[Any, Any],
      renderingService: RenderingService
    ): Unit
  }
  object StyleRenderer {
    
    inline def apply(
      render: (CanvasRenderingContext2D, ParsedBaseStyleProps, DisplayObject[Any, Any], RenderingService) => Unit
    ): StyleRenderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction4(render))
      __obj.asInstanceOf[StyleRenderer]
    }
    
    extension [Self <: StyleRenderer](x: Self) {
      
      inline def setRender(
        value: (CanvasRenderingContext2D, ParsedBaseStyleProps, DisplayObject[Any, Any], RenderingService) => Unit
      ): Self = StObject.set(x, "render", js.Any.fromFunction4(value))
    }
  }
}
