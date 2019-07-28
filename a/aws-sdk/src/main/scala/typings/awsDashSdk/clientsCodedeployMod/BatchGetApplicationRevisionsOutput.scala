package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetApplicationRevisionsOutput extends js.Object {
  /**
    * The name of the application that corresponds to the revisions.
    */
  var applicationName: js.UndefOr[ApplicationName] = js.undefined
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * Additional information about the revisions, including the type and location.
    */
  var revisions: js.UndefOr[RevisionInfoList] = js.undefined
}

object BatchGetApplicationRevisionsOutput {
  @scala.inline
  def apply(
    applicationName: ApplicationName = null,
    errorMessage: ErrorMessage = null,
    revisions: RevisionInfoList = null
  ): BatchGetApplicationRevisionsOutput = {
    val __obj = js.Dynamic.literal()
    if (applicationName != null) __obj.updateDynamic("applicationName")(applicationName)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (revisions != null) __obj.updateDynamic("revisions")(revisions)
    __obj.asInstanceOf[BatchGetApplicationRevisionsOutput]
  }
}

