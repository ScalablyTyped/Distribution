package typings.autocannon.mod

import typings.autocannon.anon.Histogramsentnumber
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results object emitted by `done` and passed to the `autocannon()` callback.
  */
@js.native
trait Result extends js.Object {
  /** The number of 1xx response status codes received. */
  var `1XX`: Double = js.native
  /** The number of 2xx response status codes received. */
  var `2XX`: Double = js.native
  /** The number of 3xx response status codes received. */
  var `3XX`: Double = js.native
  /** The number of 4xx response status codes received. */
  var `4XX`: Double = js.native
  /** The number of 5xx response status codes received. */
  var `5XX`: Double = js.native
  /** The amount of connections used (value of `options.connections`). */
  var connections: Double = js.native
  /** The amount of time the test took, **in seconds**. */
  var duration: Double = js.native
  /** The number of connection errors (including timeouts) that occurred. */
  var errors: Double = js.native
  /** A Date object representing when the test ended. */
  var finish: Date = js.native
  /** A histogram object containing statistics about response latency. */
  var latency: Histogram = js.native
  /** The number of non-2xx response status codes received. */
  var non2xx: Double = js.native
  /** The number of pipelined requests used per connection (value of `options.pipelining`). */
  var pipelining: Double = js.native
  /** A histogram object containing statistics about the amount of requests that were sent per second. */
  var requests: Histogramsentnumber = js.native
  /** The UNIX Domain Socket or Windows Named Pipe that was targeted, or `undefined`. */
  var socketPath: js.UndefOr[String] = js.native
  /** A Date object representing when the test started. */
  var start: Date = js.native
  /** A histogram object containing statistics about the response data throughput per second. */
  var throughput: Histogram = js.native
  /** The number of connection timeouts that occurred. */
  var timeouts: Double = js.native
  /** Value of the `title` option passed to `autocannon()`. */
  var title: js.UndefOr[String] = js.native
  /** The URL that was targeted. */
  var url: String = js.native
}

object Result {
  @scala.inline
  def apply(
    `1XX`: Double,
    `2XX`: Double,
    `3XX`: Double,
    `4XX`: Double,
    `5XX`: Double,
    connections: Double,
    duration: Double,
    errors: Double,
    finish: Date,
    latency: Histogram,
    non2xx: Double,
    pipelining: Double,
    requests: Histogramsentnumber,
    start: Date,
    throughput: Histogram,
    timeouts: Double,
    url: String
  ): Result = {
    val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], non2xx = non2xx.asInstanceOf[js.Any], pipelining = pipelining.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], throughput = throughput.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("1XX")(`1XX`.asInstanceOf[js.Any])
    __obj.updateDynamic("2XX")(`2XX`.asInstanceOf[js.Any])
    __obj.updateDynamic("3XX")(`3XX`.asInstanceOf[js.Any])
    __obj.updateDynamic("4XX")(`4XX`.asInstanceOf[js.Any])
    __obj.updateDynamic("5XX")(`5XX`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def set1XX(value: Double): Self = this.set("1XX", value.asInstanceOf[js.Any])
    @scala.inline
    def set2XX(value: Double): Self = this.set("2XX", value.asInstanceOf[js.Any])
    @scala.inline
    def set3XX(value: Double): Self = this.set("3XX", value.asInstanceOf[js.Any])
    @scala.inline
    def set4XX(value: Double): Self = this.set("4XX", value.asInstanceOf[js.Any])
    @scala.inline
    def set5XX(value: Double): Self = this.set("5XX", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnections(value: Double): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrors(value: Double): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinish(value: Date): Self = this.set("finish", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatency(value: Histogram): Self = this.set("latency", value.asInstanceOf[js.Any])
    @scala.inline
    def setNon2xx(value: Double): Self = this.set("non2xx", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipelining(value: Double): Self = this.set("pipelining", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequests(value: Histogramsentnumber): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setThroughput(value: Histogram): Self = this.set("throughput", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeouts(value: Double): Self = this.set("timeouts", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

