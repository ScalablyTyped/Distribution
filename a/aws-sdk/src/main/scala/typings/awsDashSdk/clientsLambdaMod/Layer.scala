package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layer extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the function layer.
    */
  var Arn: js.UndefOr[LayerVersionArn] = js.undefined
  /**
    * The size of the layer archive in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.undefined
}

object Layer {
  @scala.inline
  def apply(Arn: LayerVersionArn = null, CodeSize: js.UndefOr[Long] = js.undefined): Layer = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (!js.isUndefined(CodeSize)) __obj.updateDynamic("CodeSize")(CodeSize)
    __obj.asInstanceOf[Layer]
  }
}

