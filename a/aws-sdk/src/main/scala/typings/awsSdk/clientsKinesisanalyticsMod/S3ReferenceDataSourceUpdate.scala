package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ReferenceDataSourceUpdate extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined
  
  /**
    * Object key name.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.undefined
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and populate the in-application.
    */
  var ReferenceRoleARNUpdate: js.UndefOr[RoleARN] = js.undefined
}
object S3ReferenceDataSourceUpdate {
  
  inline def apply(): S3ReferenceDataSourceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReferenceDataSourceUpdate]
  }
  
  extension [Self <: S3ReferenceDataSourceUpdate](x: Self) {
    
    inline def setBucketARNUpdate(value: BucketARN): Self = StObject.set(x, "BucketARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setBucketARNUpdateUndefined: Self = StObject.set(x, "BucketARNUpdate", js.undefined)
    
    inline def setFileKeyUpdate(value: FileKey): Self = StObject.set(x, "FileKeyUpdate", value.asInstanceOf[js.Any])
    
    inline def setFileKeyUpdateUndefined: Self = StObject.set(x, "FileKeyUpdate", js.undefined)
    
    inline def setReferenceRoleARNUpdate(value: RoleARN): Self = StObject.set(x, "ReferenceRoleARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setReferenceRoleARNUpdateUndefined: Self = StObject.set(x, "ReferenceRoleARNUpdate", js.undefined)
  }
}
