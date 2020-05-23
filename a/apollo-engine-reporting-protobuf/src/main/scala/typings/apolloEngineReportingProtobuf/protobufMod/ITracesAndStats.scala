package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITracesAndStats extends js.Object {
  /** TracesAndStats statsWithContext */
  var statsWithContext: js.UndefOr[js.Array[IContextualizedStats] | Null] = js.undefined
  /** TracesAndStats trace */
  var trace: js.UndefOr[js.Array[ITrace] | Null] = js.undefined
}

object ITracesAndStats {
  @scala.inline
  def apply(
    statsWithContext: js.UndefOr[Null | js.Array[IContextualizedStats]] = js.undefined,
    trace: js.UndefOr[Null | js.Array[ITrace]] = js.undefined
  ): ITracesAndStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(statsWithContext)) __obj.updateDynamic("statsWithContext")(statsWithContext.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITracesAndStats]
  }
}

