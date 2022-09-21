package typings.antvGPluginSvgRenderer

import typings.antvGLite.contextServiceMod.ContextService
import typings.antvGLite.cssInterfacesMod.StyleValueRegistry
import typings.antvGLite.displayObjectsPathMod.ParsedPathStyleProps
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.antvGLite.distTypesMod.Shape
import typings.antvGLite.imageMod.ParsedImageStyleProps
import typings.antvGLite.interfacesMod.ICamera
import typings.antvGLite.lineMod.ParsedLineStyleProps
import typings.antvGLite.mod.AbstractRendererPlugin
import typings.antvGLite.mod.Syringe.DefinedToken
import typings.antvGLite.polylineMod.ParsedPolylineStyleProps
import typings.antvGLite.rectMod.ParsedRectStyleProps
import typings.antvGLite.renderingContextMod.RenderingContext
import typings.antvGLite.textMod.ParsedTextStyleProps
import typings.antvGPluginSvgRenderer.anon.PartialSVGRendererPluginO
import typings.antvGPluginSvgRenderer.defsMod.DefElementManager
import typings.manaSyringe.mod.SyringeModule
import typings.std.Document
import typings.std.Record
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/g-plugin-svg-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer", "DEFAULT_VALUE_MAP")
  @js.native
  val DEFAULT_VALUE_MAP: Record[String, String] = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer", "DefaultElementLifeCycleContribution")
  @js.native
  open class DefaultElementLifeCycleContribution protected ()
    extends typings.antvGPluginSvgRenderer.defaultElementLifeCycleContributionMod.DefaultElementLifeCycleContribution {
    def this(canvasConfig: CanvasConfig) = this()
  }
  
  @JSImport("@antv/g-plugin-svg-renderer", "ElementLifeCycleContribution")
  @js.native
  val ElementLifeCycleContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer", "ElementSVG")
  @js.native
  open class ElementSVG ()
    extends typings.antvGPluginSvgRenderer.elementSVGMod.ElementSVG
  /* static members */
  object ElementSVG {
    
    @JSImport("@antv/g-plugin-svg-renderer", "ElementSVG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-svg-renderer", "ElementSVG.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g-plugin-svg-renderer", "G_SVG_PREFIX")
  @js.native
  val G_SVG_PREFIX: /* "g_svg" */ String = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer", "Plugin")
  @js.native
  open class Plugin () extends AbstractRendererPlugin {
    def this(options: PartialSVGRendererPluginO) = this()
    
    /* private */ var options: Any = js.native
  }
  
  @JSImport("@antv/g-plugin-svg-renderer", "SHAPE2TAGS")
  @js.native
  val SHAPE2TAGS: Record[Shape | String, String] = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer", "SHAPE_UPDATE_DEPS")
  @js.native
  val SHAPE_UPDATE_DEPS: Record[Shape | String, js.Array[String]] = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer", "SVGRendererPlugin")
  @js.native
  open class SVGRendererPlugin protected ()
    extends typings.antvGPluginSvgRenderer.svgrendererpluginMod.SVGRendererPlugin {
    def this(
      canvasConfig: CanvasConfig,
      camera: ICamera,
      contextService: ContextService[SVGElement],
      renderingContext: RenderingContext,
      styleValueRegistry: StyleValueRegistry,
      createElementContribution: typings.antvGPluginSvgRenderer.tokensMod.ElementLifeCycleContribution,
      defElementManager: DefElementManager,
      pluginOptions: typings.antvGPluginSvgRenderer.tokensMod.SVGRendererPluginOptions
    ) = this()
  }
  /* static members */
  object SVGRendererPlugin {
    
    @JSImport("@antv/g-plugin-svg-renderer", "SVGRendererPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-svg-renderer", "SVGRendererPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g-plugin-svg-renderer", "SVGRendererPluginOptions")
  @js.native
  val SVGRendererPluginOptions: DefinedToken = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer", "SVG_ATTR_MAP")
  @js.native
  val SVG_ATTR_MAP: Record[String, String] = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer", "containerModule")
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
