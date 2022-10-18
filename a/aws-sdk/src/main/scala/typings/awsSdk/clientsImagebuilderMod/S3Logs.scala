package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Logs extends StObject {
  
  /**
    * The S3 bucket in which to store the logs.
    */
  var s3BucketName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon S3 path to the bucket where the logs are stored.
    */
  var s3KeyPrefix: js.UndefOr[NonEmptyString] = js.undefined
}
object S3Logs {
  
  inline def apply(): S3Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Logs]
  }
  
  extension [Self <: S3Logs](x: Self) {
    
    inline def setS3BucketName(value: NonEmptyString): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    
    inline def setS3KeyPrefix(value: NonEmptyString): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
  }
}
