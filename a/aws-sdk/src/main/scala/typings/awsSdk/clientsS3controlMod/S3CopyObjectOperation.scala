package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3CopyObjectOperation extends StObject {
  
  /**
    * 
    */
  var AccessControlGrants: js.UndefOr[S3GrantList] = js.undefined
  
  /**
    * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption using Amazon Web Services KMS (SSE-KMS). Setting this header to true causes Amazon S3 to use an S3 Bucket Key for object encryption with SSE-KMS. Specifying this header with an object action doesn’t affect bucket-level settings for S3 Bucket Key.
    */
  var BucketKeyEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var CannedAccessControlList: js.UndefOr[S3CannedAccessControlList] = js.undefined
  
  /**
    * Indicates the algorithm that you want Amazon S3 to use to create the checksum. For more information, see  Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumAlgorithm: js.UndefOr[S3ChecksumAlgorithm] = js.undefined
  
  /**
    * 
    */
  var MetadataDirective: js.UndefOr[S3MetadataDirective] = js.undefined
  
  /**
    * 
    */
  var ModifiedSinceConstraint: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If you don't provide this parameter, Amazon S3 copies all the metadata from the original objects. If you specify an empty set, the new objects will have no tags. Otherwise, Amazon S3 assigns the supplied tags to the new objects.
    */
  var NewObjectMetadata: js.UndefOr[S3ObjectMetadata] = js.undefined
  
  /**
    * 
    */
  var NewObjectTagging: js.UndefOr[S3TagSet] = js.undefined
  
  /**
    * The legal hold status to be applied to all objects in the Batch Operations job.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[S3ObjectLockLegalHoldStatus] = js.undefined
  
  /**
    * The retention mode to be applied to all objects in the Batch Operations job.
    */
  var ObjectLockMode: js.UndefOr[S3ObjectLockMode] = js.undefined
  
  /**
    * The date when the applied object retention configuration expires on all objects in the Batch Operations job.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies an optional metadata property for website redirects, x-amz-website-redirect-location. Allows webpage redirects if the object is accessed through a website endpoint.
    */
  var RedirectLocation: js.UndefOr[NonEmptyMaxLength2048String] = js.undefined
  
  /**
    * 
    */
  var RequesterPays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var SSEAwsKmsKeyId: js.UndefOr[KmsKeyArnString] = js.undefined
  
  /**
    * 
    */
  var StorageClass: js.UndefOr[S3StorageClass] = js.undefined
  
  /**
    * Specifies the folder prefix that you want the objects to be copied into. For example, to copy objects into a folder named Folder1 in the destination bucket, set the TargetKeyPrefix property to Folder1.
    */
  var TargetKeyPrefix: js.UndefOr[NonEmptyMaxLength1024String] = js.undefined
  
  /**
    * Specifies the destination bucket Amazon Resource Name (ARN) for the batch copy operation. For example, to copy objects to a bucket named destinationBucket, set the TargetResource property to arn:aws:s3:::destinationBucket.
    */
  var TargetResource: js.UndefOr[S3BucketArnString] = js.undefined
  
  /**
    * 
    */
  var UnModifiedSinceConstraint: js.UndefOr[js.Date] = js.undefined
}
object S3CopyObjectOperation {
  
  inline def apply(): S3CopyObjectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3CopyObjectOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3CopyObjectOperation] (val x: Self) extends AnyVal {
    
    inline def setAccessControlGrants(value: S3GrantList): Self = StObject.set(x, "AccessControlGrants", value.asInstanceOf[js.Any])
    
    inline def setAccessControlGrantsUndefined: Self = StObject.set(x, "AccessControlGrants", js.undefined)
    
    inline def setAccessControlGrantsVarargs(value: S3Grant*): Self = StObject.set(x, "AccessControlGrants", js.Array(value*))
    
    inline def setBucketKeyEnabled(value: Boolean): Self = StObject.set(x, "BucketKeyEnabled", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabledUndefined: Self = StObject.set(x, "BucketKeyEnabled", js.undefined)
    
    inline def setCannedAccessControlList(value: S3CannedAccessControlList): Self = StObject.set(x, "CannedAccessControlList", value.asInstanceOf[js.Any])
    
    inline def setCannedAccessControlListUndefined: Self = StObject.set(x, "CannedAccessControlList", js.undefined)
    
    inline def setChecksumAlgorithm(value: S3ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setMetadataDirective(value: S3MetadataDirective): Self = StObject.set(x, "MetadataDirective", value.asInstanceOf[js.Any])
    
    inline def setMetadataDirectiveUndefined: Self = StObject.set(x, "MetadataDirective", js.undefined)
    
    inline def setModifiedSinceConstraint(value: js.Date): Self = StObject.set(x, "ModifiedSinceConstraint", value.asInstanceOf[js.Any])
    
    inline def setModifiedSinceConstraintUndefined: Self = StObject.set(x, "ModifiedSinceConstraint", js.undefined)
    
    inline def setNewObjectMetadata(value: S3ObjectMetadata): Self = StObject.set(x, "NewObjectMetadata", value.asInstanceOf[js.Any])
    
    inline def setNewObjectMetadataUndefined: Self = StObject.set(x, "NewObjectMetadata", js.undefined)
    
    inline def setNewObjectTagging(value: S3TagSet): Self = StObject.set(x, "NewObjectTagging", value.asInstanceOf[js.Any])
    
    inline def setNewObjectTaggingUndefined: Self = StObject.set(x, "NewObjectTagging", js.undefined)
    
    inline def setNewObjectTaggingVarargs(value: S3Tag*): Self = StObject.set(x, "NewObjectTagging", js.Array(value*))
    
    inline def setObjectLockLegalHoldStatus(value: S3ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    inline def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    inline def setObjectLockMode(value: S3ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    inline def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    inline def setObjectLockRetainUntilDate(value: js.Date): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    inline def setRedirectLocation(value: NonEmptyMaxLength2048String): Self = StObject.set(x, "RedirectLocation", value.asInstanceOf[js.Any])
    
    inline def setRedirectLocationUndefined: Self = StObject.set(x, "RedirectLocation", js.undefined)
    
    inline def setRequesterPays(value: Boolean): Self = StObject.set(x, "RequesterPays", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysUndefined: Self = StObject.set(x, "RequesterPays", js.undefined)
    
    inline def setSSEAwsKmsKeyId(value: KmsKeyArnString): Self = StObject.set(x, "SSEAwsKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEAwsKmsKeyIdUndefined: Self = StObject.set(x, "SSEAwsKmsKeyId", js.undefined)
    
    inline def setStorageClass(value: S3StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setTargetKeyPrefix(value: NonEmptyMaxLength1024String): Self = StObject.set(x, "TargetKeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setTargetKeyPrefixUndefined: Self = StObject.set(x, "TargetKeyPrefix", js.undefined)
    
    inline def setTargetResource(value: S3BucketArnString): Self = StObject.set(x, "TargetResource", value.asInstanceOf[js.Any])
    
    inline def setTargetResourceUndefined: Self = StObject.set(x, "TargetResource", js.undefined)
    
    inline def setUnModifiedSinceConstraint(value: js.Date): Self = StObject.set(x, "UnModifiedSinceConstraint", value.asInstanceOf[js.Any])
    
    inline def setUnModifiedSinceConstraintUndefined: Self = StObject.set(x, "UnModifiedSinceConstraint", js.undefined)
  }
}
