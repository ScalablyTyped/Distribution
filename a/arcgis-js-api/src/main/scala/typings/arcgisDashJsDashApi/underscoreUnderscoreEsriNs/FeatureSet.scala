package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureSet
  extends Accessor
     with JSONSupport {
  /**
    * The name of the layer's primary display field. The value of this property matches the name of one of the fields of the feature. This is only applicable when the FeatureSet is returned from a task. It is ignored when the FeatureSet is used as input to a geoprocessing task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#displayFieldName)
    */
  var displayFieldName: String = js.native
  /**
    * Typically, a layer has a limit on the number of features (i.e., records) returned by the query operation. If `maxRecordCount` is configured for a layer, `exceededTransferLimit` will be `true` if a query matches more than the `maxRecordCount` features. It will be `false` otherwise. Supported by ArcGIS Server version 10.1 and later.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#exceededTransferLimit)
    */
  var exceededTransferLimit: Boolean = js.native
  /**
    * The array of graphics returned from a task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#features)
    */
  var features: js.Array[Graphic] = js.native
  /**
    * Information about each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#fields)
    */
  var fields: js.Array[Field] = js.native
  /**
    * The geometry type of features in the FeatureSet. All features's geometry must be of the same type.  **Possible Values:** point | multipoint | polyline | polygon | multipatch | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#geometryType)
    */
  var geometryType: String = js.native
  /**
    * The [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry) used to query the features. It is useful for getting the buffer geometry generated when querying features by [distance](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#distance) or getting the query geometry projected in the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) of the query. The query geometry is returned only for [client-side queries](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures) and [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm). The query's [returnQueryGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnQueryGeometry) must be set to `true` and the layer's [capabilities.query.supportsQueryGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) has to be `true` for the query to return query geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#queryGeometry)
    */
  var queryGeometry: Geometry = js.native
  /**
    * When a FeatureSet is used as input to Geoprocessor, the spatial reference is set to the map's spatial reference by default. This value can be changed. When a FeatureSet is returned from a task, the value is the result as returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
}

@JSGlobal("__esri.FeatureSet")
@js.native
class FeatureSetCls () extends FeatureSet {
  def this(properties: FeatureSetProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

