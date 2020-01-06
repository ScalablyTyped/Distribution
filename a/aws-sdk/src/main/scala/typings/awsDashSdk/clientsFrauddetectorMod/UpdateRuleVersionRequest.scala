package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRuleVersionRequest extends js.Object {
  /**
    * The description.
    */
  var description: js.UndefOr[typings.awsDashSdk.clientsFrauddetectorMod.description] = js.native
  /**
    * The rule expression.
    */
  var expression: ruleExpression = js.native
  /**
    * The language.
    */
  var language: Language = js.native
  /**
    * The outcomes.
    */
  var outcomes: NonEmptyListOfStrings = js.native
  /**
    * The rule to update.
    */
  var rule: Rule = js.native
}

object UpdateRuleVersionRequest {
  @scala.inline
  def apply(
    expression: ruleExpression,
    language: Language,
    outcomes: NonEmptyListOfStrings,
    rule: Rule,
    description: description = null
  ): UpdateRuleVersionRequest = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], outcomes = outcomes.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleVersionRequest]
  }
}

