package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Evaluation extends js.Object {
  /**
    * Supplementary information about how the evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ComplianceResourceId: BaseResourceId
  /**
    * The type of AWS resource that was evaluated.
    */
  var ComplianceResourceType: StringWithCharLimit256
  /**
    * Indicates whether the AWS resource complies with the AWS Config rule that it was evaluated against. For the Evaluation data type, AWS Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. AWS Config does not support the INSUFFICIENT_DATA value for this data type. Similarly, AWS Config does not accept INSUFFICIENT_DATA as the value for ComplianceType from a PutEvaluations request. For example, an AWS Lambda function for a custom AWS Config rule cannot pass an INSUFFICIENT_DATA value to AWS Config.
    */
  var ComplianceType: typings.awsDashSdk.clientsConfigserviceMod.ComplianceType
  /**
    * The time of the event in AWS Config that triggered the evaluation. For event-based evaluations, the time indicates when AWS Config created the configuration item that triggered the evaluation. For periodic evaluations, the time indicates when AWS Config triggered the evaluation at the frequency that you specified (for example, every 24 hours).
    */
  var OrderingTimestamp: typings.awsDashSdk.clientsConfigserviceMod.OrderingTimestamp
}

object Evaluation {
  @scala.inline
  def apply(
    ComplianceResourceId: BaseResourceId,
    ComplianceResourceType: StringWithCharLimit256,
    ComplianceType: ComplianceType,
    OrderingTimestamp: OrderingTimestamp,
    Annotation: StringWithCharLimit256 = null
  ): Evaluation = {
    val __obj = js.Dynamic.literal(ComplianceResourceId = ComplianceResourceId, ComplianceResourceType = ComplianceResourceType, ComplianceType = ComplianceType.asInstanceOf[js.Any], OrderingTimestamp = OrderingTimestamp)
    if (Annotation != null) __obj.updateDynamic("Annotation")(Annotation)
    __obj.asInstanceOf[Evaluation]
  }
}

