package typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typings.apolloEngineReportingProtobuf.protobufMod.ITrace
import typings.apolloEngineReportingProtobuf.protobufMod.google.protobuf.ITimestamp
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
    receivedTime: js.UndefOr[Null | ITimestamp] = js.undefined,
    sentTime: js.UndefOr[Null | ITimestamp] = js.undefined,
    sentTimeOffset: js.UndefOr[Null | Double] = js.undefined,
    serviceName: js.UndefOr[Null | String] = js.undefined,
    trace: js.UndefOr[Null | ITrace] = js.undefined,
    traceParsingFailed: js.UndefOr[Null | Boolean] = js.undefined
  ): IFetchNode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(receivedTime)) __obj.updateDynamic("receivedTime")(receivedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(sentTime)) __obj.updateDynamic("sentTime")(sentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(sentTimeOffset)) __obj.updateDynamic("sentTimeOffset")(sentTimeOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceName)) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace.asInstanceOf[js.Any])
    if (!js.isUndefined(traceParsingFailed)) __obj.updateDynamic("traceParsingFailed")(traceParsingFailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFetchNode]
  }
}

