package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArtifactRevision extends js.Object {
  /**
    * The date and time when the most recent revision of the artifact was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of an artifact. This name might be system-generated, such as "MyApp", or might be defined by the user when an action is created.
    */
  var name: js.UndefOr[ArtifactName] = js.undefined
  /**
    * An additional identifier for a revision, such as a commit date or, for artifacts stored in Amazon S3 buckets, the ETag value.
    */
  var revisionChangeIdentifier: js.UndefOr[RevisionChangeIdentifier] = js.undefined
  /**
    * The revision ID of the artifact.
    */
  var revisionId: js.UndefOr[Revision] = js.undefined
  /**
    * Summary information about the most recent revision of the artifact. For GitHub and AWS CodeCommit repositories, the commit message. For Amazon S3 buckets or actions, the user-provided content of a codepipeline-artifact-revision-summary key specified in the object metadata.
    */
  var revisionSummary: js.UndefOr[RevisionSummary] = js.undefined
  /**
    * The commit ID for the artifact revision. For artifacts stored in GitHub or AWS CodeCommit repositories, the commit ID is linked to a commit details page.
    */
  var revisionUrl: js.UndefOr[Url] = js.undefined
}

object ArtifactRevision {
  @scala.inline
  def apply(
    created: Timestamp = null,
    name: ArtifactName = null,
    revisionChangeIdentifier: RevisionChangeIdentifier = null,
    revisionId: Revision = null,
    revisionSummary: RevisionSummary = null,
    revisionUrl: Url = null
  ): ArtifactRevision = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (name != null) __obj.updateDynamic("name")(name)
    if (revisionChangeIdentifier != null) __obj.updateDynamic("revisionChangeIdentifier")(revisionChangeIdentifier)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (revisionSummary != null) __obj.updateDynamic("revisionSummary")(revisionSummary)
    if (revisionUrl != null) __obj.updateDynamic("revisionUrl")(revisionUrl)
    __obj.asInstanceOf[ArtifactRevision]
  }
}

