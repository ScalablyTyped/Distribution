package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackSetOperationPreferences extends js.Object {
  /**
    * The number of accounts, per region, for which this operation can fail before AWS CloudFormation stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the operation in any subsequent regions. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage (but not both).
    */
  var FailureToleranceCount: js.UndefOr[FailureToleranceCount] = js.undefined
  /**
    * The percentage of accounts, per region, for which this stack operation can fail before AWS CloudFormation stops the operation in that region. If the operation is stopped in a region, AWS CloudFormation doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. Conditional: You must specify either FailureToleranceCount or FailureTolerancePercentage, but not both.
    */
  var FailureTolerancePercentage: js.UndefOr[FailureTolerancePercentage] = js.undefined
  /**
    * The maximum number of accounts in which to perform this operation at one time. This is dependent on the value of FailureToleranceCount—MaxConcurrentCount is at most one more than the FailureToleranceCount . Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
    */
  var MaxConcurrentCount: js.UndefOr[MaxConcurrentCount] = js.undefined
  /**
    * The maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS CloudFormation rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, CloudFormation sets the number as one instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. Conditional: You must specify either MaxConcurrentCount or MaxConcurrentPercentage, but not both.
    */
  var MaxConcurrentPercentage: js.UndefOr[MaxConcurrentPercentage] = js.undefined
  /**
    * The order of the regions in where you want to perform the stack operation.
    */
  var RegionOrder: js.UndefOr[RegionList] = js.undefined
}

object StackSetOperationPreferences {
  @scala.inline
  def apply(
    FailureToleranceCount: js.UndefOr[FailureToleranceCount] = js.undefined,
    FailureTolerancePercentage: js.UndefOr[FailureTolerancePercentage] = js.undefined,
    MaxConcurrentCount: js.UndefOr[MaxConcurrentCount] = js.undefined,
    MaxConcurrentPercentage: js.UndefOr[MaxConcurrentPercentage] = js.undefined,
    RegionOrder: RegionList = null
  ): StackSetOperationPreferences = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FailureToleranceCount)) __obj.updateDynamic("FailureToleranceCount")(FailureToleranceCount)
    if (!js.isUndefined(FailureTolerancePercentage)) __obj.updateDynamic("FailureTolerancePercentage")(FailureTolerancePercentage)
    if (!js.isUndefined(MaxConcurrentCount)) __obj.updateDynamic("MaxConcurrentCount")(MaxConcurrentCount)
    if (!js.isUndefined(MaxConcurrentPercentage)) __obj.updateDynamic("MaxConcurrentPercentage")(MaxConcurrentPercentage)
    if (RegionOrder != null) __obj.updateDynamic("RegionOrder")(RegionOrder)
    __obj.asInstanceOf[StackSetOperationPreferences]
  }
}

