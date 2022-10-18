package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3DataConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Key Management Service (KMS) key that Amazon Personalize uses to encrypt or decrypt the input and output files.
    */
  var kmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
  
  /**
    * The file path of the Amazon S3 bucket.
    */
  var path: S3Location
}
object S3DataConfig {
  
  inline def apply(path: S3Location): S3DataConfig = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3DataConfig]
  }
  
  extension [Self <: S3DataConfig](x: Self) {
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setPath(value: S3Location): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
