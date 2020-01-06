package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsConfiguration extends js.Object {
  /**
    * An array of Amazon EBS volume specifications attached to a cluster instance.
    */
  var EbsBlockDeviceConfigs: js.UndefOr[EbsBlockDeviceConfigList] = js.native
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized.
    */
  var EbsOptimized: js.UndefOr[BooleanObject] = js.native
}

object EbsConfiguration {
  @scala.inline
  def apply(
    EbsBlockDeviceConfigs: EbsBlockDeviceConfigList = null,
    EbsOptimized: js.UndefOr[scala.Boolean] = js.undefined
  ): EbsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EbsBlockDeviceConfigs != null) __obj.updateDynamic("EbsBlockDeviceConfigs")(EbsBlockDeviceConfigs.asInstanceOf[js.Any])
    if (!js.isUndefined(EbsOptimized)) __obj.updateDynamic("EbsOptimized")(EbsOptimized.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsConfiguration]
  }
}

