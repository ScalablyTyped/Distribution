package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryInfo extends js.Object {
  /**
    * Size of the memory, in MiB.
    */
  var SizeInMiB: js.UndefOr[MemorySize] = js.native
}

object MemoryInfo {
  @scala.inline
  def apply(SizeInMiB: Int | scala.Double = null): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    if (SizeInMiB != null) __obj.updateDynamic("SizeInMiB")(SizeInMiB.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryInfo]
  }
}

