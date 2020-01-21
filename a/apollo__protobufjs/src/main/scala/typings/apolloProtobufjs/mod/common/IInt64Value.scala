package typings.apolloProtobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Int64Value message. */
trait IInt64Value extends js.Object {
  var value: js.UndefOr[Double | typings.long.mod.^ ] = js.undefined
}

object IInt64Value {
  @scala.inline
  def apply(value: Double | typings.long.mod.^  = null): IInt64Value = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInt64Value]
  }
}

