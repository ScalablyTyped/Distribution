package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayReadyDrm extends StObject {
  
  /**
    * The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var Format: js.UndefOr[PlayReadyDrmFormatString] = js.undefined
  
  /**
    * The series of random bits created by a random bit generator, unique for every encryption operation, that you want Elastic Transcoder to use to encrypt your files. The initialization vector must be base64-encoded, and it must be exactly 8 bytes long before being base64-encoded. If no initialization vector is provided, Elastic Transcoder generates one for you.
    */
  var InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined
  
  /**
    * The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it must be one of the following bit lengths before being base64-encoded:  128, 192, or 256.  The key must also be encrypted by using AWS KMS.
    */
  var Key: js.UndefOr[NonEmptyBase64EncodedString] = js.undefined
  
  /**
    * The ID for your DRM key, so that your DRM license provider knows which key to provide. The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before inserting it into the PlayReady DRM headers. If you are unsure whether your license server provides your key ID in big or little endian, check with your DRM provider.
    */
  var KeyId: js.UndefOr[KeyIdGuid] = js.undefined
  
  /**
    * The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
    */
  var KeyMd5: js.UndefOr[NonEmptyBase64EncodedString] = js.undefined
  
  /**
    * The location of the license key required to play DRM content. The URL must be an absolute path, and is referenced by the PlayReady header. The PlayReady header is referenced in the protection header of the client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example URL looks like this: https://www.example.com/exampleKey/ 
    */
  var LicenseAcquisitionUrl: js.UndefOr[OneTo512String] = js.undefined
}
object PlayReadyDrm {
  
  inline def apply(): PlayReadyDrm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayReadyDrm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayReadyDrm] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: PlayReadyDrmFormatString): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setInitializationVector(value: ZeroTo255String): Self = StObject.set(x, "InitializationVector", value.asInstanceOf[js.Any])
    
    inline def setInitializationVectorUndefined: Self = StObject.set(x, "InitializationVector", js.undefined)
    
    inline def setKey(value: NonEmptyBase64EncodedString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: KeyIdGuid): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeyMd5(value: NonEmptyBase64EncodedString): Self = StObject.set(x, "KeyMd5", value.asInstanceOf[js.Any])
    
    inline def setKeyMd5Undefined: Self = StObject.set(x, "KeyMd5", js.undefined)
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setLicenseAcquisitionUrl(value: OneTo512String): Self = StObject.set(x, "LicenseAcquisitionUrl", value.asInstanceOf[js.Any])
    
    inline def setLicenseAcquisitionUrlUndefined: Self = StObject.set(x, "LicenseAcquisitionUrl", js.undefined)
  }
}
