package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessResponseHandlingConfig extends StObject {
  
  /**
    * The name of the Amazon S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
  
  /**
    * The Amazon S3 bucket prefix.
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
}
object SuccessResponseHandlingConfig {
  
  inline def apply(): SuccessResponseHandlingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuccessResponseHandlingConfig]
  }
  
  extension [Self <: SuccessResponseHandlingConfig](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
  }
}
