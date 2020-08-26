package typings.apolloEngineReportingProtobuf.protobufMod.Trace.QueryPlanNode

import typings.apolloEngineReportingProtobuf.protobufMod.ITrace
import typings.apolloEngineReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FetchNode. */
@js.native
trait IFetchNode extends js.Object {
  /** FetchNode receivedTime */
  var receivedTime: js.UndefOr[ITimestamp | Null] = js.native
  /** FetchNode sentTime */
  var sentTime: js.UndefOr[ITimestamp | Null] = js.native
  /** FetchNode sentTimeOffset */
  var sentTimeOffset: js.UndefOr[Double | Null] = js.native
  /** FetchNode serviceName */
  var serviceName: js.UndefOr[String | Null] = js.native
  /** FetchNode trace */
  var trace: js.UndefOr[ITrace | Null] = js.native
  /** FetchNode traceParsingFailed */
  var traceParsingFailed: js.UndefOr[Boolean | Null] = js.native
}

object IFetchNode {
  @scala.inline
  def apply(): IFetchNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFetchNode]
  }
  @scala.inline
  implicit class IFetchNodeOps[Self <: IFetchNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReceivedTime(value: ITimestamp): Self = this.set("receivedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceivedTime: Self = this.set("receivedTime", js.undefined)
    @scala.inline
    def setReceivedTimeNull: Self = this.set("receivedTime", null)
    @scala.inline
    def setSentTime(value: ITimestamp): Self = this.set("sentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentTime: Self = this.set("sentTime", js.undefined)
    @scala.inline
    def setSentTimeNull: Self = this.set("sentTime", null)
    @scala.inline
    def setSentTimeOffset(value: Double): Self = this.set("sentTimeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentTimeOffset: Self = this.set("sentTimeOffset", js.undefined)
    @scala.inline
    def setSentTimeOffsetNull: Self = this.set("sentTimeOffset", null)
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    @scala.inline
    def setServiceNameNull: Self = this.set("serviceName", null)
    @scala.inline
    def setTrace(value: ITrace): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    @scala.inline
    def setTraceNull: Self = this.set("trace", null)
    @scala.inline
    def setTraceParsingFailed(value: Boolean): Self = this.set("traceParsingFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceParsingFailed: Self = this.set("traceParsingFailed", js.undefined)
    @scala.inline
    def setTraceParsingFailedNull: Self = this.set("traceParsingFailed", null)
  }
  
}

