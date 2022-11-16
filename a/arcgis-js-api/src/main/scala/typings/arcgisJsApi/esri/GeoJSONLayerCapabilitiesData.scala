package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONLayerCapabilitiesData extends StObject {
  
  /**
    * Indicates if the attachment is enabled on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsAttachment: Boolean
  
  /**
    * Indicates if the features in the layer support m-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsM: Boolean
  
  /**
    * Indicates if the features in the layer support z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsZ: Boolean
}
object GeoJSONLayerCapabilitiesData {
  
  inline def apply(supportsAttachment: Boolean, supportsM: Boolean, supportsZ: Boolean): GeoJSONLayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(supportsAttachment = supportsAttachment.asInstanceOf[js.Any], supportsM = supportsM.asInstanceOf[js.Any], supportsZ = supportsZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesData]
  }
  
  extension [Self <: GeoJSONLayerCapabilitiesData](x: Self) {
    
    inline def setSupportsAttachment(value: Boolean): Self = StObject.set(x, "supportsAttachment", value.asInstanceOf[js.Any])
    
    inline def setSupportsM(value: Boolean): Self = StObject.set(x, "supportsM", value.asInstanceOf[js.Any])
    
    inline def setSupportsZ(value: Boolean): Self = StObject.set(x, "supportsZ", value.asInstanceOf[js.Any])
  }
}
