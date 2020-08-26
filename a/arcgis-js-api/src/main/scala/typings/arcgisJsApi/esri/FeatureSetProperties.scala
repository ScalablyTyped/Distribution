package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.extent
import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureSetProperties extends js.Object {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature. This is only applicable when the FeatureSet is returned from a task. It is ignored when the FeatureSet is used as input to a geoprocessing task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.native
  /**
    * Typically, a layer has a limit on the number of features (i.e., records) returned by the query operation. If `maxRecordCount` is configured for a layer, `exceededTransferLimit` will be `true` if a query matches more than the `maxRecordCount` features. It will be `false` otherwise. Supported by ArcGIS Server version 10.1 and later.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#exceededTransferLimit)
    */
  var exceededTransferLimit: js.UndefOr[Boolean] = js.native
  /**
    * The array of graphics returned from a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.native
  /**
    * Information about each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.native
  /**
    * The geometry type of features in the FeatureSet. All features's geometry must be of the same type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#geometryType)
    */
  var geometryType: js.UndefOr[point | multipoint | polyline | polygon | extent | mesh] = js.native
  /**
    * The [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) used to query the features. It is useful for getting the buffer geometry generated when querying features by [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#distance) or getting the query geometry projected in the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) of the query. The query geometry is returned only for [client-side queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) and [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm). The query's [returnQueryGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnQueryGeometry) must be set to `true` and the layer's [capabilities.query.supportsQueryGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) has to be `true` for the query to return query geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry)
    */
  var queryGeometry: js.UndefOr[GeometryProperties] = js.native
  /**
    * When a FeatureSet is used as input to Geoprocessor, the spatial reference is set to the map's spatial reference by default. This value can be changed. When a FeatureSet is returned from a task, the value is the result as returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
}

object FeatureSetProperties {
  @scala.inline
  def apply(): FeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureSetProperties]
  }
  @scala.inline
  implicit class FeatureSetPropertiesOps[Self <: FeatureSetProperties] (val x: Self) extends AnyVal {
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
    def setDisplayFieldName(value: String): Self = this.set("displayFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayFieldName: Self = this.set("displayFieldName", js.undefined)
    @scala.inline
    def setExceededTransferLimit(value: Boolean): Self = this.set("exceededTransferLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExceededTransferLimit: Self = this.set("exceededTransferLimit", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: GraphicProperties*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[GraphicProperties]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: FieldProperties*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[FieldProperties]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGeometryType(value: point | multipoint | polyline | polygon | extent | mesh): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryType: Self = this.set("geometryType", js.undefined)
    @scala.inline
    def setQueryGeometry(value: GeometryProperties): Self = this.set("queryGeometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryGeometry: Self = this.set("queryGeometry", js.undefined)
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
  }
  
}

