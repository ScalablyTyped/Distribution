package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IotSiteWiseCustomerManagedDatastoreS3StorageSummary extends StObject {
  
  /**
    *  The name of the Amazon S3 bucket where your data is stored. 
    */
  var bucket: js.UndefOr[BucketName] = js.undefined
  
  /**
    *  (Optional) The prefix used to create the keys of the data store data objects. Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket. Each object in a bucket has exactly one key. The prefix must end with a forward slash (/). 
    */
  var keyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
}
object IotSiteWiseCustomerManagedDatastoreS3StorageSummary {
  
  inline def apply(): IotSiteWiseCustomerManagedDatastoreS3StorageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IotSiteWiseCustomerManagedDatastoreS3StorageSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IotSiteWiseCustomerManagedDatastoreS3StorageSummary] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setBucketUndefined: Self = StObject.set(x, "bucket", js.undefined)
    
    inline def setKeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
  }
}
