package typings.apolloTracing.mod

import typings.apolloTracing.anon.Resolvers
import typings.apolloTracing.apolloTracingNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TracingFormat extends js.Object {
  var duration: Double = js.native
  var endTime: String = js.native
  var execution: Resolvers = js.native
  var startTime: String = js.native
  var version: `1` = js.native
}

object TracingFormat {
  @scala.inline
  def apply(duration: Double, endTime: String, execution: Resolvers, startTime: String, version: `1`): TracingFormat = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingFormat]
  }
  @scala.inline
  implicit class TracingFormatOps[Self <: TracingFormat] (val x: Self) extends AnyVal {
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecution(value: Resolvers): Self = this.set("execution", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: `1`): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

