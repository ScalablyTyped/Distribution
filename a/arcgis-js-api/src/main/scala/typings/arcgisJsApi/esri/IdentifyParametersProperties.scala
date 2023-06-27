package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.popup
import typings.arcgisJsApi.arcgisJsApiStrings.top_
import typings.arcgisJsApi.arcgisJsApiStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifyParametersProperties extends StObject {
  
  /**
  		 * Resolution of the current map view in dots per inch.
  		 *
  		 * @default 96
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#dpi)
  		 */
  var dpi: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Specify the geodatabase version to search.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#gdbVersion)
  		 */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
  		 * The geometry used to select features during the Identify operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#geometry)
  		 */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  
  /**
  		 * Specify the number of decimal places for the geometries returned by the task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#geometryPrecision)
  		 */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) in pixels.
  		 *
  		 * @default 400
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#height)
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The layers on which to perform the identify operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#layerIds)
  		 */
  var layerIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
  		 * Specifies which layers to use when using Identify.
  		 *
  		 * @default top
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#layerOption)
  		 */
  var layerOption: js.UndefOr[top_ | visible | all | popup] = js.undefined
  
  /**
  		 * The Extent or bounding box of the current map view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#mapExtent)
  		 */
  var mapExtent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
  		 * The maximum allowable offset used for generalizing geometries returned by the identify operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#maxAllowableOffset)
  		 */
  var maxAllowableOffset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * If `true`, field names will be returned instead of field aliases.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnFieldName)
  		 */
  var returnFieldName: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * If `true`, the result set includes the geometry associated with each result.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnGeometry)
  		 */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When `true`, indicates that M values will be returned.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnM)
  		 */
  var returnM: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * If `true`, the values in the result will not be formatted i.e.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnUnformattedValues)
  		 */
  var returnUnformattedValues: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * When `true`, indicates that z-values will be returned.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#returnZ)
  		 */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The spatial reference of the input and output geometries as well as of the [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#mapExtent).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * An [Collection](esri-core-Collection.html) of [Sublayer](esri-layers-support-Sublayer.html) objects used to change the layer ordering and/or rendering, or redefine the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#sublayers)
  		 */
  var sublayers: js.UndefOr[js.Array[SublayerProperties]] = js.undefined
  
  /**
  		 * Specify the time extent used by identify.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#timeExtent)
  		 */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
  		 * The distance in screen pixels from the specified geometry within which the identify should be performed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#tolerance)
  		 */
  var tolerance: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Width of the current map view in pixels.
  		 *
  		 * @default 400
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html#width)
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object IdentifyParametersProperties {
  
  inline def apply(): IdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifyParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentifyParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setGeometry(value: GeometryProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryPrecision(value: Double): Self = StObject.set(x, "geometryPrecision", value.asInstanceOf[js.Any])
    
    inline def setGeometryPrecisionUndefined: Self = StObject.set(x, "geometryPrecision", js.undefined)
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLayerIds(value: js.Array[Double]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    inline def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    inline def setLayerIdsVarargs(value: Double*): Self = StObject.set(x, "layerIds", js.Array(value*))
    
    inline def setLayerOption(value: top_ | visible | all | popup): Self = StObject.set(x, "layerOption", value.asInstanceOf[js.Any])
    
    inline def setLayerOptionUndefined: Self = StObject.set(x, "layerOption", js.undefined)
    
    inline def setMapExtent(value: ExtentProperties): Self = StObject.set(x, "mapExtent", value.asInstanceOf[js.Any])
    
    inline def setMapExtentUndefined: Self = StObject.set(x, "mapExtent", js.undefined)
    
    inline def setMaxAllowableOffset(value: Double): Self = StObject.set(x, "maxAllowableOffset", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableOffsetUndefined: Self = StObject.set(x, "maxAllowableOffset", js.undefined)
    
    inline def setReturnFieldName(value: Boolean): Self = StObject.set(x, "returnFieldName", value.asInstanceOf[js.Any])
    
    inline def setReturnFieldNameUndefined: Self = StObject.set(x, "returnFieldName", js.undefined)
    
    inline def setReturnGeometry(value: Boolean): Self = StObject.set(x, "returnGeometry", value.asInstanceOf[js.Any])
    
    inline def setReturnGeometryUndefined: Self = StObject.set(x, "returnGeometry", js.undefined)
    
    inline def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    inline def setReturnMUndefined: Self = StObject.set(x, "returnM", js.undefined)
    
    inline def setReturnUnformattedValues(value: Boolean): Self = StObject.set(x, "returnUnformattedValues", value.asInstanceOf[js.Any])
    
    inline def setReturnUnformattedValuesUndefined: Self = StObject.set(x, "returnUnformattedValues", js.undefined)
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setSublayers(value: js.Array[SublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    inline def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    inline def setSublayersVarargs(value: SublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value*))
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
