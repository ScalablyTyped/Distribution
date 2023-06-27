package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerBaseQueryRelatedFeaturesOptions extends StObject {
  
  /**
  		 * Signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#queryRelatedFeatures)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object FeatureLayerBaseQueryRelatedFeaturesOptions {
  
  inline def apply(): FeatureLayerBaseQueryRelatedFeaturesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerBaseQueryRelatedFeaturesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerBaseQueryRelatedFeaturesOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
