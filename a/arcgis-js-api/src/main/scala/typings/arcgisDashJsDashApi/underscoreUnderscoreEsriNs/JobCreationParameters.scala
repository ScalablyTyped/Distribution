package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCreationParameters extends Object {
  /**
    * The name of the user or group to whom the job will be assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var assignedTo: String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var assignedType: String
  /**
    * Indicates whether the workflow will be automatically committed upon creation of the job. The workflow cannot be edited after being committed to the system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var autoCommitWorkflow: Boolean
  /**
    * Indicates whether the job workflow will start execution automatically upon creation  of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var autoExecute: Boolean
  /**
    * The unique id of the data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var dataWorkspaceId: String
  /**
    * The description of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var description: String
  /**
    * The date on which the job is expected to be complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var dueDate: Date
  /**
    * The unique id of the job type from which to create the new job from.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var jobTypeId: Double
  /**
    * The geometry of the job's location of interest (LOI). Supported geometry types include point, multipoint and polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var loi: Geometry
  /**
    * The name of the new job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var name: String
  /**
    * The number of jobs to be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var numJobs: String
  /**
    * The name of the user that will own the job. Job ownership allows modification of job properties and not workflow execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var ownedBy: String
  /**
    * The unique id of the job that will be designated as the parent job of the new job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var parentJobId: Double
  /**
    * The name of the geodatabase version that will be the parent version of the new job's version. By default it will be the parent version of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var parentVersion: String
  /**
    * The numeric value to denote priority of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var priority: Double
  /**
    * The date on which the job is scheduled to begin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var startDate: Date
  /**
    * The username of the user creating the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var user: String
}

object JobCreationParameters {
  @scala.inline
  def apply(
    assignedTo: String,
    assignedType: String,
    autoCommitWorkflow: Boolean,
    autoExecute: Boolean,
    constructor: js.Function,
    dataWorkspaceId: String,
    description: String,
    dueDate: Date,
    hasOwnProperty: PropertyKey => Boolean,
    jobTypeId: Double,
    loi: Geometry,
    name: String,
    numJobs: String,
    ownedBy: String,
    parentJobId: Double,
    parentVersion: String,
    priority: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    startDate: Date,
    user: String
  ): JobCreationParameters = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, assignedType = assignedType, autoCommitWorkflow = autoCommitWorkflow, autoExecute = autoExecute, constructor = constructor, dataWorkspaceId = dataWorkspaceId, description = description, dueDate = dueDate, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobTypeId = jobTypeId, loi = loi, name = name, numJobs = numJobs, ownedBy = ownedBy, parentJobId = parentJobId, parentVersion = parentVersion, priority = priority, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), startDate = startDate, user = user)
  
    __obj.asInstanceOf[JobCreationParameters]
  }
}

