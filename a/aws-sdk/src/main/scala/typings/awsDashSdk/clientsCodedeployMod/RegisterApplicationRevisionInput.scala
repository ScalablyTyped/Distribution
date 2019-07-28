package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterApplicationRevisionInput extends js.Object {
  /**
    * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
    */
  var applicationName: ApplicationName
  /**
    * A comment about the revision.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * Information about the application revision to register, including type and location.
    */
  var revision: RevisionLocation
}

object RegisterApplicationRevisionInput {
  @scala.inline
  def apply(applicationName: ApplicationName, revision: RevisionLocation, description: Description = null): RegisterApplicationRevisionInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName, revision = revision)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[RegisterApplicationRevisionInput]
  }
}

