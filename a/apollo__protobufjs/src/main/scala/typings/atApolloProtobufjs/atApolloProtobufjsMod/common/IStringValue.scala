package typings.atApolloProtobufjs.atApolloProtobufjsMod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.StringValue message. */
trait IStringValue extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object IStringValue {
  @scala.inline
  def apply(value: String = null): IStringValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IStringValue]
  }
}

