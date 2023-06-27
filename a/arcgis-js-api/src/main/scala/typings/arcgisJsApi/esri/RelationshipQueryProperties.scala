package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipQueryProperties extends StObject {
  
  /**
  		 * Indicates if the service should cache the relationship query results.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#cacheHint)
  		 */
  var cacheHint: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Specify the geodatabase version to query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#gdbVersion)
  		 */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specify the number of decimal places for the geometries returned by the query operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#geometryPrecision)
  		 */
  var geometryPrecision: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The historic moment to query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#historicMoment)
  		 */
  var historicMoment: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The maximum allowable offset used for generalizing geometries returned by the query operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#maxAllowableOffset)
  		 */
  var maxAllowableOffset: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The number of features to retrieve.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#num)
  		 */
  var num: js.UndefOr[Double] = js.undefined
  
  /**
  		 * An array of objectIds for the features in the layer/table being queried.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#objectIds)
  		 */
  var objectIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
  		 * One or more field names used to order the query results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#orderByFields)
  		 */
  var orderByFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * Attribute fields to include in the FeatureSet.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#outFields)
  		 */
  var outFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The spatial reference for the returned geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#outSpatialReference)
  		 */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * The ID of the relationship to be queried.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#relationshipId)
  		 */
  var relationshipId: js.UndefOr[Double] = js.undefined
  
  /**
  		 * If `true`, each feature in the [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) includes the geometry.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#returnGeometry)
  		 */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#returnGeometry) is `true`, then m-values are included in the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#returnM)
  		 */
  var returnM: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * If `true`, and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#returnGeometry) is `true`, then z-values are included in the geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#returnZ)
  		 */
  var returnZ: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The zero-based index indicating where to begin retrieving features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#start)
  		 */
  var start: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The definition expression to be applied to the related table or layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html#where)
  		 */
  var where: js.UndefOr[String] = js.undefined
}
object RelationshipQueryProperties {
  
  inline def apply(): RelationshipQueryProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationshipQueryProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipQueryProperties] (val x: Self) extends AnyVal {
    
    inline def setCacheHint(value: Boolean): Self = StObject.set(x, "cacheHint", value.asInstanceOf[js.Any])
    
    inline def setCacheHintUndefined: Self = StObject.set(x, "cacheHint", js.undefined)
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setGeometryPrecision(value: Double): Self = StObject.set(x, "geometryPrecision", value.asInstanceOf[js.Any])
    
    inline def setGeometryPrecisionUndefined: Self = StObject.set(x, "geometryPrecision", js.undefined)
    
    inline def setHistoricMoment(value: DateProperties): Self = StObject.set(x, "historicMoment", value.asInstanceOf[js.Any])
    
    inline def setHistoricMomentUndefined: Self = StObject.set(x, "historicMoment", js.undefined)
    
    inline def setMaxAllowableOffset(value: Double): Self = StObject.set(x, "maxAllowableOffset", value.asInstanceOf[js.Any])
    
    inline def setMaxAllowableOffsetUndefined: Self = StObject.set(x, "maxAllowableOffset", js.undefined)
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setNumUndefined: Self = StObject.set(x, "num", js.undefined)
    
    inline def setObjectIds(value: js.Array[Double]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: Double*): Self = StObject.set(x, "objectIds", js.Array(value*))
    
    inline def setOrderByFields(value: js.Array[String]): Self = StObject.set(x, "orderByFields", value.asInstanceOf[js.Any])
    
    inline def setOrderByFieldsUndefined: Self = StObject.set(x, "orderByFields", js.undefined)
    
    inline def setOrderByFieldsVarargs(value: String*): Self = StObject.set(x, "orderByFields", js.Array(value*))
    
    inline def setOutFields(value: js.Array[String]): Self = StObject.set(x, "outFields", value.asInstanceOf[js.Any])
    
    inline def setOutFieldsUndefined: Self = StObject.set(x, "outFields", js.undefined)
    
    inline def setOutFieldsVarargs(value: String*): Self = StObject.set(x, "outFields", js.Array(value*))
    
    inline def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setRelationshipId(value: Double): Self = StObject.set(x, "relationshipId", value.asInstanceOf[js.Any])
    
    inline def setRelationshipIdUndefined: Self = StObject.set(x, "relationshipId", js.undefined)
    
    inline def setReturnGeometry(value: Boolean): Self = StObject.set(x, "returnGeometry", value.asInstanceOf[js.Any])
    
    inline def setReturnGeometryUndefined: Self = StObject.set(x, "returnGeometry", js.undefined)
    
    inline def setReturnM(value: Boolean): Self = StObject.set(x, "returnM", value.asInstanceOf[js.Any])
    
    inline def setReturnMUndefined: Self = StObject.set(x, "returnM", js.undefined)
    
    inline def setReturnZ(value: Boolean): Self = StObject.set(x, "returnZ", value.asInstanceOf[js.Any])
    
    inline def setReturnZUndefined: Self = StObject.set(x, "returnZ", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
