package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUsage extends js.Object {
  /**
    * The number of Lambda functions.
    */
  var FunctionCount: js.UndefOr[Long] = js.undefined
  /**
    * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.undefined
}

object AccountUsage {
  @scala.inline
  def apply(FunctionCount: js.UndefOr[Long] = js.undefined, TotalCodeSize: js.UndefOr[Long] = js.undefined): AccountUsage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FunctionCount)) __obj.updateDynamic("FunctionCount")(FunctionCount)
    if (!js.isUndefined(TotalCodeSize)) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize)
    __obj.asInstanceOf[AccountUsage]
  }
}

