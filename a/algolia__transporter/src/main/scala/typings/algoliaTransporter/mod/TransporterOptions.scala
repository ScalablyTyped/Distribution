package typings.algoliaTransporter.mod

import typings.algoliaCacheCommon.mod.Cache
import typings.algoliaLoggerCommon.mod.Logger
import typings.algoliaRequesterCommon.mod.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransporterOptions extends js.Object {
  /**
    * The headers used by the requester. The transporter
    * layer may add some extra headers during the request
    * for the user agent, and others.
    */
  val headers: Headers
  /**
    * The hosts used by the requester.
    */
  val hosts: js.Array[HostOptions]
  /**
    * The cache of the hosts. Usually used to persist
    * the state of the host when its down.
    */
  val hostsCache: Cache
  /**
    * The logger instance to send events of the transporter.
    */
  val logger: Logger
  /**
    * The query parameters used by the requester. The transporter
    * layer may add some extra headers during the request
    * for the user agent, and others.
    */
  val queryParameters: QueryParameters
  /**
    * The underlying requester used. Should differ
    * depending of the enviroment where the client
    * will be used.
    */
  val requester: Requester
  /**
    * The cache of the requests. When requests are
    * `cacheable`, the returned promised persists
    * in this cache to shared in similar resquests
    * before being resolved.
    */
  val requestsCache: Cache
  /**
    * The cache of the responses. When requests are
    * `cacheable`, the returned responses persists
    * in this cache to shared in similar resquests.
    */
  val responsesCache: Cache
  /**
    * The timeouts used by the requester. The transporter
    * layer may increase this timeouts as defined on the
    * retry strategy.
    */
  val timeouts: Timeouts
  /**
    * The user agent used. Sent on query parameters.
    */
  val userAgent: UserAgent
}

object TransporterOptions {
  @scala.inline
  def apply(
    headers: Headers,
    hosts: js.Array[HostOptions],
    hostsCache: Cache,
    logger: Logger,
    queryParameters: QueryParameters,
    requester: Requester,
    requestsCache: Cache,
    responsesCache: Cache,
    timeouts: Timeouts,
    userAgent: UserAgent
  ): TransporterOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], hostsCache = hostsCache.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any], requestsCache = requestsCache.asInstanceOf[js.Any], responsesCache = responsesCache.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransporterOptions]
  }
}

