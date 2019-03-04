package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobUpdateParameters
  extends stdLib.Object {
  /**
    * The name of the user or group to whom the job will be assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var assignedTo: java.lang.String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var assignedType: java.lang.String
  /**
    * The unique id of the data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var dataWorkspaceId: java.lang.String
  /**
    * The description of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var description: java.lang.String
  /**
    * The date on which the job is expected to be complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var dueDate: stdLib.Date
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var jobId: scala.Double
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
  var name: java.lang.String
  /**
    * The name of the user that will own the job. Job ownership allows modification of job properties and not workflow execution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var ownedBy: java.lang.String
  /**
    * The unique id of the job that will be designated as the parent job of the new job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var parentJobId: scala.Double
  /**
    * The name of the geodatabase version that will be the parent version of the new job's version. By default it will be the parent version of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var parentVersion: java.lang.String
  /**
    * The percentage of work completed on the job's current step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var percent: scala.Double
  /**
    * The numeric value to denote priority of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var priority: scala.Double
  /**
    * The date on which the job is scheduled to begin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var startDate: stdLib.Date
  /**
    * The unique id of the job's new status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var status: scala.Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var user: java.lang.String
  /**
    * The name of the geodatabase version to be used for the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobUpdateParameters)
    */
  var versionName: java.lang.String
}

object JobUpdateParameters {
  @scala.inline
  def apply(
    assignedTo: java.lang.String,
    assignedType: java.lang.String,
    constructor: js.Function,
    dataWorkspaceId: java.lang.String,
    description: java.lang.String,
    dueDate: stdLib.Date,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    loi: Geometry,
    name: java.lang.String,
    ownedBy: java.lang.String,
    parentJobId: scala.Double,
    parentVersion: java.lang.String,
    percent: scala.Double,
    priority: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    startDate: stdLib.Date,
    status: scala.Double,
    user: java.lang.String,
    versionName: java.lang.String
  ): JobUpdateParameters = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo, assignedType = assignedType, constructor = constructor, dataWorkspaceId = dataWorkspaceId, description = description, dueDate = dueDate, hasOwnProperty = hasOwnProperty, jobId = jobId, loi = loi, name = name, ownedBy = ownedBy, parentJobId = parentJobId, parentVersion = parentVersion, percent = percent, priority = priority, propertyIsEnumerable = propertyIsEnumerable, startDate = startDate, status = status, user = user, versionName = versionName)
  
    __obj.asInstanceOf[JobUpdateParameters]
  }
}

