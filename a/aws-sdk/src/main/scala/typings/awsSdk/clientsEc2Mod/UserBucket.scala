package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserBucket extends StObject {
  
  /**
    * The name of the Amazon S3 bucket where the disk image is located.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The file name of the disk image.
    */
  var S3Key: js.UndefOr[String] = js.undefined
}
object UserBucket {
  
  inline def apply(): UserBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserBucket]
  }
  
  extension [Self <: UserBucket](x: Self) {
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Key(value: String): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
