package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProjectRequest extends js.Object {
  /**
    * The name of the empty project to delete.
    */
  var projectName: ProjectName = js.native
}

object DeleteProjectRequest {
  @scala.inline
  def apply(projectName: ProjectName): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteProjectRequest]
  }
}

