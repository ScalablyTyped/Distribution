package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DashEncryption extends js.Object {
  /**
    * Time (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
  var SpekeKeyProvider: typings.awsDashSdk.clientsMediapackageMod.SpekeKeyProvider
}

object DashEncryption {
  @scala.inline
  def apply(
    SpekeKeyProvider: SpekeKeyProvider,
    KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
  ): DashEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider)
    if (!js.isUndefined(KeyRotationIntervalSeconds)) __obj.updateDynamic("KeyRotationIntervalSeconds")(KeyRotationIntervalSeconds)
    __obj.asInstanceOf[DashEncryption]
  }
}

