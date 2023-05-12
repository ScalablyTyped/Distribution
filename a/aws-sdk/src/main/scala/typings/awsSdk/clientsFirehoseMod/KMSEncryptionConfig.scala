package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KMSEncryptionConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same Amazon Web Services Region as the destination Amazon S3 bucket. For more information, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces.
    */
  var AWSKMSKeyARN: typings.awsSdk.clientsFirehoseMod.AWSKMSKeyARN
}
object KMSEncryptionConfig {
  
  inline def apply(AWSKMSKeyARN: AWSKMSKeyARN): KMSEncryptionConfig = {
    val __obj = js.Dynamic.literal(AWSKMSKeyARN = AWSKMSKeyARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSEncryptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KMSEncryptionConfig] (val x: Self) extends AnyVal {
    
    inline def setAWSKMSKeyARN(value: AWSKMSKeyARN): Self = StObject.set(x, "AWSKMSKeyARN", value.asInstanceOf[js.Any])
  }
}
