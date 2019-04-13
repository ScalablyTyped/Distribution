package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionSucceededEventDetails extends js.Object {
  /**
    * The JSON data output by the lambda function.
    */
  var output: js.UndefOr[SensitiveData] = js.undefined
}

object LambdaFunctionSucceededEventDetails {
  @scala.inline
  def apply(output: SensitiveData = null): LambdaFunctionSucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    if (output != null) __obj.updateDynamic("output")(output)
    __obj.asInstanceOf[LambdaFunctionSucceededEventDetails]
  }
}

