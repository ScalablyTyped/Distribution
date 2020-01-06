package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSkillsStoreSkillsByCategoryResponse extends js.Object {
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.native
  /**
    * The skill store skills.
    */
  var SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList] = js.native
}

object ListSkillsStoreSkillsByCategoryResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, SkillsStoreSkills: SkillsStoreSkillList = null): ListSkillsStoreSkillsByCategoryResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SkillsStoreSkills != null) __obj.updateDynamic("SkillsStoreSkills")(SkillsStoreSkills.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSkillsStoreSkillsByCategoryResponse]
  }
}

