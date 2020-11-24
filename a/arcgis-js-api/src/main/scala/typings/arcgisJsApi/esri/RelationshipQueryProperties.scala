package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The historic moment to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#historicMoment)
    */
  var historicMoment: js.UndefOr[DateProperties] = js.native
  
  /**
    * The maximum allowable offset used for generalizing geometries returned by the query operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.native
  
  /**
    * The number of features to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#num)
    */
  var num: js.UndefOr[Double] = js.native
  
  /**
    * An array of objectIds for the features in the layer/table being queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#objectIds)
    */
  var objectIds: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * One or more field names used to order the query results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#orderByFields)
    */
  var orderByFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Attribute fields to include in the FeatureSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The spatial reference for the returned geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The ID of the relationship to be queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#relationshipId)
    */
  var relationshipId: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, each feature in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) includes the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#returnGeometry)
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
    * The zero-based index indicating where to begin retrieving features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html#start)
    */
  var start: js.UndefOr[Double] = js.native
  
  /**
    * The definition expression to be applied to the related table or layer.
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
    def setNum(value: Double): Self = this.set("num", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum: Self = this.set("num", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: Double*): Self = this.set("objectIds", js.Array(value :_*))
    
    @scala.inline
    def setObjectIds(value: js.Array[Double]): Self = this.set("objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectIds: Self = this.set("objectIds", js.undefined)
    
    @scala.inline
    def setOrderByFieldsVarargs(value: String*): Self = this.set("orderByFields", js.Array(value :_*))
    
    @scala.inline
    def setOrderByFields(value: js.Array[String]): Self = this.set("orderByFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderByFields: Self = this.set("orderByFields", js.undefined)
    
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
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
