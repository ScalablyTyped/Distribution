package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsEncryptionSettings extends js.Object {
  /**
    * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
    */
  var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.native
  /**
    * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
    */
  var EncryptionMethod: js.UndefOr[HlsEncryptionType] = js.native
  /**
    * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
    */
  var InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest] = js.native
  /**
    * Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
    */
  var OfflineEncrypted: js.UndefOr[HlsOfflineEncrypted] = js.native
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.SpekeKeyProvider] = js.native
  /**
    * Use these settings to set up encryption with a static key provider.
    */
  var StaticKeyProvider: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.StaticKeyProvider] = js.native
  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  var Type: js.UndefOr[HlsKeyProviderType] = js.native
}

object HlsEncryptionSettings {
  @scala.inline
  def apply(
    ConstantInitializationVector: __stringMin32Max32Pattern09aFAF32 = null,
    EncryptionMethod: HlsEncryptionType = null,
    InitializationVectorInManifest: HlsInitializationVectorInManifest = null,
    OfflineEncrypted: HlsOfflineEncrypted = null,
    SpekeKeyProvider: SpekeKeyProvider = null,
    StaticKeyProvider: StaticKeyProvider = null,
    Type: HlsKeyProviderType = null
  ): HlsEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector.asInstanceOf[js.Any])
    if (EncryptionMethod != null) __obj.updateDynamic("EncryptionMethod")(EncryptionMethod.asInstanceOf[js.Any])
    if (InitializationVectorInManifest != null) __obj.updateDynamic("InitializationVectorInManifest")(InitializationVectorInManifest.asInstanceOf[js.Any])
    if (OfflineEncrypted != null) __obj.updateDynamic("OfflineEncrypted")(OfflineEncrypted.asInstanceOf[js.Any])
    if (SpekeKeyProvider != null) __obj.updateDynamic("SpekeKeyProvider")(SpekeKeyProvider.asInstanceOf[js.Any])
    if (StaticKeyProvider != null) __obj.updateDynamic("StaticKeyProvider")(StaticKeyProvider.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsEncryptionSettings]
  }
}

