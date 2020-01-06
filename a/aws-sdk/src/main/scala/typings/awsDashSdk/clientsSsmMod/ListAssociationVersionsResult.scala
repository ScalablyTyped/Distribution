package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociationVersionsResult extends js.Object {
  /**
    * Information about all versions of the association for the specified association ID.
    */
  var AssociationVersions: js.UndefOr[AssociationVersionList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object ListAssociationVersionsResult {
  @scala.inline
  def apply(AssociationVersions: AssociationVersionList = null, NextToken: NextToken = null): ListAssociationVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationVersions != null) __obj.updateDynamic("AssociationVersions")(AssociationVersions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAssociationVersionsResult]
  }
}

