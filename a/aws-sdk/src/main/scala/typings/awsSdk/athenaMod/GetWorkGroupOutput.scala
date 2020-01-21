package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkGroupOutput extends js.Object {
  /**
    * Information about the workgroup.
    */
  var WorkGroup: js.UndefOr[typings.awsSdk.athenaMod.WorkGroup] = js.native
}

object GetWorkGroupOutput {
  @scala.inline
  def apply(WorkGroup: WorkGroup = null): GetWorkGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkGroupOutput]
  }
}

