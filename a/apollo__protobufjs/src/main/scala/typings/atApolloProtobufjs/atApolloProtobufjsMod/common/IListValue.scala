package typings.atApolloProtobufjs.atApolloProtobufjsMod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.ListValue message. */
trait IListValue extends js.Object {
  var values: js.UndefOr[js.Array[IValue]] = js.undefined
}

object IListValue {
  @scala.inline
  def apply(values: js.Array[IValue] = null): IListValue = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[IListValue]
  }
}

