package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskListFieldValuesParams
  extends stdLib.Object {
  /**
    * The field name of the extended property for which to retrieve values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listFieldValues)
    */
  var field: java.lang.String
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listFieldValues)
    */
  var jobId: scala.Double
  /**
    * The name of the extended property table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listFieldValues)
    */
  var tableName: java.lang.String
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listFieldValues)
    */
  var user: java.lang.String
}

object JobTaskListFieldValuesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    tableName: java.lang.String,
    user: java.lang.String
  ): JobTaskListFieldValuesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = hasOwnProperty, jobId = jobId, propertyIsEnumerable = propertyIsEnumerable, tableName = tableName, user = user)
  
    __obj.asInstanceOf[JobTaskListFieldValuesParams]
  }
}

