package typings
package awsDashSdkLib.clientsMobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProjectRequest extends js.Object {
  /**
    *  ZIP or YAML file which contains project configuration to be updated. This should be the contents of the file downloaded from the URL provided in an export project operation. 
    */
  var contents: js.UndefOr[Contents] = js.undefined
  /**
    *  Unique project identifier. 
    */
  var projectId: ProjectId
}

object UpdateProjectRequest {
  @scala.inline
  def apply(projectId: ProjectId, contents: Contents = null): UpdateProjectRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId)
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectRequest]
  }
}

