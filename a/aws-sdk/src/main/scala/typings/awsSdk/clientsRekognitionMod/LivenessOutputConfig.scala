package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivenessOutputConfig extends StObject {
  
  /**
    * The path to an AWS Amazon S3 bucket used to store Face Liveness session results.
    */
  var S3Bucket: typings.awsSdk.clientsRekognitionMod.S3Bucket
  
  /**
    * The prefix prepended to the output files for the Face Liveness session results.
    */
  var S3KeyPrefix: js.UndefOr[LivenessS3KeyPrefix] = js.undefined
}
object LivenessOutputConfig {
  
  inline def apply(S3Bucket: S3Bucket): LivenessOutputConfig = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LivenessOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LivenessOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefix(value: LivenessS3KeyPrefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
  }
}
