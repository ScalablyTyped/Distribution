package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssociationVersionsResult extends js.Object {
  /**
    * Information about all versions of the association for the specified association ID.
    */
  var AssociationVersions: js.UndefOr[AssociationVersionList] = js.undefined
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object ListAssociationVersionsResult {
  @scala.inline
  def apply(AssociationVersions: AssociationVersionList = null, NextToken: NextToken = null): ListAssociationVersionsResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationVersions != null) __obj.updateDynamic("AssociationVersions")(AssociationVersions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssociationVersionsResult]
  }
}

