package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountUsage extends js.Object {
  /**
    * The number of Lambda functions.
    */
  var FunctionCount: js.UndefOr[Long] = js.native
  /**
    * The amount of storage space, in bytes, that's being used by deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.native
}

object AccountUsage {
  @scala.inline
  def apply(FunctionCount: Int | Double = null, TotalCodeSize: Int | Double = null): AccountUsage = {
    val __obj = js.Dynamic.literal()
    if (FunctionCount != null) __obj.updateDynamic("FunctionCount")(FunctionCount.asInstanceOf[js.Any])
    if (TotalCodeSize != null) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUsage]
  }
}

