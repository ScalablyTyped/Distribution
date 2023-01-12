package typings.antvGSvg

import typings.antvGLite.distCameraInterfacesMod.ICamera
import typings.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typings.antvGLite.distDisplayObjectsImageMod.ParsedImageStyleProps
import typings.antvGLite.distDisplayObjectsLineMod.ParsedLineStyleProps
import typings.antvGLite.distDisplayObjectsPathMod.ParsedPathStyleProps
import typings.antvGLite.distDisplayObjectsPolylineMod.ParsedPolylineStyleProps
import typings.antvGLite.distDisplayObjectsRectMod.ParsedRectStyleProps
import typings.antvGLite.distDisplayObjectsTextMod.ParsedTextStyleProps
import typings.antvGLite.distServicesContextServiceMod.ContextService
import typings.antvGLite.distServicesRenderingContextMod.RenderingContext
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.antvGLite.distTypesMod.RendererConfig
import typings.antvGLite.distTypesMod.Shape
import typings.antvGLite.mod.AbstractRenderer
import typings.antvGLite.mod.Syringe.DefinedToken
import typings.antvGPluginSvgRenderer.anon.PartialSVGRendererPluginO
import typings.antvGPluginSvgRenderer.distShapesDefsMod.DefElementManager
import typings.antvGSvg.anon.PartialSVGRendererConfig
import typings.manaSyringe.mod.SyringeModule
import typings.std.Document
import typings.std.Record
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object DomInteraction {
    
    @JSImport("@antv/g-svg", "DomInteraction.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginDomInteraction.mod.Plugin
  }
  
  @JSImport("@antv/g-svg", "Renderer")
  @js.native
  open class Renderer () extends AbstractRenderer {
    def this(config: PartialSVGRendererConfig) = this()
  }
  
  object SVGPicker {
    
    @JSImport("@antv/g-svg", "SVGPicker.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginSvgPicker.mod.Plugin
  }
  
  object SVGRenderer {
    
    @JSImport("@antv/g-svg", "SVGRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.DEFAULT_VALUE_MAP")
    @js.native
    val DEFAULT_VALUE_MAP: Record[String, String] = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.DefaultElementLifeCycleContribution")
    @js.native
    open class DefaultElementLifeCycleContribution protected ()
      extends typings.antvGPluginSvgRenderer.mod.DefaultElementLifeCycleContribution {
      def this(canvasConfig: CanvasConfig) = this()
    }
    
    @JSImport("@antv/g-svg", "SVGRenderer.ElementLifeCycleContribution")
    @js.native
    val ElementLifeCycleContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.ElementSVG")
    @js.native
    open class ElementSVG ()
      extends typings.antvGPluginSvgRenderer.mod.ElementSVG
    /* static members */
    object ElementSVG {
      
      @JSImport("@antv/g-svg", "SVGRenderer.ElementSVG")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@antv/g-svg", "SVGRenderer.ElementSVG.tag")
      @js.native
      def tag: String = js.native
      inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@antv/g-svg", "SVGRenderer.G_SVG_PREFIX")
    @js.native
    val G_SVG_PREFIX: /* "g_svg" */ String = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.Plugin")
    @js.native
    open class Plugin ()
      extends typings.antvGPluginSvgRenderer.mod.Plugin {
      def this(options: PartialSVGRendererPluginO) = this()
    }
    
    @JSImport("@antv/g-svg", "SVGRenderer.SHAPE2TAGS")
    @js.native
    val SHAPE2TAGS: Record[Shape | String, String] = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.SHAPE_UPDATE_DEPS")
    @js.native
    val SHAPE_UPDATE_DEPS: Record[Shape | String, js.Array[String]] = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.SVGRendererPlugin")
    @js.native
    open class SVGRendererPlugin protected ()
      extends typings.antvGPluginSvgRenderer.mod.SVGRendererPlugin {
      def this(
        canvasConfig: CanvasConfig,
        camera: ICamera,
        contextService: ContextService[SVGElement],
        renderingContext: RenderingContext,
        styleValueRegistry: StyleValueRegistry,
        createElementContribution: typings.antvGPluginSvgRenderer.distTokensMod.ElementLifeCycleContribution,
        defElementManager: DefElementManager,
        pluginOptions: typings.antvGPluginSvgRenderer.distTokensMod.SVGRendererPluginOptions
      ) = this()
    }
    /* static members */
    object SVGRendererPlugin {
      
      @JSImport("@antv/g-svg", "SVGRenderer.SVGRendererPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@antv/g-svg", "SVGRenderer.SVGRendererPlugin.tag")
      @js.native
      def tag: String = js.native
      inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@antv/g-svg", "SVGRenderer.SVGRendererPluginOptions")
    @js.native
    val SVGRendererPluginOptions: DefinedToken = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.SVG_ATTR_MAP")
    @js.native
    val SVG_ATTR_MAP: Record[String, String] = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.containerModule")
    @js.native
    val containerModule: SyringeModule = js.native
    
    inline def createSVGElement(`type`: String): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGElement")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
    inline def createSVGElement(`type`: String, doc: Document): SVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createSVGElement")(`type`.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[SVGElement]
    
    inline def updateImageElementAttribute($el: SVGElement, parsedStyle: ParsedImageStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateImageElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateLineElementAttribute($el: SVGElement, parsedStyle: ParsedLineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLineElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updatePathElementAttribute($el: SVGElement, parsedStyle: ParsedPathStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePathElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updatePolylineElementAttribute($el: SVGElement, parsedStyle: ParsedPolylineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePolylineElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateRectElementAttribute($el: SVGElement, parsedStyle: ParsedRectStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRectElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateTextElementAttribute($el: SVGElement, parsedStyle: ParsedTextStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTextElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait SVGRendererConfig
    extends StObject
       with RendererConfig {
    
    /**
      * Whether to output id on SVGElement with `setAttribute` like: <circle id="g-circle-123">.
      */
    var outputSVGElementId: Boolean
  }
  object SVGRendererConfig {
    
    inline def apply(
      enableAutoRendering: Boolean,
      enableCulling: Boolean,
      enableDirtyCheck: Boolean,
      enableDirtyRectangleRendering: Boolean,
      enableDirtyRectangleRenderingDebug: Boolean,
      outputSVGElementId: Boolean
    ): SVGRendererConfig = {
      val __obj = js.Dynamic.literal(enableAutoRendering = enableAutoRendering.asInstanceOf[js.Any], enableCulling = enableCulling.asInstanceOf[js.Any], enableDirtyCheck = enableDirtyCheck.asInstanceOf[js.Any], enableDirtyRectangleRendering = enableDirtyRectangleRendering.asInstanceOf[js.Any], enableDirtyRectangleRenderingDebug = enableDirtyRectangleRenderingDebug.asInstanceOf[js.Any], outputSVGElementId = outputSVGElementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGRendererConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SVGRendererConfig] (val x: Self) extends AnyVal {
      
      inline def setOutputSVGElementId(value: Boolean): Self = StObject.set(x, "outputSVGElementId", value.asInstanceOf[js.Any])
    }
  }
}
