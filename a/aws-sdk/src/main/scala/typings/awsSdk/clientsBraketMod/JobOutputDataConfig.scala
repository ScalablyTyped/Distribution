package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobOutputDataConfig extends StObject {
  
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon Braket uses to encrypt the job training artifacts at rest using Amazon S3 server-side encryption.
    */
  var kmsKeyId: js.UndefOr[String2048] = js.undefined
  
  /**
    * Identifies the S3 path where you want Amazon Braket to store the job training artifacts. For example, s3://bucket-name/key-name-prefix.
    */
  var s3Path: S3Path
}
object JobOutputDataConfig {
  
  inline def apply(s3Path: S3Path): JobOutputDataConfig = {
    val __obj = js.Dynamic.literal(s3Path = s3Path.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobOutputDataConfig]
  }
  
  extension [Self <: JobOutputDataConfig](x: Self) {
    
    inline def setKmsKeyId(value: String2048): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setS3Path(value: S3Path): Self = StObject.set(x, "s3Path", value.asInstanceOf[js.Any])
  }
}
