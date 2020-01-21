package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsRequest extends js.Object {
  /**
    * Whether the skill is enabled under the user's account.
    */
  var EnablementType: js.UndefOr[EnablementTypeFilter] = js.native
  /**
    * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
    */
  var MaxResults: js.UndefOr[SkillListMaxResults] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The ARN of the skill group for which to list enabled skills.
    */
  var SkillGroupArn: js.UndefOr[Arn] = js.native
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[SkillTypeFilter] = js.native
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
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SkillGroupArn != null) __obj.updateDynamic("SkillGroupArn")(SkillGroupArn.asInstanceOf[js.Any])
    if (SkillType != null) __obj.updateDynamic("SkillType")(SkillType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsRequest]
  }
}

