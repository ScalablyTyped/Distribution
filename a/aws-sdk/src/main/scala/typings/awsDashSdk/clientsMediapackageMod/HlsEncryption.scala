package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsEncryption extends js.Object {
  /**
    * A constant initialization vector for encryption (optional).
  When not specified the initialization vector will be periodically rotated.
    */
  var ConstantInitializationVector: js.UndefOr[__string] = js.native
  /**
    * The encryption method to use.
    */
  var EncryptionMethod: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.EncryptionMethod] = js.native
  /**
    * Interval (in seconds) between each encryption key rotation.
    */
  var KeyRotationIntervalSeconds: js.UndefOr[__integer] = js.native
  /**
    * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
    */
  var RepeatExtXKey: js.UndefOr[__boolean] = js.native
  var SpekeKeyProvider: typings.awsDashSdk.clientsMediapackageMod.SpekeKeyProvider = js.native
}

object HlsEncryption {
  @scala.inline
  def apply(
    SpekeKeyProvider: SpekeKeyProvider,
    ConstantInitializationVector: __string = null,
    EncryptionMethod: EncryptionMethod = null,
    KeyRotationIntervalSeconds: Int | Double = null,
    RepeatExtXKey: js.UndefOr[Boolean] = js.undefined
  ): HlsEncryption = {
    val __obj = js.Dynamic.literal(SpekeKeyProvider = SpekeKeyProvider.asInstanceOf[js.Any])
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector.asInstanceOf[js.Any])
    if (EncryptionMethod != null) __obj.updateDynamic("EncryptionMethod")(EncryptionMethod.asInstanceOf[js.Any])
    if (KeyRotationIntervalSeconds != null) __obj.updateDynamic("KeyRotationIntervalSeconds")(KeyRotationIntervalSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(RepeatExtXKey)) __obj.updateDynamic("RepeatExtXKey")(RepeatExtXKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryption]
  }
}

