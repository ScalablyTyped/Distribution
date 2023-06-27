package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageIdentifyParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Input geometry that defines the location to be identified.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#geometry)
  		 */
  var geometry: Point | Polygon = js.native
  
  /**
  		 * Controls the maximum number of returned catalog items, set to 1 to return the top most raster only.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#maxItemCount)
  		 */
  var maxItemCount: Double = js.native
  
  /**
  		 * Specifies the mosaic rules defining the image sorting order.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#mosaicRule)
  		 */
  var mosaicRule: MosaicRule = js.native
  
  /**
  		 * Specifies the pixel level being identified on the x and y axis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#pixelSize)
  		 */
  var pixelSize: PixelSize = js.native
  
  /**
  		 * When `true`, the request is processed for all variables and dimensions.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#processAsMultidimensional)
  		 */
  var processAsMultidimensional: Boolean = js.native
  
  /**
  		 * Specifies the raster function for how the requested image should be processed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#rasterFunction)
  		 */
  var rasterFunction: RasterFunction = js.native
  
  /**
  		 * An array the [raster functions](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#rasterFunction) to retrieve multiple processed pixel values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#rasterFunctions)
  		 */
  var rasterFunctions: RasterFunction = js.native
  
  /**
  		 * Specifies the rendering rule for how the requested image should be rendered.
  		 *
  		 * @deprecated since version 4.27. Use {@link module:esri/rest/support/ImageIdentifyParameters#rasterFunctions rasterFunctions} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#renderingRule)
  		 */
  var renderingRule: scala.Unit = js.native
  
  /**
  		 * An array the [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#renderingRule) to retrieve multiple processed pixel values.
  		 *
  		 * @deprecated since version 4.27. Use {@link module:esri/rest/support/ImageIdentifyParameters#rasterFunctions rasterFunctions} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#renderingRules)
  		 */
  var renderingRules: RasterFunction = js.native
  
  /**
  		 * If `true`, returns both geometry and attributes of the catalog items.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#returnCatalogItems)
  		 */
  var returnCatalogItems: Boolean = js.native
  
  /**
  		 * When `true`, each feature in the catalog items includes the geometry.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#returnGeometry)
  		 */
  var returnGeometry: Boolean = js.native
  
  /**
  		 * If `true`, the pixel values of all raster catalog items under the requested geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#returnPixelValues)
  		 */
  var returnPixelValues: Boolean = js.native
  
  /**
  		 * A time extent for a temporal data against [time-aware imagery layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#timeInfo).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html#timeExtent)
  		 */
  var timeExtent: TimeExtent = js.native
}
