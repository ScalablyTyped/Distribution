package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerManagedDatastoreS3Storage extends StObject {
  
  /**
    * The name of the Amazon S3 bucket where your data is stored.
    */
  var bucket: BucketName
  
  /**
    * (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  
  /**
    * The ARN of the role that grants IoT Analytics permission to interact with your Amazon S3 resources.
    */
  var roleArn: RoleArn
}
object CustomerManagedDatastoreS3Storage {
  
  inline def apply(bucket: BucketName, roleArn: RoleArn): CustomerManagedDatastoreS3Storage = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerManagedDatastoreS3Storage]
  }
  
  extension [Self <: CustomerManagedDatastoreS3Storage](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
