package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluationResult extends js.Object {
  /**
    * Supplementary information about how the evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
  /**
    * Indicates whether the AWS resource complies with the AWS Config rule that evaluated it. For the EvaluationResult data type, AWS Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. AWS Config does not support the INSUFFICIENT_DATA value for the EvaluationResult data type.
    */
  var ComplianceType: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ComplianceType] = js.undefined
  /**
    * The time when the AWS Config rule evaluated the AWS resource.
    */
  var ConfigRuleInvokedTime: js.UndefOr[_Date] = js.undefined
  /**
    * Uniquely identifies the evaluation result.
    */
  var EvaluationResultIdentifier: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.EvaluationResultIdentifier] = js.undefined
  /**
    * The time when AWS Config recorded the evaluation result.
    */
  var ResultRecordedTime: js.UndefOr[_Date] = js.undefined
  /**
    * An encrypted token that associates an evaluation with an AWS Config rule. The token identifies the rule, the AWS resource being evaluated, and the event that triggered the evaluation.
    */
  var ResultToken: js.UndefOr[String] = js.undefined
}

object EvaluationResult {
  @scala.inline
  def apply(
    Annotation: StringWithCharLimit256 = null,
    ComplianceType: ComplianceType = null,
    ConfigRuleInvokedTime: _Date = null,
    EvaluationResultIdentifier: EvaluationResultIdentifier = null,
    ResultRecordedTime: _Date = null,
    ResultToken: String = null
  ): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    if (Annotation != null) __obj.updateDynamic("Annotation")(Annotation)
    if (ComplianceType != null) __obj.updateDynamic("ComplianceType")(ComplianceType.asInstanceOf[js.Any])
    if (ConfigRuleInvokedTime != null) __obj.updateDynamic("ConfigRuleInvokedTime")(ConfigRuleInvokedTime)
    if (EvaluationResultIdentifier != null) __obj.updateDynamic("EvaluationResultIdentifier")(EvaluationResultIdentifier)
    if (ResultRecordedTime != null) __obj.updateDynamic("ResultRecordedTime")(ResultRecordedTime)
    if (ResultToken != null) __obj.updateDynamic("ResultToken")(ResultToken)
    __obj.asInstanceOf[EvaluationResult]
  }
}

