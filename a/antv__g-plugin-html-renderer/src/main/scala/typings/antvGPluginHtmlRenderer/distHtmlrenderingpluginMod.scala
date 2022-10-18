package typings.antvGPluginHtmlRenderer

import typings.antvGLite.distServicesContextServiceMod.ContextService
import typings.antvGLite.distServicesRenderingContextMod.RenderingContext
import typings.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typings.antvGLite.distServicesRenderingServiceMod.RenderingService
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHtmlrenderingpluginMod {
  
  @JSImport("@antv/g-plugin-html-renderer/dist/HTMLRenderingPlugin", "HTMLRenderingPlugin")
  @js.native
  open class HTMLRenderingPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(
      contextService: ContextService[CanvasRenderingContext2D],
      renderingContext: RenderingContext,
      canvasConfig: CanvasConfig
    ) = this()
    
    /* private */ @JSName("$camera")
    var $camera: Any = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: typings.antvGLite.mod.RenderingService): Unit = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var contextService: Any = js.native
    
    /* private */ var getId: Any = js.native
    
    /* private */ var getOrCreateEl: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
    
    /* private */ var updateAttribute: Any = js.native
  }
  /* static members */
  object HTMLRenderingPlugin {
    
    @JSImport("@antv/g-plugin-html-renderer/dist/HTMLRenderingPlugin", "HTMLRenderingPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-html-renderer/dist/HTMLRenderingPlugin", "HTMLRenderingPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
