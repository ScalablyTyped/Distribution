package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CmafEncryption extends js.Object {
  /**
    * Time (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
  var SpekeKeyProvider: typings.awsDashSdk.clientsMediapackageMod.SpekeKeyProvider
}

object CmafEncryption {
  @scala.inline
  def apply(
    SpekeKeyProvider: SpekeKeyProvider,
    KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.undefined
  ): CmafEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider)
    if (!js.isUndefined(KeyRotationIntervalSeconds)) __obj.updateDynamic("KeyRotationIntervalSeconds")(KeyRotationIntervalSeconds)
    __obj.asInstanceOf[CmafEncryption]
  }
}

