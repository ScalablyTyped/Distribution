package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Bucket extends StObject {
  
  /**
    * Specifies whether the bucket policy for the bucket requires server-side encryption of objects when objects are uploaded to the bucket. Possible values are: FALSE - The bucket policy requires server-side encryption of new objects. PutObject requests must include the x-amz-server-side-encryption header and the value for that header must be AES256 or aws:kms. TRUE - The bucket doesn't have a bucket policy or it has a bucket policy that doesn't require server-side encryption of new objects. If a bucket policy exists, it doesn't require PutObject requests to include the x-amz-server-side-encryption header and it doesn't require the value for that header to be AES256 or aws:kms. UNKNOWN - Amazon Macie can't determine whether the bucket policy requires server-side encryption of objects.
    */
  var allowsUnencryptedObjectUploads: js.UndefOr[AllowsUnencryptedObjectUploads] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the bucket.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the bucket was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of server-side encryption that's used by default to encrypt objects in the bucket.
    */
  var defaultServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
  
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The display name and canonical user ID for the Amazon Web Services account that owns the bucket.
    */
  var owner: js.UndefOr[S3BucketOwner] = js.undefined
  
  /**
    * The permissions settings that determine whether the bucket is publicly accessible.
    */
  var publicAccess: js.UndefOr[BucketPublicAccess] = js.undefined
  
  /**
    * The tags that are associated with the bucket.
    */
  var tags: js.UndefOr[KeyValuePairList] = js.undefined
}
object S3Bucket {
  
  inline def apply(): S3Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Bucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3Bucket] (val x: Self) extends AnyVal {
    
    inline def setAllowsUnencryptedObjectUploads(value: AllowsUnencryptedObjectUploads): Self = StObject.set(x, "allowsUnencryptedObjectUploads", value.asInstanceOf[js.Any])
    
    inline def setAllowsUnencryptedObjectUploadsUndefined: Self = StObject.set(x, "allowsUnencryptedObjectUploads", js.undefined)
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDefaultServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "defaultServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setDefaultServerSideEncryptionUndefined: Self = StObject.set(x, "defaultServerSideEncryption", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: S3BucketOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPublicAccess(value: BucketPublicAccess): Self = StObject.set(x, "publicAccess", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessUndefined: Self = StObject.set(x, "publicAccess", js.undefined)
    
    inline def setTags(value: KeyValuePairList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: KeyValuePair*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
