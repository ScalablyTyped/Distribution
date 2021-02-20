package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindParametersProperties extends StObject {
  
  /**
    * Determines whether to look for an exact match of the search text or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#contains)
    */
  var contains: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the geodatabase version to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.native
  
  /**
    * The layers to perform the find operation on.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The maximum allowable offset used for generalizing geometries returned by the find operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.native
  
  /**
    * The spatial reference of the output geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * If `true`, the output will include the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#returnGeometry)
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  
  /**
    * The names of the fields of a layer to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchFields)
    */
  var searchFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The text that is searched across the layers and the fields as specified in the `layers` and [searchFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchFields) properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText)
    */
  var searchText: js.UndefOr[String] = js.native
}
object FindParametersProperties {
  
  @scala.inline
  def apply(): FindParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindParametersProperties]
  }
  
  @scala.inline
  implicit class FindParametersPropertiesMutableBuilder[Self <: FindParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    @scala.inline
    def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    @scala.inline
    def setGeometryPrecision(value: Double): Self = StObject.set(x, "geometryPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryPrecisionUndefined: Self = StObject.set(x, "geometryPrecision", js.undefined)
    
    @scala.inline
    def setLayerIds(value: js.Array[Double]): Self = StObject.set(x, "layerIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdsUndefined: Self = StObject.set(x, "layerIds", js.undefined)
    
    @scala.inline
    def setLayerIdsVarargs(value: Double*): Self = StObject.set(x, "layerIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxAllowableOffset(value: Double): Self = StObject.set(x, "maxAllowableOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAllowableOffsetUndefined: Self = StObject.set(x, "maxAllowableOffset", js.undefined)
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    @scala.inline
    def setReturnGeometry(value: Boolean): Self = StObject.set(x, "returnGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnGeometryUndefined: Self = StObject.set(x, "returnGeometry", js.undefined)
    
    @scala.inline
    def setSearchFields(value: js.Array[String]): Self = StObject.set(x, "searchFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFieldsUndefined: Self = StObject.set(x, "searchFields", js.undefined)
    
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = StObject.set(x, "searchFields", js.Array(value :_*))
    
    @scala.inline
    def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
  }
}
