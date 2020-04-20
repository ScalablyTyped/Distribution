package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetArchiveRuleResponse extends js.Object {
  var archiveRule: ArchiveRuleSummary = js.native
}

object GetArchiveRuleResponse {
  @scala.inline
  def apply(archiveRule: ArchiveRuleSummary): GetArchiveRuleResponse = {
    val __obj = js.Dynamic.literal(archiveRule = archiveRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetArchiveRuleResponse]
  }
}

