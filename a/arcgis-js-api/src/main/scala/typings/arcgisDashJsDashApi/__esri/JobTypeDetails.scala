package typings.arcgisDashJsDashApi.__esri

import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTypeDetails extends Object {
  /**
    * Indicates whether jobs of this type will have their workflows automatically executed, when created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var autoExecuteCreatedJobs: Boolean
  /**
    * Indicates whether jobs of this type allows users to modify the current data workspace in the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var canDataWorkspaceChange: Boolean
  /**
    * The category of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var category: String
  /**
    * The name of the user or group that the job will be assigned to by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultAssignedTo: String
  /**
    * Indicates whether the job is assigned to a user, group or unassigned by default.  **Possible Values:** unassigned | user | group
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultAssignedType: String
  /**
    * The unique id of the default data workspace of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDataWorkspaceId: String
  /**
    * The description that gets associated with the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDescription: String
  /**
    * The default due date of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultDueDate: String
  /**
    * The duration for completing the job assigned by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultJobDuration: Double
  /**
    * The name of the geodatabase version that will be assigned the parent version of the job's geodatabase by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultParentVersionName: String
  /**
    * The numeric priority value assigned to the job by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultPriority: String
  /**
    * The default start date of this job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var defaultStartDate: Date
  /**
    * The description of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var description: String
  /**
    * The unique id automatically generated for this job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var id: String
  /**
    * The naming scheme for this job type, which would serve as template for the name of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var jobNamingScheme: String
  /**
    * The naming scheme for this job type, which would serve as template for the name of job's version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var jobVersionNamingScheme: String
  /**
    * The naming scheme for this job type, which would serve as template for the name of job's map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var mxdNamingScheme: String
  /**
    * The job type name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var name: String
  /**
    * The state of the job type.  **Possible Values:** draft | active | retired
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobTypeDetails)
    */
  var state: String
}

object JobTypeDetails {
  @scala.inline
  def apply(
    autoExecuteCreatedJobs: Boolean,
    canDataWorkspaceChange: Boolean,
    category: String,
    constructor: js.Function,
    defaultAssignedTo: String,
    defaultAssignedType: String,
    defaultDataWorkspaceId: String,
    defaultDescription: String,
    defaultDueDate: String,
    defaultJobDuration: Double,
    defaultParentVersionName: String,
    defaultPriority: String,
    defaultStartDate: Date,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    jobNamingScheme: String,
    jobVersionNamingScheme: String,
    mxdNamingScheme: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    state: String
  ): JobTypeDetails = {
    val __obj = js.Dynamic.literal(autoExecuteCreatedJobs = autoExecuteCreatedJobs.asInstanceOf[js.Any], canDataWorkspaceChange = canDataWorkspaceChange.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultAssignedTo = defaultAssignedTo.asInstanceOf[js.Any], defaultAssignedType = defaultAssignedType.asInstanceOf[js.Any], defaultDataWorkspaceId = defaultDataWorkspaceId.asInstanceOf[js.Any], defaultDescription = defaultDescription.asInstanceOf[js.Any], defaultDueDate = defaultDueDate.asInstanceOf[js.Any], defaultJobDuration = defaultJobDuration.asInstanceOf[js.Any], defaultParentVersionName = defaultParentVersionName.asInstanceOf[js.Any], defaultPriority = defaultPriority.asInstanceOf[js.Any], defaultStartDate = defaultStartDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], jobNamingScheme = jobNamingScheme.asInstanceOf[js.Any], jobVersionNamingScheme = jobVersionNamingScheme.asInstanceOf[js.Any], mxdNamingScheme = mxdNamingScheme.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobTypeDetails]
  }
}

