package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskDeleteLinkedRecordParams
  extends stdLib.Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    */
  var jobId: scala.Double
  /**
    * The unique id of the record in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    */
  var recordId: scala.Double
  /**
    * The name of the table from which linked record will be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    */
  var tableName: java.lang.String
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteLinkedRecord)
    */
  var user: java.lang.String
}

object JobTaskDeleteLinkedRecordParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    recordId: scala.Double,
    tableName: java.lang.String,
    user: java.lang.String
  ): JobTaskDeleteLinkedRecordParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, jobId = jobId, propertyIsEnumerable = propertyIsEnumerable, recordId = recordId, tableName = tableName, user = user)
  
    __obj.asInstanceOf[JobTaskDeleteLinkedRecordParams]
  }
}

