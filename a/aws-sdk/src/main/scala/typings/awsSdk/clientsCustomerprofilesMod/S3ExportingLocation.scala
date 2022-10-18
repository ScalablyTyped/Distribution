package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ExportingLocation extends StObject {
  
  /**
    * The name of the S3 bucket name where Identity Resolution Jobs write result files.
    */
  var S3BucketName: js.UndefOr[s3BucketName] = js.undefined
  
  /**
    * The S3 key name of the location where Identity Resolution Jobs write result files.
    */
  var S3KeyName: js.UndefOr[s3KeyName] = js.undefined
}
object S3ExportingLocation {
  
  inline def apply(): S3ExportingLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ExportingLocation]
  }
  
  extension [Self <: S3ExportingLocation](x: Self) {
    
    inline def setS3BucketName(value: s3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "S3BucketName", js.undefined)
    
    inline def setS3KeyName(value: s3KeyName): Self = StObject.set(x, "S3KeyName", value.asInstanceOf[js.Any])
    
    inline def setS3KeyNameUndefined: Self = StObject.set(x, "S3KeyName", js.undefined)
  }
}
