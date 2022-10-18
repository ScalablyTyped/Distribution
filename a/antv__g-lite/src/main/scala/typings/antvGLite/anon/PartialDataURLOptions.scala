package typings.antvGLite.anon

import typings.antvGLite.distServicesContextServiceMod.DataURLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g-lite.@antv/g-lite/dist/services/ContextService.DataURLOptions> */
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
