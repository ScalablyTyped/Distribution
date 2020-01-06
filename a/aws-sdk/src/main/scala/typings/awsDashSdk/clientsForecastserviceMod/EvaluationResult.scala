package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm that was evaluated.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * The array of test windows used for evaluating the algorithm. The NumberOfBacktestWindows from the EvaluationParameters object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.TestWindows] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(AlgorithmArn: Arn = null, TestWindows: TestWindows = null): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    if (AlgorithmArn != null) __obj.updateDynamic("AlgorithmArn")(AlgorithmArn.asInstanceOf[js.Any])
    if (TestWindows != null) __obj.updateDynamic("TestWindows")(TestWindows.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluationResult]
  }
}

