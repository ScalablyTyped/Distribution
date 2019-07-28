package typings.awsDashSdk.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProjectRequest extends js.Object {
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId
}

object DeleteProjectRequest {
  @scala.inline
  def apply(projectId: ProjectId): DeleteProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId)
  
    __obj.asInstanceOf[DeleteProjectRequest]
  }
}

