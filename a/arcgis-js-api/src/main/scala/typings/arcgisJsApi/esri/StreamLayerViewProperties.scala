package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLayerViewProperties
  extends StObject
     with LayerViewProperties {
  
  /**
    * The effect applied to the layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#effect)
    */
  var effect: js.UndefOr[FeatureEffectProperties] = js.undefined
  
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
}
object StreamLayerViewProperties {
  
  inline def apply(): StreamLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLayerViewProperties]
  }
  
  extension [Self <: StreamLayerViewProperties](x: Self) {
    
    inline def setEffect(value: FeatureEffectProperties): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setFilter(value: FeatureFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
