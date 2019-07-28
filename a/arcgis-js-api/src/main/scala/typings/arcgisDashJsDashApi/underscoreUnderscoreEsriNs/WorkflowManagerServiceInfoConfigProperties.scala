package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowManagerServiceInfoConfigProperties extends Object {
  /**
    * Indicates whether the location of interest (LOI) for jobs are allowed to overlap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AOIOVERLAP: String
  /**
    * The color of the current job's LOI when selected in the LOI tab. The value is in range of 0 to 167772155.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AOISELECTIONCOLOR: Double
  /**
    * Indicates whether the job will be automatically assigned based on step assignment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AUTOASSIGNJOB: Boolean
  /**
    * Indicates whether the job will be automatically closed after the last step in the workflow is marked as complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AUTOCLOSEJOB: Boolean
  /**
    * Indicates whether the job workflow witll be automatically committed to the database when saved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AUTOCOMMITWORKFLOW: Boolean
  /**
    * Indicates whether the status of the jobs will be automatically assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AUTOSTATUSASSIGN: Boolean
  /**
    * Indicates whether the user will be required to confirm that they want to mark the current procedural step as complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var CONFIRMPROCEDURALCHECK: Boolean
  /**
    * The default email address to be used in the sender field when sending notifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var DEFAULT_SENDER_EMAIL: String
  /**
    * The default name displayed to be used in the sender field when sending notifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var DEFAULT_SENDER_NAME: String
  /**
    * Indicates whether notifications will be sent as HTML.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var HTML_SUPPORT: String
  /**
    * The starting value of job ids in the system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var JOB_ID_START_VALUE: String
  /**
    * Indicates whether the the number of days for each hold is taken out of the pending days calculation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var PENDING_DAYS_USE_HOLDS: Boolean
  /**
    * Indicates whether the user attempting to delete a job version would be prompted to enter a password for the sde owner of the versions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var PROMPTSDEPWD: Boolean
  /**
    * Indicates whether it will be required to mark procedural steps as started.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var REQUIREPROCEDURALCHECKSTART: Double
  /**
    * Indicates whether the editing behavior will be restricted to data in the job's AOI using editing restriction rules.  **Possible Values:** Warn | NoSelect | Off
    *   * `Warn` - Warn users when selecting features outside the job AOI.
    *   * `NoSelect` - Prevent users from selecting features outside the job AOI.
    *   * `Off` - Allow edits to features outside the job AOI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var RESTRICT_AOI_OPTION: String
  /**
    * Indicates whether the spatial notifications will be sent on Workflow Manager Post.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SEND_SN_CUSTOM_POST: Boolean
  /**
    * Indicates whether the pending days will be displayed in the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SHOW_PENDING_DAYS: Boolean
  /**
    * Indicates whether to show step ids on workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SHOW_STEP_IDS: Boolean
  /**
    * Indicates whether the step completion percentage will be displayed on the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SHOW_STEP_PERCENT_COMPLETE: Boolean
  /**
    * The password of the authenticated SMTP user in the secure SMTP server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_PASSWORD: String
  /**
    * The SMTP server port to be used for sending notifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_PORT: String
  /**
    * SMTP Authentication protocol.  **Possible Values:** SSL | TLS
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_PROTOCOL: String
  /**
    * The name of the SMTP Server to be used for sending notifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_SERVER: String
  /**
    * The user name that is authenticated in the secure SMTP server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_USERNAME: String
  /**
    * Indicates the user store of the Workflow Manager system, whether the users will be stored in a Portal or the Workflow Manager system.  **Possible Values:** traditional | portal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var USER_STORE: String
  /**
    * Indicates whether a user will be authenticated using domain along with the user name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var USEUSERDOMAIN: Boolean
  /**
    * Indicates whether to use step status assignment such that the job's status updates to match the step status when the step is reached.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var USE_STEP_STATUS: Boolean
  /**
    * The fill color of a selected step in a workflow. The value is in range of 0 to 167772155. When the option is disabled it's value is -1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var WF_SEL_STEP_FILL_COLOR: Double
  /**
    * The outline color of a selected step in a workflow. The value is in range of 0 to 167772155. When the option is disabled it's value is -1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var WF_SEL_STEP_OUTLINE_COLOR: Double
  /**
    * The outline width of a selected step in a workflow.  **Possible Values:** 1 | 2 | 3
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var WF_SEL_STEP_OUTLINE_WIDTH: Double
  /**
    * Indicates whether the LOI of the job will be automatically zoomed to in the LOI tab.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var ZOOMTOAOI: Boolean
}

object WorkflowManagerServiceInfoConfigProperties {
  @scala.inline
  def apply(
    AOIOVERLAP: String,
    AOISELECTIONCOLOR: Double,
    AUTOASSIGNJOB: Boolean,
    AUTOCLOSEJOB: Boolean,
    AUTOCOMMITWORKFLOW: Boolean,
    AUTOSTATUSASSIGN: Boolean,
    CONFIRMPROCEDURALCHECK: Boolean,
    DEFAULT_SENDER_EMAIL: String,
    DEFAULT_SENDER_NAME: String,
    HTML_SUPPORT: String,
    JOB_ID_START_VALUE: String,
    PENDING_DAYS_USE_HOLDS: Boolean,
    PROMPTSDEPWD: Boolean,
    REQUIREPROCEDURALCHECKSTART: Double,
    RESTRICT_AOI_OPTION: String,
    SEND_SN_CUSTOM_POST: Boolean,
    SHOW_PENDING_DAYS: Boolean,
    SHOW_STEP_IDS: Boolean,
    SHOW_STEP_PERCENT_COMPLETE: Boolean,
    SMTP_PASSWORD: String,
    SMTP_PORT: String,
    SMTP_PROTOCOL: String,
    SMTP_SERVER: String,
    SMTP_USERNAME: String,
    USER_STORE: String,
    USEUSERDOMAIN: Boolean,
    USE_STEP_STATUS: Boolean,
    WF_SEL_STEP_FILL_COLOR: Double,
    WF_SEL_STEP_OUTLINE_COLOR: Double,
    WF_SEL_STEP_OUTLINE_WIDTH: Double,
    ZOOMTOAOI: Boolean,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WorkflowManagerServiceInfoConfigProperties = {
    val __obj = js.Dynamic.literal(AOIOVERLAP = AOIOVERLAP, AOISELECTIONCOLOR = AOISELECTIONCOLOR, AUTOASSIGNJOB = AUTOASSIGNJOB, AUTOCLOSEJOB = AUTOCLOSEJOB, AUTOCOMMITWORKFLOW = AUTOCOMMITWORKFLOW, AUTOSTATUSASSIGN = AUTOSTATUSASSIGN, CONFIRMPROCEDURALCHECK = CONFIRMPROCEDURALCHECK, DEFAULT_SENDER_EMAIL = DEFAULT_SENDER_EMAIL, DEFAULT_SENDER_NAME = DEFAULT_SENDER_NAME, HTML_SUPPORT = HTML_SUPPORT, JOB_ID_START_VALUE = JOB_ID_START_VALUE, PENDING_DAYS_USE_HOLDS = PENDING_DAYS_USE_HOLDS, PROMPTSDEPWD = PROMPTSDEPWD, REQUIREPROCEDURALCHECKSTART = REQUIREPROCEDURALCHECKSTART, RESTRICT_AOI_OPTION = RESTRICT_AOI_OPTION, SEND_SN_CUSTOM_POST = SEND_SN_CUSTOM_POST, SHOW_PENDING_DAYS = SHOW_PENDING_DAYS, SHOW_STEP_IDS = SHOW_STEP_IDS, SHOW_STEP_PERCENT_COMPLETE = SHOW_STEP_PERCENT_COMPLETE, SMTP_PASSWORD = SMTP_PASSWORD, SMTP_PORT = SMTP_PORT, SMTP_PROTOCOL = SMTP_PROTOCOL, SMTP_SERVER = SMTP_SERVER, SMTP_USERNAME = SMTP_USERNAME, USER_STORE = USER_STORE, USEUSERDOMAIN = USEUSERDOMAIN, USE_STEP_STATUS = USE_STEP_STATUS, WF_SEL_STEP_FILL_COLOR = WF_SEL_STEP_FILL_COLOR, WF_SEL_STEP_OUTLINE_COLOR = WF_SEL_STEP_OUTLINE_COLOR, WF_SEL_STEP_OUTLINE_WIDTH = WF_SEL_STEP_OUTLINE_WIDTH, ZOOMTOAOI = ZOOMTOAOI, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[WorkflowManagerServiceInfoConfigProperties]
  }
}

