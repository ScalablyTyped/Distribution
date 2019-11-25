package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITraceV1 extends js.Object {
  /** TraceV1 header */
  var header: js.UndefOr[IReportHeader | Null] = js.undefined
  /** TraceV1 trace */
  var trace: js.UndefOr[ITrace | Null] = js.undefined
}

object ITraceV1 {
  @scala.inline
  def apply(header: IReportHeader = null, trace: ITrace = null): ITraceV1 = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITraceV1]
  }
}

