package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JournalS3ExportDescription extends StObject {
  
  /**
    * The exclusive end date and time for the range of journal contents that was specified in the original export request.
    */
  var ExclusiveEndTime: js.Date
  
  /**
    * The date and time, in epoch time format, when the export job was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var ExportCreationTime: js.Date
  
  /**
    * The UUID (represented in Base62-encoded text) of the journal export job.
    */
  var ExportId: UniqueId
  
  /**
    * The inclusive start date and time for the range of journal contents that was specified in the original export request.
    */
  var InclusiveStartTime: js.Date
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.clientsQldbMod.LedgerName
  
  /**
    * The output format of the exported journal data.
    */
  var OutputFormat: js.UndefOr[typings.awsSdk.clientsQldbMod.OutputFormat] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:   Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.   (Optional) Use your customer managed key in Key Management Service (KMS) for server-side encryption of your exported data.  
    */
  var RoleArn: Arn
  
  var S3ExportConfiguration: typings.awsSdk.clientsQldbMod.S3ExportConfiguration
  
  /**
    * The current state of the journal export job.
    */
  var Status: ExportStatus
}
object JournalS3ExportDescription {
  
  inline def apply(
    ExclusiveEndTime: js.Date,
    ExportCreationTime: js.Date,
    ExportId: UniqueId,
    InclusiveStartTime: js.Date,
    LedgerName: LedgerName,
    RoleArn: Arn,
    S3ExportConfiguration: S3ExportConfiguration,
    Status: ExportStatus
  ): JournalS3ExportDescription = {
    val __obj = js.Dynamic.literal(ExclusiveEndTime = ExclusiveEndTime.asInstanceOf[js.Any], ExportCreationTime = ExportCreationTime.asInstanceOf[js.Any], ExportId = ExportId.asInstanceOf[js.Any], InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], LedgerName = LedgerName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], S3ExportConfiguration = S3ExportConfiguration.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JournalS3ExportDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JournalS3ExportDescription] (val x: Self) extends AnyVal {
    
    inline def setExclusiveEndTime(value: js.Date): Self = StObject.set(x, "ExclusiveEndTime", value.asInstanceOf[js.Any])
    
    inline def setExportCreationTime(value: js.Date): Self = StObject.set(x, "ExportCreationTime", value.asInstanceOf[js.Any])
    
    inline def setExportId(value: UniqueId): Self = StObject.set(x, "ExportId", value.asInstanceOf[js.Any])
    
    inline def setInclusiveStartTime(value: js.Date): Self = StObject.set(x, "InclusiveStartTime", value.asInstanceOf[js.Any])
    
    inline def setLedgerName(value: LedgerName): Self = StObject.set(x, "LedgerName", value.asInstanceOf[js.Any])
    
    inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setS3ExportConfiguration(value: S3ExportConfiguration): Self = StObject.set(x, "S3ExportConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ExportStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
