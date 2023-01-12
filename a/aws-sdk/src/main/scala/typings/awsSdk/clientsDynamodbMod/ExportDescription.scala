package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDescription extends StObject {
  
  /**
    * The billable size of the table export.
    */
  var BilledSizeBytes: js.UndefOr[typings.awsSdk.clientsDynamodbMod.BilledSizeBytes] = js.undefined
  
  /**
    * The client token that was provided for the export task. A client token makes calls to ExportTableToPointInTimeInput idempotent, meaning that multiple identical calls have the same effect as one single call.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ClientToken] = js.undefined
  
  /**
    * The time at which the export task completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the table export.
    */
  var ExportArn: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ExportArn] = js.undefined
  
  /**
    * The format of the exported data. Valid values for ExportFormat are DYNAMODB_JSON or ION.
    */
  var ExportFormat: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ExportFormat] = js.undefined
  
  /**
    * The name of the manifest file for the export task.
    */
  var ExportManifest: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ExportManifest] = js.undefined
  
  /**
    * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
    */
  var ExportStatus: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ExportStatus] = js.undefined
  
  /**
    * Point in time from which table data was exported.
    */
  var ExportTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Status code for the result of the failed export.
    */
  var FailureCode: js.UndefOr[typings.awsSdk.clientsDynamodbMod.FailureCode] = js.undefined
  
  /**
    * Export failure reason description.
    */
  var FailureMessage: js.UndefOr[typings.awsSdk.clientsDynamodbMod.FailureMessage] = js.undefined
  
  /**
    * The number of items exported.
    */
  var ItemCount: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ItemCount] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket containing the export.
    */
  var S3Bucket: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3Bucket] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the bucket containing the export.
    */
  var S3BucketOwner: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3BucketOwner] = js.undefined
  
  /**
    * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
    */
  var S3Prefix: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3Prefix] = js.undefined
  
  /**
    * Type of encryption used on the bucket where export data is stored. Valid values for S3SseAlgorithm are:    AES256 - server-side encryption with Amazon S3 managed keys    KMS - server-side encryption with KMS managed keys  
    */
  var S3SseAlgorithm: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3SseAlgorithm] = js.undefined
  
  /**
    * The ID of the KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
    */
  var S3SseKmsKeyId: js.UndefOr[typings.awsSdk.clientsDynamodbMod.S3SseKmsKeyId] = js.undefined
  
  /**
    * The time at which the export task began.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the table that was exported.
    */
  var TableArn: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableArn] = js.undefined
  
  /**
    * Unique ID of the table that was exported.
    */
  var TableId: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableId] = js.undefined
}
object ExportDescription {
  
  inline def apply(): ExportDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportDescription] (val x: Self) extends AnyVal {
    
    inline def setBilledSizeBytes(value: BilledSizeBytes): Self = StObject.set(x, "BilledSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setBilledSizeBytesUndefined: Self = StObject.set(x, "BilledSizeBytes", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    
    inline def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
    
    inline def setExportFormat(value: ExportFormat): Self = StObject.set(x, "ExportFormat", value.asInstanceOf[js.Any])
    
    inline def setExportFormatUndefined: Self = StObject.set(x, "ExportFormat", js.undefined)
    
    inline def setExportManifest(value: ExportManifest): Self = StObject.set(x, "ExportManifest", value.asInstanceOf[js.Any])
    
    inline def setExportManifestUndefined: Self = StObject.set(x, "ExportManifest", js.undefined)
    
    inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
    
    inline def setExportTime(value: js.Date): Self = StObject.set(x, "ExportTime", value.asInstanceOf[js.Any])
    
    inline def setExportTimeUndefined: Self = StObject.set(x, "ExportTime", js.undefined)
    
    inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setFailureMessage(value: FailureMessage): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
    
    inline def setItemCount(value: ItemCount): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    inline def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    inline def setS3Bucket(value: S3Bucket): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwner(value: S3BucketOwner): Self = StObject.set(x, "S3BucketOwner", value.asInstanceOf[js.Any])
    
    inline def setS3BucketOwnerUndefined: Self = StObject.set(x, "S3BucketOwner", js.undefined)
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Prefix(value: S3Prefix): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
    
    inline def setS3SseAlgorithm(value: S3SseAlgorithm): Self = StObject.set(x, "S3SseAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setS3SseAlgorithmUndefined: Self = StObject.set(x, "S3SseAlgorithm", js.undefined)
    
    inline def setS3SseKmsKeyId(value: S3SseKmsKeyId): Self = StObject.set(x, "S3SseKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setS3SseKmsKeyIdUndefined: Self = StObject.set(x, "S3SseKmsKeyId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
  }
}
