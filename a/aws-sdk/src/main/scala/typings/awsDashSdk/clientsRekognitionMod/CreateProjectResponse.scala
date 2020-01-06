package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProjectResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new project. You can use the ARN to configure IAM access to the project. 
    */
  var ProjectArn: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ProjectArn] = js.native
}

object CreateProjectResponse {
  @scala.inline
  def apply(ProjectArn: ProjectArn = null): CreateProjectResponse = {
    val __obj = js.Dynamic.literal()
    if (ProjectArn != null) __obj.updateDynamic("ProjectArn")(ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectResponse]
  }
}

