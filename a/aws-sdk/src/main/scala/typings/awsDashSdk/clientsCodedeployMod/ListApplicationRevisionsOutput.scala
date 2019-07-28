package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationRevisionsOutput extends js.Object {
  /**
    * If a large amount of information is returned, an identifier is also returned. It can be used in a subsequent list application revisions call to return the next set of application revisions in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of locations that contain the matching revisions.
    */
  var revisions: js.UndefOr[RevisionLocationList] = js.undefined
}

object ListApplicationRevisionsOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, revisions: RevisionLocationList = null): ListApplicationRevisionsOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (revisions != null) __obj.updateDynamic("revisions")(revisions)
    __obj.asInstanceOf[ListApplicationRevisionsOutput]
  }
}

