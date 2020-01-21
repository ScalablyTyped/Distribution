package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITracesReport extends js.Object {
  /** TracesReport header */
  var header: js.UndefOr[IReportHeader | Null] = js.undefined
  /** TracesReport trace */
  var trace: js.UndefOr[js.Array[ITrace] | Null] = js.undefined
}

object ITracesReport {
  @scala.inline
  def apply(header: IReportHeader = null, trace: js.Array[ITrace] = null): ITracesReport = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITracesReport]
  }
}

