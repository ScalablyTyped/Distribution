package typings.antvGLite

import typings.antvGLite.cssInterfacesMod.StyleValueRegistry
import typings.antvGLite.rbushnodeMod.RBushNodeAABB
import typings.antvGLite.renderingContextMod.RenderingContext
import typings.antvGLite.renderingServiceMod.RenderingPlugin
import typings.antvGLite.renderingServiceMod.RenderingService
import typings.antvGLite.servicesInterfacesMod.SceneGraphService
import typings.rbush.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prepareRendererPluginMod {
  
  @JSImport("@antv/g-lite/dist/plugins/PrepareRendererPlugin", "PrepareRendererPlugin")
  @js.native
  open class PrepareRendererPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(
      renderingContext: RenderingContext,
      styleValueRegistry: StyleValueRegistry,
      sceneGraphService: SceneGraphService,
      /**
      * RBush used in dirty rectangle rendering
      */
    rBush: default[RBushNodeAABB]
    ) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: typings.antvGLite.servicesMod.RenderingService): Unit = js.native
    
    /* private */ var pushToSync: Any = js.native
    
    /**
      * RBush used in dirty rectangle rendering
      */
    /* private */ var rBush: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
    
    /* private */ var sceneGraphService: Any = js.native
    
    /* private */ var styleValueRegistry: Any = js.native
    
    /* private */ var syncRTree: Any = js.native
    
    /**
      * sync to RBush later
      */
    /* private */ var toSync: Any = js.native
  }
  /* static members */
  object PrepareRendererPlugin {
    
    @JSImport("@antv/g-lite/dist/plugins/PrepareRendererPlugin", "PrepareRendererPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/plugins/PrepareRendererPlugin", "PrepareRendererPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
