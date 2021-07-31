package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait templatesGetTemplatesParams
  extends StObject
     with Object {
  
  /**
    * The layer to which the suggested popup templates can be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#getTemplates)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer
  
  /**
    * Specify the renderer to be used on the layer when if it will be different than the renderer already set on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-templates.html#getTemplates)
    */
  var renderer: js.UndefOr[Renderer] = js.undefined
}
object templatesGetTemplatesParams {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): templatesGetTemplatesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[templatesGetTemplatesParams]
  }
  
  @scala.inline
  implicit class templatesGetTemplatesParamsMutableBuilder[Self <: templatesGetTemplatesParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
