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
}
