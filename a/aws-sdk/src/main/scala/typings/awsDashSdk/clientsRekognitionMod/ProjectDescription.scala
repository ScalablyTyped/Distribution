package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDescription extends js.Object {
  /**
    * The Unix timestamp for the date and time that the project was created.
    */
  var CreationTimestamp: js.UndefOr[DateTime] = js.native
  /**
    * The Amazon Resource Name (ARN) of the project.
    */
  var ProjectArn: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ProjectArn] = js.native
  /**
    * The current status of the project.
    */
  var Status: js.UndefOr[ProjectStatus] = js.native
}

object ProjectDescription {
  @scala.inline
  def apply(CreationTimestamp: DateTime = null, ProjectArn: ProjectArn = null, Status: ProjectStatus = null): ProjectDescription = {
    val __obj = js.Dynamic.literal()
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (ProjectArn != null) __obj.updateDynamic("ProjectArn")(ProjectArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDescription]
  }
}

