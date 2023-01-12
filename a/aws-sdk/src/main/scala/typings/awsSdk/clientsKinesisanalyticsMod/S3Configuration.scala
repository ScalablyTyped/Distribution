package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Configuration extends StObject {
  
  /**
    * ARN of the S3 bucket that contains the data.
    */
  var BucketARN: typings.awsSdk.clientsKinesisanalyticsMod.BucketARN
  
  /**
    * The name of the object that contains the data.
    */
  var FileKey: typings.awsSdk.clientsKinesisanalyticsMod.FileKey
  
  /**
    * IAM ARN of the role used to access the data.
    */
  var RoleARN: typings.awsSdk.clientsKinesisanalyticsMod.RoleARN
}
object S3Configuration {
  
  inline def apply(BucketARN: BucketARN, FileKey: FileKey, RoleARN: RoleARN): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Configuration] (val x: Self) extends AnyVal {
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
