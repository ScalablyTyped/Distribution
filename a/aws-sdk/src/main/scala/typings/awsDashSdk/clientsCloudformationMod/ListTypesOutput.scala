package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypesOutput extends js.Object {
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.native
  /**
    * A list of TypeSummary structures that contain information about the specified types.
    */
  var TypeSummaries: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TypeSummaries] = js.native
}

object ListTypesOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, TypeSummaries: TypeSummaries = null): ListTypesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TypeSummaries != null) __obj.updateDynamic("TypeSummaries")(TypeSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypesOutput]
  }
}

