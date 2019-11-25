package typings.atApolloProtobufjs.atApolloProtobufjsMod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.UInt64Value message. */
trait IUInt64Value extends js.Object {
  var value: js.UndefOr[Double | typings.long.longMod.^ ] = js.undefined
}

object IUInt64Value {
  @scala.inline
  def apply(value: Double | typings.long.longMod.^  = null): IUInt64Value = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUInt64Value]
  }
}

