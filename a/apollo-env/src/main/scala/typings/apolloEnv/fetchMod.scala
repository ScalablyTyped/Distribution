package typings.apolloEnv

import org.scalablytyped.runtime.StringDictionary
import typings.node.urlMod.URL_
import typings.nodeFetch.AnonSize
import typings.nodeFetch.mod.BodyInit
import typings.nodeFetch.mod.HeadersInit
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.ResponseInit
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch", JSImport.Namespace)
@js.native
object fetchMod extends js.Object {
  @js.native
  class Body ()
    extends typings.apolloEnv.fetchFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: AnonSize) = this()
  }
  
  @js.native
  class Headers ()
    extends typings.apolloEnv.fetchFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typings.apolloEnv.fetchFetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.apolloEnv.fetchFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typings.apolloEnv.urlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typings.apolloEnv.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
  }
  
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typings.nodeFetch.mod.Response = js.native
    def redirect(url: String, status: Double): typings.nodeFetch.mod.Response = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(url: RequestInfo): js.Promise[typings.nodeFetch.mod.Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
}

