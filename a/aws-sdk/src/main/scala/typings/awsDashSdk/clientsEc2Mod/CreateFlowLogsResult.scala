package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFlowLogsResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the flow logs.
    */
  var FlowLogIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * Information about the flow logs that could not be created successfully.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}

object CreateFlowLogsResult {
  @scala.inline
  def apply(
    ClientToken: String = null,
    FlowLogIds: ValueStringList = null,
    Unsuccessful: UnsuccessfulItemSet = null
  ): CreateFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (FlowLogIds != null) __obj.updateDynamic("FlowLogIds")(FlowLogIds)
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful)
    __obj.asInstanceOf[CreateFlowLogsResult]
  }
}

