package typings.arcgisDashJsDashApi.__esri

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeRuleMatch extends Object {
  /**
    * The time the change occurred to the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var changeTime: Date
  /**
    * The type of change that happened to the data.  **Possible Values:** add | modify | delete | all
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var changeType: String
  /**
    * The unique id of the data workspace containing the changed data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var dataWorkspaceId: String
  /**
    * The dataset that changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var dataset: String
  /**
    * The unique id of the associated to the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var id: String
  /**
    * The unique id of the job where the change was made.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var jobID: String
  /**
    * The unique id of the change rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#ChangeRuleMatch)
    */
  var ruleID: String
}

object ChangeRuleMatch {
  @scala.inline
  def apply(
    changeTime: Date,
    changeType: String,
    constructor: js.Function,
    dataWorkspaceId: String,
    dataset: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    jobID: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    ruleID: String
  ): ChangeRuleMatch = {
    val __obj = js.Dynamic.literal(changeTime = changeTime, changeType = changeType, constructor = constructor, dataWorkspaceId = dataWorkspaceId, dataset = dataset, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, jobID = jobID, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ruleID = ruleID)
  
    __obj.asInstanceOf[ChangeRuleMatch]
  }
}

