package typings.antvGLite

import typings.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typings.antvGLite.distServicesRenderingServiceMod.RenderingService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsDirtyCheckPluginMod {
  
  @JSImport("@antv/g-lite/dist/plugins/DirtyCheckPlugin", "DirtyCheckPlugin")
  @js.native
  open class DirtyCheckPlugin ()
    extends StObject
       with RenderingPlugin {
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
  }
  /* static members */
  object DirtyCheckPlugin {
    
    @JSImport("@antv/g-lite/dist/plugins/DirtyCheckPlugin", "DirtyCheckPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/plugins/DirtyCheckPlugin", "DirtyCheckPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
