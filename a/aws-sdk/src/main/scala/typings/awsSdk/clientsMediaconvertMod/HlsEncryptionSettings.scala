package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsEncryptionSettings extends StObject {
  
  /**
    * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
    */
  var ConstantInitializationVector: js.UndefOr[stringMin32Max32Pattern09aFAF32] = js.undefined
  
  /**
    * Encrypts the segments with the given encryption scheme. Leave blank to disable. Selecting 'Disabled' in the web interface also disables encryption.
    */
  var EncryptionMethod: js.UndefOr[HlsEncryptionType] = js.undefined
  
  /**
    * The Initialization Vector is a 128-bit number used in conjunction with the key for encrypting blocks. If set to INCLUDE, Initialization Vector is listed in the manifest. Otherwise Initialization Vector is not in the manifest.
    */
  var InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest] = js.undefined
  
  /**
    * Enable this setting to insert the EXT-X-SESSION-KEY element into the master playlist. This allows for offline Apple HLS FairPlay content protection.
    */
  var OfflineEncrypted: js.UndefOr[HlsOfflineEncrypted] = js.undefined
  
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider.  If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.SpekeKeyProvider] = js.undefined
  
  /**
    * Use these settings to set up encryption with a static key provider.
    */
  var StaticKeyProvider: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.StaticKeyProvider] = js.undefined
  
  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  var Type: js.UndefOr[HlsKeyProviderType] = js.undefined
}
object HlsEncryptionSettings {
  
  inline def apply(): HlsEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsEncryptionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsEncryptionSettings] (val x: Self) extends AnyVal {
    
    inline def setConstantInitializationVector(value: stringMin32Max32Pattern09aFAF32): Self = StObject.set(x, "ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    inline def setConstantInitializationVectorUndefined: Self = StObject.set(x, "ConstantInitializationVector", js.undefined)
    
    inline def setEncryptionMethod(value: HlsEncryptionType): Self = StObject.set(x, "EncryptionMethod", value.asInstanceOf[js.Any])
    
    inline def setEncryptionMethodUndefined: Self = StObject.set(x, "EncryptionMethod", js.undefined)
    
    inline def setInitializationVectorInManifest(value: HlsInitializationVectorInManifest): Self = StObject.set(x, "InitializationVectorInManifest", value.asInstanceOf[js.Any])
    
    inline def setInitializationVectorInManifestUndefined: Self = StObject.set(x, "InitializationVectorInManifest", js.undefined)
    
    inline def setOfflineEncrypted(value: HlsOfflineEncrypted): Self = StObject.set(x, "OfflineEncrypted", value.asInstanceOf[js.Any])
    
    inline def setOfflineEncryptedUndefined: Self = StObject.set(x, "OfflineEncrypted", js.undefined)
    
    inline def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    inline def setSpekeKeyProviderUndefined: Self = StObject.set(x, "SpekeKeyProvider", js.undefined)
    
    inline def setStaticKeyProvider(value: StaticKeyProvider): Self = StObject.set(x, "StaticKeyProvider", value.asInstanceOf[js.Any])
    
    inline def setStaticKeyProviderUndefined: Self = StObject.set(x, "StaticKeyProvider", js.undefined)
    
    inline def setType(value: HlsKeyProviderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
