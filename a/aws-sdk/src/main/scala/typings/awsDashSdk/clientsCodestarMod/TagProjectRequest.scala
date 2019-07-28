package typings.awsDashSdk.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProjectRequest extends js.Object {
  /**
    * The ID of the project you want to add a tag to.
    */
  var id: ProjectId
  /**
    * The tags you want to add to the project.
    */
  var tags: Tags
}

object TagProjectRequest {
  @scala.inline
  def apply(id: ProjectId, tags: Tags): TagProjectRequest = {
    val __obj = js.Dynamic.literal(id = id, tags = tags)
  
    __obj.asInstanceOf[TagProjectRequest]
  }
}

