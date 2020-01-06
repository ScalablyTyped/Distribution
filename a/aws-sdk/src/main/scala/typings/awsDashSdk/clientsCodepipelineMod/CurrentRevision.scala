package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentRevision extends js.Object {
  /**
    * The change identifier for the current revision.
    */
  var changeIdentifier: RevisionChangeIdentifier = js.native
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[Time] = js.native
  /**
    * The revision ID of the current version of an artifact.
    */
  var revision: Revision = js.native
  /**
    * The summary of the most recent revision of the artifact.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.native
}

object CurrentRevision {
  @scala.inline
  def apply(
    changeIdentifier: RevisionChangeIdentifier,
    revision: Revision,
    created: Time = null,
    revisionSummary: RevisionSummary = null
  ): CurrentRevision = {
    val __obj = js.Dynamic.literal(changeIdentifier = changeIdentifier.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (revisionSummary != null) __obj.updateDynamic("revisionSummary")(revisionSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentRevision]
  }
}

