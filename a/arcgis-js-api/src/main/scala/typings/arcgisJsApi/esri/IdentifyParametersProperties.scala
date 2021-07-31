package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.top
import typings.arcgisJsApi.arcgisJsApiStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifyParametersProperties extends StObject {
  
  /**
    * Resolution of the current map view in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#dpi)
    */
  var dpi: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify the geodatabase version to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The geometry used to select features during the Identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.undefined
  
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
    * Height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#height)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The layers on which to perform the identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Specifies which layers to use when using Identify.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerOption)
    */
  var layerOption: js.UndefOr[top | visible | all] = js.undefined
  
  /**
    * The Extent or bounding box of the current map view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent)
    */
  var mapExtent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * The maximum allowable offset used for generalizing geometries returned by the identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * If `true`, field names will be returned instead of field aliases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnFieldName)
    */
  var returnFieldName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the result set includes the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnGeometry)
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, indicates that M values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnM)
    */
  var returnM: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the values in the result will not be formatted i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnUnformattedValues)
    */
  var returnUnformattedValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, indicates that z-values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The spatial reference of the input and output geometries as well as of the [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The distance in screen pixels from the specified geometry within which the identify should be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#tolerance)
    */
  var tolerance: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the current map view in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object IdentifyParametersProperties {
  
  @scala.inline
  def apply(): IdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifyParametersProperties]
  }
  
  @scala.inline
  implicit class IdentifyParametersPropertiesMutableBuilder[Self <: IdentifyParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    @scala.inline
    def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    @scala.inline
    def setGeometry(value: GeometryProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryPrecision(value: Double): Self = StObject.set(x, "geometryPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryPrecisionUndefined: Self = StObject.set(x, "geometryPrecision", js.undefined)
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLayerIds(value: js.Array[Double]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: Double*): Self = StObject.set(x, "layerIds", js.Array(value :_*))
    
    @scala.inline
    def setLayerOption(value: top | visible | all): Self = StObject.set(x, "layerOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerOptionUndefined: Self = StObject.set(x, "layerOption", js.undefined)
    
    @scala.inline
    def setMapExtent(value: ExtentProperties): Self = StObject.set(x, "mapExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapExtentUndefined: Self = StObject.set(x, "mapExtent", js.undefined)
    
    @scala.inline
    def setMaxAllowableOffset(value: Double): Self = StObject.set(x, "maxAllowableOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllowableOffsetUndefined: Self = StObject.set(x, "maxAllowableOffset", js.undefined)
    
    @scala.inline
    def setReturnFieldName(value: Boolean): Self = StObject.set(x, "returnFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnFieldNameUndefined: Self = StObject.set(x, "returnFieldName", js.undefined)
    
    @scala.inline
    def setReturnGeometry(value: Boolean): Self = StObject.set(x, "returnGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnGeometryUndefined: Self = StObject.set(x, "returnGeometry", js.undefined)
    
    @scala.inline
    def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnMUndefined: Self = StObject.set(x, "returnM", js.undefined)
    
    @scala.inline
    def setReturnUnformattedValues(value: Boolean): Self = StObject.set(x, "returnUnformattedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnUnformattedValuesUndefined: Self = StObject.set(x, "returnUnformattedValues", js.undefined)
    
    @scala.inline
    def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
