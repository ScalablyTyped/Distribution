package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadObjectOutput extends StObject {
  
  /**
    * Indicates that a range of bytes was specified.
    */
  var AcceptRanges: js.UndefOr[typings.awsSdk.clientsS3Mod.AcceptRanges] = js.undefined
  
  /**
    * The archive state of the head object.
    */
  var ArchiveStatus: js.UndefOr[typings.awsSdk.clientsS3Mod.ArchiveStatus] = js.undefined
  
  /**
    * Indicates whether the object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
    */
  var BucketKeyEnabled: js.UndefOr[typings.awsSdk.clientsS3Mod.BucketKeyEnabled] = js.undefined
  
  /**
    * Specifies caching behavior along the request/reply chain.
    */
  var CacheControl: js.UndefOr[typings.awsSdk.clientsS3Mod.CacheControl] = js.undefined
  
  /**
    * The base64-encoded, 32-bit CRC32 checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see  Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumCRC32: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumCRC32] = js.undefined
  
  /**
    * The base64-encoded, 32-bit CRC32C checksum of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see  Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumCRC32C: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumCRC32C] = js.undefined
  
  /**
    * The base64-encoded, 160-bit SHA-1 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see  Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumSHA1: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumSHA1] = js.undefined
  
  /**
    * The base64-encoded, 256-bit SHA-256 digest of the object. This will only be present if it was uploaded with the object. With multipart uploads, this may not be a checksum value of the object. For more information about how checksums are calculated with multipart uploads, see  Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumSHA256: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumSHA256] = js.undefined
  
  /**
    * Specifies presentational information for the object.
    */
  var ContentDisposition: js.UndefOr[typings.awsSdk.clientsS3Mod.ContentDisposition] = js.undefined
  
  /**
    * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
    */
  var ContentEncoding: js.UndefOr[typings.awsSdk.clientsS3Mod.ContentEncoding] = js.undefined
  
  /**
    * The language the content is in.
    */
  var ContentLanguage: js.UndefOr[typings.awsSdk.clientsS3Mod.ContentLanguage] = js.undefined
  
  /**
    * Size of the body in bytes.
    */
  var ContentLength: js.UndefOr[typings.awsSdk.clientsS3Mod.ContentLength] = js.undefined
  
  /**
    * A standard MIME type describing the format of the object data.
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsS3Mod.ContentType] = js.undefined
  
  /**
    * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.clientsS3Mod.DeleteMarker] = js.undefined
  
  /**
    * An entity tag (ETag) is an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
    */
  var ETag: js.UndefOr[typings.awsSdk.clientsS3Mod.ETag] = js.undefined
  
  /**
    * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key-value pairs providing object expiration information. The value of the rule-id is URL-encoded.
    */
  var Expiration: js.UndefOr[typings.awsSdk.clientsS3Mod.Expiration] = js.undefined
  
  /**
    * The date and time at which the object is no longer cacheable.
    */
  var Expires: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Creation date of the object.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A map of metadata to store with the object in S3.
    */
  var Metadata: js.UndefOr[typings.awsSdk.clientsS3Mod.Metadata] = js.undefined
  
  /**
    * This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
    */
  var MissingMeta: js.UndefOr[typings.awsSdk.clientsS3Mod.MissingMeta] = js.undefined
  
  /**
    * Specifies whether a legal hold is in effect for this object. This header is only returned if the requester has the s3:GetObjectLegalHold permission. This header is not returned if the specified version of this object has never had a legal hold applied. For more information about S3 Object Lock, see Object Lock.
    */
  var ObjectLockLegalHoldStatus: js.UndefOr[typings.awsSdk.clientsS3Mod.ObjectLockLegalHoldStatus] = js.undefined
  
  /**
    * The Object Lock mode, if any, that's in effect for this object. This header is only returned if the requester has the s3:GetObjectRetention permission. For more information about S3 Object Lock, see Object Lock. 
    */
  var ObjectLockMode: js.UndefOr[typings.awsSdk.clientsS3Mod.ObjectLockMode] = js.undefined
  
  /**
    * The date and time when the Object Lock retention period expires. This header is only returned if the requester has the s3:GetObjectRetention permission.
    */
  var ObjectLockRetainUntilDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The count of parts this object has. This value is only returned if you specify partNumber in your request and the object was uploaded as a multipart upload.
    */
  var PartsCount: js.UndefOr[typings.awsSdk.clientsS3Mod.PartsCount] = js.undefined
  
  /**
    * Amazon S3 can return this header if your request involves a bucket that is either a source or a destination in a replication rule. In replication, you have a source bucket on which you configure replication and destination bucket or buckets where Amazon S3 stores object replicas. When you request an object (GetObject) or object metadata (HeadObject) from these buckets, Amazon S3 will return the x-amz-replication-status header in the response as follows:    If requesting an object from the source bucket, Amazon S3 will return the x-amz-replication-status header if the object in your request is eligible for replication.  For example, suppose that in your replication configuration, you specify object prefix TaxDocs requesting Amazon S3 to replicate objects with key prefix TaxDocs. Any objects you upload with this key name prefix, for example TaxDocs/document1.pdf, are eligible for replication. For any object request with this key name prefix, Amazon S3 will return the x-amz-replication-status header with value PENDING, COMPLETED or FAILED indicating object replication status.    If requesting an object from a destination bucket, Amazon S3 will return the x-amz-replication-status header with value REPLICA if the object in your request is a replica that Amazon S3 created and there is no replica modification replication in progress.    When replicating objects to multiple destination buckets, the x-amz-replication-status header acts differently. The header of the source object will only return a value of COMPLETED when replication is successful to all destinations. The header will remain at value PENDING until replication has completed for all destinations. If one or more destinations fails replication the header will return FAILED.    For more information, see Replication.
    */
  var ReplicationStatus: js.UndefOr[typings.awsSdk.clientsS3Mod.ReplicationStatus] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
  
  /**
    * If the object is an archived object (an object whose storage class is GLACIER), the response includes this header if either the archive restoration is in progress (see RestoreObject or an archive copy is already restored.  If an archive copy is already restored, the header value indicates when Amazon S3 is scheduled to delete the object copy. For example:  x-amz-restore: ongoing-request="false", expiry-date="Fri, 21 Dec 2012 00:00:00 GMT"  If the object restoration is in progress, the header returns the value ongoing-request="true". For more information about archiving objects, see Transitioning Objects: General Considerations.
    */
  var Restore: js.UndefOr[typings.awsSdk.clientsS3Mod.Restore] = js.undefined
  
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.clientsS3Mod.SSEKMSKeyId] = js.undefined
  
  /**
    * If the object is stored using server-side encryption either with an Amazon Web Services KMS key or an Amazon S3-managed encryption key, the response includes this header with the value of the server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.clientsS3Mod.ServerSideEncryption] = js.undefined
  
  /**
    * Provides storage class information of the object. Amazon S3 returns this header for all objects except for S3 Standard storage class objects. For more information, see Storage Classes.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.clientsS3Mod.StorageClass] = js.undefined
  
  /**
    * Version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  
  /**
    * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
    */
  var WebsiteRedirectLocation: js.UndefOr[typings.awsSdk.clientsS3Mod.WebsiteRedirectLocation] = js.undefined
}
object HeadObjectOutput {
  
  inline def apply(): HeadObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadObjectOutput]
  }
  
  extension [Self <: HeadObjectOutput](x: Self) {
    
    inline def setAcceptRanges(value: AcceptRanges): Self = StObject.set(x, "AcceptRanges", value.asInstanceOf[js.Any])
    
    inline def setAcceptRangesUndefined: Self = StObject.set(x, "AcceptRanges", js.undefined)
    
    inline def setArchiveStatus(value: ArchiveStatus): Self = StObject.set(x, "ArchiveStatus", value.asInstanceOf[js.Any])
    
    inline def setArchiveStatusUndefined: Self = StObject.set(x, "ArchiveStatus", js.undefined)
    
    inline def setBucketKeyEnabled(value: BucketKeyEnabled): Self = StObject.set(x, "BucketKeyEnabled", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabledUndefined: Self = StObject.set(x, "BucketKeyEnabled", js.undefined)
    
    inline def setCacheControl(value: CacheControl): Self = StObject.set(x, "CacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "CacheControl", js.undefined)
    
    inline def setChecksumCRC32(value: ChecksumCRC32): Self = StObject.set(x, "ChecksumCRC32", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32C(value: ChecksumCRC32C): Self = StObject.set(x, "ChecksumCRC32C", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32CUndefined: Self = StObject.set(x, "ChecksumCRC32C", js.undefined)
    
    inline def setChecksumCRC32Undefined: Self = StObject.set(x, "ChecksumCRC32", js.undefined)
    
    inline def setChecksumSHA1(value: ChecksumSHA1): Self = StObject.set(x, "ChecksumSHA1", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA1Undefined: Self = StObject.set(x, "ChecksumSHA1", js.undefined)
    
    inline def setChecksumSHA256(value: ChecksumSHA256): Self = StObject.set(x, "ChecksumSHA256", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA256Undefined: Self = StObject.set(x, "ChecksumSHA256", js.undefined)
    
    inline def setContentDisposition(value: ContentDisposition): Self = StObject.set(x, "ContentDisposition", value.asInstanceOf[js.Any])
    
    inline def setContentDispositionUndefined: Self = StObject.set(x, "ContentDisposition", js.undefined)
    
    inline def setContentEncoding(value: ContentEncoding): Self = StObject.set(x, "ContentEncoding", value.asInstanceOf[js.Any])
    
    inline def setContentEncodingUndefined: Self = StObject.set(x, "ContentEncoding", js.undefined)
    
    inline def setContentLanguage(value: ContentLanguage): Self = StObject.set(x, "ContentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "ContentLanguage", js.undefined)
    
    inline def setContentLength(value: ContentLength): Self = StObject.set(x, "ContentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "ContentLength", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setDeleteMarker(value: DeleteMarker): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
    
    inline def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setExpiration(value: Expiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setMissingMeta(value: MissingMeta): Self = StObject.set(x, "MissingMeta", value.asInstanceOf[js.Any])
    
    inline def setMissingMetaUndefined: Self = StObject.set(x, "MissingMeta", js.undefined)
    
    inline def setObjectLockLegalHoldStatus(value: ObjectLockLegalHoldStatus): Self = StObject.set(x, "ObjectLockLegalHoldStatus", value.asInstanceOf[js.Any])
    
    inline def setObjectLockLegalHoldStatusUndefined: Self = StObject.set(x, "ObjectLockLegalHoldStatus", js.undefined)
    
    inline def setObjectLockMode(value: ObjectLockMode): Self = StObject.set(x, "ObjectLockMode", value.asInstanceOf[js.Any])
    
    inline def setObjectLockModeUndefined: Self = StObject.set(x, "ObjectLockMode", js.undefined)
    
    inline def setObjectLockRetainUntilDate(value: js.Date): Self = StObject.set(x, "ObjectLockRetainUntilDate", value.asInstanceOf[js.Any])
    
    inline def setObjectLockRetainUntilDateUndefined: Self = StObject.set(x, "ObjectLockRetainUntilDate", js.undefined)
    
    inline def setPartsCount(value: PartsCount): Self = StObject.set(x, "PartsCount", value.asInstanceOf[js.Any])
    
    inline def setPartsCountUndefined: Self = StObject.set(x, "PartsCount", js.undefined)
    
    inline def setReplicationStatus(value: ReplicationStatus): Self = StObject.set(x, "ReplicationStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicationStatusUndefined: Self = StObject.set(x, "ReplicationStatus", js.undefined)
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setRestore(value: Restore): Self = StObject.set(x, "Restore", value.asInstanceOf[js.Any])
    
    inline def setRestoreUndefined: Self = StObject.set(x, "Restore", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    inline def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
    
    inline def setWebsiteRedirectLocation(value: WebsiteRedirectLocation): Self = StObject.set(x, "WebsiteRedirectLocation", value.asInstanceOf[js.Any])
    
    inline def setWebsiteRedirectLocationUndefined: Self = StObject.set(x, "WebsiteRedirectLocation", js.undefined)
  }
}
