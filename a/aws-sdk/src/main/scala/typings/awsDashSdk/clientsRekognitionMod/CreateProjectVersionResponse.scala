package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectVersionResponse extends js.Object {
  /**
    * The ARN of the model version that was created. Use DescribeProjectVersion to get the current status of the training operation.
    */
  var ProjectVersionArn: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ProjectVersionArn] = js.native
}

object CreateProjectVersionResponse {
  @scala.inline
  def apply(ProjectVersionArn: ProjectVersionArn = null): CreateProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (ProjectVersionArn != null) __obj.updateDynamic("ProjectVersionArn")(ProjectVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectVersionResponse]
  }
}

