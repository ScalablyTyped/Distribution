package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetConfiguration extends Object {
  /**
    * This indicates whether the notification will be sent always or if values change to defined in whereConditions or if values change from defined in whereConditions.  **Possible Values:** always | changed-to | changed-from
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var changeCondition: Double
  /**
    * The name of the fields, changes to which trigger the notification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var changeFields: String
  /**
    * The unique id of the data workspace containing the changed data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var dataWorkspaceId: String
  /**
    * The name of the dataset that will trigger the notification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var dataset: String
  /**
    * The name of the dataset configuration rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var name: String
  /**
    * The [where conditions](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#WhereCondition) defining the criteria to trigger the rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var whereConditions: js.Array[WhereCondition]
}

object DatasetConfiguration {
  @scala.inline
  def apply(
    changeCondition: Double,
    changeFields: String,
    constructor: js.Function,
    dataWorkspaceId: String,
    dataset: String,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    whereConditions: js.Array[WhereCondition]
  ): DatasetConfiguration = {
    val __obj = js.Dynamic.literal(changeCondition = changeCondition, changeFields = changeFields, constructor = constructor, dataWorkspaceId = dataWorkspaceId, dataset = dataset, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), whereConditions = whereConditions)
  
    __obj.asInstanceOf[DatasetConfiguration]
  }
}

