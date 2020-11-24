package typings.algoliaTransporter.mod

import typings.algoliaCacheCommon.mod.Cache
import typings.algoliaLoggerCommon.mod.Logger
import typings.algoliaRequesterCommon.mod.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transporter extends js.Object {
  
  /**
    * The headers used on each request.
    */
  val headers: Headers = js.native
  
  /**
    * The hosts used by the retry strategy.
    *
    * @readonly
    */
  var hosts: js.Array[StatelessHost] = js.native
  
  /**
    * The cache of the hosts. Usually used to persist
    * the state of the host when its down.
    */
  val hostsCache: Cache = js.native
  
  /**
    * The logger instance to send events of the transporter.
    */
  val logger: Logger = js.native
  
  /**
    * The query parameters used on each request.
    */
  val queryParameters: QueryParameters = js.native
  
  /**
    * Performs a read request using read hosts.
    */
  def read[TResponse](request: Request): js.Promise[TResponse] = js.native
  def read[TResponse](request: Request, requestOptions: RequestOptions): js.Promise[TResponse] = js.native
  
  /**
    * The underlying requester used. Should differ
    * depending of the enviroment where the client
    * will be used.
    */
  val requester: Requester = js.native
  
  /**
    * The cache of the requests. When requests are
    * `cacheable`, the returned promised persists
    * in this cache to shared in similar resquests
    * before being resolved.
    */
  val requestsCache: Cache = js.native
  
  /**
    * The cache of the responses. When requests are
    * `cacheable`, the returned responses persists
    * in this cache to shared in similar resquests.
    */
  val responsesCache: Cache = js.native
  
  /**
    * The timeouts used by the requester. The transporter
    * layer may increase this timeouts as defined on the
    * retry strategy.
    */
  val timeouts: Timeouts = js.native
  
  /**
    * The user agent used. Sent on query parameters.
    */
  val userAgent: UserAgent = js.native
  
  /**
    * Performs a write request using write hosts.
    */
  def write[TResponse](request: Request): js.Promise[TResponse] = js.native
  def write[TResponse](request: Request, requestOptions: RequestOptions): js.Promise[TResponse] = js.native
}
