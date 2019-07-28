package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuOptions extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.undefined
  /**
    * The number of threads per CPU core.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.undefined
}

object CpuOptions {
  @scala.inline
  def apply(CoreCount: js.UndefOr[Integer] = js.undefined, ThreadsPerCore: js.UndefOr[Integer] = js.undefined): CpuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CoreCount)) __obj.updateDynamic("CoreCount")(CoreCount)
    if (!js.isUndefined(ThreadsPerCore)) __obj.updateDynamic("ThreadsPerCore")(ThreadsPerCore)
    __obj.asInstanceOf[CpuOptions]
  }
}

