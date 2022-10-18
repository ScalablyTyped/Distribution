package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTableToPointInTimeInput extends StObject {
  
  /**
    * Providing a ClientToken makes the call to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call. A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request with the same client token is treated as a new request. Do not resubmit the same request with the same client token for more than 8 hours, or the result might not be idempotent. If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency window, DynamoDB returns an ImportConflictException.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ClientToken] = js.undefined
  
  /**
    * The format for the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
    */
  var ExportFormat: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ExportFormat] = js.undefined
  
  /**
    * Time in the past from which to export table data, counted in seconds from the start of the Unix epoch. The table export will be a snapshot of the table's state at this point in time.
    */
  var ExportTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket to export the snapshot to.
    */
  var S3Bucket: typings.awsSdk.clientsDynamodbMod.S3Bucket
  
  /**
    * The ID of the Amazon Web Services account that owns the bucket the export will be stored in.
    */
  var S3BucketOwner: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3BucketOwner] = js.undefined
  
  /**
    * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3Prefix] = js.undefined
  
  /**
    * Type of encryption used on the bucket where export data will be stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with KMS managed keys  
    */
  var S3SseAlgorithm: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3SseAlgorithm] = js.undefined
  
  /**
    * The ID of the KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
    */
  var S3SseKmsKeyId: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3SseKmsKeyId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) associated with the table to export.
    */
  var TableArn: typings.awsSdk.clientsDynamodbMod.TableArn
}
object ExportTableToPointInTimeInput {
  
  inline def apply(S3Bucket: S3Bucket, TableArn: TableArn): ExportTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any], TableArn = TableArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTableToPointInTimeInput]
  }
  
  extension [Self <: ExportTableToPointInTimeInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setExportFormat(value: ExportFormat): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
    
    inline def setExportTime(value: js.Date): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
    
    inline def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
    
    inline def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    inline def setS3SseAlgorithm(value: S3SseAlgorithm): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
    
    inline def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
    
    inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
  }
}
