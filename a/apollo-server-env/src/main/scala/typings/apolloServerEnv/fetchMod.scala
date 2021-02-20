package typings.apolloServerEnv

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerEnv.apolloServerEnvBooleans.`false`
import typings.node.httpMod.Agent
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Iterable
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("apollo-server-env/dist/fetch", "Body")
  @js.native
  class Body () extends StObject {
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    val bodyUsed: Boolean = js.native
    
    def json(): js.Promise[_] = js.native
    
    def text(): js.Promise[String] = js.native
  }
  
  @JSImport("apollo-server-env/dist/fetch", "Headers")
  @js.native
  class Headers ()
    extends Iterable[js.Tuple2[String, String]] {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def entries(): Iterator[js.Tuple2[String, String], _, js.UndefOr[scala.Nothing]] = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def keys(): Iterator[String, _, js.UndefOr[scala.Nothing]] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def values(): Iterator[js.Array[String], _, js.UndefOr[scala.Nothing]] = js.native
  }
  
  @JSImport("apollo-server-env/dist/fetch", "Request")
  @js.native
  class Request protected () extends Body {
    def this(input: String) = this()
    def this(input: Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: Request, init: RequestInit) = this()
    
    val headers: Headers = js.native
    
    val method: String = js.native
    
    val url: String = js.native
  }
  
  @JSImport("apollo-server-env/dist/fetch", "Response")
  @js.native
  class Response () extends Body {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    
    val headers: Headers = js.native
    
    val ok: Boolean = js.native
    
    val redirected: Boolean = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    val url: String = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-server-env/dist/fetch", "Response.error")
    @js.native
    def error(): Response = js.native
    
    @JSImport("apollo-server-env/dist/fetch", "Response.redirect")
    @js.native
    def redirect(url: String): Response = js.native
    @JSImport("apollo-server-env/dist/fetch", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): Response = js.native
  }
  
  @JSImport("apollo-server-env/dist/fetch", "fetch")
  @js.native
  def fetch(): js.Promise[Response] = js.native
  @JSImport("apollo-server-env/dist/fetch", "fetch")
  @js.native
  def fetch(input: js.UndefOr[RequestInfo], init: RequestInit): js.Promise[Response] = js.native
  @JSImport("apollo-server-env/dist/fetch", "fetch")
  @js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  
  type BodyInit = ArrayBuffer | ArrayBufferView | String
  
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.apolloServerEnv.apolloServerEnvStrings._empty
    - typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer`
    - typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade`
    - typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`
    - typings.apolloServerEnv.apolloServerEnvStrings.origin
    - typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin`
    - typings.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin`
    - typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin`
    - typings.apolloServerEnv.apolloServerEnvStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    @scala.inline
    def _empty: typings.apolloServerEnv.apolloServerEnvStrings._empty = "".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings._empty]
    
    @scala.inline
    def `no-referrer`: typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer` = "no-referrer".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer`]
    
    @scala.inline
    def `no-referrer-when-downgrade`: typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade`]
    
    @scala.inline
    def origin: typings.apolloServerEnv.apolloServerEnvStrings.origin = "origin".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.origin]
    
    @scala.inline
    def `origin-when-cross-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin`]
    
    @scala.inline
    def `same-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`same-origin` = "same-origin".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`]
    
    @scala.inline
    def `strict-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin` = "strict-origin".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin`]
    
    @scala.inline
    def `strict-origin-when-cross-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin`]
    
    @scala.inline
    def `unsafe-url`: typings.apolloServerEnv.apolloServerEnvStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`unsafe-url`]
  }
  
  type RequestAgent = Agent | typings.node.httpsMod.Agent
  
  /* Rewritten from type alias, can be one of: 
    - typings.apolloServerEnv.apolloServerEnvStrings.default
    - typings.apolloServerEnv.apolloServerEnvStrings.`no-store`
    - typings.apolloServerEnv.apolloServerEnvStrings.reload
    - typings.apolloServerEnv.apolloServerEnvStrings.`no-cache`
    - typings.apolloServerEnv.apolloServerEnvStrings.`force-cache`
    - typings.apolloServerEnv.apolloServerEnvStrings.`only-if-cached`
  */
  trait RequestCache extends StObject
  object RequestCache {
    
    @scala.inline
    def default: typings.apolloServerEnv.apolloServerEnvStrings.default = "default".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.default]
    
    @scala.inline
    def `force-cache`: typings.apolloServerEnv.apolloServerEnvStrings.`force-cache` = "force-cache".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`force-cache`]
    
    @scala.inline
    def `no-cache`: typings.apolloServerEnv.apolloServerEnvStrings.`no-cache` = "no-cache".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`no-cache`]
    
    @scala.inline
    def `no-store`: typings.apolloServerEnv.apolloServerEnvStrings.`no-store` = "no-store".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`no-store`]
    
    @scala.inline
    def `only-if-cached`: typings.apolloServerEnv.apolloServerEnvStrings.`only-if-cached` = "only-if-cached".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`only-if-cached`]
    
    @scala.inline
    def reload: typings.apolloServerEnv.apolloServerEnvStrings.reload = "reload".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.reload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apolloServerEnv.apolloServerEnvStrings.omit
    - typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`
    - typings.apolloServerEnv.apolloServerEnvStrings.include
  */
  trait RequestCredentials extends StObject
  object RequestCredentials {
    
    @scala.inline
    def include: typings.apolloServerEnv.apolloServerEnvStrings.include = "include".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.include]
    
    @scala.inline
    def omit: typings.apolloServerEnv.apolloServerEnvStrings.omit = "omit".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.omit]
    
    @scala.inline
    def `same-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`same-origin` = "same-origin".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`]
  }
  
  type RequestInfo = Request | String
  
  @js.native
  trait RequestInit extends StObject {
    
    var agent: js.UndefOr[RequestAgent | `false`] = js.native
    
    var body: js.UndefOr[BodyInit] = js.native
    
    var cache: js.UndefOr[RequestCache] = js.native
    
    // Cloudflare Workers accept a `cf` property to control Cloudflare features
    // See https://developers.cloudflare.com/workers/reference/cloudflare-features/
    var cf: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var credentials: js.UndefOr[RequestCredentials] = js.native
    
    // The following properties are node-fetch extensions
    var follow: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[HeadersInit] = js.native
    
    var integrity: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var mode: js.UndefOr[RequestMode] = js.native
    
    var redirect: js.UndefOr[RequestRedirect] = js.native
    
    var referrer: js.UndefOr[String] = js.native
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object RequestInit {
    
    @scala.inline
    def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    @scala.inline
    implicit class RequestInitMutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: RequestAgent | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCf(value: StringDictionary[js.Any]): Self = StObject.set(x, "cf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCfUndefined: Self = StObject.set(x, "cf", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      @scala.inline
      def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apolloServerEnv.apolloServerEnvStrings.navigate
    - typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`
    - typings.apolloServerEnv.apolloServerEnvStrings.`no-cors`
    - typings.apolloServerEnv.apolloServerEnvStrings.cors
  */
  trait RequestMode extends StObject
  object RequestMode {
    
    @scala.inline
    def cors: typings.apolloServerEnv.apolloServerEnvStrings.cors = "cors".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.cors]
    
    @scala.inline
    def navigate: typings.apolloServerEnv.apolloServerEnvStrings.navigate = "navigate".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.navigate]
    
    @scala.inline
    def `no-cors`: typings.apolloServerEnv.apolloServerEnvStrings.`no-cors` = "no-cors".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`no-cors`]
    
    @scala.inline
    def `same-origin`: typings.apolloServerEnv.apolloServerEnvStrings.`same-origin` = "same-origin".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apolloServerEnv.apolloServerEnvStrings.follow
    - typings.apolloServerEnv.apolloServerEnvStrings.error
    - typings.apolloServerEnv.apolloServerEnvStrings.manual
  */
  trait RequestRedirect extends StObject
  object RequestRedirect {
    
    @scala.inline
    def error: typings.apolloServerEnv.apolloServerEnvStrings.error = "error".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.error]
    
    @scala.inline
    def follow: typings.apolloServerEnv.apolloServerEnvStrings.follow = "follow".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.follow]
    
    @scala.inline
    def manual: typings.apolloServerEnv.apolloServerEnvStrings.manual = "manual".asInstanceOf[typings.apolloServerEnv.apolloServerEnvStrings.manual]
  }
  
  @js.native
  trait ResponseInit extends StObject {
    
    var headers: js.UndefOr[HeadersInit] = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var statusText: js.UndefOr[String] = js.native
    
    // Although this isn't part of the spec, `node-fetch` accepts a `url` property
    var url: js.UndefOr[String] = js.native
  }
  object ResponseInit {
    
    @scala.inline
    def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    @scala.inline
    implicit class ResponseInitMutableBuilder[Self <: ResponseInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
