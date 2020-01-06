package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingDataResult extends js.Object {
  /**
    * The testing dataset that was supplied for training.
    */
  var Input: js.UndefOr[TestingData] = js.native
  /**
    * The subset of the dataset that was actually tested. Some images (assets) might not be tested due to file formatting and other issues. 
    */
  var Output: js.UndefOr[TestingData] = js.native
}

object TestingDataResult {
  @scala.inline
  def apply(Input: TestingData = null, Output: TestingData = null): TestingDataResult = {
    val __obj = js.Dynamic.literal()
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (Output != null) __obj.updateDynamic("Output")(Output.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestingDataResult]
  }
}

