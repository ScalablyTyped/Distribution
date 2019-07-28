package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportJobResponse extends js.Object {
  /**
    * The unique identifier for the application that's associated with the import job.
    */
  var ApplicationId: __string
  /**
    * The number of pieces that were processed successfully (completed) by the import job, as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[__integer] = js.undefined
  /**
    * The date, in ISO 8601 format, when the import job was completed.
    */
  var CompletionDate: js.UndefOr[__string] = js.undefined
  /**
    * The date, in ISO 8601 format, when the import job was created.
    */
  var CreationDate: __string
  /**
    * The resource settings that apply to the import job.
    */
  var Definition: ImportJobResource
  /**
    * The number of pieces that weren't processed successfully (failed) by the import job, as of the time of the request.
    */
  var FailedPieces: js.UndefOr[__integer] = js.undefined
  /**
    * An array of entries, one for each of the first 100 entries that weren't processed successfully (failed) by the import job, if any.
    */
  var Failures: js.UndefOr[ListOf__string] = js.undefined
  /**
    * The unique identifier for the import job.
    */
  var Id: __string
  /**
    * The status of the import job. The job status is FAILED if Amazon Pinpoint wasn't able to process one or more pieces in the job.
    */
  var JobStatus: typings.awsDashSdk.clientsPinpointMod.JobStatus
  /**
    * The total number of endpoint definitions that weren't processed successfully (failed) by the import job, typically because an error, such as a syntax error, occurred.
    */
  var TotalFailures: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of pieces that must be processed to complete the import job. Each piece consists of an approximately equal portion of the endpoint definitions that are part of the import job.
    */
  var TotalPieces: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of endpoint definitions that were processed by the import job.
    */
  var TotalProcessed: js.UndefOr[__integer] = js.undefined
  /**
    * The job type. This value is IMPORT for import jobs.
    */
  var Type: __string
}

object ImportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: __string,
    CreationDate: __string,
    Definition: ImportJobResource,
    Id: __string,
    JobStatus: JobStatus,
    Type: __string,
    CompletedPieces: js.UndefOr[__integer] = js.undefined,
    CompletionDate: __string = null,
    FailedPieces: js.UndefOr[__integer] = js.undefined,
    Failures: ListOf__string = null,
    TotalFailures: js.UndefOr[__integer] = js.undefined,
    TotalPieces: js.UndefOr[__integer] = js.undefined,
    TotalProcessed: js.UndefOr[__integer] = js.undefined
  ): ImportJobResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CreationDate = CreationDate, Definition = Definition, Id = Id, JobStatus = JobStatus.asInstanceOf[js.Any], Type = Type)
    if (!js.isUndefined(CompletedPieces)) __obj.updateDynamic("CompletedPieces")(CompletedPieces)
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate)
    if (!js.isUndefined(FailedPieces)) __obj.updateDynamic("FailedPieces")(FailedPieces)
    if (Failures != null) __obj.updateDynamic("Failures")(Failures)
    if (!js.isUndefined(TotalFailures)) __obj.updateDynamic("TotalFailures")(TotalFailures)
    if (!js.isUndefined(TotalPieces)) __obj.updateDynamic("TotalPieces")(TotalPieces)
    if (!js.isUndefined(TotalProcessed)) __obj.updateDynamic("TotalProcessed")(TotalProcessed)
    __obj.asInstanceOf[ImportJobResponse]
  }
}

