package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EbsConfiguration extends js.Object {
  /**
    * An array of Amazon EBS volume specifications attached to a cluster instance.
    */
  var EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.undefined
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.undefined
}

object EbsConfiguration {
  @scala.inline
  def apply(
    EbsBlockDeviceConfigs: EbsBlockDeviceConfigList = null,
    EbsOptimized: js.UndefOr[scala.Boolean] = js.undefined
  ): EbsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EbsBlockDeviceConfigs != null) __obj.updateDynamic("EbsBlockDeviceConfigs")(EbsBlockDeviceConfigs)
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized)
    __obj.asInstanceOf[EbsConfiguration]
  }
}

