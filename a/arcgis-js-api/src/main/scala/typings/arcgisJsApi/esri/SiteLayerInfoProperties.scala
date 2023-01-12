package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteLayerInfoProperties extends StObject {
  
  /**
    * The id for an operational layer in a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html#layerId)
    */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
    * The field name from the layer that defines the site name of a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html#nameField)
    */
  var nameField: js.UndefOr[String] = js.undefined
  
  /**
    * The field name from the layer that defines a site unique ID for a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html#siteIdField)
    */
  var siteIdField: js.UndefOr[String] = js.undefined
  
  /**
    * This value references the numeric ID of the sublayer if the Site layer is a map service sublayer instead of a feature layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SiteLayerInfo.html#sublayerId)
    */
  var sublayerId: js.UndefOr[Double] = js.undefined
}
object SiteLayerInfoProperties {
  
  inline def apply(): SiteLayerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteLayerInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SiteLayerInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setNameField(value: String): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    inline def setNameFieldUndefined: Self = StObject.set(x, "nameField", js.undefined)
    
    inline def setSiteIdField(value: String): Self = StObject.set(x, "siteIdField", value.asInstanceOf[js.Any])
    
    inline def setSiteIdFieldUndefined: Self = StObject.set(x, "siteIdField", js.undefined)
    
    inline def setSublayerId(value: Double): Self = StObject.set(x, "sublayerId", value.asInstanceOf[js.Any])
    
    inline def setSublayerIdUndefined: Self = StObject.set(x, "sublayerId", js.undefined)
  }
}
