package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggingInfo extends StObject {
  
  /**
    * The name of an S3 bucket where execution logs are stored.
    */
  var S3BucketName: typings.awsSdk.clientsSsmMod.S3BucketName
  
  /**
    * (Optional) The S3 bucket subfolder. 
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.clientsSsmMod.S3KeyPrefix] = js.undefined
  
  /**
    * The Amazon Web Services Region where the S3 bucket is located.
    */
  var S3Region: typings.awsSdk.clientsSsmMod.S3Region
}
object LoggingInfo {
  
  inline def apply(S3BucketName: S3BucketName, S3Region: S3Region): LoggingInfo = {
    val __obj = js.Dynamic.literal(S3BucketName = S3BucketName.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
  
  extension [Self <: LoggingInfo](x: Self) {
    
    inline def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    inline def setS3Region(value: S3Region): Self = StObject.set(x, "S3Region", value.asInstanceOf[js.Any])
  }
}
