package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationTask extends Task {
  /**
    * Creates a new spatial notification change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#addChangeRule)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.rule The [change rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule) to be added.
    * @param params.user The username requesting the addition of the rule.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def addChangeRule(params: NotificationTaskAddChangeRuleParams): IPromise[ChangeRule] = js.native
  def addChangeRule(params: NotificationTaskAddChangeRuleParams, requestOptions: js.Any): IPromise[ChangeRule] = js.native
  /**
    * Deletes a spatial notification change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#deleteChangeRule)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.ruleId The unique id of the rule to be deleted.
    * @param params.user The username requesting the deletion of the rule.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def deleteChangeRule(params: NotificationTaskDeleteChangeRuleParams): IPromise[Boolean] = js.native
  def deleteChangeRule(params: NotificationTaskDeleteChangeRuleParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Get an array of all the spatial notification [change rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule) configured in the Workflow Manager system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#getAllChangeRules)
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getAllChangeRules(): IPromise[ChangeRule] = js.native
  def getAllChangeRules(requestOptions: js.Any): IPromise[ChangeRule] = js.native
  /**
    * Get a single spatial notification [change rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule) by ruleId.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#getChangeRule)
    *
    * @param ruleId The unique id of the [change rule](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule).
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getChangeRule(ruleId: String): IPromise[ChangeRule] = js.native
  def getChangeRule(ruleId: String, requestOptions: js.Any): IPromise[ChangeRule] = js.native
  /**
    * Get information about a [match](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch) for a change and change rule related to a spatial notification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#getChangeRuleMatch)
    *
    * @param matchId The unique id of the spatial notification match.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getChangeRuleMatch(matchId: String): IPromise[ChangeRule] = js.native
  def getChangeRuleMatch(matchId: String, requestOptions: js.Any): IPromise[ChangeRule] = js.native
  /**
    * Get the current time of the database.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#getDatabaseTime)
    *
    * @param dataWorkspaceId The unique id of the dataWorkspace.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getDatabaseTime(dataWorkspaceId: String): IPromise[Date] = js.native
  def getDatabaseTime(dataWorkspaceId: String, requestOptions: js.Any): IPromise[Date] = js.native
  /**
    * Get an array of [matches](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch) that match the change rule criteria in a specific editing session.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#getSessionMatches)
    *
    * @param sessionId The unique id of the spatial notification session.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getSessionMatches(sessionId: String): IPromise[ChangeRuleMatch] = js.native
  def getSessionMatches(sessionId: String, requestOptions: js.Any): IPromise[ChangeRuleMatch] = js.native
  /**
    * Sends the notifications configured for the matches found during a rule evaluation session.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#notifySession)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.sessionid The unique id of the spatial notification session.
    * @param params.deleteAfter Indicates whether to delete the session matches after sending any notifications. The default is false.
    * @param params.user The username requesting the sending of notification.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def notifySession(params: NotificationTaskNotifySessionParams): IPromise[Boolean] = js.native
  def notifySession(params: NotificationTaskNotifySessionParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Queries the array of spatial notification [change rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRule) based on specified criteria.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.name A search string to find within change rule names.
    * @param params.description A search string to find within change rule descriptions.
    * @param params.searchType The type of search to perform, default is contains.  **Possible Values:** contains | exact | starts-with | ends-with
    * @param params.user The username requesting the search.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def queryChangeRules(params: NotificationTaskQueryChangeRulesParams): IPromise[ChangeRule] = js.native
  def queryChangeRules(params: NotificationTaskQueryChangeRulesParams, requestOptions: js.Any): IPromise[ChangeRule] = js.native
  /**
    * Executes the configured spatial notification change rules on a data workspace by evaluating the geodatabase archive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.dataWorkspaceId The unique id of the dataWorkspace.
    * @param params.from The starting time to query for new changes.
    * @param params.to The ending time to query for new changes.
    * @param params.logMatches Indicates whether to keep the matches found, stored in the ArcGIS Workflow Manager repository. The default is false.
    * @param params.send Indicates whether to the send notifications at the time matches are found. The default is false.
    * @param params.user The username requesting the execution of the rule.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def runSpatialNotificationOnHistory(params: NotificationTaskRunSpatialNotificationOnHistoryParams): IPromise[String] = js.native
  def runSpatialNotificationOnHistory(params: NotificationTaskRunSpatialNotificationOnHistoryParams, requestOptions: js.Any): IPromise[String] = js.native
  /**
    * Sends an email of the specified [notification type](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#NotificationType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#sendNotification)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId The unique id of the job.
    * @param params.notificationType The name of the [notification type](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#NotificationType) to be sent.
    * @param params.user The username requesting to send the notification.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def sendNotification(params: NotificationTaskSendNotificationParams): IPromise[Boolean] = js.native
  def sendNotification(params: NotificationTaskSendNotificationParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Adds an email address to the subscriber list for a specific notification type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#subscribeToNotification)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.notificationTypeId The unique id of the notification type to which the email address will be added.
    * @param params.email The email address to add to the notification type's subscriber list. May contain tokens.
    * @param params.user The username requesting the addition of email address to the notification subscriber's list.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def subscribeToNotification(params: NotificationTaskSubscribeToNotificationParams): IPromise[Boolean] = js.native
  def subscribeToNotification(params: NotificationTaskSubscribeToNotificationParams, requestOptions: js.Any): IPromise[Boolean] = js.native
  /**
    * Removes an email address from the subscriber list for a specific notification type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#unsubscribeFromNotification)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.notificationTypeId The unique id of the notification type from which the email address will be removed.
    * @param params.email The email address to remove from the notification type's subscriber list. May contain tokens.
    * @param params.user The username requesting the removal of email address to the notification subscriber's list.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def unsubscribeFromNotification(params: NotificationTaskUnsubscribeFromNotificationParams): IPromise[Boolean] = js.native
  def unsubscribeFromNotification(params: NotificationTaskUnsubscribeFromNotificationParams, requestOptions: js.Any): IPromise[Boolean] = js.native
}

@JSGlobal("__esri.NotificationTask")
@js.native
/**
  * Exposes functions to perform operations with Workflow Manager notifications.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html)
  */
class NotificationTaskCls () extends NotificationTask {
  def this(properties: NotificationTaskProperties) = this()
}

