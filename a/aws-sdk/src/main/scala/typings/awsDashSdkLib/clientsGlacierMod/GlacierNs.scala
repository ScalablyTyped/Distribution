package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/glacier", "Glacier")
@js.native
object GlacierNs extends js.Object {
  trait AbortMultipartUploadInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The upload ID of the multipart upload to delete.
      */
    var uploadId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait AbortVaultLockInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait AddTagsToVaultInput extends js.Object {
    /**
      * The tags to add to the vault. Each tag is composed of a key and a value. The value can be an empty string.
      */
    var Tags: js.UndefOr[TagMap] = js.undefined
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait ArchiveCreationOutput extends js.Object {
    /**
      * The ID of the archive. This value is also included as part of the location.
      */
    var archiveId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The checksum of the archive computed by Amazon Glacier.
      */
    var checksum: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The relative URI path of the newly added archive resource.
      */
    var location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CSVInput extends js.Object {
    /**
      * A single character used to indicate that a row should be ignored when the character is present at the start of that row.
      */
    var Comments: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A value used to separate individual fields from each other within a record.
      */
    var FieldDelimiter: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Describes the first line of input. Valid values are None, Ignore, and Use.
      */
    var FileHeaderInfo: js.UndefOr[FileHeaderInfo] = js.undefined
    /**
      * A value used as an escape character where the field delimiter is part of the value.
      */
    var QuoteCharacter: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A single character used for escaping the quotation-mark character inside an already escaped value.
      */
    var QuoteEscapeCharacter: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A value used to separate individual records from each other.
      */
    var RecordDelimiter: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait CSVOutput extends js.Object {
    /**
      * A value used to separate individual fields from each other within a record.
      */
    var FieldDelimiter: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A value used as an escape character where the field delimiter is part of the value.
      */
    var QuoteCharacter: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A single character used for escaping the quotation-mark character inside an already escaped value.
      */
    var QuoteEscapeCharacter: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A value that indicates whether all output fields should be contained within quotation marks.
      */
    var QuoteFields: js.UndefOr[QuoteFields] = js.undefined
    /**
      * A value used to separate individual records from each other.
      */
    var RecordDelimiter: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CompleteMultipartUploadInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The total size, in bytes, of the entire archive. This value should be the sum of all the sizes of the individual parts that you uploaded.
      */
    var archiveSize: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The SHA256 tree hash of the entire archive. It is the tree hash of SHA256 tree hash of the individual parts. If the value you specify in the request does not match the SHA256 tree hash of the final assembled archive as computed by Amazon Glacier, Amazon Glacier returns an error and the request fails.
      */
    var checksum: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The upload ID of the multipart upload.
      */
    var uploadId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait CompleteVaultLockInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The lockId value is the lock ID obtained from a InitiateVaultLock request.
      */
    var lockId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait CreateVaultInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait CreateVaultOutput extends js.Object {
    /**
      * The URI of the vault that was created.
      */
    var location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DataRetrievalPolicy extends js.Object {
    /**
      * The policy rule. Although this is a list type, currently there must be only one rule, which contains a Strategy field and optionally a BytesPerHour field.
      */
    var Rules: js.UndefOr[DataRetrievalRulesList] = js.undefined
  }
  
  trait DataRetrievalRule extends js.Object {
    /**
      * The maximum number of bytes that can be retrieved in an hour. This field is required only if the value of the Strategy field is BytesPerHour. Your PUT operation will be rejected if the Strategy field is not set to BytesPerHour and you set this field.
      */
    var BytesPerHour: js.UndefOr[NullableLong] = js.undefined
    /**
      * The type of data retrieval policy to set. Valid values: BytesPerHour|FreeTier|None
      */
    var Strategy: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait DeleteArchiveInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The ID of the archive to delete.
      */
    var archiveId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait DeleteVaultAccessPolicyInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait DeleteVaultInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait DeleteVaultNotificationsInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait DescribeJobInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The ID of the job to describe.
      */
    var jobId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait DescribeVaultInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait DescribeVaultOutput extends js.Object {
    /**
      * The Universal Coordinated Time (UTC) date when the vault was created. This value should be a string in the ISO 8601 date format, for example 2012-03-20T17:03:43.221Z.
      */
    var CreationDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Universal Coordinated Time (UTC) date when Amazon Glacier completed the last vault inventory. This value should be a string in the ISO 8601 date format, for example 2012-03-20T17:03:43.221Z.
      */
    var LastInventoryDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The number of archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.
      */
    var NumberOfArchives: js.UndefOr[long] = js.undefined
    /**
      * Total size, in bytes, of the archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.
      */
    var SizeInBytes: js.UndefOr[long] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the vault.
      */
    var VaultARN: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the vault.
      */
    var VaultName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Encryption extends js.Object {
    /**
      * The server-side encryption algorithm used when storing job results in Amazon S3, for example AES256 or aws:kms.
      */
    var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
    /**
      * Optional. If the encryption type is aws:kms, you can use this value to specify the encryption context for the job results.
      */
    var KMSContext: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4. 
      */
    var KMSKeyId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetDataRetrievalPolicyInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
  }
  
  trait GetDataRetrievalPolicyOutput extends js.Object {
    /**
      * Contains the returned data retrieval policy in JSON format.
      */
    var Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
  }
  
  trait GetJobOutputInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The job ID whose data is downloaded.
      */
    var jobId: java.lang.String
    /**
      * The range of bytes to retrieve from the output. For example, if you want to download the first 1,048,576 bytes, specify the range as bytes=0-1048575. By default, this operation downloads the entire output. If the job output is large, then you can use a range to retrieve a portion of the output. This allows you to download the entire output in smaller chunks of bytes. For example, suppose you have 1 GB of job output you want to download and you decide to download 128 MB chunks of data at a time, which is a total of eight Get Job Output requests. You use the following process to download the job output:   Download a 128 MB chunk of output by specifying the appropriate byte range. Verify that all 128 MB of data was received.   Along with the data, the response includes a SHA256 tree hash of the payload. You compute the checksum of the payload on the client and compare it with the checksum you received in the response to ensure you received all the expected data.   Repeat steps 1 and 2 for all the eight 128 MB chunks of output data, each time specifying the appropriate byte range.   After downloading all the parts of the job output, you have a list of eight checksum values. Compute the tree hash of these values to find the checksum of the entire output. Using the DescribeJob API, obtain job information of the job that provided you the output. The response includes the checksum of the entire archive stored in Amazon Glacier. You compare this value with the checksum you computed to ensure you have downloaded the entire archive content with no errors.   
      */
    var range: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait GetJobOutputOutput extends js.Object {
    /**
      * Indicates the range units accepted. For more information, see RFC2616. 
      */
    var acceptRanges: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The description of an archive.
      */
    var archiveDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The job data, either archive data or inventory data.
      */
    var body: js.UndefOr[Stream] = js.undefined
    /**
      * The checksum of the data in the response. This header is returned only when retrieving the output for an archive retrieval job. Furthermore, this header appears only under the following conditions:   You get the entire range of the archive.   You request a range to return of the archive that starts and ends on a multiple of 1 MB. For example, if you have an 3.1 MB archive and you specify a range to return that starts at 1 MB and ends at 2 MB, then the x-amz-sha256-tree-hash is returned as a response header.   You request a range of the archive to return that starts on a multiple of 1 MB and goes to the end of the archive. For example, if you have a 3.1 MB archive and you specify a range that starts at 2 MB and ends at 3.1 MB (the end of the archive), then the x-amz-sha256-tree-hash is returned as a response header.  
      */
    var checksum: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The range of bytes returned by Amazon Glacier. If only partial output is downloaded, the response provides the range of bytes Amazon Glacier returned. For example, bytes 0-1048575/8388608 returns the first 1 MB from 8 MB.
      */
    var contentRange: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Content-Type depends on whether the job output is an archive or a vault inventory. For archive data, the Content-Type is application/octet-stream. For vault inventory, if you requested CSV format when you initiated the job, the Content-Type is text/csv. Otherwise, by default, vault inventory is returned as JSON, and the Content-Type is application/json.
      */
    var contentType: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The HTTP response code for a job output request. The value depends on whether a range was specified in the request.
      */
    var status: js.UndefOr[httpstatus] = js.undefined
  }
  
  trait GetVaultAccessPolicyInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait GetVaultAccessPolicyOutput extends js.Object {
    /**
      * Contains the returned vault access policy as a JSON string.
      */
    var policy: js.UndefOr[VaultAccessPolicy] = js.undefined
  }
  
  trait GetVaultLockInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait GetVaultLockOutput extends js.Object {
    /**
      * The UTC date and time at which the vault lock was put into the InProgress state.
      */
    var CreationDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The UTC date and time at which the lock ID expires. This value can be null if the vault lock is in a Locked state.
      */
    var ExpirationDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The vault lock policy as a JSON string, which uses "\" as an escape character.
      */
    var Policy: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The state of the vault lock. InProgress or Locked.
      */
    var State: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait GetVaultNotificationsInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait GetVaultNotificationsOutput extends js.Object {
    /**
      * Returns the notification configuration set on the vault.
      */
    var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
  }
  
  trait GlacierJobDescription extends js.Object {
    /**
      * The job type. This value is either ArchiveRetrieval, InventoryRetrieval, or Select. 
      */
    var Action: js.UndefOr[ActionCode] = js.undefined
    /**
      * The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
      */
    var ArchiveId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this field is null.
      */
    var ArchiveSHA256TreeHash: js.UndefOr[java.lang.String] = js.undefined
    /**
      * For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an inventory retrieval or select job, this value is null.
      */
    var ArchiveSizeInBytes: js.UndefOr[Size] = js.undefined
    /**
      * The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
      */
    var Completed: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The UTC time that the job request completed. While the job is in progress, the value is null.
      */
    var CompletionDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example "2012-03-20T17:03:43.221Z".
      */
    var CreationDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Parameters used for range inventory retrieval.
      */
    var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobDescription] = js.undefined
    /**
      * For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an archive retrieval or select job, this value is null.
      */
    var InventorySizeInBytes: js.UndefOr[Size] = js.undefined
    /**
      * The job description provided when initiating the job.
      */
    var JobDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An opaque string that identifies an Amazon Glacier job.
      */
    var JobId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Contains the job output location.
      */
    var JobOutputPath: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Contains the location where the data from the select job is stored.
      */
    var OutputLocation: js.UndefOr[OutputLocation] = js.undefined
    /**
      * The retrieved byte range for archive retrieval jobs in the form StartByteValue-EndByteValue. If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case, StartByteValue equals 0 and EndByteValue equals the size of the archive minus 1. For inventory retrieval or select jobs, this field is null. 
      */
    var RetrievalByteRange: js.UndefOr[java.lang.String] = js.undefined
    /**
      * For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null. The SHA256 tree hash value for the requested range of an archive. If the InitiateJob request for an archive specified a tree-hash aligned range, then this field returns a value. If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value. This field is null for the following:   Archive retrieval jobs that specify a range that is not tree-hash aligned     Archival jobs that specify a range that is equal to the whole archive, when the job status is InProgress      Inventory jobs   Select jobs  
      */
    var SHA256TreeHash: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An Amazon SNS topic that receives notification.
      */
    var SNSTopic: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Contains the parameters used for a select.
      */
    var SelectParameters: js.UndefOr[SelectParameters] = js.undefined
    /**
      * The status code can be InProgress, Succeeded, or Failed, and indicates the status of the job.
      */
    var StatusCode: js.UndefOr[StatusCode] = js.undefined
    /**
      * A friendly message that describes the job status.
      */
    var StatusMessage: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The tier to use for a select or an archive retrieval. Valid values are Expedited, Standard, or Bulk. Standard is the default.
      */
    var Tier: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
      */
    var VaultARN: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait Grant extends js.Object {
    /**
      * The grantee.
      */
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
    var DisplayName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Email address of the grantee.
      */
    var EmailAddress: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The canonical user ID of the grantee.
      */
    var ID: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Type of grantee
      */
    var Type: Type
    /**
      * URI of the grantee group.
      */
    var URI: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait InitiateJobInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * Provides options for specifying job information.
      */
    var jobParameters: js.UndefOr[JobParameters] = js.undefined
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait InitiateJobOutput extends js.Object {
    /**
      * The ID of the job.
      */
    var jobId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The path to the location of where the select results are stored.
      */
    var jobOutputPath: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The relative URI path of the job.
      */
    var location: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait InitiateMultipartUploadInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The archive description that you are uploading in parts. The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB (4096 MB).
      */
    var archiveDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The size of each part except the last, in bytes. The last part can be smaller than this part size.
      */
    var partSize: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait InitiateMultipartUploadOutput extends js.Object {
    /**
      * The relative URI path of the multipart upload ID Amazon Glacier created.
      */
    var location: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The ID of the multipart upload. This value is also included as part of the location.
      */
    var uploadId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait InitiateVaultLockInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The vault lock policy as a JSON string, which uses "\" as an escape character.
      */
    var policy: js.UndefOr[VaultLockPolicy] = js.undefined
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait InitiateVaultLockOutput extends js.Object {
    /**
      * The lock ID, which is used to complete the vault locking process.
      */
    var lockId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait InputSerialization extends js.Object {
    /**
      * Describes the serialization of a CSV-encoded object.
      */
    var csv: js.UndefOr[CSVInput] = js.undefined
  }
  
  trait InventoryRetrievalJobDescription extends js.Object {
    /**
      * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
      */
    var EndDate: js.UndefOr[DateTime] = js.undefined
    /**
      * The output format for the vault inventory list, which is set by the InitiateJob request when initiating a job to retrieve a vault inventory. Valid values are CSV and JSON.
      */
    var Format: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of inventory items returned per vault inventory retrieval request. This limit is set when initiating the job with the a InitiateJob request. 
      */
    var Limit: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new InitiateJob request to obtain additional inventory items. If there are no more inventory items, this value is null. For more information, see  Range Inventory Retrieval.
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The start of the date range in Universal Coordinated Time (UTC) for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
      */
    var StartDate: js.UndefOr[DateTime] = js.undefined
  }
  
  trait InventoryRetrievalJobInput extends js.Object {
    /**
      * The end of the date range in UTC for vault inventory retrieval that includes archives created before this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
      */
    var EndDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Specifies the maximum number of inventory items returned per vault inventory retrieval request. Valid values are greater than or equal to 1.
      */
    var Limit: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An opaque string that represents where to continue pagination of the vault inventory retrieval results. You use the marker in a new InitiateJob request to obtain additional inventory items. If there are no more inventory items, this value is null.
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The start of the date range in UTC for vault inventory retrieval that includes archives created on or after this date. This value should be a string in the ISO 8601 date format, for example 2013-03-20T17:03:43Z.
      */
    var StartDate: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait JobParameters extends js.Object {
    /**
      * The ID of the archive that you want to retrieve. This field is required only if Type is set to select or archive-retrievalcode&gt;. An error occurs if you specify this request parameter for an inventory retrieval job request. 
      */
    var ArchiveId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E hexadecimal.
      */
    var Description: js.UndefOr[java.lang.String] = js.undefined
    /**
      * When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the default format. Valid values are "CSV" and "JSON".
      */
    var Format: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Input parameters used for range inventory retrieval.
      */
    var InventoryRetrievalParameters: js.UndefOr[InventoryRetrievalJobInput] = js.undefined
    /**
      * Contains information about the location where the select job results are stored.
      */
    var OutputLocation: js.UndefOr[OutputLocation] = js.undefined
    /**
      * The byte range to retrieve for an archive retrieval. in the form "StartByteValue-EndByteValue" If not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned which means that StartByteValue must be divisible by 1 MB and EndByteValue plus 1 must be divisible by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned, this operation returns a 400 response.  An error occurs if you specify this field for an inventory retrieval job request.
      */
    var RetrievalByteRange: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the output is ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must exist.
      */
    var SNSTopic: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Contains the parameters that define a job.
      */
    var SelectParameters: js.UndefOr[SelectParameters] = js.undefined
    /**
      * The tier to use for a select or an archive retrieval job. Valid values are Expedited, Standard, or Bulk. Standard is the default.
      */
    var Tier: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
      */
    var Type: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListJobsInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The state of the jobs to return. You can specify true or false.
      */
    var completed: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The maximum number of jobs to be returned. The default limit is 50. The number of jobs returned might be fewer than the specified limit, but the number of returned jobs never exceeds the limit.
      */
    var limit: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An opaque string used for pagination. This value specifies the job at which the listing of jobs should begin. Get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of results started in a previous List Jobs request.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The type of job status to return. You can specify the following values: InProgress, Succeeded, or Failed.
      */
    var statuscode: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait ListJobsOutput extends js.Object {
    /**
      * A list of job objects. Each job object contains metadata describing the job.
      */
    var JobList: js.UndefOr[JobList] = js.undefined
    /**
      *  An opaque string used for pagination that specifies the job at which the listing of jobs should begin. You get the marker value from a previous List Jobs response. You only need to include the marker if you are continuing the pagination of the results started in a previous List Jobs request. 
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListMultipartUploadsInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * Specifies the maximum number of uploads returned in the response body. If this value is not specified, the List Uploads operation returns up to 50 uploads.
      */
    var limit: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An opaque string used for pagination. This value specifies the upload at which the listing of uploads should begin. Get the marker value from a previous List Uploads response. You need only include the marker if you are continuing the pagination of results started in a previous List Uploads request.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait ListMultipartUploadsOutput extends js.Object {
    /**
      * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is null.
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A list of in-progress multipart uploads.
      */
    var UploadsList: js.UndefOr[UploadsList] = js.undefined
  }
  
  trait ListPartsInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The maximum number of parts to be returned. The default limit is 50. The number of parts returned might be fewer than the specified limit, but the number of returned parts never exceeds the limit.
      */
    var limit: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An opaque string used for pagination. This value specifies the part at which the listing of parts should begin. Get the marker value from the response of a previous List Parts response. You need only include the marker if you are continuing the pagination of results started in a previous List Parts request.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The upload ID of the multipart upload.
      */
    var uploadId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait ListPartsOutput extends js.Object {
    /**
      * The description of the archive that was specified in the Initiate Multipart Upload request.
      */
    var ArchiveDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The UTC time at which the multipart upload was initiated.
      */
    var CreationDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Parts request to obtain more jobs in the list. If there are no more parts, this value is null.
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The ID of the upload to which the parts are associated.
      */
    var MultipartUploadId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The part size in bytes. This is the same value that you specified in the Initiate Multipart Upload request.
      */
    var PartSizeInBytes: js.UndefOr[long] = js.undefined
    /**
      * A list of the part sizes of the multipart upload. Each object in the array contains a RangeBytes and sha256-tree-hash name/value pair.
      */
    var Parts: js.UndefOr[PartList] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the vault to which the multipart upload was initiated.
      */
    var VaultARN: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListProvisionedCapacityInput extends js.Object {
    /**
      * The AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, don't include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
  }
  
  trait ListProvisionedCapacityOutput extends js.Object {
    /**
      * The response body contains the following JSON fields.
      */
    var ProvisionedCapacityList: js.UndefOr[ProvisionedCapacityList] = js.undefined
  }
  
  trait ListTagsForVaultInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait ListTagsForVaultOutput extends js.Object {
    /**
      * The tags attached to the vault. Each tag is composed of a key and a value.
      */
    var Tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait ListVaultsInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The maximum number of vaults to be returned. The default limit is 10. The number of vaults returned might be fewer than the specified limit, but the number of returned vaults never exceeds the limit.
      */
    var limit: js.UndefOr[java.lang.String] = js.undefined
    /**
      * A string used for pagination. The marker specifies the vault ARN after which the listing of vaults should begin.
      */
    var marker: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ListVaultsOutput extends js.Object {
    /**
      * The vault ARN at which to continue pagination of the results. You use the marker in another List Vaults request to obtain more vaults in the list.
      */
    var Marker: js.UndefOr[java.lang.String] = js.undefined
    /**
      * List of vaults.
      */
    var VaultList: js.UndefOr[VaultList] = js.undefined
  }
  
  trait OutputLocation extends js.Object {
    /**
      * Describes an S3 location that will receive the results of the job request.
      */
    var S3: js.UndefOr[S3Location] = js.undefined
  }
  
  trait OutputSerialization extends js.Object {
    /**
      * Describes the serialization of CSV-encoded query results.
      */
    var csv: js.UndefOr[CSVOutput] = js.undefined
  }
  
  trait PartListElement extends js.Object {
    /**
      * The byte range of a part, inclusive of the upper value of the range.
      */
    var RangeInBytes: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never null.
      */
    var SHA256TreeHash: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait ProvisionedCapacityDescription extends js.Object {
    /**
      * The ID that identifies the provisioned capacity unit.
      */
    var CapacityId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date that the provisioned capacity unit expires, in Universal Coordinated Time (UTC).
      */
    var ExpirationDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The date that the provisioned capacity unit was purchased, in Universal Coordinated Time (UTC).
      */
    var StartDate: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait PurchaseProvisionedCapacityInput extends js.Object {
    /**
      * The AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, don't include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
  }
  
  trait PurchaseProvisionedCapacityOutput extends js.Object {
    /**
      * The ID that identifies the provisioned capacity unit.
      */
    var capacityId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait RemoveTagsFromVaultInput extends js.Object {
    /**
      * A list of tag keys. Each corresponding tag is removed from the vault.
      */
    var TagKeys: js.UndefOr[TagKeyList] = js.undefined
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait S3Location extends js.Object {
    /**
      * A list of grants that control access to the staged results.
      */
    var AccessControlList: js.UndefOr[AccessControlPolicyList] = js.undefined
    /**
      * The name of the Amazon S3 bucket where the job results are stored.
      */
    var BucketName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The canned access control list (ACL) to apply to the job results.
      */
    var CannedACL: js.UndefOr[CannedACL] = js.undefined
    /**
      * Contains information about the encryption used to store the job results in Amazon S3.
      */
    var Encryption: js.UndefOr[Encryption] = js.undefined
    /**
      * The prefix that is prepended to the results for this request.
      */
    var Prefix: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The storage class used to store the job results.
      */
    var StorageClass: js.UndefOr[StorageClass] = js.undefined
    /**
      * The tag-set that is applied to the job results.
      */
    var Tagging: js.UndefOr[hashmap] = js.undefined
    /**
      * A map of metadata to store with the job results in Amazon S3.
      */
    var UserMetadata: js.UndefOr[hashmap] = js.undefined
  }
  
  trait SelectParameters extends js.Object {
    /**
      * The expression that is used to select the object.
      */
    var Expression: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The type of the provided expression, for example SQL.
      */
    var ExpressionType: js.UndefOr[ExpressionType] = js.undefined
    /**
      * Describes the serialization format of the object.
      */
    var InputSerialization: js.UndefOr[InputSerialization] = js.undefined
    /**
      * Describes how the results of the select job are serialized.
      */
    var OutputSerialization: js.UndefOr[OutputSerialization] = js.undefined
  }
  
  trait SetDataRetrievalPolicyInput extends js.Object {
    /**
      * The data retrieval policy in JSON format.
      */
    var Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
    /**
      * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
  }
  
  trait SetVaultAccessPolicyInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The vault access policy as a JSON string.
      */
    var policy: js.UndefOr[VaultAccessPolicy] = js.undefined
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait SetVaultNotificationsInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
      */
    var accountId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
    /**
      * Provides options for specifying notification configuration.
      */
    var vaultNotificationConfig: js.UndefOr[VaultNotificationConfig] = js.undefined
  }
  
  trait TagMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServicesGlacierMod.GlacierCustomizations {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * This operation aborts a multipart upload identified by the upload ID. After the Abort Multipart Upload request succeeds, you cannot upload any more parts to the multipart upload or complete the multipart upload. Aborting a completed upload fails. However, aborting an already-aborted upload will succeed, for a short time. For more information about uploading a part and completing a multipart upload, see UploadMultipartPart and CompleteMultipartUpload. This operation is idempotent. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Working with Archives in Amazon Glacier and Abort Multipart Upload in the Amazon Glacier Developer Guide. 
      */
    def abortMultipartUpload(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortMultipartUpload(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation aborts a multipart upload identified by the upload ID. After the Abort Multipart Upload request succeeds, you cannot upload any more parts to the multipart upload or complete the multipart upload. Aborting a completed upload fails. However, aborting an already-aborted upload will succeed, for a short time. For more information about uploading a part and completing a multipart upload, see UploadMultipartPart and CompleteMultipartUpload. This operation is idempotent. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Working with Archives in Amazon Glacier and Abort Multipart Upload in the Amazon Glacier Developer Guide. 
      */
    def abortMultipartUpload(params: AbortMultipartUploadInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortMultipartUpload(
      params: AbortMultipartUploadInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation aborts the vault locking process if the vault lock is not in the Locked state. If the vault lock is in the Locked state when this operation is requested, the operation returns an AccessDeniedException error. Aborting the vault locking process removes the vault lock policy from the specified vault.  A vault lock is put into the InProgress state by calling InitiateVaultLock. A vault lock is put into the Locked state by calling CompleteVaultLock. You can get the state of a vault lock by calling GetVaultLock. For more information about the vault locking process, see Amazon Glacier Vault Lock. For more information about vault lock policies, see Amazon Glacier Access Control with Vault Lock Policies.  This operation is idempotent. You can successfully invoke this operation multiple times, if the vault lock is in the InProgress state or if there is no policy associated with the vault.
      */
    def abortVaultLock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortVaultLock(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation aborts the vault locking process if the vault lock is not in the Locked state. If the vault lock is in the Locked state when this operation is requested, the operation returns an AccessDeniedException error. Aborting the vault locking process removes the vault lock policy from the specified vault.  A vault lock is put into the InProgress state by calling InitiateVaultLock. A vault lock is put into the Locked state by calling CompleteVaultLock. You can get the state of a vault lock by calling GetVaultLock. For more information about the vault locking process, see Amazon Glacier Vault Lock. For more information about vault lock policies, see Amazon Glacier Access Control with Vault Lock Policies.  This operation is idempotent. You can successfully invoke this operation multiple times, if the vault lock is in the InProgress state or if there is no policy associated with the vault.
      */
    def abortVaultLock(params: AbortVaultLockInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def abortVaultLock(
      params: AbortVaultLockInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation adds the specified tags to a vault. Each tag is composed of a key and a value. Each vault can have up to 10 tags. If your request would cause the tag limit for the vault to be exceeded, the operation throws the LimitExceededException error. If a tag already exists on the vault under a specified key, the existing key value will be overwritten. For more information about tags, see Tagging Amazon Glacier Resources. 
      */
    def addTagsToVault(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToVault(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation adds the specified tags to a vault. Each tag is composed of a key and a value. Each vault can have up to 10 tags. If your request would cause the tag limit for the vault to be exceeded, the operation throws the LimitExceededException error. If a tag already exists on the vault under a specified key, the existing key value will be overwritten. For more information about tags, see Tagging Amazon Glacier Resources. 
      */
    def addTagsToVault(params: AddTagsToVaultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def addTagsToVault(
      params: AddTagsToVaultInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You call this operation to inform Amazon Glacier that all the archive parts have been uploaded and that Amazon Glacier can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly created archive resource. Using the URI path, you can then access the archive. After you upload an archive, you should save the archive ID returned to retrieve the archive at a later point. You can also get the vault inventory to obtain a list of archive IDs in a vault. For more information, see InitiateJob. In the request, you must include the computed SHA256 tree hash of the entire archive you have uploaded. For information about computing a SHA256 tree hash, see Computing Checksums. On the server side, Amazon Glacier also constructs the SHA256 tree hash of the assembled archive. If the values match, Amazon Glacier saves the archive to the vault; otherwise, it returns an error, and the operation fails. The ListParts operation returns a list of parts uploaded for a specific multipart upload. It includes checksum information for each uploaded part that can be used to debug a bad checksum issue. Additionally, Amazon Glacier also checks for any missing content ranges when assembling the archive, if missing content ranges are found, Amazon Glacier returns an error and the operation fails. Complete Multipart Upload is an idempotent operation. After your first successful complete multipart upload, if you call the operation again within a short period, the operation will succeed and return the same archive ID. This is useful in the event you experience a network issue that causes an aborted connection or receive a 500 server error, in which case you can repeat your Complete Multipart Upload request and get the same archive ID without creating duplicate archives. Note, however, that after the multipart upload completes, you cannot call the List Parts operation and the multipart upload will not appear in List Multipart Uploads response, even if idempotent complete is possible. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Uploading Large Archives in Parts (Multipart Upload) and Complete Multipart Upload in the Amazon Glacier Developer Guide. 
      */
    def completeMultipartUpload(): awsDashSdkLib.libRequestMod.Request[ArchiveCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def completeMultipartUpload(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ArchiveCreationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ArchiveCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * You call this operation to inform Amazon Glacier that all the archive parts have been uploaded and that Amazon Glacier can now assemble the archive from the uploaded parts. After assembling and saving the archive to the vault, Amazon Glacier returns the URI path of the newly created archive resource. Using the URI path, you can then access the archive. After you upload an archive, you should save the archive ID returned to retrieve the archive at a later point. You can also get the vault inventory to obtain a list of archive IDs in a vault. For more information, see InitiateJob. In the request, you must include the computed SHA256 tree hash of the entire archive you have uploaded. For information about computing a SHA256 tree hash, see Computing Checksums. On the server side, Amazon Glacier also constructs the SHA256 tree hash of the assembled archive. If the values match, Amazon Glacier saves the archive to the vault; otherwise, it returns an error, and the operation fails. The ListParts operation returns a list of parts uploaded for a specific multipart upload. It includes checksum information for each uploaded part that can be used to debug a bad checksum issue. Additionally, Amazon Glacier also checks for any missing content ranges when assembling the archive, if missing content ranges are found, Amazon Glacier returns an error and the operation fails. Complete Multipart Upload is an idempotent operation. After your first successful complete multipart upload, if you call the operation again within a short period, the operation will succeed and return the same archive ID. This is useful in the event you experience a network issue that causes an aborted connection or receive a 500 server error, in which case you can repeat your Complete Multipart Upload request and get the same archive ID without creating duplicate archives. Note, however, that after the multipart upload completes, you cannot call the List Parts operation and the multipart upload will not appear in List Multipart Uploads response, even if idempotent complete is possible. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Uploading Large Archives in Parts (Multipart Upload) and Complete Multipart Upload in the Amazon Glacier Developer Guide. 
      */
    def completeMultipartUpload(params: CompleteMultipartUploadInput): awsDashSdkLib.libRequestMod.Request[ArchiveCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def completeMultipartUpload(
      params: CompleteMultipartUploadInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ArchiveCreationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ArchiveCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation completes the vault locking process by transitioning the vault lock from the InProgress state to the Locked state, which causes the vault lock policy to become unchangeable. A vault lock is put into the InProgress state by calling InitiateVaultLock. You can obtain the state of the vault lock by calling GetVaultLock. For more information about the vault locking process, Amazon Glacier Vault Lock.  This operation is idempotent. This request is always successful if the vault lock is in the Locked state and the provided lock ID matches the lock ID originally used to lock the vault. If an invalid lock ID is passed in the request when the vault lock is in the Locked state, the operation returns an AccessDeniedException error. If an invalid lock ID is passed in the request when the vault lock is in the InProgress state, the operation throws an InvalidParameter error.
      */
    def completeVaultLock(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def completeVaultLock(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation completes the vault locking process by transitioning the vault lock from the InProgress state to the Locked state, which causes the vault lock policy to become unchangeable. A vault lock is put into the InProgress state by calling InitiateVaultLock. You can obtain the state of the vault lock by calling GetVaultLock. For more information about the vault locking process, Amazon Glacier Vault Lock.  This operation is idempotent. This request is always successful if the vault lock is in the Locked state and the provided lock ID matches the lock ID originally used to lock the vault. If an invalid lock ID is passed in the request when the vault lock is in the Locked state, the operation returns an AccessDeniedException error. If an invalid lock ID is passed in the request when the vault lock is in the InProgress state, the operation throws an InvalidParameter error.
      */
    def completeVaultLock(params: CompleteVaultLockInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def completeVaultLock(
      params: CompleteVaultLockInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation creates a new vault with the specified name. The name of the vault must be unique within a region for an AWS account. You can create up to 1,000 vaults per account. If you need to create more vaults, contact Amazon Glacier. You must use the following guidelines when naming a vault.   Names can be between 1 and 255 characters long.   Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).   This operation is idempotent. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Creating a Vault in Amazon Glacier and Create Vault  in the Amazon Glacier Developer Guide. 
      */
    def createVault(): awsDashSdkLib.libRequestMod.Request[CreateVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVault(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation creates a new vault with the specified name. The name of the vault must be unique within a region for an AWS account. You can create up to 1,000 vaults per account. If you need to create more vaults, contact Amazon Glacier. You must use the following guidelines when naming a vault.   Names can be between 1 and 255 characters long.   Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), and '.' (period).   This operation is idempotent. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Creating a Vault in Amazon Glacier and Create Vault  in the Amazon Glacier Developer Guide. 
      */
    def createVault(params: CreateVaultInput): awsDashSdkLib.libRequestMod.Request[CreateVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVault(
      params: CreateVaultInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes an archive from a vault. Subsequent requests to initiate a retrieval of this archive will fail. Archive retrievals that are in progress for this archive ID may or may not succeed according to the following scenarios:   If the archive retrieval job is actively preparing the data for download when Amazon Glacier receives the delete archive request, the archival retrieval operation might fail.   If the archive retrieval job has successfully prepared the archive for download when Amazon Glacier receives the delete archive request, you will be able to download the output.   This operation is idempotent. Attempting to delete an already-deleted archive does not result in an error. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Deleting an Archive in Amazon Glacier and Delete Archive in the Amazon Glacier Developer Guide. 
      */
    def deleteArchive(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteArchive(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes an archive from a vault. Subsequent requests to initiate a retrieval of this archive will fail. Archive retrievals that are in progress for this archive ID may or may not succeed according to the following scenarios:   If the archive retrieval job is actively preparing the data for download when Amazon Glacier receives the delete archive request, the archival retrieval operation might fail.   If the archive retrieval job has successfully prepared the archive for download when Amazon Glacier receives the delete archive request, you will be able to download the output.   This operation is idempotent. Attempting to delete an already-deleted archive does not result in an error. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Deleting an Archive in Amazon Glacier and Delete Archive in the Amazon Glacier Developer Guide. 
      */
    def deleteArchive(params: DeleteArchiveInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteArchive(
      params: DeleteArchiveInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes a vault. Amazon Glacier will delete a vault only if there are no archives in the vault as of the last inventory and there have been no writes to the vault since the last inventory. If either of these conditions is not satisfied, the vault deletion fails (that is, the vault is not removed) and Amazon Glacier returns an error. You can use DescribeVault to return the number of archives in a vault, and you can use Initiate a Job (POST jobs) to initiate a new inventory retrieval for a vault. The inventory contains the archive IDs you use to delete archives using Delete Archive (DELETE archive). This operation is idempotent. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Deleting a Vault in Amazon Glacier and Delete Vault  in the Amazon Glacier Developer Guide. 
      */
    def deleteVault(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVault(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes a vault. Amazon Glacier will delete a vault only if there are no archives in the vault as of the last inventory and there have been no writes to the vault since the last inventory. If either of these conditions is not satisfied, the vault deletion fails (that is, the vault is not removed) and Amazon Glacier returns an error. You can use DescribeVault to return the number of archives in a vault, and you can use Initiate a Job (POST jobs) to initiate a new inventory retrieval for a vault. The inventory contains the archive IDs you use to delete archives using Delete Archive (DELETE archive). This operation is idempotent. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Deleting a Vault in Amazon Glacier and Delete Vault  in the Amazon Glacier Developer Guide. 
      */
    def deleteVault(params: DeleteVaultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVault(
      params: DeleteVaultInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes the access policy associated with the specified vault. The operation is eventually consistent; that is, it might take some time for Amazon Glacier to completely remove the access policy, and you might still see the effect of the policy for a short time after you send the delete request. This operation is idempotent. You can invoke delete multiple times, even if there is no policy associated with the vault. For more information about vault access policies, see Amazon Glacier Access Control with Vault Access Policies. 
      */
    def deleteVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVaultAccessPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes the access policy associated with the specified vault. The operation is eventually consistent; that is, it might take some time for Amazon Glacier to completely remove the access policy, and you might still see the effect of the policy for a short time after you send the delete request. This operation is idempotent. You can invoke delete multiple times, even if there is no policy associated with the vault. For more information about vault access policies, see Amazon Glacier Access Control with Vault Access Policies. 
      */
    def deleteVaultAccessPolicy(params: DeleteVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVaultAccessPolicy(
      params: DeleteVaultAccessPolicyInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes the notification configuration set for a vault. The operation is eventually consistent; that is, it might take some time for Amazon Glacier to completely disable the notifications and you might still receive some notifications for a short time after you send the delete request. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Configuring Vault Notifications in Amazon Glacier and Delete Vault Notification Configuration  in the Amazon Glacier Developer Guide. 
      */
    def deleteVaultNotifications(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVaultNotifications(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation deletes the notification configuration set for a vault. The operation is eventually consistent; that is, it might take some time for Amazon Glacier to completely disable the notifications and you might still receive some notifications for a short time after you send the delete request. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Configuring Vault Notifications in Amazon Glacier and Delete Vault Notification Configuration  in the Amazon Glacier Developer Guide. 
      */
    def deleteVaultNotifications(params: DeleteVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVaultNotifications(
      params: DeleteVaultNotificationsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns information about a job you previously initiated, including the job initiation date, the user who initiated the job, the job status code/message and the Amazon SNS topic to notify after Amazon Glacier completes the job. For more information about initiating a job, see InitiateJob.   This operation enables you to check the status of your job. However, it is strongly recommended that you set up an Amazon SNS topic and specify it in your initiate job request so that Amazon Glacier can notify the topic after it completes the job.  A job ID will not expire for at least 24 hours after Amazon Glacier completes the job. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For more information about using this operation, see the documentation for the underlying REST API Describe Job in the Amazon Glacier Developer Guide. 
      */
    def describeJob(): awsDashSdkLib.libRequestMod.Request[GlacierJobDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GlacierJobDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GlacierJobDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns information about a job you previously initiated, including the job initiation date, the user who initiated the job, the job status code/message and the Amazon SNS topic to notify after Amazon Glacier completes the job. For more information about initiating a job, see InitiateJob.   This operation enables you to check the status of your job. However, it is strongly recommended that you set up an Amazon SNS topic and specify it in your initiate job request so that Amazon Glacier can notify the topic after it completes the job.  A job ID will not expire for at least 24 hours after Amazon Glacier completes the job. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For more information about using this operation, see the documentation for the underlying REST API Describe Job in the Amazon Glacier Developer Guide. 
      */
    def describeJob(params: DescribeJobInput): awsDashSdkLib.libRequestMod.Request[GlacierJobDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeJob(
      params: DescribeJobInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GlacierJobDescription, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GlacierJobDescription, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns information about a vault, including the vault's Amazon Resource Name (ARN), the date the vault was created, the number of archives it contains, and the total size of all the archives in the vault. The number of archives and their total size are as of the last inventory generation. This means that if you add or remove an archive from a vault, and then immediately use Describe Vault, the change in contents will not be immediately reflected. If you want to retrieve the latest inventory of the vault, use InitiateJob. Amazon Glacier generates vault inventories approximately daily. For more information, see Downloading a Vault Inventory in Amazon Glacier.  An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Retrieving Vault Metadata in Amazon Glacier and Describe Vault  in the Amazon Glacier Developer Guide. 
      */
    def describeVault(): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVault(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns information about a vault, including the vault's Amazon Resource Name (ARN), the date the vault was created, the number of archives it contains, and the total size of all the archives in the vault. The number of archives and their total size are as of the last inventory generation. This means that if you add or remove an archive from a vault, and then immediately use Describe Vault, the change in contents will not be immediately reflected. If you want to retrieve the latest inventory of the vault, use InitiateJob. Amazon Glacier generates vault inventories approximately daily. For more information, see Downloading a Vault Inventory in Amazon Glacier.  An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Retrieving Vault Metadata in Amazon Glacier and Describe Vault  in the Amazon Glacier Developer Guide. 
      */
    def describeVault(params: DescribeVaultInput): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVault(
      params: DescribeVaultInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the current data retrieval policy for the account and region specified in the GET request. For more information about data retrieval policies, see Amazon Glacier Data Retrieval Policies.
      */
    def getDataRetrievalPolicy(): awsDashSdkLib.libRequestMod.Request[GetDataRetrievalPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDataRetrievalPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataRetrievalPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataRetrievalPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation returns the current data retrieval policy for the account and region specified in the GET request. For more information about data retrieval policies, see Amazon Glacier Data Retrieval Policies.
      */
    def getDataRetrievalPolicy(params: GetDataRetrievalPolicyInput): awsDashSdkLib.libRequestMod.Request[GetDataRetrievalPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDataRetrievalPolicy(
      params: GetDataRetrievalPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDataRetrievalPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDataRetrievalPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation downloads the output of the job you initiated using InitiateJob. Depending on the job type you specified when you initiated the job, the output will be either the content of an archive or a vault inventory. You can download all the job output or download a portion of the output by specifying a byte range. In the case of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the checksum for the portion of the data. You can compute the checksum on the client and verify that the values match to ensure the portion you downloaded is the correct data. A job ID will not expire for at least 24 hours after Amazon Glacier completes the job. That a byte range. For both archive and inventory retrieval jobs, you should verify the downloaded size against the size returned in the headers from the Get Job Output response. For archive retrieval jobs, you should also verify that the size is what you expected. If you download a portion of the output, the expected size is based on the range of bytes you specified. For example, if you specify a range of bytes=0-1048575, you should verify your download size is 1,048,576 bytes. If you download an entire archive, the expected size is the size of the archive when you uploaded it to Amazon Glacier The expected size is also returned in the headers from the Get Job Output response. In the case of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the checksum for the portion of the data. To ensure the portion you downloaded is the correct data, compute the checksum on the client, verify that the values match, and verify that the size is what you expected. A job ID does not expire for at least 24 hours after Amazon Glacier completes the job. That is, you can download the job output within the 24 hours period after Amazon Glacier completes the job. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and the underlying REST API, see Downloading a Vault Inventory, Downloading an Archive, and Get Job Output  
      */
    def getJobOutput(): awsDashSdkLib.libRequestMod.Request[GetJobOutputOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getJobOutput(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobOutputOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobOutputOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation downloads the output of the job you initiated using InitiateJob. Depending on the job type you specified when you initiated the job, the output will be either the content of an archive or a vault inventory. You can download all the job output or download a portion of the output by specifying a byte range. In the case of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the checksum for the portion of the data. You can compute the checksum on the client and verify that the values match to ensure the portion you downloaded is the correct data. A job ID will not expire for at least 24 hours after Amazon Glacier completes the job. That a byte range. For both archive and inventory retrieval jobs, you should verify the downloaded size against the size returned in the headers from the Get Job Output response. For archive retrieval jobs, you should also verify that the size is what you expected. If you download a portion of the output, the expected size is based on the range of bytes you specified. For example, if you specify a range of bytes=0-1048575, you should verify your download size is 1,048,576 bytes. If you download an entire archive, the expected size is the size of the archive when you uploaded it to Amazon Glacier The expected size is also returned in the headers from the Get Job Output response. In the case of an archive retrieval job, depending on the byte range you specify, Amazon Glacier returns the checksum for the portion of the data. To ensure the portion you downloaded is the correct data, compute the checksum on the client, verify that the values match, and verify that the size is what you expected. A job ID does not expire for at least 24 hours after Amazon Glacier completes the job. That is, you can download the job output within the 24 hours period after Amazon Glacier completes the job. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and the underlying REST API, see Downloading a Vault Inventory, Downloading an Archive, and Get Job Output  
      */
    def getJobOutput(params: GetJobOutputInput): awsDashSdkLib.libRequestMod.Request[GetJobOutputOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getJobOutput(
      params: GetJobOutputInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobOutputOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobOutputOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation retrieves the access-policy subresource set on the vault; for more information on setting this subresource, see Set Vault Access Policy (PUT access-policy). If there is no access policy set on the vault, the operation returns a 404 Not found error. For more information about vault access policies, see Amazon Glacier Access Control with Vault Access Policies.
      */
    def getVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[GetVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVaultAccessPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVaultAccessPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation retrieves the access-policy subresource set on the vault; for more information on setting this subresource, see Set Vault Access Policy (PUT access-policy). If there is no access policy set on the vault, the operation returns a 404 Not found error. For more information about vault access policies, see Amazon Glacier Access Control with Vault Access Policies.
      */
    def getVaultAccessPolicy(params: GetVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[GetVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVaultAccessPolicy(
      params: GetVaultAccessPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVaultAccessPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVaultAccessPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation retrieves the following attributes from the lock-policy subresource set on the specified vault:    The vault lock policy set on the vault.   The state of the vault lock, which is either InProgess or Locked.   When the lock ID expires. The lock ID is used to complete the vault locking process.   When the vault lock was initiated and put into the InProgress state.   A vault lock is put into the InProgress state by calling InitiateVaultLock. A vault lock is put into the Locked state by calling CompleteVaultLock. You can abort the vault locking process by calling AbortVaultLock. For more information about the vault locking process, Amazon Glacier Vault Lock.  If there is no vault lock policy set on the vault, the operation returns a 404 Not found error. For more information about vault lock policies, Amazon Glacier Access Control with Vault Lock Policies. 
      */
    def getVaultLock(): awsDashSdkLib.libRequestMod.Request[GetVaultLockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVaultLock(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVaultLockOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVaultLockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation retrieves the following attributes from the lock-policy subresource set on the specified vault:    The vault lock policy set on the vault.   The state of the vault lock, which is either InProgess or Locked.   When the lock ID expires. The lock ID is used to complete the vault locking process.   When the vault lock was initiated and put into the InProgress state.   A vault lock is put into the InProgress state by calling InitiateVaultLock. A vault lock is put into the Locked state by calling CompleteVaultLock. You can abort the vault locking process by calling AbortVaultLock. For more information about the vault locking process, Amazon Glacier Vault Lock.  If there is no vault lock policy set on the vault, the operation returns a 404 Not found error. For more information about vault lock policies, Amazon Glacier Access Control with Vault Lock Policies. 
      */
    def getVaultLock(params: GetVaultLockInput): awsDashSdkLib.libRequestMod.Request[GetVaultLockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVaultLock(
      params: GetVaultLockInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVaultLockOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVaultLockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation retrieves the notification-configuration subresource of the specified vault. For information about setting a notification configuration on a vault, see SetVaultNotifications. If a notification configuration for a vault is not set, the operation returns a 404 Not Found error. For more information about vault notifications, see Configuring Vault Notifications in Amazon Glacier.  An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Configuring Vault Notifications in Amazon Glacier and Get Vault Notification Configuration  in the Amazon Glacier Developer Guide. 
      */
    def getVaultNotifications(): awsDashSdkLib.libRequestMod.Request[GetVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVaultNotifications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVaultNotificationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation retrieves the notification-configuration subresource of the specified vault. For information about setting a notification configuration on a vault, see SetVaultNotifications. If a notification configuration for a vault is not set, the operation returns a 404 Not Found error. For more information about vault notifications, see Configuring Vault Notifications in Amazon Glacier.  An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Configuring Vault Notifications in Amazon Glacier and Get Vault Notification Configuration  in the Amazon Glacier Developer Guide. 
      */
    def getVaultNotifications(params: GetVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[GetVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getVaultNotifications(
      params: GetVaultNotificationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetVaultNotificationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetVaultNotificationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation initiates a job of the specified type, which can be a select, an archival retrieval, or a vault retrieval. For more information about using this operation, see the documentation for the underlying REST API Initiate a Job. 
      */
    def initiateJob(): awsDashSdkLib.libRequestMod.Request[InitiateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation initiates a job of the specified type, which can be a select, an archival retrieval, or a vault retrieval. For more information about using this operation, see the documentation for the underlying REST API Initiate a Job. 
      */
    def initiateJob(params: InitiateJobInput): awsDashSdkLib.libRequestMod.Request[InitiateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateJob(
      params: InitiateJobInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateJobOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateJobOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation initiates a multipart upload. Amazon Glacier creates a multipart upload resource and returns its ID in the response. The multipart upload ID is used in subsequent requests to upload parts of an archive (see UploadMultipartPart). When you initiate a multipart upload, you specify the part size in number of bytes. The part size must be a megabyte (1024 KB) multiplied by a power of 2-for example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB. Every part you upload to this resource (see UploadMultipartPart), except the last one, must have the same size. The last one can be the same size or smaller. For example, suppose you want to upload a 16.2 MB file. If you initiate the multipart upload with a part size of 4 MB, you will upload four parts of 4 MB each and one part of 0.2 MB.   You don't need to know the size of the archive when you start a multipart upload because Amazon Glacier does not require you to specify the overall archive size.  After you complete the multipart upload, Amazon Glacier removes the multipart upload resource referenced by the ID. Amazon Glacier also removes the multipart upload resource if you cancel the multipart upload or it may be removed if there is no activity for a period of 24 hours. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Uploading Large Archives in Parts (Multipart Upload) and Initiate Multipart Upload in the Amazon Glacier Developer Guide.
      */
    def initiateMultipartUpload(): awsDashSdkLib.libRequestMod.Request[InitiateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateMultipartUpload(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateMultipartUploadOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation initiates a multipart upload. Amazon Glacier creates a multipart upload resource and returns its ID in the response. The multipart upload ID is used in subsequent requests to upload parts of an archive (see UploadMultipartPart). When you initiate a multipart upload, you specify the part size in number of bytes. The part size must be a megabyte (1024 KB) multiplied by a power of 2-for example, 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB. Every part you upload to this resource (see UploadMultipartPart), except the last one, must have the same size. The last one can be the same size or smaller. For example, suppose you want to upload a 16.2 MB file. If you initiate the multipart upload with a part size of 4 MB, you will upload four parts of 4 MB each and one part of 0.2 MB.   You don't need to know the size of the archive when you start a multipart upload because Amazon Glacier does not require you to specify the overall archive size.  After you complete the multipart upload, Amazon Glacier removes the multipart upload resource referenced by the ID. Amazon Glacier also removes the multipart upload resource if you cancel the multipart upload or it may be removed if there is no activity for a period of 24 hours. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Uploading Large Archives in Parts (Multipart Upload) and Initiate Multipart Upload in the Amazon Glacier Developer Guide.
      */
    def initiateMultipartUpload(params: InitiateMultipartUploadInput): awsDashSdkLib.libRequestMod.Request[InitiateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateMultipartUpload(
      params: InitiateMultipartUploadInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateMultipartUploadOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateMultipartUploadOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation initiates the vault locking process by doing the following:   Installing a vault lock policy on the specified vault.   Setting the lock state of vault lock to InProgress.   Returning a lock ID, which is used to complete the vault locking process.   You can set one vault lock policy for each vault and this policy can be up to 20 KB in size. For more information about vault lock policies, see Amazon Glacier Access Control with Vault Lock Policies.  You must complete the vault locking process within 24 hours after the vault lock enters the InProgress state. After the 24 hour window ends, the lock ID expires, the vault automatically exits the InProgress state, and the vault lock policy is removed from the vault. You call CompleteVaultLock to complete the vault locking process by setting the state of the vault lock to Locked.  After a vault lock is in the Locked state, you cannot initiate a new vault lock for the vault. You can abort the vault locking process by calling AbortVaultLock. You can get the state of the vault lock by calling GetVaultLock. For more information about the vault locking process, Amazon Glacier Vault Lock. If this operation is called when the vault lock is in the InProgress state, the operation returns an AccessDeniedException error. When the vault lock is in the InProgress state you must call AbortVaultLock before you can initiate a new vault lock policy. 
      */
    def initiateVaultLock(): awsDashSdkLib.libRequestMod.Request[InitiateVaultLockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateVaultLock(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateVaultLockOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateVaultLockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation initiates the vault locking process by doing the following:   Installing a vault lock policy on the specified vault.   Setting the lock state of vault lock to InProgress.   Returning a lock ID, which is used to complete the vault locking process.   You can set one vault lock policy for each vault and this policy can be up to 20 KB in size. For more information about vault lock policies, see Amazon Glacier Access Control with Vault Lock Policies.  You must complete the vault locking process within 24 hours after the vault lock enters the InProgress state. After the 24 hour window ends, the lock ID expires, the vault automatically exits the InProgress state, and the vault lock policy is removed from the vault. You call CompleteVaultLock to complete the vault locking process by setting the state of the vault lock to Locked.  After a vault lock is in the Locked state, you cannot initiate a new vault lock for the vault. You can abort the vault locking process by calling AbortVaultLock. You can get the state of the vault lock by calling GetVaultLock. For more information about the vault locking process, Amazon Glacier Vault Lock. If this operation is called when the vault lock is in the InProgress state, the operation returns an AccessDeniedException error. When the vault lock is in the InProgress state you must call AbortVaultLock before you can initiate a new vault lock policy. 
      */
    def initiateVaultLock(params: InitiateVaultLockInput): awsDashSdkLib.libRequestMod.Request[InitiateVaultLockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def initiateVaultLock(
      params: InitiateVaultLockInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateVaultLockOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateVaultLockOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists jobs for a vault, including jobs that are in-progress and jobs that have recently finished. The List Job operation returns a list of these jobs sorted by job initiation time.  Amazon Glacier retains recently completed jobs for a period before deleting them; however, it eventually removes completed jobs. The output of completed jobs can be retrieved. Retaining completed jobs for a period of time after they have completed enables you to get a job output in the event you miss the job completion notification or your first attempt to download it fails. For example, suppose you start an archive retrieval job to download an archive. After the job completes, you start to download the archive but encounter a network error. In this scenario, you can retry and download the archive while the job exists.  The List Jobs operation supports pagination. You should always check the response Marker field. If there are no more jobs to list, the Marker field is set to null. If there are more jobs to list, the Marker field is set to a non-null value, which you can use to continue the pagination of the list. To return a list of jobs that begins at a specific job, set the marker request parameter to the Marker value for that job that you obtained from a previous List Jobs request. You can set a maximum limit for the number of jobs returned in the response by specifying the limit parameter in the request. The default limit is 50. The number of jobs returned might be fewer than the limit, but the number of returned jobs never exceeds the limit. Additionally, you can filter the jobs list returned by specifying the optional statuscode parameter or completed parameter, or both. Using the statuscode parameter, you can specify to return only jobs that match either the InProgress, Succeeded, or Failed status. Using the completed parameter, you can specify to return only jobs that were completed (true) or jobs that were not completed (false). For more information about using this operation, see the documentation for the underlying REST API List Jobs. 
      */
    def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobs(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists jobs for a vault, including jobs that are in-progress and jobs that have recently finished. The List Job operation returns a list of these jobs sorted by job initiation time.  Amazon Glacier retains recently completed jobs for a period before deleting them; however, it eventually removes completed jobs. The output of completed jobs can be retrieved. Retaining completed jobs for a period of time after they have completed enables you to get a job output in the event you miss the job completion notification or your first attempt to download it fails. For example, suppose you start an archive retrieval job to download an archive. After the job completes, you start to download the archive but encounter a network error. In this scenario, you can retry and download the archive while the job exists.  The List Jobs operation supports pagination. You should always check the response Marker field. If there are no more jobs to list, the Marker field is set to null. If there are more jobs to list, the Marker field is set to a non-null value, which you can use to continue the pagination of the list. To return a list of jobs that begins at a specific job, set the marker request parameter to the Marker value for that job that you obtained from a previous List Jobs request. You can set a maximum limit for the number of jobs returned in the response by specifying the limit parameter in the request. The default limit is 50. The number of jobs returned might be fewer than the limit, but the number of returned jobs never exceeds the limit. Additionally, you can filter the jobs list returned by specifying the optional statuscode parameter or completed parameter, or both. Using the statuscode parameter, you can specify to return only jobs that match either the InProgress, Succeeded, or Failed status. Using the completed parameter, you can specify to return only jobs that were completed (true) or jobs that were not completed (false). For more information about using this operation, see the documentation for the underlying REST API List Jobs. 
      */
    def listJobs(params: ListJobsInput): awsDashSdkLib.libRequestMod.Request[ListJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listJobs(
      params: ListJobsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListJobsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists in-progress multipart uploads for the specified vault. An in-progress multipart upload is a multipart upload that has been initiated by an InitiateMultipartUpload request, but has not yet been completed or aborted. The list returned in the List Multipart Upload response has no guaranteed order.  The List Multipart Uploads operation supports pagination. By default, this operation returns up to 50 multipart uploads in the response. You should always check the response for a marker at which to continue the list; if there are no more items the marker is null. To return a list of multipart uploads that begins at a specific upload, set the marker request parameter to the value you obtained from a previous List Multipart Upload request. You can also limit the number of uploads returned in the response by specifying the limit parameter in the request. Note the difference between this operation and listing parts (ListParts). The List Multipart Uploads operation lists all multipart uploads for a vault and does not require a multipart upload ID. The List Parts operation requires a multipart upload ID since parts are associated with a single upload. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and the underlying REST API, see Working with Archives in Amazon Glacier and List Multipart Uploads  in the Amazon Glacier Developer Guide.
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
      * This operation lists in-progress multipart uploads for the specified vault. An in-progress multipart upload is a multipart upload that has been initiated by an InitiateMultipartUpload request, but has not yet been completed or aborted. The list returned in the List Multipart Upload response has no guaranteed order.  The List Multipart Uploads operation supports pagination. By default, this operation returns up to 50 multipart uploads in the response. You should always check the response for a marker at which to continue the list; if there are no more items the marker is null. To return a list of multipart uploads that begins at a specific upload, set the marker request parameter to the value you obtained from a previous List Multipart Upload request. You can also limit the number of uploads returned in the response by specifying the limit parameter in the request. Note the difference between this operation and listing parts (ListParts). The List Multipart Uploads operation lists all multipart uploads for a vault and does not require a multipart upload ID. The List Parts operation requires a multipart upload ID since parts are associated with a single upload. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and the underlying REST API, see Working with Archives in Amazon Glacier and List Multipart Uploads  in the Amazon Glacier Developer Guide.
      */
    def listMultipartUploads(params: ListMultipartUploadsInput): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listMultipartUploads(
      params: ListMultipartUploadsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListMultipartUploadsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListMultipartUploadsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists the parts of an archive that have been uploaded in a specific multipart upload. You can make this request at any time during an in-progress multipart upload before you complete the upload (see CompleteMultipartUpload. List Parts returns an error for completed uploads. The list returned in the List Parts response is sorted by part range.  The List Parts operation supports pagination. By default, this operation returns up to 50 uploaded parts in the response. You should always check the response for a marker at which to continue the list; if there are no more items the marker is null. To return a list of parts that begins at a specific part, set the marker request parameter to the value you obtained from a previous List Parts request. You can also limit the number of parts returned in the response by specifying the limit parameter in the request.  An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and the underlying REST API, see Working with Archives in Amazon Glacier and List Parts in the Amazon Glacier Developer Guide.
      */
    def listParts(): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listParts(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListPartsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists the parts of an archive that have been uploaded in a specific multipart upload. You can make this request at any time during an in-progress multipart upload before you complete the upload (see CompleteMultipartUpload. List Parts returns an error for completed uploads. The list returned in the List Parts response is sorted by part range.  The List Parts operation supports pagination. By default, this operation returns up to 50 uploaded parts in the response. You should always check the response for a marker at which to continue the list; if there are no more items the marker is null. To return a list of parts that begins at a specific part, set the marker request parameter to the value you obtained from a previous List Parts request. You can also limit the number of parts returned in the response by specifying the limit parameter in the request.  An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and the underlying REST API, see Working with Archives in Amazon Glacier and List Parts in the Amazon Glacier Developer Guide.
      */
    def listParts(params: ListPartsInput): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listParts(
      params: ListPartsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListPartsOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[ListPartsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists the provisioned capacity units for the specified AWS account.
      */
    def listProvisionedCapacity(): awsDashSdkLib.libRequestMod.Request[ListProvisionedCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listProvisionedCapacity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProvisionedCapacityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProvisionedCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists the provisioned capacity units for the specified AWS account.
      */
    def listProvisionedCapacity(params: ListProvisionedCapacityInput): awsDashSdkLib.libRequestMod.Request[ListProvisionedCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listProvisionedCapacity(
      params: ListProvisionedCapacityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProvisionedCapacityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProvisionedCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists all the tags attached to a vault. The operation returns an empty map if there are no tags. For more information about tags, see Tagging Amazon Glacier Resources.
      */
    def listTagsForVault(): awsDashSdkLib.libRequestMod.Request[ListTagsForVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForVault(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists all the tags attached to a vault. The operation returns an empty map if there are no tags. For more information about tags, see Tagging Amazon Glacier Resources.
      */
    def listTagsForVault(params: ListTagsForVaultInput): awsDashSdkLib.libRequestMod.Request[ListTagsForVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTagsForVault(
      params: ListTagsForVaultInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists all vaults owned by the calling user's account. The list returned in the response is ASCII-sorted by vault name. By default, this operation returns up to 10 items. If there are more vaults to list, the response marker field contains the vault Amazon Resource Name (ARN) at which to continue the list with a new List Vaults request; otherwise, the marker field is null. To return a list of vaults that begins at a specific vault, set the marker request parameter to the vault ARN you obtained from a previous List Vaults request. You can also limit the number of vaults returned in the response by specifying the limit parameter in the request.  An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Retrieving Vault Metadata in Amazon Glacier and List Vaults  in the Amazon Glacier Developer Guide. 
      */
    def listVaults(): awsDashSdkLib.libRequestMod.Request[ListVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVaults(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVaultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation lists all vaults owned by the calling user's account. The list returned in the response is ASCII-sorted by vault name. By default, this operation returns up to 10 items. If there are more vaults to list, the response marker field contains the vault Amazon Resource Name (ARN) at which to continue the list with a new List Vaults request; otherwise, the marker field is null. To return a list of vaults that begins at a specific vault, set the marker request parameter to the vault ARN you obtained from a previous List Vaults request. You can also limit the number of vaults returned in the response by specifying the limit parameter in the request.  An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Retrieving Vault Metadata in Amazon Glacier and List Vaults  in the Amazon Glacier Developer Guide. 
      */
    def listVaults(params: ListVaultsInput): awsDashSdkLib.libRequestMod.Request[ListVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listVaults(
      params: ListVaultsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListVaultsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListVaultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation purchases a provisioned capacity unit for an AWS account. 
      */
    def purchaseProvisionedCapacity(): awsDashSdkLib.libRequestMod.Request[PurchaseProvisionedCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def purchaseProvisionedCapacity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseProvisionedCapacityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseProvisionedCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation purchases a provisioned capacity unit for an AWS account. 
      */
    def purchaseProvisionedCapacity(params: PurchaseProvisionedCapacityInput): awsDashSdkLib.libRequestMod.Request[PurchaseProvisionedCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def purchaseProvisionedCapacity(
      params: PurchaseProvisionedCapacityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PurchaseProvisionedCapacityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PurchaseProvisionedCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation removes one or more tags from the set of tags attached to a vault. For more information about tags, see Tagging Amazon Glacier Resources. This operation is idempotent. The operation will be successful, even if there are no tags attached to the vault. 
      */
    def removeTagsFromVault(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromVault(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation removes one or more tags from the set of tags attached to a vault. For more information about tags, see Tagging Amazon Glacier Resources. This operation is idempotent. The operation will be successful, even if there are no tags attached to the vault. 
      */
    def removeTagsFromVault(params: RemoveTagsFromVaultInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def removeTagsFromVault(
      params: RemoveTagsFromVaultInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation sets and then enacts a data retrieval policy in the region specified in the PUT request. You can set one policy per region for an AWS account. The policy is enacted within a few minutes of a successful PUT operation. The set policy operation does not affect retrieval jobs that were in progress before the policy was enacted. For more information about data retrieval policies, see Amazon Glacier Data Retrieval Policies. 
      */
    def setDataRetrievalPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setDataRetrievalPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation sets and then enacts a data retrieval policy in the region specified in the PUT request. You can set one policy per region for an AWS account. The policy is enacted within a few minutes of a successful PUT operation. The set policy operation does not affect retrieval jobs that were in progress before the policy was enacted. For more information about data retrieval policies, see Amazon Glacier Data Retrieval Policies. 
      */
    def setDataRetrievalPolicy(params: SetDataRetrievalPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setDataRetrievalPolicy(
      params: SetDataRetrievalPolicyInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation configures an access policy for a vault and will overwrite an existing policy. To configure a vault access policy, send a PUT request to the access-policy subresource of the vault. An access policy is specific to a vault and is also called a vault subresource. You can set one access policy per vault and the policy can be up to 20 KB in size. For more information about vault access policies, see Amazon Glacier Access Control with Vault Access Policies. 
      */
    def setVaultAccessPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setVaultAccessPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation configures an access policy for a vault and will overwrite an existing policy. To configure a vault access policy, send a PUT request to the access-policy subresource of the vault. An access policy is specific to a vault and is also called a vault subresource. You can set one access policy per vault and the policy can be up to 20 KB in size. For more information about vault access policies, see Amazon Glacier Access Control with Vault Access Policies. 
      */
    def setVaultAccessPolicy(params: SetVaultAccessPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setVaultAccessPolicy(
      params: SetVaultAccessPolicyInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation configures notifications that will be sent when specific events happen to a vault. By default, you don't get any notifications. To configure vault notifications, send a PUT request to the notification-configuration subresource of the vault. The request should include a JSON document that provides an Amazon SNS topic and specific events for which you want Amazon Glacier to send notifications to the topic. Amazon SNS topics must grant permission to the vault to be allowed to publish notifications to the topic. You can configure a vault to publish a notification for the following vault events:    ArchiveRetrievalCompleted This event occurs when a job that was initiated for an archive retrieval is completed (InitiateJob). The status of the completed job can be "Succeeded" or "Failed". The notification sent to the SNS topic is the same output as returned from DescribeJob.     InventoryRetrievalCompleted This event occurs when a job that was initiated for an inventory retrieval is completed (InitiateJob). The status of the completed job can be "Succeeded" or "Failed". The notification sent to the SNS topic is the same output as returned from DescribeJob.    An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Configuring Vault Notifications in Amazon Glacier and Set Vault Notification Configuration  in the Amazon Glacier Developer Guide. 
      */
    def setVaultNotifications(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setVaultNotifications(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation configures notifications that will be sent when specific events happen to a vault. By default, you don't get any notifications. To configure vault notifications, send a PUT request to the notification-configuration subresource of the vault. The request should include a JSON document that provides an Amazon SNS topic and specific events for which you want Amazon Glacier to send notifications to the topic. Amazon SNS topics must grant permission to the vault to be allowed to publish notifications to the topic. You can configure a vault to publish a notification for the following vault events:    ArchiveRetrievalCompleted This event occurs when a job that was initiated for an archive retrieval is completed (InitiateJob). The status of the completed job can be "Succeeded" or "Failed". The notification sent to the SNS topic is the same output as returned from DescribeJob.     InventoryRetrievalCompleted This event occurs when a job that was initiated for an inventory retrieval is completed (InitiateJob). The status of the completed job can be "Succeeded" or "Failed". The notification sent to the SNS topic is the same output as returned from DescribeJob.    An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM). For conceptual information and underlying REST API, see Configuring Vault Notifications in Amazon Glacier and Set Vault Notification Configuration  in the Amazon Glacier Developer Guide. 
      */
    def setVaultNotifications(params: SetVaultNotificationsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def setVaultNotifications(
      params: SetVaultNotificationsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation adds an archive to a vault. This is a synchronous operation, and for a successful upload, your data is durably persisted. Amazon Glacier returns the archive ID in the x-amz-archive-id header of the response.  You must use the archive ID to access your data in Amazon Glacier. After you upload an archive, you should save the archive ID returned so that you can retrieve or delete the archive later. Besides saving the archive ID, you can also index it and give it a friendly name to allow for better searching. You can also use the optional archive description field to specify how the archive is referred to in an external index of archives, such as you might create in Amazon DynamoDB. You can also get the vault inventory to obtain a list of archive IDs in a vault. For more information, see InitiateJob.  You must provide a SHA256 tree hash of the data you are uploading. For information about computing a SHA256 tree hash, see Computing Checksums.  You can optionally specify an archive description of up to 1,024 printable ASCII characters. You can get the archive description when you either retrieve the archive or get the vault inventory. For more information, see InitiateJob. Amazon Glacier does not interpret the description in any way. An archive description does not need to be unique. You cannot use the description to retrieve or sort the archive list.  Archives are immutable. After you upload an archive, you cannot edit the archive or its description. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Uploading an Archive in Amazon Glacier and Upload Archive in the Amazon Glacier Developer Guide. 
      */
    def uploadArchive(): awsDashSdkLib.libRequestMod.Request[ArchiveCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadArchive(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ArchiveCreationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ArchiveCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation adds an archive to a vault. This is a synchronous operation, and for a successful upload, your data is durably persisted. Amazon Glacier returns the archive ID in the x-amz-archive-id header of the response.  You must use the archive ID to access your data in Amazon Glacier. After you upload an archive, you should save the archive ID returned so that you can retrieve or delete the archive later. Besides saving the archive ID, you can also index it and give it a friendly name to allow for better searching. You can also use the optional archive description field to specify how the archive is referred to in an external index of archives, such as you might create in Amazon DynamoDB. You can also get the vault inventory to obtain a list of archive IDs in a vault. For more information, see InitiateJob.  You must provide a SHA256 tree hash of the data you are uploading. For information about computing a SHA256 tree hash, see Computing Checksums.  You can optionally specify an archive description of up to 1,024 printable ASCII characters. You can get the archive description when you either retrieve the archive or get the vault inventory. For more information, see InitiateJob. Amazon Glacier does not interpret the description in any way. An archive description does not need to be unique. You cannot use the description to retrieve or sort the archive list.  Archives are immutable. After you upload an archive, you cannot edit the archive or its description. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Uploading an Archive in Amazon Glacier and Upload Archive in the Amazon Glacier Developer Guide. 
      */
    def uploadArchive(params: UploadArchiveInput): awsDashSdkLib.libRequestMod.Request[ArchiveCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadArchive(
      params: UploadArchiveInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ArchiveCreationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ArchiveCreationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation uploads a part of an archive. You can upload archive parts in any order. You can also upload them in parallel. You can upload up to 10,000 parts for a multipart upload. Amazon Glacier rejects your upload part request if any of the following conditions is true:    SHA256 tree hash does not matchTo ensure that part data is not corrupted in transmission, you compute a SHA256 tree hash of the part and include it in your request. Upon receiving the part data, Amazon Glacier also computes a SHA256 tree hash. If these hash values don't match, the operation fails. For information about computing a SHA256 tree hash, see Computing Checksums.    Part size does not matchThe size of each part except the last must match the size specified in the corresponding InitiateMultipartUpload request. The size of the last part must be the same size as, or smaller than, the specified size.  If you upload a part whose size is smaller than the part size you specified in your initiate multipart upload request and that part is not the last part, then the upload part request will succeed. However, the subsequent Complete Multipart Upload request will fail.     Range does not alignThe byte range value in the request does not align with the part size specified in the corresponding initiate request. For example, if you specify a part size of 4194304 bytes (4 MB), then 0 to 4194303 bytes (4 MB - 1) and 4194304 (4 MB) to 8388607 (8 MB - 1) are valid part ranges. However, if you set a range value of 2 MB to 6 MB, the range does not align with the part size and the upload will fail.    This operation is idempotent. If you upload the same part multiple times, the data included in the most recent request overwrites the previously uploaded data. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Uploading Large Archives in Parts (Multipart Upload) and Upload Part  in the Amazon Glacier Developer Guide.
      */
    def uploadMultipartPart(): awsDashSdkLib.libRequestMod.Request[UploadMultipartPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadMultipartPart(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadMultipartPartOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadMultipartPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * This operation uploads a part of an archive. You can upload archive parts in any order. You can also upload them in parallel. You can upload up to 10,000 parts for a multipart upload. Amazon Glacier rejects your upload part request if any of the following conditions is true:    SHA256 tree hash does not matchTo ensure that part data is not corrupted in transmission, you compute a SHA256 tree hash of the part and include it in your request. Upon receiving the part data, Amazon Glacier also computes a SHA256 tree hash. If these hash values don't match, the operation fails. For information about computing a SHA256 tree hash, see Computing Checksums.    Part size does not matchThe size of each part except the last must match the size specified in the corresponding InitiateMultipartUpload request. The size of the last part must be the same size as, or smaller than, the specified size.  If you upload a part whose size is smaller than the part size you specified in your initiate multipart upload request and that part is not the last part, then the upload part request will succeed. However, the subsequent Complete Multipart Upload request will fail.     Range does not alignThe byte range value in the request does not align with the part size specified in the corresponding initiate request. For example, if you specify a part size of 4194304 bytes (4 MB), then 0 to 4194303 bytes (4 MB - 1) and 4194304 (4 MB) to 8388607 (8 MB - 1) are valid part ranges. However, if you set a range value of 2 MB to 6 MB, the range does not align with the part size and the upload will fail.    This operation is idempotent. If you upload the same part multiple times, the data included in the most recent request overwrites the previously uploaded data. An AWS account has full permission to perform all operations (actions). However, AWS Identity and Access Management (IAM) users don't have any permissions by default. You must grant them explicit permission to perform specific actions. For more information, see Access Control Using AWS Identity and Access Management (IAM).  For conceptual information and underlying REST API, see Uploading Large Archives in Parts (Multipart Upload) and Upload Part  in the Amazon Glacier Developer Guide.
      */
    def uploadMultipartPart(params: UploadMultipartPartInput): awsDashSdkLib.libRequestMod.Request[UploadMultipartPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def uploadMultipartPart(
      params: UploadMultipartPartInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UploadMultipartPartOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UploadMultipartPartOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the vaultExists state by periodically calling the underlying Glacier.describeVaultoperation every 3 seconds (at most 15 times).
      */
    @JSName("waitFor")
    def waitFor_vaultExists(state: awsDashSdkLib.awsDashSdkLibStrings.vaultExists): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_vaultExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.vaultExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the vaultExists state by periodically calling the underlying Glacier.describeVaultoperation every 3 seconds (at most 15 times).
      */
    @JSName("waitFor")
    def waitFor_vaultExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.vaultExists,
      params: DescribeVaultInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_vaultExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.vaultExists,
      params: DescribeVaultInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the vaultNotExists state by periodically calling the underlying Glacier.describeVaultoperation every 3 seconds (at most 15 times).
      */
    @JSName("waitFor")
    def waitFor_vaultNotExists(state: awsDashSdkLib.awsDashSdkLibStrings.vaultNotExists): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_vaultNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.vaultNotExists,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the vaultNotExists state by periodically calling the underlying Glacier.describeVaultoperation every 3 seconds (at most 15 times).
      */
    @JSName("waitFor")
    def waitFor_vaultNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.vaultNotExists,
      params: DescribeVaultInput with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_vaultNotExists(
      state: awsDashSdkLib.awsDashSdkLibStrings.vaultNotExists,
      params: DescribeVaultInput with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVaultOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVaultOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UploadArchiveInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The optional description of the archive you are uploading.
      */
    var archiveDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The data to upload.
      */
    var body: js.UndefOr[Stream] = js.undefined
    /**
      * The SHA256 tree hash of the data being uploaded.
      */
    var checksum: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait UploadListElement extends js.Object {
    /**
      * The description of the archive that was specified in the Initiate Multipart Upload request.
      */
    var ArchiveDescription: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The UTC time at which the multipart upload was initiated.
      */
    var CreationDate: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The ID of a multipart upload.
      */
    var MultipartUploadId: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The part size, in bytes, specified in the Initiate Multipart Upload request. This is the size of all the parts in the upload except the last part, which may be smaller than this size.
      */
    var PartSizeInBytes: js.UndefOr[long] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the vault that contains the archive.
      */
    var VaultARN: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UploadMultipartPartInput extends js.Object {
    /**
      * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
      */
    var accountId: java.lang.String
    /**
      * The data to upload.
      */
    var body: js.UndefOr[Stream] = js.undefined
    /**
      * The SHA256 tree hash of the data being uploaded.
      */
    var checksum: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Identifies the range of bytes in the assembled archive that will be uploaded in this part. Amazon Glacier uses this information to assemble the archive in the proper sequence. The format of this header follows RFC 2616. An example header is Content-Range:bytes 0-4194303/ *.
      */
    var range: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The upload ID of the multipart upload.
      */
    var uploadId: java.lang.String
    /**
      * The name of the vault.
      */
    var vaultName: java.lang.String
  }
  
  trait UploadMultipartPartOutput extends js.Object {
    /**
      * The SHA256 tree hash that Amazon Glacier computed for the uploaded part.
      */
    var checksum: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait VaultAccessPolicy extends js.Object {
    /**
      * The vault access policy.
      */
    var Policy: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait VaultLockPolicy extends js.Object {
    /**
      * The vault lock policy.
      */
    var Policy: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait VaultNotificationConfig extends js.Object {
    /**
      * A list of one or more events for which Amazon Glacier will send a notification to the specified Amazon SNS topic.
      */
    var Events: js.UndefOr[NotificationEventList] = js.undefined
    /**
      * The Amazon Simple Notification Service (Amazon SNS) topic Amazon Resource Name (ARN).
      */
    var SNSTopic: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait _ActionCode extends js.Object
  
  trait _CannedACL extends js.Object
  
  trait _EncryptionType extends js.Object
  
  trait _FileHeaderInfo extends js.Object
  
  trait _Permission extends js.Object
  
  trait _QuoteFields extends js.Object
  
  trait _StatusCode extends js.Object
  
  trait _StorageClass extends js.Object
  
  trait _Type extends js.Object
  
  trait _apiVersion extends js.Object
  
  trait hashmap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  val TypesNs: this.type = js.native
  type AccessControlPolicyList = js.Array[Grant]
  type ActionCode = _ActionCode | java.lang.String
  type CannedACL = _CannedACL | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DataRetrievalRulesList = js.Array[DataRetrievalRule]
  type DateTime = java.lang.String
  type EncryptionType = _EncryptionType | java.lang.String
  type ExpressionType = awsDashSdkLib.awsDashSdkLibStrings.SQL | java.lang.String
  type FileHeaderInfo = _FileHeaderInfo | java.lang.String
  type JobList = js.Array[GlacierJobDescription]
  type NotificationEventList = js.Array[java.lang.String]
  type NullableLong = scala.Double
  type PartList = js.Array[PartListElement]
  type Permission = _Permission | java.lang.String
  type ProvisionedCapacityList = js.Array[ProvisionedCapacityDescription]
  type QuoteFields = _QuoteFields | java.lang.String
  type Size = scala.Double
  type StatusCode = _StatusCode | java.lang.String
  type StorageClass = _StorageClass | java.lang.String
  type Stream = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsGlacierMod.Blob | java.lang.String | nodeLib.streamMod.Readable
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagValue = java.lang.String
  type Type = _Type | java.lang.String
  type UploadsList = js.Array[UploadListElement]
  type VaultList = js.Array[DescribeVaultOutput]
  type apiVersion = _apiVersion | java.lang.String
  type httpstatus = scala.Double
  type long = scala.Double
}

