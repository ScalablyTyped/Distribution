package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowExecutionSummary extends js.Object {
  /**
    * The date and time when the flow execution summary was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ID of the flow execution.
    */
  var flowExecutionId: js.UndefOr[FlowExecutionId] = js.undefined
  /**
    * The ID of the flow.
    */
  var flowTemplateId: js.UndefOr[Urn] = js.undefined
  /**
    * The current status of the flow execution.
    */
  var status: js.UndefOr[FlowExecutionStatus] = js.undefined
  /**
    * The ID of the system instance that contains the flow.
    */
  var systemInstanceId: js.UndefOr[Urn] = js.undefined
  /**
    * The date and time when the flow execution summary was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.undefined
}

object FlowExecutionSummary {
  @scala.inline
  def apply(
    createdAt: Timestamp = null,
    flowExecutionId: FlowExecutionId = null,
    flowTemplateId: Urn = null,
    status: FlowExecutionStatus = null,
    systemInstanceId: Urn = null,
    updatedAt: Timestamp = null
  ): FlowExecutionSummary = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (flowExecutionId != null) __obj.updateDynamic("flowExecutionId")(flowExecutionId)
    if (flowTemplateId != null) __obj.updateDynamic("flowTemplateId")(flowTemplateId)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (systemInstanceId != null) __obj.updateDynamic("systemInstanceId")(systemInstanceId)
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt)
    __obj.asInstanceOf[FlowExecutionSummary]
  }
}

