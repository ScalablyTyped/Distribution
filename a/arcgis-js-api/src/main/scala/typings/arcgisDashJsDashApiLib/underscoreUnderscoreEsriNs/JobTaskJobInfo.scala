package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskJobInfo
  extends stdLib.Object {
  /**
    * The name of the user or group to whom the job is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var assignedTo: java.lang.String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var assignedType: java.lang.String
  /**
    * An array of unique job ids designated as child jobs for the current job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var childJobIds: js.Array[scala.Double]
  /**
    * The user name of the person that created the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var createdBy: java.lang.String
  /**
    * The date the job was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var createdDate: stdLib.Date
  /**
    * The unique id of the data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var dataWorkspaceId: java.lang.String
  /**
    * The description of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var description: java.lang.String
  /**
    * The date on which the job is expected to be complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var dueDate: stdLib.Date
  /**
    * The actual date the job's workflow was completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var endDate: stdLib.Date
  /**
    * The unique id to identify the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var id: scala.Double
  /**
    * The unique id of the job type whose instance is the current job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var jobTypeId: scala.Double
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
  var name: java.lang.String
  /**
    * The name of the user that will own the job. Job ownership allows modification of job properties and not workflow execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var ownedBy: java.lang.String
  /**
    * The unique id of the job that will be designated as the parent job of the new job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var parentJobId: scala.Double
  /**
    * The name of the geodatabase version that is the parent version of the job's version. By default it will be the parent version of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var parentVersion: java.lang.String
  /**
    * The number of days that the job has been active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var pendingDays: scala.Double
  /**
    * The percentage of work completed on the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var percentageComplete: scala.Double
  /**
    * The numeric value to denote priority of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var priority: scala.Double
  /**
    * The internal stage of the job which corresponds to the status of the job.  **Possible Values:** created | ready | working | done | closed
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var stage: java.lang.String
  /**
    * The date on which the job is scheduled to begin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var startDate: stdLib.Date
  /**
    * The numeric value to represent the current status of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var status: scala.Double
  /**
    * Indicates whether a version exists for the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobInfo)
    */
  var versionExists: scala.Boolean
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
  var versionName: java.lang.String
}

object JobTaskJobInfo {
  @scala.inline
  def apply(
    assignedTo: java.lang.String,
    assignedType: java.lang.String,
    childJobIds: js.Array[scala.Double],
    constructor: js.Function,
    createdBy: java.lang.String,
    createdDate: stdLib.Date,
    dataWorkspaceId: java.lang.String,
    description: java.lang.String,
    dueDate: stdLib.Date,
    endDate: stdLib.Date,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    jobTypeId: scala.Double,
    loi: Geometry,
    name: java.lang.String,
    ownedBy: java.lang.String,
    parentJobId: scala.Double,
    parentVersion: java.lang.String,
    pendingDays: scala.Double,
    percentageComplete: scala.Double,
    priority: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stage: java.lang.String,
    startDate: stdLib.Date,
    status: scala.Double,
    versionExists: scala.Boolean,
    versionInfo: JobVersionInfo,
    versionName: java.lang.String
  ): JobTaskJobInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignedTo")(assignedTo)
    __obj.updateDynamic("assignedType")(assignedType)
    __obj.updateDynamic("childJobIds")(childJobIds)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("createdBy")(createdBy)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("dataWorkspaceId")(dataWorkspaceId)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("dueDate")(dueDate)
    __obj.updateDynamic("endDate")(endDate)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("jobTypeId")(jobTypeId)
    __obj.updateDynamic("loi")(loi)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ownedBy")(ownedBy)
    __obj.updateDynamic("parentJobId")(parentJobId)
    __obj.updateDynamic("parentVersion")(parentVersion)
    __obj.updateDynamic("pendingDays")(pendingDays)
    __obj.updateDynamic("percentageComplete")(percentageComplete)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("stage")(stage)
    __obj.updateDynamic("startDate")(startDate)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("versionExists")(versionExists)
    __obj.updateDynamic("versionInfo")(versionInfo)
    __obj.updateDynamic("versionName")(versionName)
    __obj.asInstanceOf[JobTaskJobInfo]
  }
}

