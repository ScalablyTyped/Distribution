package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CmafEncryptionSettings extends js.Object {
  /**
    * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
    */
  var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined
  /**
    * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
    */
  var EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.undefined
  /**
    * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
    */
  var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.undefined
  /**
    * Use these settings to set up encryption with a static key provider.
    */
  var StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined
  /**
    * Indicates which type of key provider is used for encryption.
    */
  var Type: js.UndefOr[CmafKeyProviderType] = js.undefined
}

object CmafEncryptionSettings {
  @scala.inline
  def apply(
    ConstantInitializationVector: __stringMin32Max32Pattern09aFAF32 = null,
    EncryptionMethod: CmafEncryptionType = null,
    InitializationVectorInManifest: CmafInitializationVectorInManifest = null,
    StaticKeyProvider: StaticKeyProvider = null,
    Type: CmafKeyProviderType = null
  ): CmafEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    if (ConstantInitializationVector != null) __obj.updateDynamic("ConstantInitializationVector")(ConstantInitializationVector)
    if (EncryptionMethod != null) __obj.updateDynamic("EncryptionMethod")(EncryptionMethod.asInstanceOf[js.Any])
    if (InitializationVectorInManifest != null) __obj.updateDynamic("InitializationVectorInManifest")(InitializationVectorInManifest.asInstanceOf[js.Any])
    if (StaticKeyProvider != null) __obj.updateDynamic("StaticKeyProvider")(StaticKeyProvider)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafEncryptionSettings]
  }
}

