package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationTask extends Task {
  /**
    * Gets an array of all the user groups that are configured in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getAllGroups)
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getAllGroups(): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  def getAllGroups(requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  /**
    * Gets an array of all the users that are configured in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getAllUsers)
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getAllUsers(): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  def getAllUsers(requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  /**
    * Gets the properties and an array of geodatabase versions for a data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getDataWorkspaceDetails)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.dataWorkspaceId The unique id of the data workspace, whose version will be returned.
    * @param params.user The user name of the user who is requesting the information.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getDataWorkspaceDetails(params: ConfigurationTaskGetDataWorkspaceDetailsParams): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  def getDataWorkspaceDetails(params: ConfigurationTaskGetDataWorkspaceDetailsParams, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  /**
    * Gets a single user group in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getGroup)
    *
    * @param groupId The unique id of the  group whose information will be retrieved.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getGroup(groupId: scala.Double): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  def getGroup(groupId: scala.Double, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[js.Array[_]] = js.native
  /**
    * Gets the detailed configuration properties of a job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getJobTypeDetails)
    *
    * @param jobTypeId The unique id of a job type.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getJobTypeDetails(jobTypeId: scala.Double): arcgisDashJsDashApiLib.IPromise[JobTypeDetails] = js.native
  def getJobTypeDetails(jobTypeId: scala.Double, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[JobTypeDetails] = js.native
  /**
    * Gets the configuration of a publicly accessible job query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getPublicJobQueryDetails)
    *
    * @param queryId The unique id of public query.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getPublicJobQueryDetails(queryId: scala.Double): arcgisDashJsDashApiLib.IPromise[JobQueryDetails] = js.native
  def getPublicJobQueryDetails(queryId: scala.Double, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[JobQueryDetails] = js.native
  /**
    * Gets the [configuration information](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo) specific to a Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getServiceInfo)
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getServiceInfo(): arcgisDashJsDashApiLib.IPromise[WorkflowManagerServiceInfo] = js.native
  def getServiceInfo(requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[WorkflowManagerServiceInfo] = js.native
  /**
    * Gets an array of registered [table relationships](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#TableRelationship) in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getTableRelationshipsDetails)
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getTableRelationshipsDetails(): arcgisDashJsDashApiLib.IPromise[TableRelationship] = js.native
  def getTableRelationshipsDetails(requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[TableRelationship] = js.native
  /**
    * Gets information for a single user in the system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getUser)
    *
    * @param user The user name of the user whose information will be returned.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getUser(user: java.lang.String): arcgisDashJsDashApiLib.IPromise[UserDetails] = js.native
  def getUser(user: java.lang.String, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[UserDetails] = js.native
  /**
    * Gets the configuration of a user-owned job query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getUserJobQueryDetails)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.queryId The unique id of user query.
    * @param params.user The user name of the user who is requesting the information.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getUserJobQueryDetails(params: ConfigurationTaskGetUserJobQueryDetailsParams): arcgisDashJsDashApiLib.IPromise[JobQueryDetails] = js.native
  def getUserJobQueryDetails(params: ConfigurationTaskGetUserJobQueryDetailsParams, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[JobQueryDetails] = js.native
  /**
    * Gets all the job types a user is allowed to see and create.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getVisibleJobTypes)
    *
    * @param user The user name of the user for whom the information will be retrieved.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getVisibleJobTypes(user: java.lang.String): arcgisDashJsDashApiLib.IPromise[JobType] = js.native
  def getVisibleJobTypes(user: java.lang.String, requestOptions: js.Any): arcgisDashJsDashApiLib.IPromise[JobType] = js.native
}

@JSGlobal("__esri.ConfigurationTask")
@js.native
class ConfigurationTaskCls () extends ConfigurationTask {
  def this(properties: ConfigurationTaskProperties) = this()
}

