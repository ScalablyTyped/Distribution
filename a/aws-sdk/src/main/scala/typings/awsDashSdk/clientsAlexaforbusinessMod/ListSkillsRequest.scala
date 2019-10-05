package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSkillsRequest extends js.Object {
  /**
    * Whether the skill is enabled under the user's account, or if it requires linking to be used.
    */
  var EnablementType: js.UndefOr[EnablementTypeFilter] = js.undefined
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. Required.
    */
  var MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. Required.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The ARN of the skill group for which to list enabled skills. Required.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[SkillTypeFilter] = js.undefined
}

object ListSkillsRequest {
  @scala.inline
  def apply(
    EnablementType: EnablementTypeFilter = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SkillGroupArn: Arn = null,
    SkillType: SkillTypeFilter = null
  ): ListSkillsRequest = {
    val __obj = js.Dynamic.literal()
    if (EnablementType != null) __obj.updateDynamic("EnablementType")(EnablementType.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn)
    if (SkillType != null) __obj.updateDynamic("SkillType")(SkillType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsRequest]
  }
}

