package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListArchiveRulesResponse extends js.Object {
  /**
    * A list of archive rules created for the specified analyzer.
    */
  var archiveRules: ArchiveRulesList = js.native
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}

object ListArchiveRulesResponse {
  @scala.inline
  def apply(archiveRules: ArchiveRulesList): ListArchiveRulesResponse = {
    val __obj = js.Dynamic.literal(archiveRules = archiveRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArchiveRulesResponse]
  }
  @scala.inline
  implicit class ListArchiveRulesResponseOps[Self <: ListArchiveRulesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArchiveRulesVarargs(value: ArchiveRuleSummary*): Self = this.set("archiveRules", js.Array(value :_*))
    @scala.inline
    def setArchiveRules(value: ArchiveRulesList): Self = this.set("archiveRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: Token): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

