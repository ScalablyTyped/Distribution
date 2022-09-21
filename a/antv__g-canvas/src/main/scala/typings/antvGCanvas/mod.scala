package typings.antvGCanvas

import typings.antvGCanvas.anon.PartialRendererConfig
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.antvGLite.mod.AbstractRenderer
import typings.antvGLite.mod.Syringe.DefinedToken
import typings.antvGPluginCanvasRenderer.anon.PartialCanvasRendererPlug
import typings.antvGPluginImageLoader.mod.ImagePool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object CanvasPathGenerator {
    
    @JSImport("@antv/g-canvas", "CanvasPathGenerator.PathGenerator")
    @js.native
    val PathGenerator: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasPathGenerator.PathGeneratorFactory")
    @js.native
    val PathGeneratorFactory: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasPathGenerator.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginCanvasPathGenerator.mod.Plugin
  }
  
  object CanvasPicker {
    
    @JSImport("@antv/g-canvas", "CanvasPicker.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginCanvasPicker.mod.Plugin
  }
  
  object CanvasRenderer {
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.CircleRenderer")
    @js.native
    open class CircleRenderer protected ()
      extends typings.antvGPluginCanvasRenderer.mod.CircleRenderer {
      def this(imagePool: ImagePool) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.CircleRendererContribution")
    @js.native
    val CircleRendererContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.EllipseRenderer")
    @js.native
    open class EllipseRenderer protected ()
      extends typings.antvGPluginCanvasRenderer.mod.EllipseRenderer {
      def this(imagePool: ImagePool) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.EllipseRendererContribution")
    @js.native
    val EllipseRendererContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.ImageRenderer")
    @js.native
    open class ImageRenderer protected ()
      extends typings.antvGPluginCanvasRenderer.mod.ImageRenderer {
      def this(imagePool: ImagePool) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.ImageRendererContribution")
    @js.native
    val ImageRendererContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.LineRenderer")
    @js.native
    open class LineRenderer protected ()
      extends typings.antvGPluginCanvasRenderer.mod.LineRenderer {
      def this(imagePool: ImagePool) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.LineRendererContribution")
    @js.native
    val LineRendererContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.PathRenderer")
    @js.native
    open class PathRenderer protected ()
      extends typings.antvGPluginCanvasRenderer.mod.PathRenderer {
      def this(imagePool: ImagePool) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.PathRendererContribution")
    @js.native
    val PathRendererContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginCanvasRenderer.mod.Plugin {
      def this(options: PartialCanvasRendererPlug) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.PolygonRenderer")
    @js.native
    open class PolygonRenderer protected ()
      extends typings.antvGPluginCanvasRenderer.mod.PolygonRenderer {
      def this(imagePool: ImagePool) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.PolygonRendererContribution")
    @js.native
    val PolygonRendererContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.PolylineRenderer")
    @js.native
    open class PolylineRenderer protected ()
      extends typings.antvGPluginCanvasRenderer.mod.PolylineRenderer {
      def this(imagePool: ImagePool) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.PolylineRendererContribution")
    @js.native
    val PolylineRendererContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.RectRenderer")
    @js.native
    open class RectRenderer protected ()
      extends typings.antvGPluginCanvasRenderer.mod.RectRenderer {
      def this(imagePool: ImagePool) = this()
    }
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.RectRendererContribution")
    @js.native
    val RectRendererContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.StyleRendererFactory")
    @js.native
    val StyleRendererFactory: DefinedToken = js.native
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.TextRenderer")
    @js.native
    open class TextRenderer ()
      extends typings.antvGPluginCanvasRenderer.mod.TextRenderer
    
    @JSImport("@antv/g-canvas", "CanvasRenderer.TextRendererContribution")
    @js.native
    val TextRendererContribution: DefinedToken = js.native
  }
  
  object DomInteraction {
    
    @JSImport("@antv/g-canvas", "DomInteraction.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginDomInteraction.mod.Plugin
  }
  
  object HTMLRenderer {
    
    @JSImport("@antv/g-canvas", "HTMLRenderer.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginHtmlRenderer.mod.Plugin
  }
  
  object ImageLoader {
    
    @JSImport("@antv/g-canvas", "ImageLoader.ImagePool")
    @js.native
    open class ImagePool protected ()
      extends typings.antvGPluginImageLoader.mod.ImagePool {
      def this(canvasConfig: CanvasConfig) = this()
    }
    
    @JSImport("@antv/g-canvas", "ImageLoader.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginImageLoader.mod.Plugin
  }
  
  @JSImport("@antv/g-canvas", "Renderer")
  @js.native
  open class Renderer () extends AbstractRenderer {
    def this(config: PartialRendererConfig) = this()
  }
}
