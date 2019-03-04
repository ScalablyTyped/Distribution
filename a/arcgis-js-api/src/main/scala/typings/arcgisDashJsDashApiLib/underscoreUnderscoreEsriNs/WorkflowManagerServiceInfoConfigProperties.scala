package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowManagerServiceInfoConfigProperties
  extends stdLib.Object {
  /**
    * Indicates whether the location of interest (LOI) for jobs are allowed to overlap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AOIOVERLAP: java.lang.String
  /**
    * The color of the current job's LOI when selected in the LOI tab. The value is in range of 0 to 167772155.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AOISELECTIONCOLOR: scala.Double
  /**
    * Indicates whether the job will be automatically assigned based on step assignment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AUTOASSIGNJOB: scala.Boolean
  /**
    * Indicates whether the job will be automatically closed after the last step in the workflow is marked as complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AUTOCLOSEJOB: scala.Boolean
  /**
    * Indicates whether the job workflow witll be automatically committed to the database when saved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AUTOCOMMITWORKFLOW: scala.Boolean
  /**
    * Indicates whether the status of the jobs will be automatically assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var AUTOSTATUSASSIGN: scala.Boolean
  /**
    * Indicates whether the user will be required to confirm that they want to mark the current procedural step as complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var CONFIRMPROCEDURALCHECK: scala.Boolean
  /**
    * The default email address to be used in the sender field when sending notifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var DEFAULT_SENDER_EMAIL: java.lang.String
  /**
    * The default name displayed to be used in the sender field when sending notifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var DEFAULT_SENDER_NAME: java.lang.String
  /**
    * Indicates whether notifications will be sent as HTML.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var HTML_SUPPORT: java.lang.String
  /**
    * The starting value of job ids in the system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var JOB_ID_START_VALUE: java.lang.String
  /**
    * Indicates whether the the number of days for each hold is taken out of the pending days calculation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var PENDING_DAYS_USE_HOLDS: scala.Boolean
  /**
    * Indicates whether the user attempting to delete a job version would be prompted to enter a password for the sde owner of the versions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var PROMPTSDEPWD: scala.Boolean
  /**
    * Indicates whether it will be required to mark procedural steps as started.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var REQUIREPROCEDURALCHECKSTART: scala.Double
  /**
    * Indicates whether the editing behavior will be restricted to data in the job's AOI using editing restriction rules.  **Possible Values:** Warn | NoSelect | Off
    *   * `Warn` - Warn users when selecting features outside the job AOI.
    *   * `NoSelect` - Prevent users from selecting features outside the job AOI.
    *   * `Off` - Allow edits to features outside the job AOI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var RESTRICT_AOI_OPTION: java.lang.String
  /**
    * Indicates whether the spatial notifications will be sent on Workflow Manager Post.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SEND_SN_CUSTOM_POST: scala.Boolean
  /**
    * Indicates whether the pending days will be displayed in the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SHOW_PENDING_DAYS: scala.Boolean
  /**
    * Indicates whether to show step ids on workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SHOW_STEP_IDS: scala.Boolean
  /**
    * Indicates whether the step completion percentage will be displayed on the step.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SHOW_STEP_PERCENT_COMPLETE: scala.Boolean
  /**
    * The password of the authenticated SMTP user in the secure SMTP server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_PASSWORD: java.lang.String
  /**
    * The SMTP server port to be used for sending notifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_PORT: java.lang.String
  /**
    * SMTP Authentication protocol.  **Possible Values:** SSL | TLS
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_PROTOCOL: java.lang.String
  /**
    * The name of the SMTP Server to be used for sending notifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_SERVER: java.lang.String
  /**
    * The user name that is authenticated in the secure SMTP server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var SMTP_USERNAME: java.lang.String
  /**
    * Indicates the user store of the Workflow Manager system, whether the users will be stored in a Portal or the Workflow Manager system.  **Possible Values:** traditional | portal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var USER_STORE: java.lang.String
  /**
    * Indicates whether a user will be authenticated using domain along with the user name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var USEUSERDOMAIN: scala.Boolean
  /**
    * Indicates whether to use step status assignment such that the job's status updates to match the step status when the step is reached.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var USE_STEP_STATUS: scala.Boolean
  /**
    * The fill color of a selected step in a workflow. The value is in range of 0 to 167772155. When the option is disabled it's value is -1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var WF_SEL_STEP_FILL_COLOR: scala.Double
  /**
    * The outline color of a selected step in a workflow. The value is in range of 0 to 167772155. When the option is disabled it's value is -1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var WF_SEL_STEP_OUTLINE_COLOR: scala.Double
  /**
    * The outline width of a selected step in a workflow.  **Possible Values:** 1 | 2 | 3
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var WF_SEL_STEP_OUTLINE_WIDTH: scala.Double
  /**
    * Indicates whether the LOI of the job will be automatically zoomed to in the LOI tab.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#WorkflowManagerServiceInfo)
    */
  var ZOOMTOAOI: scala.Boolean
}

object WorkflowManagerServiceInfoConfigProperties {
  @scala.inline
  def apply(
    AOIOVERLAP: java.lang.String,
    AOISELECTIONCOLOR: scala.Double,
    AUTOASSIGNJOB: scala.Boolean,
    AUTOCLOSEJOB: scala.Boolean,
    AUTOCOMMITWORKFLOW: scala.Boolean,
    AUTOSTATUSASSIGN: scala.Boolean,
    CONFIRMPROCEDURALCHECK: scala.Boolean,
    DEFAULT_SENDER_EMAIL: java.lang.String,
    DEFAULT_SENDER_NAME: java.lang.String,
    HTML_SUPPORT: java.lang.String,
    JOB_ID_START_VALUE: java.lang.String,
    PENDING_DAYS_USE_HOLDS: scala.Boolean,
    PROMPTSDEPWD: scala.Boolean,
    REQUIREPROCEDURALCHECKSTART: scala.Double,
    RESTRICT_AOI_OPTION: java.lang.String,
    SEND_SN_CUSTOM_POST: scala.Boolean,
    SHOW_PENDING_DAYS: scala.Boolean,
    SHOW_STEP_IDS: scala.Boolean,
    SHOW_STEP_PERCENT_COMPLETE: scala.Boolean,
    SMTP_PASSWORD: java.lang.String,
    SMTP_PORT: java.lang.String,
    SMTP_PROTOCOL: java.lang.String,
    SMTP_SERVER: java.lang.String,
    SMTP_USERNAME: java.lang.String,
    USER_STORE: java.lang.String,
    USEUSERDOMAIN: scala.Boolean,
    USE_STEP_STATUS: scala.Boolean,
    WF_SEL_STEP_FILL_COLOR: scala.Double,
    WF_SEL_STEP_OUTLINE_COLOR: scala.Double,
    WF_SEL_STEP_OUTLINE_WIDTH: scala.Double,
    ZOOMTOAOI: scala.Boolean,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): WorkflowManagerServiceInfoConfigProperties = {
    val __obj = js.Dynamic.literal(AOIOVERLAP = AOIOVERLAP, AOISELECTIONCOLOR = AOISELECTIONCOLOR, AUTOASSIGNJOB = AUTOASSIGNJOB, AUTOCLOSEJOB = AUTOCLOSEJOB, AUTOCOMMITWORKFLOW = AUTOCOMMITWORKFLOW, AUTOSTATUSASSIGN = AUTOSTATUSASSIGN, CONFIRMPROCEDURALCHECK = CONFIRMPROCEDURALCHECK, DEFAULT_SENDER_EMAIL = DEFAULT_SENDER_EMAIL, DEFAULT_SENDER_NAME = DEFAULT_SENDER_NAME, HTML_SUPPORT = HTML_SUPPORT, JOB_ID_START_VALUE = JOB_ID_START_VALUE, PENDING_DAYS_USE_HOLDS = PENDING_DAYS_USE_HOLDS, PROMPTSDEPWD = PROMPTSDEPWD, REQUIREPROCEDURALCHECKSTART = REQUIREPROCEDURALCHECKSTART, RESTRICT_AOI_OPTION = RESTRICT_AOI_OPTION, SEND_SN_CUSTOM_POST = SEND_SN_CUSTOM_POST, SHOW_PENDING_DAYS = SHOW_PENDING_DAYS, SHOW_STEP_IDS = SHOW_STEP_IDS, SHOW_STEP_PERCENT_COMPLETE = SHOW_STEP_PERCENT_COMPLETE, SMTP_PASSWORD = SMTP_PASSWORD, SMTP_PORT = SMTP_PORT, SMTP_PROTOCOL = SMTP_PROTOCOL, SMTP_SERVER = SMTP_SERVER, SMTP_USERNAME = SMTP_USERNAME, USER_STORE = USER_STORE, USEUSERDOMAIN = USEUSERDOMAIN, USE_STEP_STATUS = USE_STEP_STATUS, WF_SEL_STEP_FILL_COLOR = WF_SEL_STEP_FILL_COLOR, WF_SEL_STEP_OUTLINE_COLOR = WF_SEL_STEP_OUTLINE_COLOR, WF_SEL_STEP_OUTLINE_WIDTH = WF_SEL_STEP_OUTLINE_WIDTH, ZOOMTOAOI = ZOOMTOAOI, constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[WorkflowManagerServiceInfoConfigProperties]
  }
}

