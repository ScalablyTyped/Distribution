package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JournalS3ExportDescription extends js.Object {
  /**
    * The exclusive end date and time for the range of journal contents that are specified in the original export request.
    */
  var ExclusiveEndTime: Timestamp
  /**
    * The date and time, in epoch time format, when the export job was created. (Epoch time format is the number of seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
    */
  var ExportCreationTime: Timestamp
  /**
    * The unique ID of the journal export job.
    */
  var ExportId: UniqueId
  /**
    * The inclusive start date and time for the range of journal contents that are specified in the original export request.
    */
  var InclusiveStartTime: Timestamp
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsDashSdk.clientsQldbMod.LedgerName
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal export job to do the following:   Write objects into your Amazon Simple Storage Service (Amazon S3) bucket.   (Optional) Use your customer master key (CMK) in AWS Key Management Service (AWS KMS) for server-side encryption of your exported data.  
    */
  var RoleArn: Arn
  var S3ExportConfiguration: typings.awsDashSdk.clientsQldbMod.S3ExportConfiguration
  /**
    * The current state of the journal export job.
    */
  var Status: ExportStatus
}

object JournalS3ExportDescription {
  @scala.inline
  def apply(
    ExclusiveEndTime: Timestamp,
    ExportCreationTime: Timestamp,
    ExportId: UniqueId,
    InclusiveStartTime: Timestamp,
    LedgerName: LedgerName,
    RoleArn: Arn,
    S3ExportConfiguration: S3ExportConfiguration,
    Status: ExportStatus
  ): JournalS3ExportDescription = {
    val __obj = js.Dynamic.literal(ExclusiveEndTime = ExclusiveEndTime, ExportCreationTime = ExportCreationTime, ExportId = ExportId, InclusiveStartTime = InclusiveStartTime, LedgerName = LedgerName, RoleArn = RoleArn, S3ExportConfiguration = S3ExportConfiguration, Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JournalS3ExportDescription]
  }
}

