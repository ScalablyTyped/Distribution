package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketInventoryConfigurationRequest extends StObject {
  
  /**
    * The name of the bucket containing the inventory configuration to delete.
    */
  var Bucket: BucketName
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId
}
object DeleteBucketInventoryConfigurationRequest {
  
  inline def apply(Bucket: BucketName, Id: InventoryId): DeleteBucketInventoryConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketInventoryConfigurationRequest]
  }
  
  extension [Self <: DeleteBucketInventoryConfigurationRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setId(value: InventoryId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
