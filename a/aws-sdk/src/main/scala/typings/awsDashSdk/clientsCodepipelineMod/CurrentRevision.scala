package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentRevision extends js.Object {
  /**
    * The change identifier for the current revision.
    */
  var changeIdentifier: RevisionChangeIdentifier
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[Time] = js.undefined
  /**
    * The revision ID of the current version of an artifact.
    */
  var revision: Revision
  /**
    * The summary of the most recent revision of the artifact.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.undefined
}

object CurrentRevision {
  @scala.inline
  def apply(
    changeIdentifier: RevisionChangeIdentifier,
    revision: Revision,
    created: Time = null,
    revisionSummary: RevisionSummary = null
  ): CurrentRevision = {
    val __obj = js.Dynamic.literal(changeIdentifier = changeIdentifier, revision = revision)
    if (created != null) __obj.updateDynamic("created")(created)
    if (revisionSummary != null) __obj.updateDynamic("revisionSummary")(revisionSummary)
    __obj.asInstanceOf[CurrentRevision]
  }
}

