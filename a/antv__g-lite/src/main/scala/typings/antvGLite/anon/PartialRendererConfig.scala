package typings.antvGLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g-lite.@antv/g-lite/dist/types.RendererConfig> */
trait PartialRendererConfig extends StObject {
  
  var enableAutoRendering: js.UndefOr[Boolean] = js.undefined
  
  var enableCulling: js.UndefOr[Boolean] = js.undefined
  
  var enableDirtyCheck: js.UndefOr[Boolean] = js.undefined
  
  var enableDirtyRectangleRendering: js.UndefOr[Boolean] = js.undefined
  
  var enableDirtyRectangleRenderingDebug: js.UndefOr[Boolean] = js.undefined
}
object PartialRendererConfig {
  
  inline def apply(): PartialRendererConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRendererConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRendererConfig] (val x: Self) extends AnyVal {
    
    inline def setEnableAutoRendering(value: Boolean): Self = StObject.set(x, "enableAutoRendering", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoRenderingUndefined: Self = StObject.set(x, "enableAutoRendering", js.undefined)
    
    inline def setEnableCulling(value: Boolean): Self = StObject.set(x, "enableCulling", value.asInstanceOf[js.Any])
    
    inline def setEnableCullingUndefined: Self = StObject.set(x, "enableCulling", js.undefined)
    
    inline def setEnableDirtyCheck(value: Boolean): Self = StObject.set(x, "enableDirtyCheck", value.asInstanceOf[js.Any])
    
    inline def setEnableDirtyCheckUndefined: Self = StObject.set(x, "enableDirtyCheck", js.undefined)
    
    inline def setEnableDirtyRectangleRendering(value: Boolean): Self = StObject.set(x, "enableDirtyRectangleRendering", value.asInstanceOf[js.Any])
    
    inline def setEnableDirtyRectangleRenderingDebug(value: Boolean): Self = StObject.set(x, "enableDirtyRectangleRenderingDebug", value.asInstanceOf[js.Any])
    
    inline def setEnableDirtyRectangleRenderingDebugUndefined: Self = StObject.set(x, "enableDirtyRectangleRenderingDebug", js.undefined)
    
    inline def setEnableDirtyRectangleRenderingUndefined: Self = StObject.set(x, "enableDirtyRectangleRendering", js.undefined)
  }
}
