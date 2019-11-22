package typings.apolloDashEnv

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashFetch.Anon_Size
import typings.nodeDashFetch.nodeDashFetchMod.BodyInit
import typings.nodeDashFetch.nodeDashFetchMod.HeadersInit
import typings.nodeDashFetch.nodeDashFetchMod.RequestInfo
import typings.nodeDashFetch.nodeDashFetchMod.RequestInit
import typings.nodeDashFetch.nodeDashFetchMod.ResponseInit
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch", JSImport.Namespace)
@js.native
object libFetchMod extends js.Object {
  @js.native
  class Body ()
    extends typings.apolloDashEnv.libFetchFetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.Any, opts: Anon_Size) = this()
  }
  
  @js.native
  class Headers ()
    extends typings.apolloDashEnv.libFetchFetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @js.native
  class Request protected ()
    extends typings.apolloDashEnv.libFetchFetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @js.native
  class Response ()
    extends typings.apolloDashEnv.libFetchFetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
  }
  
  @js.native
  class URL protected ()
    extends typings.apolloDashEnv.libFetchUrlMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: typings.node.urlMod.URL) = this()
  }
  
  @js.native
  class URLSearchParams ()
    extends typings.apolloDashEnv.libFetchUrlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
  }
  
  /* static members */
  @js.native
  object Response extends js.Object {
    def error(): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
    def redirect(url: String, status: Double): typings.nodeDashFetch.nodeDashFetchMod.Response = js.native
  }
  
  @js.native
  object fetch extends js.Object {
    def apply(url: RequestInfo): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeDashFetch.nodeDashFetchMod.Response] = js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
}

