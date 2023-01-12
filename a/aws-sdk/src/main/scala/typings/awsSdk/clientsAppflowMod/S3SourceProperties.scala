package typings.awsSdk.clientsAppflowMod

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
  
  var s3InputFormatConfig: js.UndefOr[S3InputFormatConfig] = js.undefined
}
object S3SourceProperties {
  
  inline def apply(bucketName: BucketName): S3SourceProperties = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SourceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3SourceProperties] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefix(value: BucketPrefix): Self = StObject.set(x, "bucketPrefix", value.asInstanceOf[js.Any])
    
    inline def setBucketPrefixUndefined: Self = StObject.set(x, "bucketPrefix", js.undefined)
    
    inline def setS3InputFormatConfig(value: S3InputFormatConfig): Self = StObject.set(x, "s3InputFormatConfig", value.asInstanceOf[js.Any])
    
    inline def setS3InputFormatConfigUndefined: Self = StObject.set(x, "s3InputFormatConfig", js.undefined)
  }
}
