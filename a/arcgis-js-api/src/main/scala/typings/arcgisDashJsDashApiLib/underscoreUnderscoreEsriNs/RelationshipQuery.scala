package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipQuery
  extends Accessor
     with JSONSupport {
  /**
    * Specify the geodatabase version to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#gdbVersion)
    */
  var gdbVersion: java.lang.String = js.native
  /**
    * Specify the number of decimal places for the geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#geometryPrecision)
    */
  var geometryPrecision: scala.Double = js.native
  /**
    * The historic moment to query. This parameter applies only if the `supportsHistoricMoment` on [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property of the layer is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#historicMoment)
    */
  var historicMoment: stdLib.Date = js.native
  /**
    * The maximum allowable offset used for generalizing geometries returned by the query operation. The offset is in the units of `outSpatialReference`. If `outSpatialReference` is not defined, the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#maxAllowableOffset)
    */
  var maxAllowableOffset: scala.Double = js.native
  /**
    * An array of objectIds for the features in the layer/table being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds)
    */
  var objectIds: js.Array[scala.Double] = js.native
  /**
    * Attribute fields to include in the FeatureSet. Fields must exist in the map layer. You must list actual field names rather than the alias names. You are, however, able to use the alias names when you display the results.  When specifying the output fields, you should limit the fields to only those you expect to use in the query or the results. The fewer fields you include, the faster the response will be.  Each query must have access to the Shape and ObjectId fields for a layer. However, your list of fields does not need to include these two fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outFields)
    */
  var outFields: js.Array[java.lang.String] = js.native
  /**
    * The spatial reference for the returned geometry. If `outSpatialReference` is not defined, the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  /**
    * The ID of the relationship to be queried. The ids for the relationships the table or layer participates in are listed in the ArcGIS Services directory. The ID of the relationship to be queried. The relationships that this layer/table participates in are included in the Feature Service Layer resource response. Records in tables/layers corresponding to the related table/layer of the relationship are queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#relationshipId)
    */
  var relationshipId: scala.Double = js.native
  /**
    * If `true`, each feature in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) includes the geometry. Set to `false` (default) if you do not plan to include highlighted features on a map since the geometry makes up a significant portion of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: scala.Boolean = js.native
  /**
    * The definition expression to be applied to the related table or layer. Only records in the list of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds) that satisfy the definition expression are queried for related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#where)
    */
  var where: java.lang.String = js.native
}

@JSGlobal("__esri.RelationshipQuery")
@js.native
class RelationshipQueryCls () extends RelationshipQuery {
  def this(properties: RelationshipQueryProperties) = this()
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

