package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetConfiguration
  extends stdLib.Object {
  /**
    * This indicates whether the notification will be sent always or if values change to defined in whereConditions or if values change from defined in whereConditions.  **Possible Values:** always | changed-to | changed-from
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var changeCondition: scala.Double
  /**
    * The name of the fields, changes to which trigger the notification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var changeFields: java.lang.String
  /**
    * The unique id of the data workspace containing the changed data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var dataWorkspaceId: java.lang.String
  /**
    * The name of the dataset that will trigger the notification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var dataset: java.lang.String
  /**
    * The name of the dataset configuration rule.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#DatasetConfiguration)
    */
  var name: java.lang.String
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
    changeCondition: scala.Double,
    changeFields: java.lang.String,
    constructor: js.Function,
    dataWorkspaceId: java.lang.String,
    dataset: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    whereConditions: js.Array[WhereCondition]
  ): DatasetConfiguration = {
    val __obj = js.Dynamic.literal(changeCondition = changeCondition, changeFields = changeFields, constructor = constructor, dataWorkspaceId = dataWorkspaceId, dataset = dataset, hasOwnProperty = hasOwnProperty, name = name, propertyIsEnumerable = propertyIsEnumerable, whereConditions = whereConditions)
  
    __obj.asInstanceOf[DatasetConfiguration]
  }
}

