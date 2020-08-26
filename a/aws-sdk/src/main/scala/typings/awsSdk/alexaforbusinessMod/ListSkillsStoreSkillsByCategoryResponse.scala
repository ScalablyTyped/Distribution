package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsStoreSkillsByCategoryResponse extends js.Object {
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The skill store skills.
    */
  var SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList] = js.native
}

object ListSkillsStoreSkillsByCategoryResponse {
  @scala.inline
  def apply(): ListSkillsStoreSkillsByCategoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryResponse]
  }
  @scala.inline
  implicit class ListSkillsStoreSkillsByCategoryResponseOps[Self <: ListSkillsStoreSkillsByCategoryResponse] (val x: Self) extends AnyVal {
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
    def setSkillsStoreSkillsVarargs(value: SkillsStoreSkill*): Self = this.set("SkillsStoreSkills", js.Array(value :_*))
    @scala.inline
    def setSkillsStoreSkills(value: SkillsStoreSkillList): Self = this.set("SkillsStoreSkills", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkillsStoreSkills: Self = this.set("SkillsStoreSkills", js.undefined)
  }
  
}

