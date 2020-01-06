package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafEncryptionSettings extends js.Object {
  /**
    * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
    */
  var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.native
  /**
    * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
    */
  var EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.native
  /**
    * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
    */
  var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.native
  /**
    * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf] = js.native
  /**
    * Use these settings to set up encryption with a static key provider.
    */
  var StaticKeyProvider: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.StaticKeyProvider] = js.native
  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  var Type: js.UndefOr[CmafKeyProviderType] = js.native
}

object CmafEncryptionSettings {
  @scala.inline
  def apply(
    ConstantInitializationVector: __stringMin32Max32Pattern09aFAF32 = null,
    EncryptionMethod: CmafEncryptionType = null,
    InitializationVectorInManifest: CmafInitializationVectorInManifest = null,
    SpekeKeyProvider: SpekeKeyProviderCmaf = null,
    StaticKeyProvider: StaticKeyProvider = null,
    Type: CmafKeyProviderType = null
  ): CmafEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector.asInstanceOf[js.Any])
    if (EncryptionMethod != null) __obj.updateDynamic("EncryptionMethod")(EncryptionMethod.asInstanceOf[js.Any])
    if (InitializationVectorInManifest != null) __obj.updateDynamic("InitializationVectorInManifest")(InitializationVectorInManifest.asInstanceOf[js.Any])
    if (SpekeKeyProvider != null) __obj.updateDynamic("SpekeKeyProvider")(SpekeKeyProvider.asInstanceOf[js.Any])
    if (StaticKeyProvider != null) __obj.updateDynamic("StaticKeyProvider")(StaticKeyProvider.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafEncryptionSettings]
  }
}

