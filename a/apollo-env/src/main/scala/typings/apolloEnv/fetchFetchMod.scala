package typings.apolloEnv

import typings.node.httpMod.Agent
import typings.nodeFetch.anon.Size
import typings.nodeFetch.mod.BodyInit
import typings.nodeFetch.mod.HeadersInit
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchFetchMod {
  
  @JSImport("apollo-env/lib/fetch/fetch", "Body")
  @js.native
  class Body ()
    extends typings.nodeFetch.mod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: Size) = this()
    def this(body: Unit, opts: Size) = this()
  }
  
  @JSImport("apollo-env/lib/fetch/fetch", "Headers")
  @js.native
  class Headers ()
    extends typings.nodeFetch.mod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-env/lib/fetch/fetch", "Request")
  @js.native
  class Request protected ()
    extends typings.nodeFetch.mod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @JSImport("apollo-env/lib/fetch/fetch", "Response")
  @js.native
  class Response ()
    extends typings.nodeFetch.mod.Response {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-env/lib/fetch/fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): typings.nodeFetch.mod.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.nodeFetch.mod.Response]
    
    inline def redirect(url: String, status: Double): typings.nodeFetch.mod.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.nodeFetch.mod.Response]
  }
  
  object fetch {
    
    inline def apply(url: RequestInfo): js.Promise[typings.nodeFetch.mod.Response] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.nodeFetch.mod.Response]]
    inline def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.nodeFetch.mod.Response]]
    
    @JSImport("apollo-env/lib/fetch/fetch", "fetch")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isRedirect(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apolloEnv.apolloEnvStrings._empty
    - typings.apolloEnv.apolloEnvStrings.`no-referrer`
    - typings.apolloEnv.apolloEnvStrings.`no-referrer-when-downgrade`
    - typings.apolloEnv.apolloEnvStrings.`same-origin`
    - typings.apolloEnv.apolloEnvStrings.origin
    - typings.apolloEnv.apolloEnvStrings.`strict-origin`
    - typings.apolloEnv.apolloEnvStrings.`origin-when-cross-origin`
    - typings.apolloEnv.apolloEnvStrings.`strict-origin-when-cross-origin`
    - typings.apolloEnv.apolloEnvStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    inline def _empty: typings.apolloEnv.apolloEnvStrings._empty = "".asInstanceOf[typings.apolloEnv.apolloEnvStrings._empty]
    
    inline def `no-referrer`: typings.apolloEnv.apolloEnvStrings.`no-referrer` = "no-referrer".asInstanceOf[typings.apolloEnv.apolloEnvStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typings.apolloEnv.apolloEnvStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typings.apolloEnv.apolloEnvStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typings.apolloEnv.apolloEnvStrings.origin = "origin".asInstanceOf[typings.apolloEnv.apolloEnvStrings.origin]
    
    inline def `origin-when-cross-origin`: typings.apolloEnv.apolloEnvStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typings.apolloEnv.apolloEnvStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typings.apolloEnv.apolloEnvStrings.`same-origin` = "same-origin".asInstanceOf[typings.apolloEnv.apolloEnvStrings.`same-origin`]
    
    inline def `strict-origin`: typings.apolloEnv.apolloEnvStrings.`strict-origin` = "strict-origin".asInstanceOf[typings.apolloEnv.apolloEnvStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typings.apolloEnv.apolloEnvStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typings.apolloEnv.apolloEnvStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typings.apolloEnv.apolloEnvStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typings.apolloEnv.apolloEnvStrings.`unsafe-url`]
  }
  
  type RequestAgent = Agent | typings.node.httpsMod.Agent
}
