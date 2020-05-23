package typings.autocannon.mod

import typings.autocannon.autocannonStrings.ACL
import typings.autocannon.autocannonStrings.BIND
import typings.autocannon.autocannonStrings.CHECKOUT
import typings.autocannon.autocannonStrings.CONNECT
import typings.autocannon.autocannonStrings.COPY
import typings.autocannon.autocannonStrings.DELETE
import typings.autocannon.autocannonStrings.GET
import typings.autocannon.autocannonStrings.HEAD
import typings.autocannon.autocannonStrings.LINK
import typings.autocannon.autocannonStrings.LOCK
import typings.autocannon.autocannonStrings.MERGE
import typings.autocannon.autocannonStrings.MKACTIVITY
import typings.autocannon.autocannonStrings.MKCALENDAR
import typings.autocannon.autocannonStrings.MKCOL
import typings.autocannon.autocannonStrings.MOVE
import typings.autocannon.autocannonStrings.NOTIFY
import typings.autocannon.autocannonStrings.OPTIONS
import typings.autocannon.autocannonStrings.PATCH
import typings.autocannon.autocannonStrings.POST
import typings.autocannon.autocannonStrings.PROPFIND
import typings.autocannon.autocannonStrings.PROPPATCH
import typings.autocannon.autocannonStrings.PURGE
import typings.autocannon.autocannonStrings.PUT
import typings.autocannon.autocannonStrings.REBIND
import typings.autocannon.autocannonStrings.REPORT
import typings.autocannon.autocannonStrings.SEARCH
import typings.autocannon.autocannonStrings.SOURCE
import typings.autocannon.autocannonStrings.SUBSCRIBE
import typings.autocannon.autocannonStrings.TRACE
import typings.autocannon.autocannonStrings.UNBIND
import typings.autocannon.autocannonStrings.UNLINK
import typings.autocannon.autocannonStrings.UNLOCK
import typings.autocannon.autocannonStrings.UNSUBSCRIBE
import typings.autocannon.autocannonStrings.`M-SEARCH`
import typings.node.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * A `Number` stating the amount of requests to make before ending the test.
    * This overrides duration and takes precedence, so the test won't end
    * until the amount of requests needed to be completed are completed.
    */
  var amount: js.UndefOr[Double] = js.undefined
  /**
    * The threshold of the number of errors when making the requests to the server before this instance bail's out.
    * This instance will take all existing results so far and aggregate them into the results.
    * If none passed here, the instance will ignore errors and never bail out.
    */
  var bailout: js.UndefOr[Double] = js.undefined
  /**
    * A `String` or a `Buffer` containing the body of the request.
    *
    * Insert one or more randomly generated IDs into the body by including `[<id>]`
    * where the randomly generated ID should be inserted (Must also set idReplacement to true).
    *
    * This can be useful in soak testing POST endpoints where one or more fields must be unique.
    *
    * Leave undefined for an empty body.
    */
  var body: js.UndefOr[String | Buffer] = js.undefined
  /**
    * A `Number` stating the rate of requests to make per second from each individual connection.
    * No rate limiting by default.
    */
  var connectionRate: js.UndefOr[Double] = js.undefined
  /**
    * The number of concurrent connections.
    * @default 10
    */
  var connections: js.UndefOr[Double] = js.undefined
  /**
    * The number of seconds to run the autocannon.
    * Can be a [timestring](https://www.npmjs.com/package/timestring).
    * @default 10
    */
  var duration: js.UndefOr[Double | String] = js.undefined
  /**
    * A `Boolean` which allows you to disable tracking non 2xx code responses in latency and bytes per second calculations.
    * @default false
    */
  var excludeErrorStats: js.UndefOr[Boolean] = js.undefined
  /**
    * A `Boolean` which allows you to setup an instance of autocannon that restarts indefinitely after emiting results with the `done` event.
    * Useful for efficiently restarting your instance. To stop running forever, you must cause a `SIGINT` or call the `.stop()` function on your instance.
    * @default false
    */
  var forever: js.UndefOr[Boolean] = js.undefined
  /**
    * An `Object` containing the headers of the request.
    * @default {}
    */
  var headers: js.UndefOr[IncomingHttpHeaders] = js.undefined
  /**
    * A `Boolean` which enables the replacement of `[<id>]` tags within the request body with a randomly generated ID,
    * allowing for unique fields to be sent with requests.
    * @default false
    */
  var idReplacement: js.UndefOr[Boolean] = js.undefined
  /**
    * A `Number` stating the max requests to make per connection.
    * `amount` takes precedence if both are set.
    */
  var maxConnectionRequests: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` stating the max requests to make overall.
    * Can't be less than `connections`.
    */
  var maxOverallRequests: js.UndefOr[Double] = js.undefined
  /**
    * The http method to use.
    * @default 'GET'
    */
  var method: js.UndefOr[
    ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
  ] = js.undefined
  /**
    * A `Number` stating the rate of requests to make per second from all connections.
    * `connectionRate` takes precedence if both are set.
    * No rate limiting by default.
    */
  var overallRate: js.UndefOr[Double] = js.undefined
  /**
    *  The number of [pipelined requests](https://en.wikipedia.org/wiki/HTTP_pipelining) for each connection.
    * Will cause the `Client` API to throw when greater than 1
    * @default 1
    */
  var pipelining: js.UndefOr[Double] = js.undefined
  /**
    * A `Number` which makes the individual connections disconnect and reconnect to the server
    * whenever it has sent that number of requests.
    */
  var reconnectRate: js.UndefOr[Double] = js.undefined
  /**
    * An `Array` of `Objects` which represents the sequence of requests to make while benchmarking.
    * Can be used in conjunction with the `body`, `headers` and `method` params above.
    *
    * The `Objects` in this array can have `body`, `headers`, `method`, or `path` attributes, which overwrite those that are passed in this `opts` object.
    * Therefore, the ones in this (`opts`) object take precedence and should be viewed as defaults.
    */
  var requests: js.UndefOr[js.Array[Request]] = js.undefined
  /**
    * A `String` identifying the server name for the SNI (Server Name Indication) TLS extension.
    */
  var servername: js.UndefOr[String] = js.undefined
  /**
    * A `Function` which will be passed the Client object for each connection to be made.
    * This can be used to customise each individual connection headers and body using the API shown below.
    *
    * The changes you make to the client in this function will take precedence over the default body and headers you pass in here.
    *
    * @default noop(){}
    */
  var setupClient: js.UndefOr[js.Function1[/* client */ Client, Unit]] = js.undefined
  /**
    * A path to a Unix Domain Socket or a Windows Named Pipe.
    * A `url` is still required in order to send the correct Host header and path.
    */
  var socketPath: js.UndefOr[String] = js.undefined
  /**
    * The number of seconds to wait for a response before timeout.
    * @default 10
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * A `String` to be added to the results for identification.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The given target. Can be http or https.
    */
  var url: String
}

object Options {
  @scala.inline
  def apply(
    url: String,
    amount: js.UndefOr[Double] = js.undefined,
    bailout: js.UndefOr[Double] = js.undefined,
    body: String | Buffer = null,
    connectionRate: js.UndefOr[Double] = js.undefined,
    connections: js.UndefOr[Double] = js.undefined,
    duration: Double | String = null,
    excludeErrorStats: js.UndefOr[Boolean] = js.undefined,
    forever: js.UndefOr[Boolean] = js.undefined,
    headers: IncomingHttpHeaders = null,
    idReplacement: js.UndefOr[Boolean] = js.undefined,
    maxConnectionRequests: js.UndefOr[Double] = js.undefined,
    maxOverallRequests: js.UndefOr[Double] = js.undefined,
    method: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE = null,
    overallRate: js.UndefOr[Double] = js.undefined,
    pipelining: js.UndefOr[Double] = js.undefined,
    reconnectRate: js.UndefOr[Double] = js.undefined,
    requests: js.Array[Request] = null,
    servername: String = null,
    setupClient: /* client */ Client => Unit = null,
    socketPath: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    title: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(amount)) __obj.updateDynamic("amount")(amount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bailout)) __obj.updateDynamic("bailout")(bailout.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRate)) __obj.updateDynamic("connectionRate")(connectionRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connections)) __obj.updateDynamic("connections")(connections.get.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeErrorStats)) __obj.updateDynamic("excludeErrorStats")(excludeErrorStats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(idReplacement)) __obj.updateDynamic("idReplacement")(idReplacement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConnectionRequests)) __obj.updateDynamic("maxConnectionRequests")(maxConnectionRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOverallRequests)) __obj.updateDynamic("maxOverallRequests")(maxOverallRequests.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(overallRate)) __obj.updateDynamic("overallRate")(overallRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pipelining)) __obj.updateDynamic("pipelining")(pipelining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectRate)) __obj.updateDynamic("reconnectRate")(reconnectRate.get.asInstanceOf[js.Any])
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (setupClient != null) __obj.updateDynamic("setupClient")(js.Any.fromFunction1(setupClient))
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

