package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTypeVersionsOutput extends js.Object {
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.native
  /**
    * A list of TypeVersionSummary structures that contain information about the specified type's versions.
    */
  var TypeVersionSummaries: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.TypeVersionSummaries] = js.native
}

object ListTypeVersionsOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, TypeVersionSummaries: TypeVersionSummaries = null): ListTypeVersionsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TypeVersionSummaries != null) __obj.updateDynamic("TypeVersionSummaries")(TypeVersionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTypeVersionsOutput]
  }
}

