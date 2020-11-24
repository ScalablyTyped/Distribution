package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.top
import typings.arcgisJsApi.arcgisJsApiStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentifyParametersProperties extends js.Object {
  
  /**
    * Resolution of the current map view in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#dpi)
    */
  var dpi: js.UndefOr[Double] = js.native
  
  /**
    * Specify the geodatabase version to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  
  /**
    * The geometry used to select features during the Identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.native
  
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.native
  
  /**
    * Height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The layers on which to perform the identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Specifies which layers to use when using Identify.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerOption)
    */
  var layerOption: js.UndefOr[top | visible | all] = js.native
  
  /**
    * The Extent or bounding box of the current map view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent)
    */
  var mapExtent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * The maximum allowable offset used for generalizing geometries returned by the identify operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, field names will be returned instead of field aliases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnFieldName)
    */
  var returnFieldName: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the result set includes the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnGeometry)
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, indicates that M values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnM)
    */
  var returnM: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, the values in the result will not be formatted i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnUnformattedValues)
    */
  var returnUnformattedValues: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, indicates that z-values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.native
  
  /**
    * The spatial reference of the input and output geometries as well as of the [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The distance in screen pixels from the specified geometry within which the identify should be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#tolerance)
    */
  var tolerance: js.UndefOr[Double] = js.native
  
  /**
    * Width of the current map view in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}
object IdentifyParametersProperties {
  
  @scala.inline
  def apply(): IdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifyParametersProperties]
  }
  
  @scala.inline
  implicit class IdentifyParametersPropertiesOps[Self <: IdentifyParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDpi(value: Double): Self = this.set("dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpi: Self = this.set("dpi", js.undefined)
    
    @scala.inline
    def setGdbVersion(value: String): Self = this.set("gdbVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGdbVersion: Self = this.set("gdbVersion", js.undefined)
    
    @scala.inline
    def setGeometry(value: GeometryProperties): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    
    @scala.inline
    def setGeometryPrecision(value: Double): Self = this.set("geometryPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometryPrecision: Self = this.set("geometryPrecision", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: Double*): Self = this.set("layerIds", js.Array(value :_*))
    
    @scala.inline
    def setLayerIds(value: js.Array[Double]): Self = this.set("layerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerIds: Self = this.set("layerIds", js.undefined)
    
    @scala.inline
    def setLayerOption(value: top | visible | all): Self = this.set("layerOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerOption: Self = this.set("layerOption", js.undefined)
    
    @scala.inline
    def setMapExtent(value: ExtentProperties): Self = this.set("mapExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapExtent: Self = this.set("mapExtent", js.undefined)
    
    @scala.inline
    def setMaxAllowableOffset(value: Double): Self = this.set("maxAllowableOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAllowableOffset: Self = this.set("maxAllowableOffset", js.undefined)
    
    @scala.inline
    def setReturnFieldName(value: Boolean): Self = this.set("returnFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFieldName: Self = this.set("returnFieldName", js.undefined)
    
    @scala.inline
    def setReturnGeometry(value: Boolean): Self = this.set("returnGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnGeometry: Self = this.set("returnGeometry", js.undefined)
    
    @scala.inline
    def setReturnM(value: Boolean): Self = this.set("returnM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnM: Self = this.set("returnM", js.undefined)
    
    @scala.inline
    def setReturnUnformattedValues(value: Boolean): Self = this.set("returnUnformattedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnUnformattedValues: Self = this.set("returnUnformattedValues", js.undefined)
    
    @scala.inline
    def setReturnZ(value: Boolean): Self = this.set("returnZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnZ: Self = this.set("returnZ", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
