package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogicalTableSource extends js.Object {
  /**
    * Specifies the result of a join of two logical tables.
    */
  var JoinInstruction: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.JoinInstruction] = js.native
  /**
    * Physical table ID.
    */
  var PhysicalTableId: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.PhysicalTableId] = js.native
}

object LogicalTableSource {
  @scala.inline
  def apply(JoinInstruction: JoinInstruction = null, PhysicalTableId: PhysicalTableId = null): LogicalTableSource = {
    val __obj = js.Dynamic.literal()
    if (JoinInstruction != null) __obj.updateDynamic("JoinInstruction")(JoinInstruction.asInstanceOf[js.Any])
    if (PhysicalTableId != null) __obj.updateDynamic("PhysicalTableId")(PhysicalTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalTableSource]
  }
}

