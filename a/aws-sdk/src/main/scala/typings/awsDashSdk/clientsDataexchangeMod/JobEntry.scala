package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobEntry extends js.Object {
  /**
    * The ARN for the job.
    */
  var Arn: typings.awsDashSdk.clientsDataexchangeMod.Arn = js.native
  /**
    * The date and time that the job was created, in ISO 8601 format.
    */
  var CreatedAt: Timestamp = js.native
  /**
    * Details of the operation to be performed by the job, such as export destination details or import source details.
    */
  var Details: ResponseDetails = js.native
  /**
    * Errors for jobs.
    */
  var Errors: js.UndefOr[ListOfJobError] = js.native
  /**
    * The unique identifier for the job.
    */
  var Id: typings.awsDashSdk.clientsDataexchangeMod.Id = js.native
  /**
    * The state of the job.
    */
  var State: typings.awsDashSdk.clientsDataexchangeMod.State = js.native
  /**
    * The job type.
    */
  var Type: typings.awsDashSdk.clientsDataexchangeMod.Type = js.native
  /**
    * The date and time that the job was last updated, in ISO 8601 format.
    */
  var UpdatedAt: Timestamp = js.native
}

object JobEntry {
  @scala.inline
  def apply(
    Arn: Arn,
    CreatedAt: Timestamp,
    Details: ResponseDetails,
    Id: Id,
    State: State,
    Type: Type,
    UpdatedAt: Timestamp,
    Errors: ListOfJobError = null
  ): JobEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEntry]
  }
}

