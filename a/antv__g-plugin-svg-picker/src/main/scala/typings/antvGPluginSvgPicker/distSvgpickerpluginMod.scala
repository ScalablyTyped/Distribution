package typings.antvGPluginSvgPicker

import typings.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typings.antvGLite.distServicesRenderingServiceMod.RenderingService
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.antvGLite.mod.DisplayObjectPool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSvgpickerpluginMod {
  
  @JSImport("@antv/g-plugin-svg-picker/dist/SVGPickerPlugin", "SVGPickerPlugin")
  @js.native
  open class SVGPickerPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(canvasConfig: CanvasConfig, displayObjectPool: DisplayObjectPool) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: typings.antvGLite.mod.RenderingService): Unit = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var displayObjectPool: Any = js.native
    
    /* private */ var pick: Any = js.native
  }
  /* static members */
  object SVGPickerPlugin {
    
    @JSImport("@antv/g-plugin-svg-picker/dist/SVGPickerPlugin", "SVGPickerPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-svg-picker/dist/SVGPickerPlugin", "SVGPickerPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
