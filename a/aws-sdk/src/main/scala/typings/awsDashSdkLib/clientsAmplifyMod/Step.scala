package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /**
    *  URL to the artifact for the execution step. 
    */
  var artifactsUrl: js.UndefOr[ArtifactsUrl] = js.undefined
  /**
    *  The context for current step, will include build image if step is build. 
    */
  var context: js.UndefOr[Context] = js.undefined
  /**
    *  End date/ time of the execution step. 
    */
  var endTime: EndTime
  /**
    *  URL to the logs for the execution step. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.undefined
  /**
    *  List of screenshot URLs for the execution step, if relevant. 
    */
  var screenshots: js.UndefOr[Screenshots] = js.undefined
  /**
    *  Start date/ time of the execution step. 
    */
  var startTime: StartTime
  /**
    *  Status of the execution step. 
    */
  var status: JobStatus
  /**
    *  The reason for current step status. 
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
  /**
    *  Name of the execution step. 
    */
  var stepName: StepName
}

object Step {
  @scala.inline
  def apply(
    endTime: EndTime,
    startTime: StartTime,
    status: JobStatus,
    stepName: StepName,
    artifactsUrl: ArtifactsUrl = null,
    context: Context = null,
    logUrl: LogUrl = null,
    screenshots: Screenshots = null,
    statusReason: StatusReason = null
  ): Step = {
    val __obj = js.Dynamic.literal(endTime = endTime, startTime = startTime, status = status.asInstanceOf[js.Any], stepName = stepName)
    if (artifactsUrl != null) __obj.updateDynamic("artifactsUrl")(artifactsUrl)
    if (context != null) __obj.updateDynamic("context")(context)
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl)
    if (screenshots != null) __obj.updateDynamic("screenshots")(screenshots)
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    __obj.asInstanceOf[Step]
  }
}

