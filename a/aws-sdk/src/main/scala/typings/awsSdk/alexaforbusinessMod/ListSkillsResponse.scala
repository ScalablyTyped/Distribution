package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The list of enabled skills requested. Required.
    */
  var SkillSummaries: js.UndefOr[SkillSummaryList] = js.native
}

object ListSkillsResponse {
  @scala.inline
  def apply(): ListSkillsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsResponse]
  }
  @scala.inline
  implicit class ListSkillsResponseOps[Self <: ListSkillsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSkillSummariesVarargs(value: SkillSummary*): Self = this.set("SkillSummaries", js.Array(value :_*))
    @scala.inline
    def setSkillSummaries(value: SkillSummaryList): Self = this.set("SkillSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillSummaries: Self = this.set("SkillSummaries", js.undefined)
  }
  
}

