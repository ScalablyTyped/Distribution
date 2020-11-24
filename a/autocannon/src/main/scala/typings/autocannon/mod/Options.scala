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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * A `Number` stating the amount of requests to make before ending the test.
    * This overrides duration and takes precedence, so the test won't end
    * until the amount of requests needed to be completed are completed.
    */
  var amount: js.UndefOr[Double] = js.native
  
  /**
    * The threshold of the number of errors when making the requests to the server before this instance bail's out.
    * This instance will take all existing results so far and aggregate them into the results.
    * If none passed here, the instance will ignore errors and never bail out.
    */
  var bailout: js.UndefOr[Double] = js.native
  
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
  var body: js.UndefOr[String | Buffer] = js.native
  
  /**
    * A `Number` stating the rate of requests to make per second from each individual connection.
    * No rate limiting by default.
    */
  var connectionRate: js.UndefOr[Double] = js.native
  
  /**
    * The number of concurrent connections.
    * @default 10
    */
  var connections: js.UndefOr[Double] = js.native
  
  /**
    * The number of seconds to run the autocannon.
    * Can be a [timestring](https://www.npmjs.com/package/timestring).
    * @default 10
    */
  var duration: js.UndefOr[Double | String] = js.native
  
  /**
    * A `Boolean` which allows you to disable tracking non 2xx code responses in latency and bytes per second calculations.
    * @default false
    */
  var excludeErrorStats: js.UndefOr[Boolean] = js.native
  
  /**
    * A `Boolean` which allows you to setup an instance of autocannon that restarts indefinitely after emiting results with the `done` event.
    * Useful for efficiently restarting your instance. To stop running forever, you must cause a `SIGINT` or call the `.stop()` function on your instance.
    * @default false
    */
  var forever: js.UndefOr[Boolean] = js.native
  
  /**
    * An `Object` containing the headers of the request.
    * @default {}
    */
  var headers: js.UndefOr[IncomingHttpHeaders] = js.native
  
  /**
    * A `Boolean` which enables the replacement of `[<id>]` tags within the request body with a randomly generated ID,
    * allowing for unique fields to be sent with requests.
    * @default false
    */
  var idReplacement: js.UndefOr[Boolean] = js.native
  
  /**
    * A `Number` stating the max requests to make per connection.
    * `amount` takes precedence if both are set.
    */
  var maxConnectionRequests: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` stating the max requests to make overall.
    * Can't be less than `connections`.
    */
  var maxOverallRequests: js.UndefOr[Double] = js.native
  
  /**
    * The http method to use.
    * @default 'GET'
    */
  var method: js.UndefOr[
    ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
  ] = js.native
  
  /**
    * A `Number` stating the rate of requests to make per second from all connections.
    * `connectionRate` takes precedence if both are set.
    * No rate limiting by default.
    */
  var overallRate: js.UndefOr[Double] = js.native
  
  /**
    *  The number of [pipelined requests](https://en.wikipedia.org/wiki/HTTP_pipelining) for each connection.
    * Will cause the `Client` API to throw when greater than 1
    * @default 1
    */
  var pipelining: js.UndefOr[Double] = js.native
  
  /**
    * A `Number` which makes the individual connections disconnect and reconnect to the server
    * whenever it has sent that number of requests.
    */
  var reconnectRate: js.UndefOr[Double] = js.native
  
  /**
    * An `Array` of `Objects` which represents the sequence of requests to make while benchmarking.
    * Can be used in conjunction with the `body`, `headers` and `method` params above.
    *
    * The `Objects` in this array can have `body`, `headers`, `method`, or `path` attributes, which overwrite those that are passed in this `opts` object.
    * Therefore, the ones in this (`opts`) object take precedence and should be viewed as defaults.
    */
  var requests: js.UndefOr[js.Array[Request]] = js.native
  
  /**
    * A `String` identifying the server name for the SNI (Server Name Indication) TLS extension.
    */
  var servername: js.UndefOr[String] = js.native
  
  /**
    * A `Function` which will be passed the Client object for each connection to be made.
    * This can be used to customise each individual connection headers and body using the API shown below.
    *
    * The changes you make to the client in this function will take precedence over the default body and headers you pass in here.
    *
    * @default noop(){}
    */
  var setupClient: js.UndefOr[js.Function1[/* client */ Client, Unit]] = js.native
  
  /**
    * A path to a Unix Domain Socket or a Windows Named Pipe.
    * A `url` is still required in order to send the correct Host header and path.
    */
  var socketPath: js.UndefOr[String] = js.native
  
  /**
    * The number of seconds to wait for a response before timeout.
    * @default 10
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * A `String` to be added to the results for identification.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The given target. Can be http or https.
    */
  var url: String = js.native
}
object Options {
  
  @scala.inline
  def apply(url: String): Options = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setBailout(value: Double): Self = this.set("bailout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBailout: Self = this.set("bailout", js.undefined)
    
    @scala.inline
    def setBody(value: String | Buffer): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setConnectionRate(value: Double): Self = this.set("connectionRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionRate: Self = this.set("connectionRate", js.undefined)
    
    @scala.inline
    def setConnections(value: Double): Self = this.set("connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    
    @scala.inline
    def setDuration(value: Double | String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setExcludeErrorStats(value: Boolean): Self = this.set("excludeErrorStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeErrorStats: Self = this.set("excludeErrorStats", js.undefined)
    
    @scala.inline
    def setForever(value: Boolean): Self = this.set("forever", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForever: Self = this.set("forever", js.undefined)
    
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setIdReplacement(value: Boolean): Self = this.set("idReplacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdReplacement: Self = this.set("idReplacement", js.undefined)
    
    @scala.inline
    def setMaxConnectionRequests(value: Double): Self = this.set("maxConnectionRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnectionRequests: Self = this.set("maxConnectionRequests", js.undefined)
    
    @scala.inline
    def setMaxOverallRequests(value: Double): Self = this.set("maxOverallRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxOverallRequests: Self = this.set("maxOverallRequests", js.undefined)
    
    @scala.inline
    def setMethod(
      value: ACL | BIND | CHECKOUT | CONNECT | COPY | DELETE | GET | HEAD | LINK | LOCK | `M-SEARCH` | MERGE | MKACTIVITY | MKCALENDAR | MKCOL | MOVE | NOTIFY | OPTIONS | PATCH | POST | PROPFIND | PROPPATCH | PURGE | PUT | REBIND | REPORT | SEARCH | SOURCE | SUBSCRIBE | TRACE | UNBIND | UNLINK | UNLOCK | UNSUBSCRIBE
    ): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setOverallRate(value: Double): Self = this.set("overallRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverallRate: Self = this.set("overallRate", js.undefined)
    
    @scala.inline
    def setPipelining(value: Double): Self = this.set("pipelining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelining: Self = this.set("pipelining", js.undefined)
    
    @scala.inline
    def setReconnectRate(value: Double): Self = this.set("reconnectRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectRate: Self = this.set("reconnectRate", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: Request*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[Request]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    
    @scala.inline
    def setServername(value: String): Self = this.set("servername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
    
    @scala.inline
    def setSetupClient(value: /* client */ Client => Unit): Self = this.set("setupClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetupClient: Self = this.set("setupClient", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
