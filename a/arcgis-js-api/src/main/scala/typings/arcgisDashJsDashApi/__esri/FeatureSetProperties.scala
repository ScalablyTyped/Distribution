package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureSetProperties extends js.Object {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature. This is only applicable when the FeatureSet is returned from a task. It is ignored when the FeatureSet is used as input to a geoprocessing task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#displayFieldName)
    */
  var displayFieldName: js.UndefOr[String] = js.undefined
  /**
    * Typically, a layer has a limit on the number of features (i.e., records) returned by the query operation. If `maxRecordCount` is configured for a layer, `exceededTransferLimit` will be `true` if a query matches more than the `maxRecordCount` features. It will be `false` otherwise. Supported by ArcGIS Server version 10.1 and later.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#exceededTransferLimit)
    */
  var exceededTransferLimit: js.UndefOr[Boolean] = js.undefined
  /**
    * The array of graphics returned from a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#features)
    */
  var features: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  /**
    * Information about each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  /**
    * The geometry type of features in the FeatureSet. All features's geometry must be of the same type.  **Possible Values:** point | multipoint | polyline | polygon | multipatch | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#geometryType)
    */
  var geometryType: js.UndefOr[String] = js.undefined
  /**
    * The [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) used to query the features. It is useful for getting the buffer geometry generated when querying features by [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#distance) or getting the query geometry projected in the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) of the query. The query geometry is returned only for [client-side queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) and [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm). The query's [returnQueryGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnQueryGeometry) must be set to `true` and the layer's [capabilities.query.supportsQueryGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) has to be `true` for the query to return query geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry)
    */
  var queryGeometry: js.UndefOr[GeometryProperties] = js.undefined
  /**
    * When a FeatureSet is used as input to Geoprocessor, the spatial reference is set to the map's spatial reference by default. This value can be changed. When a FeatureSet is returned from a task, the value is the result as returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}

object FeatureSetProperties {
  @scala.inline
  def apply(
    displayFieldName: String = null,
    exceededTransferLimit: js.UndefOr[Boolean] = js.undefined,
    features: js.Array[GraphicProperties] = null,
    fields: js.Array[FieldProperties] = null,
    geometryType: String = null,
    queryGeometry: GeometryProperties = null,
    spatialReference: SpatialReferenceProperties = null
  ): FeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    if (displayFieldName != null) __obj.updateDynamic("displayFieldName")(displayFieldName)
    if (!js.isUndefined(exceededTransferLimit)) __obj.updateDynamic("exceededTransferLimit")(exceededTransferLimit)
    if (features != null) __obj.updateDynamic("features")(features)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType)
    if (queryGeometry != null) __obj.updateDynamic("queryGeometry")(queryGeometry)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[FeatureSetProperties]
  }
}

