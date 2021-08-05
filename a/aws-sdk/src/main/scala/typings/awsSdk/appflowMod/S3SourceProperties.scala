package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SourceProperties extends StObject {
  
  /**
    *  The Amazon S3 bucket name where the source files are stored. 
    */
  var bucketName: BucketName
  
  /**
    *  The object key for the Amazon S3 bucket in which the source files are stored. 
    */
  var bucketPrefix: js.UndefOr[BucketPrefix] = js.undefined
}
object S3SourceProperties {
  
  inline def apply(bucketName: BucketName): S3SourceProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SourceProperties]
  }
  
  extension [Self <: S3SourceProperties](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
  }
}
