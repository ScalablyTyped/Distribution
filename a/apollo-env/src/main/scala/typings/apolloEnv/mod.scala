package typings.apolloEnv

import typings.node.NodeJS.Dict
import typings.node.cryptoMod.Hash
import typings.node.urlMod.URL_
import typings.nodeFetch.anon.Size
import typings.nodeFetch.mod.BodyInit
import typings.nodeFetch.mod.HeadersInit
import typings.nodeFetch.mod.RequestInfo
import typings.nodeFetch.mod.RequestInit
import typings.nodeFetch.mod.ResponseInit
import typings.std.Iterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apollo-env", "Body")
  @js.native
  class Body ()
    extends typings.apolloEnv.fetchMod.Body {
    def this(body: js.Any) = this()
    def this(body: js.UndefOr[scala.Nothing], opts: Size) = this()
    def this(body: js.Any, opts: Size) = this()
  }
  
  @JSImport("apollo-env", "Headers")
  @js.native
  class Headers ()
    extends typings.apolloEnv.fetchMod.Headers {
    def this(init: HeadersInit) = this()
  }
  
  @JSImport("apollo-env", "Request")
  @js.native
  class Request protected ()
    extends typings.apolloEnv.fetchMod.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
  }
  
  @JSImport("apollo-env", "Response")
  @js.native
  class Response ()
    extends typings.apolloEnv.fetchMod.Response {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-env", "Response.error")
    @js.native
    def error(): typings.nodeFetch.mod.Response = js.native
    
    @JSImport("apollo-env", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): typings.nodeFetch.mod.Response = js.native
  }
  
  @JSImport("apollo-env", "URL")
  @js.native
  class URL protected ()
    extends typings.apolloEnv.fetchMod.URL {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @JSImport("apollo-env", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.apolloEnv.fetchMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: Dict[String | js.Array[String]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
  }
  
  @JSImport("apollo-env", "createHash")
  @js.native
  def createHash(kind: String): Hash = js.native
  
  object fetch {
    
    @JSImport("apollo-env", "fetch")
    @js.native
    def apply(url: RequestInfo): js.Promise[typings.nodeFetch.mod.Response] = js.native
    @JSImport("apollo-env", "fetch")
    @js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[typings.nodeFetch.mod.Response] = js.native
    
    @JSImport("apollo-env", "fetch.isRedirect")
    @js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
  @JSImport("apollo-env", "isNodeLike")
  @js.native
  val isNodeLike: Boolean = js.native
  
  @JSImport("apollo-env", "isNotNullOrUndefined")
  @js.native
  def isNotNullOrUndefined[T](): /* is T */ Boolean = js.native
  @JSImport("apollo-env", "isNotNullOrUndefined")
  @js.native
  def isNotNullOrUndefined[T](value: T): /* is T */ Boolean = js.native
  
  @JSImport("apollo-env", "mapValues")
  @js.native
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = js.native
}
