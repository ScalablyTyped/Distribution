package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlacierJobDescription extends js.Object {
  /**
    * The job type. This value is either ArchiveRetrieval, InventoryRetrieval, or Select. 
    */
  var Action: js.UndefOr[ActionCode] = js.undefined
  /**
    * The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
    */
  var ArchiveId: js.UndefOr[String] = js.undefined
  /**
    * The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this field is null.
    */
  var ArchiveSHA256TreeHash: js.UndefOr[String] = js.undefined
  /**
    * For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an inventory retrieval or select job, this value is null.
    */
  var ArchiveSizeInBytes: js.UndefOr[Size] = js.undefined
  /**
    * The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
    */
  var Completed: js.UndefOr[Boolean] = js.undefined
  /**
    * The UTC time that the job request completed. While the job is in progress, the value is null.
    */
  var CompletionDate: js.UndefOr[String] = js.undefined
  /**
    * The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example "2012-03-20T17:03:43.221Z".
    */
  var CreationDate: js.UndefOr[String] = js.undefined
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
  var JobDescription: js.UndefOr[String] = js.undefined
  /**
    * An opaque string that identifies an Amazon S3 Glacier job.
    */
  var JobId: js.UndefOr[String] = js.undefined
  /**
    * Contains the job output location.
    */
  var JobOutputPath: js.UndefOr[String] = js.undefined
  /**
    * Contains the location where the data from the select job is stored.
    */
  var OutputLocation: js.UndefOr[typings.awsDashSdk.clientsGlacierMod.OutputLocation] = js.undefined
  /**
    * The retrieved byte range for archive retrieval jobs in the form StartByteValue-EndByteValue. If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case, StartByteValue equals 0 and EndByteValue equals the size of the archive minus 1. For inventory retrieval or select jobs, this field is null. 
    */
  var RetrievalByteRange: js.UndefOr[String] = js.undefined
  /**
    * For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null. The SHA256 tree hash value for the requested range of an archive. If the InitiateJob request for an archive specified a tree-hash aligned range, then this field returns a value. If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value. This field is null for the following:   Archive retrieval jobs that specify a range that is not tree-hash aligned     Archival jobs that specify a range that is equal to the whole archive, when the job status is InProgress      Inventory jobs   Select jobs  
    */
  var SHA256TreeHash: js.UndefOr[String] = js.undefined
  /**
    * An Amazon SNS topic that receives notification.
    */
  var SNSTopic: js.UndefOr[String] = js.undefined
  /**
    * Contains the parameters used for a select.
    */
  var SelectParameters: js.UndefOr[typings.awsDashSdk.clientsGlacierMod.SelectParameters] = js.undefined
  /**
    * The status code can be InProgress, Succeeded, or Failed, and indicates the status of the job.
    */
  var StatusCode: js.UndefOr[typings.awsDashSdk.clientsGlacierMod.StatusCode] = js.undefined
  /**
    * A friendly message that describes the job status.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * The tier to use for a select or an archive retrieval. Valid values are Expedited, Standard, or Bulk. Standard is the default.
    */
  var Tier: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
    */
  var VaultARN: js.UndefOr[String] = js.undefined
}

object GlacierJobDescription {
  @scala.inline
  def apply(
    Action: ActionCode = null,
    ArchiveId: String = null,
    ArchiveSHA256TreeHash: String = null,
    ArchiveSizeInBytes: Int | Double = null,
    Completed: js.UndefOr[Boolean] = js.undefined,
    CompletionDate: String = null,
    CreationDate: String = null,
    InventoryRetrievalParameters: InventoryRetrievalJobDescription = null,
    InventorySizeInBytes: Int | Double = null,
    JobDescription: String = null,
    JobId: String = null,
    JobOutputPath: String = null,
    OutputLocation: OutputLocation = null,
    RetrievalByteRange: String = null,
    SHA256TreeHash: String = null,
    SNSTopic: String = null,
    SelectParameters: SelectParameters = null,
    StatusCode: StatusCode = null,
    StatusMessage: String = null,
    Tier: String = null,
    VaultARN: String = null
  ): GlacierJobDescription = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (ArchiveId != null) __obj.updateDynamic("ArchiveId")(ArchiveId)
    if (ArchiveSHA256TreeHash != null) __obj.updateDynamic("ArchiveSHA256TreeHash")(ArchiveSHA256TreeHash)
    if (ArchiveSizeInBytes != null) __obj.updateDynamic("ArchiveSizeInBytes")(ArchiveSizeInBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(Completed)) __obj.updateDynamic("Completed")(Completed)
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (InventoryRetrievalParameters != null) __obj.updateDynamic("InventoryRetrievalParameters")(InventoryRetrievalParameters)
    if (InventorySizeInBytes != null) __obj.updateDynamic("InventorySizeInBytes")(InventorySizeInBytes.asInstanceOf[js.Any])
    if (JobDescription != null) __obj.updateDynamic("JobDescription")(JobDescription)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobOutputPath != null) __obj.updateDynamic("JobOutputPath")(JobOutputPath)
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation)
    if (RetrievalByteRange != null) __obj.updateDynamic("RetrievalByteRange")(RetrievalByteRange)
    if (SHA256TreeHash != null) __obj.updateDynamic("SHA256TreeHash")(SHA256TreeHash)
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic)
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters)
    if (StatusCode != null) __obj.updateDynamic("StatusCode")(StatusCode.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier)
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN)
    __obj.asInstanceOf[GlacierJobDescription]
  }
}

