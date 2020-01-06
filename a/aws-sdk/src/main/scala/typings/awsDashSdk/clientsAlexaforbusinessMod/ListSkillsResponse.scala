package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.native
  /**
    * The list of enabled skills requested. Required.
    */
  var SkillSummaries: js.UndefOr[SkillSummaryList] = js.native
}

object ListSkillsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SkillSummaries: SkillSummaryList = null): ListSkillsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SkillSummaries != null) __obj.updateDynamic("SkillSummaries")(SkillSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsResponse]
  }
}

