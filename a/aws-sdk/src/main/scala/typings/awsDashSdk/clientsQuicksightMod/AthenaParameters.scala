package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AthenaParameters extends js.Object {
  /**
    * The workgroup that Amazon Athena uses.
    */
  var WorkGroup: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.WorkGroup] = js.native
}

object AthenaParameters {
  @scala.inline
  def apply(WorkGroup: WorkGroup = null): AthenaParameters = {
    val __obj = js.Dynamic.literal()
    if (WorkGroup != null) __obj.updateDynamic("WorkGroup")(WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[AthenaParameters]
  }
}

