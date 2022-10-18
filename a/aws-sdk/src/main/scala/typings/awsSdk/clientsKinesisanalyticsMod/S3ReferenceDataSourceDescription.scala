package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ReferenceDataSourceDescription extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typings.awsSdk.clientsKinesisanalyticsMod.BucketARN
  
  /**
    * Amazon S3 object key name.
    */
  var FileKey: typings.awsSdk.clientsKinesisanalyticsMod.FileKey
  
  /**
    * ARN of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object on your behalf to populate the in-application reference table.
    */
  var ReferenceRoleARN: RoleARN
}
object S3ReferenceDataSourceDescription {
  
  inline def apply(BucketARN: BucketARN, FileKey: FileKey, ReferenceRoleARN: RoleARN): S3ReferenceDataSourceDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any], ReferenceRoleARN = ReferenceRoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReferenceDataSourceDescription]
  }
  
  extension [Self <: S3ReferenceDataSourceDescription](x: Self) {
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    inline def setReferenceRoleARN(value: RoleARN): Self = StObject.set(x, "ReferenceRoleARN", value.asInstanceOf[js.Any])
  }
}
