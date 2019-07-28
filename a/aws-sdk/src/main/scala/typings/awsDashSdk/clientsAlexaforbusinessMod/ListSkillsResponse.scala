package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSkillsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The list of enabled skills requested. Required.
    */
  var SkillSummaries: js.UndefOr[SkillSummaryList] = js.undefined
}

object ListSkillsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SkillSummaries: SkillSummaryList = null): ListSkillsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SkillSummaries != null) __obj.updateDynamic("SkillSummaries")(SkillSummaries)
    __obj.asInstanceOf[ListSkillsResponse]
  }
}

