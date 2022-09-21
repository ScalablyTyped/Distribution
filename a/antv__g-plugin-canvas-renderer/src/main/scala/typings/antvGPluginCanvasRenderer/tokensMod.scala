package typings.antvGPluginCanvasRenderer

import typings.antvGLite.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  trait CanvasRendererPluginOptions extends StObject {
    
    var dirtyObjectNumThreshold: Double
    
    var dirtyObjectRatioThreshold: Double
  }
  object CanvasRendererPluginOptions {
    
    @JSImport("@antv/g-plugin-canvas-renderer/dist/tokens", "CanvasRendererPluginOptions")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: CanvasRendererPluginOptions](x: Self) {
      
      inline def setDirtyObjectNumThreshold(value: Double): Self = StObject.set(x, "dirtyObjectNumThreshold", value.asInstanceOf[js.Any])
      
      inline def setDirtyObjectRatioThreshold(value: Double): Self = StObject.set(x, "dirtyObjectRatioThreshold", value.asInstanceOf[js.Any])
    }
  }
}
