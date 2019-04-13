package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceLastAccessedDetailsWithEntitiesResponse extends js.Object {
  /**
    * An EntityDetailsList object that contains details about when an IAM entity (user or role) used group or policy permissions in an attempt to access the specified AWS service.
    */
  var EntityDetailsList: entityDetailsListType
  /**
    * An object that contains details about the reason the operation failed.
    */
  var Error: js.UndefOr[ErrorDetails] = js.undefined
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.undefined
  /**
    * The date and time, in ISO 8601 date-time format, when the generated report job was completed or failed.
    */
  var JobCompletionDate: dateType
  /**
    * The date and time, in ISO 8601 date-time format, when the report job was created.
    */
  var JobCreationDate: dateType
  /**
    * The status of the job.
    */
  var JobStatus: jobStatusType
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
}

object GetServiceLastAccessedDetailsWithEntitiesResponse {
  @scala.inline
  def apply(
    EntityDetailsList: entityDetailsListType,
    JobCompletionDate: dateType,
    JobCreationDate: dateType,
    JobStatus: jobStatusType,
    Error: ErrorDetails = null,
    IsTruncated: js.UndefOr[booleanType] = js.undefined,
    Marker: markerType = null
  ): GetServiceLastAccessedDetailsWithEntitiesResponse = {
    val __obj = js.Dynamic.literal(EntityDetailsList = EntityDetailsList, JobCompletionDate = JobCompletionDate, JobCreationDate = JobCreationDate, JobStatus = JobStatus.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[GetServiceLastAccessedDetailsWithEntitiesResponse]
  }
}

