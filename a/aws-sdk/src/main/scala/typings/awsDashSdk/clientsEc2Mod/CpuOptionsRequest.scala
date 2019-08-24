package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuOptionsRequest extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.undefined
  /**
    * The number of threads per CPU core. To disable multithreading for the instance, specify a value of 1. Otherwise, specify the default value of 2.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.undefined
}

object CpuOptionsRequest {
  @scala.inline
  def apply(CoreCount: js.UndefOr[Integer] = js.undefined, ThreadsPerCore: js.UndefOr[Integer] = js.undefined): CpuOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CoreCount)) __obj.updateDynamic("CoreCount")(CoreCount)
    if (!js.isUndefined(ThreadsPerCore)) __obj.updateDynamic("ThreadsPerCore")(ThreadsPerCore)
    __obj.asInstanceOf[CpuOptionsRequest]
  }
}

