package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.QueryPlanNode

import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.ITrace
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FetchNode. */
trait IFetchNode extends js.Object {
  /** FetchNode receivedTime */
  var receivedTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** FetchNode sentTime */
  var sentTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** FetchNode sentTimeOffset */
  var sentTimeOffset: js.UndefOr[Double | Null] = js.undefined
  /** FetchNode serviceName */
  var serviceName: js.UndefOr[String | Null] = js.undefined
  /** FetchNode trace */
  var trace: js.UndefOr[ITrace | Null] = js.undefined
  /** FetchNode traceParsingFailed */
  var traceParsingFailed: js.UndefOr[Boolean | Null] = js.undefined
}

object IFetchNode {
  @scala.inline
  def apply(
    receivedTime: ITimestamp = null,
    sentTime: ITimestamp = null,
    sentTimeOffset: Int | Double = null,
    serviceName: String = null,
    trace: ITrace = null,
    traceParsingFailed: js.UndefOr[Boolean] = js.undefined
  ): IFetchNode = {
    val __obj = js.Dynamic.literal()
    if (receivedTime != null) __obj.updateDynamic("receivedTime")(receivedTime)
    if (sentTime != null) __obj.updateDynamic("sentTime")(sentTime)
    if (sentTimeOffset != null) __obj.updateDynamic("sentTimeOffset")(sentTimeOffset.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName)
    if (trace != null) __obj.updateDynamic("trace")(trace)
    if (!js.isUndefined(traceParsingFailed)) __obj.updateDynamic("traceParsingFailed")(traceParsingFailed)
    __obj.asInstanceOf[IFetchNode]
  }
}

