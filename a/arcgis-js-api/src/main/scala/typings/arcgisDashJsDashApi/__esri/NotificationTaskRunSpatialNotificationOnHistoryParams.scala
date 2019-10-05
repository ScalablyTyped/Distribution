package typings.arcgisDashJsDashApi.__esri

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskRunSpatialNotificationOnHistoryParams extends Object {
  /**
    * The unique id of the dataWorkspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var dataWorkspaceId: String
  /**
    * The starting time to query for new changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var from: Date
  /**
    * Indicates whether to keep the matches found, stored in the ArcGIS Workflow Manager repository. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var logMatches: Boolean
  /**
    * Indicates whether to the send notifications at the time matches are found. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var send: Boolean
  /**
    * The ending time to query for new changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var to: Date
  /**
    * The username requesting the execution of the rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#runSpatialNotificationOnHistory)
    */
  var user: String
}

object NotificationTaskRunSpatialNotificationOnHistoryParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataWorkspaceId: String,
    from: Date,
    hasOwnProperty: PropertyKey => Boolean,
    logMatches: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    send: Boolean,
    to: Date,
    user: String
  ): NotificationTaskRunSpatialNotificationOnHistoryParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, dataWorkspaceId = dataWorkspaceId, from = from, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), logMatches = logMatches, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), send = send, to = to, user = user)
  
    __obj.asInstanceOf[NotificationTaskRunSpatialNotificationOnHistoryParams]
  }
}

