package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterApplicationRevisionInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName = js.native
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Information about the application revision to register, including type and location.
    */
  var revision: RevisionLocation = js.native
}

object RegisterApplicationRevisionInput {
  @scala.inline
  def apply(applicationName: ApplicationName, revision: RevisionLocation, description: Description = null): RegisterApplicationRevisionInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterApplicationRevisionInput]
  }
}

