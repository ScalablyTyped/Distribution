package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobResponse extends js.Object {
  /**
    * The ARN for the job.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Arn] = js.native
  /**
    * The date and time that the job was created, in ISO 8601 format.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * Details about the job.
    */
  var Details: js.UndefOr[ResponseDetails] = js.native
  /**
    * The errors associated with jobs.
    */
  var Errors: js.UndefOr[ListOfJobError] = js.native
  /**
    * The unique identifier for the job.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Id] = js.native
  /**
    * The state of the job.
    */
  var State: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.State] = js.native
  /**
    * The job type.
    */
  var Type: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Type] = js.native
  /**
    * The date and time that the job was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.UndefOr[Timestamp] = js.native
}

object CreateJobResponse {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreatedAt: Timestamp = null,
    Details: ResponseDetails = null,
    Errors: ListOfJobError = null,
    Id: Id = null,
    State: State = null,
    Type: Type = null,
    UpdatedAt: Timestamp = null
  ): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobResponse]
  }
}

