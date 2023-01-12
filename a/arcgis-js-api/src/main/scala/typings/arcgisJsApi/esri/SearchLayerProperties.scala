package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchLayerProperties extends StObject {
  
  /**
    * The field to use for search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayer.html#field)
    */
  var field: js.UndefOr[SearchLayerFieldProperties] = js.undefined
  
  /**
    * The id of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayer.html#id)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The sub layer index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchLayer.html#subLayer)
    */
  var subLayer: js.UndefOr[Double] = js.undefined
}
object SearchLayerProperties {
  
  inline def apply(): SearchLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setField(value: SearchLayerFieldProperties): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSubLayer(value: Double): Self = StObject.set(x, "subLayer", value.asInstanceOf[js.Any])
    
    inline def setSubLayerUndefined: Self = StObject.set(x, "subLayer", js.undefined)
  }
}
