package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTask extends Task {
  /**
    * Specify the geodatabase version to query. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the layer specified in the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#url). The result is returned as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html), which can be accessed using the `.then()` method. A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) contains an array of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) features, which can be added to the map. This array will not be populated if no results are found.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#execute)
    *
    * @param query Specifies the attributes and spatial filter of the query.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def execute(query: Query): IPromise[FeatureSet] = js.native
  def execute(query: QueryProperties): IPromise[FeatureSet] = js.native
  def execute(query: QueryProperties, requestOptions: js.Any): IPromise[FeatureSet] = js.native
  def execute(query: Query, requestOptions: js.Any): IPromise[FeatureSet] = js.native
  /**
    * Query information about attachments associated with features from a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) specified in the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#url). It will return an error if the layer's [capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is set to false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeAttachmentQuery)
    *
    * @param attachmentQuery Specifies the attachment parameters for query.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def executeAttachmentQuery(attachmentQuery: AttachmentQuery): IPromise[_] = js.native
  def executeAttachmentQuery(attachmentQuery: AttachmentQueryProperties): IPromise[_] = js.native
  def executeAttachmentQuery(attachmentQuery: AttachmentQueryProperties, requestOptions: js.Any): IPromise[_] = js.native
  def executeAttachmentQuery(attachmentQuery: AttachmentQuery, requestOptions: js.Any): IPromise[_] = js.native
  /**
    * Gets a count of the number of features that satisfy the input query. Valid for layers published with 10.0 SP1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeForCount)
    *
    * @param query Specifies the attributes and spatial filter of the query.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def executeForCount(query: Query): IPromise[Double] = js.native
  def executeForCount(query: QueryProperties): IPromise[Double] = js.native
  def executeForCount(query: QueryProperties, requestOptions: js.Any): IPromise[Double] = js.native
  def executeForCount(query: Query, requestOptions: js.Any): IPromise[Double] = js.native
  /**
    * Gets the extent of the features that satisfy the input query. The count of features that satisfy the input query is returned upon resolution as well. At 10.3, this option is only available for [hosted feature services](https://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm). At 10.3.1, this option is available for all feature services and map service layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeForExtent)
    *
    * @param params Specifies the attributes and spatial filter of the query.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def executeForExtent(params: Query): IPromise[_] = js.native
  def executeForExtent(params: Query, requestOptions: js.Any): IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against the layer specified in the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#url). The result is an array of the object IDs of features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeForIds)
    *
    * @param query Specifies the attributes and spatial filter of the query.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def executeForIds(query: Query): IPromise[js.Array[Double]] = js.native
  def executeForIds(query: QueryProperties): IPromise[js.Array[Double]] = js.native
  def executeForIds(query: QueryProperties, requestOptions: js.Any): IPromise[js.Array[Double]] = js.native
  def executeForIds(query: Query, requestOptions: js.Any): IPromise[js.Array[Double]] = js.native
  /**
    * Executes a [RelationshipQuery](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RelationshipQuery.html) against the layer or table specified in the [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#url). If the query is successful, the returned results are [FeatureSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) grouped by source layer or table objectIds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeRelationshipQuery)
    *
    * @param relationshipQuery Specifies relationship parameters for querying related features or records from a layer or a table.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def executeRelationshipQuery(relationshipQuery: RelationshipQuery): IPromise[_] = js.native
  def executeRelationshipQuery(relationshipQuery: RelationshipQueryProperties): IPromise[_] = js.native
  def executeRelationshipQuery(relationshipQuery: RelationshipQueryProperties, requestOptions: js.Any): IPromise[_] = js.native
  def executeRelationshipQuery(relationshipQuery: RelationshipQuery, requestOptions: js.Any): IPromise[_] = js.native
}

@JSGlobal("__esri.QueryTask")
@js.native
object QueryTask extends TopLevel[QueryTaskConstructor]

