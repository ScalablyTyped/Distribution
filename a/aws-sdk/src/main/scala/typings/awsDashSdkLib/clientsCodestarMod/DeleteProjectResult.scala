package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProjectResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deleted project.
    */
  var projectArn: js.UndefOr[ProjectArn] = js.undefined
  /**
    * The ID of the primary stack in AWS CloudFormation that will be deleted as part of deleting the project and its resources.
    */
  var stackId: js.UndefOr[StackId] = js.undefined
}

object DeleteProjectResult {
  @scala.inline
  def apply(projectArn: ProjectArn = null, stackId: StackId = null): DeleteProjectResult = {
    val __obj = js.Dynamic.literal()
    if (projectArn != null) __obj.updateDynamic("projectArn")(projectArn)
    if (stackId != null) __obj.updateDynamic("stackId")(stackId)
    __obj.asInstanceOf[DeleteProjectResult]
  }
}

