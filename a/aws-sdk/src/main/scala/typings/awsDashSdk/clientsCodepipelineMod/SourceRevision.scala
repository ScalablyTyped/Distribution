package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRevision extends js.Object {
  /**
    * The name of the action that processed the revision to the source artifact.
    */
  var actionName: ActionName
  /**
    * The system-generated unique ID that identifies the revision number of the artifact.
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

object SourceRevision {
  @scala.inline
  def apply(
    actionName: ActionName,
    revisionId: Revision = null,
    revisionSummary: RevisionSummary = null,
    revisionUrl: Url = null
  ): SourceRevision = {
    val __obj = js.Dynamic.literal(actionName = actionName)
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId)
    if (revisionSummary != null) __obj.updateDynamic("revisionSummary")(revisionSummary)
    if (revisionUrl != null) __obj.updateDynamic("revisionUrl")(revisionUrl)
    __obj.asInstanceOf[SourceRevision]
  }
}

