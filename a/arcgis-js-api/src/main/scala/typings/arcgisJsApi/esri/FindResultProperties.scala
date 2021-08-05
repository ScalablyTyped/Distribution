package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindResultProperties extends StObject {
  
  /**
    * The name of the layer's primary display field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.undefined
  
  /**
    * The found feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#feature)
    */
  var feature: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
    * The name of the field that contains the search text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#foundFieldName)
    */
  var foundFieldName: js.UndefOr[String] = js.undefined
  
  /**
    * Unique ID of the layer that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#layerId)
    */
  var layerId: js.UndefOr[Double] = js.undefined
  
  /**
    * The layer name that contains the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#layerName)
    */
  var layerName: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the `foundFieldName` in the feature's attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindResult.html#value)
    */
  var value: js.UndefOr[String] = js.undefined
}
object FindResultProperties {
  
  inline def apply(): FindResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindResultProperties]
  }
  
  extension [Self <: FindResultProperties](x: Self) {
    
    inline def setDisplayFieldName(value: String): Self = StObject.set(x, "displayFieldName", value.asInstanceOf[js.Any])
    
    inline def setDisplayFieldNameUndefined: Self = StObject.set(x, "displayFieldName", js.undefined)
    
    inline def setFeature(value: GraphicProperties): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
    
    inline def setFoundFieldName(value: String): Self = StObject.set(x, "foundFieldName", value.asInstanceOf[js.Any])
    
    inline def setFoundFieldNameUndefined: Self = StObject.set(x, "foundFieldName", js.undefined)
    
    inline def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    inline def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
