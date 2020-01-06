package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTypeFilter extends js.Object {
  /**
    *  Name of the workflow type.
    */
  var name: Name = js.native
  /**
    * Version of the workflow type.
    */
  var version: js.UndefOr[VersionOptional] = js.native
}

object WorkflowTypeFilter {
  @scala.inline
  def apply(name: Name, version: VersionOptional = null): WorkflowTypeFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTypeFilter]
  }
}

