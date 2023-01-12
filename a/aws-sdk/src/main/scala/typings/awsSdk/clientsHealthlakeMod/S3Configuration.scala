package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Configuration extends StObject {
  
  /**
    *  The KMS key ID used to access the S3 bucket. 
    */
  var KmsKeyId: EncryptionKeyID
  
  /**
    *  The S3Uri is the user specified S3 location of the FHIR data to be imported into Amazon HealthLake. 
    */
  var S3Uri: typings.awsSdk.clientsHealthlakeMod.S3Uri
}
object S3Configuration {
  
  inline def apply(KmsKeyId: EncryptionKeyID, S3Uri: S3Uri): S3Configuration = {
    val __obj = js.Dynamic.literal(KmsKeyId = KmsKeyId.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Configuration] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: EncryptionKeyID): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setS3Uri(value: S3Uri): Self = StObject.set(x, "S3Uri", value.asInstanceOf[js.Any])
  }
}
