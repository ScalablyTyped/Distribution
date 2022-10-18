package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ExportingConfig extends StObject {
  
  /**
    * The name of the S3 bucket where Identity Resolution Jobs write result files.
    */
  var S3BucketName: s3BucketName
  
  /**
    * The S3 key name of the location where Identity Resolution Jobs write result files.
    */
  var S3KeyName: js.UndefOr[s3KeyNameCustomerOutputConfig] = js.undefined
}
object S3ExportingConfig {
  
  inline def apply(S3BucketName: s3BucketName): S3ExportingConfig = {
    val __obj = js.Dynamic.literal(S3BucketName = S3BucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ExportingConfig]
  }
  
  extension [Self <: S3ExportingConfig](x: Self) {
    
    inline def setS3BucketName(value: s3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3KeyName(value: s3KeyNameCustomerOutputConfig): Self = StObject.set(x, "S3KeyName", value.asInstanceOf[js.Any])
    
    inline def setS3KeyNameUndefined: Self = StObject.set(x, "S3KeyName", js.undefined)
  }
}
