package typings.apolloProtobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Int32Value message. */
trait IInt32Value extends js.Object {
  var value: js.UndefOr[Double] = js.undefined
}

object IInt32Value {
  @scala.inline
  def apply(value: Int | Double = null): IInt32Value = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInt32Value]
  }
}

