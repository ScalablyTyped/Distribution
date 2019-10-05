package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigRuleEvaluationStatus extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Config rule.
    */
  var ConfigRuleArn: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS Config rule.
    */
  var ConfigRuleId: js.UndefOr[String] = js.undefined
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
  /**
    * The time that you first activated the AWS Config rule.
    */
  var FirstActivatedTime: js.UndefOr[_Date] = js.undefined
  /**
    * Indicates whether AWS Config has evaluated your resources against the rule at least once.    true - AWS Config has evaluated your AWS resources against the rule at least once.    false - AWS Config has not once finished evaluating your AWS resources against the rule.  
    */
  var FirstEvaluationStarted: js.UndefOr[Boolean] = js.undefined
  /**
    * The error code that AWS Config returned when the rule last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.undefined
  /**
    * The error message that AWS Config returned when the rule last failed.
    */
  var LastErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The time that AWS Config last failed to evaluate your AWS resources against the rule.
    */
  var LastFailedEvaluationTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
    */
  var LastFailedInvocationTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time that AWS Config last successfully evaluated your AWS resources against the rule.
    */
  var LastSuccessfulEvaluationTime: js.UndefOr[_Date] = js.undefined
  /**
    * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
    */
  var LastSuccessfulInvocationTime: js.UndefOr[_Date] = js.undefined
}

object ConfigRuleEvaluationStatus {
  @scala.inline
  def apply(
    ConfigRuleArn: String = null,
    ConfigRuleId: String = null,
    ConfigRuleName: StringWithCharLimit64 = null,
    FirstActivatedTime: _Date = null,
    FirstEvaluationStarted: js.UndefOr[scala.Boolean] = js.undefined,
    LastErrorCode: String = null,
    LastErrorMessage: String = null,
    LastFailedEvaluationTime: _Date = null,
    LastFailedInvocationTime: _Date = null,
    LastSuccessfulEvaluationTime: _Date = null,
    LastSuccessfulInvocationTime: _Date = null
  ): ConfigRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    if (ConfigRuleArn != null) __obj.updateDynamic("ConfigRuleArn")(ConfigRuleArn)
    if (ConfigRuleId != null) __obj.updateDynamic("ConfigRuleId")(ConfigRuleId)
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName)
    if (FirstActivatedTime != null) __obj.updateDynamic("FirstActivatedTime")(FirstActivatedTime)
    if (!js.isUndefined(FirstEvaluationStarted)) __obj.updateDynamic("FirstEvaluationStarted")(FirstEvaluationStarted)
    if (LastErrorCode != null) __obj.updateDynamic("LastErrorCode")(LastErrorCode)
    if (LastErrorMessage != null) __obj.updateDynamic("LastErrorMessage")(LastErrorMessage)
    if (LastFailedEvaluationTime != null) __obj.updateDynamic("LastFailedEvaluationTime")(LastFailedEvaluationTime)
    if (LastFailedInvocationTime != null) __obj.updateDynamic("LastFailedInvocationTime")(LastFailedInvocationTime)
    if (LastSuccessfulEvaluationTime != null) __obj.updateDynamic("LastSuccessfulEvaluationTime")(LastSuccessfulEvaluationTime)
    if (LastSuccessfulInvocationTime != null) __obj.updateDynamic("LastSuccessfulInvocationTime")(LastSuccessfulInvocationTime)
    __obj.asInstanceOf[ConfigRuleEvaluationStatus]
  }
}

