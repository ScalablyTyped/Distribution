package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskDeleteLinkedRecordParams extends Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    */
  var jobId: Double
  /**
    * The unique id of the record in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    */
  var recordId: Double
  /**
    * The name of the table from which linked record will be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    */
  var tableName: String
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    */
  var user: String
}

object JobTaskDeleteLinkedRecordParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    recordId: Double,
    tableName: String,
    user: String
  ): JobTaskDeleteLinkedRecordParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), recordId = recordId, tableName = tableName, user = user)
  
    __obj.asInstanceOf[JobTaskDeleteLinkedRecordParams]
  }
}

