package typings.apolloProtobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.UInt32Value message. */
trait IUInt32Value extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object IUInt32Value {
  @scala.inline
  def apply(value: js.UndefOr[Double] = js.undefined): IUInt32Value = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUInt32Value]
  }
}

