package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Location extends StObject {
  
  /**
    * The S3 bucket of the S3 object.
    */
  var S3Bucket: typings.awsSdk.clientsAppstreamMod.S3Bucket
  
  /**
    * The S3 key of the S3 object.
    */
  var S3Key: typings.awsSdk.clientsAppstreamMod.S3Key
}
object S3Location {
  
  inline def apply(S3Bucket: S3Bucket, S3Key: S3Key): S3Location = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any], S3Key = S3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Location]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Location] (val x: Self) extends AnyVal {
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3Key(value: S3Key): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
  }
}
