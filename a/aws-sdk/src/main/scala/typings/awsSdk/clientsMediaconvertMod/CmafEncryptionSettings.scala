package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CmafEncryptionSettings extends StObject {
  
  /**
    * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
    */
  var ConstantInitializationVector: js.UndefOr[stringMin32Max32Pattern09aFAF32] = js.undefined
  
  /**
    * Specify the encryption scheme that you want the service to use when encrypting your CMAF segments. Choose AES-CBC subsample (SAMPLE-AES) or AES_CTR (AES-CTR).
    */
  var EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.undefined
  
  /**
    * When you use DRM with CMAF outputs, choose whether the service writes the 128-bit encryption initialization vector in the HLS and DASH manifests.
    */
  var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.undefined
  
  /**
    * If your output group type is CMAF, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is HLS, DASH, or Microsoft Smooth, use the SpekeKeyProvider settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[SpekeKeyProviderCmaf] = js.undefined
  
  /**
    * Use these settings to set up encryption with a static key provider.
    */
  var StaticKeyProvider: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.StaticKeyProvider] = js.undefined
  
  /**
    * Specify whether your DRM encryption key is static or from a key provider that follows the SPEKE standard. For more information about SPEKE, see https://docs.aws.amazon.com/speke/latest/documentation/what-is-speke.html.
    */
  var Type: js.UndefOr[CmafKeyProviderType] = js.undefined
}
object CmafEncryptionSettings {
  
  inline def apply(): CmafEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CmafEncryptionSettings]
  }
  
  extension [Self <: CmafEncryptionSettings](x: Self) {
    
    inline def setConstantInitializationVector(value: stringMin32Max32Pattern09aFAF32): Self = StObject.set(x, "ConstantInitializationVector", value.asInstanceOf[js.Any])
    
    inline def setConstantInitializationVectorUndefined: Self = StObject.set(x, "ConstantInitializationVector", js.undefined)
    
    inline def setEncryptionMethod(value: CmafEncryptionType): Self = StObject.set(x, "EncryptionMethod", value.asInstanceOf[js.Any])
    
    inline def setEncryptionMethodUndefined: Self = StObject.set(x, "EncryptionMethod", js.undefined)
    
    inline def setInitializationVectorInManifest(value: CmafInitializationVectorInManifest): Self = StObject.set(x, "InitializationVectorInManifest", value.asInstanceOf[js.Any])
    
    inline def setInitializationVectorInManifestUndefined: Self = StObject.set(x, "InitializationVectorInManifest", js.undefined)
    
    inline def setSpekeKeyProvider(value: SpekeKeyProviderCmaf): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    inline def setSpekeKeyProviderUndefined: Self = StObject.set(x, "SpekeKeyProvider", js.undefined)
    
    inline def setStaticKeyProvider(value: StaticKeyProvider): Self = StObject.set(x, "StaticKeyProvider", value.asInstanceOf[js.Any])
    
    inline def setStaticKeyProviderUndefined: Self = StObject.set(x, "StaticKeyProvider", js.undefined)
    
    inline def setType(value: CmafKeyProviderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
