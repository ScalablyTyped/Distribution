package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Executes different types of query operations on a layer.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html)
	 */
@js.native
trait query extends StObject {
  
  /**
  		 * Query information about attachments associated with features from a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) specified in the url parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeAttachmentQuery)
  		 */
  def executeAttachmentQuery(url: String, attachmentQuery: AttachmentQuery): js.Promise[Any] = js.native
  def executeAttachmentQuery(url: String, attachmentQuery: AttachmentQueryProperties): js.Promise[Any] = js.native
  def executeAttachmentQuery(url: String, attachmentQuery: AttachmentQueryProperties, requestOptions: Any): js.Promise[Any] = js.native
  def executeAttachmentQuery(url: String, attachmentQuery: AttachmentQuery, requestOptions: Any): js.Promise[Any] = js.native
  
  def executeForCount(url: String, query: QueryProperties): js.Promise[Double] = js.native
  def executeForCount(url: String, query: QueryProperties, requestOptions: Any): js.Promise[Double] = js.native
  /**
  		 * Gets a count of the number of features that satisfy the input query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeForCount)
  		 */
  def executeForCount(url: String, query: Query_): js.Promise[Double] = js.native
  def executeForCount(url: String, query: Query_, requestOptions: Any): js.Promise[Double] = js.native
  
  /**
  		 * Gets the extent of the features that satisfy the input query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeForExtent)
  		 */
  def executeForExtent(url: String, params: Query_): js.Promise[Any] = js.native
  def executeForExtent(url: String, params: Query_, requestOptions: Any): js.Promise[Any] = js.native
  
  def executeForIds(url: String, query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def executeForIds(url: String, query: QueryProperties, requestOptions: Any): js.Promise[js.Array[Double]] = js.native
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the layer specified in the url parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeForIds)
  		 */
  def executeForIds(url: String, query: Query_): js.Promise[js.Array[Double]] = js.native
  def executeForIds(url: String, query: Query_, requestOptions: Any): js.Promise[js.Array[Double]] = js.native
  
  /**
  		 * Executes a [TopFeaturesQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) against a feature service and returns the count of features or records that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeForTopCount)
  		 */
  def executeForTopCount(url: String, topFeaturesQuery: TopFeaturesQuery): js.Promise[Double] = js.native
  def executeForTopCount(url: String, topFeaturesQuery: TopFeaturesQuery, requestOptions: Any): js.Promise[Double] = js.native
  
  /**
  		 * Executes a [TopFeaturesQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) against a feature service and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeForTopExtents)
  		 */
  def executeForTopExtents(url: String, topFeaturesQuery: TopFeaturesQuery, outSpatialReference: SpatialReference): js.Promise[Any] = js.native
  def executeForTopExtents(
    url: String,
    topFeaturesQuery: TopFeaturesQuery,
    outSpatialReference: SpatialReference,
    requestOptions: Any
  ): js.Promise[Any] = js.native
  
  /**
  		 * Executes a [TopFeaturesQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) against a feature service and returns an array of Object IDs of features that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeForTopIds)
  		 */
  def executeForTopIds(url: String, topFeaturesQuery: TopFeaturesQuery, outSpatialReference: SpatialReference): js.Promise[js.Array[Double]] = js.native
  def executeForTopIds(
    url: String,
    topFeaturesQuery: TopFeaturesQuery,
    outSpatialReference: SpatialReference,
    requestOptions: Any
  ): js.Promise[js.Array[Double]] = js.native
  
  def executeQueryJSON(url: String, query: QueryProperties): js.Promise[FeatureSet] = js.native
  def executeQueryJSON(url: String, query: QueryProperties, requestOptions: Any): js.Promise[FeatureSet] = js.native
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the layer specified in the url parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeQueryJSON)
  		 */
  def executeQueryJSON(url: String, query: Query_): js.Promise[FeatureSet] = js.native
  def executeQueryJSON(url: String, query: Query_, requestOptions: Any): js.Promise[FeatureSet] = js.native
  
  def executeQueryPBF(url: String, query: QueryProperties): js.Promise[FeatureSet] = js.native
  def executeQueryPBF(url: String, query: QueryProperties, requestOptions: Any): js.Promise[FeatureSet] = js.native
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against the layer specified in the url parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeQueryPBF)
  		 */
  def executeQueryPBF(url: String, query: Query_): js.Promise[FeatureSet] = js.native
  def executeQueryPBF(url: String, query: Query_, requestOptions: Any): js.Promise[FeatureSet] = js.native
  
  /**
  		 * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html) against the layer or table specified in the url parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeRelationshipQuery)
  		 */
  def executeRelationshipQuery(url: String, relationshipQuery: RelationshipQuery): js.Promise[Any] = js.native
  def executeRelationshipQuery(url: String, relationshipQuery: RelationshipQueryProperties): js.Promise[Any] = js.native
  def executeRelationshipQuery(url: String, relationshipQuery: RelationshipQueryProperties, requestOptions: Any): js.Promise[Any] = js.native
  def executeRelationshipQuery(url: String, relationshipQuery: RelationshipQuery, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
  		 * Executes a [TopFeaturesQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) against a feature service and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) once the promise resolves.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query.html#executeTopFeaturesQuery)
  		 */
  def executeTopFeaturesQuery(url: String, topFeaturesQuery: TopFeaturesQuery, outSpatialReference: SpatialReference): js.Promise[FeatureSet] = js.native
  def executeTopFeaturesQuery(
    url: String,
    topFeaturesQuery: TopFeaturesQuery,
    outSpatialReference: SpatialReference,
    requestOptions: Any
  ): js.Promise[FeatureSet] = js.native
}
