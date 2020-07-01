package typings.awsLambda.codebuildCloudwatchStateMod

import typings.awsLambda.awsLambdaStrings.`CodeBuild Build State Change`
import typings.awsLambda.awsLambdaStrings.awsDotcodebuild
import typings.awsLambda.eventbridgeMod.EventBridgeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeBuildCloudWatchStateEvent extends EventBridgeEvent[`CodeBuild Build State Change`, CodeBuildStateEventDetail] {
  @JSName("source")
  var source_CodeBuildCloudWatchStateEvent: awsDotcodebuild
}

object CodeBuildCloudWatchStateEvent {
  @scala.inline
  def apply(
    account: String,
    detail: CodeBuildStateEventDetail,
    `detail-type`: `CodeBuild Build State Change`,
    id: String,
    region: String,
    resources: js.Array[String],
    source: awsDotcodebuild,
    time: String,
    version: String
  ): CodeBuildCloudWatchStateEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeBuildCloudWatchStateEvent]
  }
}

