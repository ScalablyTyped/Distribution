package typings.autocannon.autocannonMod

import typings.autocannon.Anon_Sent
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results object emitted by `done` and passed to the `autocannon()` callback.
  */
trait Result extends js.Object {
  /** The number of 1xx response status codes received. */
  var `1XX`: Double
  /** The number of 2xx response status codes received. */
  var `2XX`: Double
  /** The number of 3xx response status codes received. */
  var `3XX`: Double
  /** The number of 4xx response status codes received. */
  var `4XX`: Double
  /** The number of 5xx response status codes received. */
  var `5XX`: Double
  /** The amount of connections used (value of `options.connections`). */
  var connections: Double
  /** The amount of time the test took, **in seconds**. */
  var duration: Double
  /** The number of connection errors (including timeouts) that occurred. */
  var errors: Double
  /** A Date object representing when the test ended. */
  var finish: Date
  /** A histogram object containing statistics about response latency. */
  var latency: Histogram
  /** The number of non-2xx response status codes received. */
  var non2xx: Double
  /** The number of pipelined requests used per connection (value of `options.pipelining`). */
  var pipelining: Double
  /** A histogram object containing statistics about the amount of requests that were sent per second. */
  var requests: Histogram with Anon_Sent
  /** The UNIX Domain Socket or Windows Named Pipe that was targeted, or `undefined`. */
  var socketPath: js.UndefOr[String] = js.undefined
  /** A Date object representing when the test started. */
  var start: Date
  /** A histogram object containing statistics about the response data throughput per second. */
  var throughput: Histogram
  /** The number of connection timeouts that occurred. */
  var timeouts: Double
  /** Value of the `title` option passed to `autocannon()`. */
  var title: js.UndefOr[String] = js.undefined
  /** The URL that was targeted. */
  var url: String
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
    requests: Histogram with Anon_Sent,
    start: Date,
    throughput: Histogram,
    timeouts: Double,
    url: String,
    socketPath: String = null,
    title: String = null
  ): Result = {
    val __obj = js.Dynamic.literal(connections = connections, duration = duration, errors = errors, finish = finish, latency = latency, non2xx = non2xx, pipelining = pipelining, requests = requests, start = start, throughput = throughput, timeouts = timeouts, url = url)
    __obj.updateDynamic("1XX")(`1XX`)
    __obj.updateDynamic("2XX")(`2XX`)
    __obj.updateDynamic("3XX")(`3XX`)
    __obj.updateDynamic("4XX")(`4XX`)
    __obj.updateDynamic("5XX")(`5XX`)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Result]
  }
}

