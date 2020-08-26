package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationshipQueryProperties extends js.Object {
  /**
    * Specify the geodatabase version to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#gdbVersion)
    */
  var gdbVersion: js.UndefOr[String] = js.native
  /**
    * Specify the number of decimal places for the geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.native
  /**
    * The historic moment to query. This parameter applies only if the `supportsHistoricMoment` on [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) property of the layer is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#historicMoment)
    */
  var historicMoment: js.UndefOr[DateProperties] = js.native
  /**
    * The maximum allowable offset used for generalizing geometries returned by the query operation. The offset is in the units of `outSpatialReference`. If `outSpatialReference` is not defined, the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.native
  /**
    * An array of objectIds for the features in the layer/table being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Attribute fields to include in the FeatureSet. Fields must exist in the map layer. You must list actual field names rather than the alias names. You are, however, able to use the alias names when you display the results.  When specifying the output fields, you should limit the fields to only those you expect to use in the query or the results. The fewer fields you include, the faster the response will be.  Each query must have access to the Shape and ObjectId fields for a layer. However, your list of fields does not need to include these two fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  /**
    * The spatial reference for the returned geometry. If `outSpatialReference` is not defined, the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference) of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The ID of the relationship to be queried. The ids for the relationships the table or layer participates in are listed in the ArcGIS Services directory. The ID of the relationship to be queried. The relationships that this layer/table participates in are included in the Feature Service Layer resource response. Records in tables/layers corresponding to the related table/layer of the relationship are queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#relationshipId)
    */
  var relationshipId: js.UndefOr[Double] = js.native
  /**
    * If `true`, each feature in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) includes the geometry. Set to `false` (default) if you do not plan to include highlighted features on a map since the geometry makes up a significant portion of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnGeometry) is `true`, then m-values are included in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnM)
    */
  var returnM: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnGeometry) is `true`, then z-values are included in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnZ)
    */
  var returnZ: js.UndefOr[Boolean] = js.native
  /**
    * The definition expression to be applied to the related table or layer. Only records in the list of [objectIds](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds) that satisfy the definition expression are queried for related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#where)
    */
  var where: js.UndefOr[String] = js.native
}

object RelationshipQueryProperties {
  @scala.inline
  def apply(): RelationshipQueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipQueryProperties]
  }
  @scala.inline
  implicit class RelationshipQueryPropertiesOps[Self <: RelationshipQueryProperties] (val x: Self) extends AnyVal {
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
    def setGdbVersion(value: String): Self = this.set("gdbVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGdbVersion: Self = this.set("gdbVersion", js.undefined)
    @scala.inline
    def setGeometryPrecision(value: Double): Self = this.set("geometryPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometryPrecision: Self = this.set("geometryPrecision", js.undefined)
    @scala.inline
    def setHistoricMoment(value: DateProperties): Self = this.set("historicMoment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoricMoment: Self = this.set("historicMoment", js.undefined)
    @scala.inline
    def setMaxAllowableOffset(value: Double): Self = this.set("maxAllowableOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAllowableOffset: Self = this.set("maxAllowableOffset", js.undefined)
    @scala.inline
    def setObjectIdsVarargs(value: Double*): Self = this.set("objectIds", js.Array(value :_*))
    @scala.inline
    def setObjectIds(value: js.Array[Double]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = this.set("outFields", js.Array(value :_*))
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = this.set("outFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFields: Self = this.set("outFields", js.undefined)
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = this.set("outSpatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutSpatialReference: Self = this.set("outSpatialReference", js.undefined)
    @scala.inline
    def setRelationshipId(value: Double): Self = this.set("relationshipId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipId: Self = this.set("relationshipId", js.undefined)
    @scala.inline
    def setReturnGeometry(value: Boolean): Self = this.set("returnGeometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnGeometry: Self = this.set("returnGeometry", js.undefined)
    @scala.inline
    def setReturnM(value: Boolean): Self = this.set("returnM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnM: Self = this.set("returnM", js.undefined)
    @scala.inline
    def setReturnZ(value: Boolean): Self = this.set("returnZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnZ: Self = this.set("returnZ", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

