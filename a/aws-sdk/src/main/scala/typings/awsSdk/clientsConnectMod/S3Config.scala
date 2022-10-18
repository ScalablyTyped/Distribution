package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Config extends StObject {
  
  /**
    * The S3 bucket name.
    */
  var BucketName: typings.awsSdk.clientsConnectMod.BucketName
  
  /**
    * The S3 bucket prefix.
    */
  var BucketPrefix: Prefix
  
  /**
    * The Amazon S3 encryption configuration.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.clientsConnectMod.EncryptionConfig] = js.undefined
}
object S3Config {
  
  inline def apply(BucketName: BucketName, BucketPrefix: Prefix): S3Config = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], BucketPrefix = BucketPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Config]
  }
  
  extension [Self <: S3Config](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefix(value: Prefix): Self = StObject.set(x, "BucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
  }
}
