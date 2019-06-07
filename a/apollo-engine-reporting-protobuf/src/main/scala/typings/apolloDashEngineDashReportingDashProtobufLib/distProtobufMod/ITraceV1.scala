package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITraceV1 extends js.Object {
  /** TraceV1 header */
  var header: js.UndefOr[IReportHeader | scala.Null] = js.undefined
  /** TraceV1 trace */
  var trace: js.UndefOr[ITrace | scala.Null] = js.undefined
}

object ITraceV1 {
  @scala.inline
  def apply(header: IReportHeader = null, trace: ITrace = null): ITraceV1 = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header)
    if (trace != null) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[ITraceV1]
  }
}

