package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRuleRequest extends js.Object {
  /**
    * The rule description.
    */
  var description: js.UndefOr[typings.awsDashSdk.clientsFrauddetectorMod.description] = js.native
  /**
    * The detector ID for the rule's parent detector.
    */
  var detectorId: identifier = js.native
  /**
    * The rule expression.
    */
  var expression: ruleExpression = js.native
  /**
    * The language of the rule.
    */
  var language: Language = js.native
  /**
    * The outcome or outcomes returned when the rule expression matches.
    */
  var outcomes: NonEmptyListOfStrings = js.native
  /**
    * The rule ID.
    */
  var ruleId: identifier = js.native
}

object CreateRuleRequest {
  @scala.inline
  def apply(
    detectorId: identifier,
    expression: ruleExpression,
    language: Language,
    outcomes: NonEmptyListOfStrings,
    ruleId: identifier,
    description: description = null
  ): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(detectorId = detectorId.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], outcomes = outcomes.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleRequest]
  }
}

