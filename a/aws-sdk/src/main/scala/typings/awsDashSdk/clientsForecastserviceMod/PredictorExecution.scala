package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictorExecution extends js.Object {
  /**
    * The ARN of the algorithm used to test the predictor.
    */
  var AlgorithmArn: js.UndefOr[Arn] = js.native
  /**
    * An array of test windows used to evaluate the algorithm. The NumberOfBacktestWindows from the object determines the number of windows in the array.
    */
  var TestWindows: js.UndefOr[TestWindowDetails] = js.native
}

object PredictorExecution {
  @scala.inline
  def apply(AlgorithmArn: Arn = null, TestWindows: TestWindowDetails = null): PredictorExecution = {
    val __obj = js.Dynamic.literal()
    if (AlgorithmArn != null) __obj.updateDynamic("AlgorithmArn")(AlgorithmArn.asInstanceOf[js.Any])
    if (TestWindows != null) __obj.updateDynamic("TestWindows")(TestWindows.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictorExecution]
  }
}

