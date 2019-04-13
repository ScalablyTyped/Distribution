package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Step extends js.Object {
  /**
    *  Url to teh artifact for the execution step. 
    */
  var artifactsUrl: js.UndefOr[ArtifactsUrl] = js.undefined
  /**
    *  End date/ time of the execution step. 
    */
  var endTime: EndTime
  /**
    *  Url to the logs for the execution step. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.undefined
  /**
    *  List of screenshot Urls for the execution step, if relevant. 
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
    logUrl: LogUrl = null,
    screenshots: Screenshots = null
  ): Step = {
    val __obj = js.Dynamic.literal(endTime = endTime, startTime = startTime, status = status.asInstanceOf[js.Any], stepName = stepName)
    if (artifactsUrl != null) __obj.updateDynamic("artifactsUrl")(artifactsUrl)
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl)
    if (screenshots != null) __obj.updateDynamic("screenshots")(screenshots)
    __obj.asInstanceOf[Step]
  }
}

