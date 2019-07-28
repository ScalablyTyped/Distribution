package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDocumentTextDetectionResponse extends js.Object {
  /**
    * The results of the text-detection operation.
    */
  var Blocks: js.UndefOr[BlockList] = js.undefined
  /**
    * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract video operation.
    */
  var DocumentMetadata: js.UndefOr[typings.awsDashSdk.clientsTextractMod.DocumentMetadata] = js.undefined
  /**
    * The current status of the text detection job.
    */
  var JobStatus: js.UndefOr[typings.awsDashSdk.clientsTextractMod.JobStatus] = js.undefined
  /**
    * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text-detection results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The current status of an asynchronous document text-detection operation. 
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsTextractMod.StatusMessage] = js.undefined
  /**
    * A list of warnings that occurred during the document text-detection operation.
    */
  var Warnings: js.UndefOr[typings.awsDashSdk.clientsTextractMod.Warnings] = js.undefined
}

object GetDocumentTextDetectionResponse {
  @scala.inline
  def apply(
    Blocks: BlockList = null,
    DocumentMetadata: DocumentMetadata = null,
    JobStatus: JobStatus = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    Warnings: Warnings = null
  ): GetDocumentTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Blocks != null) __obj.updateDynamic("Blocks")(Blocks)
    if (DocumentMetadata != null) __obj.updateDynamic("DocumentMetadata")(DocumentMetadata)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Warnings != null) __obj.updateDynamic("Warnings")(Warnings)
    __obj.asInstanceOf[GetDocumentTextDetectionResponse]
  }
}

