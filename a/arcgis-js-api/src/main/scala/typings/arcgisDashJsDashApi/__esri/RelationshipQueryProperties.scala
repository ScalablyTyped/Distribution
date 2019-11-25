package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationshipQueryProperties extends js.Object {
  /**
    * Specify the geodatabase version to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.undefined
  /**
    * Specify the number of decimal places for the geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  /**
    * The historic moment to query. This parameter applies only if the `supportsHistoricMoment` on [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property of the layer is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#historicMoment)
    */
  var historicMoment: js.UndefOr[DateProperties] = js.undefined
  /**
    * The maximum allowable offset used for generalizing geometries returned by the query operation. The offset is in the units of `outSpatialReference`. If `outSpatialReference` is not defined, the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.undefined
  /**
    * An array of objectIds for the features in the layer/table being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Attribute fields to include in the FeatureSet. Fields must exist in the map layer. You must list actual field names rather than the alias names. You are, however, able to use the alias names when you display the results.  When specifying the output fields, you should limit the fields to only those you expect to use in the query or the results. The fewer fields you include, the faster the response will be.  Each query must have access to the Shape and ObjectId fields for a layer. However, your list of fields does not need to include these two fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The spatial reference for the returned geometry. If `outSpatialReference` is not defined, the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * The ID of the relationship to be queried. The ids for the relationships the table or layer participates in are listed in the ArcGIS Services directory. The ID of the relationship to be queried. The relationships that this layer/table participates in are included in the Feature Service Layer resource response. Records in tables/layers corresponding to the related table/layer of the relationship are queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#relationshipId)
    */
  var relationshipId: js.UndefOr[Double] = js.undefined
  /**
    * If `true`, each feature in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) includes the geometry. Set to `false` (default) if you do not plan to include highlighted features on a map since the geometry makes up a significant portion of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  /**
    * The definition expression to be applied to the related table or layer. Only records in the list of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds) that satisfy the definition expression are queried for related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#where)
    */
  var where: js.UndefOr[String] = js.undefined
}

object RelationshipQueryProperties {
  @scala.inline
  def apply(
    gdbVersion: String = null,
    geometryPrecision: Int | Double = null,
    historicMoment: DateProperties = null,
    maxAllowableOffset: Int | Double = null,
    objectIds: js.Array[Double] = null,
    outFields: js.Array[String] = null,
    outSpatialReference: SpatialReferenceProperties = null,
    relationshipId: Int | Double = null,
    returnGeometry: js.UndefOr[Boolean] = js.undefined,
    where: String = null
  ): RelationshipQueryProperties = {
    val __obj = js.Dynamic.literal()
    if (gdbVersion != null) __obj.updateDynamic("gdbVersion")(gdbVersion.asInstanceOf[js.Any])
    if (geometryPrecision != null) __obj.updateDynamic("geometryPrecision")(geometryPrecision.asInstanceOf[js.Any])
    if (historicMoment != null) __obj.updateDynamic("historicMoment")(historicMoment.asInstanceOf[js.Any])
    if (maxAllowableOffset != null) __obj.updateDynamic("maxAllowableOffset")(maxAllowableOffset.asInstanceOf[js.Any])
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields.asInstanceOf[js.Any])
    if (outSpatialReference != null) __obj.updateDynamic("outSpatialReference")(outSpatialReference.asInstanceOf[js.Any])
    if (relationshipId != null) __obj.updateDynamic("relationshipId")(relationshipId.asInstanceOf[js.Any])
    if (!js.isUndefined(returnGeometry)) __obj.updateDynamic("returnGeometry")(returnGeometry.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipQueryProperties]
  }
}

