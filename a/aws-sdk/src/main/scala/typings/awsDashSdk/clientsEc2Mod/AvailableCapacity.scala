package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailableCapacity extends js.Object {
  /**
    * The total number of instances supported by the Dedicated Host.
    */
  var AvailableInstanceCapacity: js.UndefOr[AvailableInstanceCapacityList] = js.undefined
  /**
    * The number of vCPUs available on the Dedicated Host.
    */
  var AvailableVCpus: js.UndefOr[Integer] = js.undefined
}

object AvailableCapacity {
  @scala.inline
  def apply(
    AvailableInstanceCapacity: AvailableInstanceCapacityList = null,
    AvailableVCpus: Int | scala.Double = null
  ): AvailableCapacity = {
    val __obj = js.Dynamic.literal()
    if (AvailableInstanceCapacity != null) __obj.updateDynamic("AvailableInstanceCapacity")(AvailableInstanceCapacity)
    if (AvailableVCpus != null) __obj.updateDynamic("AvailableVCpus")(AvailableVCpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableCapacity]
  }
}

