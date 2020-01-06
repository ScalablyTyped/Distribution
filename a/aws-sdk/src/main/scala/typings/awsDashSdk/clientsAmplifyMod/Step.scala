package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Step extends js.Object {
  /**
    *  URL to the artifact for the execution step. 
    */
  var artifactsUrl: js.UndefOr[ArtifactsUrl] = js.native
  /**
    *  The context for current step, will include build image if step is build. 
    */
  var context: js.UndefOr[Context] = js.native
  /**
    *  End date/ time of the execution step. 
    */
  var endTime: EndTime = js.native
  /**
    *  URL to the logs for the execution step. 
    */
  var logUrl: js.UndefOr[LogUrl] = js.native
  /**
    *  List of screenshot URLs for the execution step, if relevant. 
    */
  var screenshots: js.UndefOr[Screenshots] = js.native
  /**
    *  Start date/ time of the execution step. 
    */
  var startTime: StartTime = js.native
  /**
    *  Status of the execution step. 
    */
  var status: JobStatus = js.native
  /**
    *  The reason for current step status. 
    */
  var statusReason: js.UndefOr[StatusReason] = js.native
  /**
    *  Name of the execution step. 
    */
  var stepName: StepName = js.native
  /**
    *  URL to the test artifact for the execution step. 
    */
  var testArtifactsUrl: js.UndefOr[TestArtifactsUrl] = js.native
  /**
    *  URL to the test config for the execution step. 
    */
  var testConfigUrl: js.UndefOr[TestConfigUrl] = js.native
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
    statusReason: StatusReason = null,
    testArtifactsUrl: TestArtifactsUrl = null,
    testConfigUrl: TestConfigUrl = null
  ): Step = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stepName = stepName.asInstanceOf[js.Any])
    if (artifactsUrl != null) __obj.updateDynamic("artifactsUrl")(artifactsUrl.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl.asInstanceOf[js.Any])
    if (screenshots != null) __obj.updateDynamic("screenshots")(screenshots.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (testArtifactsUrl != null) __obj.updateDynamic("testArtifactsUrl")(testArtifactsUrl.asInstanceOf[js.Any])
    if (testConfigUrl != null) __obj.updateDynamic("testConfigUrl")(testConfigUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Step]
  }
}

