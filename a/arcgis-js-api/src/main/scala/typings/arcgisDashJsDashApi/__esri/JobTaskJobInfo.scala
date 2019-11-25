package typings.arcgisDashJsDashApi.__esri

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskJobInfo extends Object {
  /**
    * The name of the user or group to whom the job is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var assignedTo: String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var assignedType: String
  /**
    * An array of unique job ids designated as child jobs for the current job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var childJobIds: js.Array[Double]
  /**
    * The user name of the person that created the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var createdBy: String
  /**
    * The date the job was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var createdDate: Date
  /**
    * The unique id of the data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var dataWorkspaceId: String
  /**
    * The description of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var description: String
  /**
    * The date on which the job is expected to be complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var dueDate: Date
  /**
    * The actual date the job's workflow was completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var endDate: Date
  /**
    * The unique id to identify the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var id: Double
  /**
    * The unique id of the job type whose instance is the current job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var jobTypeId: Double
  /**
    * The geometry of the job's location of interest (LOI). Supported geometry types include point, multipoint and polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var loi: Geometry
  /**
    * The name of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var name: String
  /**
    * The name of the user that will own the job. Job ownership allows modification of job properties and not workflow execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var ownedBy: String
  /**
    * The unique id of the job that will be designated as the parent job of the new job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var parentJobId: Double
  /**
    * The name of the geodatabase version that is the parent version of the job's version. By default it will be the parent version of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var parentVersion: String
  /**
    * The number of days that the job has been active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var pendingDays: Double
  /**
    * The percentage of work completed on the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var percentageComplete: Double
  /**
    * The numeric value to denote priority of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var priority: Double
  /**
    * The internal stage of the job which corresponds to the status of the job.  **Possible Values:** created | ready | working | done | closed
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var stage: String
  /**
    * The date on which the job is scheduled to begin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var startDate: Date
  /**
    * The numeric value to represent the current status of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var status: Double
  /**
    * Indicates whether a version exists for the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var versionExists: Boolean
  /**
    * The information about job's geodatabase version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var versionInfo: JobVersionInfo
  /**
    * The name of the job's geodatabase version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var versionName: String
}

object JobTaskJobInfo {
  @scala.inline
  def apply(
    assignedTo: String,
    assignedType: String,
    childJobIds: js.Array[Double],
    constructor: js.Function,
    createdBy: String,
    createdDate: Date,
    dataWorkspaceId: String,
    description: String,
    dueDate: Date,
    endDate: Date,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    jobTypeId: Double,
    loi: Geometry,
    name: String,
    ownedBy: String,
    parentJobId: Double,
    parentVersion: String,
    pendingDays: Double,
    percentageComplete: Double,
    priority: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    stage: String,
    startDate: Date,
    status: Double,
    versionExists: Boolean,
    versionInfo: JobVersionInfo,
    versionName: String
  ): JobTaskJobInfo = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], assignedType = assignedType.asInstanceOf[js.Any], childJobIds = childJobIds.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], dataWorkspaceId = dataWorkspaceId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dueDate = dueDate.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], jobTypeId = jobTypeId.asInstanceOf[js.Any], loi = loi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownedBy = ownedBy.asInstanceOf[js.Any], parentJobId = parentJobId.asInstanceOf[js.Any], parentVersion = parentVersion.asInstanceOf[js.Any], pendingDays = pendingDays.asInstanceOf[js.Any], percentageComplete = percentageComplete.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stage = stage.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], versionExists = versionExists.asInstanceOf[js.Any], versionInfo = versionInfo.asInstanceOf[js.Any], versionName = versionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobTaskJobInfo]
  }
}

