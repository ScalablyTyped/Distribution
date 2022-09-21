package typings.antvGPluginCanvasRenderer

import typings.antvGLite.mod.AbstractRendererPlugin
import typings.antvGLite.mod.Syringe.DefinedToken
import typings.antvGPluginCanvasRenderer.anon.PartialCanvasRendererPlug
import typings.antvGPluginImageLoader.mod.ImagePool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/g-plugin-canvas-renderer", "CircleRenderer")
  @js.native
  open class CircleRenderer protected ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.CircleRenderer {
    def this(imagePool: ImagePool) = this()
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "CircleRendererContribution")
  @js.native
  val CircleRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "EllipseRenderer")
  @js.native
  open class EllipseRenderer protected ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.EllipseRenderer {
    def this(imagePool: ImagePool) = this()
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "EllipseRendererContribution")
  @js.native
  val EllipseRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "ImageRenderer")
  @js.native
  open class ImageRenderer protected ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.ImageRenderer {
    def this(imagePool: ImagePool) = this()
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "ImageRendererContribution")
  @js.native
  val ImageRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "LineRenderer")
  @js.native
  open class LineRenderer protected ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.LineRenderer {
    def this(imagePool: ImagePool) = this()
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "LineRendererContribution")
  @js.native
  val LineRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "PathRenderer")
  @js.native
  open class PathRenderer protected ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.PathRenderer {
    def this(imagePool: ImagePool) = this()
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "PathRendererContribution")
  @js.native
  val PathRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "Plugin")
  @js.native
  open class Plugin () extends AbstractRendererPlugin {
    def this(options: PartialCanvasRendererPlug) = this()
    
    /* private */ var options: Any = js.native
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "PolygonRenderer")
  @js.native
  open class PolygonRenderer protected ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.PolygonRenderer {
    def this(imagePool: ImagePool) = this()
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "PolygonRendererContribution")
  @js.native
  val PolygonRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "PolylineRenderer")
  @js.native
  open class PolylineRenderer protected ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.PolylineRenderer {
    def this(imagePool: ImagePool) = this()
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "PolylineRendererContribution")
  @js.native
  val PolylineRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "RectRenderer")
  @js.native
  open class RectRenderer protected ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.RectRenderer {
    def this(imagePool: ImagePool) = this()
  }
  
  @JSImport("@antv/g-plugin-canvas-renderer", "RectRendererContribution")
  @js.native
  val RectRendererContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "StyleRendererFactory")
  @js.native
  val StyleRendererFactory: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer", "TextRenderer")
  @js.native
  open class TextRenderer ()
    extends typings.antvGPluginCanvasRenderer.stylesMod.TextRenderer
  
  @JSImport("@antv/g-plugin-canvas-renderer", "TextRendererContribution")
  @js.native
  val TextRendererContribution: DefinedToken = js.native
}
