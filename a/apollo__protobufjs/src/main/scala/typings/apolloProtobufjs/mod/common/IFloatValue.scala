package typings.apolloProtobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.FloatValue message. */
trait IFloatValue extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object IFloatValue {
  @scala.inline
  def apply(value: js.UndefOr[Double] = js.undefined): IFloatValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFloatValue]
  }
}

