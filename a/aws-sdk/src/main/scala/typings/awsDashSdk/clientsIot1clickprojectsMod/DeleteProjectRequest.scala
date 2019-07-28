package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProjectRequest extends js.Object {
  /**
    * The name of the empty project to delete.
    */
  var projectName: ProjectName
}

object DeleteProjectRequest {
  @scala.inline
  def apply(projectName: ProjectName): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(projectName = projectName)
  
    __obj.asInstanceOf[DeleteProjectRequest]
  }
}

