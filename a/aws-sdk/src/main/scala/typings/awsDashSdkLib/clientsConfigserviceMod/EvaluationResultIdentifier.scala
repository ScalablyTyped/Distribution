package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluationResultIdentifier extends js.Object {
  /**
    * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated resource.
    */
  var EvaluationResultQualifier: js.UndefOr[EvaluationResultQualifier] = js.undefined
  /**
    * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config delivered a configuration item change notification, or it can indicate when AWS Config delivered the configuration snapshot, depending on which event triggered the evaluation.
    */
  var OrderingTimestamp: js.UndefOr[_Date] = js.undefined
}

object EvaluationResultIdentifier {
  @scala.inline
  def apply(EvaluationResultQualifier: EvaluationResultQualifier = null, OrderingTimestamp: _Date = null): EvaluationResultIdentifier = {
    val __obj = js.Dynamic.literal()
    if (EvaluationResultQualifier != null) __obj.updateDynamic("EvaluationResultQualifier")(EvaluationResultQualifier)
    if (OrderingTimestamp != null) __obj.updateDynamic("OrderingTimestamp")(OrderingTimestamp)
    __obj.asInstanceOf[EvaluationResultIdentifier]
  }
}

