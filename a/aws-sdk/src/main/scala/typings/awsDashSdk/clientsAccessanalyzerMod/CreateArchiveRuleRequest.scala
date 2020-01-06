package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateArchiveRuleRequest extends js.Object {
  /**
    * The name of the created analyzer.
    */
  var analyzerName: Name = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * The criteria for the rule.
    */
  var filter: FilterCriteriaMap = js.native
  /**
    * The name of the rule to create.
    */
  var ruleName: Name = js.native
}

object CreateArchiveRuleRequest {
  @scala.inline
  def apply(analyzerName: Name, filter: FilterCriteriaMap, ruleName: Name, clientToken: String = null): CreateArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateArchiveRuleRequest]
  }
}

