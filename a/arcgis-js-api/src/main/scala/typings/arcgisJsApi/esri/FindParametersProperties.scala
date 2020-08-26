package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindParametersProperties extends js.Object {
  /**
    * Determines whether to look for an exact match of the search text or not. If `true`, searches for a value that contains the provided [searchText](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText). This is a case-insensitive search. If `false`, searches for an exact match of the [searchText](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#searchText) string. The exact match is case-sensitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#contains)
    *
    * @default true
    */
  var contains: js.UndefOr[Boolean] = js.native
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.native
  /**
    * The layers to perform the find operation on. The layers are specified as a comma-separated list of layer ids. The list of ids is returned in [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) layerInfos.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The maximum allowable offset used for generalizing geometries returned by the find operation. The offset is in the units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference). If [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference) is not defined, the spatial reference of the map is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.native
  /**
    * The spatial reference of the output geometries. If this is not specified, the output geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * If `true`, the output will include the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  /**
    * The names of the fields of a layer to search. The fields are specified as a comma-separated list of field names. If this parameter is not specified, all fields are searched by default.
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
  implicit class FindParametersPropertiesOps[Self <: FindParametersProperties] (val x: Self) extends AnyVal {
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
    def setContains(value: Boolean): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setGeometryPrecision(value: Double): Self = this.set("geometryPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryPrecision: Self = this.set("geometryPrecision", js.undefined)
    @scala.inline
    def setLayerIdsVarargs(value: Double*): Self = this.set("layerIds", js.Array(value :_*))
    @scala.inline
    def setLayerIds(value: js.Array[Double]): Self = this.set("layerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerIds: Self = this.set("layerIds", js.undefined)
    @scala.inline
    def setMaxAllowableOffset(value: Double): Self = this.set("maxAllowableOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAllowableOffset: Self = this.set("maxAllowableOffset", js.undefined)
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = this.set("outSpatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutSpatialReference: Self = this.set("outSpatialReference", js.undefined)
    @scala.inline
    def setReturnGeometry(value: Boolean): Self = this.set("returnGeometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnGeometry: Self = this.set("returnGeometry", js.undefined)
    @scala.inline
    def setSearchFieldsVarargs(value: String*): Self = this.set("searchFields", js.Array(value :_*))
    @scala.inline
    def setSearchFields(value: js.Array[String]): Self = this.set("searchFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchFields: Self = this.set("searchFields", js.undefined)
    @scala.inline
    def setSearchText(value: String): Self = this.set("searchText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchText: Self = this.set("searchText", js.undefined)
  }
  
}

