package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleDetail extends js.Object {
  /**
    * The timestamp of when the rule was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The rule description.
    */
  var description: js.UndefOr[typings.awsDashSdk.clientsFrauddetectorMod.description] = js.native
  /**
    * The detector for which the rule is associated.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  /**
    * The rule expression.
    */
  var expression: js.UndefOr[ruleExpression] = js.native
  /**
    * The rule language.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * Timestamp of the last time the rule was updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The rule outcomes.
    */
  var outcomes: js.UndefOr[NonEmptyListOfStrings] = js.native
  /**
    * The rule ID.
    */
  var ruleId: js.UndefOr[identifier] = js.native
  /**
    * The rule version.
    */
  var ruleVersion: js.UndefOr[nonEmptyString] = js.native
}

object RuleDetail {
  @scala.inline
  def apply(
    createdTime: time = null,
    description: description = null,
    detectorId: identifier = null,
    expression: ruleExpression = null,
    language: Language = null,
    lastUpdatedTime: time = null,
    outcomes: NonEmptyListOfStrings = null,
    ruleId: identifier = null,
    ruleVersion: nonEmptyString = null
  ): RuleDetail = {
    val __obj = js.Dynamic.literal()
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detectorId != null) __obj.updateDynamic("detectorId")(detectorId.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (outcomes != null) __obj.updateDynamic("outcomes")(outcomes.asInstanceOf[js.Any])
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId.asInstanceOf[js.Any])
    if (ruleVersion != null) __obj.updateDynamic("ruleVersion")(ruleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleDetail]
  }
}

