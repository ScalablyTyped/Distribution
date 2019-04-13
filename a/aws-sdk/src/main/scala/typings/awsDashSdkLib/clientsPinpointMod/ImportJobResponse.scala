package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportJobResponse extends js.Object {
  /**
    * The unique ID of the application to which the import job applies.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The number of pieces that have successfully imported as of the time of the request.
    */
  var CompletedPieces: js.UndefOr[__integer] = js.undefined
  /**
    * The date the import job completed in ISO 8601 format.
    */
  var CompletionDate: js.UndefOr[__string] = js.undefined
  /**
    * The date the import job was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The import job settings.
    */
  var Definition: js.UndefOr[ImportJobResource] = js.undefined
  /**
    * The number of pieces that have failed to import as of the time of the request.
    */
  var FailedPieces: js.UndefOr[__integer] = js.undefined
  /**
    * Provides up to 100 of the first failed entries for the job, if any exist.
    */
  var Failures: js.UndefOr[ListOf__string] = js.undefined
  /**
    * The unique ID of the import job.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The status of the import job.
  Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
  The job status is FAILED if one or more pieces failed to import.
    */
  var JobStatus: js.UndefOr[JobStatus] = js.undefined
  /**
    * The number of endpoints that failed to import; for example, because of syntax errors.
    */
  var TotalFailures: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of pieces that must be imported to finish the job. Each piece is an approximately equal portion of the endpoints to import.
    */
  var TotalPieces: js.UndefOr[__integer] = js.undefined
  /**
    * The number of endpoints that were processed by the import job.
    */
  var TotalProcessed: js.UndefOr[__integer] = js.undefined
  /**
    * The job type. Will be Import.
    */
  var Type: js.UndefOr[__string] = js.undefined
}

object ImportJobResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    CompletedPieces: js.UndefOr[__integer] = js.undefined,
    CompletionDate: __string = null,
    CreationDate: __string = null,
    Definition: ImportJobResource = null,
    FailedPieces: js.UndefOr[__integer] = js.undefined,
    Failures: ListOf__string = null,
    Id: __string = null,
    JobStatus: JobStatus = null,
    TotalFailures: js.UndefOr[__integer] = js.undefined,
    TotalPieces: js.UndefOr[__integer] = js.undefined,
    TotalProcessed: js.UndefOr[__integer] = js.undefined,
    Type: __string = null
  ): ImportJobResponse = {
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
    __obj.asInstanceOf[ImportJobResponse]
  }
}

