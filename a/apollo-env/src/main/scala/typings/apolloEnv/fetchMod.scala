package typings.apolloEnv

import typings.node.NodeJS.Dict
import typings.node.urlMod.URL_
import typings.nodeFetch.anon.Size
import typings.nodeFetch.mod.BodyInit
import typings.nodeFetch.mod.HeadersInit
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.ResponseInit
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("apollo-env/lib/fetch", "Body")
  @js.native
  class Body ()
    extends typings.apolloEnv.fetchFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.UndefOr[scala.Nothing], opts: Size) = this()
    def this(body: js.Any, opts: Size) = this()
  }
  
  @JSImport("apollo-env/lib/fetch", "Headers")
  @js.native
  class Headers ()
    extends typings.apolloEnv.fetchFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-env/lib/fetch", "Request")
  @js.native
  class Request protected ()
    extends typings.apolloEnv.fetchFetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @JSImport("apollo-env/lib/fetch", "Response")
  @js.native
  class Response ()
    extends typings.apolloEnv.fetchFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-env/lib/fetch", "Response.error")
    @js.native
    def error(): typings.nodeFetch.mod.Response = js.native
    
    @JSImport("apollo-env/lib/fetch", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): typings.nodeFetch.mod.Response = js.native
  }
  
  @JSImport("apollo-env/lib/fetch", "URL")
  @js.native
  class URL protected ()
    extends typings.apolloEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @JSImport("apollo-env/lib/fetch", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.apolloEnv.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: Dict[String | js.Array[String]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
  }
  
  object fetch {
    
    @JSImport("apollo-env/lib/fetch", "fetch")
    @js.native
    def apply(url: RequestInfo): js.Promise[typings.nodeFetch.mod.Response] = js.native
    @JSImport("apollo-env/lib/fetch", "fetch")
    @js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = js.native
    
    @JSImport("apollo-env/lib/fetch", "fetch.isRedirect")
    @js.native
    def isRedirect(code: Double): Boolean = js.native
  }
}
