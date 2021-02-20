package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryTask extends Task {
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the layer specified in the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#url).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#execute)
    */
  def execute(query: Query): js.Promise[FeatureSet] = js.native
  def execute(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def execute(query: QueryProperties, requestOptions: js.Any): js.Promise[FeatureSet] = js.native
  def execute(query: Query, requestOptions: js.Any): js.Promise[FeatureSet] = js.native
  
  /**
    * Query information about attachments associated with features from a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) specified in the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#url).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeAttachmentQuery)
    */
  def executeAttachmentQuery(attachmentQuery: AttachmentQuery): js.Promise[_] = js.native
  def executeAttachmentQuery(attachmentQuery: AttachmentQueryProperties): js.Promise[_] = js.native
  def executeAttachmentQuery(attachmentQuery: AttachmentQueryProperties, requestOptions: js.Any): js.Promise[_] = js.native
  def executeAttachmentQuery(attachmentQuery: AttachmentQuery, requestOptions: js.Any): js.Promise[_] = js.native
  
  /**
    * Gets a count of the number of features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeForCount)
    */
  def executeForCount(query: Query): js.Promise[Double] = js.native
  def executeForCount(query: QueryProperties): js.Promise[Double] = js.native
  def executeForCount(query: QueryProperties, requestOptions: js.Any): js.Promise[Double] = js.native
  def executeForCount(query: Query, requestOptions: js.Any): js.Promise[Double] = js.native
  
  /**
    * Gets the extent of the features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeForExtent)
    */
  def executeForExtent(params: Query): js.Promise[_] = js.native
  def executeForExtent(params: Query, requestOptions: js.Any): js.Promise[_] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the layer specified in the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#url).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeForIds)
    */
  def executeForIds(query: Query): js.Promise[js.Array[Double]] = js.native
  def executeForIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def executeForIds(query: QueryProperties, requestOptions: js.Any): js.Promise[js.Array[Double]] = js.native
  def executeForIds(query: Query, requestOptions: js.Any): js.Promise[js.Array[Double]] = js.native
  
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html) against the layer or table specified in the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#url).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeRelationshipQuery)
    */
  def executeRelationshipQuery(relationshipQuery: RelationshipQuery): js.Promise[_] = js.native
  def executeRelationshipQuery(relationshipQuery: RelationshipQueryProperties): js.Promise[_] = js.native
  def executeRelationshipQuery(relationshipQuery: RelationshipQueryProperties, requestOptions: js.Any): js.Promise[_] = js.native
  def executeRelationshipQuery(relationshipQuery: RelationshipQuery, requestOptions: js.Any): js.Promise[_] = js.native
  
  /**
    * Specify the geodatabase version to query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#gdbVersion)
    */
  var gdbVersion: String = js.native
}
