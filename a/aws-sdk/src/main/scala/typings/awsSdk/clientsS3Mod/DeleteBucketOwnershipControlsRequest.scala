package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketOwnershipControlsRequest extends StObject {
  
  /**
    * The Amazon S3 bucket whose OwnershipControls you want to delete. 
    */
  var Bucket: BucketName
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
}
object DeleteBucketOwnershipControlsRequest {
  
  inline def apply(Bucket: BucketName): DeleteBucketOwnershipControlsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketOwnershipControlsRequest]
  }
  
  extension [Self <: DeleteBucketOwnershipControlsRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
  }
}
