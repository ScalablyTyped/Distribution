package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object JobParameters {
  @scala.inline
  def apply(
    ArchiveId: java.lang.String = null,
    Description: java.lang.String = null,
    Format: java.lang.String = null,
    InventoryRetrievalParameters: InventoryRetrievalJobInput = null,
    OutputLocation: OutputLocation = null,
    RetrievalByteRange: java.lang.String = null,
    SNSTopic: java.lang.String = null,
    SelectParameters: SelectParameters = null,
    Tier: java.lang.String = null,
    Type: java.lang.String = null
  ): JobParameters = {
    val __obj = js.Dynamic.literal()
    if (ArchiveId != null) __obj.updateDynamic("ArchiveId")(ArchiveId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (InventoryRetrievalParameters != null) __obj.updateDynamic("InventoryRetrievalParameters")(InventoryRetrievalParameters)
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation)
    if (RetrievalByteRange != null) __obj.updateDynamic("RetrievalByteRange")(RetrievalByteRange)
    if (SNSTopic != null) __obj.updateDynamic("SNSTopic")(SNSTopic)
    if (SelectParameters != null) __obj.updateDynamic("SelectParameters")(SelectParameters)
    if (Tier != null) __obj.updateDynamic("Tier")(Tier)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[JobParameters]
  }
}

