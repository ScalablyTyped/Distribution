package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encryption extends StObject {
  
  /**
    * The series of random bits created by a random bit generator, unique for every encryption operation, that you used to encrypt your input files or that you want Elastic Transcoder to use to encrypt your output files. The initialization vector must be base64-encoded, and it must be exactly 16 bytes long before being base64-encoded.
    */
  var InitializationVector: js.UndefOr[ZeroTo255String] = js.undefined
  
  /**
    * The data encryption key that you want Elastic Transcoder to use to encrypt your output file, or that was used to encrypt your input file. The key must be base64-encoded and it must be one of the following bit lengths before being base64-encoded:  128, 192, or 256.  The key must also be encrypted by using the Amazon Key Management Service.
    */
  var Key: js.UndefOr[Base64EncodedString] = js.undefined
  
  /**
    * The MD5 digest of the key that you used to encrypt your input file, or that you want Elastic Transcoder to use to encrypt your output file. Elastic Transcoder uses the key digest as a checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes long before being base64-encoded.
    */
  var KeyMd5: js.UndefOr[Base64EncodedString] = js.undefined
  
  /**
    * The specific server-side encryption mode that you want Elastic Transcoder to use when decrypting your input files or encrypting your output files. Elastic Transcoder supports the following options:    s3: Amazon S3 creates and manages the keys used for encrypting your files.    s3-aws-kms: Amazon S3 calls the Amazon Key Management Service, which creates and manages the keys that are used for encrypting your files. If you specify s3-aws-kms and you don't want to use the default key, you must add the AWS-KMS key that you want to use to your pipeline.    aes-cbc-pkcs7: A padded cipher-block mode of operation originally used for HLS files.    aes-ctr: AES Counter Mode.    aes-gcm: AES Galois Counter Mode, a mode of operation that is an authenticated encryption format, meaning that a file, key, or initialization vector that has been tampered with fails the decryption process.   For all three AES options, you must provide the following settings, which must be base64-encoded:    Key     Key MD5     Initialization Vector     For the AES modes, your private encryption keys and your unencrypted data are never stored by AWS; therefore, it is important that you safely manage your encryption keys. If you lose them, you won't be able to unencrypt your data. 
    */
  var Mode: js.UndefOr[EncryptionMode] = js.undefined
}
object Encryption {
  
  inline def apply(): Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encryption]
  }
  
  extension [Self <: Encryption](x: Self) {
    
    inline def setInitializationVector(value: ZeroTo255String): Self = StObject.set(x, "InitializationVector", value.asInstanceOf[js.Any])
    
    inline def setInitializationVectorUndefined: Self = StObject.set(x, "InitializationVector", js.undefined)
    
    inline def setKey(value: Base64EncodedString): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyMd5(value: Base64EncodedString): Self = StObject.set(x, "KeyMd5", value.asInstanceOf[js.Any])
    
    inline def setKeyMd5Undefined: Self = StObject.set(x, "KeyMd5", js.undefined)
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMode(value: EncryptionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
