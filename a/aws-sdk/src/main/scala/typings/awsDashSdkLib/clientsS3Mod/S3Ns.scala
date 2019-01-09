package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/s3", "S3")
@js.native
object S3Ns extends js.Object {
  trait AbortIncompleteMultipartUpload extends js.Object {
    /**
      * Indicates the number of days that must pass since initiation for Lifecycle to abort an Incomplete Multipart Upload.
      */
    var DaysAfterInitiation: js.UndefOr[DaysAfterInitiation] = js.undefined
  }
  
  trait AbortMultipartUploadOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  }
  
  trait AbortMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    var UploadId: MultipartUploadId
  }
  
  trait AccelerateConfiguration extends js.Object {
    /**
      * The accelerate configuration of the bucket.
      */
    var Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
  }
  
  trait AccessControlPolicy extends js.Object {
    /**
      * A list of grants.
      */
    var Grants: js.UndefOr[Grants] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
  }
  
  trait AccessControlTranslation extends js.Object {
    /**
      * The override value for the owner of the replica object.
      */
    var Owner: OwnerOverride
  }
  
  trait AnalyticsAndOperator extends js.Object {
    /**
      * The prefix to use when evaluating an AND predicate.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * The list of tags to use when evaluating an AND predicate.
      */
    var Tags: js.UndefOr[TagSet] = js.undefined
  }
  
  trait AnalyticsConfiguration extends js.Object {
    /**
      * The filter used to describe a set of objects for analyses. A filter must have exactly one prefix, one tag, or one conjunction (AnalyticsAndOperator). If no filter is provided, all objects will be considered in any analysis.
      */
    var Filter: js.UndefOr[AnalyticsFilter] = js.undefined
    /**
      * The identifier used to represent an analytics configuration.
      */
    var Id: AnalyticsId
    /**
      * If present, it indicates that data related to access patterns will be collected and made available to analyze the tradeoffs between different storage classes.
      */
    var StorageClassAnalysis: StorageClassAnalysis
  }
  
  trait AnalyticsExportDestination extends js.Object {
    /**
      * A destination signifying output to an S3 bucket.
      */
    var S3BucketDestination: AnalyticsS3BucketDestination
  }
  
  trait AnalyticsFilter extends js.Object {
    /**
      * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.
      */
    var And: js.UndefOr[AnalyticsAndOperator] = js.undefined
    /**
      * The prefix to use when evaluating an analytics filter.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * The tag to use when evaluating an analytics filter.
      */
    var Tag: js.UndefOr[Tag] = js.undefined
  }
  
  trait AnalyticsS3BucketDestination extends js.Object {
    /**
      * The Amazon resource name (ARN) of the bucket to which data is exported.
      */
    var Bucket: BucketName
    /**
      * The account ID that owns the destination bucket. If no account ID is provided, the owner will not be validated prior to exporting data.
      */
    var BucketAccountId: js.UndefOr[AccountId] = js.undefined
    /**
      * The file format used when exporting data to Amazon S3.
      */
    var Format: AnalyticsS3ExportFileFormat
    /**
      * The prefix to use when exporting data. The exported data begins with this prefix.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  trait Bucket extends js.Object {
    /**
      * Date the bucket was created.
      */
    var CreationDate: js.UndefOr[CreationDate] = js.undefined
    /**
      * The name of the bucket.
      */
    var Name: js.UndefOr[BucketName] = js.undefined
  }
  
  trait BucketLifecycleConfiguration extends js.Object {
    var Rules: LifecycleRules
  }
  
  trait BucketLoggingStatus extends js.Object {
    var LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined
  }
  
  trait CORSConfiguration extends js.Object {
    var CORSRules: CORSRules
  }
  
  trait CORSRule extends js.Object {
    /**
      * Specifies which headers are allowed in a pre-flight OPTIONS request.
      */
    var AllowedHeaders: js.UndefOr[AllowedHeaders] = js.undefined
    /**
      * Identifies HTTP methods that the domain/origin specified in the rule is allowed to execute.
      */
    var AllowedMethods: AllowedMethods
    /**
      * One or more origins you want customers to be able to access the bucket from.
      */
    var AllowedOrigins: AllowedOrigins
    /**
      * One or more headers in the response that you want customers to be able to access from their applications (for example, from a JavaScript XMLHttpRequest object).
      */
    var ExposeHeaders: js.UndefOr[ExposeHeaders] = js.undefined
    /**
      * The time in seconds that your browser is to cache the preflight response for the specified resource.
      */
    var MaxAgeSeconds: js.UndefOr[MaxAgeSeconds] = js.undefined
  }
  
  trait CSVInput extends js.Object {
    /**
      * Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default value is FALSE. Setting this value to TRUE may lower performance.
      */
    var AllowQuotedRecordDelimiter: js.UndefOr[AllowQuotedRecordDelimiter] = js.undefined
    /**
      * The single character used to indicate a row should be ignored when present at the start of a row.
      */
    var Comments: js.UndefOr[Comments] = js.undefined
    /**
      * The value used to separate individual fields in a record.
      */
    var FieldDelimiter: js.UndefOr[FieldDelimiter] = js.undefined
    /**
      * Describes the first line of input. Valid values: None, Ignore, Use.
      */
    var FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined
    /**
      * Value used for escaping where the field delimiter is part of the value.
      */
    var QuoteCharacter: js.UndefOr[QuoteCharacter] = js.undefined
    /**
      * The single character used for escaping the quote character inside an already escaped value.
      */
    var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter] = js.undefined
    /**
      * The value used to separate individual records.
      */
    var RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined
  }
  
  trait CSVOutput extends js.Object {
    /**
      * The value used to separate individual fields in a record.
      */
    var FieldDelimiter: js.UndefOr[FieldDelimiter] = js.undefined
    /**
      * The value used for escaping where the field delimiter is part of the value.
      */
    var QuoteCharacter: js.UndefOr[QuoteCharacter] = js.undefined
    /**
      * Th single character used for escaping the quote character inside an already escaped value.
      */
    var QuoteEscapeCharacter: js.UndefOr[QuoteEscapeCharacter] = js.undefined
    /**
      * Indicates whether or not all output fields should be quoted.
      */
    var QuoteFields: js.UndefOr[QuoteFields] = js.undefined
    /**
      * The value used to separate individual records.
      */
    var RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CloudFunctionConfiguration extends js.Object {
    var CloudFunction: js.UndefOr[CloudFunction] = js.undefined
    var Event: js.UndefOr[Event] = js.undefined
    var Events: js.UndefOr[EventList] = js.undefined
    var Id: js.UndefOr[NotificationId] = js.undefined
    var InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.undefined
  }
  
  trait CommonPrefix extends js.Object {
    var Prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  trait CompleteMultipartUploadOutput extends js.Object {
    var Bucket: js.UndefOr[BucketName] = js.undefined
    /**
      * Entity tag of the object.
      */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
      * If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.
      */
    var Expiration: js.UndefOr[Expiration] = js.undefined
    var Key: js.UndefOr[ObjectKey] = js.undefined
    var Location: js.UndefOr[Location] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    /**
      * Version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait CompleteMultipartUploadRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    var UploadId: MultipartUploadId
  }
  
  trait CompletedMultipartUpload extends js.Object {
    var Parts: js.UndefOr[CompletedPartList] = js.undefined
  }
  
  trait CompletedPart extends js.Object {
    /**
      * Entity tag returned when the part was uploaded.
      */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
      * Part number that identifies the part. This is a positive integer between 1 and 10,000.
      */
    var PartNumber: js.UndefOr[PartNumber] = js.undefined
  }
  
  trait Condition extends js.Object {
    /**
      * The HTTP error code when the redirect is applied. In the event of an error, if the error code equals this value, then the specified redirect is applied. Required when parent element Condition is specified and sibling KeyPrefixEquals is not specified. If both are specified, then both must be true for the redirect to be applied.
      */
    var HttpErrorCodeReturnedEquals: js.UndefOr[HttpErrorCodeReturnedEquals] = js.undefined
    /**
      * The object key name prefix when the redirect is applied. For example, to redirect requests for ExamplePage.html, the key prefix will be ExamplePage.html. To redirect request for all pages with the prefix docs/, the key prefix will be /docs, which identifies all objects in the docs/ folder. Required when the parent element Condition is specified and sibling HttpErrorCodeReturnedEquals is not specified. If both conditions are specified, both must be true for the redirect to be applied.
      */
    var KeyPrefixEquals: js.UndefOr[KeyPrefixEquals] = js.undefined
  }
  
  trait ContinuationEvent extends js.Object
  
  trait CopyObjectOutput extends js.Object {
    var CopyObjectResult: js.UndefOr[CopyObjectResult] = js.undefined
    var CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined
    /**
      * If the object expiration is configured, the response includes this header.
      */
    var Expiration: js.UndefOr[Expiration] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    /**
      * Version ID of the newly created copy.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait CopyObjectRequest extends js.Object {
    /**
      * The canned ACL to apply to the object.
      */
    var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
    var Bucket: BucketName
    /**
      * Specifies caching behavior along the request/reply chain.
      */
    var CacheControl: js.UndefOr[CacheControl] = js.undefined
    /**
      * Specifies presentational information for the object.
      */
    var ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
      */
    var ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined
    /**
      * The language the content is in.
      */
    var ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined
    /**
      * A standard MIME type describing the format of the object data.
      */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
      * The name of the source bucket and key name of the source object, separated by a slash (/). Must be URL-encoded.
      */
    var CopySource: CopySource
    /**
      * Copies the object if its entity tag (ETag) matches the specified tag.
      */
    var CopySourceIfMatch: js.UndefOr[CopySourceIfMatch] = js.undefined
    /**
      * Copies the object if it has been modified since the specified time.
      */
    var CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince] = js.undefined
    /**
      * Copies the object if its entity tag (ETag) is different than the specified ETag.
      */
    var CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch] = js.undefined
    /**
      * Copies the object if it hasn't been modified since the specified time.
      */
    var CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince] = js.undefined
    /**
      * Specifies the algorithm to use when decrypting the source object (e.g., AES256).
      */
    var CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
      */
    var CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5] = js.undefined
    /**
      * The date and time at which the object is no longer cacheable.
      */
    var Expires: js.UndefOr[Expires] = js.undefined
    /**
      * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.
      */
    var GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined
    /**
      * Allows grantee to read the object data and its metadata.
      */
    var GrantRead: js.UndefOr[GrantRead] = js.undefined
    /**
      * Allows grantee to read the object ACL.
      */
    var GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined
    /**
      * Allows grantee to write the ACL for the applicable object.
      */
    var GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined
    var Key: ObjectKey
    /**
      * A map of metadata to store with the object in S3.
      */
    var Metadata: js.UndefOr[Metadata] = js.undefined
    /**
      * Specifies whether the metadata is copied from the source object or replaced with metadata provided in the request.
      */
    var MetadataDirective: js.UndefOr[MetadataDirective] = js.undefined
    /**
      * Specifies whether you want to apply a Legal Hold to the copied object.
      */
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
    /**
      * The Object Lock mode that you want to apply to the copied object.
      */
    var ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined
    /**
      * The date and time when you want the copied object's Object Lock to expire.
      */
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
      */
    var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. Documentation on configuring any of the officially supported AWS SDKs and CLI can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    /**
      * The type of storage to use for the object. Defaults to 'STANDARD'.
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The tag-set for the object destination object this value must be used in conjunction with the TaggingDirective. The tag-set must be encoded as URL Query parameters
      */
    var Tagging: js.UndefOr[TaggingHeader] = js.undefined
    /**
      * Specifies whether the object tag-set are copied from the source object or replaced with tag-set provided in the request.
      */
    var TaggingDirective: js.UndefOr[TaggingDirective] = js.undefined
    /**
      * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
      */
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
  }
  
  trait CopyObjectResult extends js.Object {
    var ETag: js.UndefOr[ETag] = js.undefined
    var LastModified: js.UndefOr[LastModified] = js.undefined
  }
  
  trait CopyPartResult extends js.Object {
    /**
      * Entity tag of the object.
      */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
      * Date and time at which the object was uploaded.
      */
    var LastModified: js.UndefOr[LastModified] = js.undefined
  }
  
  trait CreateBucketConfiguration extends js.Object {
    /**
      * Specifies the region where the bucket will be created. If you don't specify a region, the bucket will be created in US Standard.
      */
    var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
  }
  
  trait CreateBucketOutput extends js.Object {
    var Location: js.UndefOr[Location] = js.undefined
  }
  
  trait CreateBucketRequest extends js.Object {
    /**
      * The canned ACL to apply to the bucket.
      */
    var ACL: js.UndefOr[BucketCannedACL] = js.undefined
    var Bucket: BucketName
    var CreateBucketConfiguration: js.UndefOr[CreateBucketConfiguration] = js.undefined
    /**
      * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
      */
    var GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined
    /**
      * Allows grantee to list the objects in the bucket.
      */
    var GrantRead: js.UndefOr[GrantRead] = js.undefined
    /**
      * Allows grantee to read the bucket ACL.
      */
    var GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined
    /**
      * Allows grantee to create, overwrite, and delete any object in the bucket.
      */
    var GrantWrite: js.UndefOr[GrantWrite] = js.undefined
    /**
      * Allows grantee to write the ACL for the applicable bucket.
      */
    var GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined
    /**
      * Specifies whether you want S3 Object Lock to be enabled for the new bucket.
      */
    var ObjectLockEnabledForBucket: js.UndefOr[ObjectLockEnabledForBucket] = js.undefined
  }
  
  trait CreateMultipartUploadOutput extends js.Object {
    /**
      * Date when multipart upload will become eligible for abort operation by lifecycle.
      */
    var AbortDate: js.UndefOr[AbortDate] = js.undefined
    /**
      * Id of the lifecycle rule that makes a multipart upload eligible for abort operation.
      */
    var AbortRuleId: js.UndefOr[AbortRuleId] = js.undefined
    /**
      * Name of the bucket to which the multipart upload was initiated.
      */
    var Bucket: js.UndefOr[BucketName] = js.undefined
    /**
      * Object key for which the multipart upload was initiated.
      */
    var Key: js.UndefOr[ObjectKey] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    /**
      * ID for the initiated multipart upload.
      */
    var UploadId: js.UndefOr[MultipartUploadId] = js.undefined
  }
  
  trait CreateMultipartUploadRequest extends js.Object {
    /**
      * The canned ACL to apply to the object.
      */
    var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
    var Bucket: BucketName
    /**
      * Specifies caching behavior along the request/reply chain.
      */
    var CacheControl: js.UndefOr[CacheControl] = js.undefined
    /**
      * Specifies presentational information for the object.
      */
    var ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
      */
    var ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined
    /**
      * The language the content is in.
      */
    var ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined
    /**
      * A standard MIME type describing the format of the object data.
      */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
      * The date and time at which the object is no longer cacheable.
      */
    var Expires: js.UndefOr[Expires] = js.undefined
    /**
      * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.
      */
    var GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined
    /**
      * Allows grantee to read the object data and its metadata.
      */
    var GrantRead: js.UndefOr[GrantRead] = js.undefined
    /**
      * Allows grantee to read the object ACL.
      */
    var GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined
    /**
      * Allows grantee to write the ACL for the applicable object.
      */
    var GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined
    var Key: ObjectKey
    /**
      * A map of metadata to store with the object in S3.
      */
    var Metadata: js.UndefOr[Metadata] = js.undefined
    /**
      * Specifies whether you want to apply a Legal Hold to the uploaded object.
      */
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
    /**
      * Specifies the Object Lock mode that you want to apply to the uploaded object.
      */
    var ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined
    /**
      * Specifies the date and time when you want the Object Lock to expire.
      */
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
      */
    var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. Documentation on configuring any of the officially supported AWS SDKs and CLI can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    /**
      * The type of storage to use for the object. Defaults to 'STANDARD'.
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The tag-set for the object. The tag-set must be encoded as URL Query parameters
      */
    var Tagging: js.UndefOr[TaggingHeader] = js.undefined
    /**
      * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
      */
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
  }
  
  trait DefaultRetention extends js.Object {
    /**
      * The number of days that you want to specify for the default retention period.
      */
    var Days: js.UndefOr[Days] = js.undefined
    /**
      * The default Object Lock retention mode you want to apply to new objects placed in the specified bucket.
      */
    var Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined
    /**
      * The number of years that you want to specify for the default retention period.
      */
    var Years: js.UndefOr[Years] = js.undefined
  }
  
  trait Delete extends js.Object {
    var Objects: ObjectIdentifierList
    /**
      * Element to enable quiet mode for the request. When you add this element, you must set its value to true.
      */
    var Quiet: js.UndefOr[Quiet] = js.undefined
  }
  
  trait DeleteBucketAnalyticsConfigurationRequest extends js.Object {
    /**
      * The name of the bucket from which an analytics configuration is deleted.
      */
    var Bucket: BucketName
    /**
      * The identifier used to represent an analytics configuration.
      */
    var Id: AnalyticsId
  }
  
  trait DeleteBucketCorsRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait DeleteBucketEncryptionRequest extends js.Object {
    /**
      * The name of the bucket containing the server-side encryption configuration to delete.
      */
    var Bucket: BucketName
  }
  
  trait DeleteBucketInventoryConfigurationRequest extends js.Object {
    /**
      * The name of the bucket containing the inventory configuration to delete.
      */
    var Bucket: BucketName
    /**
      * The ID used to identify the inventory configuration.
      */
    var Id: InventoryId
  }
  
  trait DeleteBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait DeleteBucketMetricsConfigurationRequest extends js.Object {
    /**
      * The name of the bucket containing the metrics configuration to delete.
      */
    var Bucket: BucketName
    /**
      * The ID used to identify the metrics configuration.
      */
    var Id: MetricsId
  }
  
  trait DeleteBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait DeleteBucketReplicationRequest extends js.Object {
    /**
      *  The bucket name.   It can take a while to propagate the deletion of a replication configuration to all Amazon S3 systems. 
      */
    var Bucket: BucketName
  }
  
  trait DeleteBucketRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait DeleteBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait DeleteBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait DeleteMarkerEntry extends js.Object {
    /**
      * Specifies whether the object is (true) or is not (false) the latest version of an object.
      */
    var IsLatest: js.UndefOr[IsLatest] = js.undefined
    /**
      * The object key.
      */
    var Key: js.UndefOr[ObjectKey] = js.undefined
    /**
      * Date and time the object was last modified.
      */
    var LastModified: js.UndefOr[LastModified] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
    /**
      * Version ID of an object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait DeleteMarkerReplication extends js.Object {
    /**
      * The status of the delete marker replication.   In the current implementation, Amazon S3 doesn't replicate the delete markers. The status must be Disabled.  
      */
    var Status: js.UndefOr[DeleteMarkerReplicationStatus] = js.undefined
  }
  
  trait DeleteObjectOutput extends js.Object {
    /**
      * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.
      */
    var DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * Returns the version ID of the delete marker created as a result of the DELETE operation.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait DeleteObjectRequest extends js.Object {
    var Bucket: BucketName
    /**
      * Indicates whether S3 Object Lock should bypass Governance-mode restrictions to process this operation.
      */
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined
    var Key: ObjectKey
    /**
      * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
      */
    var MFA: js.UndefOr[MFA] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * VersionId used to reference a specific version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait DeleteObjectTaggingOutput extends js.Object {
    /**
      * The versionId of the object the tag-set was removed from.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait DeleteObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    /**
      * The versionId of the object that the tag-set will be removed from.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait DeleteObjectsOutput extends js.Object {
    var Deleted: js.UndefOr[DeletedObjects] = js.undefined
    var Errors: js.UndefOr[Errors] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  }
  
  trait DeleteObjectsRequest extends js.Object {
    var Bucket: BucketName
    /**
      * Specifies whether you want to delete this object even if it has a Governance-type Object Lock in place. You must have sufficient permissions to perform this operation.
      */
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined
    var Delete: Delete
    /**
      * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
      */
    var MFA: js.UndefOr[MFA] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  }
  
  trait DeletePublicAccessBlockRequest extends js.Object {
    /**
      * The Amazon S3 bucket whose PublicAccessBlock configuration you want to delete. 
      */
    var Bucket: BucketName
  }
  
  trait DeletedObject extends js.Object {
    var DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined
    var DeleteMarkerVersionId: js.UndefOr[DeleteMarkerVersionId] = js.undefined
    var Key: js.UndefOr[ObjectKey] = js.undefined
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait Destination extends js.Object {
    /**
      * A container for information about access control for replicas.  Use this element only in a cross-account scenario where source and destination bucket owners are not the same to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. 
      */
    var AccessControlTranslation: js.UndefOr[AccessControlTranslation] = js.undefined
    /**
      * The account ID of the destination bucket. Currently, Amazon S3 verifies this value only if Access Control Translation is enabled.  In a cross-account scenario, if you change replica ownership to the AWS account that owns the destination bucket by adding the AccessControlTranslation element, this is the account ID of the owner of the destination bucket. 
      */
    var Account: js.UndefOr[AccountId] = js.undefined
    /**
      *  The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store replicas of the object identified by the rule.   If there are multiple rules in your replication configuration, all rules must specify the same bucket as the destination. A replication configuration can replicate objects to only one destination bucket. 
      */
    var Bucket: BucketName
    /**
      * A container that provides information about encryption. If SourceSelectionCriteria is specified, you must specify this element. 
      */
    var EncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
    /**
      *  The class of storage used to store the object. By default Amazon S3 uses storage class of the source object when creating a replica. 
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
  }
  
  trait Encryption extends js.Object {
    /**
      * The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).
      */
    var EncryptionType: ServerSideEncryption
    /**
      * If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.
      */
    var KMSContext: js.UndefOr[KMSContext] = js.undefined
    /**
      * If the encryption type is aws:kms, this optional value specifies the AWS KMS key ID to use for encryption of job results.
      */
    var KMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
  }
  
  trait EncryptionConfiguration extends js.Object {
    /**
      * The ID of the AWS KMS key for the AWS Region where the destination bucket resides. Amazon S3 uses this key to encrypt the replica object. 
      */
    var ReplicaKmsKeyID: js.UndefOr[ReplicaKmsKeyID] = js.undefined
  }
  
  trait EndEvent extends js.Object
  
  trait Error extends js.Object {
    var Code: js.UndefOr[Code] = js.undefined
    var Key: js.UndefOr[ObjectKey] = js.undefined
    var Message: js.UndefOr[Message] = js.undefined
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait ErrorDocument extends js.Object {
    /**
      * The object key name to use when a 4XX class error occurs.
      */
    var Key: ObjectKey
  }
  
  trait FilterRule extends js.Object {
    /**
      * The object key name prefix or suffix identifying one or more objects to which the filtering rule applies. The maximum prefix length is 1,024 characters. Overlapping prefixes and suffixes are not supported. For more information, see Configuring Event Notifications in the Amazon Simple Storage Service Developer Guide.
      */
    var Name: js.UndefOr[FilterRuleName] = js.undefined
    var Value: js.UndefOr[FilterRuleValue] = js.undefined
  }
  
  trait GetBucketAccelerateConfigurationOutput extends js.Object {
    /**
      * The accelerate configuration of the bucket.
      */
    var Status: js.UndefOr[BucketAccelerateStatus] = js.undefined
  }
  
  trait GetBucketAccelerateConfigurationRequest extends js.Object {
    /**
      * Name of the bucket for which the accelerate configuration is retrieved.
      */
    var Bucket: BucketName
  }
  
  trait GetBucketAclOutput extends js.Object {
    /**
      * A list of grants.
      */
    var Grants: js.UndefOr[Grants] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
  }
  
  trait GetBucketAclRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketAnalyticsConfigurationOutput extends js.Object {
    /**
      * The configuration and any analyses for the analytics filter.
      */
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfiguration] = js.undefined
  }
  
  trait GetBucketAnalyticsConfigurationRequest extends js.Object {
    /**
      * The name of the bucket from which an analytics configuration is retrieved.
      */
    var Bucket: BucketName
    /**
      * The identifier used to represent an analytics configuration.
      */
    var Id: AnalyticsId
  }
  
  trait GetBucketCorsOutput extends js.Object {
    var CORSRules: js.UndefOr[CORSRules] = js.undefined
  }
  
  trait GetBucketCorsRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketEncryptionOutput extends js.Object {
    var ServerSideEncryptionConfiguration: js.UndefOr[ServerSideEncryptionConfiguration] = js.undefined
  }
  
  trait GetBucketEncryptionRequest extends js.Object {
    /**
      * The name of the bucket from which the server-side encryption configuration is retrieved.
      */
    var Bucket: BucketName
  }
  
  trait GetBucketInventoryConfigurationOutput extends js.Object {
    /**
      * Specifies the inventory configuration.
      */
    var InventoryConfiguration: js.UndefOr[InventoryConfiguration] = js.undefined
  }
  
  trait GetBucketInventoryConfigurationRequest extends js.Object {
    /**
      * The name of the bucket containing the inventory configuration to retrieve.
      */
    var Bucket: BucketName
    /**
      * The ID used to identify the inventory configuration.
      */
    var Id: InventoryId
  }
  
  trait GetBucketLifecycleConfigurationOutput extends js.Object {
    var Rules: js.UndefOr[LifecycleRules] = js.undefined
  }
  
  trait GetBucketLifecycleConfigurationRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketLifecycleOutput extends js.Object {
    var Rules: js.UndefOr[Rules] = js.undefined
  }
  
  trait GetBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketLocationOutput extends js.Object {
    var LocationConstraint: js.UndefOr[BucketLocationConstraint] = js.undefined
  }
  
  trait GetBucketLocationRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketLoggingOutput extends js.Object {
    var LoggingEnabled: js.UndefOr[LoggingEnabled] = js.undefined
  }
  
  trait GetBucketLoggingRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketMetricsConfigurationOutput extends js.Object {
    /**
      * Specifies the metrics configuration.
      */
    var MetricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined
  }
  
  trait GetBucketMetricsConfigurationRequest extends js.Object {
    /**
      * The name of the bucket containing the metrics configuration to retrieve.
      */
    var Bucket: BucketName
    /**
      * The ID used to identify the metrics configuration.
      */
    var Id: MetricsId
  }
  
  trait GetBucketNotificationConfigurationRequest extends js.Object {
    /**
      * Name of the bucket to get the notification configuration for.
      */
    var Bucket: BucketName
  }
  
  trait GetBucketPolicyOutput extends js.Object {
    /**
      * The bucket policy as a JSON document.
      */
    var Policy: js.UndefOr[Policy] = js.undefined
  }
  
  trait GetBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketPolicyStatusOutput extends js.Object {
    /**
      * The policy status for the specified bucket.
      */
    var PolicyStatus: js.UndefOr[PolicyStatus] = js.undefined
  }
  
  trait GetBucketPolicyStatusRequest extends js.Object {
    /**
      * The name of the Amazon S3 bucket whose policy status you want to retrieve.
      */
    var Bucket: BucketName
  }
  
  trait GetBucketReplicationOutput extends js.Object {
    var ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
  }
  
  trait GetBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketRequestPaymentOutput extends js.Object {
    /**
      * Specifies who pays for the download and request fees.
      */
    var Payer: js.UndefOr[Payer] = js.undefined
  }
  
  trait GetBucketRequestPaymentRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketTaggingOutput extends js.Object {
    var TagSet: TagSet
  }
  
  trait GetBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketVersioningOutput extends js.Object {
    /**
      * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
      */
    var MFADelete: js.UndefOr[MFADeleteStatus] = js.undefined
    /**
      * The versioning state of the bucket.
      */
    var Status: js.UndefOr[BucketVersioningStatus] = js.undefined
  }
  
  trait GetBucketVersioningRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetBucketWebsiteOutput extends js.Object {
    var ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined
    var IndexDocument: js.UndefOr[IndexDocument] = js.undefined
    var RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined
    var RoutingRules: js.UndefOr[RoutingRules] = js.undefined
  }
  
  trait GetBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait GetObjectAclOutput extends js.Object {
    /**
      * A list of grants.
      */
    var Grants: js.UndefOr[Grants] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  }
  
  trait GetObjectAclRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * VersionId used to reference a specific version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait GetObjectLegalHoldOutput extends js.Object {
    /**
      * The current Legal Hold status for the specified object.
      */
    var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined
  }
  
  trait GetObjectLegalHoldRequest extends js.Object {
    /**
      * The bucket containing the object whose Legal Hold status you want to retrieve.
      */
    var Bucket: BucketName
    /**
      * The key name for the object whose Legal Hold status you want to retrieve.
      */
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * The version ID of the object whose Legal Hold status you want to retrieve.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait GetObjectLockConfigurationOutput extends js.Object {
    /**
      * The specified bucket's Object Lock configuration.
      */
    var ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] = js.undefined
  }
  
  trait GetObjectLockConfigurationRequest extends js.Object {
    /**
      * The bucket whose Object Lock configuration you want to retrieve.
      */
    var Bucket: BucketName
  }
  
  trait GetObjectOutput extends js.Object {
    var AcceptRanges: js.UndefOr[AcceptRanges] = js.undefined
    /**
      * Object data.
      */
    var Body: js.UndefOr[Body] = js.undefined
    /**
      * Specifies caching behavior along the request/reply chain.
      */
    var CacheControl: js.UndefOr[CacheControl] = js.undefined
    /**
      * Specifies presentational information for the object.
      */
    var ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
      */
    var ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined
    /**
      * The language the content is in.
      */
    var ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined
    /**
      * Size of the body in bytes.
      */
    var ContentLength: js.UndefOr[ContentLength] = js.undefined
    /**
      * The portion of the object returned in the response.
      */
    var ContentRange: js.UndefOr[ContentRange] = js.undefined
    /**
      * A standard MIME type describing the format of the object data.
      */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
      * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
      */
    var DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined
    /**
      * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL
      */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
      * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
      */
    var Expiration: js.UndefOr[Expiration] = js.undefined
    /**
      * The date and time at which the object is no longer cacheable.
      */
    var Expires: js.UndefOr[Expires] = js.undefined
    /**
      * Last modified date of the object
      */
    var LastModified: js.UndefOr[LastModified] = js.undefined
    /**
      * A map of metadata to store with the object in S3.
      */
    var Metadata: js.UndefOr[Metadata] = js.undefined
    /**
      * This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
      */
    var MissingMeta: js.UndefOr[MissingMeta] = js.undefined
    /**
      * Indicates whether this object has an active legal hold. This field is only returned if you have permission to view an object's legal hold status.
      */
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
    /**
      * The Object Lock mode currently in place for this object.
      */
    var ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined
    /**
      * The date and time when this object's Object Lock will expire.
      */
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined
    /**
      * The count of parts this object has.
      */
    var PartsCount: js.UndefOr[PartsCount] = js.undefined
    var ReplicationStatus: js.UndefOr[ReplicationStatus] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * Provides information about object restoration operation and expiration time of the restored object copy.
      */
    var Restore: js.UndefOr[Restore] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The number of tags, if any, on the object.
      */
    var TagCount: js.UndefOr[TagCount] = js.undefined
    /**
      * Version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    /**
      * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
      */
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
  }
  
  trait GetObjectRequest extends js.Object {
    var Bucket: BucketName
    /**
      * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
      */
    var IfMatch: js.UndefOr[IfMatch] = js.undefined
    /**
      * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
      */
    var IfModifiedSince: js.UndefOr[IfModifiedSince] = js.undefined
    /**
      * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
      */
    var IfNoneMatch: js.UndefOr[IfNoneMatch] = js.undefined
    /**
      * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
      */
    var IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince] = js.undefined
    var Key: ObjectKey
    /**
      * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' GET request for the part specified. Useful for downloading just a part of an object.
      */
    var PartNumber: js.UndefOr[PartNumber] = js.undefined
    /**
      * Downloads the specified range bytes of an object. For more information about the HTTP Range header, go to http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.
      */
    var Range: js.UndefOr[Range] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * Sets the Cache-Control header of the response.
      */
    var ResponseCacheControl: js.UndefOr[ResponseCacheControl] = js.undefined
    /**
      * Sets the Content-Disposition header of the response
      */
    var ResponseContentDisposition: js.UndefOr[ResponseContentDisposition] = js.undefined
    /**
      * Sets the Content-Encoding header of the response.
      */
    var ResponseContentEncoding: js.UndefOr[ResponseContentEncoding] = js.undefined
    /**
      * Sets the Content-Language header of the response.
      */
    var ResponseContentLanguage: js.UndefOr[ResponseContentLanguage] = js.undefined
    /**
      * Sets the Content-Type header of the response.
      */
    var ResponseContentType: js.UndefOr[ResponseContentType] = js.undefined
    /**
      * Sets the Expires header of the response.
      */
    var ResponseExpires: js.UndefOr[ResponseExpires] = js.undefined
    /**
      * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
      */
    var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * VersionId used to reference a specific version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait GetObjectRetentionOutput extends js.Object {
    /**
      * The container element for an object's retention settings.
      */
    var Retention: js.UndefOr[ObjectLockRetention] = js.undefined
  }
  
  trait GetObjectRetentionRequest extends js.Object {
    /**
      * The bucket containing the object whose retention settings you want to retrieve.
      */
    var Bucket: BucketName
    /**
      * The key name for the object whose retention settings you want to retrieve.
      */
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * The version ID for the object whose retention settings you want to retrieve.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait GetObjectTaggingOutput extends js.Object {
    var TagSet: TagSet
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait GetObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait GetObjectTorrentOutput extends js.Object {
    var Body: js.UndefOr[Body] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  }
  
  trait GetObjectTorrentRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  }
  
  trait GetPublicAccessBlockOutput extends js.Object {
    /**
      * The PublicAccessBlock configuration currently in effect for this Amazon S3 bucket.
      */
    var PublicAccessBlockConfiguration: js.UndefOr[PublicAccessBlockConfiguration] = js.undefined
  }
  
  trait GetPublicAccessBlockRequest extends js.Object {
    /**
      * The name of the Amazon S3 bucket whose PublicAccessBlock configuration you want to retrieve. 
      */
    var Bucket: BucketName
  }
  
  trait GlacierJobParameters extends js.Object {
    /**
      * Glacier retrieval tier at which the restore will be processed.
      */
    var Tier: Tier
  }
  
  trait Grant extends js.Object {
    var Grantee: js.UndefOr[Grantee] = js.undefined
    /**
      * Specifies the permission given to the grantee.
      */
    var Permission: js.UndefOr[Permission] = js.undefined
  }
  
  trait Grantee extends js.Object {
    /**
      * Screen name of the grantee.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * Email address of the grantee.
      */
    var EmailAddress: js.UndefOr[EmailAddress] = js.undefined
    /**
      * The canonical user ID of the grantee.
      */
    var ID: js.UndefOr[ID] = js.undefined
    /**
      * Type of grantee
      */
    var Type: Type
    /**
      * URI of the grantee group.
      */
    var URI: js.UndefOr[URI] = js.undefined
  }
  
  trait HeadBucketRequest extends js.Object {
    var Bucket: BucketName
  }
  
  trait HeadObjectOutput extends js.Object {
    var AcceptRanges: js.UndefOr[AcceptRanges] = js.undefined
    /**
      * Specifies caching behavior along the request/reply chain.
      */
    var CacheControl: js.UndefOr[CacheControl] = js.undefined
    /**
      * Specifies presentational information for the object.
      */
    var ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
      */
    var ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined
    /**
      * The language the content is in.
      */
    var ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined
    /**
      * Size of the body in bytes.
      */
    var ContentLength: js.UndefOr[ContentLength] = js.undefined
    /**
      * A standard MIME type describing the format of the object data.
      */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
      * Specifies whether the object retrieved was (true) or was not (false) a Delete Marker. If false, this response header does not appear in the response.
      */
    var DeleteMarker: js.UndefOr[DeleteMarker] = js.undefined
    /**
      * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL
      */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
      * If the object expiration is configured (see PUT Bucket lifecycle), the response includes this header. It includes the expiry-date and rule-id key value pairs providing object expiration information. The value of the rule-id is URL encoded.
      */
    var Expiration: js.UndefOr[Expiration] = js.undefined
    /**
      * The date and time at which the object is no longer cacheable.
      */
    var Expires: js.UndefOr[Expires] = js.undefined
    /**
      * Last modified date of the object
      */
    var LastModified: js.UndefOr[LastModified] = js.undefined
    /**
      * A map of metadata to store with the object in S3.
      */
    var Metadata: js.UndefOr[Metadata] = js.undefined
    /**
      * This is set to the number of metadata entries not returned in x-amz-meta headers. This can happen if you create metadata using an API like SOAP that supports more flexible metadata than the REST API. For example, using SOAP, you can create metadata whose values are not legal HTTP headers.
      */
    var MissingMeta: js.UndefOr[MissingMeta] = js.undefined
    /**
      * The Legal Hold status for the specified object.
      */
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
    /**
      * The Object Lock mode currently in place for this object.
      */
    var ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined
    /**
      * The date and time when this object's Object Lock will expire.
      */
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined
    /**
      * The count of parts this object has.
      */
    var PartsCount: js.UndefOr[PartsCount] = js.undefined
    var ReplicationStatus: js.UndefOr[ReplicationStatus] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * Provides information about object restoration operation and expiration time of the restored object copy.
      */
    var Restore: js.UndefOr[Restore] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * Version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
    /**
      * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
      */
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
  }
  
  trait HeadObjectRequest extends js.Object {
    var Bucket: BucketName
    /**
      * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
      */
    var IfMatch: js.UndefOr[IfMatch] = js.undefined
    /**
      * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
      */
    var IfModifiedSince: js.UndefOr[IfModifiedSince] = js.undefined
    /**
      * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
      */
    var IfNoneMatch: js.UndefOr[IfNoneMatch] = js.undefined
    /**
      * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
      */
    var IfUnmodifiedSince: js.UndefOr[IfUnmodifiedSince] = js.undefined
    var Key: ObjectKey
    /**
      * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' HEAD request for the part specified. Useful querying about the size of the part and the number of parts in this object.
      */
    var PartNumber: js.UndefOr[PartNumber] = js.undefined
    /**
      * Downloads the specified range bytes of an object. For more information about the HTTP Range header, go to http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.
      */
    var Range: js.UndefOr[Range] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
      */
    var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * VersionId used to reference a specific version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait IndexDocument extends js.Object {
    /**
      * A suffix that is appended to a request that is for a directory on the website endpoint (e.g. if the suffix is index.html and you make a request to samplebucket/images/ the data that is returned will be for the object with the key name images/index.html) The suffix must not be empty and must not include a slash character.
      */
    var Suffix: Suffix
  }
  
  trait Initiator extends js.Object {
    /**
      * Name of the Principal.
      */
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    /**
      * If the principal is an AWS account, it provides the Canonical User ID. If the principal is an IAM User, it provides a user ARN value.
      */
    var ID: js.UndefOr[ID] = js.undefined
  }
  
  trait InputSerialization extends js.Object {
    /**
      * Describes the serialization of a CSV-encoded object.
      */
    var CSV: js.UndefOr[CSVInput] = js.undefined
    /**
      * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
      */
    var CompressionType: js.UndefOr[CompressionType] = js.undefined
    /**
      * Specifies JSON as object's input serialization format.
      */
    var JSON: js.UndefOr[JSONInput] = js.undefined
    /**
      * Specifies Parquet as object's input serialization format.
      */
    var Parquet: js.UndefOr[ParquetInput] = js.undefined
  }
  
  trait InventoryConfiguration extends js.Object {
    /**
      * Contains information about where to publish the inventory results.
      */
    var Destination: InventoryDestination
    /**
      * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
      */
    var Filter: js.UndefOr[InventoryFilter] = js.undefined
    /**
      * The ID used to identify the inventory configuration.
      */
    var Id: InventoryId
    /**
      * Specifies which object version(s) to included in the inventory results.
      */
    var IncludedObjectVersions: InventoryIncludedObjectVersions
    /**
      * Specifies whether the inventory is enabled or disabled.
      */
    var IsEnabled: IsEnabled
    /**
      * Contains the optional fields that are included in the inventory results.
      */
    var OptionalFields: js.UndefOr[InventoryOptionalFields] = js.undefined
    /**
      * Specifies the schedule for generating inventory results.
      */
    var Schedule: InventorySchedule
  }
  
  trait InventoryDestination extends js.Object {
    /**
      * Contains the bucket name, file format, bucket owner (optional), and prefix (optional) where inventory results are published.
      */
    var S3BucketDestination: InventoryS3BucketDestination
  }
  
  trait InventoryEncryption extends js.Object {
    /**
      * Specifies the use of SSE-KMS to encrypt delivered Inventory reports.
      */
    var SSEKMS: js.UndefOr[SSEKMS] = js.undefined
    /**
      * Specifies the use of SSE-S3 to encrypt delivered Inventory reports.
      */
    var SSES3: js.UndefOr[SSES3] = js.undefined
  }
  
  trait InventoryFilter extends js.Object {
    /**
      * The prefix that an object must have to be included in the inventory results.
      */
    var Prefix: Prefix
  }
  
  trait InventoryS3BucketDestination extends js.Object {
    /**
      * The ID of the account that owns the destination bucket.
      */
    var AccountId: js.UndefOr[AccountId] = js.undefined
    /**
      * The Amazon resource name (ARN) of the bucket where inventory results will be published.
      */
    var Bucket: BucketName
    /**
      * Contains the type of server-side encryption used to encrypt the inventory results.
      */
    var Encryption: js.UndefOr[InventoryEncryption] = js.undefined
    /**
      * Specifies the output format of the inventory results.
      */
    var Format: InventoryFormat
    /**
      * The prefix that is prepended to all inventory results.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  trait InventorySchedule extends js.Object {
    /**
      * Specifies how frequently inventory results are produced.
      */
    var Frequency: InventoryFrequency
  }
  
  trait JSONInput extends js.Object {
    /**
      * The type of JSON. Valid values: Document, Lines.
      */
    var Type: js.UndefOr[JSONType] = js.undefined
  }
  
  trait JSONOutput extends js.Object {
    /**
      * The value used to separate individual records in the output.
      */
    var RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined
  }
  
  trait LambdaFunctionConfiguration extends js.Object {
    var Events: EventList
    var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
    var Id: js.UndefOr[NotificationId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Lambda cloud function that Amazon S3 can invoke when it detects events of the specified type.
      */
    var LambdaFunctionArn: LambdaFunctionArn
  }
  
  trait LifecycleConfiguration extends js.Object {
    var Rules: Rules
  }
  
  trait LifecycleExpiration extends js.Object {
    /**
      * Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.
      */
    var Date: js.UndefOr[_Date] = js.undefined
    /**
      * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.
      */
    var Days: js.UndefOr[Days] = js.undefined
    /**
      * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to true, the delete marker will be expired; if set to false the policy takes no action. This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
      */
    var ExpiredObjectDeleteMarker: js.UndefOr[ExpiredObjectDeleteMarker] = js.undefined
  }
  
  trait LifecycleRule extends js.Object {
    var AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined
    var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
    var Filter: js.UndefOr[LifecycleRuleFilter] = js.undefined
    /**
      * Unique identifier for the rule. The value cannot be longer than 255 characters.
      */
    var ID: js.UndefOr[ID] = js.undefined
    var NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined
    var NoncurrentVersionTransitions: js.UndefOr[NoncurrentVersionTransitionList] = js.undefined
    /**
      * Prefix identifying one or more objects to which the rule applies. This is deprecated; use Filter instead.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
      */
    var Status: ExpirationStatus
    var Transitions: js.UndefOr[TransitionList] = js.undefined
  }
  
  trait LifecycleRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * All of these tags must exist in the object's tag set in order for the rule to apply.
      */
    var Tags: js.UndefOr[TagSet] = js.undefined
  }
  
  trait LifecycleRuleFilter extends js.Object {
    var And: js.UndefOr[LifecycleRuleAndOperator] = js.undefined
    /**
      * Prefix identifying one or more objects to which the rule applies.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * This tag must exist in the object's tag set in order for the rule to apply.
      */
    var Tag: js.UndefOr[Tag] = js.undefined
  }
  
  trait ListBucketAnalyticsConfigurationsOutput extends js.Object {
    /**
      * The list of analytics configurations for a bucket.
      */
    var AnalyticsConfigurationList: js.UndefOr[AnalyticsConfigurationList] = js.undefined
    /**
      * The ContinuationToken that represents where this request began.
      */
    var ContinuationToken: js.UndefOr[Token] = js.undefined
    /**
      * Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
      */
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    /**
      * NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.
      */
    var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListBucketAnalyticsConfigurationsRequest extends js.Object {
    /**
      * The name of the bucket from which analytics configurations are retrieved.
      */
    var Bucket: BucketName
    /**
      * The ContinuationToken that represents a placeholder from where this request should begin.
      */
    var ContinuationToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListBucketInventoryConfigurationsOutput extends js.Object {
    /**
      * If sent in the request, the marker that is used as a starting point for this inventory configuration list response.
      */
    var ContinuationToken: js.UndefOr[Token] = js.undefined
    /**
      * The list of inventory configurations for a bucket.
      */
    var InventoryConfigurationList: js.UndefOr[InventoryConfigurationList] = js.undefined
    /**
      * Indicates whether the returned list of inventory configurations is truncated in this response. A value of true indicates that the list is truncated.
      */
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    /**
      * The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.
      */
    var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListBucketInventoryConfigurationsRequest extends js.Object {
    /**
      * The name of the bucket containing the inventory configurations to retrieve.
      */
    var Bucket: BucketName
    /**
      * The marker used to continue an inventory configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
      */
    var ContinuationToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListBucketMetricsConfigurationsOutput extends js.Object {
    /**
      * The marker that is used as a starting point for this metrics configuration list response. This value is present if it was sent in the request.
      */
    var ContinuationToken: js.UndefOr[Token] = js.undefined
    /**
      * Indicates whether the returned list of metrics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.
      */
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    /**
      * The list of metrics configurations for a bucket.
      */
    var MetricsConfigurationList: js.UndefOr[MetricsConfigurationList] = js.undefined
    /**
      * The marker used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
      */
    var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListBucketMetricsConfigurationsRequest extends js.Object {
    /**
      * The name of the bucket containing the metrics configurations to retrieve.
      */
    var Bucket: BucketName
    /**
      * The marker that is used to continue a metrics configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
      */
    var ContinuationToken: js.UndefOr[Token] = js.undefined
  }
  
  trait ListBucketsOutput extends js.Object {
    var Buckets: js.UndefOr[Buckets] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
  }
  
  trait ListMultipartUploadsOutput extends js.Object {
    /**
      * Name of the bucket to which the multipart upload was initiated.
      */
    var Bucket: js.UndefOr[BucketName] = js.undefined
    var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
    var Delimiter: js.UndefOr[Delimiter] = js.undefined
    /**
      * Encoding type used by Amazon S3 to encode object keys in the response.
      */
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * Indicates whether the returned list of multipart uploads is truncated. A value of true indicates that the list was truncated. The list can be truncated if the number of multipart uploads exceeds the limit allowed or specified by max uploads.
      */
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    /**
      * The key at or after which the listing began.
      */
    var KeyMarker: js.UndefOr[KeyMarker] = js.undefined
    /**
      * Maximum number of multipart uploads that could have been included in the response.
      */
    var MaxUploads: js.UndefOr[MaxUploads] = js.undefined
    /**
      * When a list is truncated, this element specifies the value that should be used for the key-marker request parameter in a subsequent request.
      */
    var NextKeyMarker: js.UndefOr[NextKeyMarker] = js.undefined
    /**
      * When a list is truncated, this element specifies the value that should be used for the upload-id-marker request parameter in a subsequent request.
      */
    var NextUploadIdMarker: js.UndefOr[NextUploadIdMarker] = js.undefined
    /**
      * When a prefix is provided in the request, this field contains the specified prefix. The result contains only keys starting with the specified prefix.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * Upload ID after which listing began.
      */
    var UploadIdMarker: js.UndefOr[UploadIdMarker] = js.undefined
    var Uploads: js.UndefOr[MultipartUploadList] = js.undefined
  }
  
  trait ListMultipartUploadsRequest extends js.Object {
    var Bucket: BucketName
    /**
      * Character you use to group keys.
      */
    var Delimiter: js.UndefOr[Delimiter] = js.undefined
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * Together with upload-id-marker, this parameter specifies the multipart upload after which listing should begin.
      */
    var KeyMarker: js.UndefOr[KeyMarker] = js.undefined
    /**
      * Sets the maximum number of multipart uploads, from 1 to 1,000, to return in the response body. 1,000 is the maximum number of uploads that can be returned in a response.
      */
    var MaxUploads: js.UndefOr[MaxUploads] = js.undefined
    /**
      * Lists in-progress uploads only for those keys that begin with the specified prefix.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * Together with key-marker, specifies the multipart upload after which listing should begin. If key-marker is not specified, the upload-id-marker parameter is ignored.
      */
    var UploadIdMarker: js.UndefOr[UploadIdMarker] = js.undefined
  }
  
  trait ListObjectVersionsOutput extends js.Object {
    var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
    var DeleteMarkers: js.UndefOr[DeleteMarkers] = js.undefined
    var Delimiter: js.UndefOr[Delimiter] = js.undefined
    /**
      * Encoding type used by Amazon S3 to encode object keys in the response.
      */
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria. If your results were truncated, you can make a follow-up paginated request using the NextKeyMarker and NextVersionIdMarker response parameters as a starting place in another request to return the rest of the results.
      */
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    /**
      * Marks the last Key returned in a truncated response.
      */
    var KeyMarker: js.UndefOr[KeyMarker] = js.undefined
    var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
    var Name: js.UndefOr[BucketName] = js.undefined
    /**
      * Use this value for the key marker request parameter in a subsequent request.
      */
    var NextKeyMarker: js.UndefOr[NextKeyMarker] = js.undefined
    /**
      * Use this value for the next version id marker parameter in a subsequent request.
      */
    var NextVersionIdMarker: js.UndefOr[NextVersionIdMarker] = js.undefined
    var Prefix: js.UndefOr[Prefix] = js.undefined
    var VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined
    var Versions: js.UndefOr[ObjectVersionList] = js.undefined
  }
  
  trait ListObjectVersionsRequest extends js.Object {
    var Bucket: BucketName
    /**
      * A delimiter is a character you use to group keys.
      */
    var Delimiter: js.UndefOr[Delimiter] = js.undefined
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * Specifies the key to start with when listing objects in a bucket.
      */
    var KeyMarker: js.UndefOr[KeyMarker] = js.undefined
    /**
      * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
      */
    var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
    /**
      * Limits the response to keys that begin with the specified prefix.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * Specifies the object version you want to start listing from.
      */
    var VersionIdMarker: js.UndefOr[VersionIdMarker] = js.undefined
  }
  
  trait ListObjectsOutput extends js.Object {
    var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
    var Contents: js.UndefOr[ObjectList] = js.undefined
    var Delimiter: js.UndefOr[Delimiter] = js.undefined
    /**
      * Encoding type used by Amazon S3 to encode object keys in the response.
      */
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria.
      */
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    var Marker: js.UndefOr[Marker] = js.undefined
    var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
    var Name: js.UndefOr[BucketName] = js.undefined
    /**
      * When response is truncated (the IsTruncated element value in the response is true), you can use the key name in this field as marker in the subsequent request to get next set of objects. Amazon S3 lists objects in alphabetical order Note: This element is returned only if you have delimiter request parameter specified. If response does not include the NextMaker and it is truncated, you can use the value of the last Key in the response as the marker in the subsequent request to get the next set of object keys.
      */
    var NextMarker: js.UndefOr[NextMarker] = js.undefined
    var Prefix: js.UndefOr[Prefix] = js.undefined
  }
  
  trait ListObjectsRequest extends js.Object {
    var Bucket: BucketName
    /**
      * A delimiter is a character you use to group keys.
      */
    var Delimiter: js.UndefOr[Delimiter] = js.undefined
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * Specifies the key to start with when listing objects in a bucket.
      */
    var Marker: js.UndefOr[Marker] = js.undefined
    /**
      * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
      */
    var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
    /**
      * Limits the response to keys that begin with the specified prefix.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * Confirms that the requester knows that she or he will be charged for the list objects request. Bucket owners need not specify this parameter in their requests.
      */
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  }
  
  trait ListObjectsV2Output extends js.Object {
    /**
      * CommonPrefixes contains all (if there are any) keys between Prefix and the next occurrence of the string specified by delimiter
      */
    var CommonPrefixes: js.UndefOr[CommonPrefixList] = js.undefined
    /**
      * Metadata about each object returned.
      */
    var Contents: js.UndefOr[ObjectList] = js.undefined
    /**
      * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key
      */
    var ContinuationToken: js.UndefOr[Token] = js.undefined
    /**
      * A delimiter is a character you use to group keys.
      */
    var Delimiter: js.UndefOr[Delimiter] = js.undefined
    /**
      * Encoding type used by Amazon S3 to encode object keys in the response.
      */
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * A flag that indicates whether or not Amazon S3 returned all of the results that satisfied the search criteria.
      */
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    /**
      * KeyCount is the number of keys returned with this request. KeyCount will always be less than equals to MaxKeys field. Say you ask for 50 keys, your result will include less than equals 50 keys 
      */
    var KeyCount: js.UndefOr[KeyCount] = js.undefined
    /**
      * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
      */
    var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
    /**
      * Name of the bucket to list.
      */
    var Name: js.UndefOr[BucketName] = js.undefined
    /**
      * NextContinuationToken is sent when isTruncated is true which means there are more keys in the bucket that can be listed. The next list requests to Amazon S3 can be continued with this NextContinuationToken. NextContinuationToken is obfuscated and is not a real key
      */
    var NextContinuationToken: js.UndefOr[NextToken] = js.undefined
    /**
      * Limits the response to keys that begin with the specified prefix.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket
      */
    var StartAfter: js.UndefOr[StartAfter] = js.undefined
  }
  
  trait ListObjectsV2Request extends js.Object {
    /**
      * Name of the bucket to list.
      */
    var Bucket: BucketName
    /**
      * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a token. ContinuationToken is obfuscated and is not a real key
      */
    var ContinuationToken: js.UndefOr[Token] = js.undefined
    /**
      * A delimiter is a character you use to group keys.
      */
    var Delimiter: js.UndefOr[Delimiter] = js.undefined
    /**
      * Encoding type used by Amazon S3 to encode object keys in the response.
      */
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * The owner field is not present in listV2 by default, if you want to return owner field with each key in the result then set the fetch owner field to true
      */
    var FetchOwner: js.UndefOr[FetchOwner] = js.undefined
    /**
      * Sets the maximum number of keys returned in the response. The response might contain fewer keys but will never contain more.
      */
    var MaxKeys: js.UndefOr[MaxKeys] = js.undefined
    /**
      * Limits the response to keys that begin with the specified prefix.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * Confirms that the requester knows that she or he will be charged for the list objects request in V2 style. Bucket owners need not specify this parameter in their requests.
      */
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this specified key. StartAfter can be any key in the bucket
      */
    var StartAfter: js.UndefOr[StartAfter] = js.undefined
  }
  
  trait ListPartsOutput extends js.Object {
    /**
      * Date when multipart upload will become eligible for abort operation by lifecycle.
      */
    var AbortDate: js.UndefOr[AbortDate] = js.undefined
    /**
      * Id of the lifecycle rule that makes a multipart upload eligible for abort operation.
      */
    var AbortRuleId: js.UndefOr[AbortRuleId] = js.undefined
    /**
      * Name of the bucket to which the multipart upload was initiated.
      */
    var Bucket: js.UndefOr[BucketName] = js.undefined
    /**
      * Identifies who initiated the multipart upload.
      */
    var Initiator: js.UndefOr[Initiator] = js.undefined
    /**
      * Indicates whether the returned list of parts is truncated.
      */
    var IsTruncated: js.UndefOr[IsTruncated] = js.undefined
    /**
      * Object key for which the multipart upload was initiated.
      */
    var Key: js.UndefOr[ObjectKey] = js.undefined
    /**
      * Maximum number of parts that were allowed in the response.
      */
    var MaxParts: js.UndefOr[MaxParts] = js.undefined
    /**
      * When a list is truncated, this element specifies the last part in the list, as well as the value to use for the part-number-marker request parameter in a subsequent request.
      */
    var NextPartNumberMarker: js.UndefOr[NextPartNumberMarker] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
    /**
      * Part number after which listing begins.
      */
    var PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined
    var Parts: js.UndefOr[Parts] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * The class of storage used to store the object.
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * Upload ID identifying the multipart upload whose parts are being listed.
      */
    var UploadId: js.UndefOr[MultipartUploadId] = js.undefined
  }
  
  trait ListPartsRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    /**
      * Sets the maximum number of parts to return.
      */
    var MaxParts: js.UndefOr[MaxParts] = js.undefined
    /**
      * Specifies the part after which listing should begin. Only parts with higher part numbers will be listed.
      */
    var PartNumberMarker: js.UndefOr[PartNumberMarker] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * Upload ID identifying the multipart upload whose parts are being listed.
      */
    var UploadId: MultipartUploadId
  }
  
  trait LoggingEnabled extends js.Object {
    /**
      * Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.
      */
    var TargetBucket: TargetBucket
    var TargetGrants: js.UndefOr[TargetGrants] = js.undefined
    /**
      * This element lets you specify a prefix for the keys that the log files will be stored under.
      */
    var TargetPrefix: TargetPrefix
  }
  
  @js.native
  class ManagedUpload protected () extends js.Object {
    /**
      * Creates a managed upload object with a set of configuration options.
      */
    def this(options: awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.ManagedUploadOptions) = this()
    /**
      * Aborts a managed upload, including all concurrent upload requests.
      */
    def abort(): scala.Unit = js.native
    /**
      * Adds a listener that is triggered when theuploader has uploaded more data.
      *
      * @param {string} event - httpUploadProgress: triggered when the uploader has uploaded more data.
      * @param {function} listener - Callback to run when the uploader has uploaded more data.
      */
    @JSName("on")
    def on_httpUploadProgress(
      event: awsDashSdkLib.awsDashSdkLibStrings.httpUploadProgress,
      listener: js.Function1[
          /* progress */ awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.Progress, 
          scala.Unit
        ]
    ): js.Any = js.native
    /**
      * Returns a 'thenable' promise.
      */
    def promise(): js.Promise[awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.SendData] = js.native
    /**
      * Initiates the managed upload for the payload.
      */
    def send(): scala.Unit = js.native
    def send(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ awsDashSdkLib.libS3ManagedUnderscoreUploadMod.ManagedUploadNs.SendData, 
          scala.Unit
        ]
    ): scala.Unit = js.native
  }
  
  trait Metadata
    extends /* key */ org.scalablytyped.runtime.StringDictionary[MetadataValue]
  
  trait MetadataEntry extends js.Object {
    var Name: js.UndefOr[MetadataKey] = js.undefined
    var Value: js.UndefOr[MetadataValue] = js.undefined
  }
  
  trait MetricsAndOperator extends js.Object {
    /**
      * The prefix used when evaluating an AND predicate.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * The list of tags used when evaluating an AND predicate.
      */
    var Tags: js.UndefOr[TagSet] = js.undefined
  }
  
  trait MetricsConfiguration extends js.Object {
    /**
      * Specifies a metrics configuration filter. The metrics configuration will only include objects that meet the filter's criteria. A filter must be a prefix, a tag, or a conjunction (MetricsAndOperator).
      */
    var Filter: js.UndefOr[MetricsFilter] = js.undefined
    /**
      * The ID used to identify the metrics configuration.
      */
    var Id: MetricsId
  }
  
  trait MetricsFilter extends js.Object {
    /**
      * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
      */
    var And: js.UndefOr[MetricsAndOperator] = js.undefined
    /**
      * The prefix used when evaluating a metrics filter.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * The tag used when evaluating a metrics filter.
      */
    var Tag: js.UndefOr[Tag] = js.undefined
  }
  
  trait MultipartUpload extends js.Object {
    /**
      * Date and time at which the multipart upload was initiated.
      */
    var Initiated: js.UndefOr[Initiated] = js.undefined
    /**
      * Identifies who initiated the multipart upload.
      */
    var Initiator: js.UndefOr[Initiator] = js.undefined
    /**
      * Key of the object for which the multipart upload was initiated.
      */
    var Key: js.UndefOr[ObjectKey] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
    /**
      * The class of storage used to store the object.
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * Upload ID that identifies the multipart upload.
      */
    var UploadId: js.UndefOr[MultipartUploadId] = js.undefined
  }
  
  trait NoncurrentVersionExpiration extends js.Object {
    /**
      * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates When an Object Became Noncurrent in the Amazon Simple Storage Service Developer Guide.
      */
    var NoncurrentDays: js.UndefOr[Days] = js.undefined
  }
  
  trait NoncurrentVersionTransition extends js.Object {
    /**
      * Specifies the number of days an object is noncurrent before Amazon S3 can perform the associated action. For information about the noncurrent days calculations, see How Amazon S3 Calculates When an Object Became Noncurrent in the Amazon Simple Storage Service Developer Guide.
      */
    var NoncurrentDays: js.UndefOr[Days] = js.undefined
    /**
      * The class of storage used to store the object.
      */
    var StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
  }
  
  trait NotificationConfiguration extends js.Object {
    var LambdaFunctionConfigurations: js.UndefOr[LambdaFunctionConfigurationList] = js.undefined
    var QueueConfigurations: js.UndefOr[QueueConfigurationList] = js.undefined
    var TopicConfigurations: js.UndefOr[TopicConfigurationList] = js.undefined
  }
  
  trait NotificationConfigurationDeprecated extends js.Object {
    var CloudFunctionConfiguration: js.UndefOr[CloudFunctionConfiguration] = js.undefined
    var QueueConfiguration: js.UndefOr[QueueConfigurationDeprecated] = js.undefined
    var TopicConfiguration: js.UndefOr[TopicConfigurationDeprecated] = js.undefined
  }
  
  trait NotificationConfigurationFilter extends js.Object {
    var Key: js.UndefOr[S3KeyFilter] = js.undefined
  }
  
  trait Object extends js.Object {
    var ETag: js.UndefOr[ETag] = js.undefined
    var Key: js.UndefOr[ObjectKey] = js.undefined
    var LastModified: js.UndefOr[LastModified] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
    var Size: js.UndefOr[Size] = js.undefined
    /**
      * The class of storage used to store the object.
      */
    var StorageClass: js.UndefOr[ObjectStorageClass] = js.undefined
  }
  
  trait ObjectIdentifier extends js.Object {
    /**
      * Key name of the object to delete.
      */
    var Key: ObjectKey
    /**
      * VersionId for the specific version of the object to delete.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait ObjectLockConfiguration extends js.Object {
    /**
      * Indicates whether this bucket has an Object Lock configuration enabled.
      */
    var ObjectLockEnabled: js.UndefOr[ObjectLockEnabled] = js.undefined
    /**
      * The Object Lock rule in place for the specified object.
      */
    var Rule: js.UndefOr[ObjectLockRule] = js.undefined
  }
  
  trait ObjectLockLegalHold extends js.Object {
    /**
      * Indicates whether the specified object has a Legal Hold in place.
      */
    var Status: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
  }
  
  trait ObjectLockRetention extends js.Object {
    /**
      * Indicates the Retention mode for the specified object.
      */
    var Mode: js.UndefOr[ObjectLockRetentionMode] = js.undefined
    /**
      * The date on which this Object Lock Retention will expire.
      */
    var RetainUntilDate: js.UndefOr[_Date] = js.undefined
  }
  
  trait ObjectLockRule extends js.Object {
    /**
      * The default retention period that you want to apply to new objects placed in the specified bucket.
      */
    var DefaultRetention: js.UndefOr[DefaultRetention] = js.undefined
  }
  
  trait ObjectVersion extends js.Object {
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
      * Specifies whether the object is (true) or is not (false) the latest version of an object.
      */
    var IsLatest: js.UndefOr[IsLatest] = js.undefined
    /**
      * The object key.
      */
    var Key: js.UndefOr[ObjectKey] = js.undefined
    /**
      * Date and time the object was last modified.
      */
    var LastModified: js.UndefOr[LastModified] = js.undefined
    var Owner: js.UndefOr[Owner] = js.undefined
    /**
      * Size in bytes of the object.
      */
    var Size: js.UndefOr[Size] = js.undefined
    /**
      * The class of storage used to store the object.
      */
    var StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.undefined
    /**
      * Version ID of an object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait OutputLocation extends js.Object {
    /**
      * Describes an S3 location that will receive the results of the restore request.
      */
    var S3: js.UndefOr[S3Location] = js.undefined
  }
  
  trait OutputSerialization extends js.Object {
    /**
      * Describes the serialization of CSV-encoded Select results.
      */
    var CSV: js.UndefOr[CSVOutput] = js.undefined
    /**
      * Specifies JSON as request's output serialization format.
      */
    var JSON: js.UndefOr[JSONOutput] = js.undefined
  }
  
  trait Owner extends js.Object {
    var DisplayName: js.UndefOr[DisplayName] = js.undefined
    var ID: js.UndefOr[ID] = js.undefined
  }
  
  trait ParquetInput extends js.Object
  
  trait Part extends js.Object {
    /**
      * Entity tag returned when the part was uploaded.
      */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
      * Date and time at which the part was uploaded.
      */
    var LastModified: js.UndefOr[LastModified] = js.undefined
    /**
      * Part number identifying the part. This is a positive integer between 1 and 10,000.
      */
    var PartNumber: js.UndefOr[PartNumber] = js.undefined
    /**
      * Size in bytes of the uploaded part data.
      */
    var Size: js.UndefOr[Size] = js.undefined
  }
  
  trait PolicyStatus extends js.Object {
    /**
      * The policy status for this bucket. TRUE indicates that this bucket is public. FALSE indicates that the bucket is not public.
      */
    var IsPublic: js.UndefOr[IsPublic] = js.undefined
  }
  
  @js.native
  class PresignedPost () extends js.Object {
    /**
      * The fields that must be included as hidden inputs on the form.
      */
    var fields: awsDashSdkLib.libS3PresignedUnderscorePostMod.PresignedPostNs.Fields = js.native
    /**
      * The URL that should be used as the action of the form.
      */
    var url: java.lang.String = js.native
  }
  
  trait Progress extends js.Object {
    /**
      * The current number of uncompressed object bytes processed.
      */
    var BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined
    /**
      * The current number of bytes of records payload data returned.
      */
    var BytesReturned: js.UndefOr[BytesReturned] = js.undefined
    /**
      * The current number of object bytes scanned.
      */
    var BytesScanned: js.UndefOr[BytesScanned] = js.undefined
  }
  
  trait ProgressEvent extends js.Object {
    /**
      * The Progress event details.
      */
    var Details: js.UndefOr[Progress] = js.undefined
  }
  
  trait PublicAccessBlockConfiguration extends js.Object {
    /**
      * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:   PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.   PUT Object calls fail if the request includes a public ACL.   Enabling this setting doesn't affect existing policies or ACLs.
      */
    var BlockPublicAcls: js.UndefOr[Setting] = js.undefined
    /**
      * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.  Enabling this setting doesn't affect existing bucket policies.
      */
    var BlockPublicPolicy: js.UndefOr[Setting] = js.undefined
    /**
      * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket. Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
      */
    var IgnorePublicAcls: js.UndefOr[Setting] = js.undefined
    /**
      * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy. Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
      */
    var RestrictPublicBuckets: js.UndefOr[Setting] = js.undefined
  }
  
  trait PutBucketAccelerateConfigurationRequest extends js.Object {
    /**
      * Specifies the Accelerate Configuration you want to set for the bucket.
      */
    var AccelerateConfiguration: AccelerateConfiguration
    /**
      * Name of the bucket for which the accelerate configuration is set.
      */
    var Bucket: BucketName
  }
  
  trait PutBucketAclRequest extends js.Object {
    /**
      * The canned ACL to apply to the bucket.
      */
    var ACL: js.UndefOr[BucketCannedACL] = js.undefined
    var AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
      */
    var GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined
    /**
      * Allows grantee to list the objects in the bucket.
      */
    var GrantRead: js.UndefOr[GrantRead] = js.undefined
    /**
      * Allows grantee to read the bucket ACL.
      */
    var GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined
    /**
      * Allows grantee to create, overwrite, and delete any object in the bucket.
      */
    var GrantWrite: js.UndefOr[GrantWrite] = js.undefined
    /**
      * Allows grantee to write the ACL for the applicable bucket.
      */
    var GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined
  }
  
  trait PutBucketAnalyticsConfigurationRequest extends js.Object {
    /**
      * The configuration and any analyses for the analytics filter.
      */
    var AnalyticsConfiguration: AnalyticsConfiguration
    /**
      * The name of the bucket to which an analytics configuration is stored.
      */
    var Bucket: BucketName
    /**
      * The identifier used to represent an analytics configuration.
      */
    var Id: AnalyticsId
  }
  
  trait PutBucketCorsRequest extends js.Object {
    var Bucket: BucketName
    var CORSConfiguration: CORSConfiguration
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  }
  
  trait PutBucketEncryptionRequest extends js.Object {
    /**
      * The name of the bucket for which the server-side encryption configuration is set.
      */
    var Bucket: BucketName
    /**
      * The base64-encoded 128-bit MD5 digest of the server-side encryption configuration.
      */
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    var ServerSideEncryptionConfiguration: ServerSideEncryptionConfiguration
  }
  
  trait PutBucketInventoryConfigurationRequest extends js.Object {
    /**
      * The name of the bucket where the inventory configuration will be stored.
      */
    var Bucket: BucketName
    /**
      * The ID used to identify the inventory configuration.
      */
    var Id: InventoryId
    /**
      * Specifies the inventory configuration.
      */
    var InventoryConfiguration: InventoryConfiguration
  }
  
  trait PutBucketLifecycleConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var LifecycleConfiguration: js.UndefOr[BucketLifecycleConfiguration] = js.undefined
  }
  
  trait PutBucketLifecycleRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    var LifecycleConfiguration: js.UndefOr[LifecycleConfiguration] = js.undefined
  }
  
  trait PutBucketLoggingRequest extends js.Object {
    var Bucket: BucketName
    var BucketLoggingStatus: BucketLoggingStatus
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
  }
  
  trait PutBucketMetricsConfigurationRequest extends js.Object {
    /**
      * The name of the bucket for which the metrics configuration is set.
      */
    var Bucket: BucketName
    /**
      * The ID used to identify the metrics configuration.
      */
    var Id: MetricsId
    /**
      * Specifies the metrics configuration.
      */
    var MetricsConfiguration: MetricsConfiguration
  }
  
  trait PutBucketNotificationConfigurationRequest extends js.Object {
    var Bucket: BucketName
    var NotificationConfiguration: NotificationConfiguration
  }
  
  trait PutBucketNotificationRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    var NotificationConfiguration: NotificationConfigurationDeprecated
  }
  
  trait PutBucketPolicyRequest extends js.Object {
    var Bucket: BucketName
    /**
      * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.
      */
    var ConfirmRemoveSelfBucketAccess: js.UndefOr[ConfirmRemoveSelfBucketAccess] = js.undefined
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * The bucket policy as a JSON document.
      */
    var Policy: Policy
  }
  
  trait PutBucketReplicationRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    var ReplicationConfiguration: ReplicationConfiguration
  }
  
  trait PutBucketRequestPaymentRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    var RequestPaymentConfiguration: RequestPaymentConfiguration
  }
  
  trait PutBucketTaggingRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    var Tagging: Tagging
  }
  
  trait PutBucketVersioningRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
      */
    var MFA: js.UndefOr[MFA] = js.undefined
    var VersioningConfiguration: VersioningConfiguration
  }
  
  trait PutBucketWebsiteRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    var WebsiteConfiguration: WebsiteConfiguration
  }
  
  trait PutObjectAclOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  }
  
  trait PutObjectAclRequest extends js.Object {
    /**
      * The canned ACL to apply to the object.
      */
    var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
    var AccessControlPolicy: js.UndefOr[AccessControlPolicy] = js.undefined
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
      */
    var GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined
    /**
      * Allows grantee to list the objects in the bucket.
      */
    var GrantRead: js.UndefOr[GrantRead] = js.undefined
    /**
      * Allows grantee to read the bucket ACL.
      */
    var GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined
    /**
      * Allows grantee to create, overwrite, and delete any object in the bucket.
      */
    var GrantWrite: js.UndefOr[GrantWrite] = js.undefined
    /**
      * Allows grantee to write the ACL for the applicable bucket.
      */
    var GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * VersionId used to reference a specific version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait PutObjectLegalHoldOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  }
  
  trait PutObjectLegalHoldRequest extends js.Object {
    /**
      * The bucket containing the object that you want to place a Legal Hold on.
      */
    var Bucket: BucketName
    /**
      * The MD5 hash for the request body.
      */
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * The key name for the object that you want to place a Legal Hold on.
      */
    var Key: ObjectKey
    /**
      * Container element for the Legal Hold configuration you want to apply to the specified object.
      */
    var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * The version ID of the object that you want to place a Legal Hold on.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait PutObjectLockConfigurationOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  }
  
  trait PutObjectLockConfigurationRequest extends js.Object {
    /**
      * The bucket whose Object Lock configuration you want to create or replace.
      */
    var Bucket: BucketName
    /**
      * The MD5 hash for the request body.
      */
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * The Object Lock configuration that you want to apply to the specified bucket.
      */
    var ObjectLockConfiguration: js.UndefOr[ObjectLockConfiguration] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    var Token: js.UndefOr[ObjectLockToken] = js.undefined
  }
  
  trait PutObjectOutput extends js.Object {
    /**
      * Entity tag for the uploaded object.
      */
    var ETag: js.UndefOr[ETag] = js.undefined
    /**
      * If the object expiration is configured, this will contain the expiration date (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.
      */
    var Expiration: js.UndefOr[Expiration] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    /**
      * Version of the object.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait PutObjectRequest extends js.Object {
    /**
      * The canned ACL to apply to the object.
      */
    var ACL: js.UndefOr[ObjectCannedACL] = js.undefined
    /**
      * Object data.
      */
    var Body: js.UndefOr[Body] = js.undefined
    /**
      * Name of the bucket to which the PUT operation was initiated.
      */
    var Bucket: BucketName
    /**
      * Specifies caching behavior along the request/reply chain.
      */
    var CacheControl: js.UndefOr[CacheControl] = js.undefined
    /**
      * Specifies presentational information for the object.
      */
    var ContentDisposition: js.UndefOr[ContentDisposition] = js.undefined
    /**
      * Specifies what content encodings have been applied to the object and thus what decoding mechanisms must be applied to obtain the media-type referenced by the Content-Type header field.
      */
    var ContentEncoding: js.UndefOr[ContentEncoding] = js.undefined
    /**
      * The language the content is in.
      */
    var ContentLanguage: js.UndefOr[ContentLanguage] = js.undefined
    /**
      * Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically.
      */
    var ContentLength: js.UndefOr[ContentLength] = js.undefined
    /**
      * The base64-encoded 128-bit MD5 digest of the part data.
      */
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * A standard MIME type describing the format of the object data.
      */
    var ContentType: js.UndefOr[ContentType] = js.undefined
    /**
      * The date and time at which the object is no longer cacheable.
      */
    var Expires: js.UndefOr[Expires] = js.undefined
    /**
      * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the object.
      */
    var GrantFullControl: js.UndefOr[GrantFullControl] = js.undefined
    /**
      * Allows grantee to read the object data and its metadata.
      */
    var GrantRead: js.UndefOr[GrantRead] = js.undefined
    /**
      * Allows grantee to read the object ACL.
      */
    var GrantReadACP: js.UndefOr[GrantReadACP] = js.undefined
    /**
      * Allows grantee to write the ACL for the applicable object.
      */
    var GrantWriteACP: js.UndefOr[GrantWriteACP] = js.undefined
    /**
      * Object key for which the PUT operation was initiated.
      */
    var Key: ObjectKey
    /**
      * A map of metadata to store with the object in S3.
      */
    var Metadata: js.UndefOr[Metadata] = js.undefined
    /**
      * The Legal Hold status that you want to apply to the specified object.
      */
    var ObjectLockLegalHoldStatus: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
    /**
      * The Object Lock mode that you want to apply to this object.
      */
    var ObjectLockMode: js.UndefOr[ObjectLockMode] = js.undefined
    /**
      * The date and time when you want this object's Object Lock to expire.
      */
    var ObjectLockRetainUntilDate: js.UndefOr[ObjectLockRetainUntilDate] = js.undefined
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
      */
    var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. Documentation on configuring any of the officially supported AWS SDKs and CLI can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
    /**
      * The type of storage to use for the object. Defaults to 'STANDARD'.
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The tag-set for the object. The tag-set must be encoded as URL Query parameters. (For example, "Key1=Value1")
      */
    var Tagging: js.UndefOr[TaggingHeader] = js.undefined
    /**
      * If the bucket is configured as a website, redirects requests for this object to another object in the same bucket or to an external URL. Amazon S3 stores the value of this header in the object metadata.
      */
    var WebsiteRedirectLocation: js.UndefOr[WebsiteRedirectLocation] = js.undefined
  }
  
  trait PutObjectRetentionOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
  }
  
  trait PutObjectRetentionRequest extends js.Object {
    /**
      * The bucket that contains the object you want to apply this Object Retention configuration to.
      */
    var Bucket: BucketName
    /**
      * Indicates whether this operation should bypass Governance-mode restrictions.j
      */
    var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined
    /**
      * The MD5 hash for the request body.
      */
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * The key name for the object that you want to apply this Object Retention configuration to.
      */
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * The container element for the Object Retention configuration.
      */
    var Retention: js.UndefOr[ObjectLockRetention] = js.undefined
    /**
      * The version ID for the object that you want to apply this Object Retention configuration to.
      */
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait PutObjectTaggingOutput extends js.Object {
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait PutObjectTaggingRequest extends js.Object {
    var Bucket: BucketName
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    var Key: ObjectKey
    var Tagging: Tagging
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait PutPublicAccessBlockRequest extends js.Object {
    /**
      * The name of the Amazon S3 bucket whose PublicAccessBlock configuration you want to set.
      */
    var Bucket: BucketName
    /**
      * The MD5 hash of the PutPublicAccessBlock request body. 
      */
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * The PublicAccessBlock configuration that you want to apply to this Amazon S3 bucket. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see The Meaning of "Public" in the Amazon Simple Storage Service Developer Guide.
      */
    var PublicAccessBlockConfiguration: PublicAccessBlockConfiguration
  }
  
  trait QueueConfiguration extends js.Object {
    var Events: EventList
    var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
    var Id: js.UndefOr[NotificationId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 will publish a message when it detects events of the specified type.
      */
    var QueueArn: QueueArn
  }
  
  trait QueueConfigurationDeprecated extends js.Object {
    var Event: js.UndefOr[Event] = js.undefined
    var Events: js.UndefOr[EventList] = js.undefined
    var Id: js.UndefOr[NotificationId] = js.undefined
    var Queue: js.UndefOr[QueueArn] = js.undefined
  }
  
  trait RecordsEvent extends js.Object {
    /**
      * The byte array of partial, one or more result records.
      */
    var Payload: js.UndefOr[nodeLib.Buffer] = js.undefined
  }
  
  trait Redirect extends js.Object {
    /**
      * The host name to use in the redirect request.
      */
    var HostName: js.UndefOr[HostName] = js.undefined
    /**
      * The HTTP redirect code to use on the response. Not required if one of the siblings is present.
      */
    var HttpRedirectCode: js.UndefOr[HttpRedirectCode] = js.undefined
    /**
      * Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.
      */
    var Protocol: js.UndefOr[Protocol] = js.undefined
    /**
      * The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.
      */
    var ReplaceKeyPrefixWith: js.UndefOr[ReplaceKeyPrefixWith] = js.undefined
    /**
      * The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the sibling is present. Can be present only if ReplaceKeyPrefixWith is not provided.
      */
    var ReplaceKeyWith: js.UndefOr[ReplaceKeyWith] = js.undefined
  }
  
  trait RedirectAllRequestsTo extends js.Object {
    /**
      * Name of the host where requests will be redirected.
      */
    var HostName: HostName
    /**
      * Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.
      */
    var Protocol: js.UndefOr[Protocol] = js.undefined
  }
  
  trait ReplicationConfiguration extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that Amazon S3 can assume when replicating the objects.
      */
    var Role: Role
    /**
      * A container for one or more replication rules. A replication configuration must have at least one rule and can contain a maximum of 1,000 rules. 
      */
    var Rules: ReplicationRules
  }
  
  trait ReplicationRule extends js.Object {
    var DeleteMarkerReplication: js.UndefOr[DeleteMarkerReplication] = js.undefined
    /**
      * A container for information about the replication destination.
      */
    var Destination: Destination
    var Filter: js.UndefOr[ReplicationRuleFilter] = js.undefined
    /**
      * A unique identifier for the rule. The maximum value is 255 characters.
      */
    var ID: js.UndefOr[ID] = js.undefined
    /**
      * An object keyname prefix that identifies the object or objects to which the rule applies. The maximum prefix length is 1,024 characters. 
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * The priority associated with the rule. If you specify multiple rules in a replication configuration, Amazon S3 prioritizes the rules to prevent conflicts when filtering. If two or more rules identify the same object based on a specified filter, the rule with higher priority takes precedence. For example:   Same object quality prefix based filter criteria If prefixes you specified in multiple rules overlap    Same object qualify tag based filter criteria specified in multiple rules   For more information, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide.
      */
    var Priority: js.UndefOr[Priority] = js.undefined
    /**
      * A container that describes additional filters for identifying the source objects that you want to replicate. You can choose to enable or disable the replication of these objects. Currently, Amazon S3 supports only the filter that you can specify for objects created with server-side encryption using an AWS KMS-Managed Key (SSE-KMS).   If you want Amazon S3 to replicate objects created with server-side encryption using AWS KMS-Managed Keys. 
      */
    var SourceSelectionCriteria: js.UndefOr[SourceSelectionCriteria] = js.undefined
    /**
      * If status isn't enabled, the rule is ignored.
      */
    var Status: ReplicationRuleStatus
  }
  
  trait ReplicationRuleAndOperator extends js.Object {
    var Prefix: js.UndefOr[Prefix] = js.undefined
    var Tags: js.UndefOr[TagSet] = js.undefined
  }
  
  trait ReplicationRuleFilter extends js.Object {
    /**
      * A container for specifying rule filters. The filters determine the subset of objects to which the rule applies. This element is required only if you specify more than one filter. For example:    If you specify both a Prefix and a Tag filter, wrap these filters in an And tag.   If you specify a filter based on multiple tags, wrap the Tag elements in an And tag.  
      */
    var And: js.UndefOr[ReplicationRuleAndOperator] = js.undefined
    /**
      * An object keyname prefix that identifies the subset of objects to which the rule applies.
      */
    var Prefix: js.UndefOr[Prefix] = js.undefined
    /**
      * A container for specifying a tag key and value.  The rule applies only to objects that have the tag in their tag set.
      */
    var Tag: js.UndefOr[Tag] = js.undefined
  }
  
  trait RequestPaymentConfiguration extends js.Object {
    /**
      * Specifies who pays for the download and request fees.
      */
    var Payer: Payer
  }
  
  trait RequestProgress extends js.Object {
    /**
      * Specifies whether periodic QueryProgress frames should be sent. Valid values: TRUE, FALSE. Default value: FALSE.
      */
    var Enabled: js.UndefOr[EnableRequestProgress] = js.undefined
  }
  
  trait RestoreObjectOutput extends js.Object {
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * Indicates the path in the provided S3 output location where Select results will be restored to.
      */
    var RestoreOutputPath: js.UndefOr[RestoreOutputPath] = js.undefined
  }
  
  trait RestoreObjectRequest extends js.Object {
    var Bucket: BucketName
    var Key: ObjectKey
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    var RestoreRequest: js.UndefOr[RestoreRequest] = js.undefined
    var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
  }
  
  trait RestoreRequest extends js.Object {
    /**
      * Lifetime of the active copy in days. Do not use with restores that specify OutputLocation.
      */
    var Days: js.UndefOr[Days] = js.undefined
    /**
      * The optional description for the job.
      */
    var Description: js.UndefOr[Description] = js.undefined
    /**
      * Glacier related parameters pertaining to this job. Do not use with restores that specify OutputLocation.
      */
    var GlacierJobParameters: js.UndefOr[GlacierJobParameters] = js.undefined
    /**
      * Describes the location where the restore job's output is stored.
      */
    var OutputLocation: js.UndefOr[OutputLocation] = js.undefined
    /**
      * Describes the parameters for Select job types.
      */
    var SelectParameters: js.UndefOr[SelectParameters] = js.undefined
    /**
      * Glacier retrieval tier at which the restore will be processed.
      */
    var Tier: js.UndefOr[Tier] = js.undefined
    /**
      * Type of restore request.
      */
    var Type: js.UndefOr[RestoreRequestType] = js.undefined
  }
  
  trait RoutingRule extends js.Object {
    /**
      * A container for describing a condition that must be met for the specified redirect to apply. For example, 1. If request is for pages in the /docs folder, redirect to the /documents folder. 2. If request results in HTTP error 4xx, redirect request to another host where you might process the error.
      */
    var Condition: js.UndefOr[Condition] = js.undefined
    /**
      * Container for redirect information. You can redirect requests to another host, to another page, or with another protocol. In the event of an error, you can specify a different error code to return.
      */
    var Redirect: Redirect
  }
  
  trait Rule extends js.Object {
    var AbortIncompleteMultipartUpload: js.UndefOr[AbortIncompleteMultipartUpload] = js.undefined
    var Expiration: js.UndefOr[LifecycleExpiration] = js.undefined
    /**
      * Unique identifier for the rule. The value cannot be longer than 255 characters.
      */
    var ID: js.UndefOr[ID] = js.undefined
    var NoncurrentVersionExpiration: js.UndefOr[NoncurrentVersionExpiration] = js.undefined
    var NoncurrentVersionTransition: js.UndefOr[NoncurrentVersionTransition] = js.undefined
    /**
      * Prefix identifying one or more objects to which the rule applies.
      */
    var Prefix: Prefix
    /**
      * If 'Enabled', the rule is currently being applied. If 'Disabled', the rule is not currently being applied.
      */
    var Status: ExpirationStatus
    var Transition: js.UndefOr[Transition] = js.undefined
  }
  
  trait S3KeyFilter extends js.Object {
    var FilterRules: js.UndefOr[FilterRuleList] = js.undefined
  }
  
  trait S3Location extends js.Object {
    /**
      * A list of grants that control access to the staged results.
      */
    var AccessControlList: js.UndefOr[Grants] = js.undefined
    /**
      * The name of the bucket where the restore results will be placed.
      */
    var BucketName: BucketName
    /**
      * The canned ACL to apply to the restore results.
      */
    var CannedACL: js.UndefOr[ObjectCannedACL] = js.undefined
    var Encryption: js.UndefOr[Encryption] = js.undefined
    /**
      * The prefix that is prepended to the restore results for this request.
      */
    var Prefix: LocationPrefix
    /**
      * The class of storage used to store the restore results.
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The tag-set that is applied to the restore results.
      */
    var Tagging: js.UndefOr[Tagging] = js.undefined
    /**
      * A list of metadata to store with the restore results in S3.
      */
    var UserMetadata: js.UndefOr[UserMetadata] = js.undefined
  }
  
  trait SSEKMS extends js.Object {
    /**
      * Specifies the ID of the AWS Key Management Service (KMS) master encryption key to use for encrypting Inventory reports.
      */
    var KeyId: SSEKMSKeyId
  }
  
  trait SSES3 extends js.Object
  
  trait SelectObjectContentOutput extends js.Object {
    var Payload: js.UndefOr[SelectObjectContentEventStream] = js.undefined
  }
  
  trait SelectObjectContentRequest extends js.Object {
    /**
      * The S3 bucket.
      */
    var Bucket: BucketName
    /**
      * The expression that is used to query the object.
      */
    var Expression: Expression
    /**
      * The type of the provided expression (for example., SQL).
      */
    var ExpressionType: ExpressionType
    /**
      * Describes the format of the data in the object that is being queried.
      */
    var InputSerialization: InputSerialization
    /**
      * The object key.
      */
    var Key: ObjectKey
    /**
      * Describes the format of the data that you want Amazon S3 to return in response.
      */
    var OutputSerialization: OutputSerialization
    /**
      * Specifies if periodic request progress information should be enabled.
      */
    var RequestProgress: js.UndefOr[RequestProgress] = js.undefined
    /**
      * The SSE Algorithm used to encrypt the object. For more information, see  Server-Side Encryption (Using Customer-Provided Encryption Keys. 
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * The SSE Customer Key. For more information, see  Server-Side Encryption (Using Customer-Provided Encryption Keys. 
      */
    var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    /**
      * The SSE Customer Key MD5. For more information, see  Server-Side Encryption (Using Customer-Provided Encryption Keys. 
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
  }
  
  trait SelectParameters extends js.Object {
    /**
      * The expression that is used to query the object.
      */
    var Expression: Expression
    /**
      * The type of the provided expression (e.g., SQL).
      */
    var ExpressionType: ExpressionType
    /**
      * Describes the serialization format of the object.
      */
    var InputSerialization: InputSerialization
    /**
      * Describes how the results of the Select job are serialized.
      */
    var OutputSerialization: OutputSerialization
  }
  
  trait ServerSideEncryptionByDefault extends js.Object {
    /**
      * KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.
      */
    var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * Server-side encryption algorithm to use for the default encryption.
      */
    var SSEAlgorithm: ServerSideEncryption
  }
  
  trait ServerSideEncryptionConfiguration extends js.Object {
    /**
      * Container for information about a particular server-side encryption configuration rule.
      */
    var Rules: ServerSideEncryptionRules
  }
  
  trait ServerSideEncryptionRule extends js.Object {
    /**
      * Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any server-side encryption, this default encryption will be applied.
      */
    var ApplyServerSideEncryptionByDefault: js.UndefOr[ServerSideEncryptionByDefault] = js.undefined
  }
  
  trait SourceSelectionCriteria extends js.Object {
    /**
      *  A container for filter information for the selection of S3 objects encrypted with AWS KMS. If you include SourceSelectionCriteria in the replication configuration, this element is required. 
      */
    var SseKmsEncryptedObjects: js.UndefOr[SseKmsEncryptedObjects] = js.undefined
  }
  
  trait SseKmsEncryptedObjects extends js.Object {
    /**
      *  If the status is not Enabled, replication for S3 objects encrypted with AWS KMS is disabled.
      */
    var Status: SseKmsEncryptedObjectsStatus
  }
  
  trait Stats extends js.Object {
    /**
      * The total number of uncompressed object bytes processed.
      */
    var BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined
    /**
      * The total number of bytes of records payload data returned.
      */
    var BytesReturned: js.UndefOr[BytesReturned] = js.undefined
    /**
      * The total number of object bytes scanned.
      */
    var BytesScanned: js.UndefOr[BytesScanned] = js.undefined
  }
  
  trait StatsEvent extends js.Object {
    /**
      * The Stats event details.
      */
    var Details: js.UndefOr[Stats] = js.undefined
  }
  
  trait StorageClassAnalysis extends js.Object {
    /**
      * A container used to describe how data related to the storage class analysis should be exported.
      */
    var DataExport: js.UndefOr[StorageClassAnalysisDataExport] = js.undefined
  }
  
  trait StorageClassAnalysisDataExport extends js.Object {
    /**
      * The place to store the data for an analysis.
      */
    var Destination: AnalyticsExportDestination
    /**
      * The version of the output schema to use when exporting data. Must be V_1.
      */
    var OutputSchemaVersion: StorageClassAnalysisSchemaVersion
  }
  
  trait Tag extends js.Object {
    /**
      * Name of the tag.
      */
    var Key: ObjectKey
    /**
      * Value of the tag.
      */
    var Value: Value
  }
  
  trait Tagging extends js.Object {
    var TagSet: TagSet
  }
  
  trait TargetGrant extends js.Object {
    var Grantee: js.UndefOr[Grantee] = js.undefined
    /**
      * Logging permissions assigned to the Grantee for the bucket.
      */
    var Permission: js.UndefOr[BucketLogsPermission] = js.undefined
  }
  
  trait TopicConfiguration extends js.Object {
    var Events: EventList
    var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
    var Id: js.UndefOr[NotificationId] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 will publish a message when it detects events of the specified type.
      */
    var TopicArn: TopicArn
  }
  
  trait TopicConfigurationDeprecated extends js.Object {
    /**
      * Bucket event for which to send notifications.
      */
    var Event: js.UndefOr[Event] = js.undefined
    var Events: js.UndefOr[EventList] = js.undefined
    var Id: js.UndefOr[NotificationId] = js.undefined
    /**
      * Amazon SNS topic to which Amazon S3 will publish a message to report the specified events for the bucket.
      */
    var Topic: js.UndefOr[TopicArn] = js.undefined
  }
  
  trait Transition extends js.Object {
    /**
      * Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601 Format.
      */
    var Date: js.UndefOr[_Date] = js.undefined
    /**
      * Indicates the lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.
      */
    var Days: js.UndefOr[Days] = js.undefined
    /**
      * The class of storage used to store the object.
      */
    var StorageClass: js.UndefOr[TransitionStorageClass] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServicesS3Mod.S3Customizations {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Aborts a multipart upload. To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.
      */
    def abortMultipartUpload(): awsDashSdkLib.libRequestMod.Request[AbortMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortMultipartUpload(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AbortMultipartUploadOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AbortMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Aborts a multipart upload. To verify that all parts have been removed, so you don't get charged for the part storage, you should call the List Parts operation and ensure the parts list is empty.
      */
    def abortMultipartUpload(params: AbortMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[AbortMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortMultipartUpload(
      params: AbortMultipartUploadRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AbortMultipartUploadOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AbortMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Completes a multipart upload by assembling previously uploaded parts.
      */
    def completeMultipartUpload(): awsDashSdkLib.libRequestMod.Request[CompleteMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def completeMultipartUpload(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CompleteMultipartUploadOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CompleteMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Completes a multipart upload by assembling previously uploaded parts.
      */
    def completeMultipartUpload(params: CompleteMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[CompleteMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def completeMultipartUpload(
      params: CompleteMultipartUploadRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CompleteMultipartUploadOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CompleteMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a copy of an object that is already stored in Amazon S3.
      */
    def copyObject(): awsDashSdkLib.libRequestMod.Request[CopyObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a copy of an object that is already stored in Amazon S3.
      */
    def copyObject(params: CopyObjectRequest): awsDashSdkLib.libRequestMod.Request[CopyObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def copyObject(
      params: CopyObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CopyObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CopyObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new bucket.
      */
    def createBucket(): awsDashSdkLib.libRequestMod.Request[CreateBucketOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBucket(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBucketOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBucketOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new bucket.
      */
    def createBucket(params: CreateBucketRequest): awsDashSdkLib.libRequestMod.Request[CreateBucketOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBucket(
      params: CreateBucketRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBucketOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBucketOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a multipart upload and returns an upload ID.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
      */
    def createMultipartUpload(): awsDashSdkLib.libRequestMod.Request[CreateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMultipartUpload(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMultipartUploadOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates a multipart upload and returns an upload ID.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
      */
    def createMultipartUpload(params: CreateMultipartUploadRequest): awsDashSdkLib.libRequestMod.Request[CreateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMultipartUpload(
      params: CreateMultipartUploadRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMultipartUploadOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the bucket. All objects (including all object versions and Delete Markers) in the bucket must be deleted before the bucket itself can be deleted.
      */
    def deleteBucket(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucket(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the bucket. All objects (including all object versions and Delete Markers) in the bucket must be deleted before the bucket itself can be deleted.
      */
    def deleteBucket(params: DeleteBucketRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucket(
      params: DeleteBucketRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID).
      */
    def deleteBucketAnalyticsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketAnalyticsConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an analytics configuration for the bucket (specified by the analytics configuration ID).
      */
    def deleteBucketAnalyticsConfiguration(params: DeleteBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketAnalyticsConfiguration(
      params: DeleteBucketAnalyticsConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the CORS configuration information set for the bucket.
      */
    def deleteBucketCors(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketCors(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the CORS configuration information set for the bucket.
      */
    def deleteBucketCors(params: DeleteBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketCors(
      params: DeleteBucketCorsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the server-side encryption configuration from the bucket.
      */
    def deleteBucketEncryption(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketEncryption(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the server-side encryption configuration from the bucket.
      */
    def deleteBucketEncryption(params: DeleteBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketEncryption(
      params: DeleteBucketEncryptionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an inventory configuration (identified by the inventory ID) from the bucket.
      */
    def deleteBucketInventoryConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketInventoryConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an inventory configuration (identified by the inventory ID) from the bucket.
      */
    def deleteBucketInventoryConfiguration(params: DeleteBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketInventoryConfiguration(
      params: DeleteBucketInventoryConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the lifecycle configuration from the bucket.
      */
    def deleteBucketLifecycle(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketLifecycle(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the lifecycle configuration from the bucket.
      */
    def deleteBucketLifecycle(params: DeleteBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketLifecycle(
      params: DeleteBucketLifecycleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a metrics configuration (specified by the metrics configuration ID) from the bucket.
      */
    def deleteBucketMetricsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketMetricsConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a metrics configuration (specified by the metrics configuration ID) from the bucket.
      */
    def deleteBucketMetricsConfiguration(params: DeleteBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketMetricsConfiguration(
      params: DeleteBucketMetricsConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the policy from the bucket.
      */
    def deleteBucketPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the policy from the bucket.
      */
    def deleteBucketPolicy(params: DeleteBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketPolicy(
      params: DeleteBucketPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes the replication configuration from the bucket. For information about replication configuration, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
      */
    def deleteBucketReplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketReplication(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Deletes the replication configuration from the bucket. For information about replication configuration, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
      */
    def deleteBucketReplication(params: DeleteBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketReplication(
      params: DeleteBucketReplicationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the tags from the bucket.
      */
    def deleteBucketTagging(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketTagging(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the tags from the bucket.
      */
    def deleteBucketTagging(params: DeleteBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketTagging(
      params: DeleteBucketTaggingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation removes the website configuration from the bucket.
      */
    def deleteBucketWebsite(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketWebsite(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation removes the website configuration from the bucket.
      */
    def deleteBucketWebsite(params: DeleteBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBucketWebsite(
      params: DeleteBucketWebsiteRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.
      */
    def deleteObject(): awsDashSdkLib.libRequestMod.Request[DeleteObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the null version (if there is one) of an object and inserts a delete marker, which becomes the latest version of the object. If there isn't a null version, Amazon S3 does not remove any objects.
      */
    def deleteObject(params: DeleteObjectRequest): awsDashSdkLib.libRequestMod.Request[DeleteObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteObject(
      params: DeleteObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the tag-set from an existing object.
      */
    def deleteObjectTagging(): awsDashSdkLib.libRequestMod.Request[DeleteObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteObjectTagging(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectTaggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the tag-set from an existing object.
      */
    def deleteObjectTagging(params: DeleteObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[DeleteObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteObjectTagging(
      params: DeleteObjectTaggingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectTaggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.
      */
    def deleteObjects(): awsDashSdkLib.libRequestMod.Request[DeleteObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteObjects(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation enables you to delete multiple objects from a bucket using a single HTTP request. You may specify up to 1000 keys.
      */
    def deleteObjects(params: DeleteObjectsRequest): awsDashSdkLib.libRequestMod.Request[DeleteObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteObjects(
      params: DeleteObjectsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteObjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the PublicAccessBlock configuration from an Amazon S3 bucket.
      */
    def deletePublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePublicAccessBlock(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the PublicAccessBlock configuration from an Amazon S3 bucket.
      */
    def deletePublicAccessBlock(params: DeletePublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deletePublicAccessBlock(
      params: DeletePublicAccessBlockRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the accelerate configuration of a bucket.
      */
    def getBucketAccelerateConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketAccelerateConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketAccelerateConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketAccelerateConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketAccelerateConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the accelerate configuration of a bucket.
      */
    def getBucketAccelerateConfiguration(params: GetBucketAccelerateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketAccelerateConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketAccelerateConfiguration(
      params: GetBucketAccelerateConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketAccelerateConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketAccelerateConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the access control policy for the bucket.
      */
    def getBucketAcl(): awsDashSdkLib.libRequestMod.Request[GetBucketAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketAcl(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketAclOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the access control policy for the bucket.
      */
    def getBucketAcl(params: GetBucketAclRequest): awsDashSdkLib.libRequestMod.Request[GetBucketAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketAcl(
      params: GetBucketAclRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketAclOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an analytics configuration for the bucket (specified by the analytics configuration ID).
      */
    def getBucketAnalyticsConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketAnalyticsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketAnalyticsConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketAnalyticsConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketAnalyticsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an analytics configuration for the bucket (specified by the analytics configuration ID).
      */
    def getBucketAnalyticsConfiguration(params: GetBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketAnalyticsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketAnalyticsConfiguration(
      params: GetBucketAnalyticsConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketAnalyticsConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketAnalyticsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the CORS configuration for the bucket.
      */
    def getBucketCors(): awsDashSdkLib.libRequestMod.Request[GetBucketCorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketCors(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketCorsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketCorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the CORS configuration for the bucket.
      */
    def getBucketCors(params: GetBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[GetBucketCorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketCors(
      params: GetBucketCorsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketCorsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketCorsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the server-side encryption configuration of a bucket.
      */
    def getBucketEncryption(): awsDashSdkLib.libRequestMod.Request[GetBucketEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketEncryption(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketEncryptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the server-side encryption configuration of a bucket.
      */
    def getBucketEncryption(params: GetBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[GetBucketEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketEncryption(
      params: GetBucketEncryptionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketEncryptionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketEncryptionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an inventory configuration (identified by the inventory ID) from the bucket.
      */
    def getBucketInventoryConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketInventoryConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketInventoryConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketInventoryConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketInventoryConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns an inventory configuration (identified by the inventory ID) from the bucket.
      */
    def getBucketInventoryConfiguration(params: GetBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketInventoryConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketInventoryConfiguration(
      params: GetBucketInventoryConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketInventoryConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketInventoryConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated, see the GetBucketLifecycleConfiguration operation.
      */
    def getBucketLifecycle(): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketLifecycle(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketLifecycleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated, see the GetBucketLifecycleConfiguration operation.
      */
    def getBucketLifecycle(params: GetBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketLifecycle(
      params: GetBucketLifecycleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketLifecycleOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the lifecycle configuration information set on the bucket.
      */
    def getBucketLifecycleConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketLifecycleConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketLifecycleConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the lifecycle configuration information set on the bucket.
      */
    def getBucketLifecycleConfiguration(params: GetBucketLifecycleConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketLifecycleConfiguration(
      params: GetBucketLifecycleConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketLifecycleConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketLifecycleConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the region the bucket resides in.
      */
    def getBucketLocation(): awsDashSdkLib.libRequestMod.Request[GetBucketLocationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketLocation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketLocationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketLocationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the region the bucket resides in.
      */
    def getBucketLocation(params: GetBucketLocationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketLocationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketLocation(
      params: GetBucketLocationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketLocationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketLocationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.
      */
    def getBucketLogging(): awsDashSdkLib.libRequestMod.Request[GetBucketLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketLogging(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketLoggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the logging status of a bucket and the permissions users have to view and modify that status. To use GET, you must be the bucket owner.
      */
    def getBucketLogging(params: GetBucketLoggingRequest): awsDashSdkLib.libRequestMod.Request[GetBucketLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketLogging(
      params: GetBucketLoggingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketLoggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketLoggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.
      */
    def getBucketMetricsConfiguration(): awsDashSdkLib.libRequestMod.Request[GetBucketMetricsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketMetricsConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketMetricsConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketMetricsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets a metrics configuration (specified by the metrics configuration ID) from the bucket.
      */
    def getBucketMetricsConfiguration(params: GetBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketMetricsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketMetricsConfiguration(
      params: GetBucketMetricsConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketMetricsConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketMetricsConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated, see the GetBucketNotificationConfiguration operation.
      */
    def getBucketNotification(): awsDashSdkLib.libRequestMod.Request[NotificationConfigurationDeprecated, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketNotification(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ NotificationConfigurationDeprecated, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[NotificationConfigurationDeprecated, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated, see the GetBucketNotificationConfiguration operation.
      */
    def getBucketNotification(params: GetBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[NotificationConfigurationDeprecated, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketNotification(
      params: GetBucketNotificationConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ NotificationConfigurationDeprecated, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[NotificationConfigurationDeprecated, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the notification configuration of a bucket.
      */
    def getBucketNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[NotificationConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketNotificationConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ NotificationConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[NotificationConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the notification configuration of a bucket.
      */
    def getBucketNotificationConfiguration(params: GetBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[NotificationConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketNotificationConfiguration(
      params: GetBucketNotificationConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ NotificationConfiguration, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[NotificationConfiguration, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the policy of a specified bucket.
      */
    def getBucketPolicy(): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the policy of a specified bucket.
      */
    def getBucketPolicy(params: GetBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketPolicy(
      params: GetBucketPolicyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public.
      */
    def getBucketPolicyStatus(): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketPolicyStatus(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketPolicyStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the policy status for an Amazon S3 bucket, indicating whether the bucket is public.
      */
    def getBucketPolicyStatus(params: GetBucketPolicyStatusRequest): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketPolicyStatus(
      params: GetBucketPolicyStatusRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketPolicyStatusOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketPolicyStatusOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the replication configuration of a bucket.   It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems. Therefore, a get request soon after put or delete can return a wrong result.  
      */
    def getBucketReplication(): awsDashSdkLib.libRequestMod.Request[GetBucketReplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketReplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketReplicationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketReplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the replication configuration of a bucket.   It can take a while to propagate the put or delete a replication configuration to all Amazon S3 systems. Therefore, a get request soon after put or delete can return a wrong result.  
      */
    def getBucketReplication(params: GetBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[GetBucketReplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketReplication(
      params: GetBucketReplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketReplicationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketReplicationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the request payment configuration of a bucket.
      */
    def getBucketRequestPayment(): awsDashSdkLib.libRequestMod.Request[GetBucketRequestPaymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketRequestPayment(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketRequestPaymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketRequestPaymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the request payment configuration of a bucket.
      */
    def getBucketRequestPayment(params: GetBucketRequestPaymentRequest): awsDashSdkLib.libRequestMod.Request[GetBucketRequestPaymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketRequestPayment(
      params: GetBucketRequestPaymentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketRequestPaymentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketRequestPaymentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the tag set associated with the bucket.
      */
    def getBucketTagging(): awsDashSdkLib.libRequestMod.Request[GetBucketTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketTagging(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketTaggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the tag set associated with the bucket.
      */
    def getBucketTagging(params: GetBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[GetBucketTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketTagging(
      params: GetBucketTaggingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketTaggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the versioning state of a bucket.
      */
    def getBucketVersioning(): awsDashSdkLib.libRequestMod.Request[GetBucketVersioningOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketVersioning(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketVersioningOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketVersioningOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the versioning state of a bucket.
      */
    def getBucketVersioning(params: GetBucketVersioningRequest): awsDashSdkLib.libRequestMod.Request[GetBucketVersioningOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketVersioning(
      params: GetBucketVersioningRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketVersioningOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketVersioningOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the website configuration for a bucket.
      */
    def getBucketWebsite(): awsDashSdkLib.libRequestMod.Request[GetBucketWebsiteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketWebsite(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketWebsiteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketWebsiteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the website configuration for a bucket.
      */
    def getBucketWebsite(params: GetBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[GetBucketWebsiteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getBucketWebsite(
      params: GetBucketWebsiteRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBucketWebsiteOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBucketWebsiteOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves objects from Amazon S3.
      */
    def getObject(): awsDashSdkLib.libRequestMod.Request[GetObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObject(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetObjectOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves objects from Amazon S3.
      */
    def getObject(params: GetObjectRequest): awsDashSdkLib.libRequestMod.Request[GetObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObject(
      params: GetObjectRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetObjectOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the access control list (ACL) of an object.
      */
    def getObjectAcl(): awsDashSdkLib.libRequestMod.Request[GetObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectAcl(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectAclOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the access control list (ACL) of an object.
      */
    def getObjectAcl(params: GetObjectAclRequest): awsDashSdkLib.libRequestMod.Request[GetObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectAcl(
      params: GetObjectAclRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectAclOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an object's current Legal Hold status.
      */
    def getObjectLegalHold(): awsDashSdkLib.libRequestMod.Request[GetObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectLegalHold(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectLegalHoldOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets an object's current Legal Hold status.
      */
    def getObjectLegalHold(params: GetObjectLegalHoldRequest): awsDashSdkLib.libRequestMod.Request[GetObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectLegalHold(
      params: GetObjectLegalHoldRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectLegalHoldOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.
      */
    def getObjectLockConfiguration(): awsDashSdkLib.libRequestMod.Request[GetObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectLockConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectLockConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the Object Lock configuration for a bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.
      */
    def getObjectLockConfiguration(params: GetObjectLockConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectLockConfiguration(
      params: GetObjectLockConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectLockConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves an object's retention settings.
      */
    def getObjectRetention(): awsDashSdkLib.libRequestMod.Request[GetObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectRetention(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectRetentionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves an object's retention settings.
      */
    def getObjectRetention(params: GetObjectRetentionRequest): awsDashSdkLib.libRequestMod.Request[GetObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectRetention(
      params: GetObjectRetentionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectRetentionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the tag-set of an object.
      */
    def getObjectTagging(): awsDashSdkLib.libRequestMod.Request[GetObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectTagging(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectTaggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns the tag-set of an object.
      */
    def getObjectTagging(params: GetObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[GetObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectTagging(
      params: GetObjectTaggingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectTaggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Return torrent files from a bucket.
      */
    def getObjectTorrent(): awsDashSdkLib.libRequestMod.Request[GetObjectTorrentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectTorrent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectTorrentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectTorrentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Return torrent files from a bucket.
      */
    def getObjectTorrent(params: GetObjectTorrentRequest): awsDashSdkLib.libRequestMod.Request[GetObjectTorrentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getObjectTorrent(
      params: GetObjectTorrentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetObjectTorrentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetObjectTorrentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket.
      */
    def getPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPublicAccessBlock(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPublicAccessBlockOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the PublicAccessBlock configuration for an Amazon S3 bucket.
      */
    def getPublicAccessBlock(params: GetPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getPublicAccessBlock(
      params: GetPublicAccessBlockRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPublicAccessBlockOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPublicAccessBlockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation is useful to determine if a bucket exists and you have permission to access it.
      */
    def headBucket(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def headBucket(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation is useful to determine if a bucket exists and you have permission to access it.
      */
    def headBucket(params: HeadBucketRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def headBucket(
      params: HeadBucketRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
      */
    def headObject(): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def headObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HeadObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * The HEAD operation retrieves metadata from an object without returning the object itself. This operation is useful if you're only interested in an object's metadata. To use HEAD, you must have READ access to the object.
      */
    def headObject(params: HeadObjectRequest): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def headObject(
      params: HeadObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HeadObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the analytics configurations for the bucket.
      */
    def listBucketAnalyticsConfigurations(): awsDashSdkLib.libRequestMod.Request[ListBucketAnalyticsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBucketAnalyticsConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBucketAnalyticsConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBucketAnalyticsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the analytics configurations for the bucket.
      */
    def listBucketAnalyticsConfigurations(params: ListBucketAnalyticsConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListBucketAnalyticsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBucketAnalyticsConfigurations(
      params: ListBucketAnalyticsConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBucketAnalyticsConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBucketAnalyticsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of inventory configurations for the bucket.
      */
    def listBucketInventoryConfigurations(): awsDashSdkLib.libRequestMod.Request[ListBucketInventoryConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBucketInventoryConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBucketInventoryConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBucketInventoryConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of inventory configurations for the bucket.
      */
    def listBucketInventoryConfigurations(params: ListBucketInventoryConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListBucketInventoryConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBucketInventoryConfigurations(
      params: ListBucketInventoryConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBucketInventoryConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBucketInventoryConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the metrics configurations for the bucket.
      */
    def listBucketMetricsConfigurations(): awsDashSdkLib.libRequestMod.Request[ListBucketMetricsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBucketMetricsConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBucketMetricsConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBucketMetricsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the metrics configurations for the bucket.
      */
    def listBucketMetricsConfigurations(params: ListBucketMetricsConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListBucketMetricsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBucketMetricsConfigurations(
      params: ListBucketMetricsConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBucketMetricsConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBucketMetricsConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of all buckets owned by the authenticated sender of the request.
      */
    def listBuckets(): awsDashSdkLib.libRequestMod.Request[ListBucketsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBuckets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBucketsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBucketsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists in-progress multipart uploads.
      */
    def listMultipartUploads(): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMultipartUploads(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMultipartUploadsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists in-progress multipart uploads.
      */
    def listMultipartUploads(params: ListMultipartUploadsRequest): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMultipartUploads(
      params: ListMultipartUploadsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMultipartUploadsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about all of the versions of objects in a bucket.
      */
    def listObjectVersions(): awsDashSdkLib.libRequestMod.Request[ListObjectVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listObjectVersions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectVersionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns metadata about all of the versions of objects in a bucket.
      */
    def listObjectVersions(params: ListObjectVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListObjectVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listObjectVersions(
      params: ListObjectVersionsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectVersionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectVersionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
      */
    def listObjects(): awsDashSdkLib.libRequestMod.Request[ListObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listObjects(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket.
      */
    def listObjects(params: ListObjectsRequest): awsDashSdkLib.libRequestMod.Request[ListObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listObjects(
      params: ListObjectsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.
      */
    def listObjectsV2(): awsDashSdkLib.libRequestMod.Request[ListObjectsV2Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listObjectsV2(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectsV2Output, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectsV2Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns some or all (up to 1000) of the objects in a bucket. You can use the request parameters as selection criteria to return a subset of the objects in a bucket. Note: ListObjectsV2 is the revised List Objects API and we recommend you use this revised API for new application development.
      */
    def listObjectsV2(params: ListObjectsV2Request): awsDashSdkLib.libRequestMod.Request[ListObjectsV2Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listObjectsV2(
      params: ListObjectsV2Request,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListObjectsV2Output, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListObjectsV2Output, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the parts that have been uploaded for a specific multipart upload.
      */
    def listParts(): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listParts(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListPartsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the parts that have been uploaded for a specific multipart upload.
      */
    def listParts(params: ListPartsRequest): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listParts(
      params: ListPartsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListPartsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the accelerate configuration of an existing bucket.
      */
    def putBucketAccelerateConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketAccelerateConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the accelerate configuration of an existing bucket.
      */
    def putBucketAccelerateConfiguration(params: PutBucketAccelerateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketAccelerateConfiguration(
      params: PutBucketAccelerateConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the permissions on a bucket using access control lists (ACL).
      */
    def putBucketAcl(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketAcl(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the permissions on a bucket using access control lists (ACL).
      */
    def putBucketAcl(params: PutBucketAclRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketAcl(
      params: PutBucketAclRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets an analytics configuration for the bucket (specified by the analytics configuration ID).
      */
    def putBucketAnalyticsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketAnalyticsConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets an analytics configuration for the bucket (specified by the analytics configuration ID).
      */
    def putBucketAnalyticsConfiguration(params: PutBucketAnalyticsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketAnalyticsConfiguration(
      params: PutBucketAnalyticsConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the CORS configuration for a bucket.
      */
    def putBucketCors(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketCors(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the CORS configuration for a bucket.
      */
    def putBucketCors(params: PutBucketCorsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketCors(
      params: PutBucketCorsRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new server-side encryption configuration (or replaces an existing one, if present).
      */
    def putBucketEncryption(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketEncryption(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new server-side encryption configuration (or replaces an existing one, if present).
      */
    def putBucketEncryption(params: PutBucketEncryptionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketEncryption(
      params: PutBucketEncryptionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an inventory configuration (identified by the inventory ID) from the bucket.
      */
    def putBucketInventoryConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketInventoryConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an inventory configuration (identified by the inventory ID) from the bucket.
      */
    def putBucketInventoryConfiguration(params: PutBucketInventoryConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketInventoryConfiguration(
      params: PutBucketInventoryConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated, see the PutBucketLifecycleConfiguration operation.
      */
    def putBucketLifecycle(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketLifecycle(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated, see the PutBucketLifecycleConfiguration operation.
      */
    def putBucketLifecycle(params: PutBucketLifecycleRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketLifecycle(
      params: PutBucketLifecycleRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets lifecycle configuration for your bucket. If a lifecycle configuration exists, it replaces it.
      */
    def putBucketLifecycleConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketLifecycleConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets lifecycle configuration for your bucket. If a lifecycle configuration exists, it replaces it.
      */
    def putBucketLifecycleConfiguration(params: PutBucketLifecycleConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketLifecycleConfiguration(
      params: PutBucketLifecycleConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging parameters. To set the logging status of a bucket, you must be the bucket owner.
      */
    def putBucketLogging(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketLogging(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Set the logging parameters for a bucket and to specify permissions for who can view and modify the logging parameters. To set the logging status of a bucket, you must be the bucket owner.
      */
    def putBucketLogging(params: PutBucketLoggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketLogging(
      params: PutBucketLoggingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets a metrics configuration (specified by the metrics configuration ID) for the bucket.
      */
    def putBucketMetricsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketMetricsConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets a metrics configuration (specified by the metrics configuration ID) for the bucket.
      */
    def putBucketMetricsConfiguration(params: PutBucketMetricsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketMetricsConfiguration(
      params: PutBucketMetricsConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated, see the PutBucketNotificationConfiguraiton operation.
      */
    def putBucketNotification(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketNotification(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deprecated, see the PutBucketNotificationConfiguraiton operation.
      */
    def putBucketNotification(params: PutBucketNotificationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketNotification(
      params: PutBucketNotificationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables notifications of specified events for a bucket.
      */
    def putBucketNotificationConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketNotificationConfiguration(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Enables notifications of specified events for a bucket.
      */
    def putBucketNotificationConfiguration(params: PutBucketNotificationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketNotificationConfiguration(
      params: PutBucketNotificationConfigurationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces a policy on a bucket. If the bucket already has a policy, the one in this request completely replaces it.
      */
    def putBucketPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Replaces a policy on a bucket. If the bucket already has a policy, the one in this request completely replaces it.
      */
    def putBucketPolicy(params: PutBucketPolicyRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketPolicy(
      params: PutBucketPolicyRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a replication configuration or replaces an existing one. For more information, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
      */
    def putBucketReplication(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketReplication(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      *  Creates a replication configuration or replaces an existing one. For more information, see Cross-Region Replication (CRR) in the Amazon S3 Developer Guide. 
      */
    def putBucketReplication(params: PutBucketReplicationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketReplication(
      params: PutBucketReplicationRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the download will be charged for the download. Documentation on requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html
      */
    def putBucketRequestPayment(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketRequestPayment(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the request payment configuration for a bucket. By default, the bucket owner pays for downloads from the bucket. This configuration parameter enables the bucket owner (only) to specify that the person requesting the download will be charged for the download. Documentation on requester pays buckets can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html
      */
    def putBucketRequestPayment(params: PutBucketRequestPaymentRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketRequestPayment(
      params: PutBucketRequestPaymentRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the tags for a bucket.
      */
    def putBucketTagging(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketTagging(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the tags for a bucket.
      */
    def putBucketTagging(params: PutBucketTaggingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketTagging(
      params: PutBucketTaggingRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the versioning state of an existing bucket. To set the versioning state, you must be the bucket owner.
      */
    def putBucketVersioning(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketVersioning(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the versioning state of an existing bucket. To set the versioning state, you must be the bucket owner.
      */
    def putBucketVersioning(params: PutBucketVersioningRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketVersioning(
      params: PutBucketVersioningRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Set the website configuration for a bucket.
      */
    def putBucketWebsite(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketWebsite(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Set the website configuration for a bucket.
      */
    def putBucketWebsite(params: PutBucketWebsiteRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putBucketWebsite(
      params: PutBucketWebsiteRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an object to a bucket.
      */
    def putObject(): awsDashSdkLib.libRequestMod.Request[PutObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObject(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutObjectOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds an object to a bucket.
      */
    def putObject(params: PutObjectRequest): awsDashSdkLib.libRequestMod.Request[PutObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObject(
      params: PutObjectRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ PutObjectOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket
      */
    def putObjectAcl(): awsDashSdkLib.libRequestMod.Request[PutObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectAcl(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectAclOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * uses the acl subresource to set the access control list (ACL) permissions for an object that already exists in a bucket
      */
    def putObjectAcl(params: PutObjectAclRequest): awsDashSdkLib.libRequestMod.Request[PutObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectAcl(
      params: PutObjectAclRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectAclOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectAclOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a Legal Hold configuration to the specified object.
      */
    def putObjectLegalHold(): awsDashSdkLib.libRequestMod.Request[PutObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectLegalHold(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectLegalHoldOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Applies a Legal Hold configuration to the specified object.
      */
    def putObjectLegalHold(params: PutObjectLegalHoldRequest): awsDashSdkLib.libRequestMod.Request[PutObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectLegalHold(
      params: PutObjectLegalHoldRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectLegalHoldOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectLegalHoldOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.
      */
    def putObjectLockConfiguration(): awsDashSdkLib.libRequestMod.Request[PutObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectLockConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectLockConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Places an Object Lock configuration on the specified bucket. The rule specified in the Object Lock configuration will be applied by default to every new object placed in the specified bucket.
      */
    def putObjectLockConfiguration(params: PutObjectLockConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectLockConfiguration(
      params: PutObjectLockConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectLockConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectLockConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Places an Object Retention configuration on an object.
      */
    def putObjectRetention(): awsDashSdkLib.libRequestMod.Request[PutObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectRetention(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectRetentionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Places an Object Retention configuration on an object.
      */
    def putObjectRetention(params: PutObjectRetentionRequest): awsDashSdkLib.libRequestMod.Request[PutObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectRetention(
      params: PutObjectRetentionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectRetentionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectRetentionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the supplied tag-set to an object that already exists in a bucket
      */
    def putObjectTagging(): awsDashSdkLib.libRequestMod.Request[PutObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectTagging(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectTaggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the supplied tag-set to an object that already exists in a bucket
      */
    def putObjectTagging(params: PutObjectTaggingRequest): awsDashSdkLib.libRequestMod.Request[PutObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putObjectTagging(
      params: PutObjectTaggingRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutObjectTaggingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutObjectTaggingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or modifies the PublicAccessBlock configuration for an Amazon S3 bucket.
      */
    def putPublicAccessBlock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putPublicAccessBlock(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or modifies the PublicAccessBlock configuration for an Amazon S3 bucket.
      */
    def putPublicAccessBlock(params: PutPublicAccessBlockRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putPublicAccessBlock(
      params: PutPublicAccessBlockRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores an archived copy of an object back into Amazon S3
      */
    def restoreObject(): awsDashSdkLib.libRequestMod.Request[RestoreObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreObject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restores an archived copy of an object back into Amazon S3
      */
    def restoreObject(params: RestoreObjectRequest): awsDashSdkLib.libRequestMod.Request[RestoreObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restoreObject(
      params: RestoreObjectRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestoreObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestoreObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.
      */
    def selectObjectContent(): awsDashSdkLib.libRequestMod.Request[SelectObjectContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def selectObjectContent(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SelectObjectContentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SelectObjectContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation filters the contents of an Amazon S3 object based on a simple Structured Query Language (SQL) statement. In the request, along with the SQL expression, you must also specify a data serialization format (JSON or CSV) of the object. Amazon S3 uses this to parse object data into records, and returns only records that match the specified SQL expression. You must also specify the data serialization format for the response.
      */
    def selectObjectContent(params: SelectObjectContentRequest): awsDashSdkLib.libRequestMod.Request[SelectObjectContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def selectObjectContent(
      params: SelectObjectContentRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SelectObjectContentOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SelectObjectContentOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads a part in a multipart upload.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
      */
    def uploadPart(): awsDashSdkLib.libRequestMod.Request[UploadPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadPart(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadPartOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads a part in a multipart upload.  Note: After you initiate multipart upload and upload one or more parts, you must either complete or abort multipart upload in order to stop getting charged for storage of the uploaded parts. Only after you either complete or abort multipart upload, Amazon S3 frees up the parts storage and stops charging you for the parts storage.
      */
    def uploadPart(params: UploadPartRequest): awsDashSdkLib.libRequestMod.Request[UploadPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadPart(
      params: UploadPartRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadPartOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads a part by copying data from an existing object as data source.
      */
    def uploadPartCopy(): awsDashSdkLib.libRequestMod.Request[UploadPartCopyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadPartCopy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadPartCopyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadPartCopyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uploads a part by copying data from an existing object as data source.
      */
    def uploadPartCopy(params: UploadPartCopyRequest): awsDashSdkLib.libRequestMod.Request[UploadPartCopyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadPartCopy(
      params: UploadPartCopyRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadPartCopyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadPartCopyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the bucketExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_bucketExists(state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_bucketExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the bucketExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_bucketExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists,
      params: HeadBucketRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_bucketExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.bucketExists,
      params: HeadBucketRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the bucketNotExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_bucketNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_bucketNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the bucketNotExists state by periodically calling the underlying S3.headBucketoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_bucketNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists,
      params: HeadBucketRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_bucketNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.bucketNotExists,
      params: HeadBucketRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the objectExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_objectExists(state: awsDashSdkLib.awsDashSdkLibStrings.objectExists): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_objectExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HeadObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the objectExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_objectExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
      params: HeadObjectRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_objectExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.objectExists,
      params: HeadObjectRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HeadObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the objectNotExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_objectNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_objectNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HeadObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the objectNotExists state by periodically calling the underlying S3.headObjectoperation every 5 seconds (at most 20 times).
      */
    @JSName("waitFor")
    def waitFor_objectNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
      params: HeadObjectRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_objectNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.objectNotExists,
      params: HeadObjectRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ HeadObjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[HeadObjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UploadPartCopyOutput extends js.Object {
    var CopyPartResult: js.UndefOr[CopyPartResult] = js.undefined
    /**
      * The version of the source object that was copied, if you have enabled versioning on the source bucket.
      */
    var CopySourceVersionId: js.UndefOr[CopySourceVersionId] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
  }
  
  trait UploadPartCopyRequest extends js.Object {
    var Bucket: BucketName
    /**
      * The name of the source bucket and key name of the source object, separated by a slash (/). Must be URL-encoded.
      */
    var CopySource: CopySource
    /**
      * Copies the object if its entity tag (ETag) matches the specified tag.
      */
    var CopySourceIfMatch: js.UndefOr[CopySourceIfMatch] = js.undefined
    /**
      * Copies the object if it has been modified since the specified time.
      */
    var CopySourceIfModifiedSince: js.UndefOr[CopySourceIfModifiedSince] = js.undefined
    /**
      * Copies the object if its entity tag (ETag) is different than the specified ETag.
      */
    var CopySourceIfNoneMatch: js.UndefOr[CopySourceIfNoneMatch] = js.undefined
    /**
      * Copies the object if it hasn't been modified since the specified time.
      */
    var CopySourceIfUnmodifiedSince: js.UndefOr[CopySourceIfUnmodifiedSince] = js.undefined
    /**
      * The range of bytes to copy from the source object. The range value must use the form bytes=first-last, where the first and last are the zero-based byte offsets to copy. For example, bytes=0-9 indicates that you want to copy the first ten bytes of the source. You can copy a range only if the source object is greater than 5 GB.
      */
    var CopySourceRange: js.UndefOr[CopySourceRange] = js.undefined
    /**
      * Specifies the algorithm to use when decrypting the source object (e.g., AES256).
      */
    var CopySourceSSECustomerAlgorithm: js.UndefOr[CopySourceSSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source object. The encryption key provided in this header must be one that was used when the source object was created.
      */
    var CopySourceSSECustomerKey: js.UndefOr[CopySourceSSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var CopySourceSSECustomerKeyMD5: js.UndefOr[CopySourceSSECustomerKeyMD5] = js.undefined
    var Key: ObjectKey
    /**
      * Part number of part being copied. This is a positive integer between 1 and 10,000.
      */
    var PartNumber: PartNumber
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header. This must be the same encryption key specified in the initiate multipart upload request.
      */
    var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * Upload ID identifying the multipart upload whose part is being copied.
      */
    var UploadId: MultipartUploadId
  }
  
  trait UploadPartOutput extends js.Object {
    /**
      * Entity tag for the uploaded object.
      */
    var ETag: js.UndefOr[ETag] = js.undefined
    var RequestCharged: js.UndefOr[RequestCharged] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.
      */
    var SSEKMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
    /**
      * The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).
      */
    var ServerSideEncryption: js.UndefOr[ServerSideEncryption] = js.undefined
  }
  
  trait UploadPartRequest extends js.Object {
    /**
      * Object data.
      */
    var Body: js.UndefOr[Body] = js.undefined
    /**
      * Name of the bucket to which the multipart upload was initiated.
      */
    var Bucket: BucketName
    /**
      * Size of the body in bytes. This parameter is useful when the size of the body cannot be determined automatically.
      */
    var ContentLength: js.UndefOr[ContentLength] = js.undefined
    /**
      * The base64-encoded 128-bit MD5 digest of the part data.
      */
    var ContentMD5: js.UndefOr[ContentMD5] = js.undefined
    /**
      * Object key for which the multipart upload was initiated.
      */
    var Key: ObjectKey
    /**
      * Part number of part being uploaded. This is a positive integer between 1 and 10,000.
      */
    var PartNumber: PartNumber
    var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
    /**
      * Specifies the algorithm to use to when encrypting the object (e.g., AES256).
      */
    var SSECustomerAlgorithm: js.UndefOr[SSECustomerAlgorithm] = js.undefined
    /**
      * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header. This must be the same encryption key specified in the initiate multipart upload request.
      */
    var SSECustomerKey: js.UndefOr[SSECustomerKey] = js.undefined
    /**
      * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure the encryption key was transmitted without error.
      */
    var SSECustomerKeyMD5: js.UndefOr[SSECustomerKeyMD5] = js.undefined
    /**
      * Upload ID identifying the multipart upload whose part is being uploaded.
      */
    var UploadId: MultipartUploadId
  }
  
  trait VersioningConfiguration extends js.Object {
    /**
      * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
      */
    var MFADelete: js.UndefOr[MFADelete] = js.undefined
    /**
      * The versioning state of the bucket.
      */
    var Status: js.UndefOr[BucketVersioningStatus] = js.undefined
  }
  
  trait WebsiteConfiguration extends js.Object {
    var ErrorDocument: js.UndefOr[ErrorDocument] = js.undefined
    var IndexDocument: js.UndefOr[IndexDocument] = js.undefined
    var RedirectAllRequestsTo: js.UndefOr[RedirectAllRequestsTo] = js.undefined
    var RoutingRules: js.UndefOr[RoutingRules] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  @js.native
  object ManagedUpload extends js.Object {
    /**
      * Default value: 10000
      */
    var maxTotalParts: scala.Double = js.native
    /**
      * Returns the minimum number of bytes for an individual part upload.
      * Note: Minimum allowed size is 5 MB.
      * 1024 * 5
      */
    var minPartSize: scala.Double = js.native
  }
  
  @JSName("ManagedUpload")
  @js.native
  object ManagedUploadNs extends js.Object {
    trait ManagedUploadOptions extends js.Object {
      /**
        * Default: false
        * Whether to abort the multipart upload if an error occurs. Set to true if you want to handle failures manually.
        */
      var leavePartsOnError: js.UndefOr[scala.Boolean] = js.undefined
      /**
        * A map of parameters to pass to the upload requests.
        * The "Body" parameter is required to be specified either on the service or in the params option.
        */
      var params: js.UndefOr[awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRequest] = js.undefined
      /**
        * Default: 5 mb
        * The size in bytes for each individual part to be uploaded. Adjust the part size to ensure the number of parts does not exceed maxTotalParts. See minPartSize for the minimum allowed part size.
        */
      var partSize: js.UndefOr[scala.Double] = js.undefined
      /**
        * The size of the concurrent queue manager to upload parts in parallel. Set to 1 for synchronous uploading of parts. Note that the uploader will buffer at most queueSize * partSize bytes into memory at any given time.
        * default: 4
        */
      var queueSize: js.UndefOr[scala.Double] = js.undefined
      /**
        * An optional S3 service object to use for requests.
        * This object might have bound parameters used by the uploader.
        */
      var service: js.UndefOr[awsDashSdkLib.clientsS3Mod.namespaced] = js.undefined
      /**
        * The tags to apply to the object.
        */
      var tags: js.UndefOr[js.Array[awsDashSdkLib.clientsS3Mod.S3Ns.Tag]] = js.undefined
    }
    
    trait Progress extends js.Object {
      var loaded: scala.Double
      var total: scala.Double
    }
    
    trait SendData extends js.Object {
      /**
        * Bucket to which the object was uploaded.
        */
      var Bucket: java.lang.String
      /**
        * ETag of the uploaded object.
        */
      var ETag: java.lang.String
      /**
        * Key to which the object was uploaded.
        */
      var Key: java.lang.String
      /**
        * URL of the uploaded object.
        */
      var Location: java.lang.String
    }
    
  }
  
  @JSName("PresignedPost")
  @js.native
  object PresignedPostNs extends js.Object {
    trait Fields
      extends /**
      * Additional keys that must be included in the form to be submitted. This
      * will include signature metadata as well as any fields provided to
      * s3.createPresignedPost
      */
    /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
      /**
        * A base64-encoded policy detailing what constitutes an acceptable POST
        * upload. Composed of the conditions and expiration provided to
        * s3.createPresignedPost
        */
      var Policy: java.lang.String
      /**
        * A hex-encoded HMAC of the POST policy, signed with the credentials
        * provided to the S3 client.
        */
      var `X-Amz-Signature`: java.lang.String
    }
    
    trait Params extends js.Object {
      /**
        * The S3 bucket to which the form should upload an attached file.
        */
      var Bucket: js.UndefOr[java.lang.String] = js.undefined
      /**
        * An array of conditions that must be met for the form upload to be
        * accepted by S3.
        */
      var Conditions: js.UndefOr[
            js.Array[
              org.scalablytyped.runtime.StringDictionary[_] | (js.Tuple3[java.lang.String, _, _])
            ]
          ] = js.undefined
      /**
        * The number of seconds for which the POST form's signed policy should be
        * valid. Defaults to 3600 (one hour).
        */
      var Expires: js.UndefOr[scala.Double] = js.undefined
      /**
        * A hash of form fields to include in the presigned POST form. All fields
        * (except 'key') will be included as exact match conditions in the
        * presigned policy.
        */
      var Fields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    }
    
  }
  
  type AbortDate = stdLib.Date
  type AbortRuleId = java.lang.String
  type AcceptRanges = java.lang.String
  type AccountId = java.lang.String
  type AllowQuotedRecordDelimiter = scala.Boolean
  type AllowedHeader = java.lang.String
  type AllowedHeaders = js.Array[AllowedHeader]
  type AllowedMethod = java.lang.String
  type AllowedMethods = js.Array[AllowedMethod]
  type AllowedOrigin = java.lang.String
  type AllowedOrigins = js.Array[AllowedOrigin]
  type AnalyticsConfigurationList = js.Array[AnalyticsConfiguration]
  type AnalyticsId = java.lang.String
  type AnalyticsS3ExportFileFormat = awsDashSdkLib.awsDashSdkLibStrings.CSV | java.lang.String
  type Body = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsS3Mod.Blob | java.lang.String | nodeLib.streamMod.Readable
  type BucketAccelerateStatus = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Suspended | java.lang.String
  type BucketCannedACL = awsDashSdkLib.awsDashSdkLibStrings.`private` | awsDashSdkLib.awsDashSdkLibStrings.`public-read` | awsDashSdkLib.awsDashSdkLibStrings.`public-read-write` | awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read` | java.lang.String
  type BucketLocationConstraint = awsDashSdkLib.awsDashSdkLibStrings.EU | awsDashSdkLib.awsDashSdkLibStrings.`eu-west-1` | awsDashSdkLib.awsDashSdkLibStrings.`us-west-1` | awsDashSdkLib.awsDashSdkLibStrings.`us-west-2` | awsDashSdkLib.awsDashSdkLibStrings.`ap-south-1` | awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-1` | awsDashSdkLib.awsDashSdkLibStrings.`ap-southeast-2` | awsDashSdkLib.awsDashSdkLibStrings.`ap-northeast-1` | awsDashSdkLib.awsDashSdkLibStrings.`sa-east-1` | awsDashSdkLib.awsDashSdkLibStrings.`cn-north-1` | awsDashSdkLib.awsDashSdkLibStrings.`eu-central-1` | java.lang.String
  type BucketLogsPermission = awsDashSdkLib.awsDashSdkLibStrings.FULL_CONTROL | awsDashSdkLib.awsDashSdkLibStrings.READ | awsDashSdkLib.awsDashSdkLibStrings.WRITE | java.lang.String
  type BucketName = java.lang.String
  type BucketVersioningStatus = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Suspended | java.lang.String
  type Buckets = js.Array[Bucket]
  type BypassGovernanceRetention = scala.Boolean
  type BytesProcessed = scala.Double
  type BytesReturned = scala.Double
  type BytesScanned = scala.Double
  type CORSRules = js.Array[CORSRule]
  type CacheControl = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with awsDashSdkLib.libConfigUnderscoreUseUnderscoreDualstackMod.UseDualstackConfigOptions with ClientApiVersions
  type CloudFunction = java.lang.String
  type CloudFunctionInvocationRole = java.lang.String
  type Code = java.lang.String
  type Comments = java.lang.String
  type CommonPrefixList = js.Array[CommonPrefix]
  type CompletedPartList = js.Array[CompletedPart]
  type CompressionType = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.GZIP | awsDashSdkLib.awsDashSdkLibStrings.BZIP2 | java.lang.String
  type ConfirmRemoveSelfBucketAccess = scala.Boolean
  type ContentDisposition = java.lang.String
  type ContentEncoding = java.lang.String
  type ContentLanguage = java.lang.String
  type ContentLength = scala.Double
  type ContentMD5 = java.lang.String
  type ContentRange = java.lang.String
  type ContentType = java.lang.String
  type CopySource = java.lang.String
  type CopySourceIfMatch = java.lang.String
  type CopySourceIfModifiedSince = stdLib.Date
  type CopySourceIfNoneMatch = java.lang.String
  type CopySourceIfUnmodifiedSince = stdLib.Date
  type CopySourceRange = java.lang.String
  type CopySourceSSECustomerAlgorithm = java.lang.String
  type CopySourceSSECustomerKey = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsS3Mod.Blob | java.lang.String
  type CopySourceSSECustomerKeyMD5 = java.lang.String
  type CopySourceVersionId = java.lang.String
  type CreationDate = stdLib.Date
  type Days = scala.Double
  type DaysAfterInitiation = scala.Double
  type DeleteMarker = scala.Boolean
  type DeleteMarkerReplicationStatus = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | java.lang.String
  type DeleteMarkerVersionId = java.lang.String
  type DeleteMarkers = js.Array[DeleteMarkerEntry]
  type DeletedObjects = js.Array[DeletedObject]
  type Delimiter = java.lang.String
  type Description = java.lang.String
  type DisplayName = java.lang.String
  type ETag = java.lang.String
  type EmailAddress = java.lang.String
  type EnableRequestProgress = scala.Boolean
  type EncodingType = awsDashSdkLib.awsDashSdkLibStrings.url | java.lang.String
  type Errors = js.Array[Error]
  type Event = awsDashSdkLib.awsDashSdkLibStrings.`s3:ReducedRedundancyLostObject` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:*` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:Put` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:Post` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:Copy` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectCreated:CompleteMultipartUpload` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRemoved:*` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRemoved:Delete` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRemoved:DeleteMarkerCreated` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRestore:Post` | awsDashSdkLib.awsDashSdkLibStrings.`s3:ObjectRestore:Completed` | java.lang.String
  type EventList = js.Array[Event]
  type Expiration = java.lang.String
  type ExpirationStatus = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | java.lang.String
  type ExpiredObjectDeleteMarker = scala.Boolean
  type Expires = stdLib.Date
  type ExposeHeader = java.lang.String
  type ExposeHeaders = js.Array[ExposeHeader]
  type Expression = java.lang.String
  type ExpressionType = awsDashSdkLib.awsDashSdkLibStrings.SQL | java.lang.String
  type FetchOwner = scala.Boolean
  type FieldDelimiter = java.lang.String
  type FileHeaderInfo = awsDashSdkLib.awsDashSdkLibStrings.USE | awsDashSdkLib.awsDashSdkLibStrings.IGNORE | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type FilterRuleList = js.Array[FilterRule]
  type FilterRuleName = awsDashSdkLib.awsDashSdkLibStrings.prefix | awsDashSdkLib.awsDashSdkLibStrings.suffix | java.lang.String
  type FilterRuleValue = java.lang.String
  type GrantFullControl = java.lang.String
  type GrantRead = java.lang.String
  type GrantReadACP = java.lang.String
  type GrantWrite = java.lang.String
  type GrantWriteACP = java.lang.String
  type Grants = js.Array[Grant]
  type HostName = java.lang.String
  type HttpErrorCodeReturnedEquals = java.lang.String
  type HttpRedirectCode = java.lang.String
  type ID = java.lang.String
  type IfMatch = java.lang.String
  type IfModifiedSince = stdLib.Date
  type IfNoneMatch = java.lang.String
  type IfUnmodifiedSince = stdLib.Date
  type Initiated = stdLib.Date
  type InventoryConfigurationList = js.Array[InventoryConfiguration]
  type InventoryFormat = awsDashSdkLib.awsDashSdkLibStrings.CSV | awsDashSdkLib.awsDashSdkLibStrings.ORC | awsDashSdkLib.awsDashSdkLibStrings.Parquet | java.lang.String
  type InventoryFrequency = awsDashSdkLib.awsDashSdkLibStrings.Daily | awsDashSdkLib.awsDashSdkLibStrings.Weekly | java.lang.String
  type InventoryId = java.lang.String
  type InventoryIncludedObjectVersions = awsDashSdkLib.awsDashSdkLibStrings.All | awsDashSdkLib.awsDashSdkLibStrings.Current | java.lang.String
  type InventoryOptionalField = awsDashSdkLib.awsDashSdkLibStrings.Size | awsDashSdkLib.awsDashSdkLibStrings.LastModifiedDate | awsDashSdkLib.awsDashSdkLibStrings.StorageClass | awsDashSdkLib.awsDashSdkLibStrings.ETag | awsDashSdkLib.awsDashSdkLibStrings.IsMultipartUploaded | awsDashSdkLib.awsDashSdkLibStrings.ReplicationStatus | awsDashSdkLib.awsDashSdkLibStrings.EncryptionStatus | awsDashSdkLib.awsDashSdkLibStrings.ObjectLockRetainUntilDate | awsDashSdkLib.awsDashSdkLibStrings.ObjectLockMode | awsDashSdkLib.awsDashSdkLibStrings.ObjectLockLegalHoldStatus | java.lang.String
  type InventoryOptionalFields = js.Array[InventoryOptionalField]
  type IsEnabled = scala.Boolean
  type IsLatest = scala.Boolean
  type IsPublic = scala.Boolean
  type IsTruncated = scala.Boolean
  type JSONType = awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT | awsDashSdkLib.awsDashSdkLibStrings.LINES | java.lang.String
  type KMSContext = java.lang.String
  type KeyCount = scala.Double
  type KeyMarker = java.lang.String
  type KeyPrefixEquals = java.lang.String
  type LambdaFunctionArn = java.lang.String
  type LambdaFunctionConfigurationList = js.Array[LambdaFunctionConfiguration]
  type LastModified = stdLib.Date
  type LifecycleRules = js.Array[LifecycleRule]
  type Location = java.lang.String
  type LocationPrefix = java.lang.String
  type MFA = java.lang.String
  type MFADelete = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | java.lang.String
  type MFADeleteStatus = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | java.lang.String
  type Marker = java.lang.String
  type MaxAgeSeconds = scala.Double
  type MaxKeys = scala.Double
  type MaxParts = scala.Double
  type MaxUploads = scala.Double
  type Message = java.lang.String
  type MetadataDirective = awsDashSdkLib.awsDashSdkLibStrings.COPY | awsDashSdkLib.awsDashSdkLibStrings.REPLACE | java.lang.String
  type MetadataKey = java.lang.String
  type MetadataValue = java.lang.String
  type MetricsConfigurationList = js.Array[MetricsConfiguration]
  type MetricsId = java.lang.String
  type MissingMeta = scala.Double
  type MultipartUploadId = java.lang.String
  type MultipartUploadList = js.Array[MultipartUpload]
  type NextKeyMarker = java.lang.String
  type NextMarker = java.lang.String
  type NextPartNumberMarker = scala.Double
  type NextToken = java.lang.String
  type NextUploadIdMarker = java.lang.String
  type NextVersionIdMarker = java.lang.String
  type NoncurrentVersionTransitionList = js.Array[NoncurrentVersionTransition]
  type NotificationId = java.lang.String
  type ObjectCannedACL = awsDashSdkLib.awsDashSdkLibStrings.`private` | awsDashSdkLib.awsDashSdkLibStrings.`public-read` | awsDashSdkLib.awsDashSdkLibStrings.`public-read-write` | awsDashSdkLib.awsDashSdkLibStrings.`authenticated-read` | awsDashSdkLib.awsDashSdkLibStrings.`aws-exec-read` | awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-read` | awsDashSdkLib.awsDashSdkLibStrings.`bucket-owner-full-control` | java.lang.String
  type ObjectIdentifierList = js.Array[ObjectIdentifier]
  type ObjectKey = java.lang.String
  type ObjectList = js.Array[Object]
  type ObjectLockEnabled = awsDashSdkLib.awsDashSdkLibStrings.Enabled | java.lang.String
  type ObjectLockEnabledForBucket = scala.Boolean
  type ObjectLockLegalHoldStatus = awsDashSdkLib.awsDashSdkLibStrings.ON | awsDashSdkLib.awsDashSdkLibStrings.OFF | java.lang.String
  type ObjectLockMode = awsDashSdkLib.awsDashSdkLibStrings.GOVERNANCE | awsDashSdkLib.awsDashSdkLibStrings.COMPLIANCE | java.lang.String
  type ObjectLockRetainUntilDate = stdLib.Date
  type ObjectLockRetentionMode = awsDashSdkLib.awsDashSdkLibStrings.GOVERNANCE | awsDashSdkLib.awsDashSdkLibStrings.COMPLIANCE | java.lang.String
  type ObjectLockToken = java.lang.String
  type ObjectStorageClass = awsDashSdkLib.awsDashSdkLibStrings.STANDARD | awsDashSdkLib.awsDashSdkLibStrings.REDUCED_REDUNDANCY | awsDashSdkLib.awsDashSdkLibStrings.GLACIER | awsDashSdkLib.awsDashSdkLibStrings.STANDARD_IA | awsDashSdkLib.awsDashSdkLibStrings.ONEZONE_IA | awsDashSdkLib.awsDashSdkLibStrings.INTELLIGENT_TIERING | java.lang.String
  type ObjectVersionId = java.lang.String
  type ObjectVersionList = js.Array[ObjectVersion]
  type ObjectVersionStorageClass = awsDashSdkLib.awsDashSdkLibStrings.STANDARD | java.lang.String
  type OwnerOverride = awsDashSdkLib.awsDashSdkLibStrings.Destination | java.lang.String
  type PartNumber = scala.Double
  type PartNumberMarker = scala.Double
  type Parts = js.Array[Part]
  type PartsCount = scala.Double
  type Payer = awsDashSdkLib.awsDashSdkLibStrings.Requester | awsDashSdkLib.awsDashSdkLibStrings.BucketOwner | java.lang.String
  type Permission = awsDashSdkLib.awsDashSdkLibStrings.FULL_CONTROL | awsDashSdkLib.awsDashSdkLibStrings.WRITE | awsDashSdkLib.awsDashSdkLibStrings.WRITE_ACP | awsDashSdkLib.awsDashSdkLibStrings.READ | awsDashSdkLib.awsDashSdkLibStrings.READ_ACP | java.lang.String
  type Policy = java.lang.String
  type Prefix = java.lang.String
  type Priority = scala.Double
  type Protocol = awsDashSdkLib.awsDashSdkLibStrings.http | awsDashSdkLib.awsDashSdkLibStrings.https | java.lang.String
  type QueueArn = java.lang.String
  type QueueConfigurationList = js.Array[QueueConfiguration]
  type Quiet = scala.Boolean
  type QuoteCharacter = java.lang.String
  type QuoteEscapeCharacter = java.lang.String
  type QuoteFields = awsDashSdkLib.awsDashSdkLibStrings.ALWAYS | awsDashSdkLib.awsDashSdkLibStrings.ASNEEDED | java.lang.String
  type Range = java.lang.String
  type RecordDelimiter = java.lang.String
  type ReplaceKeyPrefixWith = java.lang.String
  type ReplaceKeyWith = java.lang.String
  type ReplicaKmsKeyID = java.lang.String
  type ReplicationRuleStatus = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | java.lang.String
  type ReplicationRules = js.Array[ReplicationRule]
  type ReplicationStatus = awsDashSdkLib.awsDashSdkLibStrings.COMPLETE | awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.REPLICA | java.lang.String
  type RequestCharged = awsDashSdkLib.awsDashSdkLibStrings.requester | java.lang.String
  type RequestPayer = awsDashSdkLib.awsDashSdkLibStrings.requester | java.lang.String
  type ResponseCacheControl = java.lang.String
  type ResponseContentDisposition = java.lang.String
  type ResponseContentEncoding = java.lang.String
  type ResponseContentLanguage = java.lang.String
  type ResponseContentType = java.lang.String
  type ResponseExpires = stdLib.Date
  type Restore = java.lang.String
  type RestoreOutputPath = java.lang.String
  type RestoreRequestType = awsDashSdkLib.awsDashSdkLibStrings.SELECT | java.lang.String
  type Role = java.lang.String
  type RoutingRules = js.Array[RoutingRule]
  type Rules = js.Array[Rule]
  type SSECustomerAlgorithm = java.lang.String
  type SSECustomerKey = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsS3Mod.Blob | java.lang.String
  type SSECustomerKeyMD5 = java.lang.String
  type SSEKMSKeyId = java.lang.String
  type SelectObjectContentEventStream = awsDashSdkLib.libEventDashStreamEventDashStreamMod.EventStream[awsDashSdkLib.Anon_Cont]
  type ServerSideEncryption = awsDashSdkLib.awsDashSdkLibStrings.AES256 | awsDashSdkLib.awsDashSdkLibStrings.`aws:kms` | java.lang.String
  type ServerSideEncryptionRules = js.Array[ServerSideEncryptionRule]
  type Setting = scala.Boolean
  type Size = scala.Double
  type SseKmsEncryptedObjectsStatus = awsDashSdkLib.awsDashSdkLibStrings.Enabled | awsDashSdkLib.awsDashSdkLibStrings.Disabled | java.lang.String
  type StartAfter = java.lang.String
  type StorageClass = awsDashSdkLib.awsDashSdkLibStrings.STANDARD | awsDashSdkLib.awsDashSdkLibStrings.REDUCED_REDUNDANCY | awsDashSdkLib.awsDashSdkLibStrings.STANDARD_IA | awsDashSdkLib.awsDashSdkLibStrings.ONEZONE_IA | awsDashSdkLib.awsDashSdkLibStrings.INTELLIGENT_TIERING | awsDashSdkLib.awsDashSdkLibStrings.GLACIER | java.lang.String
  type StorageClassAnalysisSchemaVersion = awsDashSdkLib.awsDashSdkLibStrings.V_1 | java.lang.String
  type Suffix = java.lang.String
  type TagCount = scala.Double
  type TagSet = js.Array[Tag]
  type TaggingDirective = awsDashSdkLib.awsDashSdkLibStrings.COPY | awsDashSdkLib.awsDashSdkLibStrings.REPLACE | java.lang.String
  type TaggingHeader = java.lang.String
  type TargetBucket = java.lang.String
  type TargetGrants = js.Array[TargetGrant]
  type TargetPrefix = java.lang.String
  type Tier = awsDashSdkLib.awsDashSdkLibStrings.Standard | awsDashSdkLib.awsDashSdkLibStrings.Bulk | awsDashSdkLib.awsDashSdkLibStrings.Expedited | java.lang.String
  type Token = java.lang.String
  type TopicArn = java.lang.String
  type TopicConfigurationList = js.Array[TopicConfiguration]
  type TransitionList = js.Array[Transition]
  type TransitionStorageClass = awsDashSdkLib.awsDashSdkLibStrings.GLACIER | awsDashSdkLib.awsDashSdkLibStrings.STANDARD_IA | awsDashSdkLib.awsDashSdkLibStrings.ONEZONE_IA | awsDashSdkLib.awsDashSdkLibStrings.INTELLIGENT_TIERING | java.lang.String
  type Type = awsDashSdkLib.awsDashSdkLibStrings.CanonicalUser | awsDashSdkLib.awsDashSdkLibStrings.AmazonCustomerByEmail | awsDashSdkLib.awsDashSdkLibStrings.Group | java.lang.String
  type URI = java.lang.String
  type UploadIdMarker = java.lang.String
  type UserMetadata = js.Array[MetadataEntry]
  type Value = java.lang.String
  type VersionIdMarker = java.lang.String
  type WebsiteRedirectLocation = java.lang.String
  type Years = scala.Double
  type _Date = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2006-03-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

