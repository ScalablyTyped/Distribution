package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowTypeFilter extends js.Object {
  /**
    *  Name of the workflow type.
    */
  var name: Name
  /**
    * Version of the workflow type.
    */
  var version: js.UndefOr[VersionOptional] = js.undefined
}

object WorkflowTypeFilter {
  @scala.inline
  def apply(name: Name, version: VersionOptional = null): WorkflowTypeFilter = {
    val __obj = js.Dynamic.literal(name = name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[WorkflowTypeFilter]
  }
}

