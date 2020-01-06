package typings.awsDashSdk.clientsTextractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentTextDetectionResponse extends js.Object {
  /**
    * The results of the text-detection operation.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  /**
    * 
    */
  var DetectDocumentTextModelVersion: js.UndefOr[String] = js.native
  /**
    * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract video operation.
    */
  var DocumentMetadata: js.UndefOr[typings.awsDashSdk.clientsTextractMod.DocumentMetadata] = js.native
  /**
    * The current status of the text detection job.
    */
  var JobStatus: js.UndefOr[typings.awsDashSdk.clientsTextractMod.JobStatus] = js.native
  /**
    * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text-detection results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The current status of an asynchronous text-detection operation for the document. 
    */
  var StatusMessage: js.UndefOr[typings.awsDashSdk.clientsTextractMod.StatusMessage] = js.native
  /**
    * A list of warnings that occurred during the text-detection operation for the document.
    */
  var Warnings: js.UndefOr[typings.awsDashSdk.clientsTextractMod.Warnings] = js.native
}

object GetDocumentTextDetectionResponse {
  @scala.inline
  def apply(
    Blocks: BlockList = null,
    DetectDocumentTextModelVersion: String = null,
    DocumentMetadata: DocumentMetadata = null,
    JobStatus: JobStatus = null,
    NextToken: PaginationToken = null,
    StatusMessage: StatusMessage = null,
    Warnings: Warnings = null
  ): GetDocumentTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Blocks != null) __obj.updateDynamic("Blocks")(Blocks.asInstanceOf[js.Any])
    if (DetectDocumentTextModelVersion != null) __obj.updateDynamic("DetectDocumentTextModelVersion")(DetectDocumentTextModelVersion.asInstanceOf[js.Any])
    if (DocumentMetadata != null) __obj.updateDynamic("DocumentMetadata")(DocumentMetadata.asInstanceOf[js.Any])
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    if (Warnings != null) __obj.updateDynamic("Warnings")(Warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDocumentTextDetectionResponse]
  }
}

