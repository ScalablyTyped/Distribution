package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskAssignJobsParams
  extends stdLib.Object {
  /**
    * The name of the user or group to whom the job will be assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#assignJobs)
    */
  var assignedTo: java.lang.String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#assignJobs)
    */
  var assignedType: java.lang.String
  /**
    * An array of unique job Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#assignJobs)
    */
  var jobIds: js.Array[scala.Double]
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#assignJobs)
    */
  var user: java.lang.String
}

object JobTaskAssignJobsParams {
  @scala.inline
  def apply(
    assignedTo: java.lang.String,
    assignedType: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobIds: js.Array[scala.Double],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskAssignJobsParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignedTo")(assignedTo)
    __obj.updateDynamic("assignedType")(assignedType)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("jobIds")(jobIds)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[JobTaskAssignJobsParams]
  }
}

