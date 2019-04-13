package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProjectRequest extends js.Object {
  /**
    * The description of the project, if any.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  /**
    * The ID of the project you want to update.
    */
  var id: ProjectId
  /**
    * The name of the project you want to update.
    */
  var name: js.UndefOr[ProjectName] = js.undefined
}

object UpdateProjectRequest {
  @scala.inline
  def apply(id: ProjectId, description: ProjectDescription = null, name: ProjectName = null): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(id = id)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[UpdateProjectRequest]
  }
}

