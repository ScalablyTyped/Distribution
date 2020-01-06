package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCpuOptions extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.native
  /**
    * The number of threads per CPU core.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.native
}

object LaunchTemplateCpuOptions {
  @scala.inline
  def apply(CoreCount: Int | scala.Double = null, ThreadsPerCore: Int | scala.Double = null): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    if (CoreCount != null) __obj.updateDynamic("CoreCount")(CoreCount.asInstanceOf[js.Any])
    if (ThreadsPerCore != null) __obj.updateDynamic("ThreadsPerCore")(ThreadsPerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
}

