package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OGCFeatureLayerViewQueryFeatureCountOptions extends StObject {
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#queryFeatureCount)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object OGCFeatureLayerViewQueryFeatureCountOptions {
  
  inline def apply(): OGCFeatureLayerViewQueryFeatureCountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OGCFeatureLayerViewQueryFeatureCountOptions]
  }
  
  extension [Self <: OGCFeatureLayerViewQueryFeatureCountOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
