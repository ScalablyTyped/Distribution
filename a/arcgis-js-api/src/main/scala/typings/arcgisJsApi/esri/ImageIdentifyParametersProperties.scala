package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.PointPropertiestypepoint
import typings.arcgisJsApi.anon.PolygonPropertiestypepoly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageIdentifyParametersProperties extends StObject {
  
  /**
    * Input geometry that defines the location to be identified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[PointPropertiestypepoint | PolygonPropertiestypepoly] = js.undefined
  
  /**
    * Controls the maximum number of returned catalog items, set to 1 to return the top most raster only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#maxItemCount)
    */
  var maxItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the mosaic rules defining the image sorting order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  
  /**
    * Specifies the pixel level being identified on the x and y axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#pixelSize)
    */
  var pixelSize: js.UndefOr[PixelSize] = js.undefined
  
  /**
    * When `true`, the request is processed for all variables and dimensions.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#processAsMultidimensional)
    */
  var processAsMultidimensional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the rendering rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
    * An array the [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#renderingRule) to retrieve multiple processed pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#renderingRules)
    */
  var renderingRules: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
    * If `true`, returns both geometry and attributes of the catalog items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#returnCatalogItems)
    */
  var returnCatalogItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, each feature in the catalog items includes the geometry.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#returnGeometry)
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the pixel values of all raster catalog items under the requested geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#returnPixelValues)
    */
  var returnPixelValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A time extent for a temporal data against [time-aware imagery layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#timeInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
}
object ImageIdentifyParametersProperties {
  
  inline def apply(): ImageIdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageIdentifyParametersProperties]
  }
  
  extension [Self <: ImageIdentifyParametersProperties](x: Self) {
    
    inline def setGeometry(value: PointPropertiestypepoint | PolygonPropertiestypepoly): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setMaxItemCount(value: Double): Self = StObject.set(x, "maxItemCount", value.asInstanceOf[js.Any])
    
    inline def setMaxItemCountUndefined: Self = StObject.set(x, "maxItemCount", js.undefined)
    
    inline def setMosaicRule(value: MosaicRuleProperties): Self = StObject.set(x, "mosaicRule", value.asInstanceOf[js.Any])
    
    inline def setMosaicRuleUndefined: Self = StObject.set(x, "mosaicRule", js.undefined)
    
    inline def setPixelSize(value: PixelSize): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
    inline def setProcessAsMultidimensional(value: Boolean): Self = StObject.set(x, "processAsMultidimensional", value.asInstanceOf[js.Any])
    
    inline def setProcessAsMultidimensionalUndefined: Self = StObject.set(x, "processAsMultidimensional", js.undefined)
    
    inline def setRenderingRule(value: RasterFunctionProperties): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setRenderingRules(value: RasterFunctionProperties): Self = StObject.set(x, "renderingRules", value.asInstanceOf[js.Any])
    
    inline def setRenderingRulesUndefined: Self = StObject.set(x, "renderingRules", js.undefined)
    
    inline def setReturnCatalogItems(value: Boolean): Self = StObject.set(x, "returnCatalogItems", value.asInstanceOf[js.Any])
    
    inline def setReturnCatalogItemsUndefined: Self = StObject.set(x, "returnCatalogItems", js.undefined)
    
    inline def setReturnGeometry(value: Boolean): Self = StObject.set(x, "returnGeometry", value.asInstanceOf[js.Any])
    
    inline def setReturnGeometryUndefined: Self = StObject.set(x, "returnGeometry", js.undefined)
    
    inline def setReturnPixelValues(value: Boolean): Self = StObject.set(x, "returnPixelValues", value.asInstanceOf[js.Any])
    
    inline def setReturnPixelValuesUndefined: Self = StObject.set(x, "returnPixelValues", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
  }
}
