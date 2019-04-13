package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagProjectRequest extends js.Object {
  /**
    * The ID of the project to remove tags from.
    */
  var id: ProjectId
  /**
    * The tags to remove from the project.
    */
  var tags: TagKeys
}

object UntagProjectRequest {
  @scala.inline
  def apply(id: ProjectId, tags: TagKeys): UntagProjectRequest = {
    val __obj = js.Dynamic.literal(id = id, tags = tags)
  
    __obj.asInstanceOf[UntagProjectRequest]
  }
}

