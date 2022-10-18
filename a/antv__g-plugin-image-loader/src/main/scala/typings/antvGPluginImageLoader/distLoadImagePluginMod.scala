package typings.antvGPluginImageLoader

import typings.antvGLite.distServicesRenderingContextMod.RenderingContext
import typings.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typings.antvGLite.distServicesRenderingServiceMod.RenderingService
import typings.antvGPluginImageLoader.distImagePoolMod.ImagePool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLoadImagePluginMod {
  
  @JSImport("@antv/g-plugin-image-loader/dist/LoadImagePlugin", "LoadImagePlugin")
  @js.native
  open class LoadImagePlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(imagePool: ImagePool, renderingContext: RenderingContext) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: typings.antvGLite.mod.RenderingService): Unit = js.native
    
    /* private */ var imagePool: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
  }
  /* static members */
  object LoadImagePlugin {
    
    @JSImport("@antv/g-plugin-image-loader/dist/LoadImagePlugin", "LoadImagePlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-image-loader/dist/LoadImagePlugin", "LoadImagePlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
