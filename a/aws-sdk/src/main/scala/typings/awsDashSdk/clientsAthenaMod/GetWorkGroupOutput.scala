package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetWorkGroupOutput extends js.Object {
  /**
    * Information about the workgroup.
    */
  var WorkGroup: js.UndefOr[typings.awsDashSdk.clientsAthenaMod.WorkGroup] = js.undefined
}

object GetWorkGroupOutput {
  @scala.inline
  def apply(WorkGroup: WorkGroup = null): GetWorkGroupOutput = {
    val __obj = js.Dynamic.literal()
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup)
    __obj.asInstanceOf[GetWorkGroupOutput]
  }
}

