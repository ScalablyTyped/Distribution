package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobFlowsInput extends js.Object {
  /**
    * Return only job flows created after this date and time.
    */
  var CreatedAfter: js.UndefOr[_Date] = js.undefined
  /**
    * Return only job flows created before this date and time.
    */
  var CreatedBefore: js.UndefOr[_Date] = js.undefined
  /**
    * Return only job flows whose job flow ID is contained in this list.
    */
  var JobFlowIds: js.UndefOr[XmlStringList] = js.undefined
  /**
    * Return only job flows whose state is contained in this list.
    */
  var JobFlowStates: js.UndefOr[JobFlowExecutionStateList] = js.undefined
}

object DescribeJobFlowsInput {
  @scala.inline
  def apply(
    CreatedAfter: _Date = null,
    CreatedBefore: _Date = null,
    JobFlowIds: XmlStringList = null,
    JobFlowStates: JobFlowExecutionStateList = null
  ): DescribeJobFlowsInput = {
    val __obj = js.Dynamic.literal()
    if (CreatedAfter != null) __obj.updateDynamic("CreatedAfter")(CreatedAfter)
    if (CreatedBefore != null) __obj.updateDynamic("CreatedBefore")(CreatedBefore)
    if (JobFlowIds != null) __obj.updateDynamic("JobFlowIds")(JobFlowIds)
    if (JobFlowStates != null) __obj.updateDynamic("JobFlowStates")(JobFlowStates)
    __obj.asInstanceOf[DescribeJobFlowsInput]
  }
}

