package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerQueryAttachmentsOptions extends StObject {
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryAttachments)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object FeatureLayerQueryAttachmentsOptions {
  
  inline def apply(): FeatureLayerQueryAttachmentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerQueryAttachmentsOptions]
  }
  
  extension [Self <: FeatureLayerQueryAttachmentsOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
