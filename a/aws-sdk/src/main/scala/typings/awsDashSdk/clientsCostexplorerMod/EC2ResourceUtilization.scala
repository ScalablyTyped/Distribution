package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2ResourceUtilization extends js.Object {
  /**
    *  Maximum observed or expected CPU utilization of the instance.
    */
  var MaxCpuUtilizationPercentage: js.UndefOr[GenericString] = js.undefined
  /**
    *  Maximum observed or expected memory utilization of the instance.
    */
  var MaxMemoryUtilizationPercentage: js.UndefOr[GenericString] = js.undefined
  /**
    *  Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
    */
  var MaxStorageUtilizationPercentage: js.UndefOr[GenericString] = js.undefined
}

object EC2ResourceUtilization {
  @scala.inline
  def apply(
    MaxCpuUtilizationPercentage: GenericString = null,
    MaxMemoryUtilizationPercentage: GenericString = null,
    MaxStorageUtilizationPercentage: GenericString = null
  ): EC2ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    if (MaxCpuUtilizationPercentage != null) __obj.updateDynamic("MaxCpuUtilizationPercentage")(MaxCpuUtilizationPercentage)
    if (MaxMemoryUtilizationPercentage != null) __obj.updateDynamic("MaxMemoryUtilizationPercentage")(MaxMemoryUtilizationPercentage)
    if (MaxStorageUtilizationPercentage != null) __obj.updateDynamic("MaxStorageUtilizationPercentage")(MaxStorageUtilizationPercentage)
    __obj.asInstanceOf[EC2ResourceUtilization]
  }
}

