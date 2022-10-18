package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketAnalyticsConfigurationRequest extends StObject {
  
  /**
    * The name of the bucket from which an analytics configuration is deleted.
    */
  var Bucket: BucketName
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The ID that identifies the analytics configuration.
    */
  var Id: AnalyticsId
}
object DeleteBucketAnalyticsConfigurationRequest {
  
  inline def apply(Bucket: BucketName, Id: AnalyticsId): DeleteBucketAnalyticsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketAnalyticsConfigurationRequest]
  }
  
  extension [Self <: DeleteBucketAnalyticsConfigurationRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setId(value: AnalyticsId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
