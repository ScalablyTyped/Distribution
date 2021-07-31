package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerFromArcGISServerUrlParams
  extends StObject
     with Object {
  
  /**
    * Set any of the layer's properties here for constructing the layer instance (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
    */
  var properties: js.UndefOr[js.Any] = js.undefined
  
  /**
    * The ArcGIS Server URL used to create the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fromArcGISServerUrl)
    */
  var url: String
}
object LayerFromArcGISServerUrlParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    url: String
  ): LayerFromArcGISServerUrlParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerFromArcGISServerUrlParams]
  }
  
  @scala.inline
  implicit class LayerFromArcGISServerUrlParamsMutableBuilder[Self <: LayerFromArcGISServerUrlParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
