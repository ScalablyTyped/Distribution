package typings.awsDashSdk.clientsAccessanalyzerMod

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
  def apply(archiveRules: ArchiveRulesList, nextToken: Token = null): ListArchiveRulesResponse = {
    val __obj = js.Dynamic.literal(archiveRules = archiveRules.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListArchiveRulesResponse]
  }
}

