package typings.apolloEngineReportingProtobuf.protobufMod.Trace.HTTP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Values. */
trait IValues extends js.Object {
  /** Values value */
  var value: js.UndefOr[js.Array[String] | Null] = js.undefined
}

object IValues {
  @scala.inline
  def apply(value: js.UndefOr[Null | js.Array[String]] = js.undefined): IValues = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValues]
  }
}

