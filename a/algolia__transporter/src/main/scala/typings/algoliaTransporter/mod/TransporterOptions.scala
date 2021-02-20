package typings.algoliaTransporter.mod

import typings.algoliaCacheCommon.mod.Cache
import typings.algoliaLoggerCommon.mod.Logger
import typings.algoliaRequesterCommon.mod.Requester
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransporterOptions extends StObject {
  
  /**
    * The headers used by the requester. The transporter
    * layer may add some extra headers during the request
    * for the user agent, and others.
    */
  val headers: Headers = js.native
  
  /**
    * The hosts used by the requester.
    */
  val hosts: js.Array[HostOptions] = js.native
  
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
    * The query parameters used by the requester. The transporter
    * layer may add some extra headers during the request
    * for the user agent, and others.
    */
  val queryParameters: QueryParameters = js.native
  
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
  
  @scala.inline
  implicit class TransporterOptionsMutableBuilder[Self <: TransporterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHosts(value: js.Array[HostOptions]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsCache(value: Cache): Self = StObject.set(x, "hostsCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsVarargs(value: HostOptions*): Self = StObject.set(x, "hosts", js.Array(value :_*))
    
    @scala.inline
    def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParameters(value: QueryParameters): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequester(value: Requester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsCache(value: Cache): Self = StObject.set(x, "requestsCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesCache(value: Cache): Self = StObject.set(x, "responsesCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeouts(value: Timeouts): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAgent(value: UserAgent): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
  }
}
