package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobUpdateParameters extends Object {
  /**
    * The name of the user or group to whom the job will be assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var assignedTo: String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var assignedType: String
  /**
    * The unique id of the data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var dataWorkspaceId: String
  /**
    * The description of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var description: String
  /**
    * The date on which the job is expected to be complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var dueDate: Date
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var jobId: Double
  /**
    * The geometry of the job's location of interest (LOI). Supported geometry types include point, multipoint and polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var loi: Geometry
  /**
    * The name of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var name: String
  /**
    * The name of the user that will own the job. Job ownership allows modification of job properties and not workflow execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var ownedBy: String
  /**
    * The unique id of the job that will be designated as the parent job of the new job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var parentJobId: Double
  /**
    * The name of the geodatabase version that will be the parent version of the new job's version. By default it will be the parent version of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var parentVersion: String
  /**
    * The percentage of work completed on the job's current step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var percent: Double
  /**
    * The numeric value to denote priority of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var priority: Double
  /**
    * The date on which the job is scheduled to begin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var startDate: Date
  /**
    * The unique id of the job's new status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var status: Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var user: String
  /**
    * The name of the geodatabase version to be used for the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var versionName: String
}

object JobUpdateParameters {
  @scala.inline
  def apply(
    assignedTo: String,
    assignedType: String,
    constructor: js.Function,
    dataWorkspaceId: String,
    description: String,
    dueDate: Date,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    loi: Geometry,
    name: String,
    ownedBy: String,
    parentJobId: Double,
    parentVersion: String,
    percent: Double,
    priority: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    startDate: Date,
    status: Double,
    user: String,
    versionName: String
  ): JobUpdateParameters = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, assignedType = assignedType, constructor = constructor, dataWorkspaceId = dataWorkspaceId, description = description, dueDate = dueDate, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, loi = loi, name = name, ownedBy = ownedBy, parentJobId = parentJobId, parentVersion = parentVersion, percent = percent, priority = priority, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), startDate = startDate, status = status, user = user, versionName = versionName)
  
    __obj.asInstanceOf[JobUpdateParameters]
  }
}

