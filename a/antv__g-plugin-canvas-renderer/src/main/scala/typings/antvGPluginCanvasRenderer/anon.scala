package typings.antvGPluginCanvasRenderer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@antv/g-plugin-canvas-renderer.@antv/g-plugin-canvas-renderer/dist/tokens.CanvasRendererPluginOptions> */
  trait PartialCanvasRendererPlug extends StObject {
    
    var dirtyObjectNumThreshold: js.UndefOr[Double] = js.undefined
    
    var dirtyObjectRatioThreshold: js.UndefOr[Double] = js.undefined
  }
  object PartialCanvasRendererPlug {
    
    inline def apply(): PartialCanvasRendererPlug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCanvasRendererPlug]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialCanvasRendererPlug] (val x: Self) extends AnyVal {
      
      inline def setDirtyObjectNumThreshold(value: Double): Self = StObject.set(x, "dirtyObjectNumThreshold", value.asInstanceOf[js.Any])
      
      inline def setDirtyObjectNumThresholdUndefined: Self = StObject.set(x, "dirtyObjectNumThreshold", js.undefined)
      
      inline def setDirtyObjectRatioThreshold(value: Double): Self = StObject.set(x, "dirtyObjectRatioThreshold", value.asInstanceOf[js.Any])
      
      inline def setDirtyObjectRatioThresholdUndefined: Self = StObject.set(x, "dirtyObjectRatioThreshold", js.undefined)
    }
  }
}
