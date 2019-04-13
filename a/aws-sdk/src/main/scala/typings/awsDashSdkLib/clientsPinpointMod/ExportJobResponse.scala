package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJobResponse extends js.Object {
  /**
    * The unique ID of the application associated with the export job.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The number of pieces that have successfully completed as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[__integer] = js.undefined
  /**
    * The date the job completed in ISO 8601 format.
    */
  var CompletionDate: js.UndefOr[__string] = js.undefined
  /**
    * The date the job was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The export job settings.
    */
  var Definition: js.UndefOr[ExportJobResource] = js.undefined
  /**
    * The number of pieces that failed to be processed as of the time of the request.
    */
  var FailedPieces: js.UndefOr[__integer] = js.undefined
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  var Failures: js.UndefOr[ListOf__string] = js.undefined
  /**
    * The unique ID of the job.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The status of the job.
  Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
  The job status is FAILED if one or more pieces failed.
    */
  var JobStatus: js.UndefOr[JobStatus] = js.undefined
  /**
    * The number of endpoints that were not processed; for example, because of syntax errors.
    */
  var TotalFailures: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion of the endpoints.
    */
  var TotalPieces: js.UndefOr[__integer] = js.undefined
  /**
    * The number of endpoints that were processed by the job.
    */
  var TotalProcessed: js.UndefOr[__integer] = js.undefined
  /**
    * The job type. Will be 'EXPORT'.
    */
  var Type: js.UndefOr[__string] = js.undefined
}

object ExportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    CompletedPieces: js.UndefOr[__integer] = js.undefined,
    CompletionDate: __string = null,
    CreationDate: __string = null,
    Definition: ExportJobResource = null,
    FailedPieces: js.UndefOr[__integer] = js.undefined,
    Failures: ListOf__string = null,
    Id: __string = null,
    JobStatus: JobStatus = null,
    TotalFailures: js.UndefOr[__integer] = js.undefined,
    TotalPieces: js.UndefOr[__integer] = js.undefined,
    TotalProcessed: js.UndefOr[__integer] = js.undefined,
    Type: __string = null
  ): ExportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (!js.isUndefined(CompletedPieces)) __obj.updateDynamic("CompletedPieces")(CompletedPieces)
    if (CompletionDate != null) __obj.updateDynamic("CompletionDate")(CompletionDate)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Definition != null) __obj.updateDynamic("Definition")(Definition)
    if (!js.isUndefined(FailedPieces)) __obj.updateDynamic("FailedPieces")(FailedPieces)
    if (Failures != null) __obj.updateDynamic("Failures")(Failures)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (JobStatus != null) __obj.updateDynamic("JobStatus")(JobStatus.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalFailures)) __obj.updateDynamic("TotalFailures")(TotalFailures)
    if (!js.isUndefined(TotalPieces)) __obj.updateDynamic("TotalPieces")(TotalPieces)
    if (!js.isUndefined(TotalProcessed)) __obj.updateDynamic("TotalProcessed")(TotalProcessed)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ExportJobResponse]
  }
}

