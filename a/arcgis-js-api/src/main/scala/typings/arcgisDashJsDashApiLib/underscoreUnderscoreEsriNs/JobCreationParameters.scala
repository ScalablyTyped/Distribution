package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCreationParameters
  extends stdLib.Object {
  /**
    * The name of the user or group to whom the job will be assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var assignedTo: java.lang.String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var assignedType: java.lang.String
  /**
    * Indicates whether the workflow will be automatically committed upon creation of the job. The workflow cannot be edited after being committed to the system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var autoCommitWorkflow: scala.Boolean
  /**
    * Indicates whether the job workflow will start execution automatically upon creation  of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var autoExecute: scala.Boolean
  /**
    * The unique id of the data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var dataWorkspaceId: java.lang.String
  /**
    * The description of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var description: java.lang.String
  /**
    * The date on which the job is expected to be complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var dueDate: stdLib.Date
  /**
    * The unique id of the job type from which to create the new job from.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var jobTypeId: scala.Double
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
  var name: java.lang.String
  /**
    * The number of jobs to be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var numJobs: java.lang.String
  /**
    * The name of the user that will own the job. Job ownership allows modification of job properties and not workflow execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var ownedBy: java.lang.String
  /**
    * The unique id of the job that will be designated as the parent job of the new job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var parentJobId: scala.Double
  /**
    * The name of the geodatabase version that will be the parent version of the new job's version. By default it will be the parent version of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var parentVersion: java.lang.String
  /**
    * The numeric value to denote priority of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var priority: scala.Double
  /**
    * The date on which the job is scheduled to begin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var startDate: stdLib.Date
  /**
    * The username of the user creating the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobCreationParameters)
    */
  var user: java.lang.String
}

object JobCreationParameters {
  @scala.inline
  def apply(
    assignedTo: java.lang.String,
    assignedType: java.lang.String,
    autoCommitWorkflow: scala.Boolean,
    autoExecute: scala.Boolean,
    constructor: js.Function,
    dataWorkspaceId: java.lang.String,
    description: java.lang.String,
    dueDate: stdLib.Date,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobTypeId: scala.Double,
    loi: Geometry,
    name: java.lang.String,
    numJobs: java.lang.String,
    ownedBy: java.lang.String,
    parentJobId: scala.Double,
    parentVersion: java.lang.String,
    priority: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    startDate: stdLib.Date,
    user: java.lang.String
  ): JobCreationParameters = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, assignedType = assignedType, autoCommitWorkflow = autoCommitWorkflow, autoExecute = autoExecute, constructor = constructor, dataWorkspaceId = dataWorkspaceId, description = description, dueDate = dueDate, hasOwnProperty = hasOwnProperty, jobTypeId = jobTypeId, loi = loi, name = name, numJobs = numJobs, ownedBy = ownedBy, parentJobId = parentJobId, parentVersion = parentVersion, priority = priority, propertyIsEnumerable = propertyIsEnumerable, startDate = startDate, user = user)
  
    __obj.asInstanceOf[JobCreationParameters]
  }
}

