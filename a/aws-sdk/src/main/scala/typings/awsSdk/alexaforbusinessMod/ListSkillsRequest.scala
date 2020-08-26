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
  def apply(): ListSkillsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsRequest]
  }
  @scala.inline
  implicit class ListSkillsRequestOps[Self <: ListSkillsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnablementType(value: EnablementTypeFilter): Self = this.set("EnablementType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablementType: Self = this.set("EnablementType", js.undefined)
    @scala.inline
    def setMaxResults(value: SkillListMaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSkillGroupArn(value: Arn): Self = this.set("SkillGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillGroupArn: Self = this.set("SkillGroupArn", js.undefined)
    @scala.inline
    def setSkillType(value: SkillTypeFilter): Self = this.set("SkillType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillType: Self = this.set("SkillType", js.undefined)
  }
  
}

