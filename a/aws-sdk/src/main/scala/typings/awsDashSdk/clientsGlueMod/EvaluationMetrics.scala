package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationMetrics extends js.Object {
  /**
    * The evaluation metrics for the find matches algorithm.
    */
  var FindMatchesMetrics: js.UndefOr[typings.awsDashSdk.clientsGlueMod.FindMatchesMetrics] = js.native
  /**
    * The type of machine learning transform.
    */
  var TransformType: typings.awsDashSdk.clientsGlueMod.TransformType = js.native
}

object EvaluationMetrics {
  @scala.inline
  def apply(TransformType: TransformType, FindMatchesMetrics: FindMatchesMetrics = null): EvaluationMetrics = {
    val __obj = js.Dynamic.literal(TransformType = TransformType.asInstanceOf[js.Any])
    if (FindMatchesMetrics != null) __obj.updateDynamic("FindMatchesMetrics")(FindMatchesMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationMetrics]
  }
}

