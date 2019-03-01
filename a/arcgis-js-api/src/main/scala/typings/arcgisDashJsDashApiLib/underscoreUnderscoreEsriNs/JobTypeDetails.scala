package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTypeDetails
  extends stdLib.Object {
  /**
    * Indicates whether jobs of this type will have their workflows automatically executed, when created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var autoExecuteCreatedJobs: scala.Boolean
  /**
    * Indicates whether jobs of this type allows users to modify the current data workspace in the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var canDataWorkspaceChange: scala.Boolean
  /**
    * The category of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var category: java.lang.String
  /**
    * The name of the user or group that the job will be assigned to by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultAssignedTo: java.lang.String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned by default.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultAssignedType: java.lang.String
  /**
    * The unique id of the default data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDataWorkspaceId: java.lang.String
  /**
    * The description that gets associated with the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDescription: java.lang.String
  /**
    * The default due date of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDueDate: java.lang.String
  /**
    * The duration for completing the job assigned by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultJobDuration: scala.Double
  /**
    * The name of the geodatabase version that will be assigned the parent version of the job's geodatabase by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultParentVersionName: java.lang.String
  /**
    * The numeric priority value assigned to the job by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultPriority: java.lang.String
  /**
    * The default start date of this job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultStartDate: stdLib.Date
  /**
    * The description of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var description: java.lang.String
  /**
    * The unique id automatically generated for this job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var id: java.lang.String
  /**
    * The naming scheme for this job type, which would serve as template for the name of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var jobNamingScheme: java.lang.String
  /**
    * The naming scheme for this job type, which would serve as template for the name of job's version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var jobVersionNamingScheme: java.lang.String
  /**
    * The naming scheme for this job type, which would serve as template for the name of job's map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var mxdNamingScheme: java.lang.String
  /**
    * The job type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var name: java.lang.String
  /**
    * The state of the job type.  **Possible Values:** draft | active | retired
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var state: java.lang.String
}

object JobTypeDetails {
  @scala.inline
  def apply(
    autoExecuteCreatedJobs: scala.Boolean,
    canDataWorkspaceChange: scala.Boolean,
    category: java.lang.String,
    constructor: js.Function,
    defaultAssignedTo: java.lang.String,
    defaultAssignedType: java.lang.String,
    defaultDataWorkspaceId: java.lang.String,
    defaultDescription: java.lang.String,
    defaultDueDate: java.lang.String,
    defaultJobDuration: scala.Double,
    defaultParentVersionName: java.lang.String,
    defaultPriority: java.lang.String,
    defaultStartDate: stdLib.Date,
    description: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: java.lang.String,
    jobNamingScheme: java.lang.String,
    jobVersionNamingScheme: java.lang.String,
    mxdNamingScheme: java.lang.String,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    state: java.lang.String
  ): JobTypeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoExecuteCreatedJobs")(autoExecuteCreatedJobs)
    __obj.updateDynamic("canDataWorkspaceChange")(canDataWorkspaceChange)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("defaultAssignedTo")(defaultAssignedTo)
    __obj.updateDynamic("defaultAssignedType")(defaultAssignedType)
    __obj.updateDynamic("defaultDataWorkspaceId")(defaultDataWorkspaceId)
    __obj.updateDynamic("defaultDescription")(defaultDescription)
    __obj.updateDynamic("defaultDueDate")(defaultDueDate)
    __obj.updateDynamic("defaultJobDuration")(defaultJobDuration)
    __obj.updateDynamic("defaultParentVersionName")(defaultParentVersionName)
    __obj.updateDynamic("defaultPriority")(defaultPriority)
    __obj.updateDynamic("defaultStartDate")(defaultStartDate)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("jobNamingScheme")(jobNamingScheme)
    __obj.updateDynamic("jobVersionNamingScheme")(jobVersionNamingScheme)
    __obj.updateDynamic("mxdNamingScheme")(mxdNamingScheme)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[JobTypeDetails]
  }
}

