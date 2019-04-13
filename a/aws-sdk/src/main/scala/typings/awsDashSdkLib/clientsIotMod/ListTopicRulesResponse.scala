package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTopicRulesResponse extends js.Object {
  /**
    * A token used to retrieve the next value.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The rules.
    */
  var rules: js.UndefOr[TopicRuleList] = js.undefined
}

object ListTopicRulesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, rules: TopicRuleList = null): ListTopicRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (rules != null) __obj.updateDynamic("rules")(rules)
    __obj.asInstanceOf[ListTopicRulesResponse]
  }
}

