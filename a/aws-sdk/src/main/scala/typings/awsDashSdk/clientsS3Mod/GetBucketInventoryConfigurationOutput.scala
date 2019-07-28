package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketInventoryConfigurationOutput extends js.Object {
  /**
    * Specifies the inventory configuration.
    */
  var InventoryConfiguration: js.UndefOr[typings.awsDashSdk.clientsS3Mod.InventoryConfiguration] = js.undefined
}

object GetBucketInventoryConfigurationOutput {
  @scala.inline
  def apply(InventoryConfiguration: InventoryConfiguration = null): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (InventoryConfiguration != null) __obj.updateDynamic("InventoryConfiguration")(InventoryConfiguration)
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
}

