package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageServiceIdentifyParametersProperties extends StObject {
  
  /**
    * Input geometry that defines the location to be identified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[PointProperties | PolygonProperties] = js.undefined
  
  /**
    * Controls the maximum number of returned catalog items, set to 1 to return the top most raster only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#maxItemCount)
    */
  var maxItemCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the mosaic rules defining the image sorting order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  
  /**
    * Specifies the pixel level being identified on the x and y axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSize)
    */
  var pixelSize: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * Specifies the rendering rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
    * An array the [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule) to retrieve multiple processed pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRules)
    */
  var renderingRules: js.UndefOr[RasterFunctionProperties] = js.undefined
  
  /**
    * If `true`, returns both geometry and attributes of the catalog items.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnCatalogItems)
    */
  var returnCatalogItems: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, each feature in the catalog items includes the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnGeometry)
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the pixel values of all raster catalog items under the requested geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnPixelValues)
    */
  var returnPixelValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A time extent for a temporal data against [time-aware imagery layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#timeInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
}
object ImageServiceIdentifyParametersProperties {
  
  inline def apply(): ImageServiceIdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageServiceIdentifyParametersProperties]
  }
  
  extension [Self <: ImageServiceIdentifyParametersProperties](x: Self) {
    
    inline def setGeometry(value: PointProperties | PolygonProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setMaxItemCount(value: Double): Self = StObject.set(x, "maxItemCount", value.asInstanceOf[js.Any])
    
    inline def setMaxItemCountUndefined: Self = StObject.set(x, "maxItemCount", js.undefined)
    
    inline def setMosaicRule(value: MosaicRuleProperties): Self = StObject.set(x, "mosaicRule", value.asInstanceOf[js.Any])
    
    inline def setMosaicRuleUndefined: Self = StObject.set(x, "mosaicRule", js.undefined)
    
    inline def setPixelSize(value: PointProperties): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
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
