package typings.antvGSvg

import typings.antvGLite.contextServiceMod.DataURLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@antv/g-lite.@antv/g-lite.DataURLOptions> */
  trait PartialDataURLOptions extends StObject {
    
    var encoderOptions: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[DataURLType] = js.undefined
  }
  object PartialDataURLOptions {
    
    inline def apply(): PartialDataURLOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDataURLOptions]
    }
    
    extension [Self <: PartialDataURLOptions](x: Self) {
      
      inline def setEncoderOptions(value: Double): Self = StObject.set(x, "encoderOptions", value.asInstanceOf[js.Any])
      
      inline def setEncoderOptionsUndefined: Self = StObject.set(x, "encoderOptions", js.undefined)
      
      inline def setType(value: DataURLType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@antv/g-svg.@antv/g-svg.SVGRendererConfig> */
  trait PartialSVGRendererConfig extends StObject {
    
    var enableAutoRendering: js.UndefOr[Boolean] = js.undefined
    
    var enableCulling: js.UndefOr[Boolean] = js.undefined
    
    var enableDirtyCheck: js.UndefOr[Boolean] = js.undefined
    
    var enableDirtyRectangleRendering: js.UndefOr[Boolean] = js.undefined
    
    var enableDirtyRectangleRenderingDebug: js.UndefOr[Boolean] = js.undefined
    
    var outputSVGElementId: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSVGRendererConfig {
    
    inline def apply(): PartialSVGRendererConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSVGRendererConfig]
    }
    
    extension [Self <: PartialSVGRendererConfig](x: Self) {
      
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
      
      inline def setOutputSVGElementId(value: Boolean): Self = StObject.set(x, "outputSVGElementId", value.asInstanceOf[js.Any])
      
      inline def setOutputSVGElementIdUndefined: Self = StObject.set(x, "outputSVGElementId", js.undefined)
    }
  }
}
