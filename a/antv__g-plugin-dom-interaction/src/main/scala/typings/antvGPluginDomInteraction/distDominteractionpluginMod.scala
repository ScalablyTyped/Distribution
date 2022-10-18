package typings.antvGPluginDomInteraction

import typings.antvGLite.distServicesContextServiceMod.ContextService
import typings.antvGLite.distServicesRenderingContextMod.RenderingContext
import typings.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typings.antvGLite.distServicesRenderingServiceMod.RenderingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDominteractionpluginMod {
  
  @JSImport("@antv/g-plugin-dom-interaction/dist/DOMInteractionPlugin", "DOMInteractionPlugin")
  @js.native
  open class DOMInteractionPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(contextService: ContextService[Any], renderingContext: RenderingContext) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: typings.antvGLite.mod.RenderingService): Unit = js.native
    
    /* private */ var contextService: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
  }
  /* static members */
  object DOMInteractionPlugin {
    
    @JSImport("@antv/g-plugin-dom-interaction/dist/DOMInteractionPlugin", "DOMInteractionPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-dom-interaction/dist/DOMInteractionPlugin", "DOMInteractionPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
