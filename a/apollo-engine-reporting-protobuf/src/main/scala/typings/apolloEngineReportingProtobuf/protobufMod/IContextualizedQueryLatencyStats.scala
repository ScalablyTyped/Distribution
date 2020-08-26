package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualizedQueryLatencyStats extends js.Object {
  /** ContextualizedQueryLatencyStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.native
  /** ContextualizedQueryLatencyStats queryLatencyStats */
  var queryLatencyStats: js.UndefOr[IQueryLatencyStats | Null] = js.native
}

object IContextualizedQueryLatencyStats {
  @scala.inline
  def apply(): IContextualizedQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContextualizedQueryLatencyStats]
  }
  @scala.inline
  implicit class IContextualizedQueryLatencyStatsOps[Self <: IContextualizedQueryLatencyStats] (val x: Self) extends AnyVal {
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
    def setContext(value: IStatsContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    @scala.inline
    def setQueryLatencyStats(value: IQueryLatencyStats): Self = this.set("queryLatencyStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryLatencyStats: Self = this.set("queryLatencyStats", js.undefined)
    @scala.inline
    def setQueryLatencyStatsNull: Self = this.set("queryLatencyStats", null)
  }
  
}

