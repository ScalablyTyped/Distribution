package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowAutomationParameters extends js.Object {
  /**
    * The version of an Automation document to use during task execution.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The parameters for the AUTOMATION task. For information about specifying and updating task parameters, see RegisterTaskWithMaintenanceWindow and UpdateMaintenanceWindowTask.   LoggingInfo has been deprecated. To specify an S3 bucket to contain logs, instead use the OutputS3BucketName and OutputS3KeyPrefix options in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters.  TaskParameters has been deprecated. To specify parameters to pass to a task when it runs, instead use the Parameters option in the TaskInvocationParameters structure. For information about how Systems Manager handles these options for the supported Maintenance Window task types, see MaintenanceWindowTaskInvocationParameters. For AUTOMATION task types, Systems Manager ignores any values specified for these parameters. 
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.undefined
}

object MaintenanceWindowAutomationParameters {
  @scala.inline
  def apply(DocumentVersion: DocumentVersion = null, Parameters: AutomationParameterMap = null): MaintenanceWindowAutomationParameters = {
    val __obj = js.Dynamic.literal()
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[MaintenanceWindowAutomationParameters]
  }
}

