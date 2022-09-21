package typings.antvGPluginImageLoader

import typings.antvGLite.distTypesMod.CanvasConfig
import typings.antvGLite.mod.AbstractRendererPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@antv/g-plugin-image-loader", "ImagePool")
  @js.native
  open class ImagePool protected ()
    extends typings.antvGPluginImageLoader.imagePoolMod.ImagePool {
    def this(canvasConfig: CanvasConfig) = this()
  }
  
  @JSImport("@antv/g-plugin-image-loader", "Plugin")
  @js.native
  open class Plugin () extends AbstractRendererPlugin
}
